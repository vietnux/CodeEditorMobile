package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.n;
import e.b.b.a.b.a;

public final class q50 extends fz implements p50 {
    q50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final IBinder a(a aVar, String str, ri0 ri0, int i2) {
        Parcel M = M();
        hz.a(M, aVar);
        M.writeString(str);
        hz.a(M, ri0);
        M.writeInt(n.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        Parcel a = a(1, M);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
