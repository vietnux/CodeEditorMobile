package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class l70 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ k70 f4849b;

    l70(k70 k70) {
        this.f4849b = k70;
    }

    public final void run() {
        if (k70.a(this.f4849b) != null) {
            try {
                k70.a(this.f4849b).c(1);
            } catch (RemoteException e2) {
                qc.c("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
