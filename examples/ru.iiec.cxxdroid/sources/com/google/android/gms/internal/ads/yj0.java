package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e.b.a.a;

final class yj0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a f6133b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ vj0 f6134c;

    yj0(vj0 vj0, a aVar) {
        this.f6134c = vj0;
        this.f6133b = aVar;
    }

    public final void run() {
        try {
            this.f6134c.a.c(zj0.a(this.f6133b));
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
