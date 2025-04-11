package com.google.android.gms.internal.ads;

import android.os.Parcel;
import e.b.b.a.b.a;

public abstract class c90 extends gz implements b90 {
    public c90() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        String str;
        if (i2 == 1) {
            str = I0();
        } else if (i2 != 2) {
            if (i2 == 3) {
                w(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
            } else if (i2 == 4) {
                b1();
            } else if (i2 != 5) {
                return false;
            } else {
                c();
            }
            parcel2.writeNoException();
            return true;
        } else {
            str = y1();
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}
