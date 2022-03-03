package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.r90;

final class k0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r90 f3222b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ e0 f3223c;

    k0(e0 e0Var, r90 r90) {
        this.f3223c = e0Var;
        this.f3222b = r90;
    }

    public final void run() {
        try {
            if (this.f3223c.f3125g.t != null) {
                this.f3223c.f3125g.t.a(this.f3222b);
                this.f3223c.y(this.f3222b.w());
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
