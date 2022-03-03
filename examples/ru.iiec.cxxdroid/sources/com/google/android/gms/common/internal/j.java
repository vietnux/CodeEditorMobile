package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.e;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.r;
import java.util.Collection;

public class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: b  reason: collision with root package name */
    private final int f3667b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3668c;

    /* renamed from: d  reason: collision with root package name */
    private int f3669d;

    /* renamed from: e  reason: collision with root package name */
    private String f3670e;

    /* renamed from: f  reason: collision with root package name */
    private IBinder f3671f;

    /* renamed from: g  reason: collision with root package name */
    private Scope[] f3672g;

    /* renamed from: h  reason: collision with root package name */
    private Bundle f3673h;

    /* renamed from: i  reason: collision with root package name */
    private Account f3674i;

    /* renamed from: j  reason: collision with root package name */
    private e[] f3675j;

    /* renamed from: k  reason: collision with root package name */
    private e[] f3676k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f3677l;

    public j(int i2) {
        this.f3667b = 4;
        this.f3669d = h.a;
        this.f3668c = i2;
        this.f3677l = true;
    }

    j(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, e[] eVarArr, e[] eVarArr2, boolean z) {
        this.f3667b = i2;
        this.f3668c = i3;
        this.f3669d = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f3670e = "com.google.android.gms";
        } else {
            this.f3670e = str;
        }
        if (i2 < 2) {
            this.f3674i = a(iBinder);
        } else {
            this.f3671f = iBinder;
            this.f3674i = account;
        }
        this.f3672g = scopeArr;
        this.f3673h = bundle;
        this.f3675j = eVarArr;
        this.f3676k = eVarArr2;
        this.f3677l = z;
    }

    private static Account a(IBinder iBinder) {
        if (iBinder != null) {
            return a.a(r.a.a(iBinder));
        }
        return null;
    }

    public j a(Account account) {
        this.f3674i = account;
        return this;
    }

    public j a(Bundle bundle) {
        this.f3673h = bundle;
        return this;
    }

    public j a(r rVar) {
        if (rVar != null) {
            this.f3671f = rVar.asBinder();
        }
        return this;
    }

    public j a(Collection<Scope> collection) {
        this.f3672g = (Scope[]) collection.toArray(new Scope[collection.size()]);
        return this;
    }

    public j a(e[] eVarArr) {
        this.f3676k = eVarArr;
        return this;
    }

    public j b(String str) {
        this.f3670e = str;
        return this;
    }

    public j b(e[] eVarArr) {
        this.f3675j = eVarArr;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f3667b);
        c.a(parcel, 2, this.f3668c);
        c.a(parcel, 3, this.f3669d);
        c.a(parcel, 4, this.f3670e, false);
        c.a(parcel, 5, this.f3671f, false);
        c.a(parcel, 6, (Parcelable[]) this.f3672g, i2, false);
        c.a(parcel, 7, this.f3673h, false);
        c.a(parcel, 8, (Parcelable) this.f3674i, i2, false);
        c.a(parcel, 10, (Parcelable[]) this.f3675j, i2, false);
        c.a(parcel, 11, (Parcelable[]) this.f3676k, i2, false);
        c.a(parcel, 12, this.f3677l);
        c.a(parcel, a);
    }
}
