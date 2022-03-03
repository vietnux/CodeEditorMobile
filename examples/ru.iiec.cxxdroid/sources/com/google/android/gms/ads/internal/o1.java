package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ads.aa0;
import com.google.android.gms.internal.ads.ai0;
import com.google.android.gms.internal.ads.bi0;
import com.google.android.gms.internal.ads.ca0;
import com.google.android.gms.internal.ads.dj0;
import com.google.android.gms.internal.ads.e90;
import com.google.android.gms.internal.ads.ec0;
import com.google.android.gms.internal.ads.hj0;
import com.google.android.gms.internal.ads.j3;
import com.google.android.gms.internal.ads.j40;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.kc0;
import com.google.android.gms.internal.ads.kj0;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.n3;
import com.google.android.gms.internal.ads.n40;
import com.google.android.gms.internal.ads.o60;
import com.google.android.gms.internal.ads.o7;
import com.google.android.gms.internal.ads.p90;
import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.r8;
import com.google.android.gms.internal.ads.r90;
import com.google.android.gms.internal.ads.ri0;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.tb0;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.w90;
import com.google.android.gms.internal.ads.y90;
import com.google.android.gms.internal.ads.ya0;
import com.google.android.gms.internal.ads.z90;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.util.List;
import org.json.JSONObject;

@k2
public final class o1 extends b1 implements ca0 {
    private boolean p;
    private q8 q;
    private boolean r = false;

    public o1(Context context, u1 u1Var, n40 n40, String str, ri0 ri0, sc scVar) {
        super(context, n40, str, ri0, scVar, u1Var);
    }

    private static q8 a(r8 r8Var, int i2) {
        j3 j3Var = r8Var.a;
        j40 j40 = j3Var.f4662d;
        n3 n3Var = r8Var.f5394b;
        List<String> list = n3Var.f5027f;
        List<String> list2 = n3Var.f5029h;
        List<String> list3 = n3Var.f5033l;
        int i3 = n3Var.n;
        long j2 = n3Var.f5034m;
        String str = j3Var.f4668j;
        boolean z = n3Var.f5031j;
        bi0 bi0 = r8Var.f5395c;
        long j3 = n3Var.f5032k;
        n40 n40 = r8Var.f5396d;
        long j4 = n3Var.f5030i;
        long j5 = r8Var.f5398f;
        long j6 = r8Var.f5399g;
        String str2 = n3Var.q;
        JSONObject jSONObject = r8Var.f5400h;
        o7 o7Var = n3Var.E;
        List<String> list4 = n3Var.F;
        return new q8(j40, null, list, i2, list2, list3, i3, j2, str, z, null, null, null, bi0, null, j3, n40, j4, j5, j6, str2, jSONObject, null, o7Var, list4, list4, n3Var.H, n3Var.I, null, n3Var.L, n3Var.P, r8Var.f5401i, n3Var.T, r8Var.f5402j, n3Var.V, n3Var.W, n3Var.X, n3Var.Y);
    }

    private final void a(w90 w90) {
        u9.f5718h.post(new q1(this, w90));
    }

