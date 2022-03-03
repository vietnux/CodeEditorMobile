package e.b.b.a.c.e;

public final class c6 extends d<c6> {

    /* renamed from: c  reason: collision with root package name */
    public Long f7205c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f7206d = null;

    /* renamed from: e  reason: collision with root package name */
    private Integer f7207e = null;

    /* renamed from: f  reason: collision with root package name */
    public d6[] f7208f = d6.e();

    /* renamed from: g  reason: collision with root package name */
    public b6[] f7209g = b6.e();

    /* renamed from: h  reason: collision with root package name */
    public v5[] f7210h = v5.e();

    public c6() {
        this.f7211b = null;
        this.a = -1;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        int a = super.a();
        Long l2 = this.f7205c;
        if (l2 != null) {
            a += b.c(1, l2.longValue());
        }
        String str = this.f7206d;
        if (str != null) {
            a += b.b(2, str);
        }
        Integer num = this.f7207e;
        if (num != null) {
            a += b.c(3, num.intValue());
        }
        d6[] d6VarArr = this.f7208f;
        int i2 = 0;
        if (d6VarArr != null && d6VarArr.length > 0) {
            int i3 = a;
            int i4 = 0;
            while (true) {
                d6[] d6VarArr2 = this.f7208f;
                if (i4 >= d6VarArr2.length) {
                    break;
                }
                d6 d6Var = d6VarArr2[i4];
                if (d6Var != null) {
                    i3 += b.b(4, d6Var);
                }
                i4++;
            }
            a = i3;
        }
        b6[] b6VarArr = this.f7209g;
        if (b6VarArr != null && b6VarArr.length > 0) {
            int i5 = a;
            int i6 = 0;
            while (true) {
                b6[] b6VarArr2 = this.f7209g;
                if (i6 >= b6VarArr2.length) {
                    break;
                }
                b6 b6Var = b6VarArr2[i6];
                if (b6Var != null) {
                    i5 += b.b(5, b6Var);
                }
                i6++;
            }
            a = i5;
        }
        v5[] v5VarArr = this.f7210h;
        if (v5VarArr != null && v5VarArr.length > 0) {
            while (true) {
                v5[] v5VarArr2 = this.f7210h;
                if (i2 >= v5VarArr2.length) {
                    break;
                }
                v5 v5Var = v5VarArr2[i2];
                if (v5Var != null) {
                    a += b.b(6, v5Var);
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
                this.f7205c = Long.valueOf(aVar.f());
            } else if (c2 == 18) {
                this.f7206d = aVar.b();
            } else if (c2 == 24) {
                this.f7207e = Integer.valueOf(aVar.e());
            } else if (c2 == 34) {
                int a = m.a(aVar, 34);
                d6[] d6VarArr = this.f7208f;
                int length = d6VarArr == null ? 0 : d6VarArr.length;
                d6[] d6VarArr2 = new d6[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f7208f, 0, d6VarArr2, 0, length);
                }
                while (length < d6VarArr2.length - 1) {
                    d6VarArr2[length] = new d6();
                    aVar.a(d6VarArr2[length]);
                    aVar.c();
                    length++;
                }
                d6VarArr2[length] = new d6();
                aVar.a(d6VarArr2[length]);
                this.f7208f = d6VarArr2;
            } else if (c2 == 42) {
                int a2 = m.a(aVar, 42);
                b6[] b6VarArr = this.f7209g;
                int length2 = b6VarArr == null ? 0 : b6VarArr.length;
                b6[] b6VarArr2 = new b6[(a2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f7209g, 0, b6VarArr2, 0, length2);
                }
                while (length2 < b6VarArr2.length - 1) {
                    b6VarArr2[length2] = new b6();
                    aVar.a(b6VarArr2[length2]);
                    aVar.c();
                    length2++;
                }
                b6VarArr2[length2] = new b6();
                aVar.a(b6VarArr2[length2]);
                this.f7209g = b6VarArr2;
            } else if (c2 == 50) {
                int a3 = m.a(aVar, 50);
                v5[] v5VarArr = this.f7210h;
                int length3 = v5VarArr == null ? 0 : v5VarArr.length;
                v5[] v5VarArr2 = new v5[(a3 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.f7210h, 0, v5VarArr2, 0, length3);
                }
                while (length3 < v5VarArr2.length - 1) {
                    v5VarArr2[length3] = new v5();
                    aVar.a(v5VarArr2[length3]);
                    aVar.c();
                    length3++;
                }
                v5VarArr2[length3] = new v5();
                aVar.a(v5VarArr2[length3]);
                this.f7210h = v5VarArr2;
            } else if (!super.a(aVar, c2)) {
                return this;
            }
        }
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        Long l2 = this.f7205c;
        if (l2 != null) {
            bVar.b(1, l2.longValue());
        }
        String str = this.f7206d;
        if (str != null) {
            bVar.a(2, str);
        }
        Integer num = this.f7207e;
        if (num != null) {
            bVar.a(3, num.intValue());
        }
        d6[] d6VarArr = this.f7208f;
        int i2 = 0;
        if (d6VarArr != null && d6VarArr.length > 0) {
            int i3 = 0;
            while (true) {
                d6[] d6VarArr2 = this.f7208f;
                if (i3 >= d6VarArr2.length) {
                    break;
                }
                d6 d6Var = d6VarArr2[i3];
                if (d6Var != null) {
                    bVar.a(4, d6Var);
                }
                i3++;
            }
        }
        b6[] b6VarArr = this.f7209g;
        if (b6VarArr != null && b6VarArr.length > 0) {
            int i4 = 0;
            while (true) {
                b6[] b6VarArr2 = this.f7209g;
                if (i4 >= b6VarArr2.length) {
                    break;
                }
                b6 b6Var = b6VarArr2[i4];
                if (b6Var != null) {
                    bVar.a(5, b6Var);
                }
                i4++;
            }
        }
        v5[] v5VarArr = this.f7210h;
        if (v5VarArr != null && v5VarArr.length > 0) {
            while (true) {
                v5[] v5VarArr2 = this.f7210h;
                if (i2 >= v5VarArr2.length) {
                    break;
                }
                v5 v5Var = v5VarArr2[i2];
                if (v5Var != null) {
                    bVar.a(6, v5Var);
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
        if (!(obj instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj;
        Long l2 = this.f7205c;
        if (l2 == null) {
            if (c6Var.f7205c != null) {
                return false;
            }
        } else if (!l2.equals(c6Var.f7205c)) {
            return false;
        }
        String str = this.f7206d;
        if (str == null) {
            if (c6Var.f7206d != null) {
                return false;
            }
        } else if (!str.equals(c6Var.f7206d)) {
            return false;
        }
        Integer num = this.f7207e;
        if (num == null) {
            if (c6Var.f7207e != null) {
                return false;
            }
        } else if (!num.equals(c6Var.f7207e)) {
            return false;
        }
        if (!h.a(this.f7208f, c6Var.f7208f) || !h.a(this.f7209g, c6Var.f7209g) || !h.a(this.f7210h, c6Var.f7210h)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(c6Var.f7211b);
        }
        f fVar2 = c6Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        int hashCode = (c6.class.getName().hashCode() + 527) * 31;
        Long l2 = this.f7205c;
        int i2 = 0;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f7206d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f7207e;
        int hashCode4 = (((((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + h.a(this.f7208f)) * 31) + h.a(this.f7209g)) * 31) + h.a(this.f7210h)) * 31;
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            i2 = this.f7211b.hashCode();
        }
        return hashCode4 + i2;
    }
}
