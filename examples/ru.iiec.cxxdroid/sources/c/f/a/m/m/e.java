package c.f.a.m.m;

import c.f.a.m.e;
import c.f.a.m.f;
import c.f.a.m.g;
import c.f.a.m.i;
import c.f.a.m.m.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class e {
    private f a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2162b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2163c = true;

    /* renamed from: d  reason: collision with root package name */
    private f f2164d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<p> f2165e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private b.AbstractC0041b f2166f;

    /* renamed from: g  reason: collision with root package name */
    private b.a f2167g;

    /* renamed from: h  reason: collision with root package name */
    ArrayList<m> f2168h;

    public e(f fVar) {
        new ArrayList();
        this.f2166f = null;
        this.f2167g = new b.a();
        this.f2168h = new ArrayList<>();
        this.a = fVar;
        this.f2164d = fVar;
    }

    private int a(f fVar, int i2) {
        int size = this.f2168h.size();
        long j2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            j2 = Math.max(j2, this.f2168h.get(i3).a(fVar, i2));
        }
        return (int) j2;
    }

    private void a(c.f.a.m.e eVar, e.b bVar, int i2, e.b bVar2, int i3) {
        b.a aVar = this.f2167g;
        aVar.a = bVar;
        aVar.f2151b = bVar2;
        aVar.f2152c = i2;
        aVar.f2153d = i3;
        this.f2166f.a(eVar, aVar);
        eVar.u(this.f2167g.f2154e);
        eVar.m(this.f2167g.f2155f);
        eVar.a(this.f2167g.f2157h);
        eVar.i(this.f2167g.f2156g);
    }

    private void a(f fVar, int i2, int i3, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f2171d;
        if (pVar.f2204c == null) {
            f fVar3 = this.a;
            if (!(pVar == fVar3.f2130d || pVar == fVar3.f2131e)) {
                if (mVar == null) {
                    mVar = new m(pVar, i3);
                    arrayList.add(mVar);
                }
                pVar.f2204c = mVar;
                mVar.a(pVar);
                for (d dVar : pVar.f2209h.f2178k) {
                    if (dVar instanceof f) {
                        a((f) dVar, i2, 0, fVar2, arrayList, mVar);
                    }
                }
                for (d dVar2 : pVar.f2210i.f2178k) {
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i2, 1, fVar2, arrayList, mVar);
                    }
                }
                if (i2 == 1 && (pVar instanceof n)) {
                    for (d dVar3 : ((n) pVar).f2196k.f2178k) {
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i2, 2, fVar2, arrayList, mVar);
                        }
                    }
                }
                for (f fVar4 : pVar.f2209h.f2179l) {
                    if (fVar4 == fVar2) {
                        mVar.a = true;
                    }
                    a(fVar4, i2, 0, fVar2, arrayList, mVar);
                }
                for (f fVar5 : pVar.f2210i.f2179l) {
                    if (fVar5 == fVar2) {
                        mVar.a = true;
                    }
                    a(fVar5, i2, 1, fVar2, arrayList, mVar);
                }
                if (i2 == 1 && (pVar instanceof n)) {
                    for (f fVar6 : ((n) pVar).f2196k.f2179l) {
                        a(fVar6, i2, 2, fVar2, arrayList, mVar);
                    }
                }
            }
        }
    }

    private void a(p pVar, int i2, ArrayList<m> arrayList) {
        for (d dVar : pVar.f2209h.f2178k) {
            if (dVar instanceof f) {
                a((f) dVar, i2, 0, pVar.f2210i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f2209h, i2, 0, pVar.f2210i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f2210i.f2178k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i2, 1, pVar.f2209h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f2210i, i2, 1, pVar.f2209h, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (d dVar3 : ((n) pVar).f2196k.f2178k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, 2, null, arrayList, null);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01c6, code lost:
        if (r3[3].f2114f != null) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0076, code lost:
        if (r1.t == 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0148, code lost:
        if (r3[1].f2114f != null) goto L_0x0150;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(c.f.a.m.f r14) {
        /*
        // Method dump skipped, instructions count: 615
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.m.e.a(c.f.a.m.f):boolean");
    }

    public void a() {
        a(this.f2165e);
        this.f2168h.clear();
        m.f2193d = 0;
        a(this.a.f2130d, 0, this.f2168h);
        a(this.a.f2131e, 1, this.f2168h);
        this.f2162b = false;
    }

    public void a(b.AbstractC0041b bVar) {
        this.f2166f = bVar;
    }

    public void a(ArrayList<p> arrayList) {
        p kVar;
        arrayList.clear();
        this.f2164d.f2130d.c();
        this.f2164d.f2131e.c();
        arrayList.add(this.f2164d.f2130d);
        arrayList.add(this.f2164d.f2131e);
        Iterator<c.f.a.m.e> it = this.f2164d.u0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            c.f.a.m.e next = it.next();
            if (next instanceof g) {
                kVar = new j(next);
            } else {
                if (next.J()) {
                    if (next.f2128b == null) {
                        next.f2128b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2128b);
                } else {
                    arrayList.add(next.f2130d);
                }
                if (next.L()) {
                    if (next.f2129c == null) {
                        next.f2129c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2129c);
                } else {
                    arrayList.add(next.f2131e);
                }
                if (next instanceof i) {
                    kVar = new k(next);
                }
            }
            arrayList.add(kVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().c();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f2203b != this.f2164d) {
                next2.a();
            }
        }
    }

    public boolean a(boolean z) {
        boolean z2;
        boolean z3 = z & true;
        boolean z4 = false;
        if (this.f2162b || this.f2163c) {
            Iterator<c.f.a.m.e> it = this.a.u0.iterator();
            while (it.hasNext()) {
                c.f.a.m.e next = it.next();
                next.d();
                next.a = false;
                next.f2130d.g();
                next.f2131e.g();
            }
            this.a.d();
            f fVar = this.a;
            fVar.a = false;
            fVar.f2130d.g();
            this.a.f2131e.g();
            this.f2163c = false;
        }
        if (a(this.f2164d)) {
            return false;
        }
        this.a.w(0);
        this.a.x(0);
        e.b b2 = this.a.b(0);
        e.b b3 = this.a.b(1);
        if (this.f2162b) {
            a();
        }
        int D = this.a.D();
        int E = this.a.E();
        this.a.f2130d.f2209h.a(D);
        this.a.f2131e.f2209h.a(E);
        d();
        e.b bVar = e.b.WRAP_CONTENT;
        if (b2 == bVar || b3 == bVar) {
            if (z3) {
                Iterator<p> it2 = this.f2165e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().f()) {
                            z3 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z3 && b2 == e.b.WRAP_CONTENT) {
                this.a.a(e.b.FIXED);
                f fVar2 = this.a;
                fVar2.u(a(fVar2, 0));
                f fVar3 = this.a;
                fVar3.f2130d.f2206e.a(fVar3.C());
            }
            if (z3 && b3 == e.b.WRAP_CONTENT) {
                this.a.b(e.b.FIXED);
                f fVar4 = this.a;
                fVar4.m(a(fVar4, 1));
                f fVar5 = this.a;
                fVar5.f2131e.f2206e.a(fVar5.k());
            }
        }
        e.b[] bVarArr = this.a.V;
        if (bVarArr[0] == e.b.FIXED || bVarArr[0] == e.b.MATCH_PARENT) {
            int C = this.a.C() + D;
            this.a.f2130d.f2210i.a(C);
            this.a.f2130d.f2206e.a(C - D);
            d();
            e.b[] bVarArr2 = this.a.V;
            if (bVarArr2[1] == e.b.FIXED || bVarArr2[1] == e.b.MATCH_PARENT) {
                int k2 = this.a.k() + E;
                this.a.f2131e.f2210i.a(k2);
                this.a.f2131e.f2206e.a(k2 - E);
            }
            d();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<p> it3 = this.f2165e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f2203b != this.a || next2.f2208g) {
                next2.b();
            }
        }
        Iterator<p> it4 = this.f2165e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z4 = true;
                break;
            }
            p next3 = it4.next();
            if ((z2 || next3.f2203b != this.a) && (!next3.f2209h.f2177j || ((!next3.f2210i.f2177j && !(next3 instanceof j)) || (!next3.f2206e.f2177j && !(next3 instanceof c) && !(next3 instanceof j))))) {
                break;
            }
        }
        this.a.a(b2);
        this.a.b(b3);
        return z4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(boolean r10, int r11) {
        /*
        // Method dump skipped, instructions count: 331
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.m.e.a(boolean, int):boolean");
    }

    public void b() {
        this.f2162b = true;
    }

    public boolean b(boolean z) {
        if (this.f2162b) {
            Iterator<c.f.a.m.e> it = this.a.u0.iterator();
            while (it.hasNext()) {
                c.f.a.m.e next = it.next();
                next.d();
                next.a = false;
                l lVar = next.f2130d;
                lVar.f2206e.f2177j = false;
                lVar.f2208g = false;
                lVar.g();
                n nVar = next.f2131e;
                nVar.f2206e.f2177j = false;
                nVar.f2208g = false;
                nVar.g();
            }
            this.a.d();
            f fVar = this.a;
            fVar.a = false;
            l lVar2 = fVar.f2130d;
            lVar2.f2206e.f2177j = false;
            lVar2.f2208g = false;
            lVar2.g();
            n nVar2 = this.a.f2131e;
            nVar2.f2206e.f2177j = false;
            nVar2.f2208g = false;
            nVar2.g();
            a();
        }
        if (a(this.f2164d)) {
            return false;
        }
        this.a.w(0);
        this.a.x(0);
        this.a.f2130d.f2209h.a(0);
        this.a.f2131e.f2209h.a(0);
        return true;
    }

    public void c() {
        this.f2163c = true;
    }

    public void d() {
        g gVar;
        g gVar2;
        int C;
        g gVar3;
        int C2;
        Iterator<c.f.a.m.e> it = this.a.u0.iterator();
        while (it.hasNext()) {
            c.f.a.m.e next = it.next();
            if (!next.a) {
                e.b[] bVarArr = next.V;
                boolean z = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i2 = next.s;
                int i3 = next.t;
                boolean z2 = bVar == e.b.WRAP_CONTENT || (bVar == e.b.MATCH_CONSTRAINT && i2 == 1);
                if (bVar2 == e.b.WRAP_CONTENT || (bVar2 == e.b.MATCH_CONSTRAINT && i3 == 1)) {
                    z = true;
                }
                g gVar4 = next.f2130d.f2206e;
                boolean z3 = gVar4.f2177j;
                g gVar5 = next.f2131e.f2206e;
                boolean z4 = gVar5.f2177j;
                if (!z3 || !z4) {
                    if (!z3 || !z) {
                        if (z4 && z2) {
                            a(next, e.b.WRAP_CONTENT, next.f2130d.f2206e.f2174g, e.b.FIXED, next.f2131e.f2206e.f2174g);
                            if (bVar == e.b.MATCH_CONSTRAINT) {
                                gVar3 = next.f2130d.f2206e;
                                C2 = next.C();
                            } else {
                                gVar2 = next.f2130d.f2206e;
                                C = next.C();
                                gVar2.a(C);
                            }
                        }
                        if (next.a && (gVar = next.f2131e.f2197l) != null) {
                            gVar.a(next.e());
                        }
                    } else {
                        a(next, e.b.FIXED, next.f2130d.f2206e.f2174g, e.b.WRAP_CONTENT, next.f2131e.f2206e.f2174g);
                        if (bVar2 == e.b.MATCH_CONSTRAINT) {
                            gVar3 = next.f2131e.f2206e;
                            C2 = next.k();
                        } else {
                            gVar2 = next.f2131e.f2206e;
                            C = next.k();
                            gVar2.a(C);
                        }
                    }
                    gVar3.f2189m = C2;
                    gVar.a(next.e());
                } else {
                    e.b bVar3 = e.b.FIXED;
                    a(next, bVar3, gVar4.f2174g, bVar3, gVar5.f2174g);
                }
                next.a = true;
                gVar.a(next.e());
            }
        }
    }
}
