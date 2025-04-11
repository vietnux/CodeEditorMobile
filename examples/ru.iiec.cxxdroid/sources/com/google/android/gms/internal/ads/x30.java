package com.google.android.gms.internal.ads;

public final class x30 extends cv<x30> {

    /* renamed from: c  reason: collision with root package name */
    private Integer f5984c = null;

    /* renamed from: d  reason: collision with root package name */
    private v30 f5985d = null;

    /* renamed from: e  reason: collision with root package name */
    private Integer f5986e = null;

    /* renamed from: f  reason: collision with root package name */
    private Integer f5987f = null;

    /* renamed from: g  reason: collision with root package name */
    private Integer f5988g = null;

    public x30() {
        this.f4045b = null;
        this.a = -1;
    }

    private final x30 b(yu yuVar) {
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
                    this.f5984c = Integer.valueOf(h2);
                } catch (IllegalArgumentException unused) {
                    yuVar.e(a);
                    a(yuVar, d2);
                }
            } else if (d2 == 18) {
                if (this.f5985d == null) {
                    this.f5985d = new v30();
                }
                yuVar.a(this.f5985d);
            } else if (d2 == 24) {
                this.f5986e = Integer.valueOf(yuVar.h());
            } else if (d2 == 32) {
                this.f5987f = Integer.valueOf(yuVar.h());
            } else if (d2 == 40) {
                this.f5988g = Integer.valueOf(yuVar.h());
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
        Integer num = this.f5984c;
        if (num != null) {
            avVar.b(1, num.intValue());
        }
        v30 v30 = this.f5985d;
        if (v30 != null) {
            avVar.a(2, v30);
        }
        Integer num2 = this.f5986e;
        if (num2 != null) {
            avVar.b(3, num2.intValue());
        }
        Integer num3 = this.f5987f;
        if (num3 != null) {
            avVar.b(4, num3.intValue());
        }
        Integer num4 = this.f5988g;
        if (num4 != null) {
            avVar.b(5, num4.intValue());
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Integer num = this.f5984c;
        if (num != null) {
            c2 += av.c(1, num.intValue());
        }
        v30 v30 = this.f5985d;
        if (v30 != null) {
            c2 += av.b(2, v30);
        }
        Integer num2 = this.f5986e;
        if (num2 != null) {
            c2 += av.c(3, num2.intValue());
        }
        Integer num3 = this.f5987f;
        if (num3 != null) {
            c2 += av.c(4, num3.intValue());
        }
        Integer num4 = this.f5988g;
        return num4 != null ? c2 + av.c(5, num4.intValue()) : c2;
    }
}
