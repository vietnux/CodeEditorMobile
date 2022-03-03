package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.a60;
import com.google.android.gms.internal.ads.cx;
import com.google.android.gms.internal.ads.d0;
import com.google.android.gms.internal.ads.d50;
import com.google.android.gms.internal.ads.dx;
import com.google.android.gms.internal.ads.e90;
import com.google.android.gms.internal.ads.fc;
import com.google.android.gms.internal.ads.g50;
import com.google.android.gms.internal.ads.g60;
import com.google.android.gms.internal.ads.j40;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.l6;
import com.google.android.gms.internal.ads.n40;
import com.google.android.gms.internal.ads.o60;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.s50;
import com.google.android.gms.internal.ads.s9;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.t70;
import com.google.android.gms.internal.ads.u60;
import com.google.android.gms.internal.ads.w50;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.util.Map;
import java.util.concurrent.Future;

@k2
public final class r0 extends s50 {

    /* renamed from: b  reason: collision with root package name */
    private final sc f3321b;

    /* renamed from: c  reason: collision with root package name */
    private final n40 f3322c;

    /* renamed from: d  reason: collision with root package name */
    private final Future<cx> f3323d = s9.a(new u0(this));

    /* renamed from: e  reason: collision with root package name */
    private final Context f3324e;

    /* renamed from: f  reason: collision with root package name */
    private final w0 f3325f;

    /* renamed from: g  reason: collision with root package name */
    private WebView f3326g = new WebView(this.f3324e);

    /* renamed from: h  reason: collision with root package name */
    private g50 f3327h;

    /* renamed from: i  reason: collision with root package name */
    private cx f3328i;

    /* renamed from: j  reason: collision with root package name */
    private AsyncTask<Void, Void, String> f3329j;

    public r0(Context context, n40 n40, String str, sc scVar) {
        this.f3324e = context;
        this.f3321b = scVar;
        this.f3322c = n40;
        this.f3325f = new w0(str);
        h(0);
        this.f3326g.setVerticalScrollBarEnabled(false);
        this.f3326g.getSettings().setJavaScriptEnabled(true);
        this.f3326g.setWebViewClient(new s0(this));
        this.f3326g.setOnTouchListener(new t0(this));
    }

    /* access modifiers changed from: private */
    public final String p(String str) {
        if (this.f3328i == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.f3328i.a(parse, this.f3324e, null, null);
        } catch (dx e2) {
            qc.c("Unable to process ad data", e2);
        }
        return parse.toString();
    }

    /* access modifiers changed from: private */
    public final void q(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f3324e.startActivity(intent);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final n40 B0() {
        return this.f3322c;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void E() {
        y.a("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final boolean N() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final a60 P0() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final a T0() {
        y.a("getAdFrame must be called on the main UI thread.");
        return b.a(this.f3326g);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(a60 a60) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(d0 d0Var, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(d50 d50) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(e90 e90) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(l6 l6Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(n40 n40) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(t70 t70) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(u60 u60) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(w50 w50) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(com.google.android.gms.internal.ads.y yVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void b(g50 g50) {
        this.f3327h = g50;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void b(g60 g60) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void b(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final boolean b(j40 j40) {
        y.a(this.f3326g, "This Search Ad has already been torn down");
        this.f3325f.a(j40, this.f3321b);
        this.f3329j = new v0(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void destroy() {
        y.a("destroy must be called on the main UI thread.");
        this.f3329j.cancel(true);
        this.f3323d.cancel(true);
        this.f3326g.destroy();
        this.f3326g = null;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final g50 f1() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    /* access modifiers changed from: package-private */
    public final String f2() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) a50.g().a(k80.w2));
        builder.appendQueryParameter("query", this.f3325f.a());
        builder.appendQueryParameter("pubId", this.f3325f.c());
        Map<String, String> d2 = this.f3325f.d();
        for (String str : d2.keySet()) {
            builder.appendQueryParameter(str, d2.get(str));
        }
        Uri build = builder.build();
        cx cxVar = this.f3328i;
        if (cxVar != null) {
            try {
                build = cxVar.a(build, this.f3324e);
            } catch (dx e2) {
                qc.c("Unable to process ad data", e2);
            }
        }
        String g2 = g2();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(g2).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(g2);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String g2() {
        String b2 = this.f3325f.b();
        if (TextUtils.isEmpty(b2)) {
            b2 = "www.google.com";
        }
        String str = (String) a50.g().a(k80.w2);
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(b2);
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final o60 getVideoController() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void h(int i2) {
        if (this.f3326g != null) {
            this.f3326g.setLayoutParams(new ViewGroup.LayoutParams(-1, i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void i(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final String k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final String k0() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void k1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final String m0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final boolean m1() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int o(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            a50.b();
            return fc.a(this.f3324e, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final Bundle q0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void showInterstitial() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void stopLoading() {
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void y() {
        y.a("pause must be called on the main UI thread.");
    }
}
