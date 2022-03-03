package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class ti0 extends fz implements ri0 {
    ti0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final ui0 h(String str) {
        ui0 ui0;
        Parcel M = M();
        M.writeString(str);
        Parcel a = a(1, M);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            ui0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            ui0 = queryLocalInterface instanceof ui0 ? (ui0) queryLocalInterface : new wi0(readStrongBinder);
        }
        a.recycle();
        return ui0;
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final boolean k(String str) {
        Parcel M = M();
        M.writeString(str);
        Parcel a = a(2, M);
        boolean a2 = hz.a(a);
        a.recycle();
        return a2;
    }
}
