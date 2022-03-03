package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

@k2
public final class o4 extends a {
    public static final Parcelable.Creator<o4> CREATOR = new p4();

    /* renamed from: b  reason: collision with root package name */
    String f5125b;

    public o4(String str) {
        this.f5125b = str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f5125b, false);
        c.a(parcel, a);
    }
}
