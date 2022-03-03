package com.google.android.gms.internal.ads;

import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.d;

final class qd0 implements d.b {
    private final /* synthetic */ wd a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ld0 f5337b;

    qd0(ld0 ld0, wd wdVar) {
        this.f5337b = ld0;
        this.a = wdVar;
    }

    @Override // com.google.android.gms.common.internal.d.b
    public final void a(b bVar) {
        synchronized (ld0.b(this.f5337b)) {
            this.a.a(new RuntimeException("Connection failed."));
        }
    }
}
