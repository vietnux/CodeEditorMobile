package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.n;

final class ei implements n {

    /* renamed from: b  reason: collision with root package name */
    private lg f4218b;

    /* renamed from: c  reason: collision with root package name */
    private n f4219c;

    public ei(lg lgVar, n nVar) {
        this.f4218b = lgVar;
        this.f4219c = nVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public final void C1() {
        this.f4219c.C1();
        this.f4218b.T();
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public final void D1() {
        this.f4219c.D1();
        this.f4218b.U();
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public final void onResume() {
    }
}
