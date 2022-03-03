package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

@k2
final class pd<V> extends FutureTask<V> implements ld<V> {

    /* renamed from: b  reason: collision with root package name */
    private final nd f5243b = new nd();

    pd(Runnable runnable, V v) {
        super(runnable, v);
    }

    pd(Callable<V> callable) {
        super(callable);
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void a(Runnable runnable, Executor executor) {
        this.f5243b.a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.f5243b.a();
    }
}
