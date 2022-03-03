package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class o40 implements Parcelable.Creator<n40> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n40 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        n40[] n40Arr = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 2:
                    str = b.d(parcel, a);
                    break;
                case 3:
                    i2 = b.m(parcel, a);
                    break;
                case 4:
                    i3 = b.m(parcel, a);
                    break;
                case 5:
                    z = b.h(parcel, a);
                    break;
                case 6:
                    i4 = b.m(parcel, a);
                    break;
                case 7:
                    i5 = b.m(parcel, a);
                    break;
                case 8:
                    n40Arr = (n40[]) b.b(parcel, a, n40.CREATOR);
                    break;
                case 9:
                    z2 = b.h(parcel, a);
                    break;
                case 10:
                    z3 = b.h(parcel, a);
                    break;
                case 11:
                    z4 = b.h(parcel, a);
                    break;
                default:
                    b.q(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new n40(str, i2, i3, z, i4, i5, n40Arr, z2, z3, z4);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n40[] newArray(int i2) {
        return new n40[i2];
    }
}
