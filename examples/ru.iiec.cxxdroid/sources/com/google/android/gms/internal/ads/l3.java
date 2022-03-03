package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;
import java.util.ArrayList;

public final class l3 implements Parcelable.Creator<j3> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j3 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        long j2 = 0;
        long j3 = 0;
        Bundle bundle = null;
        j40 j40 = null;
        n40 n40 = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        sc scVar = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        na0 na0 = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        u60 u60 = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i8 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i9 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i2 = b.m(parcel, a);
                    break;
                case 2:
                    bundle = b.a(parcel, a);
                    break;
                case 3:
                    j40 = (j40) b.a(parcel, a, j40.CREATOR);
                    break;
                case 4:
                    n40 = (n40) b.a(parcel, a, n40.CREATOR);
                    break;
                case 5:
                    str = b.d(parcel, a);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) b.a(parcel, a, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) b.a(parcel, a, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = b.d(parcel, a);
                    break;
                case 9:
                    str3 = b.d(parcel, a);
                    break;
                case 10:
                    str4 = b.d(parcel, a);
                    break;
                case 11:
                    scVar = (sc) b.a(parcel, a, sc.CREATOR);
                    break;
                case 12:
                    bundle2 = b.a(parcel, a);
                    break;
                case 13:
                    i3 = b.m(parcel, a);
                    break;
                case 14:
                    arrayList = b.f(parcel, a);
                    break;
                case 15:
                    bundle3 = b.a(parcel, a);
                    break;
                case 16:
                    z = b.h(parcel, a);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                default:
                    b.q(parcel, a);
                    break;
                case 18:
                    i4 = b.m(parcel, a);
                    break;
                case 19:
                    i5 = b.m(parcel, a);
                    break;
                case 20:
                    f2 = b.j(parcel, a);
                    break;
                case 21:
                    str5 = b.d(parcel, a);
                    break;
                case 25:
                    j2 = b.n(parcel, a);
                    break;
                case 26:
                    str6 = b.d(parcel, a);
                    break;
                case 27:
                    arrayList2 = b.f(parcel, a);
                    break;
                case 28:
                    str7 = b.d(parcel, a);
                    break;
                case 29:
                    na0 = (na0) b.a(parcel, a, na0.CREATOR);
                    break;
                case 30:
                    arrayList3 = b.f(parcel, a);
                    break;
                case 31:
                    j3 = b.n(parcel, a);
                    break;
                case 33:
                    str8 = b.d(parcel, a);
                    break;
                case 34:
                    f3 = b.j(parcel, a);
                    break;
                case 35:
                    i6 = b.m(parcel, a);
                    break;
                case 36:
                    i7 = b.m(parcel, a);
                    break;
                case 37:
                    z3 = b.h(parcel, a);
                    break;
                case 38:
                    z4 = b.h(parcel, a);
                    break;
                case 39:
                    str9 = b.d(parcel, a);
                    break;
                case 40:
                    z2 = b.h(parcel, a);
                    break;
                case 41:
                    str10 = b.d(parcel, a);
                    break;
                case 42:
                    z5 = b.h(parcel, a);
                    break;
                case 43:
                    i8 = b.m(parcel, a);
                    break;
                case 44:
                    bundle4 = b.a(parcel, a);
                    break;
                case 45:
                    str11 = b.d(parcel, a);
                    break;
                case 46:
                    u60 = (u60) b.a(parcel, a, u60.CREATOR);
                    break;
                case 47:
                    z6 = b.h(parcel, a);
                    break;
                case 48:
                    bundle5 = b.a(parcel, a);
                    break;
                case 49:
                    str12 = b.d(parcel, a);
                    break;
                case 50:
                    str13 = b.d(parcel, a);
                    break;
                case 51:
                    str14 = b.d(parcel, a);
                    break;
                case 52:
                    z7 = b.h(parcel, a);
                    break;
                case 53:
                    arrayList4 = b.c(parcel, a);
                    break;
                case 54:
                    str15 = b.d(parcel, a);
                    break;
                case 55:
                    arrayList5 = b.f(parcel, a);
                    break;
                case 56:
                    i9 = b.m(parcel, a);
                    break;
                case 57:
                    z8 = b.h(parcel, a);
                    break;
                case 58:
                    z9 = b.h(parcel, a);
                    break;
                case 59:
                    z10 = b.h(parcel, a);
                    break;
                case 60:
                    arrayList6 = b.f(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new j3(i2, bundle, j40, n40, str, applicationInfo, packageInfo, str2, str3, str4, scVar, bundle2, i3, arrayList, bundle3, z, i4, i5, f2, str5, j2, str6, arrayList2, str7, na0, arrayList3, j3, str8, f3, z2, i6, i7, z3, z4, str9, str10, z5, i8, bundle4, str11, u60, z6, bundle5, str12, str13, str14, z7, arrayList4, str15, arrayList5, i9, z8, z9, z10, arrayList6);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j3[] newArray(int i2) {
        return new j3[i2];
    }
}
