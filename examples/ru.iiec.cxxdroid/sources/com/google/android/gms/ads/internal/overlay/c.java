package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.internal.ads.k2;

@k2
public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    private final String f3267b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3268c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3269d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3270e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3271f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3272g;

    /* renamed from: h  reason: collision with root package name */
    private final String f3273h;

    /* renamed from: i  reason: collision with root package name */
    public final Intent f3274i;

    public c(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.f3267b = str;
        this.f3268c = str2;
        this.f3269d = str3;
        this.f3270e = str4;
        this.f3271f = str5;
        this.f3272g = str6;
        this.f3273h = str7;
        this.f3274i = intent;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = com.google.android.gms.common.internal.f0.c.a(parcel);
        com.google.android.gms.common.internal.f0.c.a(parcel, 2, this.f3267b, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 3, this.f3268c, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 4, this.f3269d, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 5, this.f3270e, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 6, this.f3271f, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 7, this.f3272g, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 8, this.f3273h, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 9, (Parcelable) this.f3274i, i2, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, a);
    }
}
