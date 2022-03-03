package com.google.android.gms.internal.ads;

public final class n30 extends cv<n30> {

    /* renamed from: c  reason: collision with root package name */
    private Integer f5035c = null;

    /* renamed from: d  reason: collision with root package name */
    private Integer f5036d = null;

    /* renamed from: e  reason: collision with root package name */
    private Integer f5037e = null;

    /* renamed from: f  reason: collision with root package name */
    private Integer f5038f = null;

    /* renamed from: g  reason: collision with root package name */
    private Integer f5039g = null;

    /* renamed from: h  reason: collision with root package name */
    private Integer f5040h = null;

    /* renamed from: i  reason: collision with root package name */
    private Integer f5041i = null;

    /* renamed from: j  reason: collision with root package name */
    private Integer f5042j = null;

    /* renamed from: k  reason: collision with root package name */
    private Integer f5043k = null;

    /* renamed from: l  reason: collision with root package name */
    private Integer f5044l = null;

    /* renamed from: m  reason: collision with root package name */
    private o30 f5045m = null;

    public n30() {
        this.f4045b = null;
        this.a = -1;
    }

    private final n30 b(yu yuVar) {
        while (true) {
            int d2 = yuVar.d();
            switch (d2) {
                case 0:
                    return this;
                case 8:
                    yuVar.a();
                    int h2 = yuVar.h();
                    z20.a(h2);
                    this.f5035c = Integer.valueOf(h2);
                    break;
                case 16:
                    int a = yuVar.a();
                    try {
                        int h3 = yuVar.h();
                        z20.a(h3);
                        this.f5036d = Integer.valueOf(h3);
                        break;
                    } catch (IllegalArgumentException unused) {
                        yuVar.e(a);
                        a(yuVar, d2);
                        break;
                    }
                case 24:
                    this.f5037e = Integer.valueOf(yuVar.h());
                    break;
                case 32:
                    this.f5038f = Integer.valueOf(yuVar.h());
                    break;
                case 40:
                    this.f5039g = Integer.valueOf(yuVar.h());
                    break;
                case 48:
                    this.f5040h = Integer.valueOf(yuVar.h());
                    break;
                case 56:
                    this.f5041i = Integer.valueOf(yuVar.h());
                    break;
                case 64:
                    this.f5042j = Integer.valueOf(yuVar.h());
                    break;
                case 72:
                    this.f5043k = Integer.valueOf(yuVar.h());
                    break;
                case 80:
                    this.f5044l = Integer.valueOf(yuVar.h());
                    break;
                case 90:
                    if (this.f5045m == null) {
                        this.f5045m = new o30();
                    }
                    yuVar.a(this.f5045m);
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

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        b(yuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        Integer num = this.f5035c;
        if (num != null) {
            avVar.b(1, num.intValue());
        }
        Integer num2 = this.f5036d;
        if (num2 != null) {
            avVar.b(2, num2.intValue());
        }
        Integer num3 = this.f5037e;
        if (num3 != null) {
            avVar.b(3, num3.intValue());
        }
        Integer num4 = this.f5038f;
        if (num4 != null) {
            avVar.b(4, num4.intValue());
        }
        Integer num5 = this.f5039g;
        if (num5 != null) {
            avVar.b(5, num5.intValue());
        }
        Integer num6 = this.f5040h;
        if (num6 != null) {
            avVar.b(6, num6.intValue());
        }
        Integer num7 = this.f5041i;
        if (num7 != null) {
            avVar.b(7, num7.intValue());
        }
        Integer num8 = this.f5042j;
        if (num8 != null) {
            avVar.b(8, num8.intValue());
        }
        Integer num9 = this.f5043k;
        if (num9 != null) {
            avVar.b(9, num9.intValue());
        }
        Integer num10 = this.f5044l;
        if (num10 != null) {
            avVar.b(10, num10.intValue());
        }
        o30 o30 = this.f5045m;
        if (o30 != null) {
            avVar.a(11, o30);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Integer num = this.f5035c;
        if (num != null) {
            c2 += av.c(1, num.intValue());
        }
        Integer num2 = this.f5036d;
        if (num2 != null) {
            c2 += av.c(2, num2.intValue());
        }
        Integer num3 = this.f5037e;
        if (num3 != null) {
            c2 += av.c(3, num3.intValue());
        }
        Integer num4 = this.f5038f;
        if (num4 != null) {
            c2 += av.c(4, num4.intValue());
        }
        Integer num5 = this.f5039g;
        if (num5 != null) {
            c2 += av.c(5, num5.intValue());
        }
        Integer num6 = this.f5040h;
        if (num6 != null) {
            c2 += av.c(6, num6.intValue());
        }
        Integer num7 = this.f5041i;
        if (num7 != null) {
            c2 += av.c(7, num7.intValue());
        }
        Integer num8 = this.f5042j;
        if (num8 != null) {
            c2 += av.c(8, num8.intValue());
        }
        Integer num9 = this.f5043k;
        if (num9 != null) {
            c2 += av.c(9, num9.intValue());
        }
        Integer num10 = this.f5044l;
        if (num10 != null) {
            c2 += av.c(10, num10.intValue());
        }
        o30 o30 = this.f5045m;
        return o30 != null ? c2 + av.b(11, o30) : c2;
    }
}
