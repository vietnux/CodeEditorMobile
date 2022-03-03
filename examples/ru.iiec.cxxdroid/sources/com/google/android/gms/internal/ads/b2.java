package com.google.android.gms.internal.ads;

import org.json.JSONObject;

final class b2 implements xc<lg> {
    private final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JSONObject f3836b;

    b2(s1 s1Var, String str, JSONObject jSONObject) {
        this.a = str;
        this.f3836b = jSONObject;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.xc
    public final /* synthetic */ void a(lg lgVar) {
        lgVar.a(this.a, this.f3836b);
    }

    @Override // com.google.android.gms.internal.ads.xc
    public final void a(Throwable th) {
    }
}
