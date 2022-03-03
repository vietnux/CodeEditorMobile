package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class o70 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ n70 f5128b;

    o70(n70 n70) {
        this.f5128b = n70;
    }

    public final void run() {
        if (n70.a(this.f5128b) != null) {
            try {
                n70.a(this.f5128b).a(1);
            } catch (RemoteException e2) {
                qc.c("Could not notify onRewardedVideoAdFailedToLoad event.", e2);
            }
        }
    }
}
