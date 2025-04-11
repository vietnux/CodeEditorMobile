package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class u70 implements Parcelable.Creator<t70> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t70 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 2) {
                z = b.h(parcel, a);
            } else if (a2 == 3) {
                z2 = b.h(parcel, a);
            } else if (a2 != 4) {
                b.q(parcel, a);
            } else {
                z3 = b.h(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new t70(z, z2, z3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t70[] newArray(int i2) {
        return new t70[i2];
    }
}
