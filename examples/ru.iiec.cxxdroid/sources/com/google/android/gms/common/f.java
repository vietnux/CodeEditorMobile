package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public class f implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public e createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i2 = 0;
        long j2 = -1;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 1) {
                str = b.d(parcel, a);
            } else if (a2 == 2) {
                i2 = b.m(parcel, a);
            } else if (a2 != 3) {
                b.q(parcel, a);
            } else {
                j2 = b.n(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new e(str, i2, j2);
    }

    @Override // android.os.Parcelable.Creator
    public e[] newArray(int i2) {
        return new e[i2];
    }
}
