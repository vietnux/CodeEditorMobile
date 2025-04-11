package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.w90;

final class j0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ w90 f3213b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ e0 f3214c;

    j0(e0 e0Var, w90 w90) {
        this.f3214c = e0Var;
        this.f3213b = w90;
    }

    public final void run() {
        try {
            if (this.f3214c.f3125g.u != null) {
                this.f3214c.f3125g.u.a(this.f3213b);
                this.f3214c.y(this.f3213b.w());
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
