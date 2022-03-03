package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.r;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.g9;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.u9;

@k2
final class j extends g9 {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ d f3293d;

    private j(d dVar) {
        this.f3293d = dVar;
    }

    /* synthetic */ j(d dVar, f fVar) {
        this(dVar);
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void d() {
        Bitmap a = x0.z().a(Integer.valueOf(this.f3293d.f3276c.p.f3317g));
        if (a != null) {
            aa h2 = x0.h();
            d dVar = this.f3293d;
            Activity activity = dVar.f3275b;
            r rVar = dVar.f3276c.p;
            u9.f5718h.post(new k(this, h2.a(activity, a, rVar.f3315e, rVar.f3316f)));
        }
    }
}
