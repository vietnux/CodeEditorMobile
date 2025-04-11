package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.gmsg.i;
import com.google.android.gms.ads.internal.gmsg.i0;
import com.google.android.gms.ads.internal.gmsg.j;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.overlay.l;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.n;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.ai0;
import com.google.android.gms.internal.ads.b8;
import com.google.android.gms.internal.ads.bi0;
import com.google.android.gms.internal.ads.f8;
import com.google.android.gms.internal.ads.j40;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.m00;
import com.google.android.gms.internal.ads.n3;
import com.google.android.gms.internal.ads.n40;
import com.google.android.gms.internal.ads.o7;
import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.r8;
import com.google.android.gms.internal.ads.ri0;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.sg;
import com.google.android.gms.internal.ads.th;
import com.google.android.gms.internal.ads.u5;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.x4;
import com.google.android.gms.internal.ads.x80;
import com.google.android.gms.internal.ads.zh;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class m extends g1 implements j, i0 {
    private transient boolean q;
    private int r = -1;
    private boolean s;
    private float t;
    private boolean u;
    private f8 v;
    private String w;
    private final String x;
    private final u5 y;

    public m(Context context, n40 n40, String str, ri0 ri0, sc scVar, u1 u1Var) {
        super(context, n40, str, ri0, scVar, u1Var);
        boolean z = false;
        this.q = false;
        if (n40 != null && "reward_mb".equals(n40.f5046b)) {
            z = true;
        }
        this.x = z ? "/Rewarded" : "/Interstitial";
        this.y = z ? new u5(this.f3125g, this.n, new o(this), this, this) : null;
    }

    private static r8 b(r8 r8Var) {
        try {
            String jSONObject = x4.a(r8Var.f5394b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, r8Var.a.f4664f);
            ai0 ai0 = new ai0(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1);
            n3 n3Var = r8Var.f5394b;
            bi0 bi0 = new bi0(Collections.singletonList(ai0), ((Long) a50.g().a(k80.A1)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), n3Var.L, n3Var.M, "", -1, 0, 1, null, 0, -1, -1, false);
            return new r8(r8Var.a, new n3(r8Var.a, n3Var.f5025d, n3Var.f5026e, Collections.emptyList(), Collections.emptyList(), n3Var.f5030i, true, n3Var.f5032k, Collections.emptyList(), n3Var.f5034m, n3Var.n, n3Var.o, n3Var.p, n3Var.q, n3Var.r, n3Var.s, null, n3Var.u, n3Var.v, n3Var.w, n3Var.x, n3Var.y, n3Var.B, n3Var.C, n3Var.D, null, Collections.emptyList(), Collections.emptyList(), n3Var.H, n3Var.I, n3Var.J, n3Var.K, n3Var.L, n3Var.M, n3Var.N, null, n3Var.P, n3Var.Q, n3Var.R, n3Var.T, 0, n3Var.V, Collections.emptyList(), n3Var.X, n3Var.Y), bi0, r8Var.f5396d, r8Var.f5397e, r8Var.f5398f, r8Var.f5399g, null, r8Var.f5401i, null);
        } catch (JSONException e2) {
            qc.b("Unable to generate ad state for an interstitial ad with pooling.", e2);
            return r8Var;
        }
    }

    private final void j(Bundle bundle) {
        u9 f2 = x0.f();
        y0 y0Var = this.f3125g;
        f2.b(y0Var.f3368d, y0Var.f3370f.f5529b, "gmob-apps", bundle, false);
    }

    private final boolean n(boolean z) {
        return this.y != null && z;
    }

    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.ads.internal.overlay.n
    public final void C1() {
        super.C1();
        this.f3127i.a(this.f3125g.f3375k);
        f8 f8Var = this.v;
        if (f8Var != null) {
            f8Var.a(false);
        }
        l2();
    }

    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.ads.internal.overlay.n
    public final void D1() {
        q8 q8Var;
        lg lgVar;
        q8 q8Var2;
        lg lgVar2;
        th M;
        c();
        super.D1();
        q8 q8Var3 = this.f3125g.f3375k;
        if (!(q8Var3 == null || (lgVar2 = q8Var3.f5319b) == null || (M = lgVar2.M()) == null)) {
            M.e();
        }
        if (!(!x0.C().g(this.f3125g.f3368d) || (q8Var2 = this.f3125g.f3375k) == null || q8Var2.f5319b == null)) {
            x0.C().c(this.f3125g.f3375k.f5319b.getContext(), this.w);
        }
        f8 f8Var = this.v;
        if (f8Var != null) {
            f8Var.a(true);
        }
        if (this.f3130l != null && (q8Var = this.f3125g.f3375k) != null && (lgVar = q8Var.f5319b) != null) {
            lgVar.a("onSdkImpression", new HashMap());
        }
    }

    @Override // com.google.android.gms.internal.ads.o
    public final void P1() {
        d P = this.f3125g.f3375k.f5319b.P();
        if (P != null) {
            P.f2();
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.j
    public final void Q1() {
        q8 q8Var = this.f3125g.f3375k;
        if (n(q8Var != null && q8Var.n)) {
            this.y.h();
        }
        k2();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.g1
    public final lg a(r8 r8Var, v1 v1Var, b8 b8Var) {
        x0.g();
        y0 y0Var = this.f3125g;
        Context context = y0Var.f3368d;
        zh a = zh.a(y0Var.f3374j);
        y0 y0Var2 = this.f3125g;
        lg a2 = sg.a(context, a, y0Var2.f3374j.f5046b, false, false, y0Var2.f3369e, y0Var2.f3370f, this.f3120b, this, this.f3131m, r8Var.f5401i);
        a2.M().a(this, this, null, this, this, ((Boolean) a50.g().a(k80.g0)).booleanValue(), this, v1Var, this, b8Var);
        a(a2);
        a2.a(r8Var.a.w);
        a2.b("/reward", new i(this));
        return a2;
    }

    @Override // com.google.android.gms.ads.internal.g1, com.google.android.gms.ads.internal.a
    public final void a(r8 r8Var, x80 x80) {
        if (r8Var.f5397e != -2) {
            super.a(r8Var, x80);
            return;
        }
        if (n(r8Var.f5395c != null)) {
            this.y.f();
            return;
        }
        if (!((Boolean) a50.g().a(k80.R0)).booleanValue()) {
            super.a(r8Var, x80);
            return;
        }
        boolean z = !r8Var.f5394b.f5031j;
        if (a.d(r8Var.a.f4662d) && z) {
            this.f3125g.f3376l = b(r8Var);
        }
        super.a(this.f3125g.f3376l, x80);
    }

    @Override // com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final void a(boolean z) {
        y.a("setImmersiveMode must be called on the main UI thread.");
        this.u = z;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.i0
    public final void a(boolean z, float f2) {
        this.s = z;
        this.t = f2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.b1
    public final boolean a(j40 j40, q8 q8Var, boolean z) {
        if (this.f3125g.d() && q8Var.f5319b != null) {
            x0.h();
            aa.a(q8Var.f5319b);
        }
        return this.f3124f.e();
    }

    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.ads.internal.a
    public final boolean a(j40 j40, x80 x80) {
        if (this.f3125g.f3375k != null) {
            qc.d("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.v == null && a.d(j40) && x0.C().g(this.f3125g.f3368d) && !TextUtils.isEmpty(this.f3125g.f3367c)) {
            y0 y0Var = this.f3125g;
            this.v = new f8(y0Var.f3368d, y0Var.f3367c);
        }
        return super.a(j40, x80);
    }

    @Override // com.google.android.gms.ads.internal.g1, com.google.android.gms.ads.internal.b1, com.google.android.gms.ads.internal.a
    public final boolean a(q8 q8Var, q8 q8Var2) {
        y0 y0Var;
        View view;
        if (n(q8Var2.n)) {
            return u5.a(q8Var, q8Var2);
        }
        if (!super.a(q8Var, q8Var2)) {
            return false;
        }
        if (!(this.f3125g.d() || (view = (y0Var = this.f3125g).I) == null || q8Var2.f5328k == null)) {
            this.f3127i.a(y0Var.f3374j, q8Var2, view);
        }
        b(q8Var2, false);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.j
    public final void b(o7 o7Var) {
        q8 q8Var = this.f3125g.f3375k;
        if (n(q8Var != null && q8Var.n)) {
            c(this.y.a(o7Var));
            return;
        }
        q8 q8Var2 = this.f3125g.f3375k;
        if (q8Var2 != null) {
            if (q8Var2.x != null) {
                x0.f();
                y0 y0Var = this.f3125g;
                u9.a(y0Var.f3368d, y0Var.f3370f.f5529b, y0Var.f3375k.x);
            }
            o7 o7Var2 = this.f3125g.f3375k.v;
            if (o7Var2 != null) {
                o7Var = o7Var2;
            }
        }
        c(o7Var);
    }

    @Override // com.google.android.gms.ads.internal.gmsg.j
    public final void e2() {
        q8 q8Var = this.f3125g.f3375k;
        if (n(q8Var != null && q8Var.n)) {
            this.y.g();
            j2();
            return;
        }
        q8 q8Var2 = this.f3125g.f3375k;
        if (!(q8Var2 == null || q8Var2.w == null)) {
            x0.f();
            y0 y0Var = this.f3125g;
            u9.a(y0Var.f3368d, y0Var.f3370f.f5529b, y0Var.f3375k.w);
        }
        j2();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.a
    public final void f2() {
        q2();
        super.f2();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.g1, com.google.android.gms.ads.internal.a
    public final void i2() {
        n3 n3Var;
        q8 q8Var = this.f3125g.f3375k;
        lg lgVar = q8Var != null ? q8Var.f5319b : null;
        r8 r8Var = this.f3125g.f3376l;
        if (!(r8Var == null || (n3Var = r8Var.f5394b) == null || !n3Var.V || lgVar == null || !x0.v().b(this.f3125g.f3368d))) {
            sc scVar = this.f3125g.f3370f;
            int i2 = scVar.f5530c;
            int i3 = scVar.f5531d;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i2);
            sb.append(".");
            sb.append(i3);
            this.f3130l = x0.v().a(sb.toString(), lgVar.getWebView(), "", "javascript", m2());
            if (!(this.f3130l == null || lgVar.getView() == null)) {
                x0.v().a(this.f3130l, lgVar.getView());
                x0.v().a(this.f3130l);
            }
        }
        super.i2();
        this.q = true;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.i0
    public final void m(boolean z) {
        this.f3125g.K = z;
    }

    /* access modifiers changed from: protected */
    public final boolean p2() {
        Window window;
        Context context = this.f3125g.f3368d;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            return (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) ? false : true;
        }
    }

    public final void q2() {
        x0.z().b(Integer.valueOf(this.r));
        if (this.f3125g.d()) {
            this.f3125g.b();
            y0 y0Var = this.f3125g;
            y0Var.f3375k = null;
            y0Var.K = false;
            this.q = false;
        }
    }

    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.internal.ads.r50
    public final void showInterstitial() {
        Bitmap bitmap;
        y.a("showInterstitial must be called on the main UI thread.");
        q8 q8Var = this.f3125g.f3375k;
        if (n(q8Var != null && q8Var.n)) {
            this.y.a(this.u);
            return;
        }
        if (x0.C().g(this.f3125g.f3368d)) {
            this.w = x0.C().j(this.f3125g.f3368d);
            String valueOf = String.valueOf(this.w);
            String valueOf2 = String.valueOf(this.x);
            this.w = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.f3125g.f3375k == null) {
            qc.d("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) a50.g().a(k80.q1)).booleanValue()) {
            String packageName = (this.f3125g.f3368d.getApplicationContext() != null ? this.f3125g.f3368d.getApplicationContext() : this.f3125g.f3368d).getPackageName();
            if (!this.q) {
                qc.d("It is not recommended to show an interstitial before onAdLoaded completes.");
                Bundle bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_before_load_finish");
                j(bundle);
            }
            x0.f();
            if (!u9.h(this.f3125g.f3368d)) {
                qc.d("It is not recommended to show an interstitial when app is not in foreground.");
                Bundle bundle2 = new Bundle();
                bundle2.putString("appid", packageName);
                bundle2.putString("action", "show_interstitial_app_not_in_foreground");
                j(bundle2);
            }
        }
        if (!this.f3125g.e()) {
            q8 q8Var2 = this.f3125g.f3375k;
            if (!q8Var2.n || q8Var2.p == null) {
                lg lgVar = this.f3125g.f3375k.f5319b;
                if (lgVar == null) {
                    qc.d("The interstitial failed to load.");
                } else if (lgVar.e0()) {
                    qc.d("The interstitial is already showing.");
                } else {
                    this.f3125g.f3375k.f5319b.d(true);
                    y0 y0Var = this.f3125g;
                    y0Var.a(y0Var.f3375k.f5319b.getView());
                    y0 y0Var2 = this.f3125g;
                    q8 q8Var3 = y0Var2.f3375k;
                    if (q8Var3.f5328k != null) {
                        this.f3127i.a(y0Var2.f3374j, q8Var3);
                    }
                    if (n.b()) {
                        q8 q8Var4 = this.f3125g.f3375k;
                        if (q8Var4.a()) {
                            new m00(this.f3125g.f3368d, q8Var4.f5319b.getView()).a(q8Var4.f5319b);
                        } else {
                            q8Var4.f5319b.M().a(new n(this, q8Var4));
                        }
                    }
                    if (this.f3125g.K) {
                        x0.f();
                        bitmap = u9.i(this.f3125g.f3368d);
                    } else {
                        bitmap = null;
                    }
                    this.r = x0.z().a(bitmap);
                    if (!((Boolean) a50.g().a(k80.Q1)).booleanValue() || bitmap == null) {
                        boolean z = this.f3125g.K;
                        boolean p2 = p2();
                        boolean z2 = this.u;
                        q8 q8Var5 = this.f3125g.f3375k;
                        r rVar = new r(z, p2, false, 0.0f, -1, z2, q8Var5.L, q8Var5.O);
                        int requestedOrientation = this.f3125g.f3375k.f5319b.getRequestedOrientation();
                        if (requestedOrientation == -1) {
                            requestedOrientation = this.f3125g.f3375k.f5325h;
                        }
                        y0 y0Var3 = this.f3125g;
                        q8 q8Var6 = y0Var3.f3375k;
                        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, q8Var6.f5319b, requestedOrientation, y0Var3.f3370f, q8Var6.A, rVar);
                        x0.d();
                        l.a(this.f3125g.f3368d, adOverlayInfoParcel, true);
                        return;
                    }
                    new p(this, this.r).e();
                }
            } else {
                try {
                    if (((Boolean) a50.g().a(k80.O0)).booleanValue()) {
                        this.f3125g.f3375k.p.a(this.u);
                    }
                    this.f3125g.f3375k.p.showInterstitial();
                } catch (RemoteException e2) {
                    qc.c("Could not show interstitial.", e2);
                    q2();
                }
            }
        }
    }
}
