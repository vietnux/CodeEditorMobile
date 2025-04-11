package com.crashlytics.android.c;

import f.a.a.a.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public class j {
    private final ScheduledExecutorService a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f2847b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f2848c = true;

    /* renamed from: d  reason: collision with root package name */
    final AtomicReference<ScheduledFuture<?>> f2849d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    boolean f2850e = true;

    class a implements Runnable {
        a() {
        }

        public void run() {
            j.this.f2849d.set(null);
            j.this.c();
        }
    }

    public interface b {
        void a();
    }

    public j(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void c() {
        for (b bVar : this.f2847b) {
            bVar.a();
        }
    }

    public void a() {
        if (this.f2848c && !this.f2850e) {
            this.f2850e = true;
            try {
                this.f2849d.compareAndSet(null, this.a.schedule(new a(), 5000, TimeUnit.MILLISECONDS));
            } catch (RejectedExecutionException e2) {
                c.g().a("Answers", "Failed to schedule background detector", e2);
            }
        }
    }

    public void a(b bVar) {
        this.f2847b.add(bVar);
    }

    public void a(boolean z) {
        this.f2848c = z;
    }

    public void b() {
        this.f2850e = false;
        ScheduledFuture<?> andSet = this.f2849d.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }
}
