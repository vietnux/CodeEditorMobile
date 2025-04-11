package e.b.b.a.c.e;

public final class k6 extends d<k6> {

    /* renamed from: i  reason: collision with root package name */
    private static volatile k6[] f7395i;

    /* renamed from: c  reason: collision with root package name */
    public Long f7396c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f7397d = null;

    /* renamed from: e  reason: collision with root package name */
    public String f7398e = null;

    /* renamed from: f  reason: collision with root package name */
    public Long f7399f = null;

    /* renamed from: g  reason: collision with root package name */
    private Float f7400g = null;

    /* renamed from: h  reason: collision with root package name */
    public Double f7401h = null;

    public k6() {
        this.f7211b = null;
        this.a = -1;
    }

    public static k6[] e() {
        if (f7395i == null) {
            synchronized (h.f7289b) {
                if (f7395i == null) {
                    f7395i = new k6[0];
                }
            }
        }
        return f7395i;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        int a = super.a();
        Long l2 = this.f7396c;
        if (l2 != null) {
            a += b.c(1, l2.longValue());
        }
        String str = this.f7397d;
        if (str != null) {
            a += b.b(2, str);
        }
        String str2 = this.f7398e;
        if (str2 != null) {
            a += b.b(3, str2);
        }
        Long l3 = this.f7399f;
        if (l3 != null) {
            a += b.c(4, l3.longValue());
        }
        Float f2 = this.f7400g;
        if (f2 != null) {
            f2.floatValue();
            a += b.d(5) + 4;
        }
        Double d2 = this.f7401h;
        if (d2 == null) {
            return a;
        }
        d2.doubleValue();
        return a + b.d(6) + 8;
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j a(a aVar) {
        while (true) {
            int c2 = aVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 8) {
                this.f7396c = Long.valueOf(aVar.f());
            } else if (c2 == 18) {
                this.f7397d = aVar.b();
            } else if (c2 == 26) {
                this.f7398e = aVar.b();
            } else if (c2 == 32) {
                this.f7399f = Long.valueOf(aVar.f());
            } else if (c2 == 45) {
                this.f7400g = Float.valueOf(Float.intBitsToFloat(aVar.g()));
            } else if (c2 == 49) {
                this.f7401h = Double.valueOf(Double.longBitsToDouble(aVar.h()));
            } else if (!super.a(aVar, c2)) {
                return this;
            }
        }
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        Long l2 = this.f7396c;
        if (l2 != null) {
            bVar.b(1, l2.longValue());
        }
        String str = this.f7397d;
        if (str != null) {
            bVar.a(2, str);
        }
        String str2 = this.f7398e;
        if (str2 != null) {
            bVar.a(3, str2);
        }
        Long l3 = this.f7399f;
        if (l3 != null) {
            bVar.b(4, l3.longValue());
        }
        Float f2 = this.f7400g;
        if (f2 != null) {
            bVar.a(5, f2.floatValue());
        }
        Double d2 = this.f7401h;
        if (d2 != null) {
            bVar.a(6, d2.doubleValue());
        }
        super.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj;
        Long l2 = this.f7396c;
        if (l2 == null) {
            if (k6Var.f7396c != null) {
                return false;
            }
        } else if (!l2.equals(k6Var.f7396c)) {
            return false;
        }
        String str = this.f7397d;
        if (str == null) {
            if (k6Var.f7397d != null) {
                return false;
            }
        } else if (!str.equals(k6Var.f7397d)) {
            return false;
        }
        String str2 = this.f7398e;
        if (str2 == null) {
            if (k6Var.f7398e != null) {
                return false;
            }
        } else if (!str2.equals(k6Var.f7398e)) {
            return false;
        }
        Long l3 = this.f7399f;
        if (l3 == null) {
            if (k6Var.f7399f != null) {
                return false;
            }
        } else if (!l3.equals(k6Var.f7399f)) {
            return false;
        }
        Float f2 = this.f7400g;
        if (f2 == null) {
            if (k6Var.f7400g != null) {
                return false;
            }
        } else if (!f2.equals(k6Var.f7400g)) {
            return false;
        }
        Double d2 = this.f7401h;
        if (d2 == null) {
            if (k6Var.f7401h != null) {
                return false;
            }
        } else if (!d2.equals(k6Var.f7401h)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(k6Var.f7211b);
        }
        f fVar2 = k6Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        int hashCode = (k6.class.getName().hashCode() + 527) * 31;
        Long l2 = this.f7396c;
        int i2 = 0;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f7397d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7398e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.f7399f;
        int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Float f2 = this.f7400g;
        int hashCode6 = (hashCode5 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Double d2 = this.f7401h;
        int hashCode7 = (hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            i2 = this.f7211b.hashCode();
        }
        return hashCode7 + i2;
    }
}
