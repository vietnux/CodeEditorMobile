package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.c.g.b;
import e.b.b.a.c.g.c;

public interface r extends IInterface {

    public static abstract class a extends b implements r {

        /* renamed from: com.google.android.gms.common.internal.r$a$a  reason: collision with other inner class name */
        public static class C0079a extends e.b.b.a.c.g.a implements r {
            C0079a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            @Override // com.google.android.gms.common.internal.r
            public Account f() {
                Parcel a = a(2, M());
                Account account = (Account) c.a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        public static r a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof r ? (r) queryLocalInterface : new C0079a(iBinder);
        }
    }

    Account f();
}
