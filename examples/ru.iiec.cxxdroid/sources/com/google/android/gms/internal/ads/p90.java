package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.util.List;

@k2
public final class p90 extends mb0 implements ea0 {

    /* renamed from: b  reason: collision with root package name */
    private String f5218b;

    /* renamed from: c  reason: collision with root package name */
    private List<o90> f5219c;

    /* renamed from: d  reason: collision with root package name */
    private String f5220d;

    /* renamed from: e  reason: collision with root package name */
    private ya0 f5221e;

    /* renamed from: f  reason: collision with root package name */
    private String f5222f;

    /* renamed from: g  reason: collision with root package name */
    private double f5223g;

    /* renamed from: h  reason: collision with root package name */
    private String f5224h;

    /* renamed from: i  reason: collision with root package name */
    private String f5225i;

    /* renamed from: j  reason: collision with root package name */
    private k90 f5226j;

    /* renamed from: k  reason: collision with root package name */
    private Bundle f5227k;

    /* renamed from: l  reason: collision with root package name */
    private o60 f5228l;

    /* renamed from: m  reason: collision with root package name */
    private View f5229m;
    private a n;
    private String o;
    private Object p = new Object();
    private aa0 q;

    public p90(String str, List<o90> list, String str2, ya0 ya0, String str3, double d2, String str4, String str5, k90 k90, Bundle bundle, o60 o60, View view, a aVar, String str6) {
        this.f5218b = str;
        this.f5219c = list;
        this.f5220d = str2;
        this.f5221e = ya0;
        this.f5222f = str3;
        this.f5223g = d2;
        this.f5224h = str4;
        this.f5225i = str5;
        this.f5226j = k90;
        this.f5227k = bundle;
        this.f5228l = o60;
        this.f5229m = view;
        this.n = aVar;
        this.o = str6;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final String A() {
        return this.f5224h;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final ya0 B() {
        return this.f5221e;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final View G1() {
        return this.f5229m;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final String I1() {
        return "2";
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final k90 J1() {
        return this.f5226j;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void a(aa0 aa0) {
        synchronized (this.p) {
            this.q = aa0;
        }
    }

    @Override // com.google.android.gms.internal.ads.ea0, com.google.android.gms.internal.ads.lb0
    public final List b() {
        return this.f5219c;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final boolean b(Bundle bundle) {
        synchronized (this.p) {
            if (this.q == null) {
                qc.a("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            return this.q.b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final void c(Bundle bundle) {
        synchronized (this.p) {
            if (this.q == null) {
                qc.a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.q.c(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final void d(Bundle bundle) {
        synchronized (this.p) {
            if (this.q == null) {
                qc.a("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.q.d(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final void destroy() {
        u9.f5718h.post(new q90(this));
        this.f5218b = null;
        this.f5219c = null;
        this.f5220d = null;
        this.f5221e = null;
        this.f5222f = null;
        this.f5223g = 0.0d;
        this.f5224h = null;
        this.f5225i = null;
        this.f5226j = null;
        this.f5227k = null;
        this.p = null;
        this.f5228l = null;
        this.f5229m = null;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final String g() {
        return this.f5218b;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final o60 getVideoController() {
        return this.f5228l;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final String h() {
        return this.f5220d;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final a i() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final String j() {
        return this.f5222f;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final String k() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final ua0 l() {
        return this.f5226j;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final Bundle m() {
        return this.f5227k;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final String n() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final double t() {
        return this.f5223g;
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final a w() {
        return b.a(this.q);
    }

    @Override // com.google.android.gms.internal.ads.lb0
    public final String x() {
        return this.f5225i;
    }
}
