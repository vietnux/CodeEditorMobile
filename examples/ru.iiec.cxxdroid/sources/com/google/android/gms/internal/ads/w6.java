package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e.b.b.a.b.b;

final class w6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ui0 f5880b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j40 f5881c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ c7 f5882d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ u6 f5883e;

    w6(u6 u6Var, ui0 ui0, j40 j40, c7 c7Var) {
        this.f5883e = u6Var;
        this.f5880b = ui0;
        this.f5881c = j40;
        this.f5882d = c7Var;
    }

    public final void run() {
        try {
            this.f5880b.a(b.a(this.f5883e.f5703f), this.f5881c, (String) null, this.f5882d, this.f5883e.f5707j);
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(this.f5883e.f5701d);
            qc.c(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "), e2);
            u6 u6Var = this.f5883e;
            u6Var.a(u6Var.f5701d, 0);
        }
    }
}
