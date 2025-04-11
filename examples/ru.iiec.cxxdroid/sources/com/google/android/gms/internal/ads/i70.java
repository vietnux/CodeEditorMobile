package com.google.android.gms.internal.ads;

final class i70 extends k50 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g70 f4593b;

    private i70(g70 g70) {
        this.f4593b = g70;
    }

    @Override // com.google.android.gms.internal.ads.j50
    public final boolean N() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.j50
    public final void a(j40 j40) {
        a(j40, 1);
    }

    @Override // com.google.android.gms.internal.ads.j50
    public final void a(j40 j40, int i2) {
        qc.a("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        fc.a.post(new j70(this));
    }

    @Override // com.google.android.gms.internal.ads.j50
    public final String k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.j50
    public final String m0() {
        return null;
    }
}
