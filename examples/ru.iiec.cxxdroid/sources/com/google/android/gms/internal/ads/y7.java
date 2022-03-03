package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

@k2
public final class y7 extends a {
    public static final Parcelable.Creator<y7> CREATOR = new z7();

    /* renamed from: b  reason: collision with root package name */
    public final String f6088b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6089c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6090d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6091e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f6092f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6093g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6094h;

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f6095i;

    public y7(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.f6088b = str;
        this.f6089c = str2;
        this.f6090d = z;
        this.f6091e = z2;
        this.f6092f = list;
        this.f6093g = z3;
        this.f6094h = z4;
        this.f6095i = list2 == null ? new ArrayList<>() : list2;
    }

    public static y7 a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new y7(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), pb.a(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), pb.a(jSONObject.optJSONArray("webview_permissions"), null));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f6088b, false);
        c.a(parcel, 3, this.f6089c, false);
        c.a(parcel, 4, this.f6090d);
        c.a(parcel, 5, this.f6091e);
        c.b(parcel, 6, this.f6092f, false);
        c.a(parcel, 7, this.f6093g);
        c.a(parcel, 8, this.f6094h);
        c.b(parcel, 9, this.f6095i, false);
        c.a(parcel, a);
    }
}
