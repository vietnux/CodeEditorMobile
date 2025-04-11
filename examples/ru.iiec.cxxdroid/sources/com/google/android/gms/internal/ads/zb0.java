package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zb0 extends fz implements xb0 {
    zb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.xb0
    public final void a(lb0 lb0) {
        Parcel M = M();
        hz.a(M, lb0);
        b(1, M);
    }
}
