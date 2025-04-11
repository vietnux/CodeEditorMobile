package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.r;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.n;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.u9;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.util.Collections;

@k2
public class d extends s implements w {
    private static final int v = Color.argb(0, 0, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    protected final Activity f3275b;

    /* renamed from: c  reason: collision with root package name */
    AdOverlayInfoParcel f3276c;

    /* renamed from: d  reason: collision with root package name */
    lg f3277d;

    /* renamed from: e  reason: collision with root package name */
    private i f3278e;

    /* renamed from: f  reason: collision with root package name */
    private o f3279f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3280g = false;

    /* renamed from: h  reason: collision with root package name */
    private FrameLayout f3281h;

    /* renamed from: i  reason: collision with root package name */
    private WebChromeClient.CustomViewCallback f3282i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3283j = false;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3284k = false;

    /* renamed from: l  reason: collision with root package name */
    private h f3285l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3286m = false;
    int n = 0;
    private final Object o = new Object();
    private Runnable p;
    private boolean q;
    private boolean r;
    private boolean s = false;
    private boolean t = false;
    private boolean u = true;

    public d(Activity activity) {
        this.f3275b = activity;
    }

    private final void U() {
        this.f3277d.U();
    }

    private final void m2() {
        if (this.f3275b.isFinishing() && !this.s) {
            this.s = true;
            lg lgVar = this.f3277d;
            if (lgVar != null) {
                lgVar.e(this.n);
                synchronized (this.o) {
                    if (!this.q && this.f3277d.c0()) {
                        this.p = new f(this);
                        u9.f5718h.postDelayed(this.p, ((Long) a50.g().a(k80.N0)).longValue());
                        return;
                    }
                }
            }
            i2();
        }
    }

    private final void n(boolean z) {
        int intValue = ((Integer) a50.g().a(k80.Z2)).intValue();
        p pVar = new p();
        pVar.f3300d = 50;
        int i2 = 0;
        pVar.a = z ? intValue : 0;
        if (!z) {
            i2 = intValue;
        }
        pVar.f3298b = i2;
        pVar.f3299c = intValue;
        this.f3279f = new o(this.f3275b, pVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        a(z, this.f3276c.f3261h);
        this.f3285l.addView(this.f3279f, layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b8, code lost:
        if (r17.f3275b.getResources().getConfiguration().orientation == 1) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d9, code lost:
        if (r17.f3275b.getResources().getConfiguration().orientation == 2) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0125 A[SYNTHETIC, Splitter:B:58:0x0125] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x020b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void o(boolean r18) {
        /*
        // Method dump skipped, instructions count: 572
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.d.o(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.r
    public final boolean G0() {
        this.n = 0;
        lg lgVar = this.f3277d;
        if (lgVar == null) {
            return true;
        }
        boolean t0 = lgVar.t0();
        if (!t0) {
            this.f3277d.a("onbackblocked", Collections.emptyMap());
        }
        return t0;
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void S0() {
        this.r = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.w
    public final void T1() {
        this.n = 1;
        this.f3275b.finish();
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void V0() {
        if (((Boolean) a50.g().a(k80.Y2)).booleanValue() && this.f3277d != null && (!this.f3275b.isFinishing() || this.f3278e == null)) {
            x0.h();
            aa.a(this.f3277d);
        }
        m2();
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void a(int i2, int i3, Intent intent) {
    }

    public final void a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f3281h = new FrameLayout(this.f3275b);
        this.f3281h.setBackgroundColor(-16777216);
        this.f3281h.addView(view, -1, -1);
        this.f3275b.setContentView(this.f3281h);
        this.r = true;
        this.f3282i = customViewCallback;
        this.f3280g = true;
    }

    public final void a(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        r rVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        r rVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) a50.g().a(k80.P0)).booleanValue() && (adOverlayInfoParcel2 = this.f3276c) != null && (rVar2 = adOverlayInfoParcel2.p) != null && rVar2.f3319i;
        boolean z5 = ((Boolean) a50.g().a(k80.Q0)).booleanValue() && (adOverlayInfoParcel = this.f3276c) != null && (rVar = adOverlayInfoParcel.p) != null && rVar.f3320j;
        if (z && z2 && z4 && !z5) {
            new n(this.f3277d, "useCustomClose").a("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        o oVar = this.f3279f;
        if (oVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            oVar.a(z3);
        }
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void e1() {
    }

    public final void f2() {
        this.n = 2;
        this.f3275b.finish();
    }

    public final void g2() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3276c;
        if (adOverlayInfoParcel != null && this.f3280g) {
            setRequestedOrientation(adOverlayInfoParcel.f3264k);
        }
        if (this.f3281h != null) {
            this.f3275b.setContentView(this.f3285l);
            this.r = true;
            this.f3281h.removeAllViews();
            this.f3281h = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f3282i;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f3282i = null;
        }
        this.f3280g = false;
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void h(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f3283j);
    }

    public final void h2() {
        this.f3285l.removeView(this.f3279f);
        n(true);
    }

    @Override // com.google.android.gms.internal.ads.r
    public void i(Bundle bundle) {
        this.f3275b.requestWindowFeature(1);
        this.f3283j = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.f3276c = AdOverlayInfoParcel.a(this.f3275b.getIntent());
            if (this.f3276c != null) {
                if (this.f3276c.n.f5531d > 7500000) {
                    this.n = 3;
                }
                if (this.f3275b.getIntent() != null) {
                    this.u = this.f3275b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.f3276c.p != null) {
                    this.f3284k = this.f3276c.p.f3312b;
                } else {
                    this.f3284k = false;
                }
                if (((Boolean) a50.g().a(k80.Q1)).booleanValue() && this.f3284k && this.f3276c.p.f3317g != -1) {
                    new j(this, null).e();
                }
                if (bundle == null) {
                    if (this.f3276c.f3257d != null && this.u) {
                        this.f3276c.f3257d.D1();
                    }
                    if (!(this.f3276c.f3265l == 1 || this.f3276c.f3256c == null)) {
                        this.f3276c.f3256c.d();
                    }
                }
                this.f3285l = new h(this.f3275b, this.f3276c.o, this.f3276c.n.f5529b);
                this.f3285l.setId(1000);
                int i2 = this.f3276c.f3265l;
                if (i2 == 1) {
                    o(false);
                } else if (i2 == 2) {
                    this.f3278e = new i(this.f3276c.f3258e);
                    o(false);
                } else if (i2 == 3) {
                    o(true);
                } else {
                    throw new g("Could not determine ad overlay type.");
                }
            } else {
                throw new g("Could not get info for ad overlay.");
            }
        } catch (g e2) {
            qc.d(e2.getMessage());
            this.n = 3;
            this.f3275b.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void i(a aVar) {
        if (((Boolean) a50.g().a(k80.X2)).booleanValue() && com.google.android.gms.common.util.n.k()) {
            x0.f();
            if (u9.a(this.f3275b, (Configuration) b.y(aVar))) {
                this.f3275b.getWindow().addFlags(1024);
                this.f3275b.getWindow().clearFlags(2048);
                return;
            }
            this.f3275b.getWindow().addFlags(2048);
            this.f3275b.getWindow().clearFlags(1024);
        }
    }

    /* access modifiers changed from: package-private */
    public final void i2() {
        n nVar;
        if (!this.t) {
            this.t = true;
            lg lgVar = this.f3277d;
            if (lgVar != null) {
                this.f3285l.removeView(lgVar.getView());
                i iVar = this.f3278e;
                if (iVar != null) {
                    this.f3277d.a(iVar.f3292d);
                    this.f3277d.d(false);
                    ViewGroup viewGroup = this.f3278e.f3291c;
                    View view = this.f3277d.getView();
                    i iVar2 = this.f3278e;
                    viewGroup.addView(view, iVar2.a, iVar2.f3290b);
                    this.f3278e = null;
                } else if (this.f3275b.getApplicationContext() != null) {
                    this.f3277d.a(this.f3275b.getApplicationContext());
                }
                this.f3277d = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f3276c;
            if (adOverlayInfoParcel != null && (nVar = adOverlayInfoParcel.f3257d) != null) {
                nVar.C1();
            }
        }
    }

    public final void j2() {
        if (this.f3286m) {
            this.f3286m = false;
            U();
        }
    }

    public final void k2() {
        this.f3285l.f3289c = true;
    }

    public final void l2() {
        synchronized (this.o) {
            this.q = true;
            if (this.p != null) {
                u9.f5718h.removeCallbacks(this.p);
                u9.f5718h.post(this.p);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void onDestroy() {
        lg lgVar = this.f3277d;
        if (lgVar != null) {
            this.f3285l.removeView(lgVar.getView());
        }
        m2();
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void onPause() {
        g2();
        n nVar = this.f3276c.f3257d;
        if (nVar != null) {
            nVar.onPause();
        }
        if (!((Boolean) a50.g().a(k80.Y2)).booleanValue() && this.f3277d != null && (!this.f3275b.isFinishing() || this.f3278e == null)) {
            x0.h();
            aa.a(this.f3277d);
        }
        m2();
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void onResume() {
        n nVar = this.f3276c.f3257d;
        if (nVar != null) {
            nVar.onResume();
        }
        if (!((Boolean) a50.g().a(k80.Y2)).booleanValue()) {
            lg lgVar = this.f3277d;
            if (lgVar == null || lgVar.Y()) {
                qc.d("The webview does not exist. Ignoring action.");
                return;
            }
            x0.h();
            aa.b(this.f3277d);
        }
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void r1() {
        this.n = 0;
    }

    public final void setRequestedOrientation(int i2) {
        if (this.f3275b.getApplicationInfo().targetSdkVersion >= ((Integer) a50.g().a(k80.m3)).intValue()) {
            if (this.f3275b.getApplicationInfo().targetSdkVersion <= ((Integer) a50.g().a(k80.n3)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) a50.g().a(k80.o3)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) a50.g().a(k80.p3)).intValue()) {
                        return;
                    }
                }
            }
        }
        this.f3275b.setRequestedOrientation(i2);
    }

    @Override // com.google.android.gms.internal.ads.r
    public final void u0() {
        if (((Boolean) a50.g().a(k80.Y2)).booleanValue()) {
            lg lgVar = this.f3277d;
            if (lgVar == null || lgVar.Y()) {
                qc.d("The webview does not exist. Ignoring action.");
                return;
            }
            x0.h();
            aa.b(this.f3277d);
        }
    }
}
