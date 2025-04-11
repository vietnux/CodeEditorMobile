package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

public final class jj extends a {
    public static final Parcelable.Creator<jj> CREATOR = new kj();

    /* renamed from: b  reason: collision with root package name */
    private final int f4720b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4721c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4722d;

    jj(int i2, String str, String str2) {
        this.f4720b = i2;
        this.f4721c = str;
        this.f4722d = str2;
    }

    public jj(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f4720b);
        c.a(parcel, 2, this.f4721c, false);
        c.a(parcel, 3, this.f4722d, false);
        c.a(parcel, a);
    }
}
