package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.f0.b;

public class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public j createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        e[] eVarArr = null;
        e[] eVarArr2 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a = b.a(parcel);
            switch (b.a(a)) {
                case 1:
                    i2 = b.m(parcel, a);
                    break;
                case 2:
                    i3 = b.m(parcel, a);
                    break;
                case 3:
                    i4 = b.m(parcel, a);
                    break;
                case 4:
                    str = b.d(parcel, a);
                    break;
                case 5:
                    iBinder = b.l(parcel, a);
                    break;
                case 6:
                    scopeArr = (Scope[]) b.b(parcel, a, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.a(parcel, a);
                    break;
                case 8:
                    account = (Account) b.a(parcel, a, Account.CREATOR);
                    break;
                case 9:
                default:
                    b.q(parcel, a);
                    break;
                case 10:
                    eVarArr = (e[]) b.b(parcel, a, e.CREATOR);
                    break;
                case 11:
                    eVarArr2 = (e[]) b.b(parcel, a, e.CREATOR);
                    break;
                case 12:
                    z = b.h(parcel, a);
                    break;
            }
        }
        b.g(parcel, b2);
        return new j(i2, i3, i4, str, iBinder, scopeArr, bundle, account, eVarArr, eVarArr2, z);
    }

    @Override // android.os.Parcelable.Creator
    public j[] newArray(int i2) {
        return new j[i2];
    }
}
