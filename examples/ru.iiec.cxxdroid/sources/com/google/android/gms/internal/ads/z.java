package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class z extends gz implements y {
    public static y a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof y ? (y) queryLocalInterface : new a0(iBinder);
    }
}
