package com.google.android.gms.ads.internal.gmsg;

import android.os.Bundle;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.qc;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class a implements e0<Object> {
    private final k a;

    public a(k kVar) {
        this.a = kVar;
    }

    private static Bundle a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            Bundle bundle = new Bundle();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj != null) {
                    if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else {
                        String valueOf = String.valueOf(next);
                        qc.d(valueOf.length() != 0 ? "Unsupported type for key:".concat(valueOf) : new String("Unsupported type for key:"));
                    }
                }
            }
            return bundle;
        } catch (JSONException e2) {
            qc.b("Failed to convert ad metadata to JSON.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        if (this.a != null) {
            String str = map.get("name");
            if (str == null) {
                qc.c("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle a2 = a(map.get("info"));
            if (a2 == null) {
                qc.a("Failed to convert ad metadata to Bundle.");
            } else {
                this.a.d(str, a2);
            }
        }
    }
}
