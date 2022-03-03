package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;

@k2
public abstract class c3 implements a3, na<Void> {
    private final yd<j3> a;

    /* renamed from: b  reason: collision with root package name */
    private final a3 f3965b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f3966c = new Object();

    public c3(yd<j3> ydVar, a3 a3Var) {
        this.a = ydVar;
        this.f3965b = a3Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.na
    public final /* synthetic */ Void a() {
        r3 c2 = c();
        if (c2 == null) {
            this.f3965b.a(new n3(0));
            b();
            return null;
        }
        this.a.a(new e3(this, c2), new f3(this));
        return null;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final void a(n3 n3Var) {
        synchronized (this.f3966c) {
            this.f3965b.a(n3Var);
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(r3 r3Var, j3 j3Var) {
        try {
            r3Var.a(j3Var, new m3(this));
            return true;
        } catch (Throwable th) {
            qc.c("Could not fetch ad response from ad request service due to an Exception.", th);
            x0.j().a(th, "AdRequestClientTask.getAdResponseFromService");
            this.f3965b.a(new n3(0));
            return false;
        }
    }

    public abstract void b();

    public abstract r3 c();

    @Override // com.google.android.gms.internal.ads.na
    public final void cancel() {
        b();
    }
}
