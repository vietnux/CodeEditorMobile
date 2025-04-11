package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.p90;
import com.google.android.gms.internal.ads.qc;

final class i0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ p90 f3207b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ e0 f3208c;

    i0(e0 e0Var, p90 p90) {
        this.f3208c = e0Var;
        this.f3207b = p90;
    }

    public final void run() {
        try {
            if (this.f3208c.f3125g.s != null) {
                this.f3208c.f3125g.s.a(this.f3207b);
                this.f3208c.y(this.f3207b.w());
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
