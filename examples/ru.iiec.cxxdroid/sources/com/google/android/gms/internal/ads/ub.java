package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;

@k2
public final class ub {
    private long a;

    /* renamed from: b  reason: collision with root package name */
    private long f5726b = Long.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private Object f5727c = new Object();

    public ub(long j2) {
        this.a = j2;
    }

    public final boolean a() {
        synchronized (this.f5727c) {
            long b2 = x0.m().b();
            if (this.f5726b + this.a > b2) {
                return false;
            }
            this.f5726b = b2;
            return true;
        }
    }
}
