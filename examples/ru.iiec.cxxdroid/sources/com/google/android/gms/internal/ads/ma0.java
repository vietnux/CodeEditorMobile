package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class ma0 implements e0<Object> {
    private final /* synthetic */ o1 a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ha0 f4943b;

    ma0(ha0 ha0, o1 o1Var) {
        this.f4943b = ha0;
        this.a = o1Var;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            jSONObject.put("id", this.f4943b.f4505b);
            this.a.a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e2) {
            qc.b("Unable to dispatch sendMessageToNativeJs event", e2);
        }
    }
}
