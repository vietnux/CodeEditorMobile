package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.g9;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.u9;

/* access modifiers changed from: package-private */
@k2
public final class p extends g9 {

    /* renamed from: d  reason: collision with root package name */
    private final int f3305d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ m f3306e;

    public p(m mVar, int i2) {
        this.f3306e = mVar;
        this.f3305d = i2;
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void d() {
        m mVar = this.f3306e;
        boolean z = mVar.f3125g.K;
        boolean p2 = mVar.p2();
        boolean z2 = this.f3306e.s;
        float f2 = this.f3306e.t;
        int i2 = this.f3306e.f3125g.K ? this.f3305d : -1;
        boolean z3 = this.f3306e.u;
        q8 q8Var = this.f3306e.f3125g.f3375k;
        r rVar = new r(z, p2, z2, f2, i2, z3, q8Var.L, q8Var.O);
        int requestedOrientation = this.f3306e.f3125g.f3375k.f5319b.getRequestedOrientation();
        if (requestedOrientation == -1) {
            requestedOrientation = this.f3306e.f3125g.f3375k.f5325h;
        }
        m mVar2 = this.f3306e;
        y0 y0Var = mVar2.f3125g;
        q8 q8Var2 = y0Var.f3375k;
        u9.f5718h.post(new q(this, new AdOverlayInfoParcel(mVar2, mVar2, mVar2, q8Var2.f5319b, requestedOrientation, y0Var.f3370f, q8Var2.A, rVar)));
    }
}
