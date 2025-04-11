package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

@k2
public abstract class uc extends AbstractExecutorService implements qd {
    @Override // com.google.android.gms.internal.ads.qd
    /* renamed from: a */
    public final ld<?> submit(Runnable runnable) {
        return (ld) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.qd
    /* renamed from: a */
    public final <T> ld<T> submit(Callable<T> callable) {
        return (ld) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new pd(runnable, t);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new pd(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (ld) super.submit(runnable, obj);
    }
}
