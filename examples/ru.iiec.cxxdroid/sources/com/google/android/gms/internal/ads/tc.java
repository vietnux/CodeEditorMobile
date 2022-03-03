package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class tc implements Parcelable.Creator<sc> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ sc createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 2) {
                str = b.d(parcel, a);
            } else if (a2 == 3) {
                i2 = b.m(parcel, a);
            } else if (a2 == 4) {
                i3 = b.m(parcel, a);
            } else if (a2 == 5) {
                z = b.h(parcel, a);
            } else if (a2 != 6) {
                b.q(parcel, a);
            } else {
                z2 = b.h(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new sc(str, i2, i3, z, z2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ sc[] newArray(int i2) {
        return new sc[i2];
    }
}
