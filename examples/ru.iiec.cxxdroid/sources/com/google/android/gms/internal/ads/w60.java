package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.q.a;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@k2
public final class w60 {
    private final Date a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5884b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5885c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<String> f5886d;

    /* renamed from: e  reason: collision with root package name */
    private final Location f5887e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5888f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f5889g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Class<? extends j>, j> f5890h;

    /* renamed from: i  reason: collision with root package name */
    private final String f5891i;

    /* renamed from: j  reason: collision with root package name */
    private final String f5892j;

    /* renamed from: k  reason: collision with root package name */
    private final a f5893k;

    /* renamed from: l  reason: collision with root package name */
    private final int f5894l;

    /* renamed from: m  reason: collision with root package name */
    private final Set<String> f5895m;
    private final Bundle n;
    private final Set<String> o;
    private final boolean p;

    public w60(x60 x60) {
        this(x60, null);
    }

    public w60(x60 x60, a aVar) {
        this.a = x60.a(x60);
        this.f5884b = x60.b(x60);
        this.f5885c = x60.c(x60);
        this.f5886d = Collections.unmodifiableSet(x60.d(x60));
        this.f5887e = x60.e(x60);
        this.f5888f = x60.f(x60);
        this.f5889g = x60.g(x60);
        this.f5890h = Collections.unmodifiableMap(x60.h(x60));
        this.f5891i = x60.i(x60);
        this.f5892j = x60.j(x60);
        this.f5893k = aVar;
        this.f5894l = x60.k(x60);
        this.f5895m = Collections.unmodifiableSet(x60.l(x60));
        this.n = x60.m(x60);
        this.o = Collections.unmodifiableSet(x60.n(x60));
        this.p = x60.o(x60);
    }

    public final Bundle a(Class<? extends b> cls) {
        return this.f5889g.getBundle(cls.getName());
    }

    public final Date a() {
        return this.a;
    }

    public final boolean a(Context context) {
        Set<String> set = this.f5895m;
        a50.b();
        return set.contains(fc.a(context));
    }

    public final String b() {
        return this.f5884b;
    }

    public final Bundle c() {
        return this.n;
    }

    public final int d() {
        return this.f5885c;
    }

    public final Set<String> e() {
        return this.f5886d;
    }

    public final Location f() {
        return this.f5887e;
    }

    public final boolean g() {
        return this.f5888f;
    }

    public final String h() {
        return this.f5891i;
    }

    public final boolean i() {
        return this.p;
    }

    public final String j() {
        return this.f5892j;
    }

    public final a k() {
        return this.f5893k;
    }

    public final Map<Class<? extends j>, j> l() {
        return this.f5890h;
    }

    public final Bundle m() {
        return this.f5889g;
    }

    public final int n() {
        return this.f5894l;
    }

    public final Set<String> o() {
        return this.o;
    }
}
