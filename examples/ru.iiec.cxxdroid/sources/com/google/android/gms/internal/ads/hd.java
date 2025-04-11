package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* access modifiers changed from: package-private */
public final /* synthetic */ class hd implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final wd f4507b;

    /* renamed from: c  reason: collision with root package name */
    private final ld f4508c;

    hd(wd wdVar, ld ldVar) {
        this.f4507b = wdVar;
        this.f4508c = ldVar;
    }

    public final void run() {
        Throwable e2;
        wd wdVar = this.f4507b;
        try {
            wdVar.b(this.f4508c.get());
        } catch (ExecutionException e3) {
            e2 = e3.getCause();
            wdVar.a(e2);
        } catch (InterruptedException e4) {
            e2 = e4;
            Thread.currentThread().interrupt();
            wdVar.a(e2);
        } catch (Exception e5) {
            wdVar.a(e5);
        }
    }
}
