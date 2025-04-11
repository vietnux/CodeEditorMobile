package com.google.android.gms.internal.ads;

public final class q30 extends cv<q30> {

    /* renamed from: f  reason: collision with root package name */
    private static volatile q30[] f5287f;

    /* renamed from: c  reason: collision with root package name */
    private String f5288c = null;

    /* renamed from: d  reason: collision with root package name */
    private Integer f5289d = null;

    /* renamed from: e  reason: collision with root package name */
    private r30 f5290e = null;

    public q30() {
        this.f4045b = null;
        this.a = -1;
    }

    private final q30 b(yu yuVar) {
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 10) {
                this.f5288c = yuVar.c();
            } else if (d2 == 16) {
                int a = yuVar.a();
                try {
                    int h2 = yuVar.h();
                    z20.a(h2);
                    this.f5289d = Integer.valueOf(h2);
                } catch (IllegalArgumentException unused) {
                    yuVar.e(a);
                    a(yuVar, d2);
                }
            } else if (d2 == 26) {
                if (this.f5290e == null) {
                    this.f5290e = new r30();
                }
                yuVar.a(this.f5290e);
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
    }

    public static q30[] d() {
        if (f5287f == null) {
            synchronized (gv.f4443b) {
                if (f5287f == null) {
                    f5287f = new q30[0];
                }
            }
        }
        return f5287f;
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        b(yuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        String str = this.f5288c;
        if (str != null) {
            avVar.a(1, str);
        }
        Integer num = this.f5289d;
        if (num != null) {
            avVar.b(2, num.intValue());
        }
        r30 r30 = this.f5290e;
        if (r30 != null) {
            avVar.a(3, r30);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        String str = this.f5288c;
        if (str != null) {
            c2 += av.b(1, str);
        }
        Integer num = this.f5289d;
        if (num != null) {
            c2 += av.c(2, num.intValue());
        }
        r30 r30 = this.f5290e;
        return r30 != null ? c2 + av.b(3, r30) : c2;
    }
}
