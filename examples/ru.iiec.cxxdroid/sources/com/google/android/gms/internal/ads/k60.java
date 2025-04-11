package com.google.android.gms.internal.ads;

import android.os.Parcel;
import e.b.b.a.b.a;

public abstract class k60 extends gz implements j60 {
    public k60() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                F();
                break;
            case 2:
                a(parcel.readFloat());
                break;
            case 3:
                d(parcel.readString());
                break;
            case 4:
                j(hz.a(parcel));
                break;
            case 5:
                a(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 6:
                b(parcel.readString(), a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            case 7:
                float h1 = h1();
                parcel2.writeNoException();
                parcel2.writeFloat(h1);
                return true;
            case 8:
                boolean s1 = s1();
                parcel2.writeNoException();
                hz.a(parcel2, s1);
                return true;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
