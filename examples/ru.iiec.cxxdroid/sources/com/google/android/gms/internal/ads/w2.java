package com.google.android.gms.internal.ads;

final class w2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ yd f5870b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ n2 f5871c;

    w2(n2 n2Var, yd ydVar) {
        this.f5871c = n2Var;
        this.f5870b = ydVar;
    }

    public final void run() {
        synchronized (this.f5871c.f5015f) {
            this.f5871c.f5021l = this.f5871c.a(this.f5871c.f5014e.f4765j, this.f5870b);
            if (this.f5871c.f5021l == null) {
                this.f5871c.a((n2) 0, (int) "Could not start the ad request service.");
                u9.f5718h.removeCallbacks(this.f5871c.f5020k);
            }
        }
    }
}
