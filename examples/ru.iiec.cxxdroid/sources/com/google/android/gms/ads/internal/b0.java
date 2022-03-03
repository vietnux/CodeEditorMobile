package com.google.android.gms.ads.internal;

import android.os.Debug;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.qc;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

final class b0 extends TimerTask {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CountDownLatch f3135b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Timer f3136c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ a f3137d;

    b0(a aVar, CountDownLatch countDownLatch, Timer timer) {
        this.f3137d = aVar;
        this.f3135b = countDownLatch;
        this.f3136c = timer;
    }

    public final void run() {
        if (((long) ((Integer) a50.g().a(k80.o2)).intValue()) != this.f3135b.getCount()) {
            qc.b("Stopping method tracing");
            Debug.stopMethodTracing();
            if (this.f3135b.getCount() == 0) {
                this.f3136c.cancel();
                return;
            }
        }
        String concat = String.valueOf(this.f3137d.f3125g.f3368d.getPackageName()).concat("_adsTrace_");
        try {
            qc.b("Starting method tracing");
            this.f3135b.countDown();
            long a = x0.m().a();
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 20);
            sb.append(concat);
            sb.append(a);
            Debug.startMethodTracing(sb.toString(), ((Integer) a50.g().a(k80.p2)).intValue());
        } catch (Exception e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
