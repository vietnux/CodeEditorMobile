package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* access modifiers changed from: package-private */
public final /* synthetic */ class fd implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Future f4307b;

    fd(Future future) {
        this.f4307b = future;
    }

    public final void run() {
        Future future = this.f4307b;
        if (!future.isDone()) {
            future.cancel(true);
        }
    }
}
