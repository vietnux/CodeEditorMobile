package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;
import java.util.ArrayList;

public final class l40 implements Parcelable.Creator<j40> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j40 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        p70 p70 = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i2 = b.m(parcel, a);
                    break;
                case 2:
                    j2 = b.n(parcel, a);
                    break;
                case 3:
                    bundle = b.a(parcel, a);
                    break;
                case 4:
                    i3 = b.m(parcel, a);
                    break;
                case 5:
                    arrayList = b.f(parcel, a);
                    break;
                case 6:
                    z = b.h(parcel, a);
                    break;
                case 7:
                    i4 = b.m(parcel, a);
                    break;
                case 8:
                    z2 = b.h(parcel, a);
                    break;
                case 9:
                    str = b.d(parcel, a);
                    break;
                case 10:
                    p70 = (p70) b.a(parcel, a, p70.CREATOR);
                    break;
                case 11:
                    location = (Location) b.a(parcel, a, Location.CREATOR);
                    break;
                case 12:
                    str2 = b.d(parcel, a);
                    break;
                case 13:
                    bundle2 = b.a(parcel, a);
                    break;
                case 14:
                    bundle3 = b.a(parcel, a);
                    break;
                case 15:
                    arrayList2 = b.f(parcel, a);
                    break;
                case 16:
                    str3 = b.d(parcel, a);
                    break;
                case 17:
                    str4 = b.d(parcel, a);
                    break;
                case 18:
                    z3 = b.h(parcel, a);
                    break;
                default:
                    b.q(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new j40(i2, j2, bundle, i3, arrayList, z, i4, z2, str, p70, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j40[] newArray(int i2) {
        return new j40[i2];
    }
}
