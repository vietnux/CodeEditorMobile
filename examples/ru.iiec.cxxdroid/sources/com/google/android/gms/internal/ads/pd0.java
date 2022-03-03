package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class pd0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final wd f5244b;

    /* renamed from: c  reason: collision with root package name */
    private final Future f5245c;

    pd0(wd wdVar, Future future) {
        this.f5244b = wdVar;
        this.f5245c = future;
    }

    public final void run() {
        wd wdVar = this.f5244b;
        Future future = this.f5245c;
        if (wdVar.isCancelled()) {
            future.cancel(true);
        }
    }
}
