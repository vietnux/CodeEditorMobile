package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.n;
import e.b.b.a.b.a;

public final class n60 extends fz implements m60 {
    n60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.m60
    public final IBinder c(a aVar, int i2) {
        Parcel M = M();
        hz.a(M, aVar);
        M.writeInt(n.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        Parcel a = a(1, M);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
