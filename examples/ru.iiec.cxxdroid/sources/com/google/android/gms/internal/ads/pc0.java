package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class pc0 extends fz implements nc0 {
    pc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.nc0
    public final void a(sc0 sc0) {
        Parcel M = M();
        hz.a(M, sc0);
        b(1, M);
    }
}
