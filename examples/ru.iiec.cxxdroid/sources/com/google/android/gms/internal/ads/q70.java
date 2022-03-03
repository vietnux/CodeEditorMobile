package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class q70 implements Parcelable.Creator<p70> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p70 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            if (b.a(a) != 15) {
                b.q(parcel, a);
            } else {
                str = b.d(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new p70(str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p70[] newArray(int i2) {
        return new p70[i2];
    }
}
