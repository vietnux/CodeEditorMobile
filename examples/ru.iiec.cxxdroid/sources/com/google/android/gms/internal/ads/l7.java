package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;

public abstract class l7 extends gz implements k7 {
    public l7() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static k7 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof k7 ? (k7) queryLocalInterface : new m7(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                t(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            case 2:
                a(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                k(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            case 4:
                f(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            case 5:
                u(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            case 6:
                p(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            case 7:
                a(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), (o7) hz.a(parcel, o7.CREATOR));
                break;
            case 8:
                m(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            case 9:
                b(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                h(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            case 11:
                v(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            case 12:
                a((Bundle) hz.a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
