package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class lg0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final vf0 f4885b;

    private lg0(vf0 vf0) {
        this.f4885b = vf0;
    }

    static Runnable a(vf0 vf0) {
        return new lg0(vf0);
    }

    public final void run() {
        this.f4885b.destroy();
    }
}
