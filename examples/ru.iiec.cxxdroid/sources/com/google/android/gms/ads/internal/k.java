package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.j40;

final class k implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ j40 f3219b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f3220c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ i f3221d;

    k(i iVar, j40 j40, int i2) {
        this.f3221d = iVar;
        this.f3219b = j40;
        this.f3220c = i2;
    }

    public final void run() {
        synchronized (i.a(this.f3221d)) {
            i.a(this.f3221d, this.f3219b, this.f3220c);
        }
    }
}
