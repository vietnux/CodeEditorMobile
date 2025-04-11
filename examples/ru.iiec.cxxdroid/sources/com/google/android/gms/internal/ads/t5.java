package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.x0;
import org.json.JSONObject;

@k2
public final class t5 implements w4 {
    private ih0<JSONObject, JSONObject> a;

    /* renamed from: b  reason: collision with root package name */
    private ih0<JSONObject, JSONObject> f5590b;

    public t5(Context context) {
        qh0 a2 = x0.t().a(context, sc.t());
        mh0<JSONObject> mh0 = nh0.f5099b;
        this.a = a2.a("google.afma.request.getAdDictionary", mh0, mh0);
        qh0 a3 = x0.t().a(context, sc.t());
        mh0<JSONObject> mh02 = nh0.f5099b;
        this.f5590b = a3.a("google.afma.sdkConstants.getSdkConstants", mh02, mh02);
    }

    @Override // com.google.android.gms.internal.ads.w4
    public final ih0<JSONObject, JSONObject> a() {
        return this.f5590b;
    }

    @Override // com.google.android.gms.internal.ads.w4
    public final ih0<JSONObject, JSONObject> b() {
        return this.a;
    }
}
