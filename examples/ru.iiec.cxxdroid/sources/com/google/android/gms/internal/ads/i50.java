package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class i50 extends fz implements g50 {
    i50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void A0() {
        b(7, M());
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void X() {
        b(1, M());
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void c(int i2) {
        Parcel M = M();
        M.writeInt(i2);
        b(2, M);
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void d() {
        b(6, M());
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void f0() {
        b(5, M());
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void j0() {
        b(3, M());
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void n0() {
        b(4, M());
    }
}
