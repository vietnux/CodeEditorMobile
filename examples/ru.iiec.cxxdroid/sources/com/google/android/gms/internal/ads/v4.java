package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final class v4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Future f5805b;

    v4(s4 s4Var, Future future) {
        this.f5805b = future;
    }

    public final void run() {
        if (!this.f5805b.isDone()) {
            this.f5805b.cancel(true);
        }
    }
}
