package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@k2
public final class bi0 {
    public final List<ai0> a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3913b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f3914c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f3915d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f3916e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f3917f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f3918g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3919h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3920i;

    /* renamed from: j  reason: collision with root package name */
    public final long f3921j;

    /* renamed from: k  reason: collision with root package name */
    public final String f3922k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3923l;

    /* renamed from: m  reason: collision with root package name */
    public final int f3924m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public int r;
    public int s;
    public boolean t;

    public bi0(String str) {
        this(new JSONObject(str));
    }

    public bi0(List<ai0> list, long j2, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, boolean z, String str, long j3, int i2, int i3, String str2, int i4, int i5, long j4, boolean z2) {
        this.a = list;
        this.f3913b = j2;
        this.f3914c = list2;
        this.f3915d = list3;
        this.f3916e = list4;
        this.f3917f = list5;
        this.f3918g = list6;
        this.f3919h = z;
        this.f3920i = str;
        this.f3921j = -1;
        this.r = 0;
        this.s = 1;
        this.f3922k = null;
        this.f3923l = 0;
        this.f3924m = -1;
        this.n = -1;
        this.o = false;
        this.p = false;
        this.q = false;
        this.t = false;
    }

    public bi0(JSONObject jSONObject) {
        if (qc.a(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            l9.e(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i2 = -1;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            ai0 ai0 = new ai0(jSONArray.getJSONObject(i3));
            boolean z = true;
            if (ai0.a()) {
                this.t = true;
            }
            arrayList.add(ai0);
            if (i2 < 0) {
                Iterator<String> it = ai0.f3808c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    i2 = i3;
                }
            }
        }
        this.r = i2;
        this.s = jSONArray.length();
        this.a = Collections.unmodifiableList(arrayList);
        this.f3920i = jSONObject.optString("qdata");
        this.f3924m = jSONObject.optInt("fs_model_type", -1);
        long j2 = -1;
        this.n = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f3913b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            x0.y();
            this.f3914c = ki0.a(optJSONObject, "click_urls");
            x0.y();
            this.f3915d = ki0.a(optJSONObject, "imp_urls");
            x0.y();
            this.f3916e = ki0.a(optJSONObject, "downloaded_imp_urls");
            x0.y();
            this.f3917f = ki0.a(optJSONObject, "nofill_urls");
            x0.y();
            this.f3918g = ki0.a(optJSONObject, "remote_ping_urls");
            this.f3919h = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            this.f3921j = optLong > 0 ? 1000 * optLong : j2;
            o7 a2 = o7.a(optJSONObject.optJSONArray("rewards"));
            if (a2 == null) {
                this.f3922k = null;
                this.f3923l = 0;
            } else {
                this.f3922k = a2.f5126b;
                this.f3923l = a2.f5127c;
            }
            this.o = optJSONObject.optBoolean("use_displayed_impression", false);
            this.p = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.q = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            return;
        }
        this.f3913b = -1;
        this.f3914c = null;
        this.f3915d = null;
        this.f3916e = null;
        this.f3917f = null;
        this.f3918g = null;
        this.f3921j = -1;
        this.f3922k = null;
        this.f3923l = 0;
        this.o = false;
        this.f3919h = false;
        this.p = false;
        this.q = false;
    }
}
