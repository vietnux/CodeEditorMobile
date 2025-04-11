package e.b.b.a.c.e;

public final class x5 extends d<x5> {

    /* renamed from: g  reason: collision with root package name */
    private static volatile x5[] f7689g;

    /* renamed from: c  reason: collision with root package name */
    public a6 f7690c = null;

    /* renamed from: d  reason: collision with root package name */
    public y5 f7691d = null;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f7692e = null;

    /* renamed from: f  reason: collision with root package name */
    public String f7693f = null;

    public x5() {
        this.f7211b = null;
        this.a = -1;
    }

    public static x5[] e() {
        if (f7689g == null) {
            synchronized (h.f7289b) {
                if (f7689g == null) {
                    f7689g = new x5[0];
                }
            }
        }
        return f7689g;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        int a = super.a();
        a6 a6Var = this.f7690c;
        if (a6Var != null) {
            a += b.b(1, a6Var);
        }
        y5 y5Var = this.f7691d;
        if (y5Var != null) {
            a += b.b(2, y5Var);
        }
        Boolean bool = this.f7692e;
        if (bool != null) {
            bool.booleanValue();
            a += b.d(3) + 1;
        }
        String str = this.f7693f;
        return str != null ? a + b.b(4, str) : a;
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j a(a aVar) {
        j jVar;
        while (true) {
            int c2 = aVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 10) {
                if (this.f7690c == null) {
                    this.f7690c = new a6();
                }
                jVar = this.f7690c;
            } else if (c2 == 18) {
                if (this.f7691d == null) {
                    this.f7691d = new y5();
                }
                jVar = this.f7691d;
            } else if (c2 == 24) {
                this.f7692e = Boolean.valueOf(aVar.d());
            } else if (c2 == 34) {
                this.f7693f = aVar.b();
            } else if (!super.a(aVar, c2)) {
                return this;
            }
            aVar.a(jVar);
        }
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        a6 a6Var = this.f7690c;
        if (a6Var != null) {
            bVar.a(1, a6Var);
        }
        y5 y5Var = this.f7691d;
        if (y5Var != null) {
            bVar.a(2, y5Var);
        }
        Boolean bool = this.f7692e;
        if (bool != null) {
            bVar.a(3, bool.booleanValue());
        }
        String str = this.f7693f;
        if (str != null) {
            bVar.a(4, str);
        }
        super.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj;
        a6 a6Var = this.f7690c;
        if (a6Var == null) {
            if (x5Var.f7690c != null) {
                return false;
            }
        } else if (!a6Var.equals(x5Var.f7690c)) {
            return false;
        }
        y5 y5Var = this.f7691d;
        if (y5Var == null) {
            if (x5Var.f7691d != null) {
                return false;
            }
        } else if (!y5Var.equals(x5Var.f7691d)) {
            return false;
        }
        Boolean bool = this.f7692e;
        if (bool == null) {
            if (x5Var.f7692e != null) {
                return false;
            }
        } else if (!bool.equals(x5Var.f7692e)) {
            return false;
        }
        String str = this.f7693f;
        if (str == null) {
            if (x5Var.f7693f != null) {
                return false;
            }
        } else if (!str.equals(x5Var.f7693f)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(x5Var.f7211b);
        }
        f fVar2 = x5Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        a6 a6Var = this.f7690c;
        int i2 = 0;
        int hashCode = ((x5.class.getName().hashCode() + 527) * 31) + (a6Var == null ? 0 : a6Var.hashCode());
        y5 y5Var = this.f7691d;
        int hashCode2 = ((hashCode * 31) + (y5Var == null ? 0 : y5Var.hashCode())) * 31;
        Boolean bool = this.f7692e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f7693f;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            i2 = this.f7211b.hashCode();
        }
        return hashCode4 + i2;
    }
}
