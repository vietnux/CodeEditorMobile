package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class mk0 implements vi<Object, Object> {
    private final /* synthetic */ ck0 a;

    mk0(lk0 lk0, ck0 ck0, xi0 xi0) {
        this.a = ck0;
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
