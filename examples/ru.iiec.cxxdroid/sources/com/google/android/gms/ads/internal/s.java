package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class s implements Parcelable.Creator<r> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f2 = 0.0f;
        int i2 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 2:
                    z = b.h(parcel, a);
                    break;
                case 3:
                    z2 = b.h(parcel, a);
                    break;
                case 4:
                    str = b.d(parcel, a);
                    break;
                case 5:
                    z3 = b.h(parcel, a);
                    break;
                case 6:
                    f2 = b.j(parcel, a);
                    break;
                case 7:
                    i2 = b.m(parcel, a);
                    break;
                case 8:
                    z4 = b.h(parcel, a);
                    break;
                case 9:
                    z5 = b.h(parcel, a);
                    break;
                case 10:
                    z6 = b.h(parcel, a);
                    break;
                default:
                    b.q(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new r(z, z2, str, z3, f2, i2, z4, z5, z6);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r[] newArray(int i2) {
        return new r[i2];
    }
}
