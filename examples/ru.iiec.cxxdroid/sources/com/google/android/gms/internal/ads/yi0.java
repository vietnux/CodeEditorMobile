package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class yi0 extends gz implements xi0 {
    public yi0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static xi0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof xi0 ? (xi0) queryLocalInterface : new zi0(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        aj0 aj0;
        switch (i2) {
            case 1:
                d();
                break;
            case 2:
                X();
                break;
            case 3:
                c(parcel.readInt());
                break;
            case 4:
                j0();
                break;
            case 5:
                f0();
                break;
            case 6:
                n0();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    aj0 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    aj0 = queryLocalInterface instanceof aj0 ? (aj0) queryLocalInterface : new cj0(readStrongBinder);
                }
                a(aj0);
                break;
            case 8:
                A0();
                break;
            case 9:
                a(parcel.readString(), parcel.readString());
                break;
            case 10:
                a(ub0.a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 11:
                w0();
                break;
            case 12:
                l(parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
