package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class s60 extends gz implements r60 {
    public s60() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            R0();
            throw null;
        } else if (i2 == 2) {
            Y0();
            throw null;
        } else if (i2 == 3) {
            W0();
            throw null;
        } else if (i2 == 4) {
            w0();
            throw null;
        } else if (i2 != 5) {
            return false;
        } else {
            h(hz.a(parcel));
            throw null;
        }
    }
}
