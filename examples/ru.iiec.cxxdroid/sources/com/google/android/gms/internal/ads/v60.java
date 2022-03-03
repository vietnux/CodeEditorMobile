package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class v60 implements Parcelable.Creator<u60> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u60 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            if (b.a(a) != 2) {
                b.q(parcel, a);
            } else {
                i2 = b.m(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new u60(i2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u60[] newArray(int i2) {
        return new u60[i2];
    }
}
