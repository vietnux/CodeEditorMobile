package com.google.android.gms.internal.ads;

public final class w30 extends cv<w30> {

    /* renamed from: c  reason: collision with root package name */
    private s30 f5872c = null;

    /* renamed from: d  reason: collision with root package name */
    private Integer f5873d = null;

    /* renamed from: e  reason: collision with root package name */
    private v30 f5874e = null;

    /* renamed from: f  reason: collision with root package name */
    private r30 f5875f = null;

    public w30() {
        this.f4045b = null;
        this.a = -1;
    }

    private final w30 b(yu yuVar) {
        iv ivVar;
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 10) {
                if (this.f5872c == null) {
                    this.f5872c = new s30();
                }
                ivVar = this.f5872c;
            } else if (d2 == 16) {
                int a = yuVar.a();
                try {
                    int h2 = yuVar.h();
                    z20.a(h2);
                    this.f5873d = Integer.valueOf(h2);
                } catch (IllegalArgumentException unused) {
                    yuVar.e(a);
                    a(yuVar, d2);
                }
            } else if (d2 == 26) {
                if (this.f5874e == null) {
                    this.f5874e = new v30();
                }
                ivVar = this.f5874e;
            } else if (d2 == 34) {
                if (this.f5875f == null) {
                    this.f5875f = new r30();
                }
                ivVar = this.f5875f;
            } else if (!super.a(yuVar, d2)) {
                return this;
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
        s30 s30 = this.f5872c;
        if (s30 != null) {
            avVar.a(1, s30);
        }
        Integer num = this.f5873d;
        if (num != null) {
            avVar.b(2, num.intValue());
        }
        v30 v30 = this.f5874e;
        if (v30 != null) {
            avVar.a(3, v30);
        }
        r30 r30 = this.f5875f;
        if (r30 != null) {
            avVar.a(4, r30);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        s30 s30 = this.f5872c;
        if (s30 != null) {
            c2 += av.b(1, s30);
        }
        Integer num = this.f5873d;
        if (num != null) {
            c2 += av.c(2, num.intValue());
        }
        v30 v30 = this.f5874e;
        if (v30 != null) {
            c2 += av.b(3, v30);
        }
        r30 r30 = this.f5875f;
        return r30 != null ? c2 + av.b(4, r30) : c2;
    }
}
