package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import e.b.b.a.b.a;

public final class v extends fz implements u {
    v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ads.u
    public final IBinder x(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        Parcel a = a(1, M);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
