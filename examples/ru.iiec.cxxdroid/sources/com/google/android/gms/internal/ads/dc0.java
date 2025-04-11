package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class dc0 extends fz implements ac0 {
    dc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final void a(pb0 pb0) {
        Parcel M = M();
        hz.a(M, pb0);
        b(1, M);
    }
}
