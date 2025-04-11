package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class l50 extends fz implements j50 {
    l50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.j50
    public final void a(j40 j40) {
        Parcel M = M();
        hz.a(M, j40);
        b(1, M);
    }
}
