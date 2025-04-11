package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class o50 extends fz implements m50 {
    o50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final j50 N0() {
        j50 j50;
        Parcel a = a(1, M());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            j50 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            j50 = queryLocalInterface instanceof j50 ? (j50) queryLocalInterface : new l50(readStrongBinder);
        }
        a.recycle();
        return j50;
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final void a(ac0 ac0) {
        Parcel M = M();
        hz.a(M, ac0);
        b(4, M);
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final void a(g50 g50) {
        Parcel M = M();
        hz.a(M, g50);
        b(2, M);
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final void a(na0 na0) {
        Parcel M = M();
        hz.a(M, na0);
        b(6, M);
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final void a(nc0 nc0) {
        Parcel M = M();
        hz.a(M, nc0);
        b(10, M);
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final void a(xb0 xb0) {
        Parcel M = M();
        hz.a(M, xb0);
        b(3, M);
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final void a(String str, hc0 hc0, ec0 ec0) {
        Parcel M = M();
        M.writeString(str);
        hz.a(M, hc0);
        hz.a(M, ec0);
        b(5, M);
    }
}
