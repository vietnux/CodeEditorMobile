package c.f.a.m.m;

import c.f.a.m.d;
import c.f.a.m.e;
import c.f.a.m.h;
import c.f.a.m.m.f;
import c.f.a.m.m.p;
import java.util.List;

public class l extends p {

    /* renamed from: k  reason: collision with root package name */
    private static int[] f2192k = new int[2];

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = new int[p.b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                c.f.a.m.m.p$b[] r0 = c.f.a.m.m.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c.f.a.m.m.l.a.a = r0
                int[] r0 = c.f.a.m.m.l.a.a     // Catch:{ NoSuchFieldError -> 0x0014 }
                c.f.a.m.m.p$b r1 = c.f.a.m.m.p.b.START     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = c.f.a.m.m.l.a.a     // Catch:{ NoSuchFieldError -> 0x001f }
                c.f.a.m.m.p$b r1 = c.f.a.m.m.p.b.END     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = c.f.a.m.m.l.a.a     // Catch:{ NoSuchFieldError -> 0x002a }
                c.f.a.m.m.p$b r1 = c.f.a.m.m.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.m.l.a.<clinit>():void");
        }
    }

    public l(e eVar) {
        super(eVar);
        this.f2209h.f2172e = f.a.LEFT;
        this.f2210i.f2172e = f.a.RIGHT;
        this.f2207f = 0;
    }

    private void a(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 == -1) {
            int i9 = (int) ((((float) i8) * f2) + 0.5f);
            int i10 = (int) ((((float) i7) / f2) + 0.5f);
            if (i9 <= i7 && i8 <= i8) {
                iArr[0] = i9;
                iArr[1] = i8;
            } else if (i7 <= i7 && i10 <= i8) {
                iArr[0] = i7;
                iArr[1] = i10;
            }
        } else if (i6 == 0) {
            iArr[0] = (int) ((((float) i8) * f2) + 0.5f);
            iArr[1] = i8;
        } else if (i6 == 1) {
            iArr[0] = i7;
            iArr[1] = (int) ((((float) i7) * f2) + 0.5f);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // c.f.a.m.m.p
    public void a() {
        d dVar;
        f fVar;
        f fVar2;
        f fVar3;
        e eVar;
        int i2;
        d dVar2;
        List<d> list;
        f fVar4;
        int i3;
        f fVar5;
        f fVar6;
        e v;
        e v2;
        e eVar2 = this.f2203b;
        if (eVar2.a) {
            this.f2206e.a(eVar2.C());
        }
        if (!this.f2206e.f2177j) {
            this.f2205d = this.f2203b.n();
            e.b bVar = this.f2205d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (v2 = this.f2203b.v()) != null && (v2.n() == e.b.FIXED || v2.n() == e.b.MATCH_PARENT)) {
                    int C = (v2.C() - this.f2203b.K.c()) - this.f2203b.M.c();
                    a(this.f2209h, v2.f2130d.f2209h, this.f2203b.K.c());
                    a(this.f2210i, v2.f2130d.f2210i, -this.f2203b.M.c());
                    this.f2206e.a(C);
                    return;
                } else if (this.f2205d == e.b.FIXED) {
                    this.f2206e.a(this.f2203b.C());
                }
            }
        } else if (this.f2205d == e.b.MATCH_PARENT && (v = this.f2203b.v()) != null && (v.n() == e.b.FIXED || v.n() == e.b.MATCH_PARENT)) {
            a(this.f2209h, v.f2130d.f2209h, this.f2203b.K.c());
            a(this.f2210i, v.f2130d.f2210i, -this.f2203b.M.c());
            return;
        }
        int i4 = 1;
        if (this.f2206e.f2177j) {
            e eVar3 = this.f2203b;
            if (eVar3.a) {
                d[] dVarArr = eVar3.S;
                if (dVarArr[0].f2114f == null || dVarArr[1].f2114f == null) {
                    e eVar4 = this.f2203b;
                    d[] dVarArr2 = eVar4.S;
                    if (dVarArr2[0].f2114f != null) {
                        f a2 = a(dVarArr2[0]);
                        if (a2 != null) {
                            a(this.f2209h, a2, this.f2203b.S[0].c());
                        } else {
                            return;
                        }
                    } else if (dVarArr2[1].f2114f != null) {
                        f a3 = a(dVarArr2[1]);
                        if (a3 != null) {
                            a(this.f2210i, a3, -this.f2203b.S[1].c());
                            fVar6 = this.f2209h;
                            fVar5 = this.f2210i;
                            i3 = -this.f2206e.f2174g;
                            a(fVar6, fVar5, i3);
                            return;
                        }
                        return;
                    } else if (!(eVar4 instanceof h) && eVar4.v() != null && this.f2203b.a(d.b.CENTER).f2114f == null) {
                        a(this.f2209h, this.f2203b.v().f2130d.f2209h, this.f2203b.D());
                    } else {
                        return;
                    }
                    fVar6 = this.f2210i;
                    fVar5 = this.f2209h;
                    i3 = this.f2206e.f2174g;
                    a(fVar6, fVar5, i3);
                    return;
                } else if (eVar3.J()) {
                    this.f2209h.f2173f = this.f2203b.S[0].c();
                    fVar = this.f2210i;
                    dVar = this.f2203b.S[1];
                    fVar.f2173f = -dVar.c();
                } else {
                    f a4 = a(this.f2203b.S[0]);
                    if (a4 != null) {
                        a(this.f2209h, a4, this.f2203b.S[0].c());
                    }
                    f a5 = a(this.f2203b.S[1]);
                    if (a5 != null) {
                        a(this.f2210i, a5, -this.f2203b.S[1].c());
                    }
                    this.f2209h.f2169b = true;
                    this.f2210i.f2169b = true;
                    return;
                }
            }
        }
        if (this.f2205d == e.b.MATCH_CONSTRAINT && (i2 = (eVar = this.f2203b).s) != 0) {
            if (i2 == 2) {
                e v3 = eVar.v();
                if (v3 != null) {
                    g gVar = v3.f2131e.f2206e;
                    this.f2206e.f2179l.add(gVar);
                    gVar.f2178k.add(this.f2206e);
                    g gVar2 = this.f2206e;
                    gVar2.f2169b = true;
                    gVar2.f2178k.add(this.f2209h);
                    list = this.f2206e.f2178k;
                    dVar2 = this.f2210i;
                }
            } else if (i2 == 3) {
                if (eVar.t == 3) {
                    this.f2209h.a = this;
                    this.f2210i.a = this;
                    n nVar = eVar.f2131e;
                    nVar.f2209h.a = this;
                    nVar.f2210i.a = this;
                    this.f2206e.a = this;
                    if (eVar.L()) {
                        this.f2206e.f2179l.add(this.f2203b.f2131e.f2206e);
                        this.f2203b.f2131e.f2206e.f2178k.add(this.f2206e);
                        n nVar2 = this.f2203b.f2131e;
                        nVar2.f2206e.a = this;
                        this.f2206e.f2179l.add(nVar2.f2209h);
                        this.f2206e.f2179l.add(this.f2203b.f2131e.f2210i);
                        this.f2203b.f2131e.f2209h.f2178k.add(this.f2206e);
                        list = this.f2203b.f2131e.f2210i.f2178k;
                        dVar2 = this.f2206e;
                    } else if (this.f2203b.J()) {
                        this.f2203b.f2131e.f2206e.f2179l.add(this.f2206e);
                        list = this.f2206e.f2178k;
                        dVar2 = this.f2203b.f2131e.f2206e;
                    } else {
                        fVar4 = this.f2203b.f2131e.f2206e;
                    }
                } else {
                    g gVar3 = eVar.f2131e.f2206e;
                    this.f2206e.f2179l.add(gVar3);
                    gVar3.f2178k.add(this.f2206e);
                    this.f2203b.f2131e.f2209h.f2178k.add(this.f2206e);
                    this.f2203b.f2131e.f2210i.f2178k.add(this.f2206e);
                    g gVar4 = this.f2206e;
                    gVar4.f2169b = true;
                    gVar4.f2178k.add(this.f2209h);
                    this.f2206e.f2178k.add(this.f2210i);
                    this.f2209h.f2179l.add(this.f2206e);
                    fVar4 = this.f2210i;
                }
                list = fVar4.f2179l;
                dVar2 = this.f2206e;
            }
            list.add(dVar2);
        }
        e eVar5 = this.f2203b;
        d[] dVarArr3 = eVar5.S;
        if (dVarArr3[0].f2114f == null || dVarArr3[1].f2114f == null) {
            e eVar6 = this.f2203b;
            d[] dVarArr4 = eVar6.S;
            if (dVarArr4[0].f2114f != null) {
                f a6 = a(dVarArr4[0]);
                if (a6 != null) {
                    a(this.f2209h, a6, this.f2203b.S[0].c());
                } else {
                    return;
                }
            } else if (dVarArr4[1].f2114f != null) {
                f a7 = a(dVarArr4[1]);
                if (a7 != null) {
                    a(this.f2210i, a7, -this.f2203b.S[1].c());
                    fVar3 = this.f2209h;
                    fVar2 = this.f2210i;
                    i4 = -1;
                    a(fVar3, fVar2, i4, this.f2206e);
                }
                return;
            } else if (!(eVar6 instanceof h) && eVar6.v() != null) {
                a(this.f2209h, this.f2203b.v().f2130d.f2209h, this.f2203b.D());
            } else {
                return;
            }
            fVar3 = this.f2210i;
            fVar2 = this.f2209h;
            a(fVar3, fVar2, i4, this.f2206e);
        } else if (eVar5.J()) {
            this.f2209h.f2173f = this.f2203b.S[0].c();
            fVar = this.f2210i;
            dVar = this.f2203b.S[1];
            fVar.f2173f = -dVar.c();
        } else {
            f a8 = a(this.f2203b.S[0]);
            f a9 = a(this.f2203b.S[1]);
            if (a8 != null) {
                a8.b(this);
            }
            if (a9 != null) {
                a9.b(this);
            }
            this.f2211j = p.b.CENTER;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02a3, code lost:
        if (r14 != 1) goto L_0x02f8;
     */
    @Override // c.f.a.m.m.p, c.f.a.m.m.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(c.f.a.m.m.d r17) {
        /*
        // Method dump skipped, instructions count: 1051
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.m.l.a(c.f.a.m.m.d):void");
    }

    @Override // c.f.a.m.m.p
    public void b() {
        f fVar = this.f2209h;
        if (fVar.f2177j) {
            this.f2203b.w(fVar.f2174g);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // c.f.a.m.m.p
    public void c() {
        this.f2204c = null;
        this.f2209h.a();
        this.f2210i.a();
        this.f2206e.a();
        this.f2208g = false;
    }

    /* access modifiers changed from: package-private */
    @Override // c.f.a.m.m.p
    public boolean f() {
        return this.f2205d != e.b.MATCH_CONSTRAINT || this.f2203b.s == 0;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f2208g = false;
        this.f2209h.a();
        this.f2209h.f2177j = false;
        this.f2210i.a();
        this.f2210i.f2177j = false;
        this.f2206e.f2177j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f2203b.h();
    }
}
