package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class p7 implements Parcelable.Creator<o7> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o7 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 2) {
                str = b.d(parcel, a);
            } else if (a2 != 3) {
                b.q(parcel, a);
            } else {
                i2 = b.m(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new o7(str, i2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o7[] newArray(int i2) {
        return new o7[i2];
    }
}
