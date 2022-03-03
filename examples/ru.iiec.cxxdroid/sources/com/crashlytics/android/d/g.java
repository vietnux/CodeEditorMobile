package com.crashlytics.android.d;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class g {
    g() {
    }

    public f a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new f(jSONObject.optString("url", null), jSONObject.optString("version_string", null), jSONObject.optString("display_version", null), jSONObject.optString("build_version", null), jSONObject.optString("identifier", null), jSONObject.optString("instance_identifier", null));
    }
}
