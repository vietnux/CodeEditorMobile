package org.libsdl.app;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.UUID;

/* access modifiers changed from: package-private */
public class HIDDeviceBLESteamController extends BluetoothGattCallback implements HIDDevice {
    private static final int CHROMEBOOK_CONNECTION_CHECK_INTERVAL = 10000;
    private static final String TAG = "hidapi";
    private static final int TRANSPORT_AUTO = 0;
    private static final int TRANSPORT_BREDR = 1;
    private static final int TRANSPORT_LE = 2;
    private static final byte[] enterValveMode = {-64, -121, 3, 8, 7, 0};
    public static final UUID inputCharacteristic = UUID.fromString("100F6C33-1735-4313-B402-38567131E5F3");
    public static final UUID reportCharacteristic = UUID.fromString("100F6C34-1735-4313-B402-38567131E5F3");
    public static final UUID steamControllerService = UUID.fromString("100F6C32-1735-4313-B402-38567131E5F3");
    GattOperation a = null;
    private BluetoothDevice mDevice;
    private int mDeviceId;
    private boolean mFrozen = false;
    private BluetoothGatt mGatt;
    private Handler mHandler;
    private boolean mIsChromebook = false;
    private boolean mIsConnected = false;
    private boolean mIsReconnecting = false;
    private boolean mIsRegistered = false;
    private HIDDeviceManager mManager;
    private LinkedList<GattOperation> mOperations;

    /* access modifiers changed from: package-private */
    /* renamed from: org.libsdl.app.HIDDeviceBLESteamController$5  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a = new int[GattOperation.Operation.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation[] r0 = org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.libsdl.app.HIDDeviceBLESteamController.AnonymousClass5.a = r0
                int[] r0 = org.libsdl.app.HIDDeviceBLESteamController.AnonymousClass5.a     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation r1 = org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.CHR_READ     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = org.libsdl.app.HIDDeviceBLESteamController.AnonymousClass5.a     // Catch:{ NoSuchFieldError -> 0x001f }
                org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation r1 = org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.CHR_WRITE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = org.libsdl.app.HIDDeviceBLESteamController.AnonymousClass5.a     // Catch:{ NoSuchFieldError -> 0x002a }
                org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation r1 = org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.ENABLE_NOTIFICATION     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.HIDDeviceBLESteamController.AnonymousClass5.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public static class GattOperation {
        Operation a;

        /* renamed from: b  reason: collision with root package name */
        UUID f9577b;

        /* renamed from: c  reason: collision with root package name */
        byte[] f9578c;

        /* renamed from: d  reason: collision with root package name */
        BluetoothGatt f9579d;

        /* renamed from: e  reason: collision with root package name */
        boolean f9580e = true;

        /* access modifiers changed from: private */
        public enum Operation {
            CHR_READ,
            CHR_WRITE,
            ENABLE_NOTIFICATION
        }

        private GattOperation(BluetoothGatt bluetoothGatt, Operation operation, UUID uuid) {
            this.f9579d = bluetoothGatt;
            this.a = operation;
            this.f9577b = uuid;
        }

        private GattOperation(BluetoothGatt bluetoothGatt, Operation operation, UUID uuid, byte[] bArr) {
            this.f9579d = bluetoothGatt;
            this.a = operation;
            this.f9577b = uuid;
            this.f9578c = bArr;
        }

        public static GattOperation enableNotification(BluetoothGatt bluetoothGatt, UUID uuid) {
            return new GattOperation(bluetoothGatt, Operation.ENABLE_NOTIFICATION, uuid);
        }

        private BluetoothGattCharacteristic getCharacteristic(UUID uuid) {
            BluetoothGattService service = this.f9579d.getService(HIDDeviceBLESteamController.steamControllerService);
            if (service == null) {
                return null;
            }
            return service.getCharacteristic(uuid);
        }

        public static GattOperation readCharacteristic(BluetoothGatt bluetoothGatt, UUID uuid) {
            return new GattOperation(bluetoothGatt, Operation.CHR_READ, uuid);
        }

        public static GattOperation writeCharacteristic(BluetoothGatt bluetoothGatt, UUID uuid, byte[] bArr) {
            return new GattOperation(bluetoothGatt, Operation.CHR_WRITE, uuid, bArr);
        }

        public boolean finish() {
            return this.f9580e;
        }

