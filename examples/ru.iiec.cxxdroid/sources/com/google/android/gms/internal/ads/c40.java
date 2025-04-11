package com.google.android.gms.internal.ads;

public final class c40 extends cv<c40> {

    /* renamed from: c  reason: collision with root package name */
    private Integer f3979c = null;

    /* renamed from: d  reason: collision with root package name */
    private v30 f3980d = null;

    public c40() {
        this.f4045b = null;
        this.a = -1;
    }

    private final c40 b(yu yuVar) {
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
                    this.f3979c = Integer.valueOf(h2);
                } catch (IllegalArgumentException unused) {
                    yuVar.e(a);
                    a(yuVar, d2);
                }
            } else if (d2 == 18) {
                if (this.f3980d == null) {
                    this.f3980d = new v30();
                }
                yuVar.a(this.f3980d);
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
        Integer num = this.f3979c;
        if (num != null) {
            avVar.b(1, num.intValue());
        }
        v30 v30 = this.f3980d;
        if (v30 != null) {
            avVar.a(2, v30);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Integer num = this.f3979c;
        if (num != null) {
            c2 += av.c(1, num.intValue());
        }
        v30 v30 = this.f3980d;
        return v30 != null ? c2 + av.b(2, v30) : c2;
    }
}
