package e.b.b.a.c.e;

public final class z5 extends d<z5> {

    /* renamed from: f  reason: collision with root package name */
    private static volatile z5[] f7743f;

    /* renamed from: c  reason: collision with root package name */
    public Integer f7744c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f7745d = null;

    /* renamed from: e  reason: collision with root package name */
    public x5 f7746e = null;

    public z5() {
        this.f7211b = null;
        this.a = -1;
    }

    public static z5[] e() {
        if (f7743f == null) {
            synchronized (h.f7289b) {
                if (f7743f == null) {
                    f7743f = new z5[0];
                }
            }
        }
        return f7743f;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        int a = super.a();
        Integer num = this.f7744c;
        if (num != null) {
            a += b.c(1, num.intValue());
        }
        String str = this.f7745d;
        if (str != null) {
            a += b.b(2, str);
        }
        x5 x5Var = this.f7746e;
        return x5Var != null ? a + b.b(3, x5Var) : a;
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j a(a aVar) {
        while (true) {
            int c2 = aVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 8) {
                this.f7744c = Integer.valueOf(aVar.e());
            } else if (c2 == 18) {
                this.f7745d = aVar.b();
            } else if (c2 == 26) {
                if (this.f7746e == null) {
                    this.f7746e = new x5();
                }
                aVar.a(this.f7746e);
            } else if (!super.a(aVar, c2)) {
                return this;
            }
        }
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        Integer num = this.f7744c;
        if (num != null) {
            bVar.a(1, num.intValue());
        }
        String str = this.f7745d;
        if (str != null) {
            bVar.a(2, str);
        }
        x5 x5Var = this.f7746e;
        if (x5Var != null) {
            bVar.a(3, x5Var);
        }
        super.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z5)) {
            return false;
        }
        z5 z5Var = (z5) obj;
        Integer num = this.f7744c;
        if (num == null) {
            if (z5Var.f7744c != null) {
                return false;
            }
        } else if (!num.equals(z5Var.f7744c)) {
            return false;
        }
        String str = this.f7745d;
        if (str == null) {
            if (z5Var.f7745d != null) {
                return false;
            }
        } else if (!str.equals(z5Var.f7745d)) {
            return false;
        }
        x5 x5Var = this.f7746e;
        if (x5Var == null) {
            if (z5Var.f7746e != null) {
                return false;
            }
        } else if (!x5Var.equals(z5Var.f7746e)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(z5Var.f7211b);
        }
        f fVar2 = z5Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        int hashCode = (z5.class.getName().hashCode() + 527) * 31;
        Integer num = this.f7744c;
        int i2 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f7745d;
        int hashCode3 = hashCode2 + (str == null ? 0 : str.hashCode());
        x5 x5Var = this.f7746e;
        int hashCode4 = ((hashCode3 * 31) + (x5Var == null ? 0 : x5Var.hashCode())) * 31;
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            i2 = this.f7211b.hashCode();
        }
        return hashCode4 + i2;
    }
}
