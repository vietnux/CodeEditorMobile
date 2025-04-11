package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class si0 extends gz implements ri0 {
    public si0() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static ri0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof ri0 ? (ri0) queryLocalInterface : new ti0(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        IInterface iInterface;
        if (i2 == 1) {
            iInterface = h(parcel.readString());
        } else if (i2 == 2) {
            boolean k2 = k(parcel.readString());
            parcel2.writeNoException();
            hz.a(parcel2, k2);
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            iInterface = g(parcel.readString());
        }
        parcel2.writeNoException();
        hz.a(parcel2, iInterface);
        return true;
    }
}
