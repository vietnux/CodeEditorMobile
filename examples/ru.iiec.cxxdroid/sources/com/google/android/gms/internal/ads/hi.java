package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
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
import org.json.JSONObject;

@k2
final class hi extends mi implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, lg, pf0 {
    private boolean A;
    private y90 B;
    private int C;
    private int D;
    private v80 E;
    private v80 F;
    private v80 G;
    private w80 H;
    private WeakReference<View.OnClickListener> I;
    private d J;
    private ec K;
    private int L = -1;
    private int M = -1;
    private int N = -1;
    private int O = -1;
    private float P;
    private final WindowManager Q;

    /* renamed from: j  reason: collision with root package name */
    private final cx f4527j;

    /* renamed from: k  reason: collision with root package name */
    private final sc f4528k;

    /* renamed from: l  reason: collision with root package name */
    private final q0 f4529l;

    /* renamed from: m  reason: collision with root package name */
    private final u1 f4530m;
    private ai n;
    private d o;
    private zh p;
    private String q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private boolean v = true;
    private boolean w = false;
    private String x = "";
    private bh y;
    private boolean z;

    private hi(yh yhVar, zh zhVar, String str, boolean z2, boolean z3, cx cxVar, sc scVar, x80 x80, q0 q0Var, u1 u1Var, r20 r20) {
        super(yhVar);
        this.p = zhVar;
        this.q = str;
        this.s = z2;
        this.u = -1;
        this.f4527j = cxVar;
        this.f4528k = scVar;
        this.f4529l = q0Var;
        this.f4530m = u1Var;
        this.Q = (WindowManager) getContext().getSystemService("window");
        this.K = new ec(a().a(), this, this, null);
        x0.f().a(yhVar, scVar.f5529b, getSettings());
        setDownloadListener(this);
        this.P = a().getResources().getDisplayMetrics().density;
        e();
        if (n.e()) {
            addJavascriptInterface(eh.a(this), "googleAdsJsInterface");
        }
        i();
        this.H = new w80(new x80(true, "make_wv", this.q));
        this.H.a().a(x80);
        this.F = q80.a(this.H.a());
        this.H.a("native:view_create", this.F);
        this.G = null;
        this.E = null;
        x0.h().b(yhVar);
    }

    static hi a(Context context, zh zhVar, String str, boolean z2, boolean z3, cx cxVar, sc scVar, x80 x80, q0 q0Var, u1 u1Var, r20 r20) {
        return new hi(new yh(context), zhVar, str, z2, z3, cxVar, scVar, x80, q0Var, u1Var, r20);
    }

    private final boolean c() {
        int i2;
        int i3;
        boolean z2 = false;
        if (!this.n.j() && !this.n.m()) {
            return false;
        }
        x0.f();
        DisplayMetrics a = u9.a(this.Q);
        a50.b();
        int b2 = fc.b(a, a.widthPixels);
        a50.b();
        int b3 = fc.b(a, a.heightPixels);
        Activity a2 = a().a();
        if (a2 == null || a2.getWindow() == null) {
            i3 = b2;
            i2 = b3;
        } else {
            x0.f();
            int[] c2 = u9.c(a2);
            a50.b();
            i3 = fc.b(a, c2[0]);
            a50.b();
            i2 = fc.b(a, c2[1]);
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
        new n(this).a(b2, b3, i3, i2, a.density, this.Q.getDefaultDisplay().getRotation());
        return z2;
    }

    private final void d() {
        q80.a(this.H.a(), this.F, "aeh2");
    }

    private final synchronized void e() {
        if (!this.s) {
            if (!this.p.b()) {
                if (Build.VERSION.SDK_INT < 18) {
                    qc.b("Disabling hardware acceleration on an AdView.");
                    f();
                    return;
                }
                qc.b("Enabling hardware acceleration on an AdView.");
                g();
                return;
            }
        }
        qc.b("Enabling hardware acceleration on an overlay.");
        g();
    }

    private final synchronized void f() {
        if (!this.t) {
            x0.h().c(this);
        }
        this.t = true;
    }

    private final void f(boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z2 ? "1" : "0");
        qf0.a(this, "onAdVisibilityChanged", hashMap);
    }

    private final synchronized void g() {
        if (this.t) {
            x0.h().b((View) this);
        }
        this.t = false;
    }

    private final synchronized void h() {
    }