        public void run() {
            String str;
            StringBuilder sb;
            BluetoothGattCharacteristic characteristic;
            BluetoothGattDescriptor descriptor;
            String str2;
            byte[] bArr;
            int i2 = AnonymousClass5.a[this.a.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    BluetoothGattCharacteristic characteristic2 = getCharacteristic(this.f9577b);
                    characteristic2.setValue(this.f9578c);
                    if (!this.f9579d.writeCharacteristic(characteristic2)) {
                        sb = new StringBuilder();
                        str = "Unable to write characteristic ";
                    }
                } else if (i2 == 3 && (characteristic = getCharacteristic(this.f9577b)) != null && (descriptor = characteristic.getDescriptor(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb"))) != null) {
                    int properties = characteristic.getProperties();
                    if ((properties & 16) == 16) {
                        bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
                    } else if ((properties & 32) == 32) {
                        bArr = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
                    } else {
                        str2 = "Unable to start notifications on input characteristic";
                        Log.e(HIDDeviceBLESteamController.TAG, str2);
                        this.f9580e = false;
                        return;
                    }
                    this.f9579d.setCharacteristicNotification(characteristic, true);
                    descriptor.setValue(bArr);
                    if (!this.f9579d.writeDescriptor(descriptor)) {
                        str2 = "Unable to write descriptor " + this.f9577b.toString();
                        Log.e(HIDDeviceBLESteamController.TAG, str2);
                        this.f9580e = false;
                        return;
                    }
                } else {
                    return;
                }
                this.f9580e = true;
                return;
            }
            if (!this.f9579d.readCharacteristic(getCharacteristic(this.f9577b))) {
                sb = new StringBuilder();
                str = "Unable to read characteristic ";
            }
            this.f9580e = true;
            return;
            sb.append(str);
            sb.append(this.f9577b.toString());
            Log.e(HIDDeviceBLESteamController.TAG, sb.toString());
            this.f9580e = false;
        }
    }

    public HIDDeviceBLESteamController(HIDDeviceManager hIDDeviceManager, BluetoothDevice bluetoothDevice) {
        this.mManager = hIDDeviceManager;
        this.mDevice = bluetoothDevice;
        this.mDeviceId = this.mManager.getDeviceIDForIdentifier(getIdentifier());
        this.mIsRegistered = false;
        this.mIsChromebook = this.mManager.getContext().getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
        this.mOperations = new LinkedList<>();
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mGatt = connectGatt();
        this.mHandler.postDelayed(new Runnable(this) {
            /* class org.libsdl.app.HIDDeviceBLESteamController.AnonymousClass1 */

            public void run() {
                this.checkConnectionForChromebookIssue();
            }
        }, 10000);
    }

    private BluetoothGatt connectGatt() {
        return connectGatt(false);
    }

