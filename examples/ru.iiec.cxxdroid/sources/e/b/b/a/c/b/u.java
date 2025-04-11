package e.b.b.a.c.b;

public final class u extends c0<u> {

    /* renamed from: c  reason: collision with root package name */
    public int f7085c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7086d = false;

    /* renamed from: e  reason: collision with root package name */
    private long f7087e = 0;

    public u() {
        this.f7030b = null;
        this.a = -1;
    }

    @Override // e.b.b.a.c.b.i0
    public final /* synthetic */ i0 a(y yVar) {
        while (true) {
            int d2 = yVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 8) {
                this.f7085c = yVar.e();
            } else if (d2 == 16) {
                this.f7086d = yVar.e() != 0;
            } else if (d2 == 25) {
                this.f7087e = yVar.f();
            } else if (!super.a(yVar, d2)) {
                return this;
            }
        }
    }

    @Override // e.b.b.a.c.b.c0, e.b.b.a.c.b.i0
    public final void a(z zVar) {
        int i2 = this.f7085c;
        if (i2 != 0) {
            zVar.a(1, i2);
        }
        boolean z = this.f7086d;
        if (z) {
            zVar.b(2, 0);
            zVar.a(z ? (byte) 1 : 0);
        }
        long j2 = this.f7087e;
        if (j2 != 0) {
            zVar.a(3, j2);
        }
        super.a(zVar);
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.b.c0, e.b.b.a.c.b.i0
    public final int c() {
        int c2 = super.c();
        int i2 = this.f7085c;
        if (i2 != 0) {
            c2 += z.c(1, i2);
        }
        if (this.f7086d) {
            c2 += z.d(2) + 1;
        }
        return this.f7087e != 0 ? c2 + z.d(3) + 8 : c2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f7085c != uVar.f7085c || this.f7086d != uVar.f7086d || this.f7087e != uVar.f7087e) {
            return false;
        }
        e0 e0Var = this.f7030b;
        if (e0Var != null && !e0Var.a()) {
            return this.f7030b.equals(uVar.f7030b);
        }
        e0 e0Var2 = uVar.f7030b;
        return e0Var2 == null || e0Var2.a();
    }

    public final int hashCode() {
        int hashCode = (((u.class.getName().hashCode() + 527) * 31) + this.f7085c) * 31;
        int i2 = this.f7086d ? 1231 : 1237;
        long j2 = this.f7087e;
        int i3 = (((hashCode + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        e0 e0Var = this.f7030b;
        return i3 + ((e0Var == null || e0Var.a()) ? 0 : this.f7030b.hashCode());
    }
}
