package com.google.android.gms.internal.ads;

final /* synthetic */ class dh0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final bh0 f4112b;

    /* renamed from: c  reason: collision with root package name */
    private final vf0 f4113c;

    dh0(bh0 bh0, vf0 vf0) {
        this.f4112b = bh0;
        this.f4113c = vf0;
    }

    public final void run() {
        bh0 bh0 = this.f4112b;
        vf0 vf0 = this.f4113c;
        bh0.a.f6128f.a(vf0);
        vf0.destroy();
    }
}
