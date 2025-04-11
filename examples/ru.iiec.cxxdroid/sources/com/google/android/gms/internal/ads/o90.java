package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import e.b.b.a.b.a;
import e.b.b.a.b.b;

@k2
public final class o90 extends za0 {

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f5134b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f5135c;

    /* renamed from: d  reason: collision with root package name */
    private final double f5136d;

    public o90(Drawable drawable, Uri uri, double d2) {
        this.f5134b = drawable;
        this.f5135c = uri;
        this.f5136d = d2;
    }

    @Override // com.google.android.gms.internal.ads.ya0
    public final double F0() {
        return this.f5136d;
    }

    @Override // com.google.android.gms.internal.ads.ya0
    public final a j1() {
        return b.a(this.f5134b);
    }

    @Override // com.google.android.gms.internal.ads.ya0
    public final Uri t1() {
        return this.f5135c;
    }
}
