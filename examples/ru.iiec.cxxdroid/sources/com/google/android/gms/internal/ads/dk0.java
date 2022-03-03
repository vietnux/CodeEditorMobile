package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class dk0 extends fz implements ck0 {
    dk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.ck0
    public final void c(String str) {
        Parcel M = M();
        M.writeString(str);
        b(2, M);
    }
}
