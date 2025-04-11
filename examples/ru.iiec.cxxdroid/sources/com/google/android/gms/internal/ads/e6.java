package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class e6 extends fz implements d6 {
    e6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    @Override // com.google.android.gms.internal.ads.d6
    public final void a(a6 a6Var, String str) {
        Parcel M = M();
        hz.a(M, a6Var);
        M.writeString(str);
        b(1, M);
    }
}
