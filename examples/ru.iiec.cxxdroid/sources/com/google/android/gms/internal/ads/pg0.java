package com.google.android.gms.internal.ads;

final /* synthetic */ class pg0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final vf0 f5249b;

    private pg0(vf0 vf0) {
        this.f5249b = vf0;
    }

    static Runnable a(vf0 vf0) {
        return new pg0(vf0);
    }

    public final void run() {
        this.f5249b.destroy();
    }
}
