package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class yb0 extends gz implements xb0 {
    public yb0() {
        super("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public static xb0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return queryLocalInterface instanceof xb0 ? (xb0) queryLocalInterface : new zb0(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        lb0 lb0;
        if (i2 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            lb0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
            lb0 = queryLocalInterface instanceof lb0 ? (lb0) queryLocalInterface : new nb0(readStrongBinder);
        }
        a(lb0);
        parcel2.writeNoException();
        return true;
    }
}
