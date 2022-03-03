package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;

public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new g();

    /* renamed from: b  reason: collision with root package name */
    Bundle f6681b;

    public c(Bundle bundle) {
        this.f6681b = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = com.google.android.gms.common.internal.f0.c.a(parcel);
        com.google.android.gms.common.internal.f0.c.a(parcel, 2, this.f6681b, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, a);
    }
}
