package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bd implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final xc f3878b;

    /* renamed from: c  reason: collision with root package name */
    private final ld f3879c;

    bd(xc xcVar, ld ldVar) {
        this.f3878b = xcVar;
        this.f3879c = ldVar;
    }

    public final void run() {
        Throwable e2;
        xc xcVar = this.f3878b;
        try {
            xcVar.a(this.f3879c.get());
        } catch (ExecutionException e3) {
            e2 = e3.getCause();
            xcVar.a(e2);
        } catch (InterruptedException e4) {
            e2 = e4;
            Thread.currentThread().interrupt();
            xcVar.a(e2);
        } catch (Exception e5) {
            e2 = e5;
            xcVar.a(e2);
        }
    }
}
