package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class h {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2740b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f2741c = new JSONObject(this.a);

    public static class a {
        private final List<h> a;

        /* renamed from: b  reason: collision with root package name */
        private final g f2742b;

        public a(g gVar, List<h> list) {
            this.a = list;
            this.f2742b = gVar;
        }

        public g a() {
            return this.f2742b;
        }

        public List<h> b() {
            return this.a;
        }
    }

    public h(String str, String str2) {
        this.a = str;
        this.f2740b = str2;
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.f2741c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public String c() {
        JSONObject jSONObject = this.f2741c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String d() {
        return this.f2740b;
    }

    public ArrayList<String> e() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f2741c.has("productIds")) {
            JSONArray optJSONArray = this.f2741c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    arrayList.add(optJSONArray.optString(i2));
                }
            }
        } else if (this.f2741c.has("productId")) {
            arrayList.add(this.f2741c.optString("productId"));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return TextUtils.equals(this.a, hVar.a()) && TextUtils.equals(this.f2740b, hVar.d());
    }

    public boolean f() {
        return this.f2741c.optBoolean("acknowledged", true);
    }

    public boolean g() {
        return this.f2741c.optBoolean("autoRenewing");
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? "Purchase. Json: ".concat(valueOf) : new String("Purchase. Json: ");
    }
}
