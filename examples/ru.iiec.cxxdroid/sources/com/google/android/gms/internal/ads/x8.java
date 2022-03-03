package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;

/* access modifiers changed from: package-private */
public final class x8 extends g9 {

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ v8 f6006d;

    x8(v8 v8Var) {
        this.f6006d = v8Var;
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void d() {
        m80 m80 = new m80(this.f6006d.f5819f, this.f6006d.f5820g.f5529b);
        synchronized (this.f6006d.a) {
            try {
                x0.o();
                p80.a(this.f6006d.f5821h, m80);
            } catch (IllegalArgumentException e2) {
                qc.c("Cannot config CSI reporter.", e2);
            }
        }
    }
}