    private final boolean b(q8 q8Var, q8 q8Var2) {
        Handler handler;
        Runnable s1Var;
        w90 w90;
        View view = null;
        d((List<String>) null);
        if (!this.f3125g.d()) {
            qc.d("Native ad does not have custom rendering mode.");
        } else {
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
                    double t = q1.t();
                    String A = q1.A();
                    String x = q1.x();
                    o60 videoController = q1.getVideoController();
                    if (q1.C() != null) {
                        view = (View) b.y(q1.C());
                    }
                    w90 = new w90(g2, b2, h2, B, j2, z, t, A, x, null, videoController, view, q1.i(), c2, q1.m());
                    w90.a(new z90(this.f3125g.f3368d, this, this.f3125g.f3369e, q1, w90));
                } else if (H0 == null || this.f3125g.u == null) {
                    if (H0 != null && this.f3125g.s != null) {
                        String g3 = H0.g();
                        List b3 = H0.b();
                        String h3 = H0.h();
                        ya0 B2 = H0.B() != null ? H0.B() : null;
                        String j3 = H0.j();
                        double t2 = H0.t();
                        String A2 = H0.A();
                        String x2 = H0.x();
                        Bundle m2 = H0.m();
                        o60 videoController2 = H0.getVideoController();
                        if (H0.C() != null) {
                            view = (View) b.y(H0.C());
                        }
                        p90 p90 = new p90(g3, b3, h3, B2, j3, t2, A2, x2, null, m2, videoController2, view, H0.i(), c2);
                        p90.a(new z90(this.f3125g.f3368d, this, this.f3125g.f3369e, H0, p90));
                        handler = u9.f5718h;
                        s1Var = new r1(this, p90);
                    } else if (Z0 != null && this.f3125g.u != null) {
                        String g4 = Z0.g();
                        List b4 = Z0.b();
                        String h4 = Z0.h();
                        ya0 z0 = Z0.z0() != null ? Z0.z0() : null;
                        String j4 = Z0.j();
                        String z2 = Z0.z();
                        o60 videoController3 = Z0.getVideoController();
                        if (Z0.C() != null) {
                            view = (View) b.y(Z0.C());
                        }
                        w90 w902 = new w90(g4, b4, h4, z0, j4, z2, -1.0d, null, null, null, videoController3, view, Z0.i(), c2, Z0.m());
                        w90 = w902;
                        w90.a(new z90(this.f3125g.f3368d, this, this.f3125g.f3369e, Z0, w902));
                    } else if (Z0 != null && this.f3125g.t != null) {
                        String g5 = Z0.g();
                        List b5 = Z0.b();
                        String h5 = Z0.h();
                        ya0 z02 = Z0.z0() != null ? Z0.z0() : null;
                        String j5 = Z0.j();
                        String z3 = Z0.z();
                        Bundle m3 = Z0.m();
                        o60 videoController4 = Z0.getVideoController();
                        if (Z0.C() != null) {
                            view = (View) b.y(Z0.C());
                        }
                        r90 r90 = new r90(g5, b5, h5, z02, j5, z3, null, m3, videoController4, view, Z0.i(), c2);
                        r90.a(new z90(this.f3125g.f3368d, this, this.f3125g.f3369e, Z0, r90));
                        handler = u9.f5718h;
                        s1Var = new s1(this, r90);
                    } else if (a1 == null || this.f3125g.w == null || this.f3125g.w.get(a1.n()) == null) {
                        qc.d("No matching mapper/listener for retrieved native ad template.");
                        h(0);
                        return false;
                    } else {
                        u9.f5718h.post(new t1(this, a1));
                        return super.a(q8Var, q8Var2);
                    }
                    handler.post(s1Var);
                    return super.a(q8Var, q8Var2);
                } else {
                    String g6 = H0.g();
                    List b6 = H0.b();
                    String h6 = H0.h();
                    ya0 B3 = H0.B() != null ? H0.B() : null;
                    String j6 = H0.j();
                    double t3 = H0.t();
                    String A3 = H0.A();
                    String x3 = H0.x();
                    o60 videoController5 = H0.getVideoController();
                    if (H0.C() != null) {
                        view = (View) b.y(H0.C());
                    }
                    w90 = new w90(g6, b6, h6, B3, j6, null, t3, A3, x3, null, videoController5, view, H0.i(), c2, H0.m());
                    w90.a(new z90(this.f3125g.f3368d, this, this.f3125g.f3369e, H0, w90));
                }
                a(w90);
                return super.a(q8Var, q8Var2);
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
        h(0);
        return false;
    }

