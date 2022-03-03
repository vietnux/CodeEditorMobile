package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.r;
import com.google.android.gms.common.internal.f0.b;
import com.google.android.gms.internal.ads.sc;

public final class m implements Parcelable.Creator<AdOverlayInfoParcel> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        c cVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        sc scVar = null;
        String str4 = null;
        r rVar = null;
        IBinder iBinder6 = null;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 2:
                    cVar = (c) b.a(parcel, a, c.CREATOR);
                    break;
                case 3:
                    iBinder = b.l(parcel, a);
                    break;
                case 4:
                    iBinder2 = b.l(parcel, a);
                    break;
                case 5:
                    iBinder3 = b.l(parcel, a);
                    break;
                case 6:
                    iBinder4 = b.l(parcel, a);
                    break;
                case 7:
                    str = b.d(parcel, a);
                    break;
                case 8:
                    z = b.h(parcel, a);
                    break;
                case 9:
                    str2 = b.d(parcel, a);
                    break;
                case 10:
                    iBinder5 = b.l(parcel, a);
                    break;
                case 11:
                    i2 = b.m(parcel, a);
                    break;
                case 12:
                    i3 = b.m(parcel, a);
                    break;
                case 13:
                    str3 = b.d(parcel, a);
                    break;
                case 14:
                    scVar = (sc) b.a(parcel, a, sc.CREATOR);
                    break;
                case 15:
                default:
                    b.q(parcel, a);
                    break;
                case 16:
                    str4 = b.d(parcel, a);
                    break;
                case 17:
                    rVar = (r) b.a(parcel, a, r.CREATOR);
                    break;
                case 18:
                    iBinder6 = b.l(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new AdOverlayInfoParcel(cVar, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i2, i3, str3, scVar, str4, rVar, iBinder6);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel[] newArray(int i2) {
        return new AdOverlayInfoParcel[i2];
    }
}
