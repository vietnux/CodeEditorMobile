package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class c60 extends fz implements a60 {
    c60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final void a(String str, String str2) {
        Parcel M = M();
        M.writeString(str);
        M.writeString(str2);
        b(1, M);
    }
}
