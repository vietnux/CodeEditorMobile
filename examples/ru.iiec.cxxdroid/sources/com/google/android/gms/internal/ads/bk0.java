package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.ads.n.c;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@k2
public final class bk0 extends lj0 {

    /* renamed from: b  reason: collision with root package name */
    private final m f3925b;

    public bk0(m mVar) {
        this.f3925b = mVar;
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final String A() {
        return this.f3925b.m();
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final ya0 B() {
        c.b g2 = this.f3925b.g();
        if (g2 != null) {
            return new o90(g2.a(), g2.c(), g2.b());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final a C() {
        View r = this.f3925b.r();
        if (r == null) {
            return null;
        }
        return b.a(r);
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final boolean G() {
        return this.f3925b.j();
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final boolean H() {
        return this.f3925b.i();
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final a K() {
        View a = this.f3925b.a();
        if (a == null) {
            return null;
        }
        return b.a(a);
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final void a(a aVar) {
        this.f3925b.a((View) b.y(aVar));
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final void a(a aVar, a aVar2, a aVar3) {
        this.f3925b.a((View) b.y(aVar), (HashMap) b.y(aVar2), (HashMap) b.y(aVar3));
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final List b() {
        List<c.b> h2 = this.f3925b.h();
        ArrayList arrayList = new ArrayList();
        if (h2 != null) {
            for (c.b bVar : h2) {
                arrayList.add(new o90(bVar.a(), bVar.c(), bVar.b()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final void b(a aVar) {
        this.f3925b.b((View) b.y(aVar));
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final void c() {
        this.f3925b.p();
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final String g() {
        return this.f3925b.f();
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final o60 getVideoController() {
        if (this.f3925b.n() != null) {
            return this.f3925b.n().a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final String h() {
        return this.f3925b.c();
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final a i() {
        Object q = this.f3925b.q();
        if (q == null) {
            return null;
        }
        return b.a(q);
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final String j() {
        return this.f3925b.d();
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final ua0 l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final Bundle m() {
        return this.f3925b.e();
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final double t() {
        if (this.f3925b.l() != null) {
            return this.f3925b.l().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final String x() {
        return this.f3925b.k();
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final String z() {
        return this.f3925b.b();
    }
}
