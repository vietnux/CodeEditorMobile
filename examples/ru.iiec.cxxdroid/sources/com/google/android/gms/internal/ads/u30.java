package com.google.android.gms.internal.ads;

public final class u30 extends cv<u30> {

    /* renamed from: c  reason: collision with root package name */
    private Integer f5684c = null;

    /* renamed from: d  reason: collision with root package name */
    private v30 f5685d = null;

    /* renamed from: e  reason: collision with root package name */
    private r30 f5686e = null;

    public u30() {
        this.f4045b = null;
        this.a = -1;
    }

    private final u30 b(yu yuVar) {
        iv ivVar;
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 != 8) {
                if (d2 == 18) {
                    if (this.f5685d == null) {
                        this.f5685d = new v30();
                    }
                    ivVar = this.f5685d;
                } else if (d2 == 26) {
                    if (this.f5686e == null) {
                        this.f5686e = new r30();
                    }
                    ivVar = this.f5686e;
                } else if (!super.a(yuVar, d2)) {
                    return this;
                }
                yuVar.a(ivVar);
            } else {
                int a = yuVar.a();
                try {
                    int h2 = yuVar.h();
                    z20.a(h2);
                    this.f5684c = Integer.valueOf(h2);
                } catch (IllegalArgumentException unused) {
                    yuVar.e(a);
                    a(yuVar, d2);
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
        Integer num = this.f5684c;
        if (num != null) {
            avVar.b(1, num.intValue());
        }
        v30 v30 = this.f5685d;
        if (v30 != null) {
            avVar.a(2, v30);
        }
        r30 r30 = this.f5686e;
        if (r30 != null) {
            avVar.a(3, r30);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Integer num = this.f5684c;
        if (num != null) {
            c2 += av.c(1, num.intValue());
        }
        v30 v30 = this.f5685d;
        if (v30 != null) {
            c2 += av.b(2, v30);
        }
        r30 r30 = this.f5686e;
        return r30 != null ? c2 + av.b(3, r30) : c2;
    }
}
