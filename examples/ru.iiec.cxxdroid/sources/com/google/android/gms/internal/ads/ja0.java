package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class ja0 implements uh {
    private final ia0 a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f4696b;

    /* renamed from: c  reason: collision with root package name */
    private final o1 f4697c;

    ja0(ia0 ia0, Map map, o1 o1Var) {
        this.a = ia0;
        this.f4696b = map;
        this.f4697c = o1Var;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final void a(boolean z) {
        ia0 ia0 = this.a;
        Map map = this.f4696b;
        o1 o1Var = this.f4697c;
        ia0.f4603b.f4505b = (String) map.get("id");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put("id", ia0.f4603b.f4505b);
            o1Var.a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e2) {
            qc.b("Unable to dispatch sendMessageToNativeJs event", e2);
        }
    }
}
