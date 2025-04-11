package e.b.b.a.c.e;

public final class g6 extends d<g6> {

    /* renamed from: h  reason: collision with root package name */
    private static volatile g6[] f7281h;

    /* renamed from: c  reason: collision with root package name */
    public String f7282c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f7283d = null;

    /* renamed from: e  reason: collision with root package name */
    public Long f7284e = null;

    /* renamed from: f  reason: collision with root package name */
    private Float f7285f = null;

    /* renamed from: g  reason: collision with root package name */
    public Double f7286g = null;

    public g6() {
        this.f7211b = null;
        this.a = -1;
    }

    public static g6[] e() {
        if (f7281h == null) {
            synchronized (h.f7289b) {
                if (f7281h == null) {
                    f7281h = new g6[0];
                }
            }
        }
        return f7281h;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        int a = super.a();
        String str = this.f7282c;
        if (str != null) {
            a += b.b(1, str);
        }
        String str2 = this.f7283d;
        if (str2 != null) {
            a += b.b(2, str2);
        }
        Long l2 = this.f7284e;
        if (l2 != null) {
            a += b.c(3, l2.longValue());
        }
        Float f2 = this.f7285f;
        if (f2 != null) {
            f2.floatValue();
            a += b.d(4) + 4;
        }
        Double d2 = this.f7286g;
        if (d2 == null) {
            return a;
        }
        d2.doubleValue();
        return a + b.d(5) + 8;
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j a(a aVar) {
        while (true) {
            int c2 = aVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 10) {
                this.f7282c = aVar.b();
            } else if (c2 == 18) {
                this.f7283d = aVar.b();
            } else if (c2 == 24) {
                this.f7284e = Long.valueOf(aVar.f());
            } else if (c2 == 37) {
                this.f7285f = Float.valueOf(Float.intBitsToFloat(aVar.g()));
            } else if (c2 == 41) {
                this.f7286g = Double.valueOf(Double.longBitsToDouble(aVar.h()));
            } else if (!super.a(aVar, c2)) {
                return this;
            }
        }
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        String str = this.f7282c;
        if (str != null) {
            bVar.a(1, str);
        }
        String str2 = this.f7283d;
        if (str2 != null) {
            bVar.a(2, str2);
        }
        Long l2 = this.f7284e;
        if (l2 != null) {
            bVar.b(3, l2.longValue());
        }
        Float f2 = this.f7285f;
        if (f2 != null) {
            bVar.a(4, f2.floatValue());
        }
        Double d2 = this.f7286g;
        if (d2 != null) {
            bVar.a(5, d2.doubleValue());
        }
        super.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g6)) {
            return false;
        }
        g6 g6Var = (g6) obj;
        String str = this.f7282c;
        if (str == null) {
            if (g6Var.f7282c != null) {
                return false;
            }
        } else if (!str.equals(g6Var.f7282c)) {
            return false;
        }
        String str2 = this.f7283d;
        if (str2 == null) {
            if (g6Var.f7283d != null) {
                return false;
            }
        } else if (!str2.equals(g6Var.f7283d)) {
            return false;
        }
        Long l2 = this.f7284e;
        if (l2 == null) {
            if (g6Var.f7284e != null) {
                return false;
            }
        } else if (!l2.equals(g6Var.f7284e)) {
            return false;
        }
        Float f2 = this.f7285f;
        if (f2 == null) {
            if (g6Var.f7285f != null) {
                return false;
            }
        } else if (!f2.equals(g6Var.f7285f)) {
            return false;
        }
        Double d2 = this.f7286g;
        if (d2 == null) {
            if (g6Var.f7286g != null) {
                return false;
            }
        } else if (!d2.equals(g6Var.f7286g)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(g6Var.f7211b);
        }
        f fVar2 = g6Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        int hashCode = (g6.class.getName().hashCode() + 527) * 31;
        String str = this.f7282c;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7283d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.f7284e;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Float f2 = this.f7285f;
        int hashCode5 = (hashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Double d2 = this.f7286g;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            i2 = this.f7211b.hashCode();
        }
        return hashCode6 + i2;
    }
}
