package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.w90;

/* access modifiers changed from: package-private */
public final class q1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ w90 f3310b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ o1 f3311c;

    q1(o1 o1Var, w90 w90) {
        this.f3311c = o1Var;
        this.f3310b = w90;
    }

    public final void run() {
        try {
            if (this.f3311c.f3125g.u != null) {
                this.f3311c.f3125g.u.a(this.f3310b);
                this.f3311c.y(this.f3310b.w());
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
