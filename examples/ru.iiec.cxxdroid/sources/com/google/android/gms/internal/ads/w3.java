package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class w3 extends fz implements u3 {
    w3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.u3
    public final void a(n3 n3Var) {
        Parcel M = M();
        hz.a(M, n3Var);
        b(1, M);
    }
}
