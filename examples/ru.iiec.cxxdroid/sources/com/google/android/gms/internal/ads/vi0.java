package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;

public abstract class vi0 extends gz implements ui0 {
    public vi0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        IInterface iInterface;
        boolean z;
        Bundle bundle;
        xi0 xi0 = null;
        switch (i2) {
            case 1:
                a a = a.AbstractBinderC0100a.a(parcel.readStrongBinder());
                n40 n40 = (n40) hz.a(parcel, n40.CREATOR);
                j40 j40 = (j40) hz.a(parcel, j40.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xi0 = queryLocalInterface instanceof xi0 ? (xi0) queryLocalInterface : new zi0(readStrongBinder);
                }
                a(a, n40, j40, readString, xi0);
                parcel2.writeNoException();
                return true;
            case 2:
                iInterface = getView();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 3:
                a a2 = a.AbstractBinderC0100a.a(parcel.readStrongBinder());
                j40 j402 = (j40) hz.a(parcel, j40.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xi0 = queryLocalInterface2 instanceof xi0 ? (xi0) queryLocalInterface2 : new zi0(readStrongBinder2);
                }
                a(a2, j402, readString2, xi0);
                parcel2.writeNoException();
                return true;
            case 4:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 5:
                destroy();
                parcel2.writeNoException();
                return true;
            case 6:
                a a3 = a.AbstractBinderC0100a.a(parcel.readStrongBinder());
                n40 n402 = (n40) hz.a(parcel, n40.CREATOR);
                j40 j403 = (j40) hz.a(parcel, j40.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xi0 = queryLocalInterface3 instanceof xi0 ? (xi0) queryLocalInterface3 : new zi0(readStrongBinder3);
                }
                a(a3, n402, j403, readString3, readString4, xi0);
                parcel2.writeNoException();
                return true;
            case 7:
                a a4 = a.AbstractBinderC0100a.a(parcel.readStrongBinder());
                j40 j404 = (j40) hz.a(parcel, j40.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xi0 = queryLocalInterface4 instanceof xi0 ? (xi0) queryLocalInterface4 : new zi0(readStrongBinder4);
                }
                a(a4, j404, readString5, readString6, xi0);
                parcel2.writeNoException();
                return true;
            case 8:
                y();
                parcel2.writeNoException();
                return true;
            case 9:
                E();
                parcel2.writeNoException();
                return true;
            case 10:
                a(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), (j40) hz.a(parcel, j40.CREATOR), parcel.readString(), l7.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                a((j40) hz.a(parcel, j40.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                showVideo();
                parcel2.writeNoException();
                return true;
            case 13:
                z = isInitialized();
                parcel2.writeNoException();
                hz.a(parcel2, z);
                return true;
            case 14:
                a a5 = a.AbstractBinderC0100a.a(parcel.readStrongBinder());
                j40 j405 = (j40) hz.a(parcel, j40.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xi0 = queryLocalInterface5 instanceof xi0 ? (xi0) queryLocalInterface5 : new zi0(readStrongBinder5);
                }
                a(a5, j405, readString7, readString8, xi0, (na0) hz.a(parcel, na0.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                iInterface = H0();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 16:
                iInterface = Z0();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 17:
                bundle = zzmq();
                parcel2.writeNoException();
                hz.b(parcel2, bundle);
                return true;
            case 18:
                bundle = getInterstitialAdapterInfo();
                parcel2.writeNoException();
                hz.b(parcel2, bundle);
                return true;
            case 19:
                bundle = u1();
                parcel2.writeNoException();
                hz.b(parcel2, bundle);
                return true;
            case 20:
                a((j40) hz.a(parcel, j40.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                l(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                z = J0();
                parcel2.writeNoException();
                hz.a(parcel2, z);
                return true;
            case 23:
                a(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), l7.a(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                iInterface = a1();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 25:
                a(hz.a(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                iInterface = getVideoController();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 27:
                iInterface = q1();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            default:
                return false;
        }
    }
}
