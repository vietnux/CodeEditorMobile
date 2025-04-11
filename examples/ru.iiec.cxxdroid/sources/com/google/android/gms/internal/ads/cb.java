package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.x;

public final class cb {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    private final double f4001b;

    /* renamed from: c  reason: collision with root package name */
    private final double f4002c;

    /* renamed from: d  reason: collision with root package name */
    public final double f4003d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4004e;

    public cb(String str, double d2, double d3, double d4, int i2) {
        this.a = str;
        this.f4002c = d2;
        this.f4001b = d3;
        this.f4003d = d4;
        this.f4004e = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return x.a(this.a, cbVar.a) && this.f4001b == cbVar.f4001b && this.f4002c == cbVar.f4002c && this.f4004e == cbVar.f4004e && Double.compare(this.f4003d, cbVar.f4003d) == 0;
    }

    public final int hashCode() {
        return x.a(this.a, Double.valueOf(this.f4001b), Double.valueOf(this.f4002c), Double.valueOf(this.f4003d), Integer.valueOf(this.f4004e));
    }

    public final String toString() {
        x.a a2 = x.a(this);
        a2.a("name", this.a);
        a2.a("minBound", Double.valueOf(this.f4002c));
        a2.a("maxBound", Double.valueOf(this.f4001b));
        a2.a("percent", Double.valueOf(this.f4003d));
        a2.a("count", Integer.valueOf(this.f4004e));
        return a2.toString();
    }
}
