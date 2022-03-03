package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class i20 implements Parcelable.Creator<h20> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h20 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            if (b.a(a) != 2) {
                b.q(parcel, a);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) b.a(parcel, a, ParcelFileDescriptor.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new h20(parcelFileDescriptor);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h20[] newArray(int i2) {
        return new h20[i2];
    }
}
