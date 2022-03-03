package com.google.android.gms.internal.ads;

final class td0 extends h50 {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ sd0 f5610b;

    td0(sd0 sd0) {
        this.f5610b = sd0;
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void A0() {
        sd0.a(this.f5610b).add(new ae0(this));
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void X() {
        sd0.a(this.f5610b).add(new ud0(this));
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void c(int i2) {
        sd0.a(this.f5610b).add(new vd0(this, i2));
        l9.e("Pooled interstitial failed to load.");
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void d() {
        sd0.a(this.f5610b).add(new be0(this));
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void f0() {
        sd0.a(this.f5610b).add(new yd0(this));
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void j0() {
        sd0.a(this.f5610b).add(new wd0(this));
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void n0() {
        sd0.a(this.f5610b).add(new xd0(this));
        l9.e("Pooled interstitial loaded.");
    }
}
