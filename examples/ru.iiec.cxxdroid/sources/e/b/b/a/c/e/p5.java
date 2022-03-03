package e.b.b.a.c.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.y;

public final class p5 extends a {
    public static final Parcelable.Creator<p5> CREATOR = new q5();

    /* renamed from: b  reason: collision with root package name */
    private final int f7508b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7509c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7510d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f7511e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7512f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7513g;

    /* renamed from: h  reason: collision with root package name */
    private final Double f7514h;

    p5(int i2, String str, long j2, Long l2, Float f2, String str2, String str3, Double d2) {
        this.f7508b = i2;
        this.f7509c = str;
        this.f7510d = j2;
        this.f7511e = l2;
        if (i2 == 1) {
            this.f7514h = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.f7514h = d2;
        }
        this.f7512f = str2;
        this.f7513g = str3;
    }

    p5(r5 r5Var) {
        this(r5Var.f7547c, r5Var.f7548d, r5Var.f7549e, r5Var.f7546b);
    }

    p5(String str, long j2, Object obj, String str2) {
        y.b(str);
        this.f7508b = 2;
        this.f7509c = str;
        this.f7510d = j2;
        this.f7513g = str2;
        if (obj == null) {
            this.f7511e = null;
            this.f7514h = null;
            this.f7512f = null;
        } else if (obj instanceof Long) {
            this.f7511e = (Long) obj;
            this.f7514h = null;
            this.f7512f = null;
        } else if (obj instanceof String) {
            this.f7511e = null;
            this.f7514h = null;
            this.f7512f = (String) obj;
        } else if (obj instanceof Double) {
            this.f7511e = null;
            this.f7514h = (Double) obj;
            this.f7512f = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public final Object t() {
        Long l2 = this.f7511e;
        if (l2 != null) {
            return l2;
        }
        Double d2 = this.f7514h;
        if (d2 != null) {
            return d2;
        }
        String str = this.f7512f;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f7508b);
        c.a(parcel, 2, this.f7509c, false);
        c.a(parcel, 3, this.f7510d);
        c.a(parcel, 4, this.f7511e, false);
        c.a(parcel, 5, (Float) null, false);
        c.a(parcel, 6, this.f7512f, false);
        c.a(parcel, 7, this.f7513g, false);
        c.a(parcel, 8, this.f7514h, false);
        c.a(parcel, a);
    }
}
