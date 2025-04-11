package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.xh;

final /* synthetic */ class x1 implements xh {
    private final q8 a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f3363b;

    x1(q8 q8Var, Runnable runnable) {
        this.a = q8Var;
        this.f3363b = runnable;
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final void a() {
        q8 q8Var = this.a;
        Runnable runnable = this.f3363b;
        if (!q8Var.f5330m) {
            x0.f();
            u9.a(runnable);
        }
    }
}
