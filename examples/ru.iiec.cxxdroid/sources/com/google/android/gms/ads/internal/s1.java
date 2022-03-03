package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.r90;

/* access modifiers changed from: package-private */
public final class s1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r90 f3332b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ o1 f3333c;

    s1(o1 o1Var, r90 r90) {
        this.f3333c = o1Var;
        this.f3332b = r90;
    }

    public final void run() {
        try {
            if (this.f3333c.f3125g.t != null) {
                this.f3333c.f3125g.t.a(this.f3332b);
                this.f3333c.y(this.f3332b.w());
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
