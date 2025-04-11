package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@k2
public class wd<T> implements ld<T> {

    /* renamed from: b  reason: collision with root package name */
    private final Object f5917b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private T f5918c;

    /* renamed from: d  reason: collision with root package name */
    private Throwable f5919d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5920e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5921f;

    /* renamed from: g  reason: collision with root package name */
    private final nd f5922g = new nd();

    private final boolean a() {
        return this.f5919d != null || this.f5920e;
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void a(Runnable runnable, Executor executor) {
        this.f5922g.a(runnable, executor);
    }

    public final void a(Throwable th) {
        synchronized (this.f5917b) {
            if (!this.f5921f) {
                if (a()) {
                    x0.j().b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
                    return;
                }
                this.f5919d = th;
                this.f5917b.notifyAll();
                this.f5922g.a();
            }
        }
    }

    public final void b(T t) {
        synchronized (this.f5917b) {
            if (!this.f5921f) {
                if (a()) {
                    x0.j().b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
                    return;
                }
                this.f5920e = true;
                this.f5918c = t;
                this.f5917b.notifyAll();
                this.f5922g.a();
            }
        }
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f5917b) {
            if (a()) {
                return false;
            }
            this.f5921f = true;
            this.f5920e = true;
            this.f5917b.notifyAll();
            this.f5922g.a();
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public T get() {
        T t;
        synchronized (this.f5917b) {
            if (!a()) {
                try {
                    this.f5917b.wait();
                } catch (InterruptedException e2) {
                    throw e2;
                }
            }
            if (this.f5919d != null) {
                throw new ExecutionException(this.f5919d);
            } else if (!this.f5921f) {
                t = this.f5918c;
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return t;
    }

    @Override // java.util.concurrent.Future
    public T get(long j2, TimeUnit timeUnit) {
        T t;
        synchronized (this.f5917b) {
            if (!a()) {
                try {
                    long millis = timeUnit.toMillis(j2);
                    if (millis != 0) {
                        this.f5917b.wait(millis);
                    }
                } catch (InterruptedException e2) {
                    throw e2;
                }
            }
            if (this.f5919d != null) {
                throw new ExecutionException(this.f5919d);
            } else if (!this.f5920e) {
                throw new TimeoutException("SettableFuture timed out.");
            } else if (!this.f5921f) {
                t = this.f5918c;
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return t;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f5917b) {
            z = this.f5921f;
        }
        return z;
    }

    public boolean isDone() {
        boolean a;
        synchronized (this.f5917b) {
            a = a();
        }
        return a;
    }
}
