package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@k2
public final class ai0 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3807b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f3808c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3809d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3810e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f3811f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f3812g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f3813h;

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f3814i;

    /* renamed from: j  reason: collision with root package name */
    public final List<String> f3815j;

    /* renamed from: k  reason: collision with root package name */
    public final String f3816k;

    /* renamed from: l  reason: collision with root package name */
    public final List<String> f3817l;

    /* renamed from: m  reason: collision with root package name */
    public final List<String> f3818m;
    public final List<String> n;
    public final String o;
    public final String p;
    public final String q;
    public final List<String> r;
    public final String s;
    private final String t;
    public final long u;

    public ai0(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str5, String str6, List<String> list6, List<String> list7, List<String> list8, String str7, String str8, String str9, List<String> list9, String str10, List<String> list10, String str11, long j2) {
        this.a = str;
        this.f3807b = null;
        this.f3808c = list;
        this.f3809d = null;
        this.f3810e = null;
        this.f3811f = list2;
        this.f3812g = list3;
        this.f3813h = list4;
        this.f3814i = list5;
        this.f3816k = str5;
        this.f3817l = list6;
        this.f3818m = list7;
        this.n = list8;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.f3815j = list10;
        this.t = null;
        this.u = -1;
    }

    public ai0(JSONObject jSONObject) {
        List<String> list;
        this.f3807b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        this.f3808c = Collections.unmodifiableList(arrayList);
        this.f3809d = jSONObject.optString("allocation_id", null);
        x0.y();
        this.f3811f = ki0.a(jSONObject, "clickurl");
        x0.y();
        this.f3812g = ki0.a(jSONObject, "imp_urls");
        x0.y();
        this.f3813h = ki0.a(jSONObject, "downloaded_imp_urls");
        x0.y();
        this.f3815j = ki0.a(jSONObject, "fill_urls");
        x0.y();
        this.f3817l = ki0.a(jSONObject, "video_start_urls");
        x0.y();
        this.n = ki0.a(jSONObject, "video_complete_urls");
        x0.y();
        this.f3818m = !((Boolean) a50.g().a(k80.v0)).booleanValue() ? this.n : ki0.a(jSONObject, "video_reward_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            x0.y();
            list = ki0.a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f3814i = list;
        this.a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f3816k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f3810e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.o = jSONObject.optString("html_template", null);
        this.p = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.q = optJSONObject3 != null ? optJSONObject3.toString() : null;
        x0.y();
        this.r = ki0.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.s = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.t = jSONObject.optString("response_type", null);
        this.u = jSONObject.optLong("ad_network_timeout_millis", -1);
    }

    public final boolean a() {
        return "banner".equalsIgnoreCase(this.t);
    }

    public final boolean b() {
        return "native".equalsIgnoreCase(this.t);
    }
}
