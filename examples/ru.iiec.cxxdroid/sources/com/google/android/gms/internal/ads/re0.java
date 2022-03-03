package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* access modifiers changed from: package-private */
public final class re0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ se0 f5438b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ te0 f5439c;

    re0(sd0 sd0, se0 se0, te0 te0) {
        this.f5438b = se0;
        this.f5439c = te0;
    }

    public final void run() {
        try {
            this.f5438b.a(this.f5439c);
        } catch (RemoteException e2) {
            qc.c("Could not propagate interstitial ad event.", e2);
        }
    }
}
