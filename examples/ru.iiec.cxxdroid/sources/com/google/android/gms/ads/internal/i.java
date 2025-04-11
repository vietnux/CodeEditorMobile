package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import c.e.g;
import com.google.android.gms.ads.n.j;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.ac0;
import com.google.android.gms.internal.ads.ec0;
import com.google.android.gms.internal.ads.g50;
import com.google.android.gms.internal.ads.g60;
import com.google.android.gms.internal.ads.hc0;
import com.google.android.gms.internal.ads.j40;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k50;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.kc0;
import com.google.android.gms.internal.ads.n40;
import com.google.android.gms.internal.ads.na0;
import com.google.android.gms.internal.ads.nc0;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.ri0;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.xb0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@k2
public final class i extends k50 {

    /* renamed from: b  reason: collision with root package name */
    private final Context f3195b;

    /* renamed from: c  reason: collision with root package name */
    private final g50 f3196c;

    /* renamed from: d  reason: collision with root package name */
    private final ri0 f3197d;

    /* renamed from: e  reason: collision with root package name */
    private final xb0 f3198e;

    /* renamed from: f  reason: collision with root package name */
    private final nc0 f3199f;

    /* renamed from: g  reason: collision with root package name */
    private final ac0 f3200g;

    /* renamed from: h  reason: collision with root package name */
    private final kc0 f3201h;

    /* renamed from: i  reason: collision with root package name */
    private final n40 f3202i;

    /* renamed from: j  reason: collision with root package name */
    private final j f3203j;

    /* renamed from: k  reason: collision with root package name */
    private final g<String, hc0> f3204k;

    /* renamed from: l  reason: collision with root package name */
    private final g<String, ec0> f3205l;

    /* renamed from: m  reason: collision with root package name */
    private final na0 f3206m;
    private final g60 n;
    private final String o;
    private final sc p;
    private WeakReference<b1> q;
    private final u1 r;
    private final Object s = new Object();

    i(Context context, String str, ri0 ri0, sc scVar, g50 g50, xb0 xb0, nc0 nc0, ac0 ac0, g<String, hc0> gVar, g<String, ec0> gVar2, na0 na0, g60 g60, u1 u1Var, kc0 kc0, n40 n40, j jVar) {
        this.f3195b = context;
        this.o = str;
        this.f3197d = ri0;
        this.p = scVar;
        this.f3196c = g50;
        this.f3200g = ac0;
        this.f3198e = xb0;
        this.f3199f = nc0;
        this.f3204k = gVar;
        this.f3205l = gVar2;
        this.f3206m = na0;
        h2();
        this.n = g60;
        this.r = u1Var;
        this.f3201h = kc0;
        this.f3202i = n40;
        this.f3203j = jVar;
        k80.a(this.f3195b);
    }

    private static void a(Runnable runnable) {
        u9.f5718h.post(runnable);
    }

