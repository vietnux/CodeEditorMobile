package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

@k2
public final class p70 extends a {
    public static final Parcelable.Creator<p70> CREATOR = new q70();

    /* renamed from: b  reason: collision with root package name */
    public final String f5215b;

    public p70(com.google.android.gms.ads.q.a aVar) {
        aVar.a();
        throw null;
    }

    p70(String str) {
        this.f5215b = str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 15, this.f5215b, false);
        c.a(parcel, a);
    }
}
