package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class s50 extends gz implements r50 {
    public s50() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        IInterface iInterface;
        boolean z;
        Parcelable parcelable;
        String str;
        g50 g50 = null;
        w50 w50 = null;
        g60 g60 = null;
        d50 d50 = null;
        a60 a60 = null;
        switch (i2) {
            case 1:
                iInterface = T0();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 2:
                destroy();
                parcel2.writeNoException();
                return true;
            case 3:
                z = m1();
                parcel2.writeNoException();
                hz.a(parcel2, z);
                return true;
            case 4:
                z = b((j40) hz.a(parcel, j40.CREATOR));
                parcel2.writeNoException();
                hz.a(parcel2, z);
                return true;
            case 5:
                y();
                parcel2.writeNoException();
                return true;
            case 6:
                E();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    g50 = queryLocalInterface instanceof g50 ? (g50) queryLocalInterface : new i50(readStrongBinder);
                }
                b(g50);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    a60 = queryLocalInterface2 instanceof a60 ? (a60) queryLocalInterface2 : new c60(readStrongBinder2);
                }
                a(a60);
                parcel2.writeNoException();
                return true;
            case 9:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 10:
                stopLoading();
                parcel2.writeNoException();
                return true;
            case 11:
                k1();
                parcel2.writeNoException();
                return true;
            case 12:
                parcelable = B0();
                parcel2.writeNoException();
                hz.b(parcel2, parcelable);
                return true;
            case 13:
                a((n40) hz.a(parcel, n40.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                a(z.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                a(e0.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                str = k();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 19:
                a(f90.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    d50 = queryLocalInterface3 instanceof d50 ? (d50) queryLocalInterface3 : new f50(readStrongBinder3);
                }
                a(d50);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    g60 = queryLocalInterface4 instanceof g60 ? (g60) queryLocalInterface4 : new i60(readStrongBinder4);
                }
                b(g60);
                parcel2.writeNoException();
                return true;
            case 22:
                i(hz.a(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                z = N();
                parcel2.writeNoException();
                hz.a(parcel2, z);
                return true;
            case 24:
                a(m6.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                b(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                iInterface = getVideoController();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 29:
                a((t70) hz.a(parcel, t70.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                a((u60) hz.a(parcel, u60.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                str = k0();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 32:
                iInterface = P0();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 33:
                iInterface = f1();
                parcel2.writeNoException();
                hz.a(parcel2, iInterface);
                return true;
            case 34:
                a(hz.a(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                str = m0();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    w50 = queryLocalInterface5 instanceof w50 ? (w50) queryLocalInterface5 : new y50(readStrongBinder5);
                }
                a(w50);
                parcel2.writeNoException();
                return true;
            case 37:
                parcelable = q0();
                parcel2.writeNoException();
                hz.b(parcel2, parcelable);
                return true;
        }
    }
}
