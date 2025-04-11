package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final /* synthetic */ class od0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final nd0 f5154b;

    /* renamed from: c  reason: collision with root package name */
    private final ed0 f5155c;

    /* renamed from: d  reason: collision with root package name */
    private final wd f5156d;

    /* renamed from: e  reason: collision with root package name */
    private final fd0 f5157e;

    od0(nd0 nd0, ed0 ed0, wd wdVar, fd0 fd0) {
        this.f5154b = nd0;
        this.f5155c = ed0;
        this.f5156d = wdVar;
        this.f5157e = fd0;
    }

    public final void run() {
        nd0 nd0 = this.f5154b;
        ed0 ed0 = this.f5155c;
        wd wdVar = this.f5156d;
        try {
            wdVar.b(ed0.B().a(this.f5157e));
        } catch (RemoteException e2) {
            qc.b("Unable to obtain a cache service instance.", e2);
            wdVar.a(e2);
            nd0.f5088c.a();
        }
    }
}
