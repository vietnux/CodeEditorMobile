package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public j createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 1) {
                str = b.d(parcel, a);
            } else if (a2 == 2) {
                iBinder = b.l(parcel, a);
            } else if (a2 != 3) {
                b.q(parcel, a);
            } else {
                z = b.h(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new j(str, iBinder, z);
    }

    @Override // android.os.Parcelable.Creator
    public j[] newArray(int i2) {
        return new j[i2];
    }
}
