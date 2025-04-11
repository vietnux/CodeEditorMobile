package com.google.android.gms.internal.ads;

final class q90 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ p90 f5331b;

    q90(p90 p90) {
        this.f5331b = p90;
    }

    public final void run() {
        if (this.f5331b.q != null) {
            this.f5331b.q.G1();
            this.f5331b.q.L1();
            this.f5331b.q.F1();
        }
        this.f5331b.q = null;
    }
}
