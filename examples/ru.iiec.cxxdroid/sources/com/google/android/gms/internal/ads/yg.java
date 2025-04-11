package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.e0;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.q0;
import com.google.android.gms.ads.internal.u1;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.util.n;
import com.google.android.gms.common.util.o;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@k2
final class yg extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, lg {
    private y90 A;
    private int B;
    private int C;
    private v80 D;
    private v80 E;
    private v80 F;
    private w80 G;
    private WeakReference<View.OnClickListener> H;
    private d I;
    private boolean J;
    private ec K;
    private int L = -1;
    private int M = -1;
    private int N = -1;
    private int O = -1;
    private final WindowManager P;
    private final r20 Q;

    /* renamed from: b  reason: collision with root package name */
    private final yh f6115b;

    /* renamed from: c  reason: collision with root package name */
    private final cx f6116c;

    /* renamed from: d  reason: collision with root package name */
    private final sc f6117d;

    /* renamed from: e  reason: collision with root package name */
    private final q0 f6118e;

    /* renamed from: f  reason: collision with root package name */
    private final u1 f6119f;

    /* renamed from: g  reason: collision with root package name */
    private final DisplayMetrics f6120g;

    /* renamed from: h  reason: collision with root package name */
    private final float f6121h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6122i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6123j = false;

    /* renamed from: k  reason: collision with root package name */
    private mg f6124k;

    /* renamed from: l  reason: collision with root package name */
    private d f6125l;

    /* renamed from: m  reason: collision with root package name */
    private zh f6126m;
    private String n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private Boolean s;
    private int t;
    private boolean u = true;
    private boolean v = false;
    private String w = "";
    private bh x;
    private boolean y;
    private boolean z;

