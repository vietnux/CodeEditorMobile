package com.google.android.gms.internal.ads;

final class cg0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4022b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ xf0 f4023c;

    cg0(xf0 xf0, String str) {
        this.f4023c = xf0;
        this.f4022b = str;
    }

    public final void run() {
        this.f4023c.f6023b.loadData(this.f4022b, "text/html", "UTF-8");
    }
}
