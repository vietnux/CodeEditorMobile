package e.b.b.a.c.e;

public final class f6 extends d<f6> {

    /* renamed from: h  reason: collision with root package name */
    private static volatile f6[] f7258h;

    /* renamed from: c  reason: collision with root package name */
    public g6[] f7259c = g6.e();

    /* renamed from: d  reason: collision with root package name */
    public String f7260d = null;

    /* renamed from: e  reason: collision with root package name */
    public Long f7261e = null;

    /* renamed from: f  reason: collision with root package name */
    public Long f7262f = null;

    /* renamed from: g  reason: collision with root package name */
    public Integer f7263g = null;

    public f6() {
        this.f7211b = null;
        this.a = -1;
    }

    public static f6[] e() {
        if (f7258h == null) {
            synchronized (h.f7289b) {
                if (f7258h == null) {
                    f7258h = new f6[0];
                }
            }
        }
        return f7258h;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        int a = super.a();
        g6[] g6VarArr = this.f7259c;
        if (g6VarArr != null && g6VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                g6[] g6VarArr2 = this.f7259c;
                if (i2 >= g6VarArr2.length) {
                    break;
                }
                g6 g6Var = g6VarArr2[i2];
                if (g6Var != null) {
                    a += b.b(1, g6Var);
                }
                i2++;
            }
        }
        String str = this.f7260d;
        if (str != null) {
            a += b.b(2, str);
        }
        Long l2 = this.f7261e;
        if (l2 != null) {
            a += b.c(3, l2.longValue());
        }
        Long l3 = this.f7262f;
        if (l3 != null) {
            a += b.c(4, l3.longValue());
        }
        Integer num = this.f7263g;
        return num != null ? a + b.c(5, num.intValue()) : a;
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j a(a aVar) {
        while (true) {
            int c2 = aVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 10) {
                int a = m.a(aVar, 10);
                g6[] g6VarArr = this.f7259c;
                int length = g6VarArr == null ? 0 : g6VarArr.length;
                g6[] g6VarArr2 = new g6[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f7259c, 0, g6VarArr2, 0, length);
                }
                while (length < g6VarArr2.length - 1) {
                    g6VarArr2[length] = new g6();
                    aVar.a(g6VarArr2[length]);
                    aVar.c();
                    length++;
                }
                g6VarArr2[length] = new g6();
                aVar.a(g6VarArr2[length]);
                this.f7259c = g6VarArr2;
            } else if (c2 == 18) {
                this.f7260d = aVar.b();
            } else if (c2 == 24) {
                this.f7261e = Long.valueOf(aVar.f());
            } else if (c2 == 32) {
                this.f7262f = Long.valueOf(aVar.f());
            } else if (c2 == 40) {
                this.f7263g = Integer.valueOf(aVar.e());
            } else if (!super.a(aVar, c2)) {
                return this;
            }
        }
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        g6[] g6VarArr = this.f7259c;
        if (g6VarArr != null && g6VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                g6[] g6VarArr2 = this.f7259c;
                if (i2 >= g6VarArr2.length) {
                    break;
                }
                g6 g6Var = g6VarArr2[i2];
                if (g6Var != null) {
                    bVar.a(1, g6Var);
                }
                i2++;
            }
        }
        String str = this.f7260d;
        if (str != null) {
            bVar.a(2, str);
        }
        Long l2 = this.f7261e;
        if (l2 != null) {
            bVar.b(3, l2.longValue());
        }
        Long l3 = this.f7262f;
        if (l3 != null) {
            bVar.b(4, l3.longValue());
        }
        Integer num = this.f7263g;
        if (num != null) {
            bVar.a(5, num.intValue());
        }
        super.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f6)) {
            return false;
        }
        f6 f6Var = (f6) obj;
        if (!h.a(this.f7259c, f6Var.f7259c)) {
            return false;
        }
        String str = this.f7260d;
        if (str == null) {
            if (f6Var.f7260d != null) {
                return false;
            }
        } else if (!str.equals(f6Var.f7260d)) {
            return false;
        }
        Long l2 = this.f7261e;
        if (l2 == null) {
            if (f6Var.f7261e != null) {
                return false;
            }
        } else if (!l2.equals(f6Var.f7261e)) {
            return false;
        }
        Long l3 = this.f7262f;
        if (l3 == null) {
            if (f6Var.f7262f != null) {
                return false;
            }
        } else if (!l3.equals(f6Var.f7262f)) {
            return false;
        }
        Integer num = this.f7263g;
        if (num == null) {
            if (f6Var.f7263g != null) {
                return false;
            }
        } else if (!num.equals(f6Var.f7263g)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(f6Var.f7211b);
        }
        f fVar2 = f6Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        int hashCode = (((f6.class.getName().hashCode() + 527) * 31) + h.a(this.f7259c)) * 31;
        String str = this.f7260d;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f7261e;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f7262f;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.f7263g;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            i2 = this.f7211b.hashCode();
        }
        return hashCode5 + i2;
    }
}
