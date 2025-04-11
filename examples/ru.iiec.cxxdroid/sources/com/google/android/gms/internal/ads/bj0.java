package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class bj0 extends gz implements aj0 {
    public bj0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        int i1 = i1();
        parcel2.writeNoException();
        parcel2.writeInt(i1);
        return true;
    }
}
