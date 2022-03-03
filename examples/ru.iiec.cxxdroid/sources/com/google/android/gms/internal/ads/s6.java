package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class s6 implements Parcelable.Creator<r6> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r6 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        j40 j40 = null;
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 2) {
                j40 = (j40) b.a(parcel, a, j40.CREATOR);
            } else if (a2 != 3) {
                b.q(parcel, a);
            } else {
                str = b.d(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new r6(j40, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r6[] newArray(int i2) {
        return new r6[i2];
    }
}
