package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;

@k2
public final class tf extends g9 {

    /* renamed from: d  reason: collision with root package name */
    final kf f5616d;

    /* renamed from: e  reason: collision with root package name */
    final wf f5617e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5618f;

    tf(kf kfVar, wf wfVar, String str) {
        this.f5616d = kfVar;
        this.f5617e = wfVar;
        this.f5618f = str;
        x0.A().a(this);
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void c() {
        this.f5617e.b();
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void d() {
        try {
            this.f5617e.a(this.f5618f);
        } finally {
            u9.f5718h.post(new uf(this));
        }
    }
}
