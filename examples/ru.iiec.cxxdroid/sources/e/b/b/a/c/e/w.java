package e.b.b.a.c.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.y;

public final class w extends a {
    public static final Parcelable.Creator<w> CREATOR = new x();

    /* renamed from: b  reason: collision with root package name */
    public String f7635b;

    /* renamed from: c  reason: collision with root package name */
    public String f7636c;

    /* renamed from: d  reason: collision with root package name */
    public p5 f7637d;

    /* renamed from: e  reason: collision with root package name */
    public long f7638e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7639f;

    /* renamed from: g  reason: collision with root package name */
    public String f7640g;

    /* renamed from: h  reason: collision with root package name */
    public n0 f7641h;

    /* renamed from: i  reason: collision with root package name */
    public long f7642i;

    /* renamed from: j  reason: collision with root package name */
    public n0 f7643j;

    /* renamed from: k  reason: collision with root package name */
    public long f7644k;

    /* renamed from: l  reason: collision with root package name */
    public n0 f7645l;

    w(w wVar) {
        y.a(wVar);
        this.f7635b = wVar.f7635b;
        this.f7636c = wVar.f7636c;
        this.f7637d = wVar.f7637d;
        this.f7638e = wVar.f7638e;
        this.f7639f = wVar.f7639f;
        this.f7640g = wVar.f7640g;
        this.f7641h = wVar.f7641h;
        this.f7642i = wVar.f7642i;
        this.f7643j = wVar.f7643j;
        this.f7644k = wVar.f7644k;
        this.f7645l = wVar.f7645l;
    }

    w(String str, String str2, p5 p5Var, long j2, boolean z, String str3, n0 n0Var, long j3, n0 n0Var2, long j4, n0 n0Var3) {
        this.f7635b = str;
        this.f7636c = str2;
        this.f7637d = p5Var;
        this.f7638e = j2;
        this.f7639f = z;
        this.f7640g = str3;
        this.f7641h = n0Var;
        this.f7642i = j3;
        this.f7643j = n0Var2;
        this.f7644k = j4;
        this.f7645l = n0Var3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f7635b, false);
        c.a(parcel, 3, this.f7636c, false);
        c.a(parcel, 4, (Parcelable) this.f7637d, i2, false);
        c.a(parcel, 5, this.f7638e);
        c.a(parcel, 6, this.f7639f);
        c.a(parcel, 7, this.f7640g, false);
        c.a(parcel, 8, (Parcelable) this.f7641h, i2, false);
        c.a(parcel, 9, this.f7642i);
        c.a(parcel, 10, (Parcelable) this.f7643j, i2, false);
        c.a(parcel, 11, this.f7644k);
        c.a(parcel, 12, (Parcelable) this.f7645l, i2, false);
        c.a(parcel, a);
    }
}
