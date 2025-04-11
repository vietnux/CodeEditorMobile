package com.google.android.gms.internal.ads;

final /* synthetic */ class xe implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final ue f6016b;

    private xe(ue ueVar) {
        this.f6016b = ueVar;
    }

    static Runnable a(ue ueVar) {
        return new xe(ueVar);
    }

    public final void run() {
        this.f6016b.d();
    }
}
