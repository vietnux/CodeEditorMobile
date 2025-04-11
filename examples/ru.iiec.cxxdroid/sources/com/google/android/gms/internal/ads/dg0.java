package com.google.android.gms.internal.ads;

final class dg0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4105b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ xf0 f4106c;

    dg0(xf0 xf0, String str) {
        this.f4106c = xf0;
        this.f4105b = str;
    }

    public final void run() {
        this.f4106c.f6023b.loadData(this.f4105b, "text/html", "UTF-8");
    }
}
