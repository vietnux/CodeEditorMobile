package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class o20 extends fz implements n20 {
    o20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.internal.ads.n20
    public final h20 a(k20 k20) {
        Parcel M = M();
        hz.a(M, k20);
        Parcel a = a(1, M);
        h20 h20 = (h20) hz.a(a, h20.CREATOR);
        a.recycle();
        return h20;
    }
}
