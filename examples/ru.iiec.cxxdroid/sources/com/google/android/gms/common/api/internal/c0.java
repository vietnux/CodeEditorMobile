package com.google.android.gms.common.api.internal;

final class c0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f3501b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f3502c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ b0 f3503d;

    c0(b0 b0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f3503d = b0Var;
        this.f3501b = lifecycleCallback;
        this.f3502c = str;
    }

    public final void run() {
        if (this.f3503d.f3499c > 0) {
            this.f3501b.a(this.f3503d.f3500d != null ? this.f3503d.f3500d.getBundle(this.f3502c) : null);
        }
        if (this.f3503d.f3499c >= 2) {
            this.f3501b.c();
        }
        if (this.f3503d.f3499c >= 3) {
            this.f3501b.b();
        }
        if (this.f3503d.f3499c >= 4) {
            this.f3501b.d();
        }
        if (this.f3503d.f3499c >= 5) {
            this.f3501b.a();
        }
    }
}
