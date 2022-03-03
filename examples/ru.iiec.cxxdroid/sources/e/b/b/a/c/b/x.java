package e.b.b.a.c.b;

public final class x extends c0<x> {

    /* renamed from: f  reason: collision with root package name */
    private static volatile x[] f7098f;

    /* renamed from: c  reason: collision with root package name */
    public int f7099c = 0;

    /* renamed from: d  reason: collision with root package name */
    public long f7100d = 0;

    /* renamed from: e  reason: collision with root package name */
    public String f7101e = "";

    public x() {
        this.f7030b = null;
        this.a = -1;
    }

    public static x[] d() {
        if (f7098f == null) {
            synchronized (g0.f7047b) {
                if (f7098f == null) {
                    f7098f = new x[0];
                }
            }
        }
        return f7098f;
    }

    @Override // e.b.b.a.c.b.i0
    public final /* synthetic */ i0 a(y yVar) {
        while (true) {
            int d2 = yVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 8) {
                this.f7099c = yVar.e();
            } else if (d2 == 17) {
                this.f7100d = yVar.f();
            } else if (d2 == 26) {
                this.f7101e = yVar.c();
            } else if (!super.a(yVar, d2)) {
                return this;
            }
        }
    }

    @Override // e.b.b.a.c.b.c0, e.b.b.a.c.b.i0
    public final void a(z zVar) {
        int i2 = this.f7099c;
        if (i2 != 0) {
            zVar.a(1, i2);
        }
        long j2 = this.f7100d;
        if (j2 != 0) {
            zVar.a(2, j2);
        }
        String str = this.f7101e;
        if (str != null && !str.equals("")) {
            zVar.a(3, this.f7101e);
        }
        super.a(zVar);
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.b.c0, e.b.b.a.c.b.i0
    public final int c() {
        int c2 = super.c();
        int i2 = this.f7099c;
        if (i2 != 0) {
            c2 += z.c(1, i2);
        }
        if (this.f7100d != 0) {
            c2 += z.d(2) + 8;
        }
        String str = this.f7101e;
        return (str == null || str.equals("")) ? c2 : c2 + z.b(3, this.f7101e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f7099c != xVar.f7099c || this.f7100d != xVar.f7100d) {
            return false;
        }
        String str = this.f7101e;
        if (str == null) {
            if (xVar.f7101e != null) {
                return false;
            }
        } else if (!str.equals(xVar.f7101e)) {
            return false;
        }
        e0 e0Var = this.f7030b;
        if (e0Var != null && !e0Var.a()) {
            return this.f7030b.equals(xVar.f7030b);
        }
        e0 e0Var2 = xVar.f7030b;
        return e0Var2 == null || e0Var2.a();
    }

    public final int hashCode() {
        long j2 = this.f7100d;
        int hashCode = (((((x.class.getName().hashCode() + 527) * 31) + this.f7099c) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f7101e;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        e0 e0Var = this.f7030b;
        if (e0Var != null && !e0Var.a()) {
            i2 = this.f7030b.hashCode();
        }
        return hashCode2 + i2;
    }
}
