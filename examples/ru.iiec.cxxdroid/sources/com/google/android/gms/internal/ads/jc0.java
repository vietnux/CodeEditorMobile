package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class jc0 extends fz implements hc0 {
    jc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.hc0
    public final void a(tb0 tb0) {
        Parcel M = M();
        hz.a(M, tb0);
        b(1, M);
    }
}
