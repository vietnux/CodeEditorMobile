package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class e0 extends gz implements d0 {
    public static d0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof d0 ? (d0) queryLocalInterface : new f0(iBinder);
    }
}
