package com.google.android.gms.internal.ads;

public final class xq extends cv<xq> {
    private static volatile xq[] x;

    /* renamed from: c  reason: collision with root package name */
    public Long f6037c = null;

    /* renamed from: d  reason: collision with root package name */
    public Long f6038d = null;

    /* renamed from: e  reason: collision with root package name */
    public Long f6039e = null;

    /* renamed from: f  reason: collision with root package name */
    public Long f6040f = null;

    /* renamed from: g  reason: collision with root package name */
    public Long f6041g = null;

    /* renamed from: h  reason: collision with root package name */
    public Long f6042h = null;

    /* renamed from: i  reason: collision with root package name */
    public Integer f6043i;

    /* renamed from: j  reason: collision with root package name */
    public Long f6044j = null;

    /* renamed from: k  reason: collision with root package name */
    public Long f6045k = null;

    /* renamed from: l  reason: collision with root package name */
    public Long f6046l = null;

    /* renamed from: m  reason: collision with root package name */
    public Integer f6047m;
    public Long n = null;
    public Long o = null;
    public Long p = null;
    public Long q = null;
    public Long r = null;
    public Long s = null;
    public Long t = null;
    public Long u = null;
    private Long v = null;
    private Long w = null;

    public xq() {
        this.a = -1;
    }

