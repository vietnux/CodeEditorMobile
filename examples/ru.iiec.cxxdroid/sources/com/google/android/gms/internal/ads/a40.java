package com.google.android.gms.internal.ads;

public final class a40 extends cv<a40> {

    /* renamed from: c  reason: collision with root package name */
    private Integer f3758c = null;

    /* renamed from: d  reason: collision with root package name */
    private v30 f3759d = null;

    /* renamed from: e  reason: collision with root package name */
    private Integer f3760e = null;

    /* renamed from: f  reason: collision with root package name */
    private Integer f3761f = null;

    /* renamed from: g  reason: collision with root package name */
    private Integer f3762g = null;

    /* renamed from: h  reason: collision with root package name */
    private Long f3763h = null;

    public a40() {
        this.f4045b = null;
        this.a = -1;
    }

    private final a40 b(yu yuVar) {
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 8) {
                int a = yuVar.a();
                try {
                    int h2 = yuVar.h();
                    z20.a(h2);
                    this.f3758c = Integer.valueOf(h2);
                } catch (IllegalArgumentException unused) {
                    yuVar.e(a);
                    a(yuVar, d2);
                }
            } else if (d2 == 18) {
                if (this.f3759d == null) {
                    this.f3759d = new v30();
                }
                yuVar.a(this.f3759d);
            } else if (d2 == 24) {
                this.f3760e = Integer.valueOf(yuVar.h());
            } else if (d2 == 32) {
                this.f3761f = Integer.valueOf(yuVar.h());
            } else if (d2 == 40) {
                this.f3762g = Integer.valueOf(yuVar.h());
            } else if (d2 == 48) {
                this.f3763h = Long.valueOf(yuVar.i());
            } else if (!super.a(yuVar, d2)) {
                return this;
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
        Integer num = this.f3758c;
        if (num != null) {
            avVar.b(1, num.intValue());
        }
        v30 v30 = this.f3759d;
        if (v30 != null) {
            avVar.a(2, v30);
        }
        Integer num2 = this.f3760e;
        if (num2 != null) {
            avVar.b(3, num2.intValue());
        }
        Integer num3 = this.f3761f;
        if (num3 != null) {
            avVar.b(4, num3.intValue());
        }
        Integer num4 = this.f3762g;
        if (num4 != null) {
            avVar.b(5, num4.intValue());
        }
        Long l2 = this.f3763h;
        if (l2 != null) {
            avVar.a(6, l2.longValue());
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Integer num = this.f3758c;
        if (num != null) {
            c2 += av.c(1, num.intValue());
        }
        v30 v30 = this.f3759d;
        if (v30 != null) {
            c2 += av.b(2, v30);
        }
        Integer num2 = this.f3760e;
        if (num2 != null) {
            c2 += av.c(3, num2.intValue());
        }
        Integer num3 = this.f3761f;
        if (num3 != null) {
            c2 += av.c(4, num3.intValue());
        }
        Integer num4 = this.f3762g;
        if (num4 != null) {
            c2 += av.c(5, num4.intValue());
        }
        Long l2 = this.f3763h;
        return l2 != null ? c2 + av.d(6, l2.longValue()) : c2;
    }
}
