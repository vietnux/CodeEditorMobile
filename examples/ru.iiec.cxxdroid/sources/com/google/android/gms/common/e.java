package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.x;

public class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: b  reason: collision with root package name */
    private final String f3605b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    private final int f3606c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3607d;

    public e(String str, int i2, long j2) {
        this.f3605b = str;
        this.f3606c = i2;
        this.f3607d = j2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            return ((t() != null && t().equals(eVar.t())) || (t() == null && eVar.t() == null)) && u() == eVar.u();
        }
    }

    public int hashCode() {
        return x.a(t(), Long.valueOf(u()));
    }

    public String t() {
        return this.f3605b;
    }

    public String toString() {
        x.a a = x.a(this);
        a.a("name", t());
        a.a("version", Long.valueOf(u()));
        return a.toString();
    }

    public long u() {
        long j2 = this.f3607d;
        return j2 == -1 ? (long) this.f3606c : j2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, t(), false);
        c.a(parcel, 2, this.f3606c);
        c.a(parcel, 3, u());
        c.a(parcel, a);
    }
}
