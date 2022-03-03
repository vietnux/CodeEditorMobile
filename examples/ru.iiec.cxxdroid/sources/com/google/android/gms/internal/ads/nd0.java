package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.d;

final class nd0 implements d.a {
    private final /* synthetic */ wd a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ fd0 f5087b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ld0 f5088c;

    nd0(ld0 ld0, wd wdVar, fd0 fd0) {
        this.f5088c = ld0;
        this.a = wdVar;
        this.f5087b = fd0;
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void e(int i2) {
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void j(Bundle bundle) {
        synchronized (ld0.b(this.f5088c)) {
            if (!ld0.c(this.f5088c)) {
                ld0.a(this.f5088c, true);
                ed0 d2 = ld0.d(this.f5088c);
                if (d2 != null) {
                    this.a.a(new pd0(this.a, s9.a(new od0(this, d2, this.a, this.f5087b))), rd.f5433b);
                }
            }
        }
    }
}
