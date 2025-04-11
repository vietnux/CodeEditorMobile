package com.google.android.gms.internal.ads;

import android.os.Bundle;
import e.b.b.a.b.a;
import e.b.b.a.b.b;

@k2
public final class c7 extends l7 {

    /* renamed from: b  reason: collision with root package name */
    private volatile a7 f3994b;

    /* renamed from: c  reason: collision with root package name */
    private volatile d7 f3995c;

    /* renamed from: d  reason: collision with root package name */
    private volatile b7 f3996d;

    /* renamed from: e  reason: collision with root package name */
    private volatile i7 f3997e;

    public c7(b7 b7Var) {
        this.f3996d = b7Var;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void a(Bundle bundle) {
        if (this.f3997e != null) {
            this.f3997e.a(bundle);
        }
    }

    public final void a(a7 a7Var) {
        this.f3994b = a7Var;
    }

    public final void a(d7 d7Var) {
        this.f3995c = d7Var;
    }

    public final void a(i7 i7Var) {
        this.f3997e = i7Var;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void a(a aVar, int i2) {
        if (this.f3994b != null) {
            this.f3994b.a(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void a(a aVar, o7 o7Var) {
        if (this.f3996d != null) {
            this.f3996d.a(o7Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void b(a aVar, int i2) {
        if (this.f3995c != null) {
            this.f3995c.a(b.y(aVar).getClass().getName(), i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void f(a aVar) {
        if (this.f3996d != null) {
            this.f3996d.s();
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void h(a aVar) {
        if (this.f3996d != null) {
            this.f3996d.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void k(a aVar) {
        if (this.f3995c != null) {
            this.f3995c.a(b.y(aVar).getClass().getName());
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void m(a aVar) {
        if (this.f3996d != null) {
            this.f3996d.H1();
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void p(a aVar) {
        if (this.f3996d != null) {
            this.f3996d.q();
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void t(a aVar) {
        if (this.f3994b != null) {
            this.f3994b.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void u(a aVar) {
        if (this.f3996d != null) {
            this.f3996d.o();
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void v(a aVar) {
        if (this.f3996d != null) {
            this.f3996d.p();
        }
    }
}
