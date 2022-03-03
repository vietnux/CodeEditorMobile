package c.f.a.m.m;

import c.f.a.m.a;
import c.f.a.m.d;
import c.f.a.m.e;
import c.f.a.m.f;
import c.f.a.m.g;
import c.f.a.m.m.b;
import java.util.ArrayList;
import java.util.Iterator;

public class h {
    private static b.a a = new b.a();

    /* renamed from: b  reason: collision with root package name */
    private static int f2190b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static int f2191c = 0;

    private static void a(int i2, a aVar, b.AbstractC0041b bVar, int i3, boolean z) {
        if (aVar.W()) {
            int i4 = i2 + 1;
            if (i3 == 0) {
                a(i4, aVar, bVar, z);
            } else {
                a(i4, aVar, bVar);
            }
        }
    }

    private static void a(int i2, e eVar, b.AbstractC0041b bVar) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        d dVar5;
        if (!eVar.Q()) {
            f2191c++;
            if (!(eVar instanceof f) && eVar.N()) {
                int i3 = i2 + 1;
                if (a(i3, eVar)) {
                    f.a(i3, eVar, bVar, new b.a(), b.a.f2148k);
                }
            }
            d a2 = eVar.a(d.b.TOP);
            d a3 = eVar.a(d.b.BOTTOM);
            int b2 = a2.b();
            int b3 = a3.b();
            if (a2.a() != null && a2.k()) {
                Iterator<d> it = a2.a().iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    e eVar2 = next.f2112d;
                    int i4 = i2 + 1;
                    boolean a4 = a(i4, eVar2);
                    if (eVar2.N() && a4) {
                        f.a(i4, eVar2, bVar, new b.a(), b.a.f2148k);
                    }
                    if (eVar2.z() != e.b.MATCH_CONSTRAINT || a4) {
                        if (!eVar2.N()) {
                            d dVar6 = eVar2.L;
                            if (next == dVar6 && eVar2.N.f2114f == null) {
                                int c2 = dVar6.c() + b2;
                                eVar2.c(c2, eVar2.k() + c2);
                            } else {
                                d dVar7 = eVar2.N;
                                if (next == dVar7 && dVar7.f2114f == null) {
                                    int c3 = b2 - dVar7.c();
                                    eVar2.c(c3 - eVar2.k(), c3);
                                } else if (next == eVar2.L && (dVar3 = eVar2.N.f2114f) != null && dVar3.k()) {
                                    a(i4, bVar, eVar2);
                                }
                            }
                            a(i4, eVar2, bVar);
                        }
                    } else if (eVar2.z() == e.b.MATCH_CONSTRAINT && eVar2.z >= 0 && eVar2.y >= 0) {
                        if ((eVar2.B() == 8 || (eVar2.t == 0 && eVar2.i() == 0.0f)) && !eVar2.L() && !eVar2.M()) {
                            if (((next == eVar2.L && (dVar5 = eVar2.N.f2114f) != null && dVar5.k()) || (next == eVar2.N && (dVar4 = eVar2.L.f2114f) != null && dVar4.k())) && !eVar2.L()) {
                                a(i4, eVar, bVar, eVar2);
                            }
                        }
                    }
                }
            }
            if (!(eVar instanceof g)) {
                if (a3.a() != null && a3.k()) {
                    Iterator<d> it2 = a3.a().iterator();
                    while (it2.hasNext()) {
                        d next2 = it2.next();
                        e eVar3 = next2.f2112d;
                        int i5 = i2 + 1;
                        boolean a5 = a(i5, eVar3);
                        if (eVar3.N() && a5) {
                            f.a(i5, eVar3, bVar, new b.a(), b.a.f2148k);
                        }
                        boolean z = (next2 == eVar3.L && (dVar2 = eVar3.N.f2114f) != null && dVar2.k()) || (next2 == eVar3.N && (dVar = eVar3.L.f2114f) != null && dVar.k());
                        if (eVar3.z() != e.b.MATCH_CONSTRAINT || a5) {
                            if (!eVar3.N()) {
                                d dVar8 = eVar3.L;
                                if (next2 == dVar8 && eVar3.N.f2114f == null) {
                                    int c4 = dVar8.c() + b3;
                                    eVar3.c(c4, eVar3.k() + c4);
                                } else {
                                    d dVar9 = eVar3.N;
                                    if (next2 == dVar9 && eVar3.L.f2114f == null) {
                                        int c5 = b3 - dVar9.c();
                                        eVar3.c(c5 - eVar3.k(), c5);
                                    } else if (z && !eVar3.L()) {
                                        a(i5, bVar, eVar3);
                                    }
                                }
                                a(i5, eVar3, bVar);
                            }
                        } else if (eVar3.z() == e.b.MATCH_CONSTRAINT && eVar3.z >= 0 && eVar3.y >= 0) {
                            if ((eVar3.B() == 8 || (eVar3.t == 0 && eVar3.i() == 0.0f)) && !eVar3.L() && !eVar3.M() && z && !eVar3.L()) {
                                a(i5, eVar, bVar, eVar3);
                            }
                        }
                    }
                }
                d a6 = eVar.a(d.b.BASELINE);
                if (a6.a() != null && a6.k()) {
                    int b4 = a6.b();
                    Iterator<d> it3 = a6.a().iterator();
                    while (it3.hasNext()) {
                        d next3 = it3.next();
                        e eVar4 = next3.f2112d;
                        int i6 = i2 + 1;
                        boolean a7 = a(i6, eVar4);
                        if (eVar4.N() && a7) {
                            f.a(i6, eVar4, bVar, new b.a(), b.a.f2148k);
                        }
                        if ((eVar4.z() != e.b.MATCH_CONSTRAINT || a7) && !eVar4.N() && next3 == eVar4.O) {
                            eVar4.j(next3.c() + b4);
                            a(i6, eVar4, bVar);
                        }
                    }
                }
                eVar.S();
            }
        }
    }

    private static void a(int i2, e eVar, b.AbstractC0041b bVar, e eVar2) {
        float x = eVar2.x();
        int b2 = eVar2.L.f2114f.b() + eVar2.L.c();
        int b3 = eVar2.N.f2114f.b() - eVar2.N.c();
        if (b3 >= b2) {
            int k2 = eVar2.k();
            if (eVar2.B() != 8) {
                int i3 = eVar2.t;
                if (i3 == 2) {
                    if (!(eVar instanceof f)) {
                        eVar = eVar.v();
                    }
                    k2 = (int) (x * 0.5f * ((float) eVar.k()));
                } else if (i3 == 0) {
                    k2 = b3 - b2;
                }
                k2 = Math.max(eVar2.y, k2);
                int i4 = eVar2.z;
                if (i4 > 0) {
                    k2 = Math.min(i4, k2);
                }
            }
            int i5 = b2 + ((int) ((x * ((float) ((b3 - b2) - k2))) + 0.5f));
            eVar2.c(i5, k2 + i5);
            a(i2 + 1, eVar2, bVar);
        }
    }

    private static void a(int i2, e eVar, b.AbstractC0041b bVar, e eVar2, boolean z) {
        float l2 = eVar2.l();
        int b2 = eVar2.K.f2114f.b() + eVar2.K.c();
        int b3 = eVar2.M.f2114f.b() - eVar2.M.c();
        if (b3 >= b2) {
            int C = eVar2.C();
            if (eVar2.B() != 8) {
                int i3 = eVar2.s;
                if (i3 == 2) {
                    if (!(eVar instanceof f)) {
                        eVar = eVar.v();
                    }
                    C = (int) (eVar2.l() * 0.5f * ((float) eVar.C()));
                } else if (i3 == 0) {
                    C = b3 - b2;
                }
                C = Math.max(eVar2.v, C);
                int i4 = eVar2.w;
                if (i4 > 0) {
                    C = Math.min(i4, C);
                }
            }
            int i5 = b2 + ((int) ((l2 * ((float) ((b3 - b2) - C))) + 0.5f));
            eVar2.b(i5, C + i5);
            a(i2 + 1, eVar2, bVar, z);
        }
    }

    private static void a(int i2, e eVar, b.AbstractC0041b bVar, boolean z) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        d dVar5;
        if (!eVar.I()) {
            f2190b++;
            if (!(eVar instanceof f) && eVar.N()) {
                int i3 = i2 + 1;
                if (a(i3, eVar)) {
                    f.a(i3, eVar, bVar, new b.a(), b.a.f2148k);
                }
            }
            d a2 = eVar.a(d.b.LEFT);
            d a3 = eVar.a(d.b.RIGHT);
            int b2 = a2.b();
            int b3 = a3.b();
            if (a2.a() != null && a2.k()) {
                Iterator<d> it = a2.a().iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    e eVar2 = next.f2112d;
                    int i4 = i2 + 1;
                    boolean a4 = a(i4, eVar2);
                    if (eVar2.N() && a4) {
                        f.a(i4, eVar2, bVar, new b.a(), b.a.f2148k);
                    }
                    if (eVar2.n() != e.b.MATCH_CONSTRAINT || a4) {
                        if (!eVar2.N()) {
                            d dVar6 = eVar2.K;
                            if (next == dVar6 && eVar2.M.f2114f == null) {
                                int c2 = dVar6.c() + b2;
                                eVar2.b(c2, eVar2.C() + c2);
                            } else {
                                d dVar7 = eVar2.M;
                                if (next == dVar7 && eVar2.K.f2114f == null) {
                                    int c3 = b2 - dVar7.c();
                                    eVar2.b(c3 - eVar2.C(), c3);
                                } else if (next == eVar2.K && (dVar3 = eVar2.M.f2114f) != null && dVar3.k() && !eVar2.J()) {
                                    a(i4, bVar, eVar2, z);
                                }
                            }
                            a(i4, eVar2, bVar, z);
                        }
                    } else if (eVar2.n() == e.b.MATCH_CONSTRAINT && eVar2.w >= 0 && eVar2.v >= 0) {
                        if ((eVar2.B() == 8 || (eVar2.s == 0 && eVar2.i() == 0.0f)) && !eVar2.J() && !eVar2.M()) {
                            if (((next == eVar2.K && (dVar5 = eVar2.M.f2114f) != null && dVar5.k()) || (next == eVar2.M && (dVar4 = eVar2.K.f2114f) != null && dVar4.k())) && !eVar2.J()) {
                                a(i4, eVar, bVar, eVar2, z);
                            }
                        }
                    }
                }
            }
            if (!(eVar instanceof g)) {
                if (a3.a() != null && a3.k()) {
                    Iterator<d> it2 = a3.a().iterator();
                    while (it2.hasNext()) {
                        d next2 = it2.next();
                        e eVar3 = next2.f2112d;
                        int i5 = i2 + 1;
                        boolean a5 = a(i5, eVar3);
                        if (eVar3.N() && a5) {
                            f.a(i5, eVar3, bVar, new b.a(), b.a.f2148k);
                        }
                        boolean z2 = (next2 == eVar3.K && (dVar2 = eVar3.M.f2114f) != null && dVar2.k()) || (next2 == eVar3.M && (dVar = eVar3.K.f2114f) != null && dVar.k());
                        if (eVar3.n() != e.b.MATCH_CONSTRAINT || a5) {
                            if (!eVar3.N()) {
                                d dVar8 = eVar3.K;
                                if (next2 == dVar8 && eVar3.M.f2114f == null) {
                                    int c4 = dVar8.c() + b3;
                                    eVar3.b(c4, eVar3.C() + c4);
                                } else {
                                    d dVar9 = eVar3.M;
                                    if (next2 == dVar9 && eVar3.K.f2114f == null) {
                                        int c5 = b3 - dVar9.c();
                                        eVar3.b(c5 - eVar3.C(), c5);
                                    } else if (z2 && !eVar3.J()) {
                                        a(i5, bVar, eVar3, z);
                                    }
                                }
                                a(i5, eVar3, bVar, z);
                            }
                        } else if (eVar3.n() == e.b.MATCH_CONSTRAINT && eVar3.w >= 0 && eVar3.v >= 0) {
                            if ((eVar3.B() == 8 || (eVar3.s == 0 && eVar3.i() == 0.0f)) && !eVar3.J() && !eVar3.M() && z2 && !eVar3.J()) {
                                a(i5, eVar, bVar, eVar3, z);
                            }
                        }
                    }
                }
                eVar.R();
            }
        }
    }

    private static void a(int i2, b.AbstractC0041b bVar, e eVar) {
        float x = eVar.x();
        int b2 = eVar.L.f2114f.b();
        int b3 = eVar.N.f2114f.b();
        int c2 = eVar.L.c() + b2;
        int c3 = b3 - eVar.N.c();
        if (b2 == b3) {
            x = 0.5f;
        } else {
            b2 = c2;
            b3 = c3;
        }
        int k2 = eVar.k();
        int i3 = (b3 - b2) - k2;
        if (b2 > b3) {
            i3 = (b2 - b3) - k2;
        }
        int i4 = (int) (i3 > 0 ? (x * ((float) i3)) + 0.5f : x * ((float) i3));
        int i5 = b2 + i4;
        int i6 = i5 + k2;
        if (b2 > b3) {
            i5 = b2 - i4;
            i6 = i5 - k2;
        }
        eVar.c(i5, i6);
        a(i2 + 1, eVar, bVar);
    }

    private static void a(int i2, b.AbstractC0041b bVar, e eVar, boolean z) {
        float l2 = eVar.l();
        int b2 = eVar.K.f2114f.b();
        int b3 = eVar.M.f2114f.b();
        int c2 = eVar.K.c() + b2;
        int c3 = b3 - eVar.M.c();
        if (b2 == b3) {
            l2 = 0.5f;
        } else {
            b2 = c2;
            b3 = c3;
        }
        int C = eVar.C();
        int i3 = (b3 - b2) - C;
        if (b2 > b3) {
            i3 = (b2 - b3) - C;
        }
        int i4 = ((int) (i3 > 0 ? (l2 * ((float) i3)) + 0.5f : l2 * ((float) i3))) + b2;
        int i5 = i4 + C;
        if (b2 > b3) {
            i5 = i4 - C;
        }
        eVar.b(i4, i5);
        a(i2 + 1, eVar, bVar, z);
    }

    public static void a(f fVar, b.AbstractC0041b bVar) {
        int a0;
        int a02;
        e.b n = fVar.n();
        e.b z = fVar.z();
        f2190b = 0;
        f2191c = 0;
        fVar.V();
        ArrayList<e> W = fVar.W();
        int size = W.size();
        for (int i2 = 0; i2 < size; i2++) {
            W.get(i2).V();
        }
        boolean f0 = fVar.f0();
        if (n == e.b.FIXED) {
            fVar.b(0, fVar.C());
        } else {
            fVar.k(0);
        }
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            e eVar = W.get(i3);
            if (eVar instanceof g) {
                g gVar = (g) eVar;
                if (gVar.X() == 1) {
                    if (gVar.Y() != -1) {
                        a02 = gVar.Y();
                    } else if (gVar.Z() == -1 || !fVar.O()) {
                        if (fVar.O()) {
                            a02 = (int) ((gVar.a0() * ((float) fVar.C())) + 0.5f);
                        }
                        z2 = true;
                    } else {
                        a02 = fVar.C() - gVar.Z();
                    }
                    gVar.y(a02);
                    z2 = true;
                }
            } else if ((eVar instanceof a) && ((a) eVar).a0() == 0) {
                z3 = true;
            }
        }
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                e eVar2 = W.get(i4);
                if (eVar2 instanceof g) {
                    g gVar2 = (g) eVar2;
                    if (gVar2.X() == 1) {
                        a(0, gVar2, bVar, f0);
                    }
                }
            }
        }
        a(0, fVar, bVar, f0);
        if (z3) {
            for (int i5 = 0; i5 < size; i5++) {
                e eVar3 = W.get(i5);
                if (eVar3 instanceof a) {
                    a aVar = (a) eVar3;
                    if (aVar.a0() == 0) {
                        a(0, aVar, bVar, 0, f0);
                    }
                }
            }
        }
        if (z == e.b.FIXED) {
            fVar.c(0, fVar.k());
        } else {
            fVar.l(0);
        }
        boolean z4 = false;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            e eVar4 = W.get(i6);
            if (eVar4 instanceof g) {
                g gVar3 = (g) eVar4;
                if (gVar3.X() == 0) {
                    if (gVar3.Y() != -1) {
                        a0 = gVar3.Y();
                    } else if (gVar3.Z() == -1 || !fVar.P()) {
                        if (fVar.P()) {
                            a0 = (int) ((gVar3.a0() * ((float) fVar.k())) + 0.5f);
                        }
                        z4 = true;
                    } else {
                        a0 = fVar.k() - gVar3.Z();
                    }
                    gVar3.y(a0);
                    z4 = true;
                }
            } else if ((eVar4 instanceof a) && ((a) eVar4).a0() == 1) {
                z5 = true;
            }
        }
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                e eVar5 = W.get(i7);
                if (eVar5 instanceof g) {
                    g gVar4 = (g) eVar5;
                    if (gVar4.X() == 0) {
                        a(1, gVar4, bVar);
                    }
                }
            }
        }
        a(0, fVar, bVar);
        if (z5) {
            for (int i8 = 0; i8 < size; i8++) {
                e eVar6 = W.get(i8);
                if (eVar6 instanceof a) {
                    a aVar2 = (a) eVar6;
                    if (aVar2.a0() == 1) {
                        a(0, aVar2, bVar, 1, f0);
                    }
                }
            }
        }
        for (int i9 = 0; i9 < size; i9++) {
            e eVar7 = W.get(i9);
            if (eVar7.N() && a(0, eVar7)) {
                f.a(0, eVar7, bVar, a, b.a.f2148k);
                if (!(eVar7 instanceof g)) {
                    a(0, eVar7, bVar, f0);
                } else if (((g) eVar7).X() != 0) {
                    a(0, eVar7, bVar, f0);
                }
                a(0, eVar7, bVar);
            }
        }
    }

    private static boolean a(int i2, e eVar) {
        e.b n = eVar.n();
        e.b z = eVar.z();
        f fVar = eVar.v() != null ? (f) eVar.v() : null;
        if (fVar != null) {
            fVar.n();
            e.b bVar = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.z();
            e.b bVar2 = e.b.FIXED;
        }
        boolean z2 = n == e.b.FIXED || eVar.O() || n == e.b.WRAP_CONTENT || (n == e.b.MATCH_CONSTRAINT && eVar.s == 0 && eVar.Z == 0.0f && eVar.g(0)) || (n == e.b.MATCH_CONSTRAINT && eVar.s == 1 && eVar.a(0, eVar.C()));
        boolean z3 = z == e.b.FIXED || eVar.P() || z == e.b.WRAP_CONTENT || (z == e.b.MATCH_CONSTRAINT && eVar.t == 0 && eVar.Z == 0.0f && eVar.g(1)) || (n == e.b.MATCH_CONSTRAINT && eVar.t == 1 && eVar.a(1, eVar.k()));
        if (eVar.Z <= 0.0f || (!z2 && !z3)) {
            return z2 && z3;
        }
        return true;
    }
}
