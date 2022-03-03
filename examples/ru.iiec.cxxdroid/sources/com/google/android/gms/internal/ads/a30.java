package com.google.android.gms.internal.ads;

public final class a30 extends cv<a30> {

    /* renamed from: c  reason: collision with root package name */
    public Integer f3745c = null;

    /* renamed from: d  reason: collision with root package name */
    private Integer f3746d = null;

    /* renamed from: e  reason: collision with root package name */
    private c30 f3747e = null;

    /* renamed from: f  reason: collision with root package name */
    public d30 f3748f = null;

    /* renamed from: g  reason: collision with root package name */
    private b30[] f3749g = b30.d();

    /* renamed from: h  reason: collision with root package name */
    private e30 f3750h = null;

    /* renamed from: i  reason: collision with root package name */
    private n30 f3751i = null;

    /* renamed from: j  reason: collision with root package name */
    private m30 f3752j = null;

    /* renamed from: k  reason: collision with root package name */
    private j30 f3753k = null;

    /* renamed from: l  reason: collision with root package name */
    private k30 f3754l = null;

    /* renamed from: m  reason: collision with root package name */
    private t30[] f3755m = t30.d();

    public a30() {
        this.f4045b = null;
        this.a = -1;
    }

    private final a30 b(yu yuVar) {
        int h2;
        iv ivVar;
        while (true) {
            int d2 = yuVar.d();
            switch (d2) {
                case 0:
                    return this;
                case 56:
                    yuVar.a();
                    h2 = yuVar.h();
                    if (h2 < 0 || h2 > 9) {
                        StringBuilder sb = new StringBuilder(43);
                        sb.append(h2);
                        sb.append(" is not a valid enum AdInitiater");
                        break;
                    } else {
                        this.f3745c = Integer.valueOf(h2);
                        continue;
                    }
                    break;
                case 64:
                    int a = yuVar.a();
                    try {
                        int h3 = yuVar.h();
                        z20.a(h3);
                        this.f3746d = Integer.valueOf(h3);
                        continue;
                    } catch (IllegalArgumentException unused) {
                        yuVar.e(a);
                        a(yuVar, d2);
                    }
                case 74:
                    if (this.f3747e == null) {
                        this.f3747e = new c30();
                    }
                    ivVar = this.f3747e;
                    break;
                case 82:
                    if (this.f3748f == null) {
                        this.f3748f = new d30();
                    }
                    ivVar = this.f3748f;
                    break;
                case 90:
                    int a2 = lv.a(yuVar, 90);
                    b30[] b30Arr = this.f3749g;
                    int length = b30Arr == null ? 0 : b30Arr.length;
                    b30[] b30Arr2 = new b30[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f3749g, 0, b30Arr2, 0, length);
                    }
                    while (length < b30Arr2.length - 1) {
                        b30Arr2[length] = new b30();
                        yuVar.a(b30Arr2[length]);
                        yuVar.d();
                        length++;
                    }
                    b30Arr2[length] = new b30();
                    yuVar.a(b30Arr2[length]);
                    this.f3749g = b30Arr2;
                    continue;
                case 98:
                    if (this.f3750h == null) {
                        this.f3750h = new e30();
                    }
                    ivVar = this.f3750h;
                    break;
                case 106:
                    if (this.f3751i == null) {
                        this.f3751i = new n30();
                    }
                    ivVar = this.f3751i;
                    break;
                case 114:
                    if (this.f3752j == null) {
                        this.f3752j = new m30();
                    }
                    ivVar = this.f3752j;
                    break;
                case 122:
                    if (this.f3753k == null) {
                        this.f3753k = new j30();
                    }
                    ivVar = this.f3753k;
                    break;
                case 130:
                    if (this.f3754l == null) {
                        this.f3754l = new k30();
                    }
                    ivVar = this.f3754l;
                    break;
                case 138:
                    int a3 = lv.a(yuVar, 138);
                    t30[] t30Arr = this.f3755m;
                    int length2 = t30Arr == null ? 0 : t30Arr.length;
                    t30[] t30Arr2 = new t30[(a3 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f3755m, 0, t30Arr2, 0, length2);
                    }
                    while (length2 < t30Arr2.length - 1) {
                        t30Arr2[length2] = new t30();
                        yuVar.a(t30Arr2[length2]);
                        yuVar.d();
                        length2++;
                    }
                    t30Arr2[length2] = new t30();
                    yuVar.a(t30Arr2[length2]);
                    this.f3755m = t30Arr2;
                    continue;
                default:
                    if (!super.a(yuVar, d2)) {
                        return this;
                    }
                    continue;
            }
            yuVar.a(ivVar);
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append(h2);
        sb2.append(" is not a valid enum AdInitiater");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        b(yuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        Integer num = this.f3745c;
        if (num != null) {
            avVar.b(7, num.intValue());
        }
        Integer num2 = this.f3746d;
        if (num2 != null) {
            avVar.b(8, num2.intValue());
        }
        c30 c30 = this.f3747e;
        if (c30 != null) {
            avVar.a(9, c30);
        }
        d30 d30 = this.f3748f;
        if (d30 != null) {
            avVar.a(10, d30);
        }
        b30[] b30Arr = this.f3749g;
        int i2 = 0;
        if (b30Arr != null && b30Arr.length > 0) {
            int i3 = 0;
            while (true) {
                b30[] b30Arr2 = this.f3749g;
                if (i3 >= b30Arr2.length) {
                    break;
                }
                b30 b30 = b30Arr2[i3];
                if (b30 != null) {
                    avVar.a(11, b30);
                }
                i3++;
            }
        }
        e30 e30 = this.f3750h;
        if (e30 != null) {
            avVar.a(12, e30);
        }
        n30 n30 = this.f3751i;
        if (n30 != null) {
            avVar.a(13, n30);
        }
        m30 m30 = this.f3752j;
        if (m30 != null) {
            avVar.a(14, m30);
        }
        j30 j30 = this.f3753k;
        if (j30 != null) {
            avVar.a(15, j30);
        }
        k30 k30 = this.f3754l;
        if (k30 != null) {
            avVar.a(16, k30);
        }
        t30[] t30Arr = this.f3755m;
        if (t30Arr != null && t30Arr.length > 0) {
            while (true) {
                t30[] t30Arr2 = this.f3755m;
                if (i2 >= t30Arr2.length) {
                    break;
                }
                t30 t30 = t30Arr2[i2];
                if (t30 != null) {
                    avVar.a(17, t30);
                }
                i2++;
            }
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Integer num = this.f3745c;
        if (num != null) {
            c2 += av.c(7, num.intValue());
        }
        Integer num2 = this.f3746d;
        if (num2 != null) {
            c2 += av.c(8, num2.intValue());
        }
        c30 c30 = this.f3747e;
        if (c30 != null) {
            c2 += av.b(9, c30);
        }
        d30 d30 = this.f3748f;
        if (d30 != null) {
            c2 += av.b(10, d30);
        }
        b30[] b30Arr = this.f3749g;
        int i2 = 0;
        if (b30Arr != null && b30Arr.length > 0) {
            int i3 = c2;
            int i4 = 0;
            while (true) {
                b30[] b30Arr2 = this.f3749g;
                if (i4 >= b30Arr2.length) {
                    break;
                }
                b30 b30 = b30Arr2[i4];
                if (b30 != null) {
                    i3 += av.b(11, b30);
                }
                i4++;
            }
            c2 = i3;
        }
        e30 e30 = this.f3750h;
        if (e30 != null) {
            c2 += av.b(12, e30);
        }
        n30 n30 = this.f3751i;
        if (n30 != null) {
            c2 += av.b(13, n30);
        }
        m30 m30 = this.f3752j;
        if (m30 != null) {
            c2 += av.b(14, m30);
        }
        j30 j30 = this.f3753k;
        if (j30 != null) {
            c2 += av.b(15, j30);
        }
        k30 k30 = this.f3754l;
        if (k30 != null) {
            c2 += av.b(16, k30);
        }
        t30[] t30Arr = this.f3755m;
        if (t30Arr != null && t30Arr.length > 0) {
            while (true) {
                t30[] t30Arr2 = this.f3755m;
                if (i2 >= t30Arr2.length) {
                    break;
                }
                t30 t30 = t30Arr2[i2];
                if (t30 != null) {
                    c2 += av.b(17, t30);
                }
                i2++;
            }
        }
        return c2;
    }
}
