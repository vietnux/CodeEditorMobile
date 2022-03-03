package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public class c0 implements Parcelable.Creator<b0> {
    @Override // android.os.Parcelable.Creator
    public b0 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        IBinder iBinder = null;
        com.google.android.gms.common.b bVar = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 1) {
                i2 = b.m(parcel, a);
            } else if (a2 == 2) {
                iBinder = b.l(parcel, a);
            } else if (a2 == 3) {
                bVar = (com.google.android.gms.common.b) b.a(parcel, a, com.google.android.gms.common.b.CREATOR);
            } else if (a2 == 4) {
                z = b.h(parcel, a);
            } else if (a2 != 5) {
                b.q(parcel, a);
            } else {
                z2 = b.h(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new b0(i2, iBinder, bVar, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public b0[] newArray(int i2) {
        return new b0[i2];
    }
}
