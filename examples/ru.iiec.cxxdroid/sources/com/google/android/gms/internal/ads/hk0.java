package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;

public abstract class hk0 extends gz implements gk0 {
    public hk0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        pk0 pk0;
        ik0 ik0 = null;
        ek0 fk0 = null;
        ck0 dk0 = null;
        switch (i2) {
            case 1:
                a a = a.AbstractBinderC0100a.a(parcel.readStrongBinder());
                String readString = parcel.readString();
                Bundle bundle = (Bundle) hz.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                    ik0 = queryLocalInterface instanceof ik0 ? (ik0) queryLocalInterface : new jk0(readStrongBinder);
                }
                a(a, readString, bundle, ik0);
                parcel2.writeNoException();
                return true;
            case 2:
                pk0 = w1();
                parcel2.writeNoException();
                hz.b(parcel2, pk0);
                return true;
            case 3:
                pk0 = o1();
                parcel2.writeNoException();
                hz.b(parcel2, pk0);
                return true;
            case 4:
                byte[] createByteArray = parcel.createByteArray();
                String readString2 = parcel.readString();
                Bundle bundle2 = (Bundle) hz.a(parcel, Bundle.CREATOR);
                a a2 = a.AbstractBinderC0100a.a(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    dk0 = queryLocalInterface2 instanceof ck0 ? (ck0) queryLocalInterface2 : new dk0(readStrongBinder2);
                }
                a(createByteArray, readString2, bundle2, a2, dk0, yi0.a(parcel.readStrongBinder()), (n40) hz.a(parcel, n40.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                o60 videoController = getVideoController();
                parcel2.writeNoException();
                hz.a(parcel2, videoController);
                return true;
            case 6:
                byte[] createByteArray2 = parcel.createByteArray();
                String readString3 = parcel.readString();
                Bundle bundle3 = (Bundle) hz.a(parcel, Bundle.CREATOR);
                a a3 = a.AbstractBinderC0100a.a(parcel.readStrongBinder());
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    fk0 = queryLocalInterface3 instanceof ek0 ? (ek0) queryLocalInterface3 : new fk0(readStrongBinder3);
                }
                a(createByteArray2, readString3, bundle3, a3, fk0, yi0.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
