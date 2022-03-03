package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import e.b.b.a.b.a;

public final class m7 extends fz implements k7 {
    m7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void a(Bundle bundle) {
        Parcel M = M();
        hz.a(M, bundle);
        b(12, M);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void a(a aVar, o7 o7Var) {
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, o7Var);
        b(7, M);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void b(a aVar, int i2) {
        Parcel M = M();
        hz.a(M, aVar);
        M.writeInt(i2);
        b(9, M);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void f(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        b(4, M);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void h(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        b(10, M);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void k(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        b(3, M);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void p(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        b(6, M);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void t(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        b(1, M);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void u(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        b(5, M);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void v(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        b(11, M);
    }
}
