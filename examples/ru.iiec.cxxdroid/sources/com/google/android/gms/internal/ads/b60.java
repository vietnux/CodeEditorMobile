package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class b60 extends gz implements a60 {
    public b60() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static a60 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof a60 ? (a60) queryLocalInterface : new c60(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        a(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
