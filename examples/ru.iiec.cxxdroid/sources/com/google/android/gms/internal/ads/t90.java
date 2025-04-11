package com.google.android.gms.internal.ads;

import android.view.View;
import android.widget.FrameLayout;
import c.e.g;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.util.Arrays;
import java.util.List;

@k2
public final class t90 extends ub0 implements da0 {

    /* renamed from: b  reason: collision with root package name */
    private final k90 f5598b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5599c;

    /* renamed from: d  reason: collision with root package name */
    private final g<String, o90> f5600d;

    /* renamed from: e  reason: collision with root package name */
    private final g<String, String> f5601e;

    /* renamed from: f  reason: collision with root package name */
    private o60 f5602f;

    /* renamed from: g  reason: collision with root package name */
    private View f5603g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f5604h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private aa0 f5605i;

    public t90(String str, g<String, o90> gVar, g<String, String> gVar2, k90 k90, o60 o60, View view) {
        this.f5599c = str;
        this.f5600d = gVar;
        this.f5601e = gVar2;
        this.f5598b = k90;
        this.f5602f = o60;
        this.f5603g = view;
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final List<String> C0() {
        String[] strArr = new String[(this.f5600d.size() + this.f5601e.size())];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.f5600d.size()) {
            strArr[i4] = this.f5600d.b(i3);
            i3++;
            i4++;
        }
        while (i2 < this.f5601e.size()) {
            strArr[i4] = this.f5601e.b(i2);
            i2++;
            i4++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final View G1() {
        return this.f5603g;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final String I1() {
        return "3";
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final k90 J1() {
        return this.f5598b;
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final a U0() {
        return b.a(this.f5605i.getContext().getApplicationContext());
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void a(aa0 aa0) {
        synchronized (this.f5604h) {
            this.f5605i = aa0;
        }
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final void c() {
        synchronized (this.f5604h) {
            if (this.f5605i == null) {
                qc.a("#002 Attempt to record impression before native ad initialized.");
            } else {
                this.f5605i.b(null, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final void destroy() {
        u9.f5718h.post(new v90(this));
        this.f5602f = null;
        this.f5603g = null;
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final void e(String str) {
        synchronized (this.f5604h) {
            if (this.f5605i == null) {
                qc.a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f5605i.a(null, str, null, null, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final o60 getVideoController() {
        return this.f5602f;
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final String i(String str) {
        return this.f5601e.get(str);
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final ya0 m(String str) {
        return this.f5600d.get(str);
    }

    @Override // com.google.android.gms.internal.ads.tb0, com.google.android.gms.internal.ads.da0
    public final String n() {
        return this.f5599c;
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final boolean q(a aVar) {
        if (this.f5605i == null) {
            qc.a("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        } else if (this.f5603g == null) {
            return false;
        } else {
            u90 u90 = new u90(this);
            this.f5605i.a((FrameLayout) b.y(aVar), u90);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final a w() {
        return b.a(this.f5605i);
    }
}
