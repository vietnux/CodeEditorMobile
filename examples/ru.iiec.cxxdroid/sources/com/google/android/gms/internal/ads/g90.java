package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class g90 extends fz implements e90 {
    g90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.e90
    public final void a(b90 b90) {
        Parcel M = M();
        hz.a(M, b90);
        b(1, M);
    }
}
