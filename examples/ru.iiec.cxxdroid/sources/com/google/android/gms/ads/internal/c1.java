package com.google.android.gms.ads.internal;

final /* synthetic */ class c1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final n0 f3141b;

    private c1(n0 n0Var) {
        this.f3141b = n0Var;
    }

    static Runnable a(n0 n0Var) {
        return new c1(n0Var);
    }

    public final void run() {
        this.f3141b.b();
    }
}