    private final boolean c(q8 q8Var, q8 q8Var2) {
        View a = t.a(q8Var2);
        if (a == null) {
            return false;
        }
        View nextView = this.f3125g.f3371g.getNextView();
        if (nextView != null) {
            if (nextView instanceof lg) {
                ((lg) nextView).destroy();
            }
            this.f3125g.f3371g.removeView(nextView);
        }
        if (!t.b(q8Var2)) {
            try {
                c(a);
            } catch (Throwable th) {
                x0.j().a(th, "AdLoaderManager.swapBannerViews");
                qc.c("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.f3125g.f3371g.getChildCount() > 1) {
            this.f3125g.f3371g.showNext();
        }
        if (q8Var != null) {
            View nextView2 = this.f3125g.f3371g.getNextView();
            if (nextView2 != null) {
                this.f3125g.f3371g.removeView(nextView2);
            }
            this.f3125g.c();
        }
        this.f3125g.f3371g.setMinimumWidth(B0().f5051g);
        this.f3125g.f3371g.setMinimumHeight(B0().f5048d);
        this.f3125g.f3371g.requestLayout();
        this.f3125g.f3371g.setVisibility(0);
        return true;
    }

    private final bi0 o2() {
        q8 q8Var = this.f3125g.f3375k;
        if (q8Var == null || !q8Var.n) {
            return null;
        }
        return q8Var.r;
    }

    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final void E() {
        if (this.r) {
            super.E();
            return;
        }
        throw new IllegalStateException("Native Ad does not support resume().");
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void E1() {
        qc.d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void F1() {
        qc.d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.internal.ads.ci0, com.google.android.gms.ads.internal.b1
    public final void M1() {
        ai0 ai0;
        q8 q8Var = this.f3125g.f3375k;
        if (q8Var == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(q8Var.q) || (ai0 = this.f3125g.f3375k.o) == null || !ai0.b()) {
            super.M1();
        } else {
            L1();
        }
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final boolean N1() {
        if (o2() != null) {
            return o2().q;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ci0, com.google.android.gms.ads.internal.b1
    public final void V1() {
        ai0 ai0;
        q8 q8Var = this.f3125g.f3375k;
        if (q8Var == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(q8Var.q) || (ai0 = this.f3125g.f3375k.o) == null || !ai0.b()) {
            super.V1();
        } else {
            Z1();
        }
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void W1() {
        qc.d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void a(View view) {
        qc.d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final void a(e90 e90) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.google.android.gms.ads.internal.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.internal.ads.r8 r11, com.google.android.gms.internal.ads.x80 r12) {
        /*
            r10 = this;
            r0 = 0
            r10.q = r0
            int r0 = r11.f5397e
            r1 = 0
            r2 = -2
            if (r0 == r2) goto L_0x0010
            com.google.android.gms.internal.ads.q8 r0 = a(r11, r0)
        L_0x000d:
            r10.q = r0
            goto L_0x0020
        L_0x0010:
            com.google.android.gms.internal.ads.n3 r0 = r11.f5394b
            boolean r0 = r0.f5031j
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "partialAdState is not mediation"
            com.google.android.gms.internal.ads.qc.d(r0)
            com.google.android.gms.internal.ads.q8 r0 = a(r11, r1)
            goto L_0x000d
        L_0x0020:
            com.google.android.gms.internal.ads.q8 r0 = r10.q
            if (r0 == 0) goto L_0x002f
            android.os.Handler r11 = com.google.android.gms.internal.ads.u9.f5718h
            com.google.android.gms.ads.internal.p1 r12 = new com.google.android.gms.ads.internal.p1
            r12.<init>(r10)
            r11.post(r12)
            return
        L_0x002f:
            com.google.android.gms.internal.ads.n40 r0 = r11.f5396d
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.ads.internal.y0 r2 = r10.f3125g
            r2.f3374j = r0
        L_0x0037:
            com.google.android.gms.ads.internal.y0 r0 = r10.f3125g
            r0.J = r1
            com.google.android.gms.ads.internal.x0.e()
            com.google.android.gms.ads.internal.y0 r1 = r10.f3125g
            android.content.Context r2 = r1.f3368d
            com.google.android.gms.internal.ads.cx r5 = r1.f3369e
            r6 = 0
            com.google.android.gms.internal.ads.ri0 r7 = r10.n
            r3 = r10
            r4 = r11
            r8 = r10
            r9 = r12
            com.google.android.gms.internal.ads.na r11 = com.google.android.gms.internal.ads.m0.a(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f3373i = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.o1.a(com.google.android.gms.internal.ads.r8, com.google.android.gms.internal.ads.x80):void");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.b1
    public final boolean a(j40 j40, q8 q8Var, boolean z) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0061  */
    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.ads.internal.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.android.gms.internal.ads.q8 r5, com.google.android.gms.internal.ads.q8 r6) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.o1.a(com.google.android.gms.internal.ads.q8, com.google.android.gms.internal.ads.q8):boolean");
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void b(aa0 aa0) {
        qc.d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void b(y90 y90) {
        qc.d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final boolean b(j40 j40) {
        j40 j402 = j40;
        List<Integer> list = this.f3125g.B;
        if (list != null && list.size() == 1 && this.f3125g.B.get(0).intValue() == 2) {
            qc.a("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            h(0);
            return false;
        } else if (this.f3125g.A == null) {
            return super.b(j40);
        } else {
            boolean z = j402.f4681i;
            boolean z2 = this.p;
            if (z != z2) {
                j402 = new j40(j402.f4674b, j402.f4675c, j402.f4676d, j402.f4677e, j402.f4678f, j402.f4679g, j402.f4680h, z || z2, j402.f4682j, j402.f4683k, j402.f4684l, j402.f4685m, j402.n, j402.o, j402.p, j402.q, j402.r, j402.s);
            }
            return super.b(j402);
        }
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final boolean b2() {
        if (o2() != null) {
            return o2().p;
        }
        return false;
    }

    public final void d(List<String> list) {
        y.a("setNativeTemplates must be called on the main UI thread.");
        this.f3125g.G = list;
    }

    public final void e(List<Integer> list) {
        y.a("setAllowedAdTypes must be called on the main UI thread.");
        this.f3125g.B = list;
    }

    @Override // com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final o60 getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final void i(boolean z) {
        y.a("setManualImpressionsEnabled must be called from the main thread.");
        this.p = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.a
    public final void i2() {
        ai0 ai0;
        y0 y0Var;
        kc0 kc0;
        super.i2();
        q8 q8Var = this.f3125g.f3375k;
        if (q8Var != null && (ai0 = q8Var.o) != null && ai0.a() && (kc0 = (y0Var = this.f3125g).A) != null) {
            try {
                kc0.a(this, b.a(y0Var.f3368d));
                super.b(this.f3125g.f3375k, false);
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final ec0 n(String str) {
        y.a("getOnCustomClickListener must be called on the main UI thread.");
        return this.f3125g.v.get(str);
    }

    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.internal.ads.r50
    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final void y() {
        if (this.r) {
            super.y();
            return;
        }
        throw new IllegalStateException("Native Ad does not support pause().");
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
