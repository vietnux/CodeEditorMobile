package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import e.b.b.a.b.a;

public final class vb0 extends fz implements tb0 {
    vb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final a U0() {
        Parcel a = a(9, M());
        a a2 = a.AbstractBinderC0100a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final o60 getVideoController() {
        Parcel a = a(7, M());
        o60 a2 = p60.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final String n() {
        Parcel a = a(4, M());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final boolean q(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        Parcel a = a(10, M);
        boolean a2 = hz.a(a);
        a.recycle();
        return a2;
    }
}
