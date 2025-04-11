package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import java.util.Map;

@k2
public final class fd0 extends a {
    public static final Parcelable.Creator<fd0> CREATOR = new gd0();

    /* renamed from: b  reason: collision with root package name */
    private final String f4308b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f4309c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f4310d;

    fd0(String str, String[] strArr, String[] strArr2) {
        this.f4308b = str;
        this.f4309c = strArr;
        this.f4310d = strArr2;
    }

    public static fd0 a(bc0 bc0) {
        Map<String, String> a = bc0.a();
        int size = a.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i2 = 0;
        for (Map.Entry<String, String> entry : a.entrySet()) {
            strArr[i2] = entry.getKey();
            strArr2[i2] = entry.getValue();
            i2++;
        }
        return new fd0(bc0.i(), strArr, strArr2);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f4308b, false);
        c.a(parcel, 2, this.f4309c, false);
        c.a(parcel, 3, this.f4310d, false);
        c.a(parcel, a);
    }
}
