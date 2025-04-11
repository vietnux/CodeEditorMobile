package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.p90;
import com.google.android.gms.internal.ads.qc;

/* access modifiers changed from: package-private */
public final class r1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ p90 f3330b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ o1 f3331c;

    r1(o1 o1Var, p90 p90) {
        this.f3331c = o1Var;
        this.f3330b = p90;
    }

    public final void run() {
        try {
            if (this.f3331c.f3125g.s != null) {
                this.f3331c.f3125g.s.a(this.f3330b);
                this.f3331c.y(this.f3330b.w());
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
