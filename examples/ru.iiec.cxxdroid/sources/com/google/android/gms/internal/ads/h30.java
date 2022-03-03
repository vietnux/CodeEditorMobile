package com.google.android.gms.internal.ads;

public final class h30 extends cv<h30> {

    /* renamed from: c  reason: collision with root package name */
    private Integer f4476c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f4477d = null;

    /* renamed from: e  reason: collision with root package name */
    private Integer f4478e = null;

    /* renamed from: f  reason: collision with root package name */
    private Integer f4479f = null;

    /* renamed from: g  reason: collision with root package name */
    private s30 f4480g = null;

    /* renamed from: h  reason: collision with root package name */
    public long[] f4481h = lv.f4904b;

    /* renamed from: i  reason: collision with root package name */
    public f30 f4482i = null;

    /* renamed from: j  reason: collision with root package name */
    private g30 f4483j = null;

    /* renamed from: k  reason: collision with root package name */
    private l30 f4484k = null;

    /* renamed from: l  reason: collision with root package name */
    public a30 f4485l = null;

    public h30() {
        this.f4045b = null;
        this.a = -1;
    }

    private final h30 b(yu yuVar) {
        iv ivVar;
        while (true) {
            int d2 = yuVar.d();
            switch (d2) {
                case 0:
                    return this;
                case 72:
                    this.f4476c = Integer.valueOf(yuVar.h());
                    continue;
                case 82:
                    this.f4477d = yuVar.c();
                    continue;
                case 88:
                    this.f4478e = Integer.valueOf(yuVar.h());
                    continue;
                case 96:
                    int a = yuVar.a();
                    try {
                        int h2 = yuVar.h();
                        z20.a(h2);
                        this.f4479f = Integer.valueOf(h2);
                        continue;
                    } catch (IllegalArgumentException unused) {
                        yuVar.e(a);
                        a(yuVar, d2);
                    }
                case 106:
                    if (this.f4480g == null) {
                        this.f4480g = new s30();
                    }
                    ivVar = this.f4480g;
                    break;
                case 112:
                    int a2 = lv.a(yuVar, 112);
                    long[] jArr = this.f4481h;
                    int length = jArr == null ? 0 : jArr.length;
                    long[] jArr2 = new long[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f4481h, 0, jArr2, 0, length);
                    }
                    while (true) {
                        int length2 = jArr2.length - 1;
                        long i2 = yuVar.i();
                        if (length < length2) {
                            jArr2[length] = i2;
                            yuVar.d();
                            length++;
                        } else {
                            jArr2[length] = i2;
                            this.f4481h = jArr2;
                            continue;
                        }
                    }
                case 114:
                    int c2 = yuVar.c(yuVar.h());
                    int a3 = yuVar.a();
                    int i3 = 0;
                    while (yuVar.j() > 0) {
                        yuVar.i();
                        i3++;
                    }
                    yuVar.e(a3);
                    long[] jArr3 = this.f4481h;
                    int length3 = jArr3 == null ? 0 : jArr3.length;
                    long[] jArr4 = new long[(i3 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f4481h, 0, jArr4, 0, length3);
                    }
                    while (length3 < jArr4.length) {
                        jArr4[length3] = yuVar.i();
                        length3++;
                    }
                    this.f4481h = jArr4;
                    yuVar.d(c2);
                    continue;
                case 122:
                    if (this.f4482i == null) {
                        this.f4482i = new f30();
                    }
                    ivVar = this.f4482i;
                    break;
                case 130:
                    if (this.f4483j == null) {
                        this.f4483j = new g30();
                    }
                    ivVar = this.f4483j;
                    break;
                case 138:
                    if (this.f4484k == null) {
                        this.f4484k = new l30();
                    }
                    ivVar = this.f4484k;
                    break;
                case 146:
                    if (this.f4485l == null) {
                        this.f4485l = new a30();
                    }
                    ivVar = this.f4485l;
                    break;
                default:
                    if (!super.a(yuVar, d2)) {
                        return this;
                    }
                    continue;
            }
            yuVar.a(ivVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        b(yuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        Integer num = this.f4476c;
        if (num != null) {
            avVar.b(9, num.intValue());
        }
        String str = this.f4477d;
        if (str != null) {
            avVar.a(10, str);
        }
        Integer num2 = this.f4478e;
        int i2 = 0;
        if (num2 != null) {
            int intValue = num2.intValue();
            avVar.a(11, 0);
            avVar.a(intValue);
        }
        Integer num3 = this.f4479f;
        if (num3 != null) {
            avVar.b(12, num3.intValue());
        }
        s30 s30 = this.f4480g;
        if (s30 != null) {
            avVar.a(13, s30);
        }
        long[] jArr = this.f4481h;
        if (jArr != null && jArr.length > 0) {
            while (true) {
                long[] jArr2 = this.f4481h;
                if (i2 >= jArr2.length) {
                    break;
                }
                avVar.a(14, jArr2[i2]);
                i2++;
            }
        }
        f30 f30 = this.f4482i;
        if (f30 != null) {
            avVar.a(15, f30);
        }
        g30 g30 = this.f4483j;
        if (g30 != null) {
            avVar.a(16, g30);
        }
        l30 l30 = this.f4484k;
        if (l30 != null) {
            avVar.a(17, l30);
        }
        a30 a30 = this.f4485l;
        if (a30 != null) {
            avVar.a(18, a30);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        long[] jArr;
        int c2 = super.c();
        Integer num = this.f4476c;
        if (num != null) {
            c2 += av.c(9, num.intValue());
        }
        String str = this.f4477d;
        if (str != null) {
            c2 += av.b(10, str);
        }
        Integer num2 = this.f4478e;
        if (num2 != null) {
            c2 += av.b(11) + av.d(num2.intValue());
        }
        Integer num3 = this.f4479f;
        if (num3 != null) {
            c2 += av.c(12, num3.intValue());
        }
        s30 s30 = this.f4480g;
        if (s30 != null) {
            c2 += av.b(13, s30);
        }
        long[] jArr2 = this.f4481h;
        if (jArr2 != null && jArr2.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                jArr = this.f4481h;
                if (i2 >= jArr.length) {
                    break;
                }
                i3 += av.b(jArr[i2]);
                i2++;
            }
            c2 = c2 + i3 + (jArr.length * 1);
        }
        f30 f30 = this.f4482i;
        if (f30 != null) {
            c2 += av.b(15, f30);
        }
        g30 g30 = this.f4483j;
        if (g30 != null) {
            c2 += av.b(16, g30);
        }
        l30 l30 = this.f4484k;
        if (l30 != null) {
            c2 += av.b(17, l30);
        }
        a30 a30 = this.f4485l;
        return a30 != null ? c2 + av.b(18, a30) : c2;
    }
}
