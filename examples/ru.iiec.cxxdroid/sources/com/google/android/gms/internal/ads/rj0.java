package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.n.c;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@k2
public final class rj0 extends fj0 {

    /* renamed from: b  reason: collision with root package name */
    private final g f5443b;

    public rj0(g gVar) {
        this.f5443b = gVar;
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final String A() {
        return this.f5443b.p();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final ya0 B() {
        c.b l2 = this.f5443b.l();
        if (l2 != null) {
            return new o90(l2.a(), l2.c(), l2.b());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final a C() {
        View h2 = this.f5443b.h();
        if (h2 == null) {
            return null;
        }
        return b.a(h2);
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final boolean G() {
        return this.f5443b.d();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final boolean H() {
        return this.f5443b.c();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final a K() {
        View a = this.f5443b.a();
        if (a == null) {
            return null;
        }
        return b.a(a);
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void a(a aVar) {
        this.f5443b.a((View) b.y(aVar));
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void a(a aVar, a aVar2, a aVar3) {
        this.f5443b.a((View) b.y(aVar), (HashMap) b.y(aVar2), (HashMap) b.y(aVar3));
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final List b() {
        List<c.b> m2 = this.f5443b.m();
        if (m2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (c.b bVar : m2) {
            arrayList.add(new o90(bVar.a(), bVar.c(), bVar.b()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void b(a aVar) {
        this.f5443b.c((View) b.y(aVar));
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void c() {
        this.f5443b.g();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final void c(a aVar) {
        this.f5443b.b((View) b.y(aVar));
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final String g() {
        return this.f5443b.k();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final o60 getVideoController() {
        if (this.f5443b.e() != null) {
            return this.f5443b.e().a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final String h() {
        return this.f5443b.i();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final a i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final String j() {
        return this.f5443b.j();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final ua0 l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final Bundle m() {
        return this.f5443b.b();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final double t() {
        return this.f5443b.o();
    }

    @Override // com.google.android.gms.internal.ads.dj0
    public final String x() {
        return this.f5443b.n();
    }
}
