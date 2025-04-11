package e.b.b.a.c.e;

public final class v5 extends d<v5> {

    /* renamed from: f  reason: collision with root package name */
    private static volatile v5[] f7631f;

    /* renamed from: c  reason: collision with root package name */
    public Integer f7632c = null;

    /* renamed from: d  reason: collision with root package name */
    public z5[] f7633d = z5.e();

    /* renamed from: e  reason: collision with root package name */
    public w5[] f7634e = w5.e();

    public v5() {
        this.f7211b = null;
        this.a = -1;
    }

    public static v5[] e() {
        if (f7631f == null) {
            synchronized (h.f7289b) {
                if (f7631f == null) {
                    f7631f = new v5[0];
                }
            }
        }
        return f7631f;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        int a = super.a();
        Integer num = this.f7632c;
        if (num != null) {
            a += b.c(1, num.intValue());
        }
        z5[] z5VarArr = this.f7633d;
        int i2 = 0;
        if (z5VarArr != null && z5VarArr.length > 0) {
            int i3 = a;
            int i4 = 0;
            while (true) {
                z5[] z5VarArr2 = this.f7633d;
                if (i4 >= z5VarArr2.length) {
                    break;
                }
                z5 z5Var = z5VarArr2[i4];
                if (z5Var != null) {
                    i3 += b.b(2, z5Var);
                }
                i4++;
            }
            a = i3;
        }
        w5[] w5VarArr = this.f7634e;
        if (w5VarArr != null && w5VarArr.length > 0) {
            while (true) {
                w5[] w5VarArr2 = this.f7634e;
                if (i2 >= w5VarArr2.length) {
                    break;
                }
                w5 w5Var = w5VarArr2[i2];
                if (w5Var != null) {
                    a += b.b(3, w5Var);
                }
                i2++;
            }
        }
        return a;
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j a(a aVar) {
        while (true) {
            int c2 = aVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 8) {
                this.f7632c = Integer.valueOf(aVar.e());
            } else if (c2 == 18) {
                int a = m.a(aVar, 18);
                z5[] z5VarArr = this.f7633d;
                int length = z5VarArr == null ? 0 : z5VarArr.length;
                z5[] z5VarArr2 = new z5[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f7633d, 0, z5VarArr2, 0, length);
                }
                while (length < z5VarArr2.length - 1) {
                    z5VarArr2[length] = new z5();
                    aVar.a(z5VarArr2[length]);
                    aVar.c();
                    length++;
                }
                z5VarArr2[length] = new z5();
                aVar.a(z5VarArr2[length]);
                this.f7633d = z5VarArr2;
            } else if (c2 == 26) {
                int a2 = m.a(aVar, 26);
                w5[] w5VarArr = this.f7634e;
                int length2 = w5VarArr == null ? 0 : w5VarArr.length;
                w5[] w5VarArr2 = new w5[(a2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f7634e, 0, w5VarArr2, 0, length2);
                }
                while (length2 < w5VarArr2.length - 1) {
                    w5VarArr2[length2] = new w5();
                    aVar.a(w5VarArr2[length2]);
                    aVar.c();
                    length2++;
                }
                w5VarArr2[length2] = new w5();
                aVar.a(w5VarArr2[length2]);
                this.f7634e = w5VarArr2;
            } else if (!super.a(aVar, c2)) {
                return this;
            }
        }
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        Integer num = this.f7632c;
        if (num != null) {
            bVar.a(1, num.intValue());
        }
        z5[] z5VarArr = this.f7633d;
        int i2 = 0;
        if (z5VarArr != null && z5VarArr.length > 0) {
            int i3 = 0;
            while (true) {
                z5[] z5VarArr2 = this.f7633d;
                if (i3 >= z5VarArr2.length) {
                    break;
                }
                z5 z5Var = z5VarArr2[i3];
                if (z5Var != null) {
                    bVar.a(2, z5Var);
                }
                i3++;
            }
        }
        w5[] w5VarArr = this.f7634e;
        if (w5VarArr != null && w5VarArr.length > 0) {
            while (true) {
                w5[] w5VarArr2 = this.f7634e;
                if (i2 >= w5VarArr2.length) {
                    break;
                }
                w5 w5Var = w5VarArr2[i2];
                if (w5Var != null) {
                    bVar.a(3, w5Var);
                }
                i2++;
            }
        }
        super.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) obj;
        Integer num = this.f7632c;
        if (num == null) {
            if (v5Var.f7632c != null) {
                return false;
            }
        } else if (!num.equals(v5Var.f7632c)) {
            return false;
        }
        if (!h.a(this.f7633d, v5Var.f7633d) || !h.a(this.f7634e, v5Var.f7634e)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(v5Var.f7211b);
        }
        f fVar2 = v5Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        int hashCode = (v5.class.getName().hashCode() + 527) * 31;
        Integer num = this.f7632c;
        int i2 = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + h.a(this.f7633d)) * 31) + h.a(this.f7634e)) * 31;
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            i2 = this.f7211b.hashCode();
        }
        return hashCode2 + i2;
    }
}
