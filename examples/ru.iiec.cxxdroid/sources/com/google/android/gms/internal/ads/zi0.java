package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zi0 extends fz implements xi0 {
    zi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void A0() {
        b(8, M());
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void X() {
        b(2, M());
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void a(tb0 tb0, String str) {
        Parcel M = M();
        hz.a(M, tb0);
        M.writeString(str);
        b(10, M);
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void a(String str, String str2) {
        Parcel M = M();
        M.writeString(str);
        M.writeString(str2);
        b(9, M);
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void c(int i2) {
        Parcel M = M();
        M.writeInt(i2);
        b(3, M);
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void d() {
        b(1, M());
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void f0() {
        b(5, M());
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void j0() {
        b(4, M());
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public final void n0() {
        b(6, M());
    }
}
