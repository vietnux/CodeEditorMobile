package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class b6 extends gz implements a6 {
    public b6() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            String a = a();
            parcel2.writeNoException();
            parcel2.writeString(a);
        } else if (i2 != 2) {
            return false;
        } else {
            int J = J();
            parcel2.writeNoException();
            parcel2.writeInt(J);
        }
        return true;
    }
}
