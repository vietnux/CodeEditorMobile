package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class oc0 extends gz implements nc0 {
    public oc0() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static nc0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return queryLocalInterface instanceof nc0 ? (nc0) queryLocalInterface : new pc0(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        sc0 sc0;
        if (i2 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            sc0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            sc0 = queryLocalInterface instanceof sc0 ? (sc0) queryLocalInterface : new uc0(readStrongBinder);
        }
        a(sc0);
        parcel2.writeNoException();
        return true;
    }
}
