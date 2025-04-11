package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.x;
import org.json.JSONArray;
import org.json.JSONException;

@k2
public final class o7 extends a {
    public static final Parcelable.Creator<o7> CREATOR = new p7();

    /* renamed from: b  reason: collision with root package name */
    public final String f5126b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5127c;

    public o7(com.google.android.gms.ads.p.a aVar) {
        this(aVar.a(), aVar.J());
    }

    public o7(String str, int i2) {
        this.f5126b = str;
        this.f5127c = i2;
    }

    public static o7 a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new o7(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public static o7 b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(new JSONArray(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof o7)) {
            o7 o7Var = (o7) obj;
            return x.a(this.f5126b, o7Var.f5126b) && x.a(Integer.valueOf(this.f5127c), Integer.valueOf(o7Var.f5127c));
        }
    }

    public final int hashCode() {
        return x.a(this.f5126b, Integer.valueOf(this.f5127c));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f5126b, false);
        c.a(parcel, 3, this.f5127c);
        c.a(parcel, a);
    }
}
