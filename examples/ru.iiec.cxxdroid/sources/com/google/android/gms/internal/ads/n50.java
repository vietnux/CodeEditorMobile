package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.n.j;

public abstract class n50 extends gz implements m50 {
    public n50() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        g50 g50 = null;
        g60 g60 = null;
        switch (i2) {
            case 1:
                j50 N0 = N0();
                parcel2.writeNoException();
                hz.a(parcel2, N0);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    g50 = queryLocalInterface instanceof g50 ? (g50) queryLocalInterface : new i50(readStrongBinder);
                }
                a(g50);
                break;
            case 3:
                a(yb0.a(parcel.readStrongBinder()));
                break;
            case 4:
                a(cc0.a(parcel.readStrongBinder()));
                break;
            case 5:
                a(parcel.readString(), ic0.a(parcel.readStrongBinder()), fc0.a(parcel.readStrongBinder()));
                break;
            case 6:
                a((na0) hz.a(parcel, na0.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    g60 = queryLocalInterface2 instanceof g60 ? (g60) queryLocalInterface2 : new i60(readStrongBinder2);
                }
                a(g60);
                break;
            case 8:
                a(lc0.a(parcel.readStrongBinder()), (n40) hz.a(parcel, n40.CREATOR));
                break;
            case 9:
                a((j) hz.a(parcel, j.CREATOR));
                break;
            case 10:
                a(oc0.a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
