package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

@k2
public final class hd0 extends a {
    public static final Parcelable.Creator<hd0> CREATOR = new id0();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4509b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4510c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4511d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f4512e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f4513f;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f4514g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4515h;

    /* renamed from: i  reason: collision with root package name */
    public final long f4516i;

    hd0(boolean z, String str, int i2, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j2) {
        this.f4509b = z;
        this.f4510c = str;
        this.f4511d = i2;
        this.f4512e = bArr;
        this.f4513f = strArr;
        this.f4514g = strArr2;
        this.f4515h = z2;
        this.f4516i = j2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f4509b);
        c.a(parcel, 2, this.f4510c, false);
        c.a(parcel, 3, this.f4511d);
        c.a(parcel, 4, this.f4512e, false);
        c.a(parcel, 5, this.f4513f, false);
        c.a(parcel, 6, this.f4514g, false);
        c.a(parcel, 7, this.f4515h);
        c.a(parcel, 8, this.f4516i);
        c.a(parcel, a);
    }
}
