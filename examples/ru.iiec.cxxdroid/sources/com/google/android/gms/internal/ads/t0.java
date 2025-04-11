package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.concurrent.CountDownLatch;

final class t0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CountDownLatch f5560b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ s0 f5561c;

    t0(s0 s0Var, CountDownLatch countDownLatch) {
        this.f5561c = s0Var;
        this.f5560b = countDownLatch;
    }

    public final void run() {
        synchronized (this.f5561c.f4572g) {
            this.f5561c.p = t.a(this.f5561c.o, this.f5561c.f5486m, this.f5560b);
        }
    }
}
