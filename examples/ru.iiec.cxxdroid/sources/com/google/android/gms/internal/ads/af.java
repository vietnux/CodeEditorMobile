package com.google.android.gms.internal.ads;

final class af implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f3788b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ we f3789c;

    af(we weVar, boolean z) {
        this.f3789c = weVar;
        this.f3788b = z;
    }

    public final void run() {
        this.f3789c.a((we) "windowVisibilityChanged", (String) new String[]{"isVisible", String.valueOf(this.f3788b)});
    }
}
