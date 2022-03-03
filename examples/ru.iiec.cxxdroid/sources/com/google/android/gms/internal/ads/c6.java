package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class c6 extends fz implements a6 {
    c6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.a6
    public final int J() {
        Parcel a = a(2, M());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.a6
    public final String a() {
        Parcel a = a(1, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
