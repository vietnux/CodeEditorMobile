package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

@k2
public final class r6 extends a {
    public static final Parcelable.Creator<r6> CREATOR = new s6();

    /* renamed from: b  reason: collision with root package name */
    public final j40 f5392b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5393c;

    public r6(j40 j40, String str) {
        this.f5392b = j40;
        this.f5393c = str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, (Parcelable) this.f5392b, i2, false);
        c.a(parcel, 3, this.f5393c, false);
        c.a(parcel, a);
    }
}
