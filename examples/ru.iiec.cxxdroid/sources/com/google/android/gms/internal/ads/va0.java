package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

public abstract class va0 extends gz implements ua0 {
    public va0() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 2) {
            String v = v();
            parcel2.writeNoException();
            parcel2.writeString(v);
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            List<ya0> O0 = O0();
            parcel2.writeNoException();
            parcel2.writeList(O0);
            return true;
        }
    }
}
