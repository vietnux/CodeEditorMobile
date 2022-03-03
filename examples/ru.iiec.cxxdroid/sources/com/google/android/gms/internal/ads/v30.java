package com.google.android.gms.internal.ads;

public final class v30 extends cv<v30> {

    /* renamed from: c  reason: collision with root package name */
    private Integer f5804c = null;

    public v30() {
        this.f4045b = null;
        this.a = -1;
    }

    private final v30 b(yu yuVar) {
        int h2;
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 8) {
                try {
                    h2 = yuVar.h();
                    if (h2 < 0 || h2 > 3) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(h2);
                        sb.append(" is not a valid enum VideoErrorCode");
                    } else {
                        this.f5804c = Integer.valueOf(h2);
                    }
                } catch (IllegalArgumentException unused) {
                    yuVar.e(yuVar.a());
                    a(yuVar, d2);
                }
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(h2);
        sb2.append(" is not a valid enum VideoErrorCode");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        b(yuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        Integer num = this.f5804c;
        if (num != null) {
            avVar.b(1, num.intValue());
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Integer num = this.f5804c;
        return num != null ? c2 + av.c(1, num.intValue()) : c2;
    }
}
