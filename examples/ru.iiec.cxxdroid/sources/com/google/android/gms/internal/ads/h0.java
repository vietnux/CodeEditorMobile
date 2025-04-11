package com.google.android.gms.internal.ads;

final class h0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ g0 f4463b;

    h0(g0 g0Var) {
        this.f4463b = g0Var;
    }

    public final void run() {
        if (g0.a(this.f4463b).get()) {
            qc.a("Timed out waiting for WebView to finish loading.");
            this.f4463b.cancel();
        }
    }
}
