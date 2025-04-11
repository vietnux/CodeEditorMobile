package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.l;
import com.google.android.gms.ads.internal.x0;

final class sk0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AdOverlayInfoParcel f5537b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzzv f5538c;

    sk0(zzzv zzzv, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f5538c = zzzv;
        this.f5537b = adOverlayInfoParcel;
    }

    public final void run() {
        x0.d();
        l.a(this.f5538c.a, this.f5537b, true);
    }
}
