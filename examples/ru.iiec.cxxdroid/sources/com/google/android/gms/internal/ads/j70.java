package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* access modifiers changed from: package-private */
public final class j70 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ i70 f4689b;

    j70(i70 i70) {
        this.f4689b = i70;
    }

    public final void run() {
        if (this.f4689b.f4593b.f4401b != null) {
            try {
                this.f4689b.f4593b.f4401b.c(1);
            } catch (RemoteException e2) {
                qc.c("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
