package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.tb0;

final class m0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ tb0 f3242b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ e0 f3243c;

    m0(e0 e0Var, tb0 tb0) {
        this.f3243c = e0Var;
        this.f3242b = tb0;
    }

    public final void run() {
        try {
            this.f3243c.f3125g.w.get(this.f3242b.n()).a(this.f3242b);
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
