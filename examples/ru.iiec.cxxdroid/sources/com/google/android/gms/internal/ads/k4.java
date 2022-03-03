package com.google.android.gms.internal.ads;

final class k4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f4 f4773b;

    k4(f4 f4Var) {
        this.f4773b = f4Var;
    }

    public final void run() {
        if (this.f4773b.f4277h != null) {
            this.f4773b.f4277h.c();
            this.f4773b.f4277h = null;
        }
    }
}
