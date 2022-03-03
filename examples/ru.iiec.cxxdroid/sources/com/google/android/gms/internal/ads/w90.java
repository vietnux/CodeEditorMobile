package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.util.List;

@k2
public final class w90 extends tc0 implements ea0 {

    /* renamed from: b  reason: collision with root package name */
    private String f5900b;

    /* renamed from: c  reason: collision with root package name */
    private List<o90> f5901c;

    /* renamed from: d  reason: collision with root package name */
    private String f5902d;

    /* renamed from: e  reason: collision with root package name */
    private ya0 f5903e;

    /* renamed from: f  reason: collision with root package name */
    private String f5904f;

    /* renamed from: g  reason: collision with root package name */
    private String f5905g;

    /* renamed from: h  reason: collision with root package name */
    private double f5906h;

    /* renamed from: i  reason: collision with root package name */
    private String f5907i;

    /* renamed from: j  reason: collision with root package name */
    private String f5908j;

    /* renamed from: k  reason: collision with root package name */
    private k90 f5909k;

    /* renamed from: l  reason: collision with root package name */
    private o60 f5910l;

    /* renamed from: m  reason: collision with root package name */
    private View f5911m;
    private a n;
    private String o;
    private Bundle p;
    private Object q = new Object();
    private aa0 r;

    public w90(String str, List<o90> list, String str2, ya0 ya0, String str3, String str4, double d2, String str5, String str6, k90 k90, o60 o60, View view, a aVar, String str7, Bundle bundle) {
        this.f5900b = str;
        this.f5901c = list;
        this.f5902d = str2;
        this.f5903e = ya0;
        this.f5904f = str3;
        this.f5905g = str4;
        this.f5906h = d2;
        this.f5907i = str5;
        this.f5908j = str6;
        this.f5909k = k90;
        this.f5910l = o60;
        this.f5911m = view;
        this.n = aVar;
        this.o = str7;
        this.p = bundle;
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final String A() {
        return this.f5907i;
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final ya0 B() {
        return this.f5903e;
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final void D() {
        this.r.D();
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final View G1() {
        return this.f5911m;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final String I1() {
        return "6";
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final k90 J1() {
        return this.f5909k;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void a(aa0 aa0) {
        synchronized (this.q) {
            this.r = aa0;
        }
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final void a(qc0 qc0) {
        this.r.a(qc0);
    }

    @Override // com.google.android.gms.internal.ads.sc0, com.google.android.gms.internal.ads.ea0
    public final List b() {
        return this.f5901c;
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final boolean b(Bundle bundle) {
        synchronized (this.q) {
            if (this.r == null) {
                qc.a("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            return this.r.b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final void c(Bundle bundle) {
        synchronized (this.q) {
            if (this.r == null) {
                qc.a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.r.c(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final void d(Bundle bundle) {
        synchronized (this.q) {
            if (this.r == null) {
                qc.a("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.r.d(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final void destroy() {
        u9.f5718h.post(new x90(this));
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final String g() {
        return this.f5900b;
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final o60 getVideoController() {
        return this.f5910l;
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final String h() {
        return this.f5902d;
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final a i() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final String j() {
        return this.f5904f;
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final String k() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final ua0 l() {
        return this.f5909k;
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final Bundle m() {
        return this.p;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final String n() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final double t() {
        return this.f5906h;
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final a w() {
        return b.a(this.r);
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final String x() {
        return this.f5908j;
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public final String z() {
        return this.f5905g;
    }
}
