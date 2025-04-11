package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class ux extends Thread {

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f5790h = e4.f4172b;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<bc0<?>> f5791b;

    /* renamed from: c  reason: collision with root package name */
    private final BlockingQueue<bc0<?>> f5792c;

    /* renamed from: d  reason: collision with root package name */
    private final wp f5793d;

    /* renamed from: e  reason: collision with root package name */
    private final b f5794e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f5795f = false;

    /* renamed from: g  reason: collision with root package name */
    private final wz f5796g;

    public ux(BlockingQueue<bc0<?>> blockingQueue, BlockingQueue<bc0<?>> blockingQueue2, wp wpVar, b bVar) {
        this.f5791b = blockingQueue;
        this.f5792c = blockingQueue2;
        this.f5793d = wpVar;
        this.f5794e = bVar;
        this.f5796g = new wz(this);
    }

    private final void b() {
        bc0<?> take = this.f5791b.take();
        take.a("cache-queue-take");
        take.j();
        tw a = this.f5793d.a(take.i());
        if (a == null) {
            take.a("cache-miss");
            if (!wz.a(this.f5796g, take)) {
                this.f5792c.put(take);
            }
        } else if (a.a()) {
            take.a("cache-hit-expired");
            take.a(a);
            if (!wz.a(this.f5796g, take)) {
                this.f5792c.put(take);
            }
        } else {
            take.a("cache-hit");
            di0<?> a2 = take.a(new ba0(a.a, a.f5662g));
            take.a("cache-hit-parsed");
            if (a.f5661f < System.currentTimeMillis()) {
                take.a("cache-hit-refresh-needed");
                take.a(a);
                a2.f4118d = true;
                if (!wz.a(this.f5796g, take)) {
                    this.f5794e.a(take, a2, new vy(this, take));
                    return;
                }
            }
            this.f5794e.a(take, a2);
        }
    }

    public final void a() {
        this.f5795f = true;
        interrupt();
    }

    public final void run() {
        if (f5790h) {
            e4.c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f5793d.F();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f5795f) {
                    return;
                }
            }
        }
    }
}
