package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import c.e.a;
import com.google.android.gms.ads.d;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.b8;
import com.google.android.gms.internal.ads.dj0;
import com.google.android.gms.internal.ads.f8;
import com.google.android.gms.internal.ads.fc;
import com.google.android.gms.internal.ads.hj0;
import com.google.android.gms.internal.ads.j40;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.m00;
import com.google.android.gms.internal.ads.n3;
import com.google.android.gms.internal.ads.n40;
import com.google.android.gms.internal.ads.o60;
import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.r8;
import com.google.android.gms.internal.ads.ri0;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.xh;
import com.google.android.gms.internal.ads.zh;
import e.b.b.a.b.b;
import java.lang.ref.WeakReference;
import java.util.List;

@k2
public final class w1 extends g1 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private boolean q;
    private boolean r;

    public w1(Context context, n40 n40, String str, ri0 ri0, sc scVar, u1 u1Var) {
        super(context, n40, str, ri0, scVar, u1Var);
        new WeakReference(null);
    }

    private final boolean b(q8 q8Var, q8 q8Var2) {
        lg lgVar;
        if (q8Var2.n) {
            View a = t.a(q8Var2);
            if (a == null) {
                qc.d("Could not get mediation view");
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
                    if (x0.C().e(this.f3125g.f3368d)) {
                        new m00(this.f3125g.f3368d, a).a(new f8(this.f3125g.f3368d, this.f3125g.f3367c));
                    }
                    if (q8Var2.u != null) {
                        this.f3125g.f3371g.setMinimumWidth(q8Var2.u.f5051g);
                        this.f3125g.f3371g.setMinimumHeight(q8Var2.u.f5048d);
                    }
                    c(a);
                } catch (Exception e2) {
                    x0.j().a(e2, "BannerAdManager.swapViews");
                    qc.c("Could not add mediation view to view hierarchy.", e2);
                    return false;
                }
            }
        } else {
            n40 n40 = q8Var2.u;
            if (!(n40 == null || (lgVar = q8Var2.f5319b) == null)) {
                lgVar.a(zh.a(n40));
                this.f3125g.f3371g.removeAllViews();
                this.f3125g.f3371g.setMinimumWidth(q8Var2.u.f5051g);
                this.f3125g.f3371g.setMinimumHeight(q8Var2.u.f5048d);
                c(q8Var2.f5319b.getView());
            }
        }
        if (this.f3125g.f3371g.getChildCount() > 1) {
            this.f3125g.f3371g.showNext();
        }
        if (q8Var != null) {
            View nextView2 = this.f3125g.f3371g.getNextView();
            if (nextView2 instanceof lg) {
                ((lg) nextView2).destroy();
            } else if (nextView2 != null) {
                this.f3125g.f3371g.removeView(nextView2);
            }
            this.f3125g.c();
        }
        this.f3125g.f3371g.setVisibility(0);
        return true;
    }

    private final void c(lg lgVar) {
        WebView webView;
        View view;
        if (o2() && (webView = lgVar.getWebView()) != null && (view = lgVar.getView()) != null && x0.v().b(this.f3125g.f3368d)) {
            sc scVar = this.f3125g.f3370f;
            int i2 = scVar.f5530c;
            int i3 = scVar.f5531d;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i2);
            sb.append(".");
            sb.append(i3);
            this.f3130l = x0.v().a(sb.toString(), webView, "", "javascript", m2());
            if (this.f3130l != null) {
                x0.v().a(this.f3130l, view);
                x0.v().a(this.f3130l);
                this.r = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.o
    public final void P1() {
        this.f3124f.d();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.g1
    public final lg a(r8 r8Var, v1 v1Var, b8 b8Var) {
        d dVar;
        y0 y0Var = this.f3125g;
        n40 n40 = y0Var.f3374j;
        if (n40.f5052h == null && n40.f5054j) {
            n3 n3Var = r8Var.f5394b;
            if (!n3Var.C) {
                String str = n3Var.o;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    dVar = new d(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    dVar = n40.t();
                }
                n40 = new n40(this.f3125g.f3368d, dVar);
            }
            y0Var.f3374j = n40;
        }
        return super.a(r8Var, v1Var, b8Var);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.b1
    public final void a(q8 q8Var, boolean z) {
        if (o2()) {
            lg lgVar = q8Var != null ? q8Var.f5319b : null;
            if (lgVar != null) {
                if (!this.r) {
                    c(lgVar);
                }
                if (this.f3130l != null) {
                    lgVar.a("onSdkImpression", new a());
                }
            }
        }
        super.a(q8Var, z);
        if (t.b(q8Var)) {
            d dVar = new d(this);
            if (q8Var != null && t.b(q8Var)) {
                lg lgVar2 = q8Var.f5319b;
                View view = lgVar2 != null ? lgVar2.getView() : null;
                if (view == null) {
                    qc.d("AdWebView is null");
                    return;
                }
                try {
                    List<String> list = q8Var.o != null ? q8Var.o.r : null;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            dj0 H0 = q8Var.p != null ? q8Var.p.H0() : null;
                            hj0 Z0 = q8Var.p != null ? q8Var.p.Z0() : null;
                            if (list.contains("2") && H0 != null) {
                                H0.c(b.a(view));
                                if (!H0.G()) {
                                    H0.c();
                                }
                                lgVar2.b("/nativeExpressViewClicked", t.a(H0, (hj0) null, dVar));
                                return;
                            } else if (!list.contains("1") || Z0 == null) {
                                qc.d("No matching template id and mapper");
                                return;
                            } else {
                                Z0.c(b.a(view));
                                if (!Z0.G()) {
                                    Z0.c();
                                }
                                lgVar2.b("/nativeExpressViewClicked", t.a((dj0) null, Z0, dVar));
                                return;
                            }
                        }
                    }
                    qc.d("No template ids present in mediation response");
                } catch (RemoteException e2) {
                    qc.c("Error occurred while recording impression and registering for clicks", e2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.a50.g().a(com.google.android.gms.internal.ads.k80.V1)).booleanValue() != false) goto L_0x007a;
     */
    @Override // com.google.android.gms.ads.internal.g1, com.google.android.gms.ads.internal.b1, com.google.android.gms.ads.internal.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.android.gms.internal.ads.q8 r5, com.google.android.gms.internal.ads.q8 r6) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.w1.a(com.google.android.gms.internal.ads.q8, com.google.android.gms.internal.ads.q8):boolean");
    }

    @Override // com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final boolean b(j40 j40) {
        j40 j402 = j40;
        boolean z = j402.f4681i;
        boolean z2 = this.q;
        if (z != z2) {
            j402 = new j40(j402.f4674b, j402.f4675c, j402.f4676d, j402.f4677e, j402.f4678f, j402.f4679g, j402.f4680h, z || z2, j402.f4682j, j402.f4683k, j402.f4684l, j402.f4685m, j402.n, j402.o, j402.p, j402.q, j402.r, j402.s);
        }
        return super.b(j402);
    }

    /* access modifiers changed from: package-private */
    public final void d(q8 q8Var) {
        lg lgVar;
        if (q8Var != null && !q8Var.f5330m && this.f3125g.f3371g != null) {
            u9 f2 = x0.f();
            y0 y0Var = this.f3125g;
            if (f2.a(y0Var.f3371g, y0Var.f3368d) && this.f3125g.f3371g.getGlobalVisibleRect(new Rect(), null)) {
                if (!(q8Var == null || (lgVar = q8Var.f5319b) == null || lgVar.M() == null)) {
                    q8Var.f5319b.M().a((xh) null);
                }
                a(q8Var, false);
                q8Var.f5330m = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final o60 getVideoController() {
        lg lgVar;
        y.a("getVideoController must be called from the main thread.");
        q8 q8Var = this.f3125g.f3375k;
        if (q8Var == null || (lgVar = q8Var.f5319b) == null) {
            return null;
        }
        return lgVar.s0();
    }

    @Override // com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public final void i(boolean z) {
        y.a("setManualImpressionsEnabled must be called from the main thread.");
        this.q = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.g1, com.google.android.gms.ads.internal.a
    public final void i2() {
        q8 q8Var = this.f3125g.f3375k;
        lg lgVar = q8Var != null ? q8Var.f5319b : null;
        if (!this.r && lgVar != null) {
            c(lgVar);
        }
        super.i2();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.b1
    public final boolean n2() {
        boolean z;
        z0 z0Var;
        x0.f();
        if (!u9.b(this.f3125g.f3368d, "android.permission.INTERNET")) {
            fc b2 = a50.b();
            y0 y0Var = this.f3125g;
            b2.a(y0Var.f3371g, y0Var.f3374j, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        } else {
            z = true;
        }
        x0.f();
        if (!u9.c(this.f3125g.f3368d)) {
            fc b3 = a50.b();
            y0 y0Var2 = this.f3125g;
            b3.a(y0Var2.f3371g, y0Var2.f3374j, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!z && (z0Var = this.f3125g.f3371g) != null) {
            z0Var.setVisibility(0);
        }
        return z;
    }

    public final void onGlobalLayout() {
        d(this.f3125g.f3375k);
    }

    public final void onScrollChanged() {
        d(this.f3125g.f3375k);
    }

    @Override // com.google.android.gms.ads.internal.b1, com.google.android.gms.internal.ads.r50
    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }
}
