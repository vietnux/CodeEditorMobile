package com.google.android.gms.internal.ads;

final class ze implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ we f6198b;

    ze(we weVar) {
        this.f6198b = weVar;
    }

    public final void run() {
        this.f6198b.a((we) "surfaceDestroyed", (String) new String[0]);
    }
}
