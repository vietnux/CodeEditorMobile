package com.google.android.gms.internal.ads;

final class v2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ n2 f5802b;

    v2(n2 n2Var) {
        this.f5802b = n2Var;
    }

    public final void run() {
        synchronized (this.f5802b.f5015f) {
            if (this.f5802b.f5021l != null) {
                this.f5802b.c();
                this.f5802b.a((n2) 2, (int) "Timed out waiting for ad response.");
            }
        }
    }
}
