package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.n;
import e.b.b.a.b.a;

public final class k6 extends fz implements j6 {
    k6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    @Override // com.google.android.gms.internal.ads.j6
    public final IBinder a(a aVar, ri0 ri0, int i2) {
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, ri0);
        M.writeInt(n.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        Parcel a = a(1, M);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
