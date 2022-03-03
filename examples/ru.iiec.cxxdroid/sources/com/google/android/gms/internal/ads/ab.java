package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

@k2
public final class ab {
    private final String[] a;

    /* renamed from: b  reason: collision with root package name */
    private final double[] f3781b;

    /* renamed from: c  reason: collision with root package name */
    private final double[] f3782c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f3783d;

    /* renamed from: e  reason: collision with root package name */
    private int f3784e;

    private ab(db dbVar) {
        int size = dbVar.f4091b.size();
        this.a = (String[]) dbVar.a.toArray(new String[size]);
        this.f3781b = a(dbVar.f4091b);
        this.f3782c = a(dbVar.f4092c);
        this.f3783d = new int[size];
        this.f3784e = 0;
    }

    private static double[] a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = list.get(i2).doubleValue();
        }
        return dArr;
    }

    public final List<cb> a() {
        ArrayList arrayList = new ArrayList(this.a.length);
        int i2 = 0;
        while (true) {
            String[] strArr = this.a;
            if (i2 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i2];
            double d2 = this.f3782c[i2];
            double d3 = this.f3781b[i2];
            int[] iArr = this.f3783d;
            arrayList.add(new cb(str, d2, d3, ((double) iArr[i2]) / ((double) this.f3784e), iArr[i2]));
            i2++;
        }
    }

    public final void a(double d2) {
        this.f3784e++;
        int i2 = 0;
        while (true) {
            double[] dArr = this.f3782c;
            if (i2 < dArr.length) {
                if (dArr[i2] <= d2 && d2 < this.f3781b[i2]) {
                    int[] iArr = this.f3783d;
                    iArr[i2] = iArr[i2] + 1;
                }
                if (d2 >= this.f3782c[i2]) {
                    i2++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
