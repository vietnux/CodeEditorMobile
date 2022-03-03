package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.j40;

final class j implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ j40 f3211b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ i f3212c;

    j(i iVar, j40 j40) {
        this.f3212c = iVar;
        this.f3211b = j40;
    }

    public final void run() {
        synchronized (i.a(this.f3212c)) {
            if (i.b(this.f3212c)) {
                i.a(this.f3212c, this.f3211b);
            } else {
                i.a(this.f3212c, this.f3211b, 1);
            }
        }
    }
}
