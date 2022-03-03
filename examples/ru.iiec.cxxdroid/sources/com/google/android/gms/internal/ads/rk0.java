package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.n;

final class rk0 implements n {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzzv f5444b;

    rk0(zzzv zzzv) {
        this.f5444b = zzzv;
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public final void C1() {
        qc.b("AdMobCustomTabsAdapter overlay is closed.");
        this.f5444b.f6239b.c(this.f5444b);
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public final void D1() {
        qc.b("Opening AdMobCustomTabsAdapter overlay.");
        this.f5444b.f6239b.e(this.f5444b);
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public final void onPause() {
        qc.b("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public final void onResume() {
        qc.b("AdMobCustomTabsAdapter overlay is resumed.");
    }
}
