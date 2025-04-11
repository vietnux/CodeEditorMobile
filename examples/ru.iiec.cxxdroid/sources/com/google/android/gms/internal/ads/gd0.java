package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class gd0 implements Parcelable.Creator<fd0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ fd0 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 1) {
                str = b.d(parcel, a);
            } else if (a2 == 2) {
                strArr = b.e(parcel, a);
            } else if (a2 != 3) {
                b.q(parcel, a);
            } else {
                strArr2 = b.e(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new fd0(str, strArr, strArr2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ fd0[] newArray(int i2) {
        return new fd0[i2];
    }
}
