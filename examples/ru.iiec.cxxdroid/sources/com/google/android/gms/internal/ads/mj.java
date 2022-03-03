package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class mj implements Parcelable.Creator<lj> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ lj createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i2 = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 1) {
                i2 = b.m(parcel, a);
            } else if (a2 != 2) {
                b.q(parcel, a);
            } else {
                bArr = b.b(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new lj(i2, bArr);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ lj[] newArray(int i2) {
        return new lj[i2];
    }
}
