package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

public class k {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f2752b = new JSONObject(this.a);

    public k(String str) {
        this.a = str;
        if (TextUtils.isEmpty(this.f2752b.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        } else if (TextUtils.isEmpty(this.f2752b.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public String a() {
        return this.f2752b.optString("freeTrialPeriod");
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.f2752b.optString("price");
    }

    public String d() {
        return this.f2752b.optString("productId");
    }

    public String e() {
        return this.f2752b.optString("type");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return TextUtils.equals(this.a, ((k) obj).a);
    }

    public int f() {
        return this.f2752b.optInt("offer_type");
    }

    public String g() {
        return this.f2752b.optString("offer_id");
    }

    public final String h() {
        return this.f2752b.optString("packageName");
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String i() {
        return this.f2752b.optString("serializedDocid");
    }

    /* access modifiers changed from: package-private */
    public final String j() {
        return this.f2752b.optString("skuDetailsToken");
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? "SkuDetails: ".concat(valueOf) : new String("SkuDetails: ");
    }
}
