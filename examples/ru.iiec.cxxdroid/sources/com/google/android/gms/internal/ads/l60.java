package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import e.b.b.a.b.a;

public final class l60 extends fz implements j60 {
    l60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final void F() {
        b(1, M());
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final void a(float f2) {
        Parcel M = M();
        M.writeFloat(f2);
        b(2, M);
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final void b(String str, a aVar) {
        Parcel M = M();
        M.writeString(str);
        hz.a(M, aVar);
        b(6, M);
    }
}