    private yg(yh yhVar, zh zhVar, String str, boolean z2, boolean z3, cx cxVar, sc scVar, x80 x80, q0 q0Var, u1 u1Var, r20 r20) {
        super(yhVar);
        this.f6115b = yhVar;
        this.f6126m = zhVar;
        this.n = str;
        this.q = z2;
        this.t = -1;
        this.f6116c = cxVar;
        this.f6117d = scVar;
        this.f6118e = q0Var;
        this.f6119f = u1Var;
        this.P = (WindowManager) getContext().getSystemService("window");
        x0.f();
        this.f6120g = u9.a(this.P);
        this.f6121h = this.f6120g.density;
        this.Q = r20;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            qc.b("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        x0.f().a(yhVar, scVar.f5529b, settings);
        x0.h().a(getContext(), settings);
        setDownloadListener(this);
        f();
        if (n.e()) {
            addJavascriptInterface(eh.a(this), "googleAdsJsInterface");
        }
        if (n.a()) {
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        }
        this.K = new ec(this.f6115b.a(), this, this, null);
        j();
        this.G = new w80(new x80(true, "make_wv", this.n));
        this.G.a().a(x80);
        this.E = q80.a(this.G.a());
        this.G.a("native:view_create", this.E);
        this.F = null;
        this.D = null;
        x0.h().b(yhVar);
        x0.j().j();
    }

    static yg a(Context context, zh zhVar, String str, boolean z2, boolean z3, cx cxVar, sc scVar, x80 x80, q0 q0Var, u1 u1Var, r20 r20) {
        return new yg(new yh(context), zhVar, str, z2, z3, cxVar, scVar, x80, q0Var, u1Var, r20);
    }

    private final synchronized Boolean a() {
        return this.s;
    }

    private final void a(Boolean bool) {
        synchronized (this) {
            this.s = bool;
        }
        x0.j().a(bool);
    }

    @TargetApi(19)
    private final synchronized void a(String str, ValueCallback<String> valueCallback) {
        if (!Y()) {
            evaluateJavascript(str, null);
        } else {
            qc.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    private final synchronized void b() {
        if (!this.J) {
            this.J = true;
            x0.j().k();
        }
    }

    private final void b(boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z2 ? "1" : "0");
        a("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void c(String str) {
        if (!Y()) {
            loadUrl(str);
        } else {
            qc.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    private final boolean c() {
        int i2;
        int i3;
        boolean z2 = false;
        if (!this.f6124k.j() && !this.f6124k.k()) {
            return false;
        }
        a50.b();
        DisplayMetrics displayMetrics = this.f6120g;
        int b2 = fc.b(displayMetrics, displayMetrics.widthPixels);
        a50.b();
        DisplayMetrics displayMetrics2 = this.f6120g;
        int b3 = fc.b(displayMetrics2, displayMetrics2.heightPixels);
        Activity a = this.f6115b.a();
        if (a == null || a.getWindow() == null) {
            i3 = b2;
            i2 = b3;
        } else {
            x0.f();
            int[] c2 = u9.c(a);
            a50.b();
            int b4 = fc.b(this.f6120g, c2[0]);
            a50.b();
            i2 = fc.b(this.f6120g, c2[1]);
            i3 = b4;
        }
        if (this.M == b2 && this.L == b3 && this.N == i3 && this.O == i2) {
            return false;
        }
        if (!(this.M == b2 && this.L == b3)) {
            z2 = true;
        }
        this.M = b2;
        this.L = b3;
        this.N = i3;
        this.O = i2;
        new n(this).a(b2, b3, i3, i2, this.f6120g.density, this.P.getDefaultDisplay().getRotation());
        return z2;
    }

    private final synchronized void d() {
        this.s = x0.j().e();
        if (this.s == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                a((Boolean) true);
            } catch (IllegalStateException unused) {
                a((Boolean) false);
            }
        }
    }

    private final synchronized void d(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e2) {
            x0.j().a(e2, "AdWebViewImpl.loadUrlUnsafe");
            qc.c("Could not call loadUrl. ", e2);
        }
    }

    private final void e() {
        q80.a(this.G.a(), this.E, "aeh2");
    }

    private final void e(String str) {
        if (n.g()) {
            if (a() == null) {
                d();
            }
            if (a().booleanValue()) {
                a(str, (ValueCallback<String>) null);
                return;
            }
            String valueOf = String.valueOf(str);
            c(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        String valueOf2 = String.valueOf(str);
        c(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    private final synchronized void f() {
        if (!this.q) {
            if (!this.f6126m.b()) {
                if (Build.VERSION.SDK_INT < 18) {
                    qc.b("Disabling hardware acceleration on an AdView.");
                    g();
                    return;
                }
                qc.b("Enabling hardware acceleration on an AdView.");
                h();
                return;
            }
        }
        qc.b("Enabling hardware acceleration on an overlay.");
        h();
    }

    private final synchronized void g() {
        if (!this.r) {
            x0.h().c(this);
        }
        this.r = true;
    }

    private final synchronized void h() {
        if (this.r) {
            x0.h().b((View) this);
        }
        this.r = false;
    }

    private final synchronized void i() {
    }

    private final void j() {
        x80 a;
        w80 w80 = this.G;
        if (w80 != null && (a = w80.a()) != null && x0.j().d() != null) {
            x0.j().d().a(a);
        }
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final synchronized String A0() {
        return this.w;
    }

    @Override // com.google.android.gms.ads.internal.q0
    public final synchronized void A1() {
        this.v = false;
        if (this.f6118e != null) {
            this.f6118e.A1();
        }
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final int B0() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.ads.internal.q0
    public final synchronized void B1() {
        this.v = true;
        if (this.f6118e != null) {
            this.f6118e.B1();
        }
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final int C0() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final v80 D0() {
        return this.E;
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final void E0() {
        d P2 = P();
        if (P2 != null) {
            P2.k2();
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final /* synthetic */ th M() {
        return this.f6124k;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void O() {
        l9.e("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized d P() {
        return this.f6125l;
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final w80 Q() {
        return this.G;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void R() {
        this.K.c();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void S() {
        l9.e("Destroying WebView!");
        b();
        u9.f5718h.post(new ah(this));
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void T() {
        e();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f6117d.f5529b);
        a("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void U() {
        if (this.D == null) {
            q80.a(this.G.a(), this.E, "aes2");
            this.D = q80.a(this.G.a());
            this.G.a("native:view_show", this.D);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f6117d.f5529b);
        a("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final WebViewClient V() {
        return this.f6124k;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized String W() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized boolean Y() {
        return this.p;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void Z() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void a(Context context) {
        this.f6115b.setBaseContext(context);
        this.K.a(this.f6115b.a());
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void a(c cVar) {
        this.f6124k.a(cVar);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void a(d dVar) {
        this.I = dVar;
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final synchronized void a(bh bhVar) {
        if (this.x != null) {
            qc.a("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.x = bhVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.q00
    public final void a(p00 p00) {
        synchronized (this) {
            this.y = p00.a;
        }
        b(p00.a);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void a(y90 y90) {
        this.A = y90;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void a(zh zhVar) {
        this.f6126m = zhVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void a(String str) {
        if (str == null) {
            str = "";
        }
        this.w = str;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void a(String str, e0<? super lg> e0Var) {
        mg mgVar = this.f6124k;
        if (mgVar != null) {
            mgVar.b(str, e0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void a(String str, o<e0<? super lg>> oVar) {
        mg mgVar = this.f6124k;
        if (mgVar != null) {
            mgVar.a(str, oVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void a(String str, String str2, String str3) {
        if (!Y()) {
            if (((Boolean) a50.g().a(k80.z0)).booleanValue()) {
                str2 = nh.a(str2, nh.a());
            }
            super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
            return;
        }
        qc.d("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void a(String str, Map<String, ?> map) {
        try {
            a(str, x0.f().a(map));
        } catch (JSONException unused) {
            qc.d("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        qc.b(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        e(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final void a(boolean z2) {
        this.f6124k.a(z2);
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void a(boolean z2, int i2) {
        this.f6124k.a(z2, i2);
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void a(boolean z2, int i2, String str) {
        this.f6124k.a(z2, i2, str);
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void a(boolean z2, int i2, String str, String str2) {
        this.f6124k.a(z2, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final Context a0() {
        return this.f6115b.b();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void b(d dVar) {
        this.f6125l = dVar;
    }

    @Override // com.google.android.gms.internal.ads.gg0
    public final void b(String str) {
        e(str);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void b(String str, e0<? super lg> e0Var) {
        mg mgVar = this.f6124k;
        if (mgVar != null) {
            mgVar.a(str, e0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.gg0
    public final void b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        e(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.hh, com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final Activity b0() {
        return this.f6115b.a();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void c(boolean z2) {
        if (this.f6125l != null) {
            this.f6125l.a(this.f6124k.j(), z2);
        } else {
            this.o = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized boolean c0() {
        return this.B > 0;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void d(boolean z2) {
        boolean z3 = z2 != this.q;
        this.q = z2;
        f();
        if (z3) {
            new n(this).c(z2 ? "expanded" : "default");
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void destroy() {
        j();
        this.K.d();
        if (this.f6125l != null) {
            this.f6125l.f2();
            this.f6125l.onDestroy();
            this.f6125l = null;
        }
        this.f6124k.a();
        if (!this.p) {
            x0.A();
            vf.a(this);
            i();
            this.p = true;
            l9.e("Initiating WebView self destruct sequence in 3...");
            l9.e("Loading blank page in WebView, 2...");
            d("about:blank");
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void e(int i2) {
        if (i2 == 0) {
            q80.a(this.G.a(), this.E, "aebb2");
        }
        e();
        if (this.G.a() != null) {
            this.G.a().a("close_type", String.valueOf(i2));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.f6117d.f5529b);
        a("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void e(boolean z2) {
        this.u = z2;
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.ih
    public final synchronized boolean e0() {
        return this.q;
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (Y()) {
            qc.f("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.p) {
                    this.f6124k.a();
                    x0.A();
                    vf.a(this);
                    i();
                    b();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void g(boolean z2) {
        this.B += z2 ? 1 : -1;
        if (this.B <= 0 && this.f6125l != null) {
            this.f6125l.l2();
        }
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.oh
    public final synchronized zh g0() {
        return this.f6126m;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final View.OnClickListener getOnClickListener() {
        return this.H.get();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized int getRequestedOrientation() {
        return this.t;
    }

    @Override // com.google.android.gms.internal.ads.sh, com.google.android.gms.internal.ads.lg
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final WebView getWebView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized y90 h0() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized boolean i0() {
        return this.v;
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.ph
    public final cx l0() {
        return this.f6116c;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!Y()) {
            super.loadData(str, str2, str3);
        } else {
            qc.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!Y()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            qc.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void loadUrl(String str) {
        if (!Y()) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
                x0.j().a(e2, "AdWebViewImpl.loadUrl");
                qc.c("Could not call loadUrl. ", e2);
            }
        } else {
            qc.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized d o0() {
        return this.I;
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!Y()) {
            this.K.a();
        }
        boolean z2 = this.y;
        if (this.f6124k != null && this.f6124k.k()) {
            if (!this.z) {
                ViewTreeObserver.OnGlobalLayoutListener l2 = this.f6124k.l();
                if (l2 != null) {
                    x0.B();
                    ee.a(this, l2);
                }
                ViewTreeObserver.OnScrollChangedListener m2 = this.f6124k.m();
                if (m2 != null) {
                    x0.B();
                    ee.a(this, m2);
                }
                this.z = true;
            }
            c();
            z2 = true;
        }
        b(z2);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!Y()) {
                this.K.b();
            }
            super.onDetachedFromWindow();
            if (this.z && this.f6124k != null && this.f6124k.k() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                ViewTreeObserver.OnGlobalLayoutListener l2 = this.f6124k.l();
                if (l2 != null) {
                    x0.h().a(getViewTreeObserver(), l2);
                }
                ViewTreeObserver.OnScrollChangedListener m2 = this.f6124k.m();
                if (m2 != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(m2);
                }
                this.z = false;
            }
        }
        b(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            x0.f();
            u9.a(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            qc.b(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!Y()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                mg mgVar = this.f6124k;
                if (mgVar != null && mgVar.n() != null) {
                    this.f6124k.n().a();
                }
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) a50.g().a(k80.w0)).booleanValue()) {
            float axisValue = motionEvent.getAxisValue(9);
            float axisValue2 = motionEvent.getAxisValue(10);
            if (motionEvent.getActionMasked() == 8) {
                if (axisValue > 0.0f && !canScrollVertically(-1)) {
                    return false;
                }
                if (axisValue < 0.0f && !canScrollVertically(1)) {
                    return false;
                }
                if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                    return false;
                }
                if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                    return false;
                }
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean c2 = c();
        d P2 = P();
        if (P2 != null && c2) {
            P2.j2();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0140, code lost:
        if (r2 != false) goto L_0x0144;
     */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 478
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yg.onMeasure(int, int):void");
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void onPause() {
        if (!Y()) {
            try {
                if (n.a()) {
                    super.onPause();
                }
            } catch (Exception e2) {
                qc.b("Could not pause webview.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void onResume() {
        if (!Y()) {
            try {
                if (n.a()) {
                    super.onResume();
                }
            } catch (Exception e2) {
                qc.b("Could not resume webview.", e2);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6124k.k()) {
            synchronized (this) {
                if (this.A != null) {
                    this.A.a(motionEvent);
                }
            }
        } else {
            cx cxVar = this.f6116c;
            if (cxVar != null) {
                cxVar.a(motionEvent);
            }
        }
        if (Y()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.rh, com.google.android.gms.internal.ads.kf
    public final sc p0() {
        return this.f6117d;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void r0() {
        if (this.F == null) {
            this.F = q80.a(this.G.a());
            this.G.a("native:view_load", this.F);
        }
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final synchronized bh s0() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.H = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void setRequestedOrientation(int i2) {
        this.t = i2;
        if (this.f6125l != null) {
            this.f6125l.setRequestedOrientation(this.t);
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof mg) {
            this.f6124k = (mg) webViewClient;
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void stopLoading() {
        if (!Y()) {
            try {
                super.stopLoading();
            } catch (Exception e2) {
                qc.b("Could not stop loading webview.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized boolean t0() {
        return this.u;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void v0() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(x0.E().b()));
        hashMap.put("app_volume", String.valueOf(x0.E().a()));
        hashMap.put("device_volume", String.valueOf(ma.a(getContext())));
        a("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final u1 x0() {
        return this.f6119f;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized boolean y0() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final bf z0() {
        return null;
    }
}
