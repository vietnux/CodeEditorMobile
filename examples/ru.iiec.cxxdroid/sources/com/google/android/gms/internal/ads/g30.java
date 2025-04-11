package com.google.android.gms.internal.ads;

public final class g30 extends cv<g30> {

    /* renamed from: c  reason: collision with root package name */
    private Integer f4381c = null;

    /* renamed from: d  reason: collision with root package name */
    private s30 f4382d = null;

    /* renamed from: e  reason: collision with root package name */
    private String f4383e = null;

    /* renamed from: f  reason: collision with root package name */
    private String f4384f = null;

    public g30() {
        this.f4045b = null;
        this.a = -1;
    }

    private final g30 b(yu yuVar) {
        int h2;
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 40) {
                try {
                    h2 = yuVar.h();
                    if (h2 < 0 || h2 > 2) {
                        StringBuilder sb = new StringBuilder(40);
                        sb.append(h2);
                        sb.append(" is not a valid enum Platform");
                    } else {
                        this.f4381c = Integer.valueOf(h2);
                    }
                } catch (IllegalArgumentException unused) {
                    yuVar.e(yuVar.a());
                    a(yuVar, d2);
                }
            } else if (d2 == 50) {
                if (this.f4382d == null) {
                    this.f4382d = new s30();
                }
                yuVar.a(this.f4382d);
            } else if (d2 == 58) {
                this.f4383e = yuVar.c();
            } else if (d2 == 66) {
                this.f4384f = yuVar.c();
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(h2);
        sb2.append(" is not a valid enum Platform");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        b(yuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        Integer num = this.f4381c;
        if (num != null) {
            avVar.b(5, num.intValue());
        }
        s30 s30 = this.f4382d;
        if (s30 != null) {
            avVar.a(6, s30);
        }
        String str = this.f4383e;
        if (str != null) {
            avVar.a(7, str);
        }
        String str2 = this.f4384f;
        if (str2 != null) {
            avVar.a(8, str2);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Integer num = this.f4381c;
        if (num != null) {
            c2 += av.c(5, num.intValue());
        }
        s30 s30 = this.f4382d;
        if (s30 != null) {
            c2 += av.b(6, s30);
        }
        String str = this.f4383e;
        if (str != null) {
            c2 += av.b(7, str);
        }
        String str2 = this.f4384f;
        return str2 != null ? c2 + av.b(8, str2) : c2;
    }
}
