package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* access modifiers changed from: package-private */
public final /* synthetic */ class id implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final ld f4605b;

    /* renamed from: c  reason: collision with root package name */
    private final Future f4606c;

    id(ld ldVar, Future future) {
        this.f4605b = ldVar;
        this.f4606c = future;
    }

    public final void run() {
        ld ldVar = this.f4605b;
        Future future = this.f4606c;
        if (ldVar.isCancelled()) {
            future.cancel(true);
        }
    }
}
