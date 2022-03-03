package e.b.b.a.c.e;

public final class a6 extends d<a6> {

    /* renamed from: c  reason: collision with root package name */
    public Integer f7162c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f7163d = null;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f7164e = null;

    /* renamed from: f  reason: collision with root package name */
    public String[] f7165f = m.f7423b;

    public a6() {
        this.f7211b = null;
        this.a = -1;
    }

    private final a6 b(a aVar) {
        int e2;
        while (true) {
            int c2 = aVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 8) {
                try {
                    e2 = aVar.e();
                    if (e2 < 0 || e2 > 6) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append(e2);
                        sb.append(" is not a valid enum MatchType");
                    } else {
                        this.f7162c = Integer.valueOf(e2);
                    }
                } catch (IllegalArgumentException unused) {
                    aVar.e(aVar.a());
                    a(aVar, c2);
                }
            } else if (c2 == 18) {
                this.f7163d = aVar.b();
            } else if (c2 == 24) {
                this.f7164e = Boolean.valueOf(aVar.d());
            } else if (c2 == 34) {
                int a = m.a(aVar, 34);
                String[] strArr = this.f7165f;
                int length = strArr == null ? 0 : strArr.length;
                String[] strArr2 = new String[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f7165f, 0, strArr2, 0, length);
                }
                while (length < strArr2.length - 1) {
                    strArr2[length] = aVar.b();
                    aVar.c();
                    length++;
                }
                strArr2[length] = aVar.b();
                this.f7165f = strArr2;
            } else if (!super.a(aVar, c2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append(e2);
        sb2.append(" is not a valid enum MatchType");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        int a = super.a();
        Integer num = this.f7162c;
        if (num != null) {
            a += b.c(1, num.intValue());
        }
        String str = this.f7163d;
        if (str != null) {
            a += b.b(2, str);
        }
        Boolean bool = this.f7164e;
        if (bool != null) {
            bool.booleanValue();
            a += b.d(3) + 1;
        }
        String[] strArr = this.f7165f;
        if (strArr == null || strArr.length <= 0) {
            return a;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            String[] strArr2 = this.f7165f;
            if (i2 >= strArr2.length) {
                return a + i3 + (i4 * 1);
            }
            String str2 = strArr2[i2];
            if (str2 != null) {
                i4++;
                i3 += b.a(str2);
            }
            i2++;
        }
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j a(a aVar) {
        b(aVar);
        return this;
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        Integer num = this.f7162c;
        if (num != null) {
            bVar.a(1, num.intValue());
        }
        String str = this.f7163d;
        if (str != null) {
            bVar.a(2, str);
        }
        Boolean bool = this.f7164e;
        if (bool != null) {
            bVar.a(3, bool.booleanValue());
        }
        String[] strArr = this.f7165f;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f7165f;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i2];
                if (str2 != null) {
                    bVar.a(4, str2);
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
        if (!(obj instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj;
        Integer num = this.f7162c;
        if (num == null) {
            if (a6Var.f7162c != null) {
                return false;
            }
        } else if (!num.equals(a6Var.f7162c)) {
            return false;
        }
        String str = this.f7163d;
        if (str == null) {
            if (a6Var.f7163d != null) {
                return false;
            }
        } else if (!str.equals(a6Var.f7163d)) {
            return false;
        }
        Boolean bool = this.f7164e;
        if (bool == null) {
            if (a6Var.f7164e != null) {
                return false;
            }
        } else if (!bool.equals(a6Var.f7164e)) {
            return false;
        }
        if (!h.a(this.f7165f, a6Var.f7165f)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(a6Var.f7211b);
        }
        f fVar2 = a6Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        int hashCode = (a6.class.getName().hashCode() + 527) * 31;
        Integer num = this.f7162c;
        int i2 = 0;
        int intValue = (hashCode + (num == null ? 0 : num.intValue())) * 31;
        String str = this.f7163d;
        int hashCode2 = (intValue + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f7164e;
        int hashCode3 = (((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + h.a(this.f7165f)) * 31;
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            i2 = this.f7211b.hashCode();
        }
        return hashCode3 + i2;
    }
}
