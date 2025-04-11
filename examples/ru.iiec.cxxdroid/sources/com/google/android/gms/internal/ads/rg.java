package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.n;

/* access modifiers changed from: package-private */
public final class rg implements n {

    /* renamed from: b  reason: collision with root package name */
    private lg f5440b;

    /* renamed from: c  reason: collision with root package name */
    private n f5441c;

    public rg(lg lgVar, n nVar) {
        this.f5440b = lgVar;
        this.f5441c = nVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public final void C1() {
        this.f5441c.C1();
        this.f5440b.T();
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public final void D1() {
        this.f5441c.D1();
        this.f5440b.U();
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public final void onResume() {
    }
}
