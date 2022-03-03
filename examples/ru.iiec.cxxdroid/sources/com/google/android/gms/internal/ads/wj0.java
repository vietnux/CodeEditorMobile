package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e.b.a.a;

final class wj0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a f5941b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ vj0 f5942c;

    wj0(vj0 vj0, a aVar) {
        this.f5942c = vj0;
        this.f5941b = aVar;
    }

    public final void run() {
        try {
            this.f5942c.a.c(zj0.a(this.f5941b));
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
