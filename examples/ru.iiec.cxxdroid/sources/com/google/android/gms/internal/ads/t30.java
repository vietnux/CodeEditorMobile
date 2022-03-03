package com.google.android.gms.internal.ads;

public final class t30 extends cv<t30> {
    private static volatile t30[] s;

    /* renamed from: c  reason: collision with root package name */
    private x30 f5575c = null;

    /* renamed from: d  reason: collision with root package name */
    private a40 f5576d = null;

    /* renamed from: e  reason: collision with root package name */
    private b40 f5577e = null;

    /* renamed from: f  reason: collision with root package name */
    private c40 f5578f = null;

    /* renamed from: g  reason: collision with root package name */
    private u30 f5579g = null;

    /* renamed from: h  reason: collision with root package name */
    private y30 f5580h = null;

    /* renamed from: i  reason: collision with root package name */
    private w30 f5581i = null;

    /* renamed from: j  reason: collision with root package name */
    private Integer f5582j = null;

    /* renamed from: k  reason: collision with root package name */
    private Integer f5583k = null;

    /* renamed from: l  reason: collision with root package name */
    private r30 f5584l = null;

    /* renamed from: m  reason: collision with root package name */
    private Integer f5585m = null;
    private Integer n = null;
    private Integer o = null;
    private Integer p = null;
    private Integer q = null;
    private Long r = null;

    public t30() {
        this.f4045b = null;
        this.a = -1;
    }

    public static t30[] d() {
        if (s == null) {
            synchronized (gv.f4443b) {
                if (s == null) {
                    s = new t30[0];
                }
            }
        }
        return s;
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        iv ivVar;
        while (true) {
            int d2 = yuVar.d();
            switch (d2) {
                case 0:
                    return this;
                case 42:
                    if (this.f5575c == null) {
                        this.f5575c = new x30();
                    }
                    ivVar = this.f5575c;
                    break;
                case 50:
                    if (this.f5576d == null) {
                        this.f5576d = new a40();
                    }
                    ivVar = this.f5576d;
                    break;
                case 58:
                    if (this.f5577e == null) {
                        this.f5577e = new b40();
                    }
                    ivVar = this.f5577e;
                    break;
                case 66:
                    if (this.f5578f == null) {
                        this.f5578f = new c40();
                    }
                    ivVar = this.f5578f;
                    break;
                case 74:
                    if (this.f5579g == null) {
                        this.f5579g = new u30();
                    }
                    ivVar = this.f5579g;
                    break;
                case 82:
                    if (this.f5580h == null) {
                        this.f5580h = new y30();
                    }
                    ivVar = this.f5580h;
                    break;
                case 90:
                    if (this.f5581i == null) {
                        this.f5581i = new w30();
                    }
                    ivVar = this.f5581i;
                    break;
                case 96:
                    this.f5582j = Integer.valueOf(yuVar.h());
                    continue;
                case 104:
                    this.f5583k = Integer.valueOf(yuVar.h());
                    continue;
                case 114:
                    if (this.f5584l == null) {
                        this.f5584l = new r30();
                    }
                    ivVar = this.f5584l;
                    break;
                case 120:
                    this.f5585m = Integer.valueOf(yuVar.h());
                    continue;
                case 128:
                    this.n = Integer.valueOf(yuVar.h());
                    continue;
                case 136:
                    this.o = Integer.valueOf(yuVar.h());
                    continue;
                case 144:
                    this.p = Integer.valueOf(yuVar.h());
                    continue;
                case 152:
                    this.q = Integer.valueOf(yuVar.h());
                    continue;
                case 160:
                    this.r = Long.valueOf(yuVar.i());
                    continue;
                default:
                    if (!super.a(yuVar, d2)) {
                        return this;
                    }
                    continue;
            }
            yuVar.a(ivVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        x30 x30 = this.f5575c;
        if (x30 != null) {
            avVar.a(5, x30);
        }
        a40 a40 = this.f5576d;
        if (a40 != null) {
            avVar.a(6, a40);
        }
        b40 b40 = this.f5577e;
        if (b40 != null) {
            avVar.a(7, b40);
        }
        c40 c40 = this.f5578f;
        if (c40 != null) {
            avVar.a(8, c40);
        }
        u30 u30 = this.f5579g;
        if (u30 != null) {
            avVar.a(9, u30);
        }
        y30 y30 = this.f5580h;
        if (y30 != null) {
            avVar.a(10, y30);
        }
        w30 w30 = this.f5581i;
        if (w30 != null) {
            avVar.a(11, w30);
        }
        Integer num = this.f5582j;
        if (num != null) {
            avVar.b(12, num.intValue());
        }
        Integer num2 = this.f5583k;
        if (num2 != null) {
            avVar.b(13, num2.intValue());
        }
        r30 r30 = this.f5584l;
        if (r30 != null) {
            avVar.a(14, r30);
        }
        Integer num3 = this.f5585m;
        if (num3 != null) {
            avVar.b(15, num3.intValue());
        }
        Integer num4 = this.n;
        if (num4 != null) {
            avVar.b(16, num4.intValue());
        }
        Integer num5 = this.o;
        if (num5 != null) {
            avVar.b(17, num5.intValue());
        }
        Integer num6 = this.p;
        if (num6 != null) {
            avVar.b(18, num6.intValue());
        }
        Integer num7 = this.q;
        if (num7 != null) {
            avVar.b(19, num7.intValue());
        }
        Long l2 = this.r;
        if (l2 != null) {
            avVar.a(20, l2.longValue());
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        x30 x30 = this.f5575c;
        if (x30 != null) {
            c2 += av.b(5, x30);
        }
        a40 a40 = this.f5576d;
        if (a40 != null) {
            c2 += av.b(6, a40);
        }
        b40 b40 = this.f5577e;
        if (b40 != null) {
            c2 += av.b(7, b40);
        }
        c40 c40 = this.f5578f;
        if (c40 != null) {
            c2 += av.b(8, c40);
        }
        u30 u30 = this.f5579g;
        if (u30 != null) {
            c2 += av.b(9, u30);
        }
        y30 y30 = this.f5580h;
        if (y30 != null) {
            c2 += av.b(10, y30);
        }
        w30 w30 = this.f5581i;
        if (w30 != null) {
            c2 += av.b(11, w30);
        }
        Integer num = this.f5582j;
        if (num != null) {
            c2 += av.c(12, num.intValue());
        }
        Integer num2 = this.f5583k;
        if (num2 != null) {
            c2 += av.c(13, num2.intValue());
        }
        r30 r30 = this.f5584l;
        if (r30 != null) {
            c2 += av.b(14, r30);
        }
        Integer num3 = this.f5585m;
        if (num3 != null) {
            c2 += av.c(15, num3.intValue());
        }
        Integer num4 = this.n;
        if (num4 != null) {
            c2 += av.c(16, num4.intValue());
        }
        Integer num5 = this.o;
        if (num5 != null) {
            c2 += av.c(17, num5.intValue());
        }
        Integer num6 = this.p;
        if (num6 != null) {
            c2 += av.c(18, num6.intValue());
        }
        Integer num7 = this.q;
        if (num7 != null) {
            c2 += av.c(19, num7.intValue());
        }
        Long l2 = this.r;
        return l2 != null ? c2 + av.d(20, l2.longValue()) : c2;
    }
}
