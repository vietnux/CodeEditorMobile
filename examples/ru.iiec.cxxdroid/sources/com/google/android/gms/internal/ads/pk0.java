package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

@k2
public final class pk0 extends a {
    public static final Parcelable.Creator<pk0> CREATOR = new qk0();

    /* renamed from: b  reason: collision with root package name */
    private final int f5255b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5256c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5257d;

    pk0(int i2, int i3, int i4) {
        this.f5255b = i2;
        this.f5256c = i3;
        this.f5257d = i4;
    }

    public static pk0 a(cj cjVar) {
        return new pk0(cjVar.a, cjVar.f4030b, cjVar.f4031c);
    }

    public final String toString() {
        int i2 = this.f5255b;
        int i3 = this.f5256c;
        int i4 = this.f5257d;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        sb.append(".");
        sb.append(i4);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f5255b);
        c.a(parcel, 2, this.f5256c);
        c.a(parcel, 3, this.f5257d);
        c.a(parcel, a);
    }
}
