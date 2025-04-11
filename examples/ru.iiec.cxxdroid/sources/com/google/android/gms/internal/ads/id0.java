package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class id0 implements Parcelable.Creator<hd0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hd0 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j2 = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    z = b.h(parcel, a);
                    break;
                case 2:
                    str = b.d(parcel, a);
                    break;
                case 3:
                    i2 = b.m(parcel, a);
                    break;
                case 4:
                    bArr = b.b(parcel, a);
                    break;
                case 5:
                    strArr = b.e(parcel, a);
                    break;
                case 6:
                    strArr2 = b.e(parcel, a);
                    break;
                case 7:
                    z2 = b.h(parcel, a);
                    break;
                case 8:
                    j2 = b.n(parcel, a);
                    break;
                default:
                    b.q(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new hd0(z, str, i2, bArr, strArr, strArr2, z2, j2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hd0[] newArray(int i2) {
        return new hd0[i2];
    }
}
