package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.n.c;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@k2
public final class sj0 extends ij0 {

    /* renamed from: b  reason: collision with root package name */
    private final h f5536b;

    public sj0(h hVar) {
        this.f5536b = hVar;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final a C() {
        View h2 = this.f5536b.h();
        if (h2 == null) {
            return null;
        }
        return b.a(h2);
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final boolean G() {
        return this.f5536b.d();
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final boolean H() {
        return this.f5536b.c();
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final a K() {
        View a = this.f5536b.a();
        if (a == null) {
            return null;
        }
        return b.a(a);
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final void a(a aVar) {
        this.f5536b.a((View) b.y(aVar));
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final void a(a aVar, a aVar2, a aVar3) {
        this.f5536b.a((View) b.y(aVar), (HashMap) b.y(aVar2), (HashMap) b.y(aVar3));
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final List b() {
        List<c.b> m2 = this.f5536b.m();
        if (m2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (c.b bVar : m2) {
            arrayList.add(new o90(bVar.a(), bVar.c(), bVar.b()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final void b(a aVar) {
        this.f5536b.c((View) b.y(aVar));
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final void c() {
        this.f5536b.g();
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final void c(a aVar) {
        this.f5536b.b((View) b.y(aVar));
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final String g() {
        return this.f5536b.l();
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final o60 getVideoController() {
        if (this.f5536b.e() != null) {
            return this.f5536b.e().a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final String h() {
        return this.f5536b.j();
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final a i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final String j() {
        return this.f5536b.k();
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final ua0 l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final Bundle m() {
        return this.f5536b.b();
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final String z() {
        return this.f5536b.i();
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final ya0 z0() {
        c.b n = this.f5536b.n();
        if (n != null) {
            return new o90(n.a(), n.c(), n.b());
        }
        return null;
    }
}
