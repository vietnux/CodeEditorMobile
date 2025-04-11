package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.util.List;

@k2
public final class r90 extends qb0 implements ea0 {

    /* renamed from: b  reason: collision with root package name */
    private String f5405b;

    /* renamed from: c  reason: collision with root package name */
    private List<o90> f5406c;

    /* renamed from: d  reason: collision with root package name */
    private String f5407d;

    /* renamed from: e  reason: collision with root package name */
    private ya0 f5408e;

    /* renamed from: f  reason: collision with root package name */
    private String f5409f;

    /* renamed from: g  reason: collision with root package name */
    private String f5410g;

    /* renamed from: h  reason: collision with root package name */
    private k90 f5411h;

    /* renamed from: i  reason: collision with root package name */
    private Bundle f5412i;

    /* renamed from: j  reason: collision with root package name */
    private o60 f5413j;

    /* renamed from: k  reason: collision with root package name */
    private View f5414k;

    /* renamed from: l  reason: collision with root package name */
    private a f5415l;

    /* renamed from: m  reason: collision with root package name */
    private String f5416m;
    private Object n = new Object();
    private aa0 o;

    public r90(String str, List<o90> list, String str2, ya0 ya0, String str3, String str4, k90 k90, Bundle bundle, o60 o60, View view, a aVar, String str5) {
        this.f5405b = str;
        this.f5406c = list;
        this.f5407d = str2;
        this.f5408e = ya0;
        this.f5409f = str3;
        this.f5410g = str4;
        this.f5411h = k90;
        this.f5412i = bundle;
        this.f5413j = o60;
        this.f5414k = view;
        this.f5415l = aVar;
        this.f5416m = str5;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final View G1() {
        return this.f5414k;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final String I1() {
        return "1";
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final k90 J1() {
        return this.f5411h;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void a(aa0 aa0) {
        synchronized (this.n) {
            this.o = aa0;
        }
    }

    @Override // com.google.android.gms.internal.ads.ea0, com.google.android.gms.internal.ads.pb0
    public final List b() {
        return this.f5406c;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final boolean b(Bundle bundle) {
        synchronized (this.n) {
            if (this.o == null) {
                qc.a("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            return this.o.b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final void c(Bundle bundle) {
        synchronized (this.n) {
            if (this.o == null) {
                qc.a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.o.c(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final void d(Bundle bundle) {
        synchronized (this.n) {
            if (this.o == null) {
                qc.a("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.o.d(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final void destroy() {
        u9.f5718h.post(new s90(this));
        this.f5405b = null;
        this.f5406c = null;
        this.f5407d = null;
        this.f5408e = null;
        this.f5409f = null;
        this.f5410g = null;
        this.f5411h = null;
        this.f5412i = null;
        this.n = null;
        this.f5413j = null;
        this.f5414k = null;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final String g() {
        return this.f5405b;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final o60 getVideoController() {
        return this.f5413j;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final String h() {
        return this.f5407d;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final a i() {
        return this.f5415l;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final String j() {
        return this.f5409f;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final String k() {
        return this.f5416m;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final ua0 l() {
        return this.f5411h;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final Bundle m() {
        return this.f5412i;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final String n() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final a w() {
        return b.a(this.o);
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final String z() {
        return this.f5410g;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final ya0 z0() {
        return this.f5408e;
    }
}
