package e.b.b.a.c.e;

public final class i6 extends d<i6> {
    private static volatile i6[] N;
    public String A = null;
    public Boolean B = null;
    public e6[] C = e6.e();
    public String D = null;
    public Integer E = null;
    private Integer F = null;
    private Integer G = null;
    public String H = null;
    public Long I = null;
    public Long J = null;
    public String K = null;
    private String L = null;
    public Integer M = null;

    /* renamed from: c  reason: collision with root package name */
    public Integer f7327c = null;

    /* renamed from: d  reason: collision with root package name */
    public f6[] f7328d = f6.e();

    /* renamed from: e  reason: collision with root package name */
    public k6[] f7329e = k6.e();

    /* renamed from: f  reason: collision with root package name */
    public Long f7330f = null;

    /* renamed from: g  reason: collision with root package name */
    public Long f7331g = null;

    /* renamed from: h  reason: collision with root package name */
    public Long f7332h = null;

    /* renamed from: i  reason: collision with root package name */
    public Long f7333i = null;

    /* renamed from: j  reason: collision with root package name */
    public Long f7334j = null;

    /* renamed from: k  reason: collision with root package name */
    public String f7335k = null;

    /* renamed from: l  reason: collision with root package name */
    public String f7336l = null;

    /* renamed from: m  reason: collision with root package name */
    public String f7337m = null;
    public String n = null;
    public Integer o = null;
    public String p = null;
    public String q = null;
    public String r = null;
    public Long s = null;
    public Long t = null;
    public String u = null;
    public Boolean v = null;
    public String w = null;
    public Long x = null;
    public Integer y = null;
    public String z = null;

    public i6() {
        this.f7211b = null;
        this.a = -1;
    }

