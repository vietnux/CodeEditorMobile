package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class nk0 implements vi<wi, Object> {
    private final /* synthetic */ ek0 a;

    nk0(lk0 lk0, ek0 ek0, xi0 xi0) {
        this.a = ek0;
    }

    @Override // com.google.android.gms.internal.ads.vi
    public final void a(String str) {
        try {
            this.a.c(str);
        } catch (RemoteException e2) {
            qc.b("", e2);
        }
    }
}
