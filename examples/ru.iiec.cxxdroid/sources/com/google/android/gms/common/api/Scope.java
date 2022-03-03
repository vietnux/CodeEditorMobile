package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.y;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new o();

    /* renamed from: b  reason: collision with root package name */
    private final int f3458b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3459c;

    Scope(int i2, String str) {
        y.a(str, (Object) "scopeUri must not be null or empty");
        this.f3458b = i2;
        this.f3459c = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f3459c.equals(((Scope) obj).f3459c);
    }

    public final int hashCode() {
        return this.f3459c.hashCode();
    }

    public final String t() {
        return this.f3459c;
    }

    public final String toString() {
        return this.f3459c;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f3458b);
        c.a(parcel, 2, t(), false);
        c.a(parcel, a);
    }
}
