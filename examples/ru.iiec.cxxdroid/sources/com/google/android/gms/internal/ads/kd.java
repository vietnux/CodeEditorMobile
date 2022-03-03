package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
@k2
public final class kd<T> implements ld<T> {

    /* renamed from: b  reason: collision with root package name */
    private final T f4817b;

    /* renamed from: c  reason: collision with root package name */
    private final nd f4818c = new nd();

    kd(T t) {
        this.f4817b = t;
        this.f4818c.a();
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void a(Runnable runnable, Executor executor) {
        this.f4818c.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.f4817b;
    }

    @Override // java.util.concurrent.Future
    public final T get(long j2, TimeUnit timeUnit) {
        return this.f4817b;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
