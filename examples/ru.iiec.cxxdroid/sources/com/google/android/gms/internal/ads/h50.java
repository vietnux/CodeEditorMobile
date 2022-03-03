package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class h50 extends gz implements g50 {
    public h50() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                X();
                break;
            case 2:
                c(parcel.readInt());
                break;
            case 3:
                j0();
                break;
            case 4:
                n0();
                break;
            case 5:
                f0();
                break;
            case 6:
                d();
                break;
            case 7:
                A0();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
