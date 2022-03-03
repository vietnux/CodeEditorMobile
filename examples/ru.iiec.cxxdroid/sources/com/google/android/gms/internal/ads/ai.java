package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import c.h.l.b0;
import com.google.android.gms.ads.internal.gmsg.a;
import com.google.android.gms.ads.internal.gmsg.d;
import com.google.android.gms.ads.internal.gmsg.e;
import com.google.android.gms.ads.internal.gmsg.h0;
import com.google.android.gms.ads.internal.gmsg.i0;
import com.google.android.gms.ads.internal.gmsg.k;
import com.google.android.gms.ads.internal.gmsg.m;
import com.google.android.gms.ads.internal.gmsg.o;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.l;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.v1;
import com.google.android.gms.ads.internal.x0;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

@k2
public final class ai extends tf0<lg> implements th, oi, qi, si, ti {
    private View.OnAttachStateChangeListener A;

    /* renamed from: c  reason: collision with root package name */
    private lg f3796c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f3797d;

    /* renamed from: e  reason: collision with root package name */
    private d40 f3798e;

    /* renamed from: f  reason: collision with root package name */
    private n f3799f;

    /* renamed from: g  reason: collision with root package name */
    private uh f3800g;

    /* renamed from: h  reason: collision with root package name */
    private vh f3801h;

    /* renamed from: i  reason: collision with root package name */
    private k f3802i;

    /* renamed from: j  reason: collision with root package name */
    private m f3803j;

    /* renamed from: k  reason: collision with root package name */
    private wh f3804k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f3805l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3806m;
    private boolean n;
    private ViewTreeObserver.OnGlobalLayoutListener o;
    private ViewTreeObserver.OnScrollChangedListener p;
    private boolean q;
    private t r;
    private final m s;
    private v1 t;
    private d u;
    private xh v;
    private b8 w;
    private boolean x;
    private boolean y;
    private int z;

    public ai(lg lgVar, boolean z2) {
        this(lgVar, z2, new m(lgVar, lgVar.a0(), new v70(lgVar.getContext())), null);
    }

    private ai(lg lgVar, boolean z2, m mVar, d dVar) {
        this.f3797d = new Object();
        this.f3805l = false;
        this.f3796c = lgVar;
        this.f3806m = z2;
        this.s = mVar;
        this.u = null;
    }

    /* access modifiers changed from: private */
    public final void a(View view, b8 b8Var, int i2) {
        if (b8Var.a() && i2 > 0) {
            b8Var.a(view);
            if (b8Var.a()) {
                u9.f5718h.postDelayed(new ci(this, view, b8Var, i2), 100);
            }
        }
    }

