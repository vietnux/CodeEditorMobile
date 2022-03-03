package e.b.b.a.c.e;

public final class y5 extends d<y5> {

    /* renamed from: c  reason: collision with root package name */
    public Integer f7709c = null;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f7710d = null;

    /* renamed from: e  reason: collision with root package name */
    public String f7711e = null;

    /* renamed from: f  reason: collision with root package name */
    public String f7712f = null;

    /* renamed from: g  reason: collision with root package name */
    public String f7713g = null;

    public y5() {
        this.f7211b = null;
        this.a = -1;
    }

    private final y5 b(a aVar) {
        int e2;
        while (true) {
            int c2 = aVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 8) {
                try {
                    e2 = aVar.e();
                    if (e2 < 0 || e2 > 4) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(e2);
                        sb.append(" is not a valid enum ComparisonType");
                    } else {
                        this.f7709c = Integer.valueOf(e2);
                    }
                } catch (IllegalArgumentException unused) {
                    aVar.e(aVar.a());
                    a(aVar, c2);
                }
            } else if (c2 == 16) {
                this.f7710d = Boolean.valueOf(aVar.d());
            } else if (c2 == 26) {
                this.f7711e = aVar.b();
            } else if (c2 == 34) {
                this.f7712f = aVar.b();
            } else if (c2 == 42) {
                this.f7713g = aVar.b();
            } else if (!super.a(aVar, c2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(e2);
        sb2.append(" is not a valid enum ComparisonType");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        int a = super.a();
        Integer num = this.f7709c;
        if (num != null) {
            a += b.c(1, num.intValue());
        }
        Boolean bool = this.f7710d;
        if (bool != null) {
            bool.booleanValue();
            a += b.d(2) + 1;
        }
        String str = this.f7711e;
        if (str != null) {
            a += b.b(3, str);
        }
        String str2 = this.f7712f;
        if (str2 != null) {
            a += b.b(4, str2);
        }
        String str3 = this.f7713g;
        return str3 != null ? a + b.b(5, str3) : a;
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j a(a aVar) {
        b(aVar);
        return this;
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        Integer num = this.f7709c;
        if (num != null) {
            bVar.a(1, num.intValue());
        }
        Boolean bool = this.f7710d;
        if (bool != null) {
            bVar.a(2, bool.booleanValue());
        }
        String str = this.f7711e;
        if (str != null) {
            bVar.a(3, str);
        }
        String str2 = this.f7712f;
        if (str2 != null) {
            bVar.a(4, str2);
        }
        String str3 = this.f7713g;
        if (str3 != null) {
            bVar.a(5, str3);
        }
        super.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) obj;
        Integer num = this.f7709c;
        if (num == null) {
            if (y5Var.f7709c != null) {
                return false;
            }
        } else if (!num.equals(y5Var.f7709c)) {
            return false;
        }
        Boolean bool = this.f7710d;
        if (bool == null) {
            if (y5Var.f7710d != null) {
                return false;
            }
        } else if (!bool.equals(y5Var.f7710d)) {
            return false;
        }
        String str = this.f7711e;
        if (str == null) {
            if (y5Var.f7711e != null) {
                return false;
            }
        } else if (!str.equals(y5Var.f7711e)) {
            return false;
        }
        String str2 = this.f7712f;
        if (str2 == null) {
            if (y5Var.f7712f != null) {
                return false;
            }
        } else if (!str2.equals(y5Var.f7712f)) {
            return false;
        }
        String str3 = this.f7713g;
        if (str3 == null) {
            if (y5Var.f7713g != null) {
                return false;
            }
        } else if (!str3.equals(y5Var.f7713g)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(y5Var.f7211b);
        }
        f fVar2 = y5Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        int hashCode = (y5.class.getName().hashCode() + 527) * 31;
        Integer num = this.f7709c;
        int i2 = 0;
        int intValue = (hashCode + (num == null ? 0 : num.intValue())) * 31;
        Boolean bool = this.f7710d;
        int hashCode2 = (intValue + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f7711e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7712f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7713g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            i2 = this.f7211b.hashCode();
        }
        return hashCode5 + i2;
    }
}
