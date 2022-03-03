package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.b8;
import com.google.android.gms.internal.ads.c8;
import com.google.android.gms.internal.ads.e90;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.l9;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.n3;
import com.google.android.gms.internal.ads.n40;
import com.google.android.gms.internal.ads.o;
import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.r8;
import com.google.android.gms.internal.ads.ri0;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.sg;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.x80;
import com.google.android.gms.internal.ads.zh;

@k2
public abstract class g1 extends b1 implements g, o {
    private boolean p;

    public g1(Context context, n40 n40, String str, ri0 ri0, sc scVar, u1 u1Var) {
        super(context, n40, str, ri0, scVar, u1Var);
    }

    @Override // com.google.android.gms.ads.internal.g
    public final void K1() {
        d();
    }

    @Override // com.google.android.gms.ads.internal.g
    public final void S1() {
        c();
        k1();
    }

    @Override // com.google.android.gms.internal.ads.o
    public final void Y1() {
        f2();
    }

    /* access modifiers changed from: protected */
    public lg a(r8 r8Var, v1 v1Var, b8 b8Var) {
        View nextView = this.f3125g.f3371g.getNextView();
        if (nextView instanceof lg) {
            ((lg) nextView).destroy();
        }
        if (nextView != null) {
            this.f3125g.f3371g.removeView(nextView);
        }
        x0.g();
        y0 y0Var = this.f3125g;
        Context context = y0Var.f3368d;
        zh a = zh.a(y0Var.f3374j);
        y0 y0Var2 = this.f3125g;
        lg a2 = sg.a(context, a, y0Var2.f3374j.f5046b, false, false, y0Var2.f3369e, y0Var2.f3370f, this.f3120b, this, this.f3131m, r8Var.f5401i);
        if (this.f3125g.f3374j.f5052h == null) {
            c(a2.getView());
        }
        a2.M().a(this, this, this, this, this, false, null, v1Var, this, b8Var);
        a(a2);
        a2.a(r8Var.a.w);
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.o
    public final void a(int i2, int i3, int i4, int i5) {
        h2();
    }

    @Override // com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final void a(e90 e90) {
        y.a("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f3125g.C = e90;
    }

    /* access modifiers changed from: protected */
    public final void a(lg lgVar) {
        lgVar.b("/trackActiveViewUnit", new h1(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.a
    public void a(r8 r8Var, x80 x80) {
        if (r8Var.f5397e != -2) {
            u9.f5718h.post(new i1(this, r8Var));
            return;
        }
        n40 n40 = r8Var.f5396d;
        if (n40 != null) {
            this.f3125g.f3374j = n40;
        }
        n3 n3Var = r8Var.f5394b;
        if (!n3Var.f5031j || n3Var.D) {
            c8 c8Var = this.f3131m.f3341c;
            y0 y0Var = this.f3125g;
            u9.f5718h.post(new j1(this, r8Var, c8Var.a(y0Var.f3368d, y0Var.f3370f, r8Var.f5394b), x80));
            return;
        }
        y0 y0Var2 = this.f3125g;
        y0Var2.J = 0;
        x0.e();
        y0 y0Var3 = this.f3125g;
        y0Var2.f3373i = m0.a(y0Var3.f3368d, this, r8Var, y0Var3.f3369e, null, this.n, this, x80);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.ads.internal.a
    public boolean a(q8 q8Var, q8 q8Var2) {
        z0 z0Var;
        if (this.f3125g.d() && (z0Var = this.f3125g.f3371g) != null) {
            z0Var.a().c(q8Var2.A);
        }
        try {
            if (q8Var2.f5319b != null && !q8Var2.n && q8Var2.M) {
                if (((Boolean) a50.g().a(k80.k3)).booleanValue() && !q8Var2.a.f4676d.containsKey("sdk_less_server_data")) {
                    try {
                        q8Var2.f5319b.O();
                    } catch (Throwable unused) {
                        l9.e("Could not render test Ad label.");
                    }
                }
            }
        } catch (RuntimeException unused2) {
            l9.e("Could not render test AdLabel.");
        }
        return super.a(q8Var, q8Var2);
    }

    @Override // com.google.android.gms.ads.internal.g
    public final void b(View view) {
        y0 y0Var = this.f3125g;
        y0Var.I = view;
        a(new q8(y0Var.f3376l, null, null, null, null, null, null, null));
    }

    /* access modifiers changed from: package-private */
    public final void b(lg lgVar) {
        y0 y0Var = this.f3125g;
        q8 q8Var = y0Var.f3375k;
        if (q8Var != null) {
            this.f3127i.a(y0Var.f3374j, q8Var, lgVar.getView(), lgVar);
            this.p = false;
            return;
        }
        this.p = true;
        qc.d("Request to enable ActiveView before adState is available.");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.a
    public void i2() {
        super.i2();
        if (this.p) {
            if (((Boolean) a50.g().a(k80.f2)).booleanValue()) {
                b(this.f3125g.f3375k.f5319b);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean o2() {
        n3 n3Var;
        r8 r8Var = this.f3125g.f3376l;
        return (r8Var == null || (n3Var = r8Var.f5394b) == null || !n3Var.V) ? false : true;
    }
}
