package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class cj0 extends fz implements aj0 {
    cj0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    @Override // com.google.android.gms.internal.ads.aj0
    public final int i1() {
        Parcel a = a(1, M());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