    /* access modifiers changed from: private */
    public final void b(j40 j40, int i2) {
        if (((Boolean) a50.g().a(k80.k2)).booleanValue() || this.f3199f == null) {
            Context context = this.f3195b;
            e0 e0Var = new e0(context, this.r, n40.a(context), this.o, this.f3197d, this.p);
            this.q = new WeakReference<>(e0Var);
            xb0 xb0 = this.f3198e;
            y.a("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            e0Var.f3125g.s = xb0;
            nc0 nc0 = this.f3199f;
            y.a("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            e0Var.f3125g.u = nc0;
            ac0 ac0 = this.f3200g;
            y.a("setOnContentAdLoadedListener must be called on the main UI thread.");
            e0Var.f3125g.t = ac0;
            g<String, hc0> gVar = this.f3204k;
            y.a("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            e0Var.f3125g.w = gVar;
            e0Var.b(this.f3196c);
            g<String, ec0> gVar2 = this.f3205l;
            y.a("setOnCustomClickListener must be called on the main UI thread.");
            e0Var.f3125g.v = gVar2;
            e0Var.d(h2());
            na0 na0 = this.f3206m;
            y.a("setNativeAdOptions must be called on the main UI thread.");
            e0Var.f3125g.x = na0;
            e0Var.b(this.n);
            e0Var.i(i2);
            e0Var.b(j40);
            return;
        }
        h(0);
    }

    /* access modifiers changed from: private */
    public final void c(j40 j40) {
        if (((Boolean) a50.g().a(k80.k2)).booleanValue() || this.f3199f == null) {
            o1 o1Var = new o1(this.f3195b, this.r, this.f3202i, this.o, this.f3197d, this.p);
            this.q = new WeakReference<>(o1Var);
            kc0 kc0 = this.f3201h;
            y.a("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
            o1Var.f3125g.A = kc0;
            j jVar = this.f3203j;
            if (jVar != null) {
                if (jVar.u() != null) {
                    o1Var.a(this.f3203j.u());
                }
                o1Var.i(this.f3203j.t());
            }
            xb0 xb0 = this.f3198e;
            y.a("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            o1Var.f3125g.s = xb0;
            nc0 nc0 = this.f3199f;
            y.a("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            o1Var.f3125g.u = nc0;
            ac0 ac0 = this.f3200g;
            y.a("setOnContentAdLoadedListener must be called on the main UI thread.");
            o1Var.f3125g.t = ac0;
            g<String, hc0> gVar = this.f3204k;
            y.a("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            o1Var.f3125g.w = gVar;
            g<String, ec0> gVar2 = this.f3205l;
            y.a("setOnCustomClickListener must be called on the main UI thread.");
            o1Var.f3125g.v = gVar2;
            na0 na0 = this.f3206m;
            y.a("setNativeAdOptions must be called on the main UI thread.");
            o1Var.f3125g.x = na0;
            o1Var.d(h2());
            o1Var.b(this.f3196c);
            o1Var.b(this.n);
            ArrayList arrayList = new ArrayList();
            if (g2()) {
                arrayList.add(1);
            }
            if (this.f3201h != null) {
                arrayList.add(2);
            }
            o1Var.e(arrayList);
            if (g2()) {
                j40.f4676d.putBoolean("ina", true);
            }
            if (this.f3201h != null) {
                j40.f4676d.putBoolean("iba", true);
            }
            o1Var.b(j40);
            return;
        }
        h(0);
    }

    /* access modifiers changed from: private */
    public final boolean f2() {
        return ((Boolean) a50.g().a(k80.K0)).booleanValue() && this.f3201h != null;
    }

    private final boolean g2() {
        if (this.f3198e != null || this.f3200g != null || this.f3199f != null) {
            return true;
        }
        g<String, hc0> gVar = this.f3204k;
        return gVar != null && gVar.size() > 0;
    }

    private final void h(int i2) {
        g50 g50 = this.f3196c;
        if (g50 != null) {
            try {
                g50.c(0);
            } catch (RemoteException e2) {
                qc.c("Failed calling onAdFailedToLoad.", e2);
            }
        }
    }

    private final List<String> h2() {
        ArrayList arrayList = new ArrayList();
        if (this.f3200g != null) {
            arrayList.add("1");
        }
        if (this.f3198e != null) {
            arrayList.add("2");
        }
        if (this.f3199f != null) {
            arrayList.add("6");
        }
        if (this.f3204k.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.j50
    public final boolean N() {
        synchronized (this.s) {
            boolean z = false;
            if (this.q == null) {
                return false;
            }
            b1 b1Var = this.q.get();
            if (b1Var != null) {
                z = b1Var.N();
            }
            return z;
        }
    }

    @Override // com.google.android.gms.internal.ads.j50
    public final void a(j40 j40) {
        a(new j(this, j40));
    }

    @Override // com.google.android.gms.internal.ads.j50
    public final void a(j40 j40, int i2) {
        if (i2 > 0) {
            a(new k(this, j40, i2));
            return;
        }
        throw new IllegalArgumentException("Number of ads has to be more than 0");
    }

    @Override // com.google.android.gms.internal.ads.j50
    public final String k() {
        synchronized (this.s) {
            String str = null;
            if (this.q == null) {
                return null;
            }
            b1 b1Var = this.q.get();
            if (b1Var != null) {
                str = b1Var.k();
            }
            return str;
        }
    }

    @Override // com.google.android.gms.internal.ads.j50
    public final String m0() {
        synchronized (this.s) {
            String str = null;
            if (this.q == null) {
                return null;
            }
            b1 b1Var = this.q.get();
            if (b1Var != null) {
                str = b1Var.m0();
            }
            return str;
        }
    }
}