    private BluetoothGatt connectGatt(boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                return this.mDevice.connectGatt(this.mManager.getContext(), z, this, 2);
            } catch (Exception unused) {
            }
        }
        return this.mDevice.connectGatt(this.mManager.getContext(), z, this);
    }

    private void enableNotification(UUID uuid) {
        queueGattOperation(GattOperation.enableNotification(this.mGatt, uuid));
    }

    private void executeNextGattOperation() {
        synchronized (this.mOperations) {
            if (this.a == null) {
                if (!this.mOperations.isEmpty()) {
                    this.a = this.mOperations.removeFirst();
                    this.mHandler.post(new Runnable() {
                        /* class org.libsdl.app.HIDDeviceBLESteamController.AnonymousClass3 */

                        public void run() {
                            synchronized (HIDDeviceBLESteamController.this.mOperations) {
                                if (HIDDeviceBLESteamController.this.a == null) {
                                    Log.e(HIDDeviceBLESteamController.TAG, "Current operation null in executor?");
                                } else {
                                    HIDDeviceBLESteamController.this.a.run();
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    private void finishCurrentGattOperation() {
        GattOperation gattOperation;
        synchronized (this.mOperations) {
            if (this.a != null) {
                gattOperation = this.a;
                this.a = null;
            } else {
                gattOperation = null;
            }
        }
        if (gattOperation != null && !gattOperation.finish()) {
            this.mOperations.addFirst(gattOperation);
        }
        executeNextGattOperation();
    }

    private boolean isRegistered() {
        return this.mIsRegistered;
    }

    private boolean probeService(HIDDeviceBLESteamController hIDDeviceBLESteamController) {
        if (isRegistered()) {
            return true;
        }
        if (!this.mIsConnected) {
            return false;
        }
        Log.v(TAG, "probeService controller=" + hIDDeviceBLESteamController);
        for (BluetoothGattService bluetoothGattService : this.mGatt.getServices()) {
            if (bluetoothGattService.getUuid().equals(steamControllerService)) {
                Log.v(TAG, "Found Valve steam controller service " + bluetoothGattService.getUuid());
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                    if (bluetoothGattCharacteristic.getUuid().equals(inputCharacteristic)) {
                        Log.v(TAG, "Found input characteristic");
                        if (bluetoothGattCharacteristic.getDescriptor(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb")) != null) {
                            enableNotification(bluetoothGattCharacteristic.getUuid());
                        }
                    }
                }
                return true;
            }
        }
        if (this.mGatt.getServices().size() == 0 && this.mIsChromebook && !this.mIsReconnecting) {
            Log.e(TAG, "Chromebook: Discovered services were empty; this almost certainly means the BtGatt.ContextMap bug has bitten us.");
            this.mIsConnected = false;
            this.mIsReconnecting = true;
            this.mGatt.disconnect();
            this.mGatt = connectGatt(false);
        }
        return false;
    }

    private void queueGattOperation(GattOperation gattOperation) {
        synchronized (this.mOperations) {
            this.mOperations.add(gattOperation);
        }
        executeNextGattOperation();
    }

    private void setRegistered() {
        this.mIsRegistered = true;
    }

    /* access modifiers changed from: protected */
    public void checkConnectionForChromebookIssue() {
        String str;
        if (this.mIsChromebook) {
            int connectionState = getConnectionState();
            if (connectionState != 0) {
                if (connectionState == 1) {
                    Log.v(TAG, "Chromebook: We're still trying to connect.  Waiting a bit longer.");
                } else if (connectionState == 2) {
                    if (!this.mIsConnected) {
                        str = "Chromebook: We are in a very bad state; the controller shows as connected in the underlying Bluetooth layer, but we never received a callback.  Forcing a reconnect.";
                    } else if (isRegistered()) {
                        Log.v(TAG, "Chromebook: We are connected, and registered.  Everything's good!");
                        return;
                    } else if (this.mGatt.getServices().size() > 0) {
                        Log.v(TAG, "Chromebook: We are connected to a controller, but never got our registration.  Trying to recover.");
                        probeService(this);
                    } else {
                        str = "Chromebook: We are connected to a controller, but never discovered services.  Trying to recover.";
                    }
                }
                this.mHandler.postDelayed(new Runnable(this) {
                    /* class org.libsdl.app.HIDDeviceBLESteamController.AnonymousClass2 */

                    public void run() {
                        this.checkConnectionForChromebookIssue();
                    }
                }, 10000);
            }
            str = "Chromebook: We have either been disconnected, or the Chromebook BtGatt.ContextMap bug has bitten us.  Attempting a disconnect/reconnect, but we may not be able to recover.";
            Log.v(TAG, str);
            this.mIsReconnecting = true;
            this.mGatt.disconnect();
            this.mGatt = connectGatt(false);
            this.mHandler.postDelayed(new Runnable(this) {
                /* class org.libsdl.app.HIDDeviceBLESteamController.AnonymousClass2 */

                public void run() {
                    this.checkConnectionForChromebookIssue();
                }
            }, 10000);
        }
    }

    @Override // org.libsdl.app.HIDDevice
    public void close() {
    }

    /* access modifiers changed from: protected */
    public int getConnectionState() {
        BluetoothManager bluetoothManager;
        Context context = this.mManager.getContext();
        if (context == null || (bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth")) == null) {
            return 0;
        }
        return bluetoothManager.getConnectionState(this.mDevice, 7);
    }

    @Override // org.libsdl.app.HIDDevice
    public boolean getFeatureReport(byte[] bArr) {
        if (!isRegistered()) {
            Log.e(TAG, "Attempted getFeatureReport before Steam Controller is registered!");
            if (!this.mIsConnected) {
                return false;
            }
            probeService(this);
            return false;
        }
        readCharacteristic(reportCharacteristic);
        return true;
    }

    public BluetoothGatt getGatt() {
        return this.mGatt;
    }

    @Override // org.libsdl.app.HIDDevice
    public int getId() {
        return this.mDeviceId;
    }

    public String getIdentifier() {
        return String.format("SteamController.%s", this.mDevice.getAddress());
    }

    @Override // org.libsdl.app.HIDDevice
    public String getManufacturerName() {
        return "Valve Corporation";
    }

    @Override // org.libsdl.app.HIDDevice
    public int getProductId() {
        return 4358;
    }

    @Override // org.libsdl.app.HIDDevice
    public String getProductName() {
        return "Steam Controller";
    }

    @Override // org.libsdl.app.HIDDevice
    public String getSerialNumber() {
        return "12345";
    }

    @Override // org.libsdl.app.HIDDevice
    public int getVendorId() {
        return 10462;
    }

    @Override // org.libsdl.app.HIDDevice
    public int getVersion() {
        return 0;
    }

    public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic.getUuid().equals(inputCharacteristic) && !this.mFrozen) {
            this.mManager.HIDDeviceInputReport(getId(), bluetoothGattCharacteristic.getValue());
        }
    }

    public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        if (bluetoothGattCharacteristic.getUuid().equals(reportCharacteristic) && !this.mFrozen) {
            this.mManager.HIDDeviceFeatureReport(getId(), bluetoothGattCharacteristic.getValue());
        }
        finishCurrentGattOperation();
    }

    public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        if (bluetoothGattCharacteristic.getUuid().equals(reportCharacteristic) && !isRegistered()) {
            Log.v(TAG, "Registering Steam Controller with ID: " + getId());
            this.mManager.HIDDeviceConnected(getId(), getIdentifier(), getVendorId(), getProductId(), getSerialNumber(), getVersion(), getManufacturerName(), getProductName(), 0);
            setRegistered();
        }
        finishCurrentGattOperation();
    }

    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i2, int i3) {
        this.mIsReconnecting = false;
        if (i3 == 2) {
            this.mIsConnected = true;
            if (!isRegistered()) {
                this.mHandler.post(new Runnable() {
                    /* class org.libsdl.app.HIDDeviceBLESteamController.AnonymousClass4 */

                    public void run() {
                        HIDDeviceBLESteamController.this.mGatt.discoverServices();
                    }
                });
            }
        } else if (i3 == 0) {
            this.mIsConnected = false;
        }
    }

    public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
    }

    public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattCharacteristic characteristic2 = bluetoothGattDescriptor.getCharacteristic();
        if (characteristic2.getUuid().equals(inputCharacteristic) && (characteristic = characteristic2.getService().getCharacteristic(reportCharacteristic)) != null) {
            Log.v(TAG, "Writing report characteristic to enter valve mode");
            characteristic.setValue(enterValveMode);
            bluetoothGatt.writeCharacteristic(characteristic);
        }
        finishCurrentGattOperation();
    }

    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i2, int i3) {
    }

    public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i2, int i3) {
    }

    public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i2) {
    }

    public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i2) {
        if (i2 != 0) {
            return;
        }
        if (bluetoothGatt.getServices().size() == 0) {
            Log.v(TAG, "onServicesDiscovered returned zero services; something has gone horribly wrong down in Android's Bluetooth stack.");
            this.mIsReconnecting = true;
            this.mIsConnected = false;
            bluetoothGatt.disconnect();
            this.mGatt = connectGatt(false);
            return;
        }
        probeService(this);
    }

    @Override // org.libsdl.app.HIDDevice
    public boolean open() {
        return true;
    }

    public void readCharacteristic(UUID uuid) {
        queueGattOperation(GattOperation.readCharacteristic(this.mGatt, uuid));
    }

    public void reconnect() {
        if (getConnectionState() != 2) {
            this.mGatt.disconnect();
            this.mGatt = connectGatt();
        }
    }

    @Override // org.libsdl.app.HIDDevice
    public int sendFeatureReport(byte[] bArr) {
        if (!isRegistered()) {
            Log.e(TAG, "Attempted sendFeatureReport before Steam Controller is registered!");
            if (!this.mIsConnected) {
                return -1;
            }
            probeService(this);
            return -1;
        }
        writeCharacteristic(reportCharacteristic, Arrays.copyOfRange(bArr, 1, bArr.length - 1));
        return bArr.length;
    }

    @Override // org.libsdl.app.HIDDevice
    public int sendOutputReport(byte[] bArr) {
        if (!isRegistered()) {
            Log.e(TAG, "Attempted sendOutputReport before Steam Controller is registered!");
            if (!this.mIsConnected) {
                return -1;
            }
            probeService(this);
            return -1;
        }
        writeCharacteristic(reportCharacteristic, bArr);
        return bArr.length;
    }

    @Override // org.libsdl.app.HIDDevice
    public void setFrozen(boolean z) {
        this.mFrozen = z;
    }

    @Override // org.libsdl.app.HIDDevice
    public void shutdown() {
        close();
        BluetoothGatt bluetoothGatt = this.mGatt;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
            bluetoothGatt.close();
            this.mGatt = null;
        }
        this.mManager = null;
        this.mIsRegistered = false;
        this.mIsConnected = false;
        this.mOperations.clear();
    }

    public void writeCharacteristic(UUID uuid, byte[] bArr) {
        queueGattOperation(GattOperation.writeCharacteristic(this.mGatt, uuid, bArr));
    }
}
