package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class gc0 extends fz implements ec0 {
    gc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.ec0
    public final void a(tb0 tb0, String str) {
        Parcel M = M();
        hz.a(M, tb0);
        M.writeString(str);
        b(1, M);
    }
}
