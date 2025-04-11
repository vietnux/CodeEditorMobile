package com.google.android.gms.internal.ads;

import org.json.JSONObject;

final /* synthetic */ class i1 implements vh {
    private final lg a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f4575b;

    i1(lg lgVar, JSONObject jSONObject) {
        this.a = lgVar;
        this.f4575b = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.vh
    public final void a() {
        this.a.b("google.afma.nativeAds.renderVideo", this.f4575b);
    }
}
