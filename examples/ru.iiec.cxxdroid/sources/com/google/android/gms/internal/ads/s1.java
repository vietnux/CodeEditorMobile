package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.e0;
import com.google.android.gms.ads.internal.gmsg.c;
import com.google.android.gms.ads.internal.v1;
import com.google.android.gms.ads.internal.x0;
import org.json.JSONObject;

@k2
public final class s1 implements o1<lg> {
    private ld<lg> a;

    /* renamed from: b  reason: collision with root package name */
    private final c f5488b = new c(this.f5490d);

    /* renamed from: c  reason: collision with root package name */
    private final ga0 f5489c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f5490d;

    /* renamed from: e  reason: collision with root package name */
    private final sc f5491e;

    /* renamed from: f  reason: collision with root package name */
    private final e0 f5492f;

    /* renamed from: g  reason: collision with root package name */
    private final cx f5493g;

    /* renamed from: h  reason: collision with root package name */
    private String f5494h;

    public s1(Context context, e0 e0Var, String str, cx cxVar, sc scVar) {
        qc.c("Webview loading for native ads.");
        this.f5490d = context;
        this.f5492f = e0Var;
        this.f5493g = cxVar;
        this.f5491e = scVar;
        this.f5494h = str;
        x0.g();
        ld<lg> a2 = sg.a(this.f5490d, this.f5491e, (String) a50.g().a(k80.W1), this.f5493g, this.f5492f.x0());
        this.f5489c = new ga0(e0Var, str);
        this.a = ad.a(a2, new t1(this), rd.f5433b);
        yc.a(this.a, "WebViewNativeAdsUtil.constructor");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ld a(lg lgVar) {
        qc.c("Javascript has loaded for native ads.");
        th M = lgVar.M();
        e0 e0Var = this.f5492f;
        M.a(e0Var, e0Var, e0Var, e0Var, e0Var, false, null, new v1(this.f5490d, null, null), null, null);
        lgVar.b("/logScionEvent", this.f5488b);
        lgVar.b("/logScionEvent", this.f5489c);
        return ad.a(lgVar);
    }

    @Override // com.google.android.gms.internal.ads.o1
    public final ld<JSONObject> a(JSONObject jSONObject) {
        return ad.a(this.a, new v1(this, jSONObject), rd.a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ld a(JSONObject jSONObject, lg lgVar) {
        jSONObject.put("ads_id", this.f5494h);
        lgVar.b("google.afma.nativeAds.handleDownloadedImpressionPing", jSONObject);
        return ad.a(new JSONObject());
    }

    @Override // com.google.android.gms.internal.ads.o1
    public final void a() {
        ad.a(this.a, new d2(this), rd.a);
    }

    @Override // com.google.android.gms.internal.ads.o1
    public final void a(String str, com.google.android.gms.ads.internal.gmsg.e0<? super lg> e0Var) {
        ad.a(this.a, new a2(this, str, e0Var), rd.a);
    }

    @Override // com.google.android.gms.internal.ads.o1
    public final void a(String str, JSONObject jSONObject) {
        ad.a(this.a, new b2(this, str, jSONObject), rd.a);
    }

    @Override // com.google.android.gms.internal.ads.o1
    public final ld<JSONObject> b(JSONObject jSONObject) {
        return ad.a(this.a, new u1(this, jSONObject), rd.a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ld b(JSONObject jSONObject, lg lgVar) {
        jSONObject.put("ads_id", this.f5494h);
        lgVar.b("google.afma.nativeAds.handleImpressionPing", jSONObject);
        return ad.a(new JSONObject());
    }

    @Override // com.google.android.gms.internal.ads.o1
    public final void b(String str, com.google.android.gms.ads.internal.gmsg.e0<? super lg> e0Var) {
        ad.a(this.a, new z1(this, str, e0Var), rd.a);
    }

    @Override // com.google.android.gms.internal.ads.o1
    public final ld<JSONObject> c(JSONObject jSONObject) {
        return ad.a(this.a, new x1(this, jSONObject), rd.a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ld c(JSONObject jSONObject, lg lgVar) {
        jSONObject.put("ads_id", this.f5494h);
        lgVar.b("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return ad.a(new JSONObject());
    }

    @Override // com.google.android.gms.internal.ads.o1
    public final ld<JSONObject> d(JSONObject jSONObject) {
        return ad.a(this.a, new w1(this, jSONObject), rd.a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ld d(JSONObject jSONObject, lg lgVar) {
        jSONObject.put("ads_id", this.f5494h);
        wd wdVar = new wd();
        lgVar.b("/nativeAdPreProcess", new y1(this, lgVar, wdVar));
        lgVar.b("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return wdVar;
    }
}
