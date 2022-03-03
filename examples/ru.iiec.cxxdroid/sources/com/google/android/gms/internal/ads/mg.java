package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c.h.l.b0;
import com.google.android.gms.ads.internal.gmsg.a;
import com.google.android.gms.ads.internal.gmsg.d;
import com.google.android.gms.ads.internal.gmsg.e;
import com.google.android.gms.ads.internal.gmsg.e0;
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
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@k2
public class mg extends WebViewClient implements th {
    private static final String[] B = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] C = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    private View.OnAttachStateChangeListener A;

    /* renamed from: b  reason: collision with root package name */
    private lg f4955b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, List<e0<? super lg>>> f4956c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f4957d;

    /* renamed from: e  reason: collision with root package name */
    private d40 f4958e;

    /* renamed from: f  reason: collision with root package name */
    private n f4959f;

    /* renamed from: g  reason: collision with root package name */
    private uh f4960g;

    /* renamed from: h  reason: collision with root package name */
    private vh f4961h;

    /* renamed from: i  reason: collision with root package name */
    private k f4962i;

    /* renamed from: j  reason: collision with root package name */
    private m f4963j;

    /* renamed from: k  reason: collision with root package name */
    private wh f4964k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4965l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f4966m;
    private boolean n;
    private ViewTreeObserver.OnGlobalLayoutListener o;
    private ViewTreeObserver.OnScrollChangedListener p;
    private boolean q;
    private t r;
    private final m s;
    private v1 t;
    private d u;
    private xh v;
    protected b8 w;
    private boolean x;
    private boolean y;
    private int z;

    public mg(lg lgVar, boolean z2) {
        this(lgVar, z2, new m(lgVar, lgVar.a0(), new v70(lgVar.getContext())), null);
    }

    private mg(lg lgVar, boolean z2, m mVar, d dVar) {
        this.f4956c = new HashMap<>();
        this.f4957d = new Object();
        this.f4965l = false;
        this.f4955b = lgVar;
        this.f4966m = z2;
        this.s = mVar;
        this.u = null;
    }

    private final void a(Context context, String str, String str2, String str3) {
        String str4;
        if (((Boolean) a50.g().a(k80.r1)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString("host", str4);
                    x0.f().a(context, this.f4955b.p0().f5529b, "gmob-apps", bundle, true);
                }
            }
            str4 = "";
            bundle.putString("host", str4);
            x0.f().a(context, this.f4955b.p0().f5529b, "gmob-apps", bundle, true);
        }
    }

    private final void a(Uri uri) {
        String path = uri.getPath();
        List<e0<? super lg>> list = this.f4956c.get(path);
        if (list != null) {
            x0.f();
            Map<String, String> a = u9.a(uri);
            if (qc.a(2)) {
                String valueOf = String.valueOf(path);
                l9.e(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
                for (String str : a.keySet()) {
                    String str2 = a.get(str);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length());
                    sb.append("  ");
                    sb.append(str);
                    sb.append(": ");
                    sb.append(str2);
                    l9.e(sb.toString());
                }
            }
            for (e0<? super lg> e0Var : list) {
                e0Var.zza(this.f4955b, a);
            }
            return;
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
        sb2.append("No GMSG handler found for GMSG: ");
        sb2.append(valueOf2);
        l9.e(sb2.toString());
    }

    /* access modifiers changed from: private */
    public final void a(View view, b8 b8Var, int i2) {
        if (b8Var.a() && i2 > 0) {
            b8Var.a(view);
            if (b8Var.a()) {
                u9.f5718h.postDelayed(new og(this, view, b8Var, i2), 100);
            }
        }
    }

    private final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        c cVar;
        d dVar = this.u;
        boolean a = dVar != null ? dVar.a() : false;
        x0.d();
        l.a(this.f4955b.getContext(), adOverlayInfoParcel, !a);
        if (this.w != null) {
            String str = adOverlayInfoParcel.f3266m;
            if (str == null && (cVar = adOverlayInfoParcel.f3255b) != null) {
                str = cVar.f3268c;
            }
            this.w.a(str);
        }
    }

    private final WebResourceResponse b(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    openConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    x0.f().a(this.f4955b.getContext(), this.f4955b.p0().f5529b, false, httpURLConnection);
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

    private final void p() {
        if (this.A != null) {
            this.f4955b.getView().removeOnAttachStateChangeListener(this.A);
        }
    }

    private final void q() {
        if (this.f4960g != null && ((this.x && this.z <= 0) || this.y)) {
            this.f4960g.a(!this.y);
            this.f4960g = null;
        }
        this.f4955b.r0();
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse a(String str, Map<String, String> map) {
        h20 a;
        try {
            String a2 = k8.a(str, this.f4955b.getContext());
            if (!a2.equals(str)) {
                return b(a2, map);
            }
            k20 b2 = k20.b(str);
            if (b2 != null && (a = x0.l().a(b2)) != null && a.t()) {
                return new WebResourceResponse("", "", a.u());
            }
            if (jc.a()) {
                if (((Boolean) a50.g().a(k80.g1)).booleanValue()) {
                    return b(str, map);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e2) {
            x0.j().a(e2, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    public final void a() {
        b8 b8Var = this.w;
        if (b8Var != null) {
            b8Var.c();
            this.w = null;
        }
        p();
        synchronized (this.f4957d) {
            this.f4956c.clear();
            this.f4958e = null;
            this.f4959f = null;
            this.f4960g = null;
            this.f4961h = null;
            this.f4962i = null;
            this.f4963j = null;
            this.f4965l = false;
            this.f4966m = false;
            this.n = false;
            this.q = false;
            this.r = null;
            this.f4964k = null;
            if (this.u != null) {
                this.u.a(true);
                this.u = null;
            }
        }
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
        synchronized (this.f4957d) {
            this.n = true;
            this.f4955b.R();
            this.o = onGlobalLayoutListener;
            this.p = onScrollChangedListener;
        }
    }

    public final void a(c cVar) {
        boolean e0 = this.f4955b.e0();
        a(new AdOverlayInfoParcel(cVar, (!e0 || this.f4955b.g0().b()) ? this.f4958e : null, e0 ? null : this.f4959f, this.r, this.f4955b.p0()));
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void a(d40 d40, k kVar, n nVar, m mVar, t tVar, boolean z2, i0 i0Var, v1 v1Var, o oVar, b8 b8Var) {
        v1 v1Var2 = v1Var == null ? new v1(this.f4955b.getContext(), b8Var, null) : v1Var;
        this.u = new d(this.f4955b, oVar);
        this.w = b8Var;
        if (((Boolean) a50.g().a(k80.D0)).booleanValue()) {
            a("/adMetadata", new a(kVar));
        }
        a("/appEvent", new com.google.android.gms.ads.internal.gmsg.l(mVar));
        a("/backButton", o.f3182j);
        a("/refresh", o.f3183k);
        a("/canOpenURLs", o.a);
        a("/canOpenIntents", o.f3174b);
        a("/click", o.f3175c);
        a("/close", o.f3176d);
        a("/customClose", o.f3177e);
        a("/instrument", o.n);
        a("/delayPageLoaded", o.p);
        a("/delayPageClosed", o.q);
        a("/getLocationInfo", o.r);
        a("/httpTrack", o.f3178f);
        a("/log", o.f3179g);
        a("/mraid", new d(v1Var2, this.u, oVar));
        a("/mraidLoaded", this.s);
        a("/open", new e(this.f4955b.getContext(), this.f4955b.p0(), this.f4955b.l0(), tVar, d40, kVar, mVar, nVar, v1Var2, this.u));
        a("/precache", new ag());
        a("/touch", o.f3181i);
        a("/video", o.f3184l);
        a("/videoMeta", o.f3185m);
        if (x0.C().d(this.f4955b.getContext())) {
            a("/logScionEvent", new com.google.android.gms.ads.internal.gmsg.c(this.f4955b.getContext()));
        }
        if (i0Var != null) {
            a("/setInterstitialProperties", new h0(i0Var));
        }
        this.f4958e = d40;
        this.f4959f = nVar;
        this.f4962i = kVar;
        this.f4963j = mVar;
        this.r = tVar;
        this.t = v1Var2;
        this.f4965l = z2;
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void a(uh uhVar) {
        this.f4960g = uhVar;
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void a(vh vhVar) {
        this.f4961h = vhVar;
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void a(wh whVar) {
        this.f4964k = whVar;
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void a(xh xhVar) {
        this.v = xhVar;
    }

    public final void a(String str, e0<? super lg> e0Var) {
        synchronized (this.f4957d) {
            List<e0<? super lg>> list = this.f4956c.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.f4956c.put(str, list);
            }
            list.add(e0Var);
        }
    }

    public final void a(String str, com.google.android.gms.common.util.o<e0<? super lg>> oVar) {
        synchronized (this.f4957d) {
            List<e0<? super lg>> list = this.f4956c.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (e0<? super lg> e0Var : list) {
                    if (oVar.a(e0Var)) {
                        arrayList.add(e0Var);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    public final void a(boolean z2) {
        this.f4965l = z2;
    }

    public final void a(boolean z2, int i2) {
        d40 d40 = (!this.f4955b.e0() || this.f4955b.g0().b()) ? this.f4958e : null;
        n nVar = this.f4959f;
        t tVar = this.r;
        lg lgVar = this.f4955b;
        a(new AdOverlayInfoParcel(d40, nVar, tVar, lgVar, z2, i2, lgVar.p0()));
    }

    public final void a(boolean z2, int i2, String str) {
        boolean e0 = this.f4955b.e0();
        d40 d40 = (!e0 || this.f4955b.g0().b()) ? this.f4958e : null;
        rg rgVar = e0 ? null : new rg(this.f4955b, this.f4959f);
        k kVar = this.f4962i;
        m mVar = this.f4963j;
        t tVar = this.r;
        lg lgVar = this.f4955b;
        a(new AdOverlayInfoParcel(d40, rgVar, kVar, mVar, tVar, lgVar, z2, i2, str, lgVar.p0()));
    }

    public final void a(boolean z2, int i2, String str, String str2) {
        boolean e0 = this.f4955b.e0();
        d40 d40 = (!e0 || this.f4955b.g0().b()) ? this.f4958e : null;
        rg rgVar = e0 ? null : new rg(this.f4955b, this.f4959f);
        k kVar = this.f4962i;
        m mVar = this.f4963j;
        t tVar = this.r;
        lg lgVar = this.f4955b;
        a(new AdOverlayInfoParcel(d40, rgVar, kVar, mVar, tVar, lgVar, z2, i2, str, str2, lgVar.p0()));
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void b() {
        synchronized (this.f4957d) {
            this.q = true;
        }
        this.z++;
        q();
    }

    public final void b(String str, e0<? super lg> e0Var) {
        synchronized (this.f4957d) {
            List<e0<? super lg>> list = this.f4956c.get(str);
            if (list != null) {
                list.remove(e0Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.th
    public final boolean c() {
        boolean z2;
        synchronized (this.f4957d) {
            z2 = this.q;
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void d() {
        this.y = true;
        q();
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void e() {
        b8 b8Var = this.w;
        if (b8Var != null) {
            WebView webView = this.f4955b.getWebView();
            if (b0.H(webView)) {
                a(webView, b8Var, 10);
                return;
            }
            p();
            this.A = new qg(this, b8Var);
            this.f4955b.getView().addOnAttachStateChangeListener(this.A);
        }
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void f() {
        synchronized (this.f4957d) {
            this.f4965l = false;
            this.f4966m = true;
            rd.a.execute(new ng(this));
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
        q();
    }

    @Override // com.google.android.gms.internal.ads.th
    public final boolean j() {
        boolean z2;
        synchronized (this.f4957d) {
            z2 = this.f4966m;
        }
        return z2;
    }

    public final boolean k() {
        boolean z2;
        synchronized (this.f4957d) {
            z2 = this.n;
        }
        return z2;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener l() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f4957d) {
            onGlobalLayoutListener = this.o;
        }
        return onGlobalLayoutListener;
    }

    public final ViewTreeObserver.OnScrollChangedListener m() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f4957d) {
            onScrollChangedListener = this.p;
        }
        return onScrollChangedListener;
    }

    public final xh n() {
        return this.v;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o() {
        this.f4955b.R();
        com.google.android.gms.ads.internal.overlay.d P = this.f4955b.P();
        if (P != null) {
            P.h2();
        }
        wh whVar = this.f4964k;
        if (whVar != null) {
            whVar.a();
            this.f4964k = null;
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        l9.e(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            a(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.a();
        r0.f4961h = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.x = true;
        r1 = r0.f4961h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f4957d
            monitor-enter(r1)
            com.google.android.gms.internal.ads.lg r2 = r0.f4955b     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.Y()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.internal.ads.l9.e(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.lg r2 = r0.f4955b     // Catch:{ all -> 0x0029 }
            r2.S()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.x = r1
            com.google.android.gms.internal.ads.vh r1 = r0.f4961h
            if (r1 == 0) goto L_0x0025
            r1.a()
            r1 = 0
            r0.f4961h = r1
        L_0x0025:
            r0.q()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mg.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        String str3;
        if (i2 < 0) {
            int i3 = (-i2) - 1;
            String[] strArr = B;
            if (i3 < strArr.length) {
                str3 = strArr[i3];
                a(this.f4955b.getContext(), "http_err", str3, str2);
                super.onReceivedError(webView, i2, str, str2);
            }
        }
        str3 = String.valueOf(i2);
        a(this.f4955b.getContext(), "http_err", str3, str2);
        super.onReceivedError(webView, i2, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError >= 0) {
                String[] strArr = C;
                if (primaryError < strArr.length) {
                    str = strArr[primaryError];
                    a(this.f4955b.getContext(), "ssl_err", str, x0.h().a(sslError));
                }
            }
            str = String.valueOf(primaryError);
            a(this.f4955b.getContext(), "ssl_err", str, x0.h().a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(str, Collections.emptyMap());
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        l9.e(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.f4965l && webView == this.f4955b.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    if (this.f4958e != null) {
                        if (((Boolean) a50.g().a(k80.h0)).booleanValue()) {
                            this.f4958e.d();
                            b8 b8Var = this.w;
                            if (b8Var != null) {
                                b8Var.a(str);
                            }
                            this.f4958e = null;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f4955b.getWebView().willNotDraw()) {
                try {
                    cx l0 = this.f4955b.l0();
                    if (l0 != null && l0.a(parse)) {
                        parse = l0.a(parse, this.f4955b.getContext(), this.f4955b.getView(), this.f4955b.b0());
                    }
                } catch (dx unused) {
                    String valueOf2 = String.valueOf(str);
                    qc.d(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                v1 v1Var = this.t;
                if (v1Var == null || v1Var.b()) {
                    a(new c("android.intent.action.VIEW", parse.toString(), null, null, null, null, null));
                } else {
                    this.t.a(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                qc.d(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            a(parse);
        }
        return true;
    }
}
