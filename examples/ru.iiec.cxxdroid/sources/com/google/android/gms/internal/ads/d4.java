package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.b;
import java.util.ArrayList;

public final class d4 implements Parcelable.Creator<c4> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c4 createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Bundle bundle = null;
        sc scVar = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    bundle = b.a(parcel, a);
                    break;
                case 2:
                    scVar = (sc) b.a(parcel, a, sc.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) b.a(parcel, a, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = b.d(parcel, a);
                    break;
                case 5:
                    arrayList = b.f(parcel, a);
                    break;
                case 6:
                    packageInfo = (PackageInfo) b.a(parcel, a, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = b.d(parcel, a);
                    break;
                case 8:
                    z = b.h(parcel, a);
                    break;
                case 9:
                    str3 = b.d(parcel, a);
                    break;
                default:
                    b.q(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new c4(bundle, scVar, applicationInfo, str, arrayList, packageInfo, str2, z, str3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c4[] newArray(int i2) {
        return new c4[i2];
    }
}
