package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.l;

final class q implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AdOverlayInfoParcel f3308b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ p f3309c;

    q(p pVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f3309c = pVar;
        this.f3308b = adOverlayInfoParcel;
    }

    public final void run() {
        x0.d();
        l.a(this.f3309c.f3306e.f3125g.f3368d, this.f3308b, true);
    }
}
