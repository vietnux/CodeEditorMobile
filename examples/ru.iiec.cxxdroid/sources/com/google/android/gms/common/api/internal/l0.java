package com.google.android.gms.common.api.internal;

final class l0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f3553b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f3554c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ k0 f3555d;

    l0(k0 k0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f3555d = k0Var;
        this.f3553b = lifecycleCallback;
        this.f3554c = str;
    }

    public final void run() {
        if (this.f3555d.a0 > 0) {
            this.f3553b.a(this.f3555d.b0 != null ? this.f3555d.b0.getBundle(this.f3554c) : null);
        }
        if (this.f3555d.a0 >= 2) {
            this.f3553b.c();
        }
        if (this.f3555d.a0 >= 3) {
            this.f3553b.b();
        }
        if (this.f3555d.a0 >= 4) {
            this.f3553b.d();
        }
        if (this.f3555d.a0 >= 5) {
            this.f3553b.a();
        }
    }
}
