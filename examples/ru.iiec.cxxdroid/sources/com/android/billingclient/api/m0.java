package com.android.billingclient.api;

import e.b.b.a.c.f.a;
import java.util.concurrent.Future;

public final /* synthetic */ class m0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Future f2757b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Runnable f2758c;

    public /* synthetic */ m0(Future future, Runnable runnable) {
        this.f2757b = future;
        this.f2758c = runnable;
    }

    public final void run() {
        Future future = this.f2757b;
        Runnable runnable = this.f2758c;
        if (!future.isDone() && !future.isCancelled()) {
            future.cancel(true);
            a.b("BillingClient", "Async task is taking too long, cancel it!");
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
