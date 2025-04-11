package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class qg0 implements be<vf0> {
    private final /* synthetic */ yg0 a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ hg0 f5341b;

    qg0(hg0 hg0, yg0 yg0) {
        this.f5341b = hg0;
        this.a = yg0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.be
    public final /* synthetic */ void a(vf0 vf0) {
        synchronized (this.f5341b.a) {
            this.f5341b.f4526h = 0;
            if (!(this.f5341b.f4525g == null || this.a == this.f5341b.f4525g)) {
                l9.e("New JS engine is loaded, marking previous one as destroyable.");
                this.f5341b.f4525g.e();
            }
            this.f5341b.f4525g = this.a;
        }
    }
}
