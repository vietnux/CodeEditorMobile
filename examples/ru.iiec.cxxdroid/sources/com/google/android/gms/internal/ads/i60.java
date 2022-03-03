package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class i60 extends fz implements g60 {
    i60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final long getValue() {
        Parcel a = a(1, M());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
