package com.google.android.gms.ads.internal.gmsg;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.cx;
import com.google.android.gms.internal.ads.dx;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.hh;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k8;
import com.google.android.gms.internal.ads.kf;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.rf;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.sf;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.tb;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class o {
    public static final e0<lg> a = p.a;

    /* renamed from: b  reason: collision with root package name */
    public static final e0<lg> f3174b = q.a;

    /* renamed from: c  reason: collision with root package name */
    public static final e0<lg> f3175c = r.a;

    /* renamed from: d  reason: collision with root package name */
    public static final e0<lg> f3176d = new w();

    /* renamed from: e  reason: collision with root package name */
    public static final e0<lg> f3177e = new x();

    /* renamed from: f  reason: collision with root package name */
    public static final e0<lg> f3178f = s.a;

    /* renamed from: g  reason: collision with root package name */
    public static final e0<Object> f3179g = new y();

    /* renamed from: h  reason: collision with root package name */
    public static final e0<lg> f3180h = new z();

    /* renamed from: i  reason: collision with root package name */
    public static final e0<lg> f3181i = t.a;

    /* renamed from: j  reason: collision with root package name */
    public static final e0<lg> f3182j = new a0();

    /* renamed from: k  reason: collision with root package name */
    public static final e0<lg> f3183k = new b0();

    /* renamed from: l  reason: collision with root package name */
    public static final e0<kf> f3184l = new rf();

    /* renamed from: m  reason: collision with root package name */
    public static final e0<kf> f3185m = new sf();
    public static final e0<lg> n = new n();
    public static final g o = new g();
    public static final e0<lg> p = new c0();
    public static final e0<lg> q = new d0();
    public static final e0<lg> r = new v();

    static {
        new u();
    }

    static final /* synthetic */ void a(ff0 ff0, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            qc.d("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            cx l0 = ((ph) ff0).l0();
            if (l0 != null && l0.a(parse)) {
                parse = l0.a(parse, ((hh) ff0).getContext(), ((sh) ff0).getView(), ((hh) ff0).b0());
            }
        } catch (dx unused) {
            String valueOf = String.valueOf(str);
            qc.d(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
        }
        hh hhVar = (hh) ff0;
        new tb(hhVar.getContext(), ((rh) ff0).p0().f5529b, k8.a(parse, hhVar.getContext()).toString()).e();
    }

    static final /* synthetic */ void a(hh hhVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            qc.d("URL missing from httpTrack GMSG.");
        } else {
            new tb(hhVar.getContext(), ((rh) hhVar).p0().f5529b, str).e();
        }
    }

    static final /* synthetic */ void a(ph phVar, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            cx l0 = phVar.l0();
            if (l0 != null) {
                l0.a().a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            qc.d("Could not parse touch parameters from gmsg.");
        }
    }

    static final /* synthetic */ void b(hh hhVar, Map map) {
        JSONException jSONException;
        String str;
        PackageManager packageManager = hhVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e2) {
                                String valueOf = String.valueOf(optString7);
                                qc.b(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e2);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e3) {
                            jSONException = e3;
                            str = "Error constructing openable urls response.";
                        }
                    } catch (JSONException e4) {
                        jSONException = e4;
                        str = "Error parsing the intent data.";
                        qc.b(str, jSONException);
                    }
                }
                ((ff0) hhVar).a("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((ff0) hhVar).a("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((ff0) hhVar).a("openableIntents", new JSONObject());
        }
    }

    static final /* synthetic */ void c(hh hhVar, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            qc.d("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = hhVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((ff0) hhVar).a("openableURLs", hashMap);
    }
}
