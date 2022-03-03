package com.google.android.gms.ads.n;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.internal.ads.a60;
import com.google.android.gms.internal.ads.b60;
import com.google.android.gms.internal.ads.k2;

@k2
public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new n();

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3436b;

    /* renamed from: c  reason: collision with root package name */
    private final a60 f3437c;

    j(boolean z, IBinder iBinder) {
        this.f3436b = z;
        this.f3437c = iBinder != null ? b60.a(iBinder) : null;
    }

    public final boolean t() {
        return this.f3436b;
    }

    public final a60 u() {
        return this.f3437c;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, t());
        a60 a60 = this.f3437c;
        c.a(parcel, 2, a60 == null ? null : a60.asBinder(), false);
        c.a(parcel, a);
    }
}
