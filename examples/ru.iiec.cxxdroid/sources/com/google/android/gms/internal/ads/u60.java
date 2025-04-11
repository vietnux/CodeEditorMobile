package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

@k2
public final class u60 extends a {
    public static final Parcelable.Creator<u60> CREATOR = new v60();

    /* renamed from: b  reason: collision with root package name */
    public final int f5711b;

    public u60(int i2) {
        this.f5711b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f5711b);
        c.a(parcel, a);
    }
}
