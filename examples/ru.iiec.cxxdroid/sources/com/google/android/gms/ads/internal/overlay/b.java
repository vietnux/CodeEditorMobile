package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class b implements Parcelable.Creator<c> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.f0.b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        while (parcel.dataPosition() < b2) {
            int a = com.google.android.gms.common.internal.f0.b.a(parcel);
            switch (com.google.android.gms.common.internal.f0.b.a(a)) {
                case 2:
                    str = com.google.android.gms.common.internal.f0.b.d(parcel, a);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.f0.b.d(parcel, a);
                    break;
                case 4:
                    str3 = com.google.android.gms.common.internal.f0.b.d(parcel, a);
                    break;
                case 5:
                    str4 = com.google.android.gms.common.internal.f0.b.d(parcel, a);
                    break;
                case 6:
                    str5 = com.google.android.gms.common.internal.f0.b.d(parcel, a);
                    break;
                case 7:
                    str6 = com.google.android.gms.common.internal.f0.b.d(parcel, a);
                    break;
                case 8:
                    str7 = com.google.android.gms.common.internal.f0.b.d(parcel, a);
                    break;
                case 9:
                    intent = (Intent) com.google.android.gms.common.internal.f0.b.a(parcel, a, Intent.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.f0.b.q(parcel, a);
                    break;
            }
        }
        com.google.android.gms.common.internal.f0.b.g(parcel, b2);
        return new c(str, str2, str3, str4, str5, str6, str7, intent);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i2) {
        return new c[i2];
    }
}
