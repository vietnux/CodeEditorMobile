package com.google.android.gms.internal.ads;

final class v90 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ t90 f5831b;

    v90(t90 t90) {
        this.f5831b = t90;
    }

    public final void run() {
        if (this.f5831b.f5605i != null) {
            this.f5831b.f5605i.G1();
            this.f5831b.f5605i.L1();
        }
        this.f5831b.f5605i = null;
    }
}
