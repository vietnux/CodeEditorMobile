package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class db {
    private final List<String> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<Double> f4091b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<Double> f4092c = new ArrayList();

    public final ab a() {
        return new ab(this);
    }

    public final db a(String str, double d2, double d3) {
        int i2 = 0;
        while (i2 < this.a.size()) {
            double doubleValue = this.f4092c.get(i2).doubleValue();
            double doubleValue2 = this.f4091b.get(i2).doubleValue();
            if (d2 < doubleValue || (doubleValue == d2 && d3 < doubleValue2)) {
                break;
            }
            i2++;
        }
        this.a.add(i2, str);
        this.f4092c.add(i2, Double.valueOf(d2));
        this.f4091b.add(i2, Double.valueOf(d3));
        return this;
    }
}
