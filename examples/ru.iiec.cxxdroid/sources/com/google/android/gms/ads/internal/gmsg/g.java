package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.l9;
import com.google.android.gms.internal.ads.qc;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class g implements e0<Object> {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, h> f3171b = new HashMap();

    public final void a(String str, h hVar) {
        synchronized (this.a) {
            this.f3171b.put(str, hVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        String str;
        String str2 = map.get("id");
        String str3 = map.get("fail");
        String str4 = map.get("fail_reason");
        String str5 = map.get("fail_stack");
        String str6 = map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.a) {
            h remove = this.f3171b.remove(str2);
            if (remove == null) {
                String valueOf2 = String.valueOf(str2);
                qc.d(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                remove.a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                remove.a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (l9.a()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        l9.e(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.a(jSONObject);
                } catch (JSONException e2) {
                    remove.a(e2.getMessage());
                }
            }
        }
    }
}
