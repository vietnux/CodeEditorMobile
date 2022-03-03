package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;

public abstract class za0 extends gz implements ya0 {
    public za0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static ya0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof ya0 ? (ya0) queryLocalInterface : new ab0(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            a j1 = j1();
            parcel2.writeNoException();
            hz.a(parcel2, j1);
        } else if (i2 == 2) {
            Uri t1 = t1();
            parcel2.writeNoException();
            hz.b(parcel2, t1);
        } else if (i2 != 3) {
            return false;
        } else {
            double F0 = F0();
            parcel2.writeNoException();
            parcel2.writeDouble(F0);
        }
        return true;
    }
}
