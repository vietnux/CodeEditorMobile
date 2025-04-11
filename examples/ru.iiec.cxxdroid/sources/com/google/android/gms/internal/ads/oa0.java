package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class oa0 implements Parcelable.Creator<na0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ na0 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        t70 t70 = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i2 = b.m(parcel, a);
                    break;
                case 2:
                    z = b.h(parcel, a);
                    break;
                case 3:
                    i3 = b.m(parcel, a);
                    break;
                case 4:
                    z2 = b.h(parcel, a);
                    break;
                case 5:
                    i4 = b.m(parcel, a);
                    break;
                case 6:
                    t70 = (t70) b.a(parcel, a, t70.CREATOR);
                    break;
                default:
                    b.q(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new na0(i2, z, i3, z2, i4, t70);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ na0[] newArray(int i2) {
        return new na0[i2];
    }
}