    private final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        c cVar;
        d dVar = this.u;
        boolean a = dVar != null ? dVar.a() : false;
        x0.d();
        l.a(this.f3796c.getContext(), adOverlayInfoParcel, !a);
        if (this.w != null) {
            String str = adOverlayInfoParcel.f3266m;
            if (str == null && (cVar = adOverlayInfoParcel.f3255b) != null) {
                str = cVar.f3268c;
            }
            this.w.a(str);
        }
    }

    private final WebResourceResponse e(li liVar) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(liVar.a);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry<String, String> entry : liVar.f4887c.entrySet()) {
                    openConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    x0.f().a(this.f3796c.getContext(), this.f3796c.p0().f5529b, false, httpURLConnection);
                    jc jcVar = new jc();
                    jcVar.a(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    jcVar.a(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        x0.f();
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                qc.d("Protocol is null");
                                return null;
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                String valueOf = String.valueOf(headerField);
                                qc.b(valueOf.length() != 0 ? "Redirecting to ".concat(valueOf) : new String("Redirecting to "));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String valueOf2 = String.valueOf(protocol);
                                qc.d(valueOf2.length() != 0 ? "Unsupported scheme: ".concat(valueOf2) : new String("Unsupported scheme: "));
                                return null;
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        x0.f();
        return u9.a(httpURLConnection);
    }

    private final void r() {
        if (this.A != null) {
            this.f3796c.getView().removeOnAttachStateChangeListener(this.A);
        }
    }

    private final void s() {
        if (this.f3800g != null && ((this.x && this.z <= 0) || this.y)) {
            this.f3800g.a(!this.y);
            this.f3800g = null;
        }
        this.f3796c.r0();
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void a(int i2, int i3) {
        d dVar = this.u;
        if (dVar != null) {
            dVar.a(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void a(int i2, int i3, boolean z2) {
        this.s.a(i2, i3);
        d dVar = this.u;
        if (dVar != null) {
            dVar.a(i2, i3, z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f3797d) {
            this.n = true;
            this.f3796c.R();
            this.o = onGlobalLayoutListener;
            this.p = onScrollChangedListener;
        }
    }

    public final void a(c cVar) {
        boolean e0 = this.f3796c.e0();
        a(new AdOverlayInfoParcel(cVar, (!e0 || this.f3796c.g0().b()) ? this.f3798e : null, e0 ? null : this.f3799f, this.r, this.f3796c.p0()));
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void a(d40 d40, k kVar, n nVar, m mVar, t tVar, boolean z2, i0 i0Var, v1 v1Var, o oVar, b8 b8Var) {
        v1 v1Var2 = v1Var == null ? new v1(this.f3796c.getContext(), b8Var, null) : v1Var;
        this.u = new d(this.f3796c, oVar);
        this.w = b8Var;
        if (((Boolean) a50.g().a(k80.D0)).booleanValue()) {
            b("/adMetadata", new a(kVar));
        }
        b("/appEvent", new com.google.android.gms.ads.internal.gmsg.l(mVar));
        b("/backButton", o.f3182j);
        b("/refresh", o.f3183k);
        b("/canOpenURLs", o.a);
        b("/canOpenIntents", o.f3174b);
        b("/click", o.f3175c);
        b("/close", o.f3176d);
        b("/customClose", o.f3177e);
        b("/instrument", o.n);
        b("/delayPageLoaded", o.p);
        b("/delayPageClosed", o.q);
        b("/getLocationInfo", o.r);
        b("/httpTrack", o.f3178f);
        b("/log", o.f3179g);
        b("/mraid", new d(v1Var2, this.u, oVar));
        b("/mraidLoaded", this.s);
        b("/open", new e(this.f3796c.getContext(), this.f3796c.p0(), this.f3796c.l0(), tVar, d40, kVar, mVar, nVar, v1Var2, this.u));
        b("/precache", new ag());
        b("/touch", o.f3181i);
        b("/video", o.f3184l);
        b("/videoMeta", o.f3185m);
        if (x0.C().d(this.f3796c.getContext())) {
            b("/logScionEvent", new com.google.android.gms.ads.internal.gmsg.c(this.f3796c.getContext()));
        }
        if (i0Var != null) {
            b("/setInterstitialProperties", new h0(i0Var));
        }
        this.f3798e = d40;
        this.f3799f = nVar;
        this.f3802i = kVar;
        this.f3803j = mVar;
        this.r = tVar;
        this.t = v1Var2;
        this.f3805l = z2;
    }

    @Override // com.google.android.gms.internal.ads.qi
    public final void a(li liVar) {
        a(liVar.f4886b);
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void a(uh uhVar) {
        this.f3800g = uhVar;
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void a(vh vhVar) {
        this.f3801h = vhVar;
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void a(wh whVar) {
        this.f3804k = whVar;
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void a(xh xhVar) {
        this.v = xhVar;
    }

    public final void a(boolean z2) {
        this.f3805l = z2;
    }

    public final void a(boolean z2, int i2) {
        d40 d40 = (!this.f3796c.e0() || this.f3796c.g0().b()) ? this.f3798e : null;
        n nVar = this.f3799f;
        t tVar = this.r;
        lg lgVar = this.f3796c;
        a(new AdOverlayInfoParcel(d40, nVar, tVar, lgVar, z2, i2, lgVar.p0()));
    }

    public final void a(boolean z2, int i2, String str) {
        boolean e0 = this.f3796c.e0();
        d40 d40 = (!e0 || this.f3796c.g0().b()) ? this.f3798e : null;
        ei eiVar = e0 ? null : new ei(this.f3796c, this.f3799f);
        k kVar = this.f3802i;
        m mVar = this.f3803j;
        t tVar = this.r;
        lg lgVar = this.f3796c;
        a(new AdOverlayInfoParcel(d40, eiVar, kVar, mVar, tVar, lgVar, z2, i2, str, lgVar.p0()));
    }

    public final void a(boolean z2, int i2, String str, String str2) {
        boolean e0 = this.f3796c.e0();
        d40 d40 = (!e0 || this.f3796c.g0().b()) ? this.f3798e : null;
        ei eiVar = e0 ? null : new ei(this.f3796c, this.f3799f);
        k kVar = this.f3802i;
        m mVar = this.f3803j;
        t tVar = this.r;
        lg lgVar = this.f3796c;
        a(new AdOverlayInfoParcel(d40, eiVar, kVar, mVar, tVar, lgVar, z2, i2, str, str2, lgVar.p0()));
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void b() {
        synchronized (this.f3797d) {
            this.q = true;
        }
        this.z++;
        s();
    }

    @Override // com.google.android.gms.internal.ads.oi
    public final boolean b(li liVar) {
        String valueOf = String.valueOf(liVar.a);
        l9.e(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uri = liVar.f4886b;
        if (a(uri)) {
            return true;
        }
        if (this.f3805l) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                if (this.f3798e != null) {
                    if (((Boolean) a50.g().a(k80.h0)).booleanValue()) {
                        this.f3798e.d();
                        b8 b8Var = this.w;
                        if (b8Var != null) {
                            b8Var.a(liVar.a);
                        }
                        this.f3798e = null;
                    }
                }
                return false;
            }
        }
        if (!this.f3796c.getWebView().willNotDraw()) {
            try {
                cx l0 = this.f3796c.l0();
                if (l0 != null && l0.a(uri)) {
                    uri = l0.a(uri, this.f3796c.getContext(), this.f3796c.getView(), this.f3796c.b0());
                }
            } catch (dx unused) {
                String valueOf2 = String.valueOf(liVar.a);
                qc.d(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
            }
            v1 v1Var = this.t;
            if (v1Var == null || v1Var.b()) {
                a(new c("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            } else {
                this.t.a(liVar.a);
            }
        } else {
            String valueOf3 = String.valueOf(liVar.a);
            qc.d(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.si
    public final void c(li liVar) {
        this.x = true;
        vh vhVar = this.f3801h;
        if (vhVar != null) {
            vhVar.a();
            this.f3801h = null;
        }
        s();
    }

    @Override // com.google.android.gms.internal.ads.th
    public final boolean c() {
        boolean z2;
        synchronized (this.f3797d) {
            z2 = this.q;
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.ti
    public final WebResourceResponse d(li liVar) {
        WebResourceResponse webResourceResponse;
        h20 a;
        b8 b8Var = this.w;
        if (b8Var != null) {
            b8Var.a(liVar.a, liVar.f4887c, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(liVar.a).getName())) {
            webResourceResponse = null;
        } else {
            f();
            String str = (String) a50.g().a(this.f3796c.g0().b() ? k80.K : this.f3796c.e0() ? k80.J : k80.I);
            x0.f();
            webResourceResponse = u9.c(this.f3796c.getContext(), this.f3796c.p0().f5529b, str);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!k8.a(liVar.a, this.f3796c.getContext()).equals(liVar.a)) {
                return e(liVar);
            }
            k20 b2 = k20.b(liVar.a);
            if (b2 != null && (a = x0.l().a(b2)) != null && a.t()) {
                return new WebResourceResponse("", "", a.u());
            }
            if (jc.a()) {
                if (((Boolean) a50.g().a(k80.g1)).booleanValue()) {
                    return e(liVar);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e2) {
            x0.j().a(e2, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void d() {
        this.y = true;
        s();
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void e() {
        b8 b8Var = this.w;
        if (b8Var != null) {
            WebView webView = this.f3796c.getWebView();
            if (b0.H(webView)) {
                a(webView, b8Var, 10);
                return;
            }
            r();
            this.A = new di(this, b8Var);
            this.f3796c.getView().addOnAttachStateChangeListener(this.A);
        }
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void f() {
        synchronized (this.f3797d) {
            this.f3805l = false;
            this.f3806m = true;
            rd.a.execute(new bi(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.th
    public final b8 g() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.th
    public final v1 h() {
        return this.t;
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void i() {
        this.z--;
        s();
    }

    @Override // com.google.android.gms.internal.ads.th
    public final boolean j() {
        boolean z2;
        synchronized (this.f3797d) {
            z2 = this.f3806m;
        }
        return z2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.tf0
    public final /* synthetic */ lg k() {
        return this.f3796c;
    }

    @Override // com.google.android.gms.internal.ads.tf0
    public final void l() {
        b8 b8Var = this.w;
        if (b8Var != null) {
            b8Var.c();
            this.w = null;
        }
        r();
        super.l();
        synchronized (this.f3797d) {
            this.f3798e = null;
            this.f3799f = null;
            this.f3800g = null;
            this.f3801h = null;
            this.f3802i = null;
            this.f3803j = null;
            this.f3805l = false;
            this.f3806m = false;
            this.n = false;
            this.q = false;
            this.r = null;
            this.f3804k = null;
            if (this.u != null) {
                this.u.a(true);
                this.u = null;
            }
        }
    }

    public final boolean m() {
        boolean z2;
        synchronized (this.f3797d) {
            z2 = this.n;
        }
        return z2;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener n() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f3797d) {
            onGlobalLayoutListener = this.o;
        }
        return onGlobalLayoutListener;
    }

    public final ViewTreeObserver.OnScrollChangedListener o() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f3797d) {
            onScrollChangedListener = this.p;
        }
        return onScrollChangedListener;
    }

    public final xh p() {
        return this.v;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q() {
        this.f3796c.R();
        com.google.android.gms.ads.internal.overlay.d P = this.f3796c.P();
        if (P != null) {
            P.h2();
        }
        wh whVar = this.f3804k;
        if (whVar != null) {
            whVar.a();
            this.f3804k = null;
        }
    }
}
