package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import e.b.b.a.b.a;

public final class mc0 extends fz implements kc0 {
    mc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.kc0
    public final void a(r50 r50, a aVar) {
        Parcel M = M();
        hz.a(M, r50);
        hz.a(M, aVar);
        b(1, M);
    }
}
