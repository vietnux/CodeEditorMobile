package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.tb0;

/* access modifiers changed from: package-private */
public final class t1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ tb0 f3335b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ o1 f3336c;

    t1(o1 o1Var, tb0 tb0) {
        this.f3336c = o1Var;
        this.f3335b = tb0;
    }

    public final void run() {
        try {
            this.f3336c.f3125g.w.get(this.f3335b.n()).a(this.f3335b);
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
