package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.b1;
import com.google.android.gms.ads.internal.u1;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.ads.internal.y0;
import com.google.android.gms.common.internal.y;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class x5 extends b1 implements b7 {
    private static x5 s;
    private boolean p;
    private final f8 q;
    private final u5 r = new u5(this.f3125g, this.n, this, this, this);

    public x5(Context context, u1 u1Var, n40 n40, ri0 ri0, sc scVar) {
        super(context, n40, null, ri0, scVar, u1Var);
        s = this;
        this.q = new f8(context, null);
    }

    private static r8 b(r8 r8Var) {
        l9.e("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            JSONObject a = x4.a(r8Var.f5394b);
            a.remove("impression_urls");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, r8Var.a.f4664f);
            return new r8(r8Var.a, r8Var.f5394b, new bi0(Arrays.asList(new ai0(a.toString(), null, Arrays.asList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject.toString(), null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1)), ((Long) a50.g().a(k80.A1)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, null, 0, -1, -1, false), r8Var.f5396d, r8Var.f5397e, r8Var.f5398f, r8Var.f5399g, r8Var.f5400h, r8Var.f5401i, null);
        } catch (JSONException e2) {
            qc.b("Unable to generate ad state for non-mediated rewarded video.", e2);
            return new r8(r8Var.a, r8Var.f5394b, null, r8Var.f5396d, 0, r8Var.f5398f, r8Var.f5399g, r8Var.f5400h, r8Var.f5401i, null);
        }
    }

    public static x5 p2() {
        return s;
    }

    public final boolean D0() {
        y.a("isLoaded must be called on the main UI thread.");
        y0 y0Var = this.f3125g;
        return y0Var.f3372h == null && y0Var.f3373i == null && y0Var.f3375k != null;
    }

    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final void E() {
        this.r.c();
    }

    @Override // com.google.android.gms.internal.ads.b7
    public final void H1() {
        d();
    }

    @Override // com.google.android.gms.internal.ads.b7
    public final void a(o7 o7Var) {
        o7 a = this.r.a(o7Var);
        if (x0.C().h(this.f3125g.f3368d) && a != null) {
            x0.C().a(this.f3125g.f3368d, x0.C().b(this.f3125g.f3368d), this.f3125g.f3367c, a.f5126b, a.f5127c);
        }
        c(a);
    }

    public final void a(r6 r6Var) {
        y.a("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(r6Var.f5393c)) {
            qc.d("Invalid ad unit id. Aborting.");
            u9.f5718h.post(new y5(this));
            return;
        }
        y0 y0Var = this.f3125g;
        String str = r6Var.f5393c;
        y0Var.f3367c = str;
        this.q.b(str);
        super.b(r6Var.f5392b);
    }

    @Override // com.google.android.gms.ads.internal.a
    public final void a(r8 r8Var, x80 x80) {
        if (r8Var.f5397e != -2) {
            u9.f5718h.post(new z5(this, r8Var));
            return;
        }
        y0 y0Var = this.f3125g;
        y0Var.f3376l = r8Var;
        if (r8Var.f5395c == null) {
            y0Var.f3376l = b(r8Var);
        }
        this.r.f();
    }

    @Override // com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final void a(boolean z) {
        y.a("setImmersiveMode must be called on the main UI thread.");
        this.p = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.b1
    public final boolean a(j40 j40, q8 q8Var, boolean z) {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.ads.internal.a
    public final boolean a(q8 q8Var, q8 q8Var2) {
        b(q8Var2, false);
        return u5.a(q8Var, q8Var2);
    }

    public final void b(Context context) {
        this.r.a(context);
    }

    @Override // com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final void destroy() {
        this.r.a();
        super.destroy();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.a
    public final void f2() {
        this.f3125g.f3375k = null;
        super.f2();
    }

    public final j7 o(String str) {
        return this.r.a(str);
    }

    @Override // com.google.android.gms.internal.ads.b7
    public final void o() {
        this.r.g();
        j2();
    }

    public final void o2() {
        y.a("showAd must be called on the main UI thread.");
        if (!D0()) {
            qc.d("The reward video has not loaded.");
        } else {
            this.r.a(this.p);
        }
    }

    @Override // com.google.android.gms.internal.ads.b7
    public final void p() {
        this.r.h();
        k2();
    }

    @Override // com.google.android.gms.internal.ads.b7
    public final void q() {
        if (x0.C().h(this.f3125g.f3368d)) {
            this.q.a(false);
        }
        f2();
    }

    @Override // com.google.android.gms.internal.ads.b7
    public final void r() {
        g2();
    }

    @Override // com.google.android.gms.internal.ads.b7
    public final void s() {
        if (x0.C().h(this.f3125g.f3368d)) {
            this.q.a(true);
        }
        a(this.f3125g.f3375k, false);
        h2();
    }

    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final void y() {
        this.r.b();
    }
}
