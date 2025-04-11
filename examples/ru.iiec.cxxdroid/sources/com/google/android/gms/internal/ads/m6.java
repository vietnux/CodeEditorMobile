package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class m6 extends gz implements l6 {
    public m6() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public static l6 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return queryLocalInterface instanceof l6 ? (l6) queryLocalInterface : new n6(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        a6 a6Var;
        switch (i2) {
            case 1:
                I();
                break;
            case 2:
                s();
                break;
            case 3:
                o();
                break;
            case 4:
                q();
                break;
            case 5:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    a6Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    a6Var = queryLocalInterface instanceof a6 ? (a6) queryLocalInterface : new c6(readStrongBinder);
                }
                a(a6Var);
                break;
            case 6:
                r();
                break;
            case 7:
                a(parcel.readInt());
                break;
            case 8:
                p();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
