package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.x0;

final class u4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ j3 f5687b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ u3 f5688c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ s4 f5689d;

    u4(s4 s4Var, j3 j3Var, u3 u3Var) {
        this.f5689d = s4Var;
        this.f5687b = j3Var;
        this.f5688c = u3Var;
    }

    public final void run() {
        n3 n3Var;
        try {
            n3Var = this.f5689d.a(this.f5687b);
        } catch (Exception e2) {
            x0.j().a(e2, "AdRequestServiceImpl.loadAdAsync");
            qc.c("Could not fetch ad response due to an Exception.", e2);
            n3Var = null;
        }
        if (n3Var == null) {
            n3Var = new n3(0);
        }
        try {
            this.f5688c.a(n3Var);
        } catch (RemoteException e3) {
            qc.c("Fail to forward ad response.", e3);
        }
    }
}
