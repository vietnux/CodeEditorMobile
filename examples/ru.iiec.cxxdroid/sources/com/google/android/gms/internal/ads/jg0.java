package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class jg0 implements wf0 {
    private final hg0 a;

    /* renamed from: b  reason: collision with root package name */
    private final yg0 f4711b;

    /* renamed from: c  reason: collision with root package name */
    private final vf0 f4712c;

    jg0(hg0 hg0, yg0 yg0, vf0 vf0) {
        this.a = hg0;
        this.f4711b = yg0;
        this.f4712c = vf0;
    }

    @Override // com.google.android.gms.internal.ads.wf0
    public final void a() {
        u9.f5718h.postDelayed(new kg0(this.a, this.f4711b, this.f4712c), (long) sg0.f5535b);
    }
}
