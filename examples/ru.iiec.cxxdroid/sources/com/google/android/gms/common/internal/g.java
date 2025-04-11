package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

public class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: b  reason: collision with root package name */
    private Bundle f3659b;

    /* renamed from: c  reason: collision with root package name */
    private e[] f3660c;

    public g() {
    }

    g(Bundle bundle, e[] eVarArr) {
        this.f3659b = bundle;
        this.f3660c = eVarArr;
    }

    public e[] t() {
        return this.f3660c;
    }

    public Bundle u() {
        return this.f3659b;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f3659b, false);
        c.a(parcel, 2, (Parcelable[]) this.f3660c, i2, false);
        c.a(parcel, a);
    }
}
