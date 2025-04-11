package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class fk0 extends fz implements ek0 {
    fk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.ek0
    public final void c(String str) {
        Parcel M = M();
        M.writeString(str);
        b(3, M);
    }
}
