package com.google.android.gms.internal.ads;

public final class f30 extends cv<f30> {

    /* renamed from: c  reason: collision with root package name */
    public String f4261c = null;

    /* renamed from: d  reason: collision with root package name */
    private r30 f4262d = null;

    /* renamed from: e  reason: collision with root package name */
    private Integer f4263e = null;

    /* renamed from: f  reason: collision with root package name */
    public s30 f4264f = null;

    /* renamed from: g  reason: collision with root package name */
    private Integer f4265g = null;

    /* renamed from: h  reason: collision with root package name */
    private Integer f4266h = null;

    /* renamed from: i  reason: collision with root package name */
    private Integer f4267i = null;

    /* renamed from: j  reason: collision with root package name */
    private Integer f4268j = null;

    public f30() {
        this.f4045b = null;
        this.a = -1;
    }

    private final f30 b(yu yuVar) {
        iv ivVar;
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 != 10) {
                if (d2 == 18) {
                    if (this.f4262d == null) {
                        this.f4262d = new r30();
                    }
                    ivVar = this.f4262d;
                } else if (d2 == 24) {
                    this.f4263e = Integer.valueOf(yuVar.h());
                } else if (d2 == 34) {
                    if (this.f4264f == null) {
                        this.f4264f = new s30();
                    }
                    ivVar = this.f4264f;
                } else if (d2 == 40) {
                    this.f4265g = Integer.valueOf(yuVar.h());
                } else if (d2 == 48) {
                    yuVar.a();
                    int h2 = yuVar.h();
                    z20.a(h2);
                    this.f4266h = Integer.valueOf(h2);
                } else if (d2 == 56) {
                    yuVar.a();
                    int h3 = yuVar.h();
                    z20.a(h3);
                    this.f4267i = Integer.valueOf(h3);
                } else if (d2 == 64) {
                    int a = yuVar.a();
                    try {
                        int h4 = yuVar.h();
                        z20.a(h4);
                        this.f4268j = Integer.valueOf(h4);
                    } catch (IllegalArgumentException unused) {
                        yuVar.e(a);
                        a(yuVar, d2);
                    }
                } else if (!super.a(yuVar, d2)) {
                    return this;
                }
                yuVar.a(ivVar);
            } else {
                this.f4261c = yuVar.c();
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
        String str = this.f4261c;
        if (str != null) {
            avVar.a(1, str);
        }
        r30 r30 = this.f4262d;
        if (r30 != null) {
            avVar.a(2, r30);
        }
        Integer num = this.f4263e;
        if (num != null) {
            avVar.b(3, num.intValue());
        }
        s30 s30 = this.f4264f;
        if (s30 != null) {
            avVar.a(4, s30);
        }
        Integer num2 = this.f4265g;
        if (num2 != null) {
            avVar.b(5, num2.intValue());
        }
        Integer num3 = this.f4266h;
        if (num3 != null) {
            avVar.b(6, num3.intValue());
        }
        Integer num4 = this.f4267i;
        if (num4 != null) {
            avVar.b(7, num4.intValue());
        }
        Integer num5 = this.f4268j;
        if (num5 != null) {
            avVar.b(8, num5.intValue());
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        String str = this.f4261c;
        if (str != null) {
            c2 += av.b(1, str);
        }
        r30 r30 = this.f4262d;
        if (r30 != null) {
            c2 += av.b(2, r30);
        }
        Integer num = this.f4263e;
        if (num != null) {
            c2 += av.c(3, num.intValue());
        }
        s30 s30 = this.f4264f;
        if (s30 != null) {
            c2 += av.b(4, s30);
        }
        Integer num2 = this.f4265g;
        if (num2 != null) {
            c2 += av.c(5, num2.intValue());
        }
        Integer num3 = this.f4266h;
        if (num3 != null) {
            c2 += av.c(6, num3.intValue());
        }
        Integer num4 = this.f4267i;
        if (num4 != null) {
            c2 += av.c(7, num4.intValue());
        }
        Integer num5 = this.f4268j;
        return num5 != null ? c2 + av.c(8, num5.intValue()) : c2;
    }
}
