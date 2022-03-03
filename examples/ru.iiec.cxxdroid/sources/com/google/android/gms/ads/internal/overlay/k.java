package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

final class k implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Drawable f3294b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j f3295c;

    k(j jVar, Drawable drawable) {
        this.f3295c = jVar;
        this.f3294b = drawable;
    }

    public final void run() {
        this.f3295c.f3293d.f3275b.getWindow().setBackgroundDrawable(this.f3294b);
    }
}
