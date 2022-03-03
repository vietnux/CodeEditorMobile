package e.b.b.a.c.b;

public final class v extends c0<v> {

    /* renamed from: e  reason: collision with root package name */
    private static volatile v[] f7090e;

    /* renamed from: c  reason: collision with root package name */
    public String f7091c = "";

    /* renamed from: d  reason: collision with root package name */
    public t[] f7092d = t.d();

    public v() {
        this.f7030b = null;
        this.a = -1;
    }

    public static v[] d() {
        if (f7090e == null) {
            synchronized (g0.f7047b) {
                if (f7090e == null) {
                    f7090e = new v[0];
                }
            }
        }
        return f7090e;
    }

    @Override // e.b.b.a.c.b.i0
    public final /* synthetic */ i0 a(y yVar) {
        while (true) {
            int d2 = yVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 10) {
                this.f7091c = yVar.c();
            } else if (d2 == 18) {
                int a = l0.a(yVar, 18);
                t[] tVarArr = this.f7092d;
                int length = tVarArr == null ? 0 : tVarArr.length;
                t[] tVarArr2 = new t[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f7092d, 0, tVarArr2, 0, length);
                }
                while (length < tVarArr2.length - 1) {
                    tVarArr2[length] = new t();
                    yVar.a(tVarArr2[length]);
                    yVar.d();
                    length++;
                }
                tVarArr2[length] = new t();
                yVar.a(tVarArr2[length]);
                this.f7092d = tVarArr2;
            } else if (!super.a(yVar, d2)) {
                return this;
            }
        }
    }

    @Override // e.b.b.a.c.b.c0, e.b.b.a.c.b.i0
    public final void a(z zVar) {
        String str = this.f7091c;
        if (str != null && !str.equals("")) {
            zVar.a(1, this.f7091c);
        }
        t[] tVarArr = this.f7092d;
        if (tVarArr != null && tVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                t[] tVarArr2 = this.f7092d;
                if (i2 >= tVarArr2.length) {
                    break;
                }
                t tVar = tVarArr2[i2];
                if (tVar != null) {
                    zVar.a(2, tVar);
                }
                i2++;
            }
        }
        super.a(zVar);
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.b.c0, e.b.b.a.c.b.i0
    public final int c() {
        int c2 = super.c();
        String str = this.f7091c;
        if (str != null && !str.equals("")) {
            c2 += z.b(1, this.f7091c);
        }
        t[] tVarArr = this.f7092d;
        if (tVarArr != null && tVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                t[] tVarArr2 = this.f7092d;
                if (i2 >= tVarArr2.length) {
                    break;
                }
                t tVar = tVarArr2[i2];
                if (tVar != null) {
                    c2 += z.b(2, tVar);
                }
                i2++;
            }
        }
        return c2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        String str = this.f7091c;
        if (str == null) {
            if (vVar.f7091c != null) {
                return false;
            }
        } else if (!str.equals(vVar.f7091c)) {
            return false;
        }
        if (!g0.a(this.f7092d, vVar.f7092d)) {
            return false;
        }
        e0 e0Var = this.f7030b;
        if (e0Var != null && !e0Var.a()) {
            return this.f7030b.equals(vVar.f7030b);
        }
        e0 e0Var2 = vVar.f7030b;
        return e0Var2 == null || e0Var2.a();
    }

    public final int hashCode() {
        int hashCode = (v.class.getName().hashCode() + 527) * 31;
        String str = this.f7091c;
        int i2 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + g0.a(this.f7092d)) * 31;
        e0 e0Var = this.f7030b;
        if (e0Var != null && !e0Var.a()) {
            i2 = this.f7030b.hashCode();
        }
        return hashCode2 + i2;
    }
}
