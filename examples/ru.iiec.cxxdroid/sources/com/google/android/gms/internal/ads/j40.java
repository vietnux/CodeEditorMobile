package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.x;
import java.util.List;

@k2
public final class j40 extends a {
    public static final Parcelable.Creator<j40> CREATOR = new l40();

    /* renamed from: b  reason: collision with root package name */
    public final int f4674b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4675c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f4676d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4677e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f4678f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4679g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4680h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4681i;

    /* renamed from: j  reason: collision with root package name */
    public final String f4682j;

    /* renamed from: k  reason: collision with root package name */
    public final p70 f4683k;

    /* renamed from: l  reason: collision with root package name */
    public final Location f4684l;

    /* renamed from: m  reason: collision with root package name */
    public final String f4685m;
    public final Bundle n;
    public final Bundle o;
    public final List<String> p;
    public final String q;
    public final String r;
    public final boolean s;

    public j40(int i2, long j2, Bundle bundle, int i3, List<String> list, boolean z, int i4, boolean z2, String str, p70 p70, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3) {
        this.f4674b = i2;
        this.f4675c = j2;
        this.f4676d = bundle == null ? new Bundle() : bundle;
        this.f4677e = i3;
        this.f4678f = list;
        this.f4679g = z;
        this.f4680h = i4;
        this.f4681i = z2;
        this.f4682j = str;
        this.f4683k = p70;
        this.f4684l = location;
        this.f4685m = str2;
        this.n = bundle2 == null ? new Bundle() : bundle2;
        this.o = bundle3;
        this.p = list2;
        this.q = str3;
        this.r = str4;
        this.s = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j40)) {
            return false;
        }
        j40 j40 = (j40) obj;
        return this.f4674b == j40.f4674b && this.f4675c == j40.f4675c && x.a(this.f4676d, j40.f4676d) && this.f4677e == j40.f4677e && x.a(this.f4678f, j40.f4678f) && this.f4679g == j40.f4679g && this.f4680h == j40.f4680h && this.f4681i == j40.f4681i && x.a(this.f4682j, j40.f4682j) && x.a(this.f4683k, j40.f4683k) && x.a(this.f4684l, j40.f4684l) && x.a(this.f4685m, j40.f4685m) && x.a(this.n, j40.n) && x.a(this.o, j40.o) && x.a(this.p, j40.p) && x.a(this.q, j40.q) && x.a(this.r, j40.r) && this.s == j40.s;
    }

    public final int hashCode() {
        return x.a(Integer.valueOf(this.f4674b), Long.valueOf(this.f4675c), this.f4676d, Integer.valueOf(this.f4677e), this.f4678f, Boolean.valueOf(this.f4679g), Integer.valueOf(this.f4680h), Boolean.valueOf(this.f4681i), this.f4682j, this.f4683k, this.f4684l, this.f4685m, this.n, this.o, this.p, this.q, this.r, Boolean.valueOf(this.s));
    }

    public final j40 t() {
        Bundle bundle = this.n.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle == null) {
            bundle = this.f4676d;
            this.n.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle);
        }
        return new j40(this.f4674b, this.f4675c, bundle, this.f4677e, this.f4678f, this.f4679g, this.f4680h, this.f4681i, this.f4682j, this.f4683k, this.f4684l, this.f4685m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f4674b);
        c.a(parcel, 2, this.f4675c);
        c.a(parcel, 3, this.f4676d, false);
        c.a(parcel, 4, this.f4677e);
        c.b(parcel, 5, this.f4678f, false);
        c.a(parcel, 6, this.f4679g);
        c.a(parcel, 7, this.f4680h);
        c.a(parcel, 8, this.f4681i);
        c.a(parcel, 9, this.f4682j, false);
        c.a(parcel, 10, (Parcelable) this.f4683k, i2, false);
        c.a(parcel, 11, (Parcelable) this.f4684l, i2, false);
        c.a(parcel, 12, this.f4685m, false);
        c.a(parcel, 13, this.n, false);
        c.a(parcel, 14, this.o, false);
        c.b(parcel, 15, this.p, false);
        c.a(parcel, 16, this.q, false);
        c.a(parcel, 17, this.r, false);
        c.a(parcel, 18, this.s);
        c.a(parcel, a);
    }
}
