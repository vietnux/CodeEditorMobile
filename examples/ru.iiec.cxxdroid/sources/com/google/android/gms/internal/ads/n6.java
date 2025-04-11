package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class n6 extends fz implements l6 {
    n6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final void I() {
        b(1, M());
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final void a(int i2) {
        Parcel M = M();
        M.writeInt(i2);
        b(7, M);
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final void a(a6 a6Var) {
        Parcel M = M();
        hz.a(M, a6Var);
        b(5, M);
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final void o() {
        b(3, M());
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final void p() {
        b(8, M());
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final void q() {
        b(4, M());
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final void r() {
        b(6, M());
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final void s() {
        b(2, M());
    }
}
