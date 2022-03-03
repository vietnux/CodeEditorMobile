package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.internal.ads.k2;

@k2
public final class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new s();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3312b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3313c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3314d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3315e;

    /* renamed from: f  reason: collision with root package name */
    public final float f3316f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3317g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3318h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3319i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3320j;

    r(boolean z, boolean z2, String str, boolean z3, float f2, int i2, boolean z4, boolean z5, boolean z6) {
        this.f3312b = z;
        this.f3313c = z2;
        this.f3314d = str;
        this.f3315e = z3;
        this.f3316f = f2;
        this.f3317g = i2;
        this.f3318h = z4;
        this.f3319i = z5;
        this.f3320j = z6;
    }

    public r(boolean z, boolean z2, boolean z3, float f2, int i2, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f2, i2, z4, z5, z6);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f3312b);
        c.a(parcel, 3, this.f3313c);
        c.a(parcel, 4, this.f3314d, false);
        c.a(parcel, 5, this.f3315e);
        c.a(parcel, 6, this.f3316f);
        c.a(parcel, 7, this.f3317g);
        c.a(parcel, 8, this.f3318h);
        c.a(parcel, 9, this.f3319i);
        c.a(parcel, 10, this.f3320j);
        c.a(parcel, a);
    }
}
