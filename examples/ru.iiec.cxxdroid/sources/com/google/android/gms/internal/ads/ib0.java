package com.google.android.gms.internal.ads;

import android.os.Parcel;
import e.b.b.a.b.a;

public abstract class ib0 extends gz implements hb0 {
    public ib0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            d(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
        } else if (i2 == 2) {
            g1();
        } else if (i2 != 3) {
            return false;
        } else {
            e(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
