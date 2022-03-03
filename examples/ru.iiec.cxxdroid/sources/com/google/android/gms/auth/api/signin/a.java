package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.f0.b;
import java.util.ArrayList;

public class a implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public GoogleSignInAccount createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j2 = 0;
        int i2 = 0;
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
                    str3 = b.d(parcel, a);
                    break;
                case 5:
                    str4 = b.d(parcel, a);
                    break;
                case 6:
                    uri = (Uri) b.a(parcel, a, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.d(parcel, a);
                    break;
                case 8:
                    j2 = b.n(parcel, a);
                    break;
                case 9:
                    str6 = b.d(parcel, a);
                    break;
                case 10:
                    arrayList = b.c(parcel, a, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.d(parcel, a);
                    break;
                case 12:
                    str8 = b.d(parcel, a);
                    break;
                default:
                    b.q(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new GoogleSignInAccount(i2, str, str2, str3, str4, uri, str5, j2, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public GoogleSignInAccount[] newArray(int i2) {
        return new GoogleSignInAccount[i2];
    }
}