    public static i6[] e() {
        if (N == null) {
            synchronized (h.f7289b) {
                if (N == null) {
                    N = new i6[0];
                }
            }
        }
        return N;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final int a() {
        int a = super.a();
        Integer num = this.f7327c;
        if (num != null) {
            a += b.c(1, num.intValue());
        }
        f6[] f6VarArr = this.f7328d;
        int i2 = 0;
        if (f6VarArr != null && f6VarArr.length > 0) {
            int i3 = a;
            int i4 = 0;
            while (true) {
                f6[] f6VarArr2 = this.f7328d;
                if (i4 >= f6VarArr2.length) {
                    break;
                }
                f6 f6Var = f6VarArr2[i4];
                if (f6Var != null) {
                    i3 += b.b(2, f6Var);
                }
                i4++;
            }
            a = i3;
        }
        k6[] k6VarArr = this.f7329e;
        if (k6VarArr != null && k6VarArr.length > 0) {
            int i5 = a;
            int i6 = 0;
            while (true) {
                k6[] k6VarArr2 = this.f7329e;
                if (i6 >= k6VarArr2.length) {
                    break;
                }
                k6 k6Var = k6VarArr2[i6];
                if (k6Var != null) {
                    i5 += b.b(3, k6Var);
                }
                i6++;
            }
            a = i5;
        }
        Long l2 = this.f7330f;
        if (l2 != null) {
            a += b.c(4, l2.longValue());
        }
        Long l3 = this.f7331g;
        if (l3 != null) {
            a += b.c(5, l3.longValue());
        }
        Long l4 = this.f7332h;
        if (l4 != null) {
            a += b.c(6, l4.longValue());
        }
        Long l5 = this.f7334j;
        if (l5 != null) {
            a += b.c(7, l5.longValue());
        }
        String str = this.f7335k;
        if (str != null) {
            a += b.b(8, str);
        }
        String str2 = this.f7336l;
        if (str2 != null) {
            a += b.b(9, str2);
        }
        String str3 = this.f7337m;
        if (str3 != null) {
            a += b.b(10, str3);
        }
        String str4 = this.n;
        if (str4 != null) {
            a += b.b(11, str4);
        }
        Integer num2 = this.o;
        if (num2 != null) {
            a += b.c(12, num2.intValue());
        }
        String str5 = this.p;
        if (str5 != null) {
            a += b.b(13, str5);
        }
        String str6 = this.q;
        if (str6 != null) {
            a += b.b(14, str6);
        }
        String str7 = this.r;
        if (str7 != null) {
            a += b.b(16, str7);
        }
        Long l6 = this.s;
        if (l6 != null) {
            a += b.c(17, l6.longValue());
        }
        Long l7 = this.t;
        if (l7 != null) {
            a += b.c(18, l7.longValue());
        }
        String str8 = this.u;
        if (str8 != null) {
            a += b.b(19, str8);
        }
        Boolean bool = this.v;
        if (bool != null) {
            bool.booleanValue();
            a += b.d(20) + 1;
        }
        String str9 = this.w;
        if (str9 != null) {
            a += b.b(21, str9);
        }
        Long l8 = this.x;
        if (l8 != null) {
            a += b.c(22, l8.longValue());
        }
        Integer num3 = this.y;
        if (num3 != null) {
            a += b.c(23, num3.intValue());
        }
        String str10 = this.z;
        if (str10 != null) {
            a += b.b(24, str10);
        }
        String str11 = this.A;
        if (str11 != null) {
            a += b.b(25, str11);
        }
        Long l9 = this.f7333i;
        if (l9 != null) {
            a += b.c(26, l9.longValue());
        }
        Boolean bool2 = this.B;
        if (bool2 != null) {
            bool2.booleanValue();
            a += b.d(28) + 1;
        }
        e6[] e6VarArr = this.C;
        if (e6VarArr != null && e6VarArr.length > 0) {
            while (true) {
                e6[] e6VarArr2 = this.C;
                if (i2 >= e6VarArr2.length) {
                    break;
                }
                e6 e6Var = e6VarArr2[i2];
                if (e6Var != null) {
                    a += b.b(29, e6Var);
                }
                i2++;
            }
        }
        String str12 = this.D;
        if (str12 != null) {
            a += b.b(30, str12);
        }
        Integer num4 = this.E;
        if (num4 != null) {
            a += b.c(31, num4.intValue());
        }
        Integer num5 = this.F;
        if (num5 != null) {
            a += b.c(32, num5.intValue());
        }
        Integer num6 = this.G;
        if (num6 != null) {
            a += b.c(33, num6.intValue());
        }
        String str13 = this.H;
        if (str13 != null) {
            a += b.b(34, str13);
        }
        Long l10 = this.I;
        if (l10 != null) {
            a += b.c(35, l10.longValue());
        }
        Long l11 = this.J;
        if (l11 != null) {
            a += b.c(36, l11.longValue());
        }
        String str14 = this.K;
        if (str14 != null) {
            a += b.b(37, str14);
        }
        String str15 = this.L;
        if (str15 != null) {
            a += b.b(38, str15);
        }
        Integer num7 = this.M;
        return num7 != null ? a + b.c(39, num7.intValue()) : a;
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j a(a aVar) {
        while (true) {
            int c2 = aVar.c();
            switch (c2) {
                case 0:
                    return this;
                case 8:
                    this.f7327c = Integer.valueOf(aVar.e());
                    break;
                case 18:
                    int a = m.a(aVar, 18);
                    f6[] f6VarArr = this.f7328d;
                    int length = f6VarArr == null ? 0 : f6VarArr.length;
                    f6[] f6VarArr2 = new f6[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f7328d, 0, f6VarArr2, 0, length);
                    }
                    while (length < f6VarArr2.length - 1) {
                        f6VarArr2[length] = new f6();
                        aVar.a(f6VarArr2[length]);
                        aVar.c();
                        length++;
                    }
                    f6VarArr2[length] = new f6();
                    aVar.a(f6VarArr2[length]);
                    this.f7328d = f6VarArr2;
                    break;
                case 26:
                    int a2 = m.a(aVar, 26);
                    k6[] k6VarArr = this.f7329e;
                    int length2 = k6VarArr == null ? 0 : k6VarArr.length;
                    k6[] k6VarArr2 = new k6[(a2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f7329e, 0, k6VarArr2, 0, length2);
                    }
                    while (length2 < k6VarArr2.length - 1) {
                        k6VarArr2[length2] = new k6();
                        aVar.a(k6VarArr2[length2]);
                        aVar.c();
                        length2++;
                    }
                    k6VarArr2[length2] = new k6();
                    aVar.a(k6VarArr2[length2]);
                    this.f7329e = k6VarArr2;
                    break;
                case 32:
                    this.f7330f = Long.valueOf(aVar.f());
                    break;
                case 40:
                    this.f7331g = Long.valueOf(aVar.f());
                    break;
                case 48:
                    this.f7332h = Long.valueOf(aVar.f());
                    break;
                case 56:
                    this.f7334j = Long.valueOf(aVar.f());
                    break;
                case 66:
                    this.f7335k = aVar.b();
                    break;
                case 74:
                    this.f7336l = aVar.b();
                    break;
                case 82:
                    this.f7337m = aVar.b();
                    break;
                case 90:
                    this.n = aVar.b();
                    break;
                case 96:
                    this.o = Integer.valueOf(aVar.e());
                    break;
                case 106:
                    this.p = aVar.b();
                    break;
                case 114:
                    this.q = aVar.b();
                    break;
                case 130:
                    this.r = aVar.b();
                    break;
                case 136:
                    this.s = Long.valueOf(aVar.f());
                    break;
                case 144:
                    this.t = Long.valueOf(aVar.f());
                    break;
                case 154:
                    this.u = aVar.b();
                    break;
                case 160:
                    this.v = Boolean.valueOf(aVar.d());
                    break;
                case 170:
                    this.w = aVar.b();
                    break;
                case 176:
                    this.x = Long.valueOf(aVar.f());
                    break;
                case 184:
                    this.y = Integer.valueOf(aVar.e());
                    break;
                case 194:
                    this.z = aVar.b();
                    break;
                case 202:
                    this.A = aVar.b();
                    break;
                case 208:
                    this.f7333i = Long.valueOf(aVar.f());
                    break;
                case 224:
                    this.B = Boolean.valueOf(aVar.d());
                    break;
                case 234:
                    int a3 = m.a(aVar, 234);
                    e6[] e6VarArr = this.C;
                    int length3 = e6VarArr == null ? 0 : e6VarArr.length;
                    e6[] e6VarArr2 = new e6[(a3 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.C, 0, e6VarArr2, 0, length3);
                    }
                    while (length3 < e6VarArr2.length - 1) {
                        e6VarArr2[length3] = new e6();
                        aVar.a(e6VarArr2[length3]);
                        aVar.c();
                        length3++;
                    }
                    e6VarArr2[length3] = new e6();
                    aVar.a(e6VarArr2[length3]);
                    this.C = e6VarArr2;
                    break;
                case 242:
                    this.D = aVar.b();
                    break;
                case 248:
                    this.E = Integer.valueOf(aVar.e());
                    break;
                case 256:
                    this.F = Integer.valueOf(aVar.e());
                    break;
                case 264:
                    this.G = Integer.valueOf(aVar.e());
                    break;
                case 274:
                    this.H = aVar.b();
                    break;
                case 280:
                    this.I = Long.valueOf(aVar.f());
                    break;
                case 288:
                    this.J = Long.valueOf(aVar.f());
                    break;
                case 298:
                    this.K = aVar.b();
                    break;
                case 306:
                    this.L = aVar.b();
                    break;
                case 312:
                    this.M = Integer.valueOf(aVar.e());
                    break;
                default:
                    if (super.a(aVar, c2)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    @Override // e.b.b.a.c.e.j, e.b.b.a.c.e.d
    public final void a(b bVar) {
        Integer num = this.f7327c;
        if (num != null) {
            bVar.a(1, num.intValue());
        }
        f6[] f6VarArr = this.f7328d;
        int i2 = 0;
        if (f6VarArr != null && f6VarArr.length > 0) {
            int i3 = 0;
            while (true) {
                f6[] f6VarArr2 = this.f7328d;
                if (i3 >= f6VarArr2.length) {
                    break;
                }
                f6 f6Var = f6VarArr2[i3];
                if (f6Var != null) {
                    bVar.a(2, f6Var);
                }
                i3++;
            }
        }
        k6[] k6VarArr = this.f7329e;
        if (k6VarArr != null && k6VarArr.length > 0) {
            int i4 = 0;
            while (true) {
                k6[] k6VarArr2 = this.f7329e;
                if (i4 >= k6VarArr2.length) {
                    break;
                }
                k6 k6Var = k6VarArr2[i4];
                if (k6Var != null) {
                    bVar.a(3, k6Var);
                }
                i4++;
            }
        }
        Long l2 = this.f7330f;
        if (l2 != null) {
            bVar.b(4, l2.longValue());
        }
        Long l3 = this.f7331g;
        if (l3 != null) {
            bVar.b(5, l3.longValue());
        }
        Long l4 = this.f7332h;
        if (l4 != null) {
            bVar.b(6, l4.longValue());
        }
        Long l5 = this.f7334j;
        if (l5 != null) {
            bVar.b(7, l5.longValue());
        }
        String str = this.f7335k;
        if (str != null) {
            bVar.a(8, str);
        }
        String str2 = this.f7336l;
        if (str2 != null) {
            bVar.a(9, str2);
        }
        String str3 = this.f7337m;
        if (str3 != null) {
            bVar.a(10, str3);
        }
        String str4 = this.n;
        if (str4 != null) {
            bVar.a(11, str4);
        }
        Integer num2 = this.o;
        if (num2 != null) {
            bVar.a(12, num2.intValue());
        }
        String str5 = this.p;
        if (str5 != null) {
            bVar.a(13, str5);
        }
        String str6 = this.q;
        if (str6 != null) {
            bVar.a(14, str6);
        }
        String str7 = this.r;
        if (str7 != null) {
            bVar.a(16, str7);
        }
        Long l6 = this.s;
        if (l6 != null) {
            bVar.b(17, l6.longValue());
        }
        Long l7 = this.t;
        if (l7 != null) {
            bVar.b(18, l7.longValue());
        }
        String str8 = this.u;
        if (str8 != null) {
            bVar.a(19, str8);
        }
        Boolean bool = this.v;
        if (bool != null) {
            bVar.a(20, bool.booleanValue());
        }
        String str9 = this.w;
        if (str9 != null) {
            bVar.a(21, str9);
        }
        Long l8 = this.x;
        if (l8 != null) {
            bVar.b(22, l8.longValue());
        }
        Integer num3 = this.y;
        if (num3 != null) {
            bVar.a(23, num3.intValue());
        }
        String str10 = this.z;
        if (str10 != null) {
            bVar.a(24, str10);
        }
        String str11 = this.A;
        if (str11 != null) {
            bVar.a(25, str11);
        }
        Long l9 = this.f7333i;
        if (l9 != null) {
            bVar.b(26, l9.longValue());
        }
        Boolean bool2 = this.B;
        if (bool2 != null) {
            bVar.a(28, bool2.booleanValue());
        }
        e6[] e6VarArr = this.C;
        if (e6VarArr != null && e6VarArr.length > 0) {
            while (true) {
                e6[] e6VarArr2 = this.C;
                if (i2 >= e6VarArr2.length) {
                    break;
                }
                e6 e6Var = e6VarArr2[i2];
                if (e6Var != null) {
                    bVar.a(29, e6Var);
                }
                i2++;
            }
        }
        String str12 = this.D;
        if (str12 != null) {
            bVar.a(30, str12);
        }
        Integer num4 = this.E;
        if (num4 != null) {
            bVar.a(31, num4.intValue());
        }
        Integer num5 = this.F;
        if (num5 != null) {
            bVar.a(32, num5.intValue());
        }
        Integer num6 = this.G;
        if (num6 != null) {
            bVar.a(33, num6.intValue());
        }
        String str13 = this.H;
        if (str13 != null) {
            bVar.a(34, str13);
        }
        Long l10 = this.I;
        if (l10 != null) {
            bVar.b(35, l10.longValue());
        }
        Long l11 = this.J;
        if (l11 != null) {
            bVar.b(36, l11.longValue());
        }
        String str14 = this.K;
        if (str14 != null) {
            bVar.a(37, str14);
        }
        String str15 = this.L;
        if (str15 != null) {
            bVar.a(38, str15);
        }
        Integer num7 = this.M;
        if (num7 != null) {
            bVar.a(39, num7.intValue());
        }
        super.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        Integer num = this.f7327c;
        if (num == null) {
            if (i6Var.f7327c != null) {
                return false;
            }
        } else if (!num.equals(i6Var.f7327c)) {
            return false;
        }
        if (!h.a(this.f7328d, i6Var.f7328d) || !h.a(this.f7329e, i6Var.f7329e)) {
            return false;
        }
        Long l2 = this.f7330f;
        if (l2 == null) {
            if (i6Var.f7330f != null) {
                return false;
            }
        } else if (!l2.equals(i6Var.f7330f)) {
            return false;
        }
        Long l3 = this.f7331g;
        if (l3 == null) {
            if (i6Var.f7331g != null) {
                return false;
            }
        } else if (!l3.equals(i6Var.f7331g)) {
            return false;
        }
        Long l4 = this.f7332h;
        if (l4 == null) {
            if (i6Var.f7332h != null) {
                return false;
            }
        } else if (!l4.equals(i6Var.f7332h)) {
            return false;
        }
        Long l5 = this.f7333i;
        if (l5 == null) {
            if (i6Var.f7333i != null) {
                return false;
            }
        } else if (!l5.equals(i6Var.f7333i)) {
            return false;
        }
        Long l6 = this.f7334j;
        if (l6 == null) {
            if (i6Var.f7334j != null) {
                return false;
            }
        } else if (!l6.equals(i6Var.f7334j)) {
            return false;
        }
        String str = this.f7335k;
        if (str == null) {
            if (i6Var.f7335k != null) {
                return false;
            }
        } else if (!str.equals(i6Var.f7335k)) {
            return false;
        }
        String str2 = this.f7336l;
        if (str2 == null) {
            if (i6Var.f7336l != null) {
                return false;
            }
        } else if (!str2.equals(i6Var.f7336l)) {
            return false;
        }
        String str3 = this.f7337m;
        if (str3 == null) {
            if (i6Var.f7337m != null) {
                return false;
            }
        } else if (!str3.equals(i6Var.f7337m)) {
            return false;
        }
        String str4 = this.n;
        if (str4 == null) {
            if (i6Var.n != null) {
                return false;
            }
        } else if (!str4.equals(i6Var.n)) {
            return false;
        }
        Integer num2 = this.o;
        if (num2 == null) {
            if (i6Var.o != null) {
                return false;
            }
        } else if (!num2.equals(i6Var.o)) {
            return false;
        }
        String str5 = this.p;
        if (str5 == null) {
            if (i6Var.p != null) {
                return false;
            }
        } else if (!str5.equals(i6Var.p)) {
            return false;
        }
        String str6 = this.q;
        if (str6 == null) {
            if (i6Var.q != null) {
                return false;
            }
        } else if (!str6.equals(i6Var.q)) {
            return false;
        }
        String str7 = this.r;
        if (str7 == null) {
            if (i6Var.r != null) {
                return false;
            }
        } else if (!str7.equals(i6Var.r)) {
            return false;
        }
        Long l7 = this.s;
        if (l7 == null) {
            if (i6Var.s != null) {
                return false;
            }
        } else if (!l7.equals(i6Var.s)) {
            return false;
        }
        Long l8 = this.t;
        if (l8 == null) {
            if (i6Var.t != null) {
                return false;
            }
        } else if (!l8.equals(i6Var.t)) {
            return false;
        }
        String str8 = this.u;
        if (str8 == null) {
            if (i6Var.u != null) {
                return false;
            }
        } else if (!str8.equals(i6Var.u)) {
            return false;
        }
        Boolean bool = this.v;
        if (bool == null) {
            if (i6Var.v != null) {
                return false;
            }
        } else if (!bool.equals(i6Var.v)) {
            return false;
        }
        String str9 = this.w;
        if (str9 == null) {
            if (i6Var.w != null) {
                return false;
            }
        } else if (!str9.equals(i6Var.w)) {
            return false;
        }
        Long l9 = this.x;
        if (l9 == null) {
            if (i6Var.x != null) {
                return false;
            }
        } else if (!l9.equals(i6Var.x)) {
            return false;
        }
        Integer num3 = this.y;
        if (num3 == null) {
            if (i6Var.y != null) {
                return false;
            }
        } else if (!num3.equals(i6Var.y)) {
            return false;
        }
        String str10 = this.z;
        if (str10 == null) {
            if (i6Var.z != null) {
                return false;
            }
        } else if (!str10.equals(i6Var.z)) {
            return false;
        }
        String str11 = this.A;
        if (str11 == null) {
            if (i6Var.A != null) {
                return false;
            }
        } else if (!str11.equals(i6Var.A)) {
            return false;
        }
        Boolean bool2 = this.B;
        if (bool2 == null) {
            if (i6Var.B != null) {
                return false;
            }
        } else if (!bool2.equals(i6Var.B)) {
            return false;
        }
        if (!h.a(this.C, i6Var.C)) {
            return false;
        }
        String str12 = this.D;
        if (str12 == null) {
            if (i6Var.D != null) {
                return false;
            }
        } else if (!str12.equals(i6Var.D)) {
            return false;
        }
        Integer num4 = this.E;
        if (num4 == null) {
            if (i6Var.E != null) {
                return false;
            }
        } else if (!num4.equals(i6Var.E)) {
            return false;
        }
        Integer num5 = this.F;
        if (num5 == null) {
            if (i6Var.F != null) {
                return false;
            }
        } else if (!num5.equals(i6Var.F)) {
            return false;
        }
        Integer num6 = this.G;
        if (num6 == null) {
            if (i6Var.G != null) {
                return false;
            }
        } else if (!num6.equals(i6Var.G)) {
            return false;
        }
        String str13 = this.H;
        if (str13 == null) {
            if (i6Var.H != null) {
                return false;
            }
        } else if (!str13.equals(i6Var.H)) {
            return false;
        }
        Long l10 = this.I;
        if (l10 == null) {
            if (i6Var.I != null) {
                return false;
            }
        } else if (!l10.equals(i6Var.I)) {
            return false;
        }
        Long l11 = this.J;
        if (l11 == null) {
            if (i6Var.J != null) {
                return false;
            }
        } else if (!l11.equals(i6Var.J)) {
            return false;
        }
        String str14 = this.K;
        if (str14 == null) {
            if (i6Var.K != null) {
                return false;
            }
        } else if (!str14.equals(i6Var.K)) {
            return false;
        }
        String str15 = this.L;
        if (str15 == null) {
            if (i6Var.L != null) {
                return false;
            }
        } else if (!str15.equals(i6Var.L)) {
            return false;
        }
        Integer num7 = this.M;
        if (num7 == null) {
            if (i6Var.M != null) {
                return false;
            }
        } else if (!num7.equals(i6Var.M)) {
            return false;
        }
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            return this.f7211b.equals(i6Var.f7211b);
        }
        f fVar2 = i6Var.f7211b;
        return fVar2 == null || fVar2.a();
    }

    public final int hashCode() {
        int hashCode = (i6.class.getName().hashCode() + 527) * 31;
        Integer num = this.f7327c;
        int i2 = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + h.a(this.f7328d)) * 31) + h.a(this.f7329e)) * 31;
        Long l2 = this.f7330f;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f7331g;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f7332h;
        int hashCode5 = (hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.f7333i;
        int hashCode6 = (hashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.f7334j;
        int hashCode7 = (hashCode6 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str = this.f7335k;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7336l;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7337m;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.n;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.o;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.p;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.q;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.r;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l7 = this.s;
        int hashCode16 = (hashCode15 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.t;
        int hashCode17 = (hashCode16 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str8 = this.u;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.v;
        int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.w;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l9 = this.x;
        int hashCode21 = (hashCode20 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Integer num3 = this.y;
        int hashCode22 = (hashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str10 = this.z;
        int hashCode23 = (hashCode22 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.A;
        int hashCode24 = (hashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.B;
        int hashCode25 = (((hashCode24 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + h.a(this.C)) * 31;
        String str12 = this.D;
        int hashCode26 = (hashCode25 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num4 = this.E;
        int hashCode27 = (hashCode26 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.F;
        int hashCode28 = (hashCode27 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.G;
        int hashCode29 = (hashCode28 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str13 = this.H;
        int hashCode30 = (hashCode29 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l10 = this.I;
        int hashCode31 = (hashCode30 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.J;
        int hashCode32 = (hashCode31 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str14 = this.K;
        int hashCode33 = (hashCode32 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.L;
        int hashCode34 = (hashCode33 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num7 = this.M;
        int hashCode35 = (hashCode34 + (num7 == null ? 0 : num7.hashCode())) * 31;
        f fVar = this.f7211b;
        if (fVar != null && !fVar.a()) {
            i2 = this.f7211b.hashCode();
        }
        return hashCode35 + i2;
    }
}
