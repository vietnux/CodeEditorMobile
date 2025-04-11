package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.u1;
import e.b.b.a.b.a;
import e.b.b.a.b.b;

@k2
public final class w5 extends h6 {

    /* renamed from: b  reason: collision with root package name */
    private final Object f5878b;

    /* renamed from: c  reason: collision with root package name */
    private final x5 f5879c;

    public w5(Context context, u1 u1Var, ri0 ri0, sc scVar) {
        this(context, scVar, new x5(context, u1Var, n40.u(), ri0, scVar));
    }

    private w5(Context context, sc scVar, x5 x5Var) {
        this.f5878b = new Object();
        this.f5879c = x5Var;
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final boolean D0() {
        boolean D0;
        synchronized (this.f5878b) {
            D0 = this.f5879c.D0();
        }
        return D0;
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final void E() {
        j(null);
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final void a(d6 d6Var) {
        synchronized (this.f5878b) {
            this.f5879c.a(d6Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final void a(l6 l6Var) {
        synchronized (this.f5878b) {
            this.f5879c.a(l6Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final void a(r6 r6Var) {
        synchronized (this.f5878b) {
            this.f5879c.a(r6Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final void a(w50 w50) {
        if (((Boolean) a50.g().a(k80.D0)).booleanValue()) {
            synchronized (this.f5878b) {
                this.f5879c.a(w50);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final void a(boolean z) {
        synchronized (this.f5878b) {
            this.f5879c.a(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final void b(String str) {
        synchronized (this.f5878b) {
            this.f5879c.b(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final void destroy() {
        g(null);
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final void e() {
        synchronized (this.f5878b) {
            this.f5879c.o2();
        }
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final void g(a aVar) {
        synchronized (this.f5878b) {
            this.f5879c.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final void j(a aVar) {
        Context context;
        synchronized (this.f5878b) {
            if (aVar == null) {
                context = null;
            } else {
                try {
                    context = (Context) b.y(aVar);
                } catch (Exception e2) {
                    qc.c("Unable to extract updated context.", e2);
                }
            }
            if (context != null) {
                this.f5879c.b(context);
            }
            this.f5879c.E();
        }
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final String k() {
        String k2;
        synchronized (this.f5878b) {
            k2 = this.f5879c.k();
        }
        return k2;
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final void o(a aVar) {
        synchronized (this.f5878b) {
            this.f5879c.y();
        }
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final Bundle q0() {
        Bundle q0;
        if (!((Boolean) a50.g().a(k80.D0)).booleanValue()) {
            return new Bundle();
        }
        synchronized (this.f5878b) {
            q0 = this.f5879c.q0();
        }
        return q0;
    }

    @Override // com.google.android.gms.internal.ads.f6
    public final void y() {
        o(null);
    }
}
