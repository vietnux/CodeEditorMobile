package com.crashlytics.android.c;

import f.a.a.a.n.c.o.e;

/* access modifiers changed from: package-private */
public class u {
    long a;

    /* renamed from: b  reason: collision with root package name */
    private e f2869b;

    public u(e eVar) {
        if (eVar != null) {
            this.f2869b = eVar;
            return;
        }
        throw new NullPointerException("retryState must not be null");
    }

    public void a() {
        this.a = 0;
        this.f2869b = this.f2869b.b();
    }

    public boolean a(long j2) {
        return j2 - this.a >= this.f2869b.a() * 1000000;
    }

    public void b(long j2) {
        this.a = j2;
        this.f2869b = this.f2869b.c();
    }
}
