package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import c.e.g;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.aa0;
import com.google.android.gms.internal.ads.bi0;
import com.google.android.gms.internal.ads.ca0;
import com.google.android.gms.internal.ads.da0;
import com.google.android.gms.internal.ads.dj0;
import com.google.android.gms.internal.ads.e90;
import com.google.android.gms.internal.ads.ec0;
import com.google.android.gms.internal.ads.hc0;
import com.google.android.gms.internal.ads.hj0;
import com.google.android.gms.internal.ads.j40;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.kj0;
import com.google.android.gms.internal.ads.l9;
import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.n40;
import com.google.android.gms.internal.ads.na0;
import com.google.android.gms.internal.ads.o1;
import com.google.android.gms.internal.ads.o60;
import com.google.android.gms.internal.ads.oz;
import com.google.android.gms.internal.ads.p90;
import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.r60;
import com.google.android.gms.internal.ads.r8;
import com.google.android.gms.internal.ads.r90;
import com.google.android.gms.internal.ads.ri0;
import com.google.android.gms.internal.ads.rz;
import com.google.android.gms.internal.ads.s1;
import com.google.android.gms.internal.ads.s9;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.t90;
import com.google.android.gms.internal.ads.tb0;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.ui0;
import com.google.android.gms.internal.ads.w90;
import com.google.android.gms.internal.ads.wd;
import com.google.android.gms.internal.ads.x80;
import com.google.android.gms.internal.ads.y;
import com.google.android.gms.internal.ads.y90;
import com.google.android.gms.internal.ads.ya0;
import com.google.android.gms.internal.ads.z90;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class e0 extends b1 implements ca0 {
    private final Object p;
    private boolean q;
    private wd<da0> r;
    private lg s;
    private lg t;
    private boolean u;
    private int v;
    private o1 w;
    private final String x;

    public e0(Context context, u1 u1Var, n40 n40, String str, ri0 ri0, sc scVar) {
        this(context, u1Var, n40, str, ri0, scVar, false);
    }

    public e0(Context context, u1 u1Var, n40 n40, String str, ri0 ri0, sc scVar, boolean z) {
        super(context, n40, str, ri0, scVar, u1Var);
        this.p = new Object();
        this.r = new wd<>();
        this.v = 1;
        this.x = UUID.randomUUID().toString();
        this.q = z;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.w90 a(com.google.android.gms.internal.ads.da0 r20) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.e0.a(com.google.android.gms.internal.ads.da0):com.google.android.gms.internal.ads.w90");
    }

    /* access modifiers changed from: private */
    public static void a(y0 y0Var, y0 y0Var2) {
        if (y0Var2.s == null) {
            y0Var2.s = y0Var.s;
        }
        if (y0Var2.t == null) {
            y0Var2.t = y0Var.t;
        }
        if (y0Var2.v == null) {
            y0Var2.v = y0Var.v;
        }
        if (y0Var2.w == null) {
            y0Var2.w = y0Var.w;
        }
        if (y0Var2.y == null) {
            y0Var2.y = y0Var.y;
        }
        if (y0Var2.x == null) {
            y0Var2.x = y0Var.x;
        }
        if (y0Var2.G == null) {
            y0Var2.G = y0Var.G;
        }
        if (y0Var2.f3377m == null) {
            y0Var2.f3377m = y0Var.f3377m;
        }
        if (y0Var2.H == null) {
            y0Var2.H = y0Var.H;
        }
        if (y0Var2.n == null) {
            y0Var2.n = y0Var.n;
        }
        if (y0Var2.o == null) {
            y0Var2.o = y0Var.o;
        }
        if (y0Var2.f3374j == null) {
            y0Var2.f3374j = y0Var.f3374j;
        }
        if (y0Var2.f3375k == null) {
            y0Var2.f3375k = y0Var.f3375k;
        }
        if (y0Var2.f3376l == null) {
            y0Var2.f3376l = y0Var.f3376l;
        }
    }

    private final void a(p90 p90) {
        u9.f5718h.post(new i0(this, p90));
    }

    private final void a(r90 r90) {
        u9.f5718h.post(new k0(this, r90));
    }

    private final void a(w90 w90) {
        u9.f5718h.post(new j0(this, w90));
    }

    private final boolean w2() {
        q8 q8Var = this.f3125g.f3375k;
        return q8Var != null && q8Var.N;
    }

    private final bi0 x2() {
        q8 q8Var = this.f3125g.f3375k;
        if (q8Var == null || !q8Var.n) {
            return null;
        }
        return q8Var.r;
    }

    private final void y2() {
        o1 q2 = q2();
        if (q2 != null) {
            q2.a();
        }
    }

    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final void E() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void E1() {
        if (w2() && this.f3130l != null) {
            lg lgVar = this.t;
            if (lgVar == null && (lgVar = this.s) == null) {
                lgVar = null;
            }
            if (lgVar != null) {
                lgVar.a("onSdkImpression", new HashMap());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void F1() {
        super.l2();
        lg lgVar = this.t;
        if (lgVar != null) {
            lgVar.destroy();
            this.t = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ci0, com.google.android.gms.ads.internal.b1
    public final void M1() {
        q8 q8Var = this.f3125g.f3375k;
        if (q8Var == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(q8Var.q)) {
            super.M1();
        } else {
            L1();
        }
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final boolean N1() {
        if (x2() != null) {
            return x2().q;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ci0, com.google.android.gms.ads.internal.b1
    public final void V1() {
        q8 q8Var = this.f3125g.f3375k;
        if (q8Var == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(q8Var.q)) {
            super.V1();
        } else {
            Z1();
        }
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void W1() {
        lg lgVar = this.s;
        if (lgVar != null) {
            lgVar.destroy();
            this.s = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.a
    public final void a(int i2, boolean z) {
        y2();
        super.a(i2, z);
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void a(View view) {
        if (this.f3130l != null) {
            x0.v().a(this.f3130l, view);
        }
    }

    @Override // com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final void a(e90 e90) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public final void a(lg lgVar) {
        this.s = lgVar;
    }

    @Override // com.google.android.gms.ads.internal.a
    public final void a(r8 r8Var, x80 x80) {
        n40 n40 = r8Var.f5396d;
        if (n40 != null) {
            this.f3125g.f3374j = n40;
        }
        if (r8Var.f5397e != -2) {
            u9.f5718h.post(new f0(this, r8Var));
            return;
        }
        int i2 = r8Var.a.Z;
        if (i2 == 1) {
            y0 y0Var = this.f3125g;
            y0Var.J = 0;
            x0.e();
            y0 y0Var2 = this.f3125g;
            y0Var.f3373i = m0.a(y0Var2.f3368d, this, r8Var, y0Var2.f3369e, null, this.n, this, x80);
            String valueOf = String.valueOf(this.f3125g.f3373i.getClass().getName());
            qc.b(valueOf.length() != 0 ? "AdRenderer: ".concat(valueOf) : new String("AdRenderer: "));
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(r8Var.f5394b.f5026e).getJSONArray("slots");
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i3).getJSONArray("ads");
                for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                    jSONArray.put(jSONArray3.get(i4));
                }
            }
            y2();
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < i2; i5++) {
                arrayList.add(s9.a(new g0(this, i5, jSONArray, i2, r8Var)));
            }
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                try {
                    u9.f5718h.post(new h0(this, (da0) ((ld) arrayList.get(i6)).get(((Long) a50.g().a(k80.A1)).longValue(), TimeUnit.MILLISECONDS), i6, arrayList));
                } catch (InterruptedException e2) {
                    qc.c("", e2);
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException | TimeoutException e3) {
                    qc.c("", e3);
                }
            }
        } catch (JSONException e4) {
            qc.c("Malformed native ad response", e4);
            h(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final void a(y yVar) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.b1
    public final boolean a(j40 j40, q8 q8Var, boolean z) {
        return this.f3124f.e();
    }

    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.ads.internal.a
    public final boolean a(j40 j40, x80 x80) {
        try {
            p2();
            return super.a(j40, x80, this.v);
        } catch (Exception e2) {
            if (!qc.a(4)) {
                return false;
            }
            Log.i("Ads", "Error initializing webview.", e2);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.ads.internal.a
    public final boolean a(q8 q8Var, q8 q8Var2) {
        g<String, hc0> gVar;
        w90 w90;
        View view = null;
        d((List<String>) null);
        if (this.f3125g.d()) {
            if (q8Var2.n) {
                y2();
                try {
                    kj0 q1 = q8Var2.p != null ? q8Var2.p.q1() : null;
                    dj0 H0 = q8Var2.p != null ? q8Var2.p.H0() : null;
                    hj0 Z0 = q8Var2.p != null ? q8Var2.p.Z0() : null;
                    tb0 a1 = q8Var2.p != null ? q8Var2.p.a1() : null;
                    String c2 = b1.c(q8Var2);
                    if (q1 != null && this.f3125g.u != null) {
                        String g2 = q1.g();
                        List b2 = q1.b();
                        String h2 = q1.h();
                        ya0 B = q1.B() != null ? q1.B() : null;
                        String j2 = q1.j();
                        String z = q1.z();
                        double t2 = q1.t();
                        String A = q1.A();
                        String x2 = q1.x();
                        o60 videoController = q1.getVideoController();
                        if (q1.C() != null) {
                            view = (View) b.y(q1.C());
                        }
                        w90 = new w90(g2, b2, h2, B, j2, z, t2, A, x2, null, videoController, view, q1.i(), c2, q1.m());
                        w90.a(new z90(this.f3125g.f3368d, this, this.f3125g.f3369e, q1, w90));
                    } else if (H0 != null && this.f3125g.u != null) {
                        String g3 = H0.g();
                        List b3 = H0.b();
                        String h3 = H0.h();
                        ya0 B2 = H0.B() != null ? H0.B() : null;
                        String j3 = H0.j();
                        double t3 = H0.t();
                        String A2 = H0.A();
                        String x3 = H0.x();
                        o60 videoController2 = H0.getVideoController();
                        if (H0.C() != null) {
                            view = (View) b.y(H0.C());
                        }
                        w90 = new w90(g3, b3, h3, B2, j3, null, t3, A2, x3, null, videoController2, view, H0.i(), c2, H0.m());
                        w90.a(new z90(this.f3125g.f3368d, this, this.f3125g.f3369e, H0, w90));
                    } else if (H0 != null && this.f3125g.s != null) {
                        String g4 = H0.g();
                        List b4 = H0.b();
                        String h4 = H0.h();
                        ya0 B3 = H0.B() != null ? H0.B() : null;
                        String j4 = H0.j();
                        double t4 = H0.t();
                        String A3 = H0.A();
                        String x4 = H0.x();
                        Bundle m2 = H0.m();
                        o60 videoController3 = H0.getVideoController();
                        if (H0.C() != null) {
                            view = (View) b.y(H0.C());
                        }
                        p90 p90 = new p90(g4, b4, h4, B3, j4, t4, A3, x4, null, m2, videoController3, view, H0.i(), c2);
                        p90.a(new z90(this.f3125g.f3368d, this, this.f3125g.f3369e, H0, p90));
                        a(p90);
                    } else if (Z0 != null && this.f3125g.u != null) {
                        String g5 = Z0.g();
                        List b5 = Z0.b();
                        String h5 = Z0.h();
                        ya0 z0 = Z0.z0() != null ? Z0.z0() : null;
                        String j5 = Z0.j();
                        String z2 = Z0.z();
                        o60 videoController4 = Z0.getVideoController();
                        if (Z0.C() != null) {
                            view = (View) b.y(Z0.C());
                        }
                        w90 w902 = new w90(g5, b5, h5, z0, j5, z2, -1.0d, null, null, null, videoController4, view, Z0.i(), c2, Z0.m());
                        w90 = w902;
                        w90.a(new z90(this.f3125g.f3368d, this, this.f3125g.f3369e, Z0, w902));
                    } else if (Z0 != null && this.f3125g.t != null) {
                        String g6 = Z0.g();
                        List b6 = Z0.b();
                        String h6 = Z0.h();
                        ya0 z02 = Z0.z0() != null ? Z0.z0() : null;
                        String j6 = Z0.j();
                        String z3 = Z0.z();
                        Bundle m3 = Z0.m();
                        o60 videoController5 = Z0.getVideoController();
                        if (Z0.C() != null) {
                            view = (View) b.y(Z0.C());
                        }
                        r90 r90 = new r90(g6, b6, h6, z02, j6, z3, null, m3, videoController5, view, Z0.i(), c2);
                        r90.a(new z90(this.f3125g.f3368d, this, this.f3125g.f3369e, Z0, r90));
                        a(r90);
                    } else if (a1 == null || this.f3125g.w == null || this.f3125g.w.get(a1.n()) == null) {
                        qc.d("No matching mapper/listener for retrieved native ad template.");
                        h(0);
                        return false;
                    } else {
                        u9.f5718h.post(new m0(this, a1));
                    }
                    a(w90);
                } catch (RemoteException e2) {
                    qc.d("#007 Could not call remote method.", e2);
                }
            } else {
                da0 da0 = q8Var2.C;
                if (this.q) {
                    this.r.b(da0);
                } else {
                    boolean z4 = da0 instanceof r90;
                    if (!z4 || this.f3125g.u == null) {
                        if (!z4 || this.f3125g.t == null) {
                            boolean z5 = da0 instanceof p90;
                            if (z5 && this.f3125g.u != null) {
                                da0 = q8Var2.C;
                            } else if (!z5 || this.f3125g.s == null) {
                                if ((da0 instanceof t90) && (gVar = this.f3125g.w) != null) {
                                    t90 t90 = (t90) da0;
                                    if (gVar.get(t90.n()) != null) {
                                        u9.f5718h.post(new l0(this, t90.n(), q8Var2));
                                    }
                                }
                                qc.d("No matching listener for retrieved native ad template.");
                                h(0);
                                return false;
                            } else {
                                a((p90) q8Var2.C);
                            }
                        } else {
                            a((r90) q8Var2.C);
                        }
                    }
                    a(a(da0));
                }
            }
            return super.a(q8Var, q8Var2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    @Override // com.google.android.gms.internal.ads.ci0, com.google.android.gms.ads.internal.b1
    public final void a2() {
        r60 M0;
        ui0 ui0 = this.f3125g.f3375k.p;
        if (ui0 == null) {
            super.a2();
            return;
        }
        o60 o60 = null;
        try {
            dj0 H0 = ui0.H0();
            if (H0 != null) {
                o60 = H0.getVideoController();
            } else {
                hj0 Z0 = ui0.Z0();
                if (Z0 != null) {
                    o60 = Z0.getVideoController();
                } else {
                    tb0 a1 = ui0.a1();
                    if (a1 != null) {
                        o60 = a1.getVideoController();
                    }
                }
            }
            if (o60 != null && (M0 = o60.M0()) != null) {
                M0.w0();
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void b(aa0 aa0) {
        if (this.f3125g.f3375k.f5328k != null) {
            oz i2 = x0.j().i();
            y0 y0Var = this.f3125g;
            i2.a(y0Var.f3374j, y0Var.f3375k, new rz(aa0), (lg) null);
        }
    }

    public final void b(lg lgVar) {
        this.t = lgVar;
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void b(y90 y90) {
        lg lgVar = this.s;
        if (lgVar != null) {
            lgVar.a(y90);
        }
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final boolean b2() {
        if (x2() != null) {
            return x2().p;
        }
        return false;
    }

    public final void d(List<String> list) {
        com.google.android.gms.common.internal.y.a("setNativeTemplates must be called on the main UI thread.");
        this.f3125g.G = list;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.a
    public final void h(int i2) {
        a(i2, false);
    }

    public final void i(int i2) {
        com.google.android.gms.common.internal.y.a("setMaxNumberOfAds must be called on the main UI thread.");
        this.v = i2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.a
    public final void i2() {
        l(false);
    }

    @Override // com.google.android.gms.internal.ads.ca0, com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final String k0() {
        return this.f3125g.f3367c;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.a
    public final void l(boolean z) {
        String str;
        super.l(z);
        if (this.u) {
            if (((Boolean) a50.g().a(k80.f2)).booleanValue()) {
                s2();
            }
        }
        if (!w2()) {
            return;
        }
        if (this.t != null || this.s != null) {
            lg lgVar = this.t;
            String str2 = null;
            if (lgVar == null) {
                lgVar = this.s;
                if (lgVar != null) {
                    str2 = "javascript";
                } else {
                    lgVar = null;
                    str = null;
                    if (lgVar.getWebView() != null && x0.v().b(this.f3125g.f3368d)) {
                        sc scVar = this.f3125g.f3370f;
                        int i2 = scVar.f5530c;
                        int i3 = scVar.f5531d;
                        StringBuilder sb = new StringBuilder(23);
                        sb.append(i2);
                        sb.append(".");
                        sb.append(i3);
                        this.f3130l = x0.v().a(sb.toString(), lgVar.getWebView(), "", "javascript", str);
                        if (this.f3130l != null) {
                            x0.v().a(this.f3130l);
                            return;
                        }
                        return;
                    }
                }
            }
            str = str2;
            if (lgVar.getWebView() != null) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final ec0 n(String str) {
        com.google.android.gms.common.internal.y.a("getOnCustomClickListener must be called on the main UI thread.");
        g<String, ec0> gVar = this.f3125g.v;
        if (gVar == null) {
            return null;
        }
        return gVar.get(str);
    }

    public final String o2() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public final void p2() {
        synchronized (this.p) {
            l9.e("Initializing webview native ads utills");
            this.w = new s1(this.f3125g.f3368d, this, this.x, this.f3125g.f3369e, this.f3125g.f3370f);
        }
    }

    public final o1 q2() {
        o1 o1Var;
        synchronized (this.p) {
            o1Var = this.w;
        }
        return o1Var;
    }

    /* access modifiers changed from: protected */
    public final Future<da0> r2() {
        return this.r;
    }

    public final void s2() {
        if (this.f3125g.f3375k == null || this.s == null) {
            this.u = true;
            qc.d("Request to enable ActiveView before adState is available.");
            return;
        }
        oz i2 = x0.j().i();
        y0 y0Var = this.f3125g;
        i2.a(y0Var.f3374j, y0Var.f3375k, this.s.getView(), this.s);
        this.u = false;
    }

    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.internal.ads.r50
    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public final void t2() {
        this.u = false;
        if (this.f3125g.f3375k == null || this.s == null) {
            qc.d("Request to enable ActiveView before adState is available.");
        } else {
            x0.j().i().a(this.f3125g.f3375k);
        }
    }

    public final g<String, hc0> u2() {
        com.google.android.gms.common.internal.y.a("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.f3125g.w;
    }

    public final void v2() {
        na0 na0;
        lg lgVar = this.s;
        if (lgVar != null && lgVar.s0() != null && (na0 = this.f3125g.x) != null && na0.f5084g != null) {
            this.s.s0().b(this.f3125g.x.f5084g);
        }
    }

    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final void y() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    /* access modifiers changed from: protected */
    public final void y(a aVar) {
        Object y = aVar != null ? b.y(aVar) : null;
        if (y instanceof aa0) {
            ((aa0) y).K1();
        }
        super.b(this.f3125g.f3375k, false);
    }
}
