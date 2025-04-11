package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@k2
public final class e5 {
    private final List<String> a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4176b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4177c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4178d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4179e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4180f;

    /* renamed from: g  reason: collision with root package name */
    private final String f4181g;

    /* renamed from: h  reason: collision with root package name */
    private String f4182h;

    /* renamed from: i  reason: collision with root package name */
    private final int f4183i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f4184j;

    public e5(int i2, Map<String, String> map) {
        this.f4182h = map.get("url");
        this.f4176b = map.get("base_uri");
        this.f4177c = map.get("post_parameters");
        this.f4179e = b(map.get("drt_include"));
        this.f4180f = map.get("request_id");
        this.f4178d = map.get("type");
        this.a = c(map.get("errors"));
        this.f4183i = i2;
        this.f4181g = map.get("fetched_ad");
        this.f4184j = b(map.get("render_test_ad_label"));
        new JSONObject();
    }

    public e5(JSONObject jSONObject) {
        this.f4182h = jSONObject.optString("url");
        this.f4176b = jSONObject.optString("base_uri");
        this.f4177c = jSONObject.optString("post_parameters");
        this.f4179e = b(jSONObject.optString("drt_include"));
        this.f4180f = jSONObject.optString("request_id");
        this.f4178d = jSONObject.optString("type");
        this.a = c(jSONObject.optString("errors"));
        this.f4183i = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f4181g = jSONObject.optString("fetched_ad");
        this.f4184j = jSONObject.optBoolean("render_test_ad_label");
        if (jSONObject.optJSONObject("preprocessor_flags") == null) {
            new JSONObject();
        }
    }

    private static boolean b(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }

    private static List<String> c(String str) {
        if (str == null) {
            return null;
        }
        return Arrays.asList(str.split(","));
    }

    public final int a() {
        return this.f4183i;
    }

    public final void a(String str) {
        this.f4182h = str;
    }

    public final String b() {
        return this.f4178d;
    }

    public final String c() {
        return this.f4182h;
    }

    public final List<String> d() {
        return this.a;
    }

    public final String e() {
        return this.f4176b;
    }

    public final String f() {
        return this.f4177c;
    }

    public final boolean g() {
        return this.f4179e;
    }

    public final String h() {
        return this.f4180f;
    }

    public final String i() {
        return this.f4181g;
    }

    public final boolean j() {
        return this.f4184j;
    }
}
