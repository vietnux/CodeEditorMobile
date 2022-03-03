package e.b.b.a.c.b;

public final class w extends c0<w> {

    /* renamed from: c  reason: collision with root package name */
    public s f7093c = null;

    /* renamed from: d  reason: collision with root package name */
    public s f7094d = null;

    /* renamed from: e  reason: collision with root package name */
    public s f7095e = null;

    /* renamed from: f  reason: collision with root package name */
    public u f7096f = null;

    /* renamed from: g  reason: collision with root package name */
    public x[] f7097g = x.d();

    public w() {
        this.f7030b = null;
        this.a = -1;
    }

    @Override // e.b.b.a.c.b.i0
    public final /* synthetic */ i0 a(y yVar) {
        i0 i0Var;
        while (true) {
            int d2 = yVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 10) {
                if (this.f7093c == null) {
                    this.f7093c = new s();
                }
                i0Var = this.f7093c;
            } else if (d2 == 18) {
                if (this.f7094d == null) {
                    this.f7094d = new s();
                }
                i0Var = this.f7094d;
            } else if (d2 == 26) {
                if (this.f7095e == null) {
                    this.f7095e = new s();
                }
                i0Var = this.f7095e;
            } else if (d2 == 34) {
                if (this.f7096f == null) {
                    this.f7096f = new u();
                }
                i0Var = this.f7096f;
            } else if (d2 == 42) {
                int a = l0.a(yVar, 42);
                x[] xVarArr = this.f7097g;
                int length = xVarArr == null ? 0 : xVarArr.length;
                x[] xVarArr2 = new x[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f7097g, 0, xVarArr2, 0, length);
                }
                while (length < xVarArr2.length - 1) {
                    xVarArr2[length] = new x();
                    yVar.a(xVarArr2[length]);
                    yVar.d();
                    length++;
                }
                xVarArr2[length] = new x();
                yVar.a(xVarArr2[length]);
                this.f7097g = xVarArr2;
            } else if (!super.a(yVar, d2)) {
                return this;
            }
            yVar.a(i0Var);
        }
    }

    @Override // e.b.b.a.c.b.c0, e.b.b.a.c.b.i0
    public final void a(z zVar) {
        s sVar = this.f7093c;
        if (sVar != null) {
            zVar.a(1, sVar);
        }
        s sVar2 = this.f7094d;
        if (sVar2 != null) {
            zVar.a(2, sVar2);
        }
        s sVar3 = this.f7095e;
        if (sVar3 != null) {
            zVar.a(3, sVar3);
        }
        u uVar = this.f7096f;
        if (uVar != null) {
            zVar.a(4, uVar);
        }
        x[] xVarArr = this.f7097g;
        if (xVarArr != null && xVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                x[] xVarArr2 = this.f7097g;
                if (i2 >= xVarArr2.length) {
                    break;
                }
                x xVar = xVarArr2[i2];
                if (xVar != null) {
                    zVar.a(5, xVar);
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
        s sVar = this.f7093c;
        if (sVar != null) {
            c2 += z.b(1, sVar);
        }
        s sVar2 = this.f7094d;
        if (sVar2 != null) {
            c2 += z.b(2, sVar2);
        }
        s sVar3 = this.f7095e;
        if (sVar3 != null) {
            c2 += z.b(3, sVar3);
        }
        u uVar = this.f7096f;
        if (uVar != null) {
            c2 += z.b(4, uVar);
        }
        x[] xVarArr = this.f7097g;
        if (xVarArr != null && xVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                x[] xVarArr2 = this.f7097g;
                if (i2 >= xVarArr2.length) {
                    break;
                }
                x xVar = xVarArr2[i2];
                if (xVar != null) {
                    c2 += z.b(5, xVar);
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
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        s sVar = this.f7093c;
        if (sVar == null) {
            if (wVar.f7093c != null) {
                return false;
            }
        } else if (!sVar.equals(wVar.f7093c)) {
            return false;
        }
        s sVar2 = this.f7094d;
        if (sVar2 == null) {
            if (wVar.f7094d != null) {
                return false;
            }
        } else if (!sVar2.equals(wVar.f7094d)) {
            return false;
        }
        s sVar3 = this.f7095e;
        if (sVar3 == null) {
            if (wVar.f7095e != null) {
                return false;
            }
        } else if (!sVar3.equals(wVar.f7095e)) {
            return false;
        }
        u uVar = this.f7096f;
        if (uVar == null) {
            if (wVar.f7096f != null) {
                return false;
            }
        } else if (!uVar.equals(wVar.f7096f)) {
            return false;
        }
        if (!g0.a(this.f7097g, wVar.f7097g)) {
            return false;
        }
        e0 e0Var = this.f7030b;
        if (e0Var != null && !e0Var.a()) {
            return this.f7030b.equals(wVar.f7030b);
        }
        e0 e0Var2 = wVar.f7030b;
        return e0Var2 == null || e0Var2.a();
    }

    public final int hashCode() {
        s sVar = this.f7093c;
        int i2 = 0;
        int hashCode = ((w.class.getName().hashCode() + 527) * 31) + (sVar == null ? 0 : sVar.hashCode());
        s sVar2 = this.f7094d;
        int hashCode2 = (hashCode * 31) + (sVar2 == null ? 0 : sVar2.hashCode());
        s sVar3 = this.f7095e;
        int hashCode3 = (hashCode2 * 31) + (sVar3 == null ? 0 : sVar3.hashCode());
        u uVar = this.f7096f;
        int hashCode4 = ((((hashCode3 * 31) + (uVar == null ? 0 : uVar.hashCode())) * 31) + g0.a(this.f7097g)) * 31;
        e0 e0Var = this.f7030b;
        if (e0Var != null && !e0Var.a()) {
            i2 = this.f7030b.hashCode();
        }
        return hashCode4 + i2;
    }
}
