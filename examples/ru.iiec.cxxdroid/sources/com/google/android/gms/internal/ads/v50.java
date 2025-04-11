package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.n;
import e.b.b.a.b.a;

public final class v50 extends fz implements u50 {
    v50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final IBinder a(a aVar, n40 n40, String str, ri0 ri0, int i2, int i3) {
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, n40);
        M.writeString(str);
        hz.a(M, ri0);
        M.writeInt(n.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        M.writeInt(i3);
        Parcel a = a(2, M);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
