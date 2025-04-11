package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.t90;

final class l0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3237b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ q8 f3238c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ e0 f3239d;

    l0(e0 e0Var, String str, q8 q8Var) {
        this.f3239d = e0Var;
        this.f3237b = str;
        this.f3238c = q8Var;
    }

    public final void run() {
        try {
            this.f3239d.f3125g.w.get(this.f3237b).a((t90) this.f3238c.C);
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
