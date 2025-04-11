package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;
import java.util.ArrayList;

public final class o3 implements Parcelable.Creator<n3> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n3 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        z3 z3Var = null;
        String str7 = null;
        String str8 = null;
        o7 o7Var = null;
        ArrayList<String> arrayList4 = null;
        ArrayList<String> arrayList5 = null;
        p3 p3Var = null;
        String str9 = null;
        ArrayList<String> arrayList6 = null;
        String str10 = null;
        y7 y7Var = null;
        String str11 = null;
        Bundle bundle = null;
        ArrayList<String> arrayList7 = null;
        String str12 = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i5 = 0;
        boolean z16 = false;
        boolean z17 = false;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i2 = b.m(parcel, a);
                    break;
                case 2:
                    str = b.d(parcel, a);
                    break;
                case 3:
                    str2 = b.d(parcel, a);
                    break;
                case 4:
                    arrayList = b.f(parcel, a);
                    break;
                case 5:
                    i3 = b.m(parcel, a);
                    break;
                case 6:
                    arrayList2 = b.f(parcel, a);
                    break;
                case 7:
                    j2 = b.n(parcel, a);
                    break;
                case 8:
                    z = b.h(parcel, a);
                    break;
                case 9:
                    j3 = b.n(parcel, a);
                    break;
                case 10:
                    arrayList3 = b.f(parcel, a);
                    break;
                case 11:
                    j4 = b.n(parcel, a);
                    break;
                case 12:
                    i4 = b.m(parcel, a);
                    break;
                case 13:
                    str3 = b.d(parcel, a);
                    break;
                case 14:
                    j5 = b.n(parcel, a);
                    break;
                case 15:
                    str4 = b.d(parcel, a);
                    break;
                case 16:
                case 17:
                case 20:
                case 27:
                case 41:
                default:
                    b.q(parcel, a);
                    break;
                case 18:
                    z2 = b.h(parcel, a);
                    break;
                case 19:
                    str5 = b.d(parcel, a);
                    break;
                case 21:
                    str6 = b.d(parcel, a);
                    break;
                case 22:
                    z3 = b.h(parcel, a);
                    break;
                case 23:
                    z4 = b.h(parcel, a);
                    break;
                case 24:
                    z5 = b.h(parcel, a);
                    break;
                case 25:
                    z6 = b.h(parcel, a);
                    break;
                case 26:
                    z7 = b.h(parcel, a);
                    break;
                case 28:
                    z3Var = (z3) b.a(parcel, a, z3.CREATOR);
                    break;
                case 29:
                    str7 = b.d(parcel, a);
                    break;
                case 30:
                    str8 = b.d(parcel, a);
                    break;
                case 31:
                    z8 = b.h(parcel, a);
                    break;
                case 32:
                    z9 = b.h(parcel, a);
                    break;
                case 33:
                    o7Var = (o7) b.a(parcel, a, o7.CREATOR);
                    break;
                case 34:
                    arrayList4 = b.f(parcel, a);
                    break;
                case 35:
                    arrayList5 = b.f(parcel, a);
                    break;
                case 36:
                    z10 = b.h(parcel, a);
                    break;
                case 37:
                    p3Var = (p3) b.a(parcel, a, p3.CREATOR);
                    break;
                case 38:
                    z11 = b.h(parcel, a);
                    break;
                case 39:
                    str9 = b.d(parcel, a);
                    break;
                case 40:
                    arrayList6 = b.f(parcel, a);
                    break;
                case 42:
                    z12 = b.h(parcel, a);
                    break;
                case 43:
                    str10 = b.d(parcel, a);
                    break;
                case 44:
                    y7Var = (y7) b.a(parcel, a, y7.CREATOR);
                    break;
                case 45:
                    str11 = b.d(parcel, a);
                    break;
                case 46:
                    z13 = b.h(parcel, a);
                    break;
                case 47:
                    z14 = b.h(parcel, a);
                    break;
                case 48:
                    bundle = b.a(parcel, a);
                    break;
                case 49:
                    z15 = b.h(parcel, a);
                    break;
                case 50:
                    i5 = b.m(parcel, a);
                    break;
                case 51:
                    z16 = b.h(parcel, a);
                    break;
                case 52:
                    arrayList7 = b.f(parcel, a);
                    break;
                case 53:
                    z17 = b.h(parcel, a);
                    break;
                case 54:
                    str12 = b.d(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new n3(i2, str, str2, arrayList, i3, arrayList2, j2, z, j3, arrayList3, j4, i4, str3, j5, str4, z2, str5, str6, z3, z4, z5, z6, z7, z3Var, str7, str8, z8, z9, o7Var, arrayList4, arrayList5, z10, p3Var, z11, str9, arrayList6, z12, str10, y7Var, str11, z13, z14, bundle, z15, i5, z16, arrayList7, z17, str12);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n3[] newArray(int i2) {
        return new n3[i2];
    }
}
