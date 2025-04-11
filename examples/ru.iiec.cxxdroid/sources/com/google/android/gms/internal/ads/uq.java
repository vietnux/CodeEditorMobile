package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;
import java.util.List;

final class uq implements xu {
    private final sq a;

    private uq(sq sqVar) {
        or.a((Object) sqVar, "output");
        this.a = sqVar;
        this.a.a = this;
    }

    public static uq a(sq sqVar) {
        uq uqVar = sqVar.a;
        return uqVar != null ? uqVar : new uq(sqVar);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final int a() {
        return mr.e.f4986k;
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void a(int i2) {
        this.a.a(i2, 4);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void a(int i2, double d2) {
        this.a.a(i2, d2);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void a(int i2, float f2) {
        this.a.a(i2, f2);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void a(int i2, int i3) {
        this.a.c(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void a(int i2, long j2) {
        this.a.c(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void a(int i2, fq fqVar) {
        this.a.a(i2, fqVar);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void a(int i2, Object obj) {
        if (obj instanceof fq) {
            this.a.b(i2, (fq) obj);
        } else {
            this.a.a(i2, (ss) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void a(int i2, Object obj, kt ktVar) {
        sq sqVar = this.a;
        sqVar.a(i2, 3);
        ktVar.a((Object) ((ss) obj), (xu) sqVar.a);
        sqVar.a(i2, 4);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void a(int i2, String str) {
        this.a.a(i2, str);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void a(int i2, List<fq> list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.a.a(i2, list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void a(int i2, List<?> list, kt ktVar) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            b(i2, list.get(i3), ktVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void a(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += sq.g(list.get(i5).longValue());
            }
            this.a.b(i4);
            while (i3 < list.size()) {
                this.a.c(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.c(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void a(int i2, boolean z) {
        this.a.a(i2, z);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void b(int i2) {
        this.a.a(i2, 3);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void b(int i2, int i3) {
        this.a.e(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void b(int i2, long j2) {
        this.a.b(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void b(int i2, Object obj, kt ktVar) {
        this.a.a(i2, (ss) obj, ktVar);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void b(int i2, List<String> list) {
        int i3 = 0;
        if (list instanceof cs) {
            cs csVar = (cs) list;
            while (i3 < list.size()) {
                Object b2 = csVar.b(i3);
                if (b2 instanceof String) {
                    this.a.a(i2, (String) b2);
                } else {
                    this.a.a(i2, (fq) b2);
                }
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.a(i2, list.get(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void b(int i2, List<?> list, kt ktVar) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            a(i2, list.get(i3), ktVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void b(int i2, List<Boolean> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += sq.b(list.get(i5).booleanValue());
            }
            this.a.b(i4);
            while (i3 < list.size()) {
                this.a.a(list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.a(i2, list.get(i3).booleanValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void c(int i2, int i3) {
        this.a.d(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void c(int i2, long j2) {
        this.a.c(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void c(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += sq.f(list.get(i5).longValue());
            }
            this.a.b(i4);
            while (i3 < list.size()) {
                this.a.b(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.b(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void d(int i2, int i3) {
        this.a.b(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void d(int i2, long j2) {
        this.a.a(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void d(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += sq.f(list.get(i5).intValue());
            }
            this.a.b(i4);
            while (i3 < list.size()) {
                this.a.a(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.b(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void e(int i2, int i3) {
        this.a.e(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void e(int i2, long j2) {
        this.a.a(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void e(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += sq.e(list.get(i5).longValue());
            }
            this.a.b(i4);
            while (i3 < list.size()) {
                this.a.a(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.a(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void f(int i2, int i3) {
        this.a.b(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void f(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += sq.k(list.get(i5).intValue());
            }
            this.a.b(i4);
            while (i3 < list.size()) {
                this.a.a(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.b(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void g(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += sq.h(list.get(i5).intValue());
            }
            this.a.b(i4);
            while (i3 < list.size()) {
                this.a.c(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.d(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void h(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += sq.d(list.get(i5).longValue());
            }
            this.a.b(i4);
            while (i3 < list.size()) {
                this.a.a(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.a(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void i(int i2, List<Double> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += sq.b(list.get(i5).doubleValue());
            }
            this.a.b(i4);
            while (i3 < list.size()) {
                this.a.a(list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.a(i2, list.get(i3).doubleValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void j(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += sq.h(list.get(i5).longValue());
            }
            this.a.b(i4);
            while (i3 < list.size()) {
                this.a.c(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.c(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void k(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += sq.i(list.get(i5).intValue());
            }
            this.a.b(i4);
            while (i3 < list.size()) {
                this.a.d(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.e(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void l(int i2, List<Float> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += sq.b(list.get(i5).floatValue());
            }
            this.a.b(i4);
            while (i3 < list.size()) {
                this.a.a(list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.a(i2, list.get(i3).floatValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void m(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += sq.g(list.get(i5).intValue());
            }
            this.a.b(i4);
            while (i3 < list.size()) {
                this.a.b(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.c(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void n(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += sq.j(list.get(i5).intValue());
            }
            this.a.b(i4);
            while (i3 < list.size()) {
                this.a.d(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.e(i2, list.get(i3).intValue());
            i3++;
        }
    }
}
