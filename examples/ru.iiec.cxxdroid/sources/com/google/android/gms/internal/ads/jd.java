package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
@k2
public final class jd<T> implements ld<T> {

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f4703b;

    /* renamed from: c  reason: collision with root package name */
    private final nd f4704c = new nd();

    jd(Throwable th) {
        this.f4703b = th;
        this.f4704c.a();
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void a(Runnable runnable, Executor executor) {
        this.f4704c.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        throw new ExecutionException(this.f4703b);
    }

    @Override // java.util.concurrent.Future
    public final T get(long j2, TimeUnit timeUnit) {
        throw new ExecutionException(this.f4703b);
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
