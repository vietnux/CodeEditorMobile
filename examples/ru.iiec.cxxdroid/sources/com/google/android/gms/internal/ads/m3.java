package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

@k2
public final class m3 extends v3 {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<a3> f4936b;

    public m3(a3 a3Var) {
        this.f4936b = new WeakReference<>(a3Var);
    }

    @Override // com.google.android.gms.internal.ads.u3
    public final void a(n3 n3Var) {
        a3 a3Var = this.f4936b.get();
        if (a3Var != null) {
            a3Var.a(n3Var);
        }
    }
}
