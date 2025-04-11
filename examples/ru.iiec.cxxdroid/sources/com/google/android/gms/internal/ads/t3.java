package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class t3 extends fz implements r3 {
    t3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.r3
    public final void a(j3 j3Var, u3 u3Var) {
        Parcel M = M();
        hz.a(M, j3Var);
        hz.a(M, u3Var);
        b(2, M);
    }
}
