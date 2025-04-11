package e.b.b.a.c.e;

public final class e6 extends d<e6> {

    /* renamed from: g  reason: collision with root package name */
    private static volatile e6[] f7235g;

    /* renamed from: c  reason: collision with root package name */
    public Integer f7236c = null;

    /* renamed from: d  reason: collision with root package name */
    public j6 f7237d = null;

    /* renamed from: e  reason: collision with root package name */
    public j6 f7238e = null;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f7239f = null;

    public e6() {
        this.f7211b = null;
        this.a = -1;
    }

    public static e6[] e() {
        if (f7235g == null) {
            synchronized (h.f7289b) {
                if (f7235g == null) {
                    f7235g = new e6[0];
                }
            }
        }
        return f7235g;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        int a = super.a();
        Integer num = this.f7236c;
        if (num != null) {
            a += b.c(1, num.intValue());
        }
        j6 j6Var = this.f7237d;
        if (j6Var != null) {
            a += b.b(2, j6Var);
        }
        j6 j6Var2 = this.f7238e;
        if (j6Var2 != null) {
            a += b.b(3, j6Var2);
        }
        Boolean bool = this.f7239f;
        if (bool == null) {
            return a;
        }
        bool.booleanValue();
        return a + b.d(4) + 1;
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j a(a aVar) {
        j6 j6Var;
        while (true) {
            int c2 = aVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 != 8) {
                if (c2 == 18) {
                    if (this.f7237d == null) {
                        this.f7237d = new j6();
                    }
                    j6Var = this.f7237d;
                } else if (c2 == 26) {
                    if (this.f7238e == null) {
                        this.f7238e = new j6();
                    }
                    j6Var = this.f7238e;
                } else if (c2 == 32) {
                    this.f7239f = Boolean.valueOf(aVar.d());
                } else if (!super.a(aVar, c2)) {
                    return this;
                }
                aVar.a(j6Var);
            } else {
                this.f7236c = Integer.valueOf(aVar.e());
            }
        }
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        Integer num = this.f7236c;
        if (num != null) {
            bVar.a(1, num.intValue());
        }
        j6 j6Var = this.f7237d;
        if (j6Var != null) {
            bVar.a(2, j6Var);
        }
        j6 j6Var2 = this.f7238e;
        if (j6Var2 != null) {
            bVar.a(3, j6Var2);
        }
        Boolean bool = this.f7239f;
        if (bool != null) {
            bVar.a(4, bool.booleanValue());
        }
        super.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj;
        Integer num = this.f7236c;
        if (num == null) {
            if (e6Var.f7236c != null) {
                return false;
            }
        } else if (!num.equals(e6Var.f7236c)) {
            return false;
        }
        j6 j6Var = this.f7237d;
        if (j6Var == null) {
            if (e6Var.f7237d != null) {
                return false;
            }
        } else if (!j6Var.equals(e6Var.f7237d)) {
            return false;
        }
        j6 j6Var2 = this.f7238e;
        if (j6Var2 == null) {
            if (e6Var.f7238e != null) {
                return false;
            }
        } else if (!j6Var2.equals(e6Var.f7238e)) {
            return false;
        }
        Boolean bool = this.f7239f;
        if (bool == null) {
            if (e6Var.f7239f != null) {
                return false;
            }
        } else if (!bool.equals(e6Var.f7239f)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(e6Var.f7211b);
        }
        f fVar2 = e6Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        int hashCode = (e6.class.getName().hashCode() + 527) * 31;
        Integer num = this.f7236c;
        int i2 = 0;
        int hashCode2 = hashCode + (num == null ? 0 : num.hashCode());
        j6 j6Var = this.f7237d;
        int hashCode3 = (hashCode2 * 31) + (j6Var == null ? 0 : j6Var.hashCode());
        j6 j6Var2 = this.f7238e;
        int hashCode4 = ((hashCode3 * 31) + (j6Var2 == null ? 0 : j6Var2.hashCode())) * 31;
        Boolean bool = this.f7239f;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            i2 = this.f7211b.hashCode();
        }
        return hashCode5 + i2;
    }
}
