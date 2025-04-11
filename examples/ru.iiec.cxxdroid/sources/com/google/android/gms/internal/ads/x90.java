package com.google.android.gms.internal.ads;

final class x90 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ w90 f6013b;

    x90(w90 w90) {
        this.f6013b = w90;
    }

    public final void run() {
        if (this.f6013b.r != null) {
            this.f6013b.r.G1();
            this.f6013b.r.L1();
            this.f6013b.r.F1();
        }
        this.f6013b.r = null;
    }
}
