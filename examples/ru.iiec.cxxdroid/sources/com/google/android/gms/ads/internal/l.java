package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import c.e.g;
import com.google.android.gms.ads.n.j;
import com.google.android.gms.internal.ads.ac0;
import com.google.android.gms.internal.ads.ec0;
import com.google.android.gms.internal.ads.g50;
import com.google.android.gms.internal.ads.g60;
import com.google.android.gms.internal.ads.hc0;
import com.google.android.gms.internal.ads.j50;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.kc0;
import com.google.android.gms.internal.ads.n40;
import com.google.android.gms.internal.ads.n50;
import com.google.android.gms.internal.ads.na0;
import com.google.android.gms.internal.ads.nc0;
import com.google.android.gms.internal.ads.ri0;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.xb0;

@k2
public final class l extends n50 {

    /* renamed from: b  reason: collision with root package name */
    private g50 f3225b;

    /* renamed from: c  reason: collision with root package name */
    private xb0 f3226c;

    /* renamed from: d  reason: collision with root package name */
    private nc0 f3227d;

    /* renamed from: e  reason: collision with root package name */
    private ac0 f3228e;

    /* renamed from: f  reason: collision with root package name */
    private g<String, ec0> f3229f = new g<>();

    /* renamed from: g  reason: collision with root package name */
    private g<String, hc0> f3230g = new g<>();

    /* renamed from: h  reason: collision with root package name */
    private kc0 f3231h;

    /* renamed from: i  reason: collision with root package name */
    private n40 f3232i;

    /* renamed from: j  reason: collision with root package name */
    private j f3233j;

    /* renamed from: k  reason: collision with root package name */
    private na0 f3234k;

    /* renamed from: l  reason: collision with root package name */
    private g60 f3235l;

    /* renamed from: m  reason: collision with root package name */
    private final Context f3236m;
    private final ri0 n;
    private final String o;
    private final sc p;
    private final u1 q;

    public l(Context context, String str, ri0 ri0, sc scVar, u1 u1Var) {
        this.f3236m = context;
        this.o = str;
        this.n = ri0;
        this.p = scVar;
        this.q = u1Var;
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final j50 N0() {
        return new i(this.f3236m, this.o, this.n, this.p, this.f3225b, this.f3226c, this.f3227d, this.f3228e, this.f3230g, this.f3229f, this.f3234k, this.f3235l, this.q, this.f3231h, this.f3232i, this.f3233j);
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final void a(j jVar) {
        this.f3233j = jVar;
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final void a(ac0 ac0) {
        this.f3228e = ac0;
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final void a(g50 g50) {
        this.f3225b = g50;
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final void a(g60 g60) {
        this.f3235l = g60;
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final void a(kc0 kc0, n40 n40) {
        this.f3231h = kc0;
        this.f3232i = n40;
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final void a(na0 na0) {
        this.f3234k = na0;
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final void a(nc0 nc0) {
        this.f3227d = nc0;
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final void a(xb0 xb0) {
        this.f3226c = xb0;
    }

    @Override // com.google.android.gms.internal.ads.m50
    public final void a(String str, hc0 hc0, ec0 ec0) {
        if (!TextUtils.isEmpty(str)) {
            this.f3230g.put(str, hc0);
            this.f3229f.put(str, ec0);
            return;
        }
        throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
    }
}
