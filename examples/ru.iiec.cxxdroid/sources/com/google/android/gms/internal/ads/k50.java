package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class k50 extends gz implements j50 {
    public k50() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        String str;
        if (i2 != 1) {
            if (i2 == 2) {
                str = k();
            } else if (i2 == 3) {
                boolean N = N();
                parcel2.writeNoException();
                hz.a(parcel2, N);
                return true;
            } else if (i2 == 4) {
                str = m0();
            } else if (i2 != 5) {
                return false;
            } else {
                a((j40) hz.a(parcel, j40.CREATOR), parcel.readInt());
            }
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        }
        a((j40) hz.a(parcel, j40.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
