package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class q60 extends fz implements o60 {
    q60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final r60 M0() {
        r60 r60;
        Parcel a = a(11, M());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            r60 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            r60 = queryLocalInterface instanceof r60 ? (r60) queryLocalInterface : new t60(readStrongBinder);
        }
        a.recycle();
        return r60;
    }

    @Override // com.google.android.gms.internal.ads.o60
    public final void a(r60 r60) {
        Parcel M = M();
        hz.a(M, r60);
        b(8, M);
    }
}
