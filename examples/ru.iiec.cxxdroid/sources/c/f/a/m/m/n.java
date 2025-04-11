package c.f.a.m.m;

import c.f.a.m.e;
import c.f.a.m.m.f;
import c.f.a.m.m.p;

public class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f2196k = new f(this);

    /* renamed from: l  reason: collision with root package name */
    g f2197l = null;

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
                c.f.a.m.m.n.a.a = r0
                int[] r0 = c.f.a.m.m.n.a.a     // Catch:{ NoSuchFieldError -> 0x0014 }
                c.f.a.m.m.p$b r1 = c.f.a.m.m.p.b.START     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = c.f.a.m.m.n.a.a     // Catch:{ NoSuchFieldError -> 0x001f }
                c.f.a.m.m.p$b r1 = c.f.a.m.m.p.b.END     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = c.f.a.m.m.n.a.a     // Catch:{ NoSuchFieldError -> 0x002a }
                c.f.a.m.m.p$b r1 = c.f.a.m.m.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.m.n.a.<clinit>():void");
        }
    }

    public n(e eVar) {
        super(eVar);
        this.f2209h.f2172e = f.a.TOP;
        this.f2210i.f2172e = f.a.BOTTOM;
        this.f2196k.f2172e = f.a.BASELINE;
        this.f2207f = 1;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02f3, code lost:
        if (r9.f2203b.F() != false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0354, code lost:
        if (r0.f2205d == c.f.a.m.e.b.MATCH_CONSTRAINT) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0386, code lost:
        if (r9.f2203b.F() != false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03ff, code lost:
        if (r0.f2205d == c.f.a.m.e.b.MATCH_CONSTRAINT) goto L_0x0401;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    @Override // c.f.a.m.m.p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
        // Method dump skipped, instructions count: 1066
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.m.n.a():void");
    }

    @Override // c.f.a.m.m.p, c.f.a.m.m.d
    public void a(d dVar) {
        int i2;
        float f2;
        int i3 = a.a[this.f2211j.ordinal()];
        if (i3 == 1) {
            c(dVar);
        } else if (i3 == 2) {
            b(dVar);
        } else if (i3 == 3) {
            e eVar = this.f2203b;
            a(dVar, eVar.L, eVar.N, 1);
            return;
        }
        g gVar = this.f2206e;
        if (gVar.f2170c && !gVar.f2177j && this.f2205d == e.b.MATCH_CONSTRAINT) {
            e eVar2 = this.f2203b;
            int i4 = eVar2.t;
            if (i4 == 2) {
                e v = eVar2.v();
                if (v != null) {
                    g gVar2 = v.f2131e.f2206e;
                    if (gVar2.f2177j) {
                        i2 = (int) ((((float) gVar2.f2174g) * this.f2203b.A) + 0.5f);
                    }
                }
            } else if (i4 == 3 && eVar2.f2130d.f2206e.f2177j) {
                int j2 = eVar2.j();
                if (j2 != -1) {
                    if (j2 == 0) {
                        e eVar3 = this.f2203b;
                        f2 = ((float) eVar3.f2130d.f2206e.f2174g) * eVar3.i();
                        i2 = (int) (f2 + 0.5f);
                    } else if (j2 != 1) {
                        i2 = 0;
                    }
                }
                e eVar4 = this.f2203b;
                f2 = ((float) eVar4.f2130d.f2206e.f2174g) / eVar4.i();
                i2 = (int) (f2 + 0.5f);
            }
            this.f2206e.a(i2);
        }
        f fVar = this.f2209h;
        if (fVar.f2170c) {
            f fVar2 = this.f2210i;
            if (fVar2.f2170c) {
                if (!fVar.f2177j || !fVar2.f2177j || !this.f2206e.f2177j) {
                    if (!this.f2206e.f2177j && this.f2205d == e.b.MATCH_CONSTRAINT) {
                        e eVar5 = this.f2203b;
                        if (eVar5.s == 0 && !eVar5.L()) {
                            int i5 = this.f2209h.f2179l.get(0).f2174g;
                            f fVar3 = this.f2209h;
                            int i6 = i5 + fVar3.f2173f;
                            int i7 = this.f2210i.f2179l.get(0).f2174g + this.f2210i.f2173f;
                            fVar3.a(i6);
                            this.f2210i.a(i7);
                            this.f2206e.a(i7 - i6);
                            return;
                        }
                    }
                    if (!this.f2206e.f2177j && this.f2205d == e.b.MATCH_CONSTRAINT && this.a == 1 && this.f2209h.f2179l.size() > 0 && this.f2210i.f2179l.size() > 0) {
                        int i8 = (this.f2210i.f2179l.get(0).f2174g + this.f2210i.f2173f) - (this.f2209h.f2179l.get(0).f2174g + this.f2209h.f2173f);
                        g gVar3 = this.f2206e;
                        int i9 = gVar3.f2189m;
                        if (i8 < i9) {
                            gVar3.a(i8);
                        } else {
                            gVar3.a(i9);
                        }
                    }
                    if (this.f2206e.f2177j && this.f2209h.f2179l.size() > 0 && this.f2210i.f2179l.size() > 0) {
                        f fVar4 = this.f2209h.f2179l.get(0);
                        f fVar5 = this.f2210i.f2179l.get(0);
                        int i10 = fVar4.f2174g + this.f2209h.f2173f;
                        int i11 = fVar5.f2174g + this.f2210i.f2173f;
                        float x = this.f2203b.x();
                        if (fVar4 == fVar5) {
                            i10 = fVar4.f2174g;
                            i11 = fVar5.f2174g;
                            x = 0.5f;
                        }
                        this.f2209h.a((int) (((float) i10) + 0.5f + (((float) ((i11 - i10) - this.f2206e.f2174g)) * x)));
                        this.f2210i.a(this.f2209h.f2174g + this.f2206e.f2174g);
                    }
                }
            }
        }
    }

    @Override // c.f.a.m.m.p
    public void b() {
        f fVar = this.f2209h;
        if (fVar.f2177j) {
            this.f2203b.x(fVar.f2174g);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // c.f.a.m.m.p
    public void c() {
        this.f2204c = null;
        this.f2209h.a();
        this.f2210i.a();
        this.f2196k.a();
        this.f2206e.a();
        this.f2208g = false;
    }

    /* access modifiers changed from: package-private */
    @Override // c.f.a.m.m.p
    public boolean f() {
        return this.f2205d != e.b.MATCH_CONSTRAINT || this.f2203b.t == 0;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f2208g = false;
        this.f2209h.a();
        this.f2209h.f2177j = false;
        this.f2210i.a();
        this.f2210i.f2177j = false;
        this.f2196k.a();
        this.f2196k.f2177j = false;
        this.f2206e.f2177j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f2203b.h();
    }
}
