package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class rc0 extends fz implements qc0 {
    rc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.qc0
    public final void f(String str) {
        Parcel M = M();
        M.writeString(str);
        b(1, M);
    }

    @Override // com.google.android.gms.internal.ads.qc0
    public final void x1() {
        b(2, M());
    }
}
