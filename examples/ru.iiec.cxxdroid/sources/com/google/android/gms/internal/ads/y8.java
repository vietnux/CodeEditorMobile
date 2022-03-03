package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;

/* access modifiers changed from: package-private */
public final class y8 {
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private volatile int f6096b;

    /* renamed from: c  reason: collision with root package name */
    private volatile long f6097c;

    private y8() {
        this.a = new Object();
        this.f6096b = z8.a;
        this.f6097c = 0;
    }

    /* synthetic */ y8(x8 x8Var) {
        this();
    }

    private final void a(int i2, int i3) {
        d();
        long a2 = x0.m().a();
        synchronized (this.a) {
            if (this.f6096b == i2) {
                this.f6096b = i3;
                if (this.f6096b == z8.f6195c) {
                    this.f6097c = a2;
                }
            }
        }
    }

    private final void d() {
        long a2 = x0.m().a();
        synchronized (this.a) {
            if (this.f6096b == z8.f6195c) {
                if (this.f6097c + ((Long) a50.g().a(k80.h3)).longValue() <= a2) {
                    this.f6096b = z8.a;
                }
            }
        }
    }

    public final void a(boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = z8.a;
            i3 = z8.f6194b;
        } else {
            i2 = z8.f6194b;
            i3 = z8.a;
        }
        a(i2, i3);
    }

    public final boolean a() {
        d();
        return this.f6096b == z8.f6194b;
    }

    public final boolean b() {
        d();
        return this.f6096b == z8.f6195c;
    }

    public final void c() {
        a(z8.f6194b, z8.f6195c);
    }
}
