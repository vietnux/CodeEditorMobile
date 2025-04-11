package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;

public abstract class h6 extends gz implements f6 {
    public h6() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public static f6 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return queryLocalInterface instanceof f6 ? (f6) queryLocalInterface : new i6(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            a((r6) hz.a(parcel, r6.CREATOR));
        } else if (i2 != 2) {
            l6 l6Var = null;
            d6 d6Var = null;
            if (i2 == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    l6Var = queryLocalInterface instanceof l6 ? (l6) queryLocalInterface : new n6(readStrongBinder);
                }
                a(l6Var);
            } else if (i2 != 34) {
                switch (i2) {
                    case 5:
                        boolean D0 = D0();
                        parcel2.writeNoException();
                        hz.a(parcel2, D0);
                        break;
                    case 6:
                        y();
                        break;
                    case 7:
                        E();
                        break;
                    case 8:
                        destroy();
                        break;
                    case 9:
                        o(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                        break;
                    case 10:
                        j(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                        break;
                    case 11:
                        g(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                        break;
                    case 12:
                        String k2 = k();
                        parcel2.writeNoException();
                        parcel2.writeString(k2);
                        break;
                    case 13:
                        b(parcel.readString());
                        break;
                    case 14:
                        a(x50.a(parcel.readStrongBinder()));
                        break;
                    case 15:
                        Bundle q0 = q0();
                        parcel2.writeNoException();
                        hz.b(parcel2, q0);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            d6Var = queryLocalInterface2 instanceof d6 ? (d6) queryLocalInterface2 : new e6(readStrongBinder2);
                        }
                        a(d6Var);
                        break;
                    default:
                        return false;
                }
                return true;
            } else {
                a(hz.a(parcel));
            }
        } else {
            e();
        }
        parcel2.writeNoException();
        return true;
    }
}
