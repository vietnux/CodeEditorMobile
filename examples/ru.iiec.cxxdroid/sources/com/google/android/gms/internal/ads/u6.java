package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.gmsg.k;
import com.google.android.gms.ads.internal.x0;
import java.util.concurrent.Future;

@k2
public final class u6 extends g9 implements a7, d7, i7 {

    /* renamed from: d  reason: collision with root package name */
    public final String f5701d;

    /* renamed from: e  reason: collision with root package name */
    private final r8 f5702e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f5703f;

    /* renamed from: g  reason: collision with root package name */
    private final j7 f5704g;

    /* renamed from: h  reason: collision with root package name */
    private final d7 f5705h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f5706i;

    /* renamed from: j  reason: collision with root package name */
    private final String f5707j;

    /* renamed from: k  reason: collision with root package name */
    private final ai0 f5708k;

    /* renamed from: l  reason: collision with root package name */
    private final long f5709l;

    /* renamed from: m  reason: collision with root package name */
    private int f5710m = 0;
    private int n = 3;
    private x6 o;
    private Future p;
    private volatile k q;

    public u6(Context context, String str, String str2, ai0 ai0, r8 r8Var, j7 j7Var, d7 d7Var, long j2) {
        this.f5703f = context;
        this.f5701d = str;
        this.f5707j = str2;
        this.f5708k = ai0;
        this.f5702e = r8Var;
        this.f5704g = j7Var;
        this.f5706i = new Object();
        this.f5705h = d7Var;
        this.f5709l = j2;
    }

    /* access modifiers changed from: private */
    public final void a(j40 j40, ui0 ui0) {
        this.f5704g.b().a((d7) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f5701d)) {
                ui0.a(j40, this.f5707j, this.f5708k.a);
            } else {
                ui0.a(j40, this.f5707j);
            }
        } catch (RemoteException e2) {
            qc.c("Fail to load ad from adapter.", e2);
            a(this.f5701d, 0);
        }
    }

    private final boolean a(long j2) {
        int i2;
        long b2 = this.f5709l - (x0.m().b() - j2);
        if (b2 <= 0) {
            i2 = 4;
        } else {
            try {
                this.f5706i.wait(b2);
                return true;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                i2 = 5;
            }
        }
        this.n = i2;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.a7
    public final void a(int i2) {
        a(this.f5701d, 0);
    }

    @Override // com.google.android.gms.internal.ads.i7
    public final void a(Bundle bundle) {
        k kVar = this.q;
        if (kVar != null) {
            kVar.d("", bundle);
        }
    }

    public final void a(k kVar) {
        this.q = kVar;
    }

    @Override // com.google.android.gms.internal.ads.d7
    public final void a(String str) {
        synchronized (this.f5706i) {
            this.f5710m = 1;
            this.f5706i.notify();
        }
    }

    @Override // com.google.android.gms.internal.ads.d7
    public final void a(String str, int i2) {
        synchronized (this.f5706i) {
            this.f5710m = 2;
            this.n = i2;
            this.f5706i.notify();
        }
    }

    @Override // com.google.android.gms.internal.ads.a7
    public final void b() {
        a(this.f5702e.a.f4662d, this.f5704g.a());
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void d() {
        Handler handler;
        Runnable w6Var;
        j7 j7Var = this.f5704g;
        if (j7Var != null && j7Var.b() != null && this.f5704g.a() != null) {
            c7 b2 = this.f5704g.b();
            b2.a((d7) null);
            b2.a((a7) this);
            b2.a((i7) this);
            j40 j40 = this.f5702e.a.f4662d;
            ui0 a = this.f5704g.a();
            try {
                if (a.isInitialized()) {
                    handler = fc.a;
                    w6Var = new v6(this, j40, a);
                } else {
                    handler = fc.a;
                    w6Var = new w6(this, a, j40, b2);
                }
                handler.post(w6Var);
            } catch (RemoteException e2) {
                qc.c("Fail to check if adapter is initialized.", e2);
                a(this.f5701d, 0);
            }
            long b3 = x0.m().b();
            while (true) {
                synchronized (this.f5706i) {
                    if (this.f5710m == 0) {
                        if (!a(b3)) {
                            z6 z6Var = new z6();
                            z6Var.a(this.n);
                            z6Var.a(x0.m().b() - b3);
                            z6Var.a(this.f5701d);
                            z6Var.b(this.f5708k.f3809d);
                            this.o = z6Var.a();
                            break;
                        }
                    } else {
                        z6 z6Var2 = new z6();
                        z6Var2.a(x0.m().b() - b3);
                        z6Var2.a(1 == this.f5710m ? 6 : this.n);
                        z6Var2.a(this.f5701d);
                        z6Var2.b(this.f5708k.f3809d);
                        this.o = z6Var2.a();
                    }
                }
            }
            b2.a((d7) null);
            b2.a((a7) null);
            if (this.f5710m == 1) {
                this.f5705h.a(this.f5701d);
            } else {
                this.f5705h.a(this.f5701d, this.n);
            }
        }
    }

    public final Future f() {
        Future future = this.p;
        if (future != null) {
            return future;
        }
        ld ldVar = (ld) a();
        this.p = ldVar;
        return ldVar;
    }

    public final x6 g() {
        x6 x6Var;
        synchronized (this.f5706i) {
            x6Var = this.o;
        }
        return x6Var;
    }

    public final ai0 h() {
        return this.f5708k;
    }
}
