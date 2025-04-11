package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;

public final class l20 implements Parcelable.Creator<k20> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k20 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 2:
                    str = b.d(parcel, a);
                    break;
                case 3:
                    j2 = b.n(parcel, a);
                    break;
                case 4:
                    str2 = b.d(parcel, a);
                    break;
                case 5:
                    str3 = b.d(parcel, a);
                    break;
                case 6:
                    str4 = b.d(parcel, a);
                    break;
                case 7:
                    bundle = b.a(parcel, a);
                    break;
                case 8:
                    z = b.h(parcel, a);
                    break;
                case 9:
                    j3 = b.n(parcel, a);
                    break;
                default:
                    b.q(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new k20(str, j2, str2, str3, str4, bundle, z, j3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k20[] newArray(int i2) {
        return new k20[i2];
    }
}