    private final xq b(yu yuVar) {
        while (true) {
            int d2 = yuVar.d();
            switch (d2) {
                case 0:
                    return this;
                case 8:
                    this.f6037c = Long.valueOf(yuVar.i());
                    break;
                case 16:
                    this.f6038d = Long.valueOf(yuVar.i());
                    break;
                case 24:
                    this.f6039e = Long.valueOf(yuVar.i());
                    break;
                case 32:
                    this.f6040f = Long.valueOf(yuVar.i());
                    break;
                case 40:
                    this.f6041g = Long.valueOf(yuVar.i());
                    break;
                case 48:
                    this.f6042h = Long.valueOf(yuVar.i());
                    break;
                case 56:
                    yuVar.a();
                    int h2 = yuVar.h();
                    vo.a(h2);
                    this.f6043i = Integer.valueOf(h2);
                    break;
                case 64:
                    this.f6044j = Long.valueOf(yuVar.i());
                    break;
                case 72:
                    this.f6045k = Long.valueOf(yuVar.i());
                    break;
                case 80:
                    this.f6046l = Long.valueOf(yuVar.i());
                    break;
                case 88:
                    int a = yuVar.a();
                    try {
                        int h3 = yuVar.h();
                        vo.a(h3);
                        this.f6047m = Integer.valueOf(h3);
                        break;
                    } catch (IllegalArgumentException unused) {
                        yuVar.e(a);
                        a(yuVar, d2);
                        break;
                    }
                case 96:
                    this.n = Long.valueOf(yuVar.i());
                    break;
                case 104:
                    this.o = Long.valueOf(yuVar.i());
                    break;
                case 112:
                    this.p = Long.valueOf(yuVar.i());
                    break;
                case 120:
                    this.q = Long.valueOf(yuVar.i());
                    break;
                case 128:
                    this.r = Long.valueOf(yuVar.i());
                    break;
                case 136:
                    this.s = Long.valueOf(yuVar.i());
                    break;
                case 144:
                    this.t = Long.valueOf(yuVar.i());
                    break;
                case 152:
                    this.u = Long.valueOf(yuVar.i());
                    break;
                case 160:
                    this.v = Long.valueOf(yuVar.i());
                    break;
                case 168:
                    this.w = Long.valueOf(yuVar.i());
                    break;
                default:
                    if (super.a(yuVar, d2)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    public static xq[] d() {
        if (x == null) {
            synchronized (gv.f4443b) {
                if (x == null) {
                    x = new xq[0];
                }
            }
        }
        return x;
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        b(yuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        Long l2 = this.f6037c;
        if (l2 != null) {
            avVar.b(1, l2.longValue());
        }
        Long l3 = this.f6038d;
        if (l3 != null) {
            avVar.b(2, l3.longValue());
        }
        Long l4 = this.f6039e;
        if (l4 != null) {
            avVar.b(3, l4.longValue());
        }
        Long l5 = this.f6040f;
        if (l5 != null) {
            avVar.b(4, l5.longValue());
        }
        Long l6 = this.f6041g;
        if (l6 != null) {
            avVar.b(5, l6.longValue());
        }
        Long l7 = this.f6042h;
        if (l7 != null) {
            avVar.b(6, l7.longValue());
        }
        Integer num = this.f6043i;
        if (num != null) {
            avVar.b(7, num.intValue());
        }
        Long l8 = this.f6044j;
        if (l8 != null) {
            avVar.b(8, l8.longValue());
        }
        Long l9 = this.f6045k;
        if (l9 != null) {
            avVar.b(9, l9.longValue());
        }
        Long l10 = this.f6046l;
        if (l10 != null) {
            avVar.b(10, l10.longValue());
        }
        Integer num2 = this.f6047m;
        if (num2 != null) {
            avVar.b(11, num2.intValue());
        }
        Long l11 = this.n;
        if (l11 != null) {
            avVar.b(12, l11.longValue());
        }
        Long l12 = this.o;
        if (l12 != null) {
            avVar.b(13, l12.longValue());
        }
        Long l13 = this.p;
        if (l13 != null) {
            avVar.b(14, l13.longValue());
        }
        Long l14 = this.q;
        if (l14 != null) {
            avVar.b(15, l14.longValue());
        }
        Long l15 = this.r;
        if (l15 != null) {
            avVar.b(16, l15.longValue());
        }
        Long l16 = this.s;
        if (l16 != null) {
            avVar.b(17, l16.longValue());
        }
        Long l17 = this.t;
        if (l17 != null) {
            avVar.b(18, l17.longValue());
        }
        Long l18 = this.u;
        if (l18 != null) {
            avVar.b(19, l18.longValue());
        }
        Long l19 = this.v;
        if (l19 != null) {
            avVar.b(20, l19.longValue());
        }
        Long l20 = this.w;
        if (l20 != null) {
            avVar.b(21, l20.longValue());
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Long l2 = this.f6037c;
        if (l2 != null) {
            c2 += av.c(1, l2.longValue());
        }
        Long l3 = this.f6038d;
        if (l3 != null) {
            c2 += av.c(2, l3.longValue());
        }
        Long l4 = this.f6039e;
        if (l4 != null) {
            c2 += av.c(3, l4.longValue());
        }
        Long l5 = this.f6040f;
        if (l5 != null) {
            c2 += av.c(4, l5.longValue());
        }
        Long l6 = this.f6041g;
        if (l6 != null) {
            c2 += av.c(5, l6.longValue());
        }
        Long l7 = this.f6042h;
        if (l7 != null) {
            c2 += av.c(6, l7.longValue());
        }
        Integer num = this.f6043i;
        if (num != null) {
            c2 += av.c(7, num.intValue());
        }
        Long l8 = this.f6044j;
        if (l8 != null) {
            c2 += av.c(8, l8.longValue());
        }
        Long l9 = this.f6045k;
        if (l9 != null) {
            c2 += av.c(9, l9.longValue());
        }
        Long l10 = this.f6046l;
        if (l10 != null) {
            c2 += av.c(10, l10.longValue());
        }
        Integer num2 = this.f6047m;
        if (num2 != null) {
            c2 += av.c(11, num2.intValue());
        }
        Long l11 = this.n;
        if (l11 != null) {
            c2 += av.c(12, l11.longValue());
        }
        Long l12 = this.o;
        if (l12 != null) {
            c2 += av.c(13, l12.longValue());
        }
        Long l13 = this.p;
        if (l13 != null) {
            c2 += av.c(14, l13.longValue());
        }
        Long l14 = this.q;
        if (l14 != null) {
            c2 += av.c(15, l14.longValue());
        }
        Long l15 = this.r;
        if (l15 != null) {
            c2 += av.c(16, l15.longValue());
        }
        Long l16 = this.s;
        if (l16 != null) {
            c2 += av.c(17, l16.longValue());
        }
        Long l17 = this.t;
        if (l17 != null) {
            c2 += av.c(18, l17.longValue());
        }
        Long l18 = this.u;
        if (l18 != null) {
            c2 += av.c(19, l18.longValue());
        }
        Long l19 = this.v;
        if (l19 != null) {
            c2 += av.c(20, l19.longValue());
        }
        Long l20 = this.w;
        return l20 != null ? c2 + av.c(21, l20.longValue()) : c2;
    }
}
