package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.r;

public class b0 extends a {
    public static final Parcelable.Creator<b0> CREATOR = new c0();

    /* renamed from: b  reason: collision with root package name */
    private final int f3616b;

    /* renamed from: c  reason: collision with root package name */
    private IBinder f3617c;

    /* renamed from: d  reason: collision with root package name */
    private b f3618d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3619e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3620f;

    b0(int i2, IBinder iBinder, b bVar, boolean z, boolean z2) {
        this.f3616b = i2;
        this.f3617c = iBinder;
        this.f3618d = bVar;
        this.f3619e = z;
        this.f3620f = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f3618d.equals(b0Var.f3618d) && t().equals(b0Var.t());
    }

    public r t() {
        return r.a.a(this.f3617c);
    }

    public b u() {
        return this.f3618d;
    }

    public boolean v() {
        return this.f3619e;
    }

    public boolean w() {
        return this.f3620f;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f3616b);
        c.a(parcel, 2, this.f3617c, false);
        c.a(parcel, 3, (Parcelable) u(), i2, false);
        c.a(parcel, 4, v());
        c.a(parcel, 5, w());
        c.a(parcel, a);
    }
}
