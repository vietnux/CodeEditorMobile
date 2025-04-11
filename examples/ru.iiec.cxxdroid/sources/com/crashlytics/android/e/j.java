package com.crashlytics.android.e;

import android.os.Looper;
import f.a.a.a.c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class j {
    private final ExecutorService a;

    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f2926b;

        a(j jVar, Runnable runnable) {
            this.f2926b = runnable;
        }

        public void run() {
            try {
                this.f2926b.run();
            } catch (Exception e2) {
                c.g().c("CrashlyticsCore", "Failed to execute task.", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Callable<T> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callable f2927b;

        b(j jVar, Callable callable) {
            this.f2927b = callable;
        }

        @Override // java.util.concurrent.Callable
        public T call() {
            try {
                return (T) this.f2927b.call();
            } catch (Exception e2) {
                c.g().c("CrashlyticsCore", "Failed to execute task.", e2);
                return null;
            }
        }
    }

    public j(ExecutorService executorService) {
        this.a = executorService;
    }

    /* access modifiers changed from: package-private */
    public Future<?> a(Runnable runnable) {
        try {
            return this.a.submit(new a(this, runnable));
        } catch (RejectedExecutionException unused) {
            c.g().e("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public <T> Future<T> a(Callable<T> callable) {
        try {
            return this.a.submit(new b(this, callable));
        } catch (RejectedExecutionException unused) {
            c.g().e("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public <T> T b(Callable<T> callable) {
        try {
            return Looper.getMainLooper() == Looper.myLooper() ? this.a.submit(callable).get(4, TimeUnit.SECONDS) : this.a.submit(callable).get();
        } catch (RejectedExecutionException unused) {
            c.g().e("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        } catch (Exception e2) {
            c.g().c("CrashlyticsCore", "Failed to execute task.", e2);
            return null;
        }
    }
}