    private final void i() {
        x80 a;
        w80 w80 = this.H;
        if (w80 != null && (a = w80.a()) != null && x0.j().d() != null) {
            x0.j().d().a(a);
        }
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final synchronized String A0() {
        return this.x;
    }

    @Override // com.google.android.gms.ads.internal.q0
    public final synchronized void A1() {
        this.w = false;
        if (this.f4529l != null) {
            this.f4529l.A1();
        }
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final int B0() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.ads.internal.q0
    public final synchronized void B1() {
        this.w = true;
        if (this.f4529l != null) {
            this.f4529l.B1();
        }
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final int C0() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final v80 D0() {
        return this.F;
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
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void O() {
        l9.e("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized d P() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final w80 Q() {
        return this.H;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void R() {
        this.K.c();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void T() {
        d();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f4528k.f5529b);
        qf0.a(this, "onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void U() {
        if (this.E == null) {
            q80.a(this.H.a(), this.F, "aes2");
            this.E = q80.a(this.H.a());
            this.H.a("native:view_show", this.E);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f4528k.f5529b);
        qf0.a(this, "onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final WebViewClient V() {
        return this.f4719g;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized String W() {
        return this.q;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void Z() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void a(Context context) {
        a().setBaseContext(context);
        this.K.a(a().a());
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void a(c cVar) {
        this.n.a(cVar);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void a(d dVar) {
        this.J = dVar;
    }

    public final void a(ai aiVar) {
        this.n = aiVar;
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final synchronized void a(bh bhVar) {
        if (this.y != null) {
            qc.a("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.y = bhVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.q00
    public final void a(p00 p00) {
        synchronized (this) {
            this.z = p00.a;
        }
        f(p00.a);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void a(y90 y90) {
        this.B = y90;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void a(zh zhVar) {
        this.p = zhVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void a(String str) {
        if (str == null) {
            str = "";
        }
        this.x = str;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void a(String str, e0<? super lg> e0Var) {
        ai aiVar = this.n;
        if (aiVar != null) {
            aiVar.a(str, e0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void a(String str, o<e0<? super lg>> oVar) {
        ai aiVar = this.n;
        if (aiVar != null) {
            aiVar.a(str, oVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.pf0
    public final void a(String str, String str2) {
        qf0.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void a(String str, String str2, String str3) {
        if (((Boolean) a50.g().a(k80.z0)).booleanValue()) {
            str2 = nh.a(str2, nh.a());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void a(String str, Map map) {
        qf0.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.ff0, com.google.android.gms.internal.ads.pf0
    public final void a(String str, JSONObject jSONObject) {
        qf0.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final void a(boolean z2) {
        this.n.a(z2);
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void a(boolean z2, int i2) {
        this.n.a(z2, i2);
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void a(boolean z2, int i2, String str) {
        this.n.a(z2, i2, str);
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void a(boolean z2, int i2, String str, String str2) {
        this.n.a(z2, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final Context a0() {
        return a().b();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void b(d dVar) {
        this.o = dVar;
    }

    @Override // com.google.android.gms.internal.ads.gg0, com.google.android.gms.internal.ads.ji, com.google.android.gms.internal.ads.pf0
    public final synchronized void b(String str) {
        if (!Y()) {
            super.b(str);
        } else {
            qc.d("The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void b(String str, e0<? super lg> e0Var) {
        ai aiVar = this.n;
        if (aiVar != null) {
            aiVar.b(str, e0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.gg0
    public final void b(String str, JSONObject jSONObject) {
        qf0.a(this, str, jSONObject);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.mi
    public final synchronized void b(boolean z2) {
        if (!z2) {
            i();
            this.K.d();
            if (this.o != null) {
                this.o.f2();
                this.o.onDestroy();
                this.o = null;
            }
        }
        this.n.l();
        x0.A();
        vf.a(this);
        h();
    }

    @Override // com.google.android.gms.internal.ads.hh, com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final Activity b0() {
        return a().a();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void c(boolean z2) {
        if (this.o != null) {
            this.o.a(this.n.j(), z2);
        } else {
            this.r = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized boolean c0() {
        return this.C > 0;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void d(boolean z2) {
        boolean z3 = z2 != this.s;
        this.s = z2;
        e();
        if (z3) {
            new n(this).c(z2 ? "expanded" : "default");
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void e(int i2) {
        if (i2 == 0) {
            q80.a(this.H.a(), this.F, "aebb2");
        }
        d();
        if (this.H.a() != null) {
            this.H.a().a("close_type", String.valueOf(i2));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.f4528k.f5529b);
        qf0.a(this, "onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void e(boolean z2) {
        this.v = z2;
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.ih
    public final synchronized boolean e0() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void g(boolean z2) {
        this.C += z2 ? 1 : -1;
        if (this.C <= 0 && this.o != null) {
            this.o.l2();
        }
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.oh
    public final synchronized zh g0() {
        return this.p;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final View.OnClickListener getOnClickListener() {
        return this.I.get();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized int getRequestedOrientation() {
        return this.u;
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
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized boolean i0() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.ph
    public final cx l0() {
        return this.f4527j;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized d o0() {
        return this.J;
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!Y()) {
            this.K.a();
        }
        boolean z2 = this.z;
        if (this.n != null && this.n.m()) {
            if (!this.A) {
                ViewTreeObserver.OnGlobalLayoutListener n2 = this.n.n();
                if (n2 != null) {
                    x0.B();
                    ee.a(this, n2);
                }
                ViewTreeObserver.OnScrollChangedListener o2 = this.n.o();
                if (o2 != null) {
                    x0.B();
                    ee.a(this, o2);
                }
                this.A = true;
            }
            c();
            z2 = true;
        }
        f(z2);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!Y()) {
                this.K.b();
            }
            super.onDetachedFromWindow();
            if (this.A && this.n != null && this.n.m() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                ViewTreeObserver.OnGlobalLayoutListener n2 = this.n.n();
                if (n2 != null) {
                    x0.h().a(getViewTreeObserver(), n2);
                }
                ViewTreeObserver.OnScrollChangedListener o2 = this.n.o();
                if (o2 != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(o2);
                }
                this.A = false;
            }
        }
        f(false);
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
    @Override // com.google.android.gms.internal.ads.mi
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
            ai aiVar = this.n;
            if (aiVar != null && aiVar.p() != null) {
                this.n.p().a();
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
    @SuppressLint({"DrawAllocation"})
    public final synchronized void onMeasure(int i2, int i3) {
        if (Y()) {
            setMeasuredDimension(0, 0);
        } else if (isInEditMode() || this.s || this.p.c()) {
            super.onMeasure(i2, i3);
        } else if (this.p.d()) {
            bh s0 = s0();
            float L0 = s0 != null ? s0.L0() : 0.0f;
            if (L0 == 0.0f) {
                super.onMeasure(i2, i3);
                return;
            }
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i3);
            int i4 = (int) (((float) size2) * L0);
            int i5 = (int) (((float) size) / L0);
            if (size2 == 0 && i5 != 0) {
                i4 = (int) (((float) i5) * L0);
                size2 = i5;
            } else if (size == 0 && i4 != 0) {
                i5 = (int) (((float) i4) / L0);
                size = i4;
            }
            setMeasuredDimension(Math.min(i4, size), Math.min(i5, size2));
        } else if (this.p.a()) {
            if (((Boolean) a50.g().a(k80.l2)).booleanValue() || !n.e()) {
                super.onMeasure(i2, i3);
                return;
            }
            b("/contentHeight", new ii(this));
            b("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
            setMeasuredDimension(View.MeasureSpec.getSize(i2), this.D != -1 ? (int) (((float) this.D) * this.P) : View.MeasureSpec.getSize(i3));
        } else if (this.p.b()) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.Q.getDefaultDisplay().getMetrics(displayMetrics);
            setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
        } else {
            int mode = View.MeasureSpec.getMode(i2);
            int size3 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size4 = View.MeasureSpec.getSize(i3);
            int i6 = Integer.MAX_VALUE;
            int i7 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size3 : Integer.MAX_VALUE;
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i6 = size4;
            }
            boolean z2 = true;
            boolean z3 = this.p.f6211c > i7 || this.p.f6210b > i6;
            if (((Boolean) a50.g().a(k80.g3)).booleanValue()) {
                if (((float) this.p.f6211c) / this.P > ((float) i7) / this.P || ((float) this.p.f6210b) / this.P > ((float) i6) / this.P) {
                    z2 = false;
                }
                if (z3) {
                    z3 = z2;
                }
            }
            if (z3) {
                StringBuilder sb = new StringBuilder(103);
                sb.append("Not enough space to show ad. Needs ");
                sb.append((int) (((float) this.p.f6211c) / this.P));
                sb.append("x");
                sb.append((int) (((float) this.p.f6210b) / this.P));
                sb.append(" dp, but only has ");
                sb.append((int) (((float) size3) / this.P));
                sb.append("x");
                sb.append((int) (((float) size4) / this.P));
                sb.append(" dp.");
                qc.d(sb.toString());
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
                return;
            }
            if (getVisibility() != 8) {
                setVisibility(0);
            }
            setMeasuredDimension(this.p.f6211c, this.p.f6210b);
        }
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.mi
    public final void onPause() {
        try {
            if (n.a()) {
                super.onPause();
            }
        } catch (Exception e2) {
            qc.b("Could not pause webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.mi
    public final void onResume() {
        try {
            if (n.a()) {
                super.onResume();
            }
        } catch (Exception e2) {
            qc.b("Could not resume webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.n.m()) {
            synchronized (this) {
                if (this.B != null) {
                    this.B.a(motionEvent);
                }
            }
        } else {
            cx cxVar = this.f4527j;
            if (cxVar != null) {
                cxVar.a(motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.rh, com.google.android.gms.internal.ads.kf
    public final sc p0() {
        return this.f4528k;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void r0() {
        if (this.G == null) {
            this.G = q80.a(this.H.a());
            this.H.a("native:view_load", this.G);
        }
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final synchronized bh s0() {
        return this.y;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.I = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized void setRequestedOrientation(int i2) {
        this.u = i2;
        if (this.o != null) {
            this.o.setRequestedOrientation(this.u);
        }
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.mi
    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e2) {
            qc.b("Could not stop loading webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized boolean t0() {
        return this.v;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void v0() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(x0.E().b()));
        hashMap.put("app_volume", String.valueOf(x0.E().a()));
        hashMap.put("device_volume", String.valueOf(ma.a(getContext())));
        qf0.a(this, "volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.kf
    public final u1 x0() {
        return this.f4530m;
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final synchronized boolean y0() {
        return this.r;
    }

    @Override // com.google.android.gms.internal.ads.kf
    public final bf z0() {
        return null;
    }
}
