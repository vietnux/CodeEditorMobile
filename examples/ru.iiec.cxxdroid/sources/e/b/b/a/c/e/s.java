package e.b.b.a.c.e;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.y;

public final class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new t();

    /* renamed from: b  reason: collision with root package name */
    public final String f7562b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7563c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7564d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7565e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7566f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7567g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7568h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f7569i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f7570j;

    /* renamed from: k  reason: collision with root package name */
    public final long f7571k;

    /* renamed from: l  reason: collision with root package name */
    public final String f7572l;

    /* renamed from: m  reason: collision with root package name */
    public final long f7573m;
    public final long n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final boolean r;

    s(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z, boolean z2, String str6, long j5, long j6, int i2, boolean z3, boolean z4, boolean z5) {
        y.b(str);
        this.f7562b = str;
        this.f7563c = TextUtils.isEmpty(str2) ? null : str2;
        this.f7564d = str3;
        this.f7571k = j2;
        this.f7565e = str4;
        this.f7566f = j3;
        this.f7567g = j4;
        this.f7568h = str5;
        this.f7569i = z;
        this.f7570j = z2;
        this.f7572l = str6;
        this.f7573m = j5;
        this.n = j6;
        this.o = i2;
        this.p = z3;
        this.q = z4;
        this.r = z5;
    }

    s(String str, String str2, String str3, String str4, long j2, long j3, String str5, boolean z, boolean z2, long j4, String str6, long j5, long j6, int i2, boolean z3, boolean z4, boolean z5) {
        this.f7562b = str;
        this.f7563c = str2;
        this.f7564d = str3;
        this.f7571k = j4;
        this.f7565e = str4;
        this.f7566f = j2;
        this.f7567g = j3;
        this.f7568h = str5;
        this.f7569i = z;
        this.f7570j = z2;
        this.f7572l = str6;
        this.f7573m = j5;
        this.n = j6;
        this.o = i2;
        this.p = z3;
        this.q = z4;
        this.r = z5;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f7562b, false);
        c.a(parcel, 3, this.f7563c, false);
        c.a(parcel, 4, this.f7564d, false);
        c.a(parcel, 5, this.f7565e, false);
        c.a(parcel, 6, this.f7566f);
        c.a(parcel, 7, this.f7567g);
        c.a(parcel, 8, this.f7568h, false);
        c.a(parcel, 9, this.f7569i);
        c.a(parcel, 10, this.f7570j);
        c.a(parcel, 11, this.f7571k);
        c.a(parcel, 12, this.f7572l, false);
        c.a(parcel, 13, this.f7573m);
        c.a(parcel, 14, this.n);
        c.a(parcel, 15, this.o);
        c.a(parcel, 16, this.p);
        c.a(parcel, 17, this.q);
        c.a(parcel, 18, this.r);
        c.a(parcel, a);
    }
}
