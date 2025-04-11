package com.google.android.gms.internal.ads;

final class s90 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r90 f5521b;

    s90(r90 r90) {
        this.f5521b = r90;
    }

    public final void run() {
        if (this.f5521b.o != null) {
            this.f5521b.o.G1();
            this.f5521b.o.L1();
            this.f5521b.o.F1();
        }
        this.f5521b.o = null;
    }
}
