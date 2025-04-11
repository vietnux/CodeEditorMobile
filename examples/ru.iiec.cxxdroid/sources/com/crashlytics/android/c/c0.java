package com.crashlytics.android.c;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.TextUtils;
import f.a.a.a.n.d.a;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

class c0 implements a<a0> {
    c0() {
    }

    @TargetApi(9)
    public JSONObject a(a0 a0Var) {
        String str;
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            b0 b0Var = a0Var.a;
            jSONObject.put("appBundleId", b0Var.a);
            jSONObject.put("executionId", b0Var.f2811b);
            jSONObject.put("installationId", b0Var.f2812c);
            if (TextUtils.isEmpty(b0Var.f2814e)) {
                str = "androidId";
                str2 = b0Var.f2813d;
            } else {
                str = "advertisingId";
                str2 = b0Var.f2814e;
            }
            jSONObject.put(str, str2);
            jSONObject.put("limitAdTrackingEnabled", b0Var.f2815f);
            jSONObject.put("betaDeviceToken", b0Var.f2816g);
            jSONObject.put("buildId", b0Var.f2817h);
            jSONObject.put("osVersion", b0Var.f2818i);
            jSONObject.put("deviceModel", b0Var.f2819j);
            jSONObject.put("appVersionCode", b0Var.f2820k);
            jSONObject.put("appVersionName", b0Var.f2821l);
            jSONObject.put("timestamp", a0Var.f2787b);
            jSONObject.put("type", a0Var.f2788c.toString());
            if (a0Var.f2789d != null) {
                jSONObject.put("details", new JSONObject(a0Var.f2789d));
            }
            jSONObject.put("customType", a0Var.f2790e);
            if (a0Var.f2791f != null) {
                jSONObject.put("customAttributes", new JSONObject(a0Var.f2791f));
            }
            jSONObject.put("predefinedType", a0Var.f2792g);
            if (a0Var.f2793h != null) {
                jSONObject.put("predefinedAttributes", new JSONObject(a0Var.f2793h));
            }
            return jSONObject;
        } catch (JSONException e2) {
            if (Build.VERSION.SDK_INT >= 9) {
                throw new IOException(e2.getMessage(), e2);
            }
            throw new IOException(e2.getMessage());
        }
    }

    /* renamed from: b */
    public byte[] a(a0 a0Var) {
        return a(a0Var).toString().getBytes("UTF-8");
    }
}
