package com.crashlytics.android.c;

import f.a.a.a.n.c.o.a;
import java.util.Random;

/* access modifiers changed from: package-private */
public class t implements a {
    final a a;

    /* renamed from: b  reason: collision with root package name */
    final Random f2867b;

    /* renamed from: c  reason: collision with root package name */
    final double f2868c;

    public t(a aVar, double d2) {
        this(aVar, d2, new Random());
    }

    public t(a aVar, double d2, Random random) {
        if (d2 < 0.0d || d2 > 1.0d) {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        } else if (aVar == null) {
            throw new NullPointerException("backoff must not be null");
        } else if (random != null) {
            this.a = aVar;
            this.f2868c = d2;
            this.f2867b = random;
        } else {
            throw new NullPointerException("random must not be null");
        }
    }

    /* access modifiers changed from: package-private */
    public double a() {
        double d2 = this.f2868c;
        double d3 = 1.0d - d2;
        return d3 + (((d2 + 1.0d) - d3) * this.f2867b.nextDouble());
    }

    @Override // f.a.a.a.n.c.o.a
    public long a(int i2) {
        return (long) (a() * ((double) this.a.a(i2)));
    }
}
