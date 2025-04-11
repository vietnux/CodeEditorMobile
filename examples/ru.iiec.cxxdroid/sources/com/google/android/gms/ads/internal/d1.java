package com.google.android.gms.ads.internal;

final /* synthetic */ class d1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final n0 f3142b;

    private d1(n0 n0Var) {
        this.f3142b = n0Var;
    }

    static Runnable a(n0 n0Var) {
        return new d1(n0Var);
    }

    public final void run() {
        this.f3142b.c();
    }
}
