package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.x;

public final class Status extends a implements j, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new p();

    /* renamed from: f  reason: collision with root package name */
    public static final Status f3460f = new Status(0);

    /* renamed from: g  reason: collision with root package name */
    public static final Status f3461g = new Status(15);

    /* renamed from: h  reason: collision with root package name */
    public static final Status f3462h = new Status(16);

    /* renamed from: b  reason: collision with root package name */
    private final int f3463b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3464c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3465d;

    /* renamed from: e  reason: collision with root package name */
    private final PendingIntent f3466e;

    static {
        new Status(14);
        new Status(8);
        new Status(17);
        new Status(18);
    }

    public Status(int i2) {
        this(i2, null);
    }

    Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.f3463b = i2;
        this.f3464c = i3;
        this.f3465d = str;
        this.f3466e = pendingIntent;
    }

    public Status(int i2, String str) {
        this(1, i2, str, null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f3463b == status.f3463b && this.f3464c == status.f3464c && x.a(this.f3465d, status.f3465d) && x.a(this.f3466e, status.f3466e);
    }

    public final int hashCode() {
        return x.a(Integer.valueOf(this.f3463b), Integer.valueOf(this.f3464c), this.f3465d, this.f3466e);
    }

    @Override // com.google.android.gms.common.api.j
    public final Status m() {
        return this;
    }

    public final int t() {
        return this.f3464c;
    }

    public final String toString() {
        x.a a = x.a(this);
        a.a("statusCode", x());
        a.a("resolution", this.f3466e);
        return a.toString();
    }

    public final String u() {
        return this.f3465d;
    }

    public final boolean v() {
        return this.f3466e != null;
    }

    public final boolean w() {
        return this.f3464c <= 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, t());
        c.a(parcel, 2, u(), false);
        c.a(parcel, 3, (Parcelable) this.f3466e, i2, false);
        c.a(parcel, 1000, this.f3463b);
        c.a(parcel, a);
    }

    public final String x() {
        String str = this.f3465d;
        return str != null ? str : d.a(this.f3464c);
    }
}
