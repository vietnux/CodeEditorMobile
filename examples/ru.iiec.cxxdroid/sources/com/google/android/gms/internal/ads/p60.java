package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class p60 extends gz implements o60 {
    public p60() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static o60 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof o60 ? (o60) queryLocalInterface : new q60(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        boolean z;
        float f2;
        r60 r60;
        switch (i2) {
            case 1:
                c1();
                parcel2.writeNoException();
                return true;
            case 2:
                y();
                parcel2.writeNoException();
                return true;
            case 3:
                k(hz.a(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                z = X0();
                parcel2.writeNoException();
                hz.a(parcel2, z);
                return true;
            case 5:
                int Q0 = Q0();
                parcel2.writeNoException();
                parcel2.writeInt(Q0);
                return true;
            case 6:
                f2 = n1();
                parcel2.writeNoException();
                parcel2.writeFloat(f2);
                return true;
            case 7:
                f2 = v1();
                parcel2.writeNoException();
                parcel2.writeFloat(f2);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    r60 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    r60 = queryLocalInterface instanceof r60 ? (r60) queryLocalInterface : new t60(readStrongBinder);
                }
                a(r60);
                parcel2.writeNoException();
                return true;
            case 9:
                f2 = L0();
                parcel2.writeNoException();
                parcel2.writeFloat(f2);
                return true;
            case 10:
                z = d1();
                parcel2.writeNoException();
                hz.a(parcel2, z);
                return true;
            case 11:
                r60 M0 = M0();
                parcel2.writeNoException();
                hz.a(parcel2, M0);
                return true;
            case 12:
                z = K0();
                parcel2.writeNoException();
                hz.a(parcel2, z);
                return true;
            default:
                return false;
        }
    }
}
