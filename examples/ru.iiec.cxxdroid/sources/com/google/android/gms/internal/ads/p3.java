package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class p3 extends a {
    public static final Parcelable.Creator<p3> CREATOR = new q3();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5210b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f5211c;

    public p3() {
        this(false, Collections.emptyList());
    }

    public p3(boolean z, List<String> list) {
        this.f5210b = z;
        this.f5211c = list;
    }

    public static p3 a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new p3();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    arrayList.add(optJSONArray.getString(i2));
                } catch (JSONException e2) {
                    qc.c("Error grabbing url from json.", e2);
                }
            }
        }
        return new p3(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f5210b);
        c.b(parcel, 3, this.f5211c, false);
        c.a(parcel, a);
    }
}
