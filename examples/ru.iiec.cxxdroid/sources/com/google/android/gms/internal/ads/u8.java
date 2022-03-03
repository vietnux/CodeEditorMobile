package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class u8 {
    private final long a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f5712b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f5713c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, bi0> f5714d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private String f5715e;

    /* renamed from: f  reason: collision with root package name */
    private String f5716f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5717g;

    public u8(String str, long j2) {
        JSONObject optJSONObject;
        this.f5717g = false;
        this.f5716f = str;
        this.a = j2;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt("status", -1) != 1) {
                    this.f5717g = false;
                    qc.d("App settings could not be fetched successfully.");
                    return;
                }
                this.f5717g = true;
                this.f5715e = jSONObject.optString("app_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f5713c.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString) && (optJSONObject = jSONObject2.optJSONObject("mediation_config")) != null) {
                                    this.f5714d.put(optString2, new bi0(optJSONObject));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray2 != null) {
                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                        this.f5712b.add(optJSONArray2.optString(i3));
                    }
                }
            } catch (JSONException e2) {
                qc.c("Exception occurred while processing app setting json", e2);
                x0.j().a(e2, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    public final long a() {
        return this.a;
    }

    public final boolean b() {
        return this.f5717g;
    }

    public final String c() {
        return this.f5716f;
    }

    public final String d() {
        return this.f5715e;
    }

    public final Map<String, bi0> e() {
        return this.f5714d;
    }
}
