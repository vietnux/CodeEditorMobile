package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cd implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final wd f4005b;

    /* renamed from: c  reason: collision with root package name */
    private final wc f4006c;

    /* renamed from: d  reason: collision with root package name */
    private final ld f4007d;

    cd(wd wdVar, wc wcVar, ld ldVar) {
        this.f4005b = wdVar;
        this.f4006c = wcVar;
        this.f4007d = ldVar;
    }

    public final void run() {
        wd wdVar = this.f4005b;
        try {
            wdVar.b(this.f4006c.a(this.f4007d.get()));
        } catch (CancellationException unused) {
            wdVar.cancel(true);
        } catch (ExecutionException e2) {
            e = e2;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            wdVar.a(e);
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            wdVar.a(e3);
        } catch (Exception e4) {
            wdVar.a(e4);
        }
    }
}
