package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import java.util.List;

@k2
public final class c4 extends a {
    public static final Parcelable.Creator<c4> CREATOR = new d4();

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f3970b;

    /* renamed from: c  reason: collision with root package name */
    private final sc f3971c;

    /* renamed from: d  reason: collision with root package name */
    private final ApplicationInfo f3972d;

    /* renamed from: e  reason: collision with root package name */
    private final String f3973e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f3974f;

    /* renamed from: g  reason: collision with root package name */
    private final PackageInfo f3975g;

    /* renamed from: h  reason: collision with root package name */
    private final String f3976h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f3977i;

    /* renamed from: j  reason: collision with root package name */
    private final String f3978j;

    public c4(Bundle bundle, sc scVar, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.f3970b = bundle;
        this.f3971c = scVar;
        this.f3973e = str;
        this.f3972d = applicationInfo;
        this.f3974f = list;
        this.f3975g = packageInfo;
        this.f3976h = str2;
        this.f3977i = z;
        this.f3978j = str3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f3970b, false);
        c.a(parcel, 2, (Parcelable) this.f3971c, i2, false);
        c.a(parcel, 3, (Parcelable) this.f3972d, i2, false);
        c.a(parcel, 4, this.f3973e, false);
        c.b(parcel, 5, this.f3974f, false);
        c.a(parcel, 6, (Parcelable) this.f3975g, i2, false);
        c.a(parcel, 7, this.f3976h, false);
        c.a(parcel, 8, this.f3977i);
        c.a(parcel, 9, this.f3978j, false);
        c.a(parcel, a);
    }
}
