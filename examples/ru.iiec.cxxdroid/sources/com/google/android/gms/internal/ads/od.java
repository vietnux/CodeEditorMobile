package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final /* synthetic */ class od implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5152b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f5153c;

    od(Executor executor, Runnable runnable) {
        this.f5152b = executor;
        this.f5153c = runnable;
    }

    public final void run() {
        this.f5152b.execute(this.f5153c);
    }
}
