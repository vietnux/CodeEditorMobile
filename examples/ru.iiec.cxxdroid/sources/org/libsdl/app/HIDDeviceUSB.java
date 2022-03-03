package org.libsdl.app;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public class HIDDeviceUSB implements HIDDevice {
    private static final String TAG = "hidapi";
    protected UsbDeviceConnection mConnection;
    protected UsbDevice mDevice;
    protected int mDeviceId;
    protected boolean mFrozen;
    protected UsbEndpoint mInputEndpoint;
    protected InputThread mInputThread;
    protected int mInterface;
    protected HIDDeviceManager mManager;
    protected UsbEndpoint mOutputEndpoint;
    protected boolean mRunning = false;

    /* access modifiers changed from: protected */
    public class InputThread extends Thread {
        protected InputThread() {
        }

        public void run() {
            int maxPacketSize = HIDDeviceUSB.this.mInputEndpoint.getMaxPacketSize();
            byte[] bArr = new byte[maxPacketSize];
            while (true) {
                HIDDeviceUSB hIDDeviceUSB = HIDDeviceUSB.this;
                if (hIDDeviceUSB.mRunning) {
                    try {
                        int bulkTransfer = hIDDeviceUSB.mConnection.bulkTransfer(hIDDeviceUSB.mInputEndpoint, bArr, maxPacketSize, 1000);
                        if (bulkTransfer > 0) {
                            byte[] copyOfRange = bulkTransfer == maxPacketSize ? bArr : Arrays.copyOfRange(bArr, 0, bulkTransfer);
                            HIDDeviceUSB hIDDeviceUSB2 = HIDDeviceUSB.this;
                            if (!hIDDeviceUSB2.mFrozen) {
                                hIDDeviceUSB2.mManager.HIDDeviceInputReport(hIDDeviceUSB2.mDeviceId, copyOfRange);
                            }
                        }
                    } catch (Exception e2) {
                        Log.v(HIDDeviceUSB.TAG, "Exception in UsbDeviceConnection bulktransfer: " + e2);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public HIDDeviceUSB(HIDDeviceManager hIDDeviceManager, UsbDevice usbDevice, int i2) {
        this.mManager = hIDDeviceManager;
        this.mDevice = usbDevice;
        this.mInterface = i2;
        this.mDeviceId = hIDDeviceManager.getDeviceIDForIdentifier(getIdentifier());
    }

    @Override // org.libsdl.app.HIDDevice
    public void close() {
        this.mRunning = false;
        if (this.mInputThread != null) {
            while (this.mInputThread.isAlive()) {
                this.mInputThread.interrupt();
                try {
                    this.mInputThread.join();
                } catch (InterruptedException unused) {
                }
            }
            this.mInputThread = null;
        }
        if (this.mConnection != null) {
            for (int i2 = 0; i2 < this.mDevice.getInterfaceCount(); i2++) {
                this.mConnection.releaseInterface(this.mDevice.getInterface(i2));
            }
            this.mConnection.close();
            this.mConnection = null;
        }
    }

    public UsbDevice getDevice() {
        return this.mDevice;
    }

    public String getDeviceName() {
        return getManufacturerName() + " " + getProductName() + "(0x" + String.format("%x", Integer.valueOf(getVendorId())) + "/0x" + String.format("%x", Integer.valueOf(getProductId())) + ")";
    }

    @Override // org.libsdl.app.HIDDevice
    public boolean getFeatureReport(byte[] bArr) {
        boolean z;
        int i2;
        int length = bArr.length;
        byte b2 = bArr[0];
        if (b2 == 0) {
            length--;
            i2 = 1;
            z = true;
        } else {
            i2 = 0;
            z = false;
        }
        int controlTransfer = this.mConnection.controlTransfer(161, 1, b2 | 768, 0, bArr, i2, length, 1000);
        if (controlTransfer < 0) {
            Log.w(TAG, "getFeatureReport() returned " + controlTransfer + " on device " + getDeviceName());
            return false;
        }
        if (z) {
            controlTransfer++;
            length++;
        }
        if (controlTransfer != length) {
            bArr = Arrays.copyOfRange(bArr, 0, controlTransfer);
        }
        this.mManager.HIDDeviceFeatureReport(this.mDeviceId, bArr);
        return true;
    }

    @Override // org.libsdl.app.HIDDevice
    public int getId() {
        return this.mDeviceId;
    }

    public String getIdentifier() {
        return String.format("%s/%x/%x", this.mDevice.getDeviceName(), Integer.valueOf(this.mDevice.getVendorId()), Integer.valueOf(this.mDevice.getProductId()));
    }

    @Override // org.libsdl.app.HIDDevice
    public String getManufacturerName() {
        String manufacturerName = Build.VERSION.SDK_INT >= 21 ? this.mDevice.getManufacturerName() : null;
        if (manufacturerName != null) {
            return manufacturerName;
        }
        return String.format("%x", Integer.valueOf(getVendorId()));
    }

    @Override // org.libsdl.app.HIDDevice
    public int getProductId() {
        return this.mDevice.getProductId();
    }

    @Override // org.libsdl.app.HIDDevice
    public String getProductName() {
        String productName = Build.VERSION.SDK_INT >= 21 ? this.mDevice.getProductName() : null;
        if (productName != null) {
            return productName;
        }
        return String.format("%x", Integer.valueOf(getProductId()));
    }

    @Override // org.libsdl.app.HIDDevice
    public String getSerialNumber() {
        String serialNumber = Build.VERSION.SDK_INT >= 21 ? this.mDevice.getSerialNumber() : null;
        return serialNumber == null ? "" : serialNumber;
    }

    @Override // org.libsdl.app.HIDDevice
    public int getVendorId() {
        return this.mDevice.getVendorId();
    }

    @Override // org.libsdl.app.HIDDevice
    public int getVersion() {
        return 0;
    }

    @Override // org.libsdl.app.HIDDevice
    public boolean open() {
        this.mConnection = this.mManager.a().openDevice(this.mDevice);
        if (this.mConnection == null) {
            Log.w(TAG, "Unable to open USB device " + getDeviceName());
            return false;
        }
        for (int i2 = 0; i2 < this.mDevice.getInterfaceCount(); i2++) {
            if (!this.mConnection.claimInterface(this.mDevice.getInterface(i2), true)) {
                Log.w(TAG, "Failed to claim interfaces on USB device " + getDeviceName());
                close();
                return false;
            }
        }
        UsbInterface usbInterface = this.mDevice.getInterface(this.mInterface);
        for (int i3 = 0; i3 < usbInterface.getEndpointCount(); i3++) {
            UsbEndpoint endpoint = usbInterface.getEndpoint(i3);
            int direction = endpoint.getDirection();
            if (direction != 0) {
                if (direction == 128 && this.mInputEndpoint == null) {
                    this.mInputEndpoint = endpoint;
                }
            } else if (this.mOutputEndpoint == null) {
                this.mOutputEndpoint = endpoint;
            }
        }
        if (this.mInputEndpoint == null || this.mOutputEndpoint == null) {
            Log.w(TAG, "Missing required endpoint on USB device " + getDeviceName());
            close();
            return false;
        }
        this.mRunning = true;
        this.mInputThread = new InputThread();
        this.mInputThread.start();
        return true;
    }

    @Override // org.libsdl.app.HIDDevice
    public int sendFeatureReport(byte[] bArr) {
        int i2;
        int length = bArr.length;
        boolean z = false;
        byte b2 = bArr[0];
        if (b2 == 0) {
            length--;
            z = true;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int controlTransfer = this.mConnection.controlTransfer(33, 9, b2 | 768, 0, bArr, i2, length, 1000);
        if (controlTransfer >= 0) {
            return z ? length + 1 : length;
        }
        Log.w(TAG, "sendFeatureReport() returned " + controlTransfer + " on device " + getDeviceName());
        return -1;
    }

    @Override // org.libsdl.app.HIDDevice
    public int sendOutputReport(byte[] bArr) {
        int bulkTransfer = this.mConnection.bulkTransfer(this.mOutputEndpoint, bArr, bArr.length, 1000);
        if (bulkTransfer != bArr.length) {
            Log.w(TAG, "sendOutputReport() returned " + bulkTransfer + " on device " + getDeviceName());
        }
        return bulkTransfer;
    }

    @Override // org.libsdl.app.HIDDevice
    public void setFrozen(boolean z) {
        this.mFrozen = z;
    }

    @Override // org.libsdl.app.HIDDevice
    public void shutdown() {
        close();
        this.mManager = null;
    }
}
