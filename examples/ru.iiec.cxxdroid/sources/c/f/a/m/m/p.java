package c.f.a.m.m;

import c.f.a.m.d;
import c.f.a.m.e;

public abstract class p implements d {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    e f2203b;

    /* renamed from: c  reason: collision with root package name */
    m f2204c;

    /* renamed from: d  reason: collision with root package name */
    protected e.b f2205d;

    /* renamed from: e  reason: collision with root package name */
    g f2206e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f2207f = 0;

    /* renamed from: g  reason: collision with root package name */
    boolean f2208g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f2209h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f2210i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    protected b f2211j = b.NONE;

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a = new int[d.b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                c.f.a.m.d$b[] r0 = c.f.a.m.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c.f.a.m.m.p.a.a = r0
                int[] r0 = c.f.a.m.m.p.a.a     // Catch:{ NoSuchFieldError -> 0x0014 }
                c.f.a.m.d$b r1 = c.f.a.m.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = c.f.a.m.m.p.a.a     // Catch:{ NoSuchFieldError -> 0x001f }
                c.f.a.m.d$b r1 = c.f.a.m.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = c.f.a.m.m.p.a.a     // Catch:{ NoSuchFieldError -> 0x002a }
                c.f.a.m.d$b r1 = c.f.a.m.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = c.f.a.m.m.p.a.a     // Catch:{ NoSuchFieldError -> 0x0035 }
                c.f.a.m.d$b r1 = c.f.a.m.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = c.f.a.m.m.p.a.a     // Catch:{ NoSuchFieldError -> 0x0040 }
                c.f.a.m.d$b r1 = c.f.a.m.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.m.p.a.<clinit>():void");
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(e eVar) {
        this.f2203b = eVar;
    }

    private void b(int i2, int i3) {
        int i4;
        g gVar;
        int i5 = this.a;
        if (i5 != 0) {
            if (i5 == 1) {
                int a2 = a(this.f2206e.f2189m, i2);
                gVar = this.f2206e;
                i4 = Math.min(a2, i3);
                gVar.a(i4);
            } else if (i5 == 2) {
                e v = this.f2203b.v();
                if (v != null) {
                    p pVar = i2 == 0 ? v.f2130d : v.f2131e;
                    if (pVar.f2206e.f2177j) {
                        e eVar = this.f2203b;
                        i3 = (int) ((((float) pVar.f2206e.f2174g) * (i2 == 0 ? eVar.x : eVar.A)) + 0.5f);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i5 == 3) {
                e eVar2 = this.f2203b;
                l lVar = eVar2.f2130d;
                e.b bVar = lVar.f2205d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && lVar.a == 3) {
                    n nVar = eVar2.f2131e;
                    if (nVar.f2205d == bVar2 && nVar.a == 3) {
                        return;
                    }
                }
                e eVar3 = this.f2203b;
                p pVar2 = i2 == 0 ? eVar3.f2131e : eVar3.f2130d;
                if (pVar2.f2206e.f2177j) {
                    float i6 = this.f2203b.i();
                    this.f2206e.a(i2 == 1 ? (int) ((((float) pVar2.f2206e.f2174g) / i6) + 0.5f) : (int) ((i6 * ((float) pVar2.f2206e.f2174g)) + 0.5f));
                    return;
                }
                return;
            } else {
                return;
            }
        }
        gVar = this.f2206e;
        i4 = a(i3, i2);
        gVar.a(i4);
    }

    /* access modifiers changed from: protected */
    public final int a(int i2, int i3) {
        int i4;
        if (i3 == 0) {
            e eVar = this.f2203b;
            int i5 = eVar.w;
            i4 = Math.max(eVar.v, i2);
            if (i5 > 0) {
                i4 = Math.min(i5, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        } else {
            e eVar2 = this.f2203b;
            int i6 = eVar2.z;
            i4 = Math.max(eVar2.y, i2);
            if (i6 > 0) {
                i4 = Math.min(i6, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    public final f a(d dVar) {
        p pVar;
        p pVar2;
        d dVar2 = dVar.f2114f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f2112d;
        int i2 = a.a[dVar2.f2113e.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                pVar2 = eVar.f2130d;
            } else if (i2 == 3) {
                pVar = eVar.f2131e;
            } else if (i2 == 4) {
                return eVar.f2131e.f2196k;
            } else {
                if (i2 != 5) {
                    return null;
                }
                pVar2 = eVar.f2131e;
            }
            return pVar2.f2210i;
        }
        pVar = eVar.f2130d;
        return pVar.f2209h;
    }

    /* access modifiers changed from: protected */
    public final f a(d dVar, int i2) {
        d dVar2 = dVar.f2114f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f2112d;
        p pVar = i2 == 0 ? eVar.f2130d : eVar.f2131e;
        int i3 = a.a[dVar.f2114f.f2113e.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f2210i;
        }
        return pVar.f2209h;
    }

    /* access modifiers changed from: package-private */
    public abstract void a();

    @Override // c.f.a.m.m.d
    public void a(d dVar) {
    }

    /* access modifiers changed from: protected */
    public void a(d dVar, d dVar2, d dVar3, int i2) {
        f fVar;
        f a2 = a(dVar2);
        f a3 = a(dVar3);
        if (a2.f2177j && a3.f2177j) {
            int c2 = a2.f2174g + dVar2.c();
            int c3 = a3.f2174g - dVar3.c();
            int i3 = c3 - c2;
            if (!this.f2206e.f2177j && this.f2205d == e.b.MATCH_CONSTRAINT) {
                b(i2, i3);
            }
            g gVar = this.f2206e;
            if (gVar.f2177j) {
                if (gVar.f2174g == i3) {
                    this.f2209h.a(c2);
                    fVar = this.f2210i;
                } else {
                    e eVar = this.f2203b;
                    float l2 = i2 == 0 ? eVar.l() : eVar.x();
                    if (a2 == a3) {
                        c2 = a2.f2174g;
                        c3 = a3.f2174g;
                        l2 = 0.5f;
                    }
                    this.f2209h.a((int) (((float) c2) + 0.5f + (((float) ((c3 - c2) - this.f2206e.f2174g)) * l2)));
                    fVar = this.f2210i;
                    c3 = this.f2209h.f2174g + this.f2206e.f2174g;
                }
                fVar.a(c3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, f fVar2, int i2) {
        fVar.f2179l.add(fVar2);
        fVar.f2173f = i2;
        fVar2.f2178k.add(fVar);
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, f fVar2, int i2, g gVar) {
        fVar.f2179l.add(fVar2);
        fVar.f2179l.add(this.f2206e);
        fVar.f2175h = i2;
        fVar.f2176i = gVar;
        fVar2.f2178k.add(fVar);
        gVar.f2178k.add(fVar);
    }

    /* access modifiers changed from: package-private */
    public abstract void b();

    /* access modifiers changed from: protected */
    public void b(d dVar) {
    }

    /* access modifiers changed from: package-private */
    public abstract void c();

    /* access modifiers changed from: protected */
    public void c(d dVar) {
    }

    public long d() {
        g gVar = this.f2206e;
        if (gVar.f2177j) {
            return (long) gVar.f2174g;
        }
        return 0;
    }

    public boolean e() {
        return this.f2208g;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean f();
}
