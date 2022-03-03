package c.f.a.m.m;

import c.f.a.d;
import c.f.a.m.d;
import c.f.a.m.e;
import c.f.a.m.f;
import c.f.a.m.g;
import c.f.a.m.h;
import c.f.a.m.j;
import c.f.a.m.k;
import java.util.ArrayList;

public class b {
    private final ArrayList<e> a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private a f2146b = new a();

    /* renamed from: c  reason: collision with root package name */
    private f f2147c;

    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static int f2148k = 0;

        /* renamed from: l  reason: collision with root package name */
        public static int f2149l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static int f2150m = 2;
        public e.b a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f2151b;

        /* renamed from: c  reason: collision with root package name */
        public int f2152c;

        /* renamed from: d  reason: collision with root package name */
        public int f2153d;

        /* renamed from: e  reason: collision with root package name */
        public int f2154e;

        /* renamed from: f  reason: collision with root package name */
        public int f2155f;

        /* renamed from: g  reason: collision with root package name */
        public int f2156g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2157h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2158i;

        /* renamed from: j  reason: collision with root package name */
        public int f2159j;
    }

    /* renamed from: c.f.a.m.m.b$b  reason: collision with other inner class name */
    public interface AbstractC0041b {
        void a();

        void a(e eVar, a aVar);
    }

    public b(f fVar) {
        this.f2147c = fVar;
    }

    private void a(f fVar, String str, int i2, int i3, int i4) {
        int u = fVar.u();
        int t = fVar.t();
        fVar.r(0);
        fVar.q(0);
        fVar.u(i3);
        fVar.m(i4);
        fVar.r(u);
        fVar.q(t);
        this.f2147c.A(i2);
        this.f2147c.X();
    }

    private boolean a(AbstractC0041b bVar, e eVar, int i2) {
        this.f2146b.a = eVar.n();
        this.f2146b.f2151b = eVar.z();
        this.f2146b.f2152c = eVar.C();
        this.f2146b.f2153d = eVar.k();
        a aVar = this.f2146b;
        aVar.f2158i = false;
        aVar.f2159j = i2;
        boolean z = aVar.a == e.b.MATCH_CONSTRAINT;
        boolean z2 = this.f2146b.f2151b == e.b.MATCH_CONSTRAINT;
        boolean z3 = z && eVar.Z > 0.0f;
        boolean z4 = z2 && eVar.Z > 0.0f;
        if (z3 && eVar.u[0] == 4) {
            this.f2146b.a = e.b.FIXED;
        }
        if (z4 && eVar.u[1] == 4) {
            this.f2146b.f2151b = e.b.FIXED;
        }
        bVar.a(eVar, this.f2146b);
        eVar.u(this.f2146b.f2154e);
        eVar.m(this.f2146b.f2155f);
        eVar.a(this.f2146b.f2157h);
        eVar.i(this.f2146b.f2156g);
        a aVar2 = this.f2146b;
        aVar2.f2159j = a.f2148k;
        return aVar2.f2158i;
    }

    private void b(f fVar) {
        l lVar;
        n nVar;
        int size = fVar.u0.size();
        boolean y = fVar.y(64);
        AbstractC0041b Z = fVar.Z();
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = fVar.u0.get(i2);
            if (!(eVar instanceof g) && !(eVar instanceof c.f.a.m.a) && !eVar.M() && (!y || (lVar = eVar.f2130d) == null || (nVar = eVar.f2131e) == null || !lVar.f2206e.f2177j || !nVar.f2206e.f2177j)) {
                e.b b2 = eVar.b(0);
                e.b b3 = eVar.b(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z = b2 == bVar && eVar.s != 1 && b3 == bVar && eVar.t != 1;
                if (!z && fVar.y(1) && !(eVar instanceof k)) {
                    e.b bVar2 = e.b.MATCH_CONSTRAINT;
                    if (b2 == bVar2 && eVar.s == 0 && b3 != bVar2 && !eVar.J()) {
                        z = true;
                    }
                    e.b bVar3 = e.b.MATCH_CONSTRAINT;
                    if (b3 == bVar3 && eVar.t == 0 && b2 != bVar3 && !eVar.J()) {
                        z = true;
                    }
                    e.b bVar4 = e.b.MATCH_CONSTRAINT;
                    if ((b2 == bVar4 || b3 == bVar4) && eVar.Z > 0.0f) {
                        z = true;
                    }
                }
                if (!z) {
                    a(Z, eVar, a.f2148k);
                    c.f.a.e eVar2 = fVar.A0;
                    if (eVar2 != null) {
                        eVar2.a++;
                    }
                }
            }
        }
        Z.a();
    }

    public long a(f fVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        boolean z;
        int i12;
        int i13;
        boolean z2;
        AbstractC0041b bVar;
        int i14;
        int i15;
        int i16;
        boolean z3;
        c.f.a.e eVar;
        AbstractC0041b Z = fVar.Z();
        int size = fVar.u0.size();
        int C = fVar.C();
        int k2 = fVar.k();
        boolean a2 = j.a(i2, 128);
        boolean z4 = a2 || j.a(i2, 64);
        if (z4) {
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    break;
                }
                e eVar2 = fVar.u0.get(i17);
                boolean z5 = (eVar2.n() == e.b.MATCH_CONSTRAINT) && (eVar2.z() == e.b.MATCH_CONSTRAINT) && eVar2.i() > 0.0f;
                if ((!eVar2.J() || !z5) && ((!eVar2.L() || !z5) && !(eVar2 instanceof k) && !eVar2.J() && !eVar2.L())) {
                    i17++;
                }
            }
            z4 = false;
        }
        if (z4 && (eVar = d.x) != null) {
            eVar.f2029c++;
        }
        boolean z6 = z4 & ((i5 == 1073741824 && i7 == 1073741824) || a2);
        if (z6) {
            int min = Math.min(fVar.s(), i6);
            int min2 = Math.min(fVar.r(), i8);
            if (i5 == 1073741824 && fVar.C() != min) {
                fVar.u(min);
                fVar.c0();
            }
            if (i7 == 1073741824 && fVar.k() != min2) {
                fVar.m(min2);
                fVar.c0();
            }
            if (i5 == 1073741824 && i7 == 1073741824) {
                z = fVar.e(a2);
                i11 = 2;
            } else {
                boolean f2 = fVar.f(a2);
                if (i5 == 1073741824) {
                    f2 &= fVar.a(a2, 0);
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i7 == 1073741824) {
                    z = fVar.a(a2, 1) & f2;
                    i11++;
                } else {
                    z = f2;
                }
            }
            if (z) {
                fVar.a(i5 == 1073741824, i7 == 1073741824);
            }
        } else {
            z = false;
            i11 = 0;
        }
        if (z && i11 == 2) {
            return 0;
        }
        int a0 = fVar.a0();
        if (size > 0) {
            b(fVar);
        }
        a(fVar);
        int size2 = this.a.size();
        if (size > 0) {
            a(fVar, "First pass", 0, C, k2);
        }
        if (size2 > 0) {
            boolean z7 = fVar.n() == e.b.WRAP_CONTENT;
            boolean z8 = fVar.z() == e.b.WRAP_CONTENT;
            int max = Math.max(fVar.C(), this.f2147c.u());
            int max2 = Math.max(fVar.k(), this.f2147c.t());
            int i18 = 0;
            boolean z9 = false;
            while (i18 < size2) {
                e eVar3 = this.a.get(i18);
                if (!(eVar3 instanceof k)) {
                    i14 = a0;
                    i15 = C;
                    i16 = k2;
                } else {
                    int C2 = eVar3.C();
                    i14 = a0;
                    int k3 = eVar3.k();
                    i16 = k2;
                    boolean a3 = a(Z, eVar3, a.f2149l) | z9;
                    c.f.a.e eVar4 = fVar.A0;
                    i15 = C;
                    if (eVar4 != null) {
                        eVar4.f2028b++;
                    }
                    int C3 = eVar3.C();
                    int k4 = eVar3.k();
                    if (C3 != C2) {
                        eVar3.u(C3);
                        if (z7 && eVar3.w() > max) {
                            max = Math.max(max, eVar3.w() + eVar3.a(d.b.RIGHT).c());
                        }
                        z3 = true;
                    } else {
                        z3 = a3;
                    }
                    if (k4 != k3) {
                        eVar3.m(k4);
                        if (z8 && eVar3.f() > max2) {
                            max2 = Math.max(max2, eVar3.f() + eVar3.a(d.b.BOTTOM).c());
                        }
                        z3 = true;
                    }
                    z9 = ((k) eVar3).X() | z3;
                }
                i18++;
                a0 = i14;
                k2 = i16;
                C = i15;
            }
            int i19 = 0;
            int i20 = 2;
            while (i19 < i20) {
                boolean z10 = z9;
                int i21 = 0;
                while (i21 < size2) {
                    e eVar5 = this.a.get(i21);
                    if ((!(eVar5 instanceof h) || (eVar5 instanceof k)) && !(eVar5 instanceof g) && eVar5.B() != 8 && ((!z6 || !eVar5.f2130d.f2206e.f2177j || !eVar5.f2131e.f2206e.f2177j) && !(eVar5 instanceof k))) {
                        int C4 = eVar5.C();
                        int k5 = eVar5.k();
                        int e2 = eVar5.e();
                        int i22 = a.f2149l;
                        z2 = z6;
                        if (i19 == 1) {
                            i22 = a.f2150m;
                        }
                        z10 |= a(Z, eVar5, i22);
                        c.f.a.e eVar6 = fVar.A0;
                        i13 = size2;
                        bVar = Z;
                        if (eVar6 != null) {
                            eVar6.f2028b++;
                        }
                        int C5 = eVar5.C();
                        int k6 = eVar5.k();
                        if (C5 != C4) {
                            eVar5.u(C5);
                            if (z7 && eVar5.w() > max) {
                                max = Math.max(max, eVar5.w() + eVar5.a(d.b.RIGHT).c());
                            }
                            z10 = true;
                        }
                        if (k6 != k5) {
                            eVar5.m(k6);
                            if (z8 && eVar5.f() > max2) {
                                max2 = Math.max(max2, eVar5.f() + eVar5.a(d.b.BOTTOM).c());
                            }
                            z10 = true;
                        }
                        if (eVar5.F() && e2 != eVar5.e()) {
                            z10 = true;
                        }
                    } else {
                        z2 = z6;
                        i13 = size2;
                        bVar = Z;
                    }
                    i21++;
                    Z = bVar;
                    z6 = z2;
                    size2 = i13;
                }
                if (!z10) {
                    break;
                }
                i19++;
                a(fVar, "intermediate pass", i19, C, k2);
                Z = Z;
                z6 = z6;
                size2 = size2;
                i20 = 2;
                z9 = false;
            }
            i12 = a0;
        } else {
            i12 = a0;
        }
        fVar.z(i12);
        return 0;
    }

    public void a(f fVar) {
        this.a.clear();
        int size = fVar.u0.size();
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = fVar.u0.get(i2);
            if (eVar.n() == e.b.MATCH_CONSTRAINT || eVar.z() == e.b.MATCH_CONSTRAINT) {
                this.a.add(eVar);
            }
        }
        fVar.c0();
    }
}
