package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class z70 extends Thread {

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<bc0<?>> f6189b;

    /* renamed from: c  reason: collision with root package name */
    private final a70 f6190c;

    /* renamed from: d  reason: collision with root package name */
    private final wp f6191d;

    /* renamed from: e  reason: collision with root package name */
    private final b f6192e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f6193f = false;

    public z70(BlockingQueue<bc0<?>> blockingQueue, a70 a70, wp wpVar, b bVar) {
        this.f6189b = blockingQueue;
        this.f6190c = a70;
        this.f6191d = wpVar;
        this.f6192e = bVar;
    }

    private final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bc0<?> take = this.f6189b.take();
        try {
            take.a("network-queue-take");
            take.j();
            TrafficStats.setThreadStatsTag(take.k());
            ba0 a = this.f6190c.a(take);
            take.a("network-http-complete");
            if (!a.f3858e || !take.r()) {
                di0<?> a2 = take.a(a);
                take.a("network-parse-complete");
                if (take.n() && a2.f4116b != null) {
                    this.f6191d.a(take.i(), a2.f4116b);
                    take.a("network-cache-written");
                }
                take.q();
                this.f6192e.a(take, a2);
                take.a(a2);
                return;
            }
            take.b("not-modified");
            take.s();
        } catch (d3 e2) {
            e2.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f6192e.a(take, e2);
            take.s();
        } catch (Exception e3) {
            e4.a(e3, "Unhandled exception %s", e3.toString());
            d3 d3Var = new d3(e3);
            d3Var.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f6192e.a(take, d3Var);
            take.s();
        }
    }

    public final void a() {
        this.f6193f = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f6193f) {
                    return;
                }
            }
        }
    }
}
