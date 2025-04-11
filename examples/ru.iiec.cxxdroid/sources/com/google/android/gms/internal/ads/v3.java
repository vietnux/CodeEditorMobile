package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class v3 extends gz implements u3 {
    public v3() {
        super("com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        a((n3) hz.a(parcel, n3.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
