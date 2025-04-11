package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class jf {
    public jf(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        a(jSONObject, "aggressive_media_codec_release", k80.B);
        b(jSONObject, "byte_buffer_precache_limit", k80.f4799m);
        b(jSONObject, "exo_cache_buffer_size", k80.p);
        b(jSONObject, "exo_connect_timeout_millis", k80.f4795i);
        c(jSONObject, "exo_player_version", k80.f4794h);
        b(jSONObject, "exo_read_timeout_millis", k80.f4796j);
        b(jSONObject, "load_check_interval_bytes", k80.f4797k);
        b(jSONObject, "player_precache_limit", k80.f4798l);
        a(jSONObject, "use_cache_data_source", k80.G2);
    }

    private static boolean a(JSONObject jSONObject, String str, a80<Boolean> a80) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return ((Boolean) a50.g().a(a80)).booleanValue();
    }

    private static int b(JSONObject jSONObject, String str, a80<Integer> a80) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) a50.g().a(a80)).intValue();
    }

    private static String c(JSONObject jSONObject, String str, a80<String> a80) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) a50.g().a(a80);
    }
}
