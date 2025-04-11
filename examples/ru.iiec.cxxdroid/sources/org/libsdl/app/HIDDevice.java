package org.libsdl.app;

/* access modifiers changed from: package-private */
public interface HIDDevice {
    void close();

    boolean getFeatureReport(byte[] bArr);

    int getId();

    String getManufacturerName();

    int getProductId();

    String getProductName();

    String getSerialNumber();

    int getVendorId();

    int getVersion();

    boolean open();

    int sendFeatureReport(byte[] bArr);

    int sendOutputReport(byte[] bArr);

    void setFrozen(boolean z);

    void shutdown();
}
