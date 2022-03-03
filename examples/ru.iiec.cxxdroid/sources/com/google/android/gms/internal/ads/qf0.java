package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class qf0 {
    public static void a(pf0 pf0, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        pf0.b(sb.toString());
    }

    public static void a(pf0 pf0, String str, Map map) {
        try {
            pf0.a(str, x0.f().a(map));
        } catch (JSONException unused) {
            qc.d("Could not convert parameters to JSON.");
        }
    }

    public static void a(pf0 pf0, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        pf0.a(str, jSONObject.toString());
    }

    public static void b(pf0 pf0, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        qc.b(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        pf0.b(sb.toString());
    }
}
