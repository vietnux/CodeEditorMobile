package e.b.b.a.c.e;

public final class b6 extends d<b6> {

    /* renamed from: g  reason: collision with root package name */
    private static volatile b6[] f7183g;

    /* renamed from: c  reason: collision with root package name */
    public String f7184c = null;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f7185d = null;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f7186e = null;

    /* renamed from: f  reason: collision with root package name */
    public Integer f7187f = null;

    public b6() {
        this.f7211b = null;
        this.a = -1;
    }

    public static b6[] e() {
        if (f7183g == null) {
            synchronized (h.f7289b) {
                if (f7183g == null) {
                    f7183g = new b6[0];
                }
            }
        }
        return f7183g;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        int a = super.a();
        String str = this.f7184c;
        if (str != null) {
            a += b.b(1, str);
        }
        Boolean bool = this.f7185d;
        if (bool != null) {
            bool.booleanValue();
            a += b.d(2) + 1;
        }
        Boolean bool2 = this.f7186e;
        if (bool2 != null) {
            bool2.booleanValue();
            a += b.d(3) + 1;
        }
        Integer num = this.f7187f;
        return num != null ? a + b.c(4, num.intValue()) : a;
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j a(a aVar) {
        while (true) {
            int c2 = aVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 10) {
                this.f7184c = aVar.b();
            } else if (c2 == 16) {
                this.f7185d = Boolean.valueOf(aVar.d());
            } else if (c2 == 24) {
                this.f7186e = Boolean.valueOf(aVar.d());
            } else if (c2 == 32) {
                this.f7187f = Integer.valueOf(aVar.e());
            } else if (!super.a(aVar, c2)) {
                return this;
            }
        }
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        String str = this.f7184c;
        if (str != null) {
            bVar.a(1, str);
        }
        Boolean bool = this.f7185d;
        if (bool != null) {
            bVar.a(2, bool.booleanValue());
        }
        Boolean bool2 = this.f7186e;
        if (bool2 != null) {
            bVar.a(3, bool2.booleanValue());
        }
        Integer num = this.f7187f;
        if (num != null) {
            bVar.a(4, num.intValue());
        }
        super.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        String str = this.f7184c;
        if (str == null) {
            if (b6Var.f7184c != null) {
                return false;
            }
        } else if (!str.equals(b6Var.f7184c)) {
            return false;
        }
        Boolean bool = this.f7185d;
        if (bool == null) {
            if (b6Var.f7185d != null) {
                return false;
            }
        } else if (!bool.equals(b6Var.f7185d)) {
            return false;
        }
        Boolean bool2 = this.f7186e;
        if (bool2 == null) {
            if (b6Var.f7186e != null) {
                return false;
            }
        } else if (!bool2.equals(b6Var.f7186e)) {
            return false;
        }
        Integer num = this.f7187f;
        if (num == null) {
            if (b6Var.f7187f != null) {
                return false;
            }
        } else if (!num.equals(b6Var.f7187f)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(b6Var.f7211b);
        }
        f fVar2 = b6Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        int hashCode = (b6.class.getName().hashCode() + 527) * 31;
        String str = this.f7184c;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f7185d;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f7186e;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f7187f;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            i2 = this.f7211b.hashCode();
        }
        return hashCode5 + i2;
    }
}
