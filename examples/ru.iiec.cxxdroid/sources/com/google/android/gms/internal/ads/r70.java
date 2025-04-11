package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.f0.c;

@k2
public final class r70 extends n40 {
    public r70(n40 n40) {
        super(n40.f5046b, n40.f5047c, n40.f5048d, n40.f5049e, n40.f5050f, n40.f5051g, n40.f5052h, n40.f5053i, n40.f5054j, n40.f5055k);
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f5046b, false);
        c.a(parcel, 3, this.f5047c);
        c.a(parcel, 6, this.f5050f);
        c.a(parcel, a);
    }
}
