package com.crashlytics.android.c;

import com.crashlytics.android.c.a0;
import java.util.HashSet;
import java.util.Set;

class v implements m {

    /* renamed from: b  reason: collision with root package name */
    static final Set<a0.c> f2870b = new a();
    final int a;

    static class a extends HashSet<a0.c> {
        a() {
            add(a0.c.START);
            add(a0.c.RESUME);
            add(a0.c.PAUSE);
            add(a0.c.STOP);
        }
    }

    public v(int i2) {
        this.a = i2;
    }

    @Override // com.crashlytics.android.c.m
    public boolean a(a0 a0Var) {
        return (f2870b.contains(a0Var.f2788c) && a0Var.a.f2816g == null) && (Math.abs(a0Var.a.f2812c.hashCode() % this.a) != 0);
    }
}
