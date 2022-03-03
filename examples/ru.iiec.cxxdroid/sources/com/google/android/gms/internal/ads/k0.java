package com.google.android.gms.internal.ads;

final class k0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ q8 f4742b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ i0 f4743c;

    k0(i0 i0Var, q8 q8Var) {
        this.f4743c = i0Var;
        this.f4742b = q8Var;
    }

    public final void run() {
        synchronized (this.f4743c.f4571f) {
            i0 i0Var = this.f4743c;
            i0Var.f4569d.a(this.f4742b);
        }
    }
}
