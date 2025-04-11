package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.f0.b;

public class a0 implements Parcelable.Creator<z> {
    @Override // android.os.Parcelable.Creator
    public z createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Account account = null;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            int a2 = b.a(a);
            if (a2 == 1) {
                i2 = b.m(parcel, a);
            } else if (a2 == 2) {
                account = (Account) b.a(parcel, a, Account.CREATOR);
            } else if (a2 == 3) {
                i3 = b.m(parcel, a);
            } else if (a2 != 4) {
                b.q(parcel, a);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.a(parcel, a, GoogleSignInAccount.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new z(i2, account, i3, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public z[] newArray(int i2) {
        return new z[i2];
    }
}
