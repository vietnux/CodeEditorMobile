package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.s9;
import com.google.android.gms.internal.ads.sc;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
@k2
@KeepName
public class HttpClient implements e0<ff0> {
    private final Context mContext;
    private final sc zzyf;

    /* access modifiers changed from: package-private */
    @k2
    public static class a {
        private final String a;

        /* renamed from: b  reason: collision with root package name */
        private final String f3153b;

        public a(String str, String str2) {
            this.a = str;
            this.f3153b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.f3153b;
        }
    }

    /* access modifiers changed from: package-private */
    @k2
    public static class b {
        private final String a;

        /* renamed from: b  reason: collision with root package name */
        private final URL f3154b;

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<a> f3155c;

        /* renamed from: d  reason: collision with root package name */
        private final String f3156d;

        b(String str, URL url, ArrayList<a> arrayList, String str2) {
            this.a = str;
            this.f3154b = url;
            this.f3155c = arrayList;
            this.f3156d = str2;
        }

        public final String a() {
            return this.a;
        }

        public final URL b() {
            return this.f3154b;
        }

        public final ArrayList<a> c() {
            return this.f3155c;
        }

        public final String d() {
            return this.f3156d;
        }
    }

    /* access modifiers changed from: package-private */
    @k2
    public class c {
        private final d a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f3157b;

        /* renamed from: c  reason: collision with root package name */
        private final String f3158c;

        public c(HttpClient httpClient, boolean z, d dVar, String str) {
            this.f3157b = z;
            this.a = dVar;
            this.f3158c = str;
        }

        public final String a() {
            return this.f3158c;
        }

        public final boolean b() {
            return this.f3157b;
        }

        public final d c() {
            return this.a;
        }
    }

    /* access modifiers changed from: package-private */
    @k2
    public static class d {
        private final String a;

        /* renamed from: b  reason: collision with root package name */
        private final int f3159b;

        /* renamed from: c  reason: collision with root package name */
        private final List<a> f3160c;

        /* renamed from: d  reason: collision with root package name */
        private final String f3161d;

        d(String str, int i2, List<a> list, String str2) {
            this.a = str;
            this.f3159b = i2;
            this.f3160c = list;
            this.f3161d = str2;
        }

        public final String a() {
            return this.f3161d;
        }

        public final int b() {
            return this.f3159b;
        }

        public final String c() {
            return this.a;
        }

        public final Iterable<a> d() {
            return this.f3160c;
        }
    }

    public HttpClient(Context context, sc scVar) {
        this.mContext = context;
        this.zzyf = scVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.ads.internal.gmsg.HttpClient.c zza(com.google.android.gms.ads.internal.gmsg.HttpClient.b r13) {
        /*
        // Method dump skipped, instructions count: 262
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.HttpClient.zza(com.google.android.gms.ads.internal.gmsg.HttpClient$b):com.google.android.gms.ads.internal.gmsg.HttpClient$c");
    }

    private static JSONObject zza(d dVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", dVar.c());
            if (dVar.a() != null) {
                jSONObject.put("body", dVar.a());
            }
            JSONArray jSONArray = new JSONArray();
            for (a aVar : dVar.d()) {
                jSONArray.put(new JSONObject().put("key", aVar.a()).put("value", aVar.b()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", dVar.b());
        } catch (JSONException e2) {
            qc.b("Error constructing JSON for http response.", e2);
        }
        return jSONObject;
    }

    private static b zzc(JSONObject jSONObject) {
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        URL url = null;
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (MalformedURLException e2) {
            qc.b("Error constructing http request.", e2);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject != null) {
                arrayList.add(new a(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new b(optString, url, arrayList, optString3);
    }

    @Keep
    @KeepName
    public JSONObject send(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            String optString = jSONObject.optString("http_request_id");
            c zza = zza(zzc(jSONObject));
            if (zza.b()) {
                jSONObject2.put("response", zza(zza.c()));
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("response", new JSONObject().put("http_request_id", optString));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", zza.a());
            }
        } catch (Exception e2) {
            qc.b("Error executing http request.", e2);
            try {
                jSONObject2.put("response", new JSONObject().put("http_request_id", ""));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", e2.toString());
            } catch (JSONException e3) {
                qc.b("Error executing http request.", e3);
            }
        }
        return jSONObject2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(ff0 ff0, Map map) {
        s9.a(new f0(this, map, ff0));
    }
}
