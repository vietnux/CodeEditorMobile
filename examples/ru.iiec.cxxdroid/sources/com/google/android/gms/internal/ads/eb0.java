package com.google.android.gms.internal.ads;

import android.os.Parcel;
import e.b.b.a.b.a;

public abstract class eb0 extends gz implements db0 {
    public eb0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                a(parcel.readString(), a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            case 2:
                a j2 = j(parcel.readString());
                parcel2.writeNoException();
                hz.a(parcel2, j2);
                return true;
            case 3:
                d(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            case 4:
                destroy();
                break;
            case 5:
                d(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 6:
                e(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
