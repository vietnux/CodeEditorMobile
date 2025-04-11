package org.libsdl.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class HIDDeviceManager {
    private static final String ACTION_USB_PERMISSION = "org.libsdl.app.USB_PERMISSION";
    private static final String TAG = "hidapi";
    private static HIDDeviceManager sManager;
    private static int sManagerRefCount;
    private final BroadcastReceiver mBluetoothBroadcast = new BroadcastReceiver() {
        /* class org.libsdl.app.HIDDeviceManager.AnonymousClass2 */

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                Log.d(HIDDeviceManager.TAG, "Bluetooth device connected: " + bluetoothDevice);
                if (HIDDeviceManager.this.isSteamController(bluetoothDevice)) {
                    HIDDeviceManager.this.connectBluetoothDevice(bluetoothDevice);
                }
            }
            if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                Log.d(HIDDeviceManager.TAG, "Bluetooth device disconnected: " + bluetoothDevice2);
                HIDDeviceManager.this.disconnectBluetoothDevice(bluetoothDevice2);
            }
        }
    };
    private HashMap<BluetoothDevice, HIDDeviceBLESteamController> mBluetoothDevices = new HashMap<>();
    private BluetoothManager mBluetoothManager;
    private Context mContext;
    private HashMap<Integer, HIDDevice> mDevicesById = new HashMap<>();
    private Handler mHandler;
    private boolean mIsChromebook = false;
    private List<BluetoothDevice> mLastBluetoothDevices;
    private int mNextDeviceId = 0;
    private SharedPreferences mSharedPreferences = null;
    private HashMap<UsbDevice, HIDDeviceUSB> mUSBDevices = new HashMap<>();
    private final BroadcastReceiver mUsbBroadcast = new BroadcastReceiver() {
        /* class org.libsdl.app.HIDDeviceManager.AnonymousClass1 */

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")) {
                HIDDeviceManager.this.handleUsbDeviceAttached((UsbDevice) intent.getParcelableExtra("device"));
            } else if (action.equals("android.hardware.usb.action.USB_DEVICE_DETACHED")) {
                HIDDeviceManager.this.handleUsbDeviceDetached((UsbDevice) intent.getParcelableExtra("device"));
            } else if (action.equals(HIDDeviceManager.ACTION_USB_PERMISSION)) {
                HIDDeviceManager.this.handleUsbDevicePermission((UsbDevice) intent.getParcelableExtra("device"), intent.getBooleanExtra("permission", false));
            }
        }
    };
    private UsbManager mUsbManager;

    private HIDDeviceManager(final Context context) {
        this.mContext = context;
        try {
            SDL.loadLibrary(TAG);
            HIDDeviceRegisterCallback();
            this.mSharedPreferences = this.mContext.getSharedPreferences(TAG, 0);
            this.mIsChromebook = this.mContext.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
            this.mNextDeviceId = this.mSharedPreferences.getInt("next_device_id", 0);
            initializeUSB();
            initializeBluetooth();
        } catch (Throwable th) {
            Log.w(TAG, "Couldn't load hidapi: " + th.toString());
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setCancelable(false);
            builder.setTitle("SDL HIDAPI Error");
            builder.setMessage("Please report the following error to the SDL maintainers: " + th.getMessage());
            builder.setNegativeButton("Quit", new DialogInterface.OnClickListener(this) {
                /* class org.libsdl.app.HIDDeviceManager.AnonymousClass3 */

                public void onClick(DialogInterface dialogInterface, int i2) {
                    try {
                        ((Activity) context).finish();
                    } catch (ClassCastException unused) {
                    }
                }
            });
            builder.show();
        }
    }

    private native void HIDDeviceRegisterCallback();

    private native void HIDDeviceReleaseCallback();

    public static HIDDeviceManager acquire(Context context) {
        if (sManagerRefCount == 0) {
            sManager = new HIDDeviceManager(context);
        }
        sManagerRefCount++;
        return sManager;
    }

    private void close() {
        shutdownUSB();
        shutdownBluetooth();
        synchronized (this) {
            for (HIDDevice hIDDevice : this.mDevicesById.values()) {
                hIDDevice.shutdown();
            }
            this.mDevicesById.clear();
            this.mBluetoothDevices.clear();
            HIDDeviceReleaseCallback();
        }
    }

    private void connectHIDDeviceUSB(UsbDevice usbDevice) {
        synchronized (this) {
            int i2 = 0;
            while (true) {
                if (i2 >= usbDevice.getInterfaceCount()) {
                    break;
                } else if (isHIDDeviceInterface(usbDevice, i2)) {
                    HIDDeviceUSB hIDDeviceUSB = new HIDDeviceUSB(this, usbDevice, i2);
                    int id = hIDDeviceUSB.getId();
                    this.mUSBDevices.put(usbDevice, hIDDeviceUSB);
                    this.mDevicesById.put(Integer.valueOf(id), hIDDeviceUSB);
                    HIDDeviceConnected(id, hIDDeviceUSB.getIdentifier(), hIDDeviceUSB.getVendorId(), hIDDeviceUSB.getProductId(), hIDDeviceUSB.getSerialNumber(), hIDDeviceUSB.getVersion(), hIDDeviceUSB.getManufacturerName(), hIDDeviceUSB.getProductName(), i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
    }

    private HIDDevice getDevice(int i2) {
        HIDDevice hIDDevice;
        synchronized (this) {
            hIDDevice = this.mDevicesById.get(Integer.valueOf(i2));
            if (hIDDevice == null) {
                Log.v(TAG, "No device for id: " + i2);
                Log.v(TAG, "Available devices: " + this.mDevicesById.keySet());
            }
        }
        return hIDDevice;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void handleUsbDeviceAttached(UsbDevice usbDevice) {
        if (isHIDDeviceUSB(usbDevice)) {
            connectHIDDeviceUSB(usbDevice);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void handleUsbDeviceDetached(UsbDevice usbDevice) {
        HIDDeviceUSB hIDDeviceUSB = this.mUSBDevices.get(usbDevice);
        if (hIDDeviceUSB != null) {
            int id = hIDDeviceUSB.getId();
            this.mUSBDevices.remove(usbDevice);
            this.mDevicesById.remove(Integer.valueOf(id));
            hIDDeviceUSB.shutdown();
            HIDDeviceDisconnected(id);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void handleUsbDevicePermission(UsbDevice usbDevice, boolean z) {
        HIDDeviceUSB hIDDeviceUSB = this.mUSBDevices.get(usbDevice);
        if (hIDDeviceUSB != null) {
            boolean z2 = false;
            if (z) {
                z2 = hIDDeviceUSB.open();
            }
            HIDDeviceOpenResult(hIDDeviceUSB.getId(), z2);
        }
    }

    private void initializeBluetooth() {
        BluetoothAdapter adapter;
        Log.d(TAG, "Initializing Bluetooth");
        if (this.mContext.getPackageManager().checkPermission("android.permission.BLUETOOTH", this.mContext.getPackageName()) != 0) {
            Log.d(TAG, "Couldn't initialize Bluetooth, missing android.permission.BLUETOOTH");
            return;
        }
        this.mBluetoothManager = (BluetoothManager) this.mContext.getSystemService("bluetooth");
        BluetoothManager bluetoothManager = this.mBluetoothManager;
        if (!(bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null)) {
            for (BluetoothDevice bluetoothDevice : adapter.getBondedDevices()) {
                Log.d(TAG, "Bluetooth device available: " + bluetoothDevice);
                if (isSteamController(bluetoothDevice)) {
                    connectBluetoothDevice(bluetoothDevice);
                }
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            this.mContext.registerReceiver(this.mBluetoothBroadcast, intentFilter);
            if (this.mIsChromebook) {
                this.mHandler = new Handler(Looper.getMainLooper());
                this.mLastBluetoothDevices = new ArrayList();
            }
        }
    }

    private void initializeUSB() {
        this.mUsbManager = (UsbManager) this.mContext.getSystemService("usb");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        intentFilter.addAction(ACTION_USB_PERMISSION);
        this.mContext.registerReceiver(this.mUsbBroadcast, intentFilter);
        for (UsbDevice usbDevice : this.mUsbManager.getDeviceList().values()) {
            handleUsbDeviceAttached(usbDevice);
        }
    }

    private boolean isHIDDeviceInterface(UsbDevice usbDevice, int i2) {
        UsbInterface usbInterface = usbDevice.getInterface(i2);
        if (usbInterface.getInterfaceClass() == 3) {
            return true;
        }
        if (i2 == 0) {
            return isXbox360Controller(usbDevice, usbInterface) || isXboxOneController(usbDevice, usbInterface);
        }
        return false;
    }

    private boolean isHIDDeviceUSB(UsbDevice usbDevice) {
        for (int i2 = 0; i2 < usbDevice.getInterfaceCount(); i2++) {
            if (isHIDDeviceInterface(usbDevice, i2)) {
                return true;
            }
        }
        return false;
    }

    private boolean isXbox360Controller(UsbDevice usbDevice, UsbInterface usbInterface) {
        int[] iArr = {121, 1103, 1118, 1133, 1390, 1699, 1848, 2047, 3695, 3853, 4553, 4779, 5168, 5227, 5426, 5604, 5678, 5769, 7085, 9414};
        if (usbInterface.getInterfaceClass() == 255 && usbInterface.getInterfaceSubclass() == 93 && usbInterface.getInterfaceProtocol() == 1) {
            int vendorId = usbDevice.getVendorId();
            for (int i2 : iArr) {
                if (vendorId == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isXboxOneController(UsbDevice usbDevice, UsbInterface usbInterface) {
        int[] iArr = {1118, 1848, 3695, 3853, 5426, 9414};
        if (usbInterface.getInterfaceClass() == 255 && usbInterface.getInterfaceSubclass() == 71 && usbInterface.getInterfaceProtocol() == 208) {
            int vendorId = usbDevice.getVendorId();
            for (int i2 : iArr) {
                if (vendorId == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void release(HIDDeviceManager hIDDeviceManager) {
        HIDDeviceManager hIDDeviceManager2 = sManager;
        if (hIDDeviceManager == hIDDeviceManager2) {
            sManagerRefCount--;
            if (sManagerRefCount == 0) {
                hIDDeviceManager2.close();
                sManager = null;
            }
        }
    }

    private void shutdownBluetooth() {
        try {
            this.mContext.unregisterReceiver(this.mBluetoothBroadcast);
        } catch (Exception unused) {
        }
    }

    private void shutdownUSB() {
        try {
            this.mContext.unregisterReceiver(this.mUsbBroadcast);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public native void HIDDeviceConnected(int i2, String str, int i3, int i4, String str2, int i5, String str3, String str4, int i6);

    /* access modifiers changed from: package-private */
    public native void HIDDeviceDisconnected(int i2);

    /* access modifiers changed from: package-private */
    public native void HIDDeviceFeatureReport(int i2, byte[] bArr);

    /* access modifiers changed from: package-private */
    public native void HIDDeviceInputReport(int i2, byte[] bArr);

    /* access modifiers changed from: package-private */
    public native void HIDDeviceOpenPending(int i2);

    /* access modifiers changed from: package-private */
    public native void HIDDeviceOpenResult(int i2, boolean z);

    /* access modifiers changed from: package-private */
    public UsbManager a() {
        return this.mUsbManager;
    }

    public void chromebookConnectionHandler() {
        if (this.mIsChromebook) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<BluetoothDevice> connectedDevices = this.mBluetoothManager.getConnectedDevices(7);
            for (BluetoothDevice bluetoothDevice : connectedDevices) {
                if (!this.mLastBluetoothDevices.contains(bluetoothDevice)) {
                    arrayList2.add(bluetoothDevice);
                }
            }
            for (BluetoothDevice bluetoothDevice2 : this.mLastBluetoothDevices) {
                if (!connectedDevices.contains(bluetoothDevice2)) {
                    arrayList.add(bluetoothDevice2);
                }
            }
            this.mLastBluetoothDevices = connectedDevices;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                disconnectBluetoothDevice((BluetoothDevice) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                connectBluetoothDevice((BluetoothDevice) it2.next());
            }
            this.mHandler.postDelayed(new Runnable(this) {
                /* class org.libsdl.app.HIDDeviceManager.AnonymousClass4 */

                public void run() {
                    this.chromebookConnectionHandler();
                }
            }, 10000);
        }
    }

    public void closeDevice(int i2) {
        try {
            Log.v(TAG, "closeDevice deviceID=" + i2);
            HIDDevice device = getDevice(i2);
            if (device == null) {
                HIDDeviceDisconnected(i2);
            } else {
                device.close();
            }
        } catch (Exception e2) {
            Log.e(TAG, "Got exception: " + Log.getStackTraceString(e2));
        }
    }

    public boolean connectBluetoothDevice(BluetoothDevice bluetoothDevice) {
        Log.v(TAG, "connectBluetoothDevice device=" + bluetoothDevice);
        synchronized (this) {
            if (this.mBluetoothDevices.containsKey(bluetoothDevice)) {
                Log.v(TAG, "Steam controller with address " + bluetoothDevice + " already exists, attempting reconnect");
                this.mBluetoothDevices.get(bluetoothDevice).reconnect();
                return false;
            }
            HIDDeviceBLESteamController hIDDeviceBLESteamController = new HIDDeviceBLESteamController(this, bluetoothDevice);
            int id = hIDDeviceBLESteamController.getId();
            this.mBluetoothDevices.put(bluetoothDevice, hIDDeviceBLESteamController);
            this.mDevicesById.put(Integer.valueOf(id), hIDDeviceBLESteamController);
            return true;
        }
    }

    public void disconnectBluetoothDevice(BluetoothDevice bluetoothDevice) {
        synchronized (this) {
            HIDDeviceBLESteamController hIDDeviceBLESteamController = this.mBluetoothDevices.get(bluetoothDevice);
            if (hIDDeviceBLESteamController != null) {
                int id = hIDDeviceBLESteamController.getId();
                this.mBluetoothDevices.remove(bluetoothDevice);
                this.mDevicesById.remove(Integer.valueOf(id));
                hIDDeviceBLESteamController.shutdown();
                HIDDeviceDisconnected(id);
            }
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getDeviceIDForIdentifier(String str) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        int i2 = this.mSharedPreferences.getInt(str, 0);
        if (i2 == 0) {
            i2 = this.mNextDeviceId;
            this.mNextDeviceId = i2 + 1;
            edit.putInt("next_device_id", this.mNextDeviceId);
        }
        edit.putInt(str, i2);
        edit.commit();
        return i2;
    }

    public boolean getFeatureReport(int i2, byte[] bArr) {
        try {
            Log.v(TAG, "getFeatureReport deviceID=" + i2);
            HIDDevice device = getDevice(i2);
            if (device != null) {
                return device.getFeatureReport(bArr);
            }
            HIDDeviceDisconnected(i2);
            return false;
        } catch (Exception e2) {
            Log.e(TAG, "Got exception: " + Log.getStackTraceString(e2));
            return false;
        }
    }

    public boolean isSteamController(BluetoothDevice bluetoothDevice) {
        return (bluetoothDevice == null || bluetoothDevice.getName() == null || !bluetoothDevice.getName().equals("SteamController") || (bluetoothDevice.getType() & 2) == 0) ? false : true;
    }

    public boolean openDevice(int i2) {
        Iterator<HIDDeviceUSB> it = this.mUSBDevices.values().iterator();
        while (true) {
            if (it.hasNext()) {
                HIDDeviceUSB next = it.next();
                if (i2 == next.getId()) {
                    UsbDevice device = next.getDevice();
                    if (!this.mUsbManager.hasPermission(device)) {
                        HIDDeviceOpenPending(i2);
                        try {
                            this.mUsbManager.requestPermission(device, PendingIntent.getBroadcast(this.mContext, 0, new Intent(ACTION_USB_PERMISSION), 0));
                        } catch (Exception unused) {
                            Log.v(TAG, "Couldn't request permission for USB device " + device);
                            HIDDeviceOpenResult(i2, false);
                        }
                        return false;
                    }
                }
            }
        }
        try {
            Log.v(TAG, "openDevice deviceID=" + i2);
            HIDDevice device2 = getDevice(i2);
            if (device2 != null) {
                return device2.open();
            }
            HIDDeviceDisconnected(i2);
            return false;
        } catch (Exception e2) {
            Log.e(TAG, "Got exception: " + Log.getStackTraceString(e2));
            return false;
        }
    }

    public int sendFeatureReport(int i2, byte[] bArr) {
        try {
            Log.v(TAG, "sendFeatureReport deviceID=" + i2 + " length=" + bArr.length);
            HIDDevice device = getDevice(i2);
            if (device != null) {
                return device.sendFeatureReport(bArr);
            }
            HIDDeviceDisconnected(i2);
            return -1;
        } catch (Exception e2) {
            Log.e(TAG, "Got exception: " + Log.getStackTraceString(e2));
            return -1;
        }
    }

    public int sendOutputReport(int i2, byte[] bArr) {
        try {
            Log.v(TAG, "sendOutputReport deviceID=" + i2 + " length=" + bArr.length);
            HIDDevice device = getDevice(i2);
            if (device != null) {
                return device.sendOutputReport(bArr);
            }
            HIDDeviceDisconnected(i2);
            return -1;
        } catch (Exception e2) {
            Log.e(TAG, "Got exception: " + Log.getStackTraceString(e2));
            return -1;
        }
    }

    public void setFrozen(boolean z) {
        synchronized (this) {
            for (HIDDevice hIDDevice : this.mDevicesById.values()) {
                hIDDevice.setFrozen(z);
            }
        }
    }
}
