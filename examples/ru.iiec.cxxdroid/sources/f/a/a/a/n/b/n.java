package f.a.a.a.n.b;

import f.a.a.a.c;
import f.a.a.a.l;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class n {

    /* access modifiers changed from: package-private */
    public static class a implements ThreadFactory {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicLong f8404b;

        /* renamed from: f.a.a.a.n.b.n$a$a  reason: collision with other inner class name */
        class C0125a extends h {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Runnable f8405b;

            C0125a(a aVar, Runnable runnable) {
                this.f8405b = runnable;
            }

            @Override // f.a.a.a.n.b.h
            public void a() {
                this.f8405b.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.a = str;
            this.f8404b = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0125a(this, runnable));
            newThread.setName(this.a + this.f8404b.getAndIncrement());
            return newThread;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends h {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f8406b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ExecutorService f8407c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f8408d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TimeUnit f8409e;

        b(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
            this.f8406b = str;
            this.f8407c = executorService;
            this.f8408d = j2;
            this.f8409e = timeUnit;
        }

        @Override // f.a.a.a.n.b.h
        public void a() {
            try {
                l g2 = c.g();
                g2.e("Fabric", "Executing shutdown hook for " + this.f8406b);
                this.f8407c.shutdown();
                if (!this.f8407c.awaitTermination(this.f8408d, this.f8409e)) {
                    l g3 = c.g();
                    g3.e("Fabric", this.f8406b + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f8407c.shutdownNow();
                }
            } catch (InterruptedException unused) {
                c.g().e("Fabric", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f8406b));
                this.f8407c.shutdownNow();
            }
        }
    }

    public static ExecutorService a(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(c(str));
        a(str, newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    private static final void a(String str, ExecutorService executorService) {
        a(str, executorService, 2, TimeUnit.SECONDS);
    }

    public static final void a(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        b bVar = new b(str, executorService, j2, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    public static ScheduledExecutorService b(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(c(str));
        a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    public static final ThreadFactory c(String str) {
        return new a(str, new AtomicLong(1));
    }
}
