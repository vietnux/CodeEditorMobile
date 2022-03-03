package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

public final class kd0 extends fz implements jd0 {
    kd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final ParcelFileDescriptor a(fd0 fd0) {
        Parcel M = M();
        hz.a(M, fd0);
        Parcel a = a(1, M);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) hz.a(a, ParcelFileDescriptor.CREATOR);
        a.recycle();
        return parcelFileDescriptor;
    }
}
