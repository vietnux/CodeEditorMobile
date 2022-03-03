package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.g;
import e.b.b.a.b.a;
import e.b.b.a.b.b;

@k2
public final class y80 extends c90 {

    /* renamed from: b  reason: collision with root package name */
    private final g f6098b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6099c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6100d;

    public y80(g gVar, String str, String str2) {
        this.f6098b = gVar;
        this.f6099c = str;
        this.f6100d = str2;
    }

    @Override // com.google.android.gms.internal.ads.b90
    public final String I0() {
        return this.f6099c;
    }

    @Override // com.google.android.gms.internal.ads.b90
    public final void b1() {
        this.f6098b.K1();
    }

    @Override // com.google.android.gms.internal.ads.b90
    public final void c() {
        this.f6098b.S1();
    }

    @Override // com.google.android.gms.internal.ads.b90
    public final void w(a aVar) {
        if (aVar != null) {
            this.f6098b.b((View) b.y(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.b90
    public final String y1() {
        return this.f6100d;
    }
}
