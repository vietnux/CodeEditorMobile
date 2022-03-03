package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class pi0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ii0 f5250b;

    pi0(oi0 oi0, ii0 ii0) {
        this.f5250b = ii0;
    }

    public final void run() {
        try {
            this.f5250b.f4636c.destroy();
        } catch (RemoteException e2) {
            qc.c("Could not destroy mediation adapter.", e2);
        }
    }
}
