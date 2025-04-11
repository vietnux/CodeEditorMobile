package com.google.android.gms.ads.n;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class n implements Parcelable.Creator<j> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        boolean z = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 1) {
                z = b.h(parcel, a);
            } else if (a2 != 2) {
                b.q(parcel, a);
            } else {
                iBinder = b.l(parcel, a);
            }
        }
        b.g(parcel, b2);
        return new j(z, iBinder);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i2) {
        return new j[i2];
    }
}
