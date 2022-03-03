package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.l;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

@k2
public final class t70 extends a {
    public static final Parcelable.Creator<t70> CREATOR = new u70();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5593b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5594c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5595d;

    public t70(l lVar) {
        this(lVar.c(), lVar.b(), lVar.a());
    }

    public t70(boolean z, boolean z2, boolean z3) {
        this.f5593b = z;
        this.f5594c = z2;
        this.f5595d = z3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f5593b);
        c.a(parcel, 3, this.f5594c);
        c.a(parcel, 4, this.f5595d);
        c.a(parcel, a);
    }
}
