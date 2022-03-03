package com.google.android.gms.internal.ads;

public final class uv extends cv<uv> {

    /* renamed from: l  reason: collision with root package name */
    private static volatile uv[] f5780l;

    /* renamed from: c  reason: collision with root package name */
    public Integer f5781c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f5782d = null;

    /* renamed from: e  reason: collision with root package name */
    public pv f5783e = null;

    /* renamed from: f  reason: collision with root package name */
    private rv f5784f = null;

    /* renamed from: g  reason: collision with root package name */
    private Integer f5785g = null;

    /* renamed from: h  reason: collision with root package name */
    private int[] f5786h = lv.a;

    /* renamed from: i  reason: collision with root package name */
    private String f5787i = null;

    /* renamed from: j  reason: collision with root package name */
    public Integer f5788j = null;

    /* renamed from: k  reason: collision with root package name */
    public String[] f5789k = lv.f4905c;

    public uv() {
        this.f4045b = null;
        this.a = -1;
    }

    private final uv b(yu yuVar) {
        iv ivVar;
        int f2;
        while (true) {
            int d2 = yuVar.d();
            switch (d2) {
                case 0:
                    return this;
                case 8:
                    this.f5781c = Integer.valueOf(yuVar.f());
                    continue;
                case 18:
                    this.f5782d = yuVar.c();
                    continue;
                case 26:
                    if (this.f5783e == null) {
                        this.f5783e = new pv();
                    }
                    ivVar = this.f5783e;
                    break;
                case 34:
                    if (this.f5784f == null) {
                        this.f5784f = new rv();
                    }
                    ivVar = this.f5784f;
                    break;
                case 40:
                    this.f5785g = Integer.valueOf(yuVar.f());
                    continue;
                case 48:
                    int a = lv.a(yuVar, 48);
                    int[] iArr = this.f5786h;
                    int length = iArr == null ? 0 : iArr.length;
                    int[] iArr2 = new int[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f5786h, 0, iArr2, 0, length);
                    }
                    while (length < iArr2.length - 1) {
                        iArr2[length] = yuVar.f();
                        yuVar.d();
                        length++;
                    }
                    iArr2[length] = yuVar.f();
                    this.f5786h = iArr2;
                    continue;
                case 50:
                    int c2 = yuVar.c(yuVar.h());
                    int a2 = yuVar.a();
                    int i2 = 0;
                    while (yuVar.j() > 0) {
                        yuVar.f();
                        i2++;
                    }
                    yuVar.e(a2);
                    int[] iArr3 = this.f5786h;
                    int length2 = iArr3 == null ? 0 : iArr3.length;
                    int[] iArr4 = new int[(i2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f5786h, 0, iArr4, 0, length2);
                    }
                    while (length2 < iArr4.length) {
                        iArr4[length2] = yuVar.f();
                        length2++;
                    }
                    this.f5786h = iArr4;
                    yuVar.d(c2);
                    continue;
                case 58:
                    this.f5787i = yuVar.c();
                    continue;
                case 64:
                    try {
                        f2 = yuVar.f();
                        if (f2 < 0 || f2 > 3) {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append(f2);
                            sb.append(" is not a valid enum AdResourceType");
                            break;
                        } else {
                            this.f5788j = Integer.valueOf(f2);
                            continue;
                        }
                    } catch (IllegalArgumentException unused) {
                        yuVar.e(yuVar.a());
                        a(yuVar, d2);
                    }
                    break;
                case 74:
                    int a3 = lv.a(yuVar, 74);
                    String[] strArr = this.f5789k;
                    int length3 = strArr == null ? 0 : strArr.length;
                    String[] strArr2 = new String[(a3 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f5789k, 0, strArr2, 0, length3);
                    }
                    while (length3 < strArr2.length - 1) {
                        strArr2[length3] = yuVar.c();
                        yuVar.d();
                        length3++;
                    }
                    strArr2[length3] = yuVar.c();
                    this.f5789k = strArr2;
                    continue;
                default:
                    if (!super.a(yuVar, d2)) {
                        return this;
                    }
                    continue;
            }
            yuVar.a(ivVar);
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(f2);
        sb2.append(" is not a valid enum AdResourceType");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static uv[] d() {
        if (f5780l == null) {
            synchronized (gv.f4443b) {
                if (f5780l == null) {
                    f5780l = new uv[0];
                }
            }
        }
        return f5780l;
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        b(yuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        avVar.b(1, this.f5781c.intValue());
        String str = this.f5782d;
        if (str != null) {
            avVar.a(2, str);
        }
        pv pvVar = this.f5783e;
        if (pvVar != null) {
            avVar.a(3, pvVar);
        }
        rv rvVar = this.f5784f;
        if (rvVar != null) {
            avVar.a(4, rvVar);
        }
        Integer num = this.f5785g;
        if (num != null) {
            avVar.b(5, num.intValue());
        }
        int[] iArr = this.f5786h;
        int i2 = 0;
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f5786h;
                if (i3 >= iArr2.length) {
                    break;
                }
                avVar.b(6, iArr2[i3]);
                i3++;
            }
        }
        String str2 = this.f5787i;
        if (str2 != null) {
            avVar.a(7, str2);
        }
        Integer num2 = this.f5788j;
        if (num2 != null) {
            avVar.b(8, num2.intValue());
        }
        String[] strArr = this.f5789k;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f5789k;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i2];
                if (str3 != null) {
                    avVar.a(9, str3);
                }
                i2++;
            }
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int[] iArr;
        int c2 = super.c() + av.c(1, this.f5781c.intValue());
        String str = this.f5782d;
        if (str != null) {
            c2 += av.b(2, str);
        }
        pv pvVar = this.f5783e;
        if (pvVar != null) {
            c2 += av.b(3, pvVar);
        }
        rv rvVar = this.f5784f;
        if (rvVar != null) {
            c2 += av.b(4, rvVar);
        }
        Integer num = this.f5785g;
        if (num != null) {
            c2 += av.c(5, num.intValue());
        }
        int[] iArr2 = this.f5786h;
        int i2 = 0;
        if (iArr2 != null && iArr2.length > 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                iArr = this.f5786h;
                if (i3 >= iArr.length) {
                    break;
                }
                i4 += av.c(iArr[i3]);
                i3++;
            }
            c2 = c2 + i4 + (iArr.length * 1);
        }
        String str2 = this.f5787i;
        if (str2 != null) {
            c2 += av.b(7, str2);
        }
        Integer num2 = this.f5788j;
        if (num2 != null) {
            c2 += av.c(8, num2.intValue());
        }
        String[] strArr = this.f5789k;
        if (strArr == null || strArr.length <= 0) {
            return c2;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.f5789k;
            if (i2 >= strArr2.length) {
                return c2 + i5 + (i6 * 1);
            }
            String str3 = strArr2[i2];
            if (str3 != null) {
                i6++;
                i5 += av.a(str3);
            }
            i2++;
        }
    }
}
