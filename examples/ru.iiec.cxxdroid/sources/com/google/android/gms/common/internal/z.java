package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

public class z extends a {
    public static final Parcelable.Creator<z> CREATOR = new a0();

    /* renamed from: b  reason: collision with root package name */
    private final int f3702b;

    /* renamed from: c  reason: collision with root package name */
    private final Account f3703c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3704d;

    /* renamed from: e  reason: collision with root package name */
    private final GoogleSignInAccount f3705e;

    z(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f3702b = i2;
        this.f3703c = account;
        this.f3704d = i3;
        this.f3705e = googleSignInAccount;
    }

    public z(Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i2, googleSignInAccount);
    }

    public Account t() {
        return this.f3703c;
    }

    public int u() {
        return this.f3704d;
    }

    public GoogleSignInAccount v() {
        return this.f3705e;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f3702b);
        c.a(parcel, 2, (Parcelable) t(), i2, false);
        c.a(parcel, 3, u());
        c.a(parcel, 4, (Parcelable) v(), i2, false);
        c.a(parcel, a);
    }
}
