package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class qk0 implements Parcelable.Creator<pk0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ pk0 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 1) {
                i2 = b.m(parcel, a);
            } else if (a2 == 2) {
                i3 = b.m(parcel, a);
            } else if (a2 != 3) {
                b.q(parcel, a);
            } else {
                i4 = b.m(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new pk0(i2, i3, i4);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ pk0[] newArray(int i2) {
        return new pk0[i2];
    }
}
