package e.b.b.a.c.e;

public final class w5 extends d<w5> {

    /* renamed from: h  reason: collision with root package name */
    private static volatile w5[] f7661h;

    /* renamed from: c  reason: collision with root package name */
    public Integer f7662c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f7663d = null;

    /* renamed from: e  reason: collision with root package name */
    public x5[] f7664e = x5.e();

    /* renamed from: f  reason: collision with root package name */
    private Boolean f7665f = null;

    /* renamed from: g  reason: collision with root package name */
    public y5 f7666g = null;

    public w5() {
        this.f7211b = null;
        this.a = -1;
    }

    public static w5[] e() {
        if (f7661h == null) {
            synchronized (h.f7289b) {
                if (f7661h == null) {
                    f7661h = new w5[0];
                }
            }
        }
        return f7661h;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        int a = super.a();
        Integer num = this.f7662c;
        if (num != null) {
            a += b.c(1, num.intValue());
        }
        String str = this.f7663d;
        if (str != null) {
            a += b.b(2, str);
        }
        x5[] x5VarArr = this.f7664e;
        if (x5VarArr != null && x5VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                x5[] x5VarArr2 = this.f7664e;
                if (i2 >= x5VarArr2.length) {
                    break;
                }
                x5 x5Var = x5VarArr2[i2];
                if (x5Var != null) {
                    a += b.b(3, x5Var);
                }
                i2++;
            }
        }
        Boolean bool = this.f7665f;
        if (bool != null) {
            bool.booleanValue();
            a += b.d(4) + 1;
        }
        y5 y5Var = this.f7666g;
        return y5Var != null ? a + b.b(5, y5Var) : a;
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j a(a aVar) {
        while (true) {
            int c2 = aVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 8) {
                this.f7662c = Integer.valueOf(aVar.e());
            } else if (c2 == 18) {
                this.f7663d = aVar.b();
            } else if (c2 == 26) {
                int a = m.a(aVar, 26);
                x5[] x5VarArr = this.f7664e;
                int length = x5VarArr == null ? 0 : x5VarArr.length;
                x5[] x5VarArr2 = new x5[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f7664e, 0, x5VarArr2, 0, length);
                }
                while (length < x5VarArr2.length - 1) {
                    x5VarArr2[length] = new x5();
                    aVar.a(x5VarArr2[length]);
                    aVar.c();
                    length++;
                }
                x5VarArr2[length] = new x5();
                aVar.a(x5VarArr2[length]);
                this.f7664e = x5VarArr2;
            } else if (c2 == 32) {
                this.f7665f = Boolean.valueOf(aVar.d());
            } else if (c2 == 42) {
                if (this.f7666g == null) {
                    this.f7666g = new y5();
                }
                aVar.a(this.f7666g);
            } else if (!super.a(aVar, c2)) {
                return this;
            }
        }
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        Integer num = this.f7662c;
        if (num != null) {
            bVar.a(1, num.intValue());
        }
        String str = this.f7663d;
        if (str != null) {
            bVar.a(2, str);
        }
        x5[] x5VarArr = this.f7664e;
        if (x5VarArr != null && x5VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                x5[] x5VarArr2 = this.f7664e;
                if (i2 >= x5VarArr2.length) {
                    break;
                }
                x5 x5Var = x5VarArr2[i2];
                if (x5Var != null) {
                    bVar.a(3, x5Var);
                }
                i2++;
            }
        }
        Boolean bool = this.f7665f;
        if (bool != null) {
            bVar.a(4, bool.booleanValue());
        }
        y5 y5Var = this.f7666g;
        if (y5Var != null) {
            bVar.a(5, y5Var);
        }
        super.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w5)) {
            return false;
        }
        w5 w5Var = (w5) obj;
        Integer num = this.f7662c;
        if (num == null) {
            if (w5Var.f7662c != null) {
                return false;
            }
        } else if (!num.equals(w5Var.f7662c)) {
            return false;
        }
        String str = this.f7663d;
        if (str == null) {
            if (w5Var.f7663d != null) {
                return false;
            }
        } else if (!str.equals(w5Var.f7663d)) {
            return false;
        }
        if (!h.a(this.f7664e, w5Var.f7664e)) {
            return false;
        }
        Boolean bool = this.f7665f;
        if (bool == null) {
            if (w5Var.f7665f != null) {
                return false;
            }
        } else if (!bool.equals(w5Var.f7665f)) {
            return false;
        }
        y5 y5Var = this.f7666g;
        if (y5Var == null) {
            if (w5Var.f7666g != null) {
                return false;
            }
        } else if (!y5Var.equals(w5Var.f7666g)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(w5Var.f7211b);
        }
        f fVar2 = w5Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        int hashCode = (w5.class.getName().hashCode() + 527) * 31;
        Integer num = this.f7662c;
        int i2 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f7663d;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + h.a(this.f7664e)) * 31;
        Boolean bool = this.f7665f;
        int hashCode4 = hashCode3 + (bool == null ? 0 : bool.hashCode());
        y5 y5Var = this.f7666g;
        int hashCode5 = ((hashCode4 * 31) + (y5Var == null ? 0 : y5Var.hashCode())) * 31;
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            i2 = this.f7211b.hashCode();
        }
        return hashCode5 + i2;
    }
}
