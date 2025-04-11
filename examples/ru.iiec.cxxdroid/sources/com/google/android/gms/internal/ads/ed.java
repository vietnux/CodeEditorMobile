package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ed implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final wd f4208b;

    ed(wd wdVar) {
        this.f4208b = wdVar;
    }

    public final void run() {
        this.f4208b.a(new TimeoutException());
    }
}
