package e.b.b.a.c.e;

public final class d6 extends d<d6> {

    /* renamed from: e  reason: collision with root package name */
    private static volatile d6[] f7220e;

    /* renamed from: c  reason: collision with root package name */
    public String f7221c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f7222d = null;

    public d6() {
        this.f7211b = null;
        this.a = -1;
    }

    public static d6[] e() {
        if (f7220e == null) {
            synchronized (h.f7289b) {
                if (f7220e == null) {
                    f7220e = new d6[0];
                }
            }
        }
        return f7220e;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        int a = super.a();
        String str = this.f7221c;
        if (str != null) {
            a += b.b(1, str);
        }
        String str2 = this.f7222d;
        return str2 != null ? a + b.b(2, str2) : a;
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j a(a aVar) {
        while (true) {
            int c2 = aVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 10) {
                this.f7221c = aVar.b();
            } else if (c2 == 18) {
                this.f7222d = aVar.b();
            } else if (!super.a(aVar, c2)) {
                return this;
            }
        }
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        String str = this.f7221c;
        if (str != null) {
            bVar.a(1, str);
        }
        String str2 = this.f7222d;
        if (str2 != null) {
            bVar.a(2, str2);
        }
        super.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d6)) {
            return false;
        }
        d6 d6Var = (d6) obj;
        String str = this.f7221c;
        if (str == null) {
            if (d6Var.f7221c != null) {
                return false;
            }
        } else if (!str.equals(d6Var.f7221c)) {
            return false;
        }
        String str2 = this.f7222d;
        if (str2 == null) {
            if (d6Var.f7222d != null) {
                return false;
            }
        } else if (!str2.equals(d6Var.f7222d)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(d6Var.f7211b);
        }
        f fVar2 = d6Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        int hashCode = (d6.class.getName().hashCode() + 527) * 31;
        String str = this.f7221c;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7222d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            i2 = this.f7211b.hashCode();
        }
        return hashCode3 + i2;
    }
}
