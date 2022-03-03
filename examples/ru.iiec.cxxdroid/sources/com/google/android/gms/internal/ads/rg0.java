package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class rg0 implements zd {
    private final /* synthetic */ yg0 a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ hg0 f5442b;

    rg0(hg0 hg0, yg0 yg0) {
        this.f5442b = hg0;
        this.a = yg0;
    }

    @Override // com.google.android.gms.internal.ads.zd
    public final void run() {
        synchronized (this.f5442b.a) {
            this.f5442b.f4526h = 1;
            l9.e("Failed loading new engine. Marking new engine destroyable.");
            this.a.e();
        }
    }
}
