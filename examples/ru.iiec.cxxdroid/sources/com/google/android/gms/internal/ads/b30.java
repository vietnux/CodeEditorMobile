package com.google.android.gms.internal.ads;

public final class b30 extends cv<b30> {

    /* renamed from: e  reason: collision with root package name */
    private static volatile b30[] f3837e;

    /* renamed from: c  reason: collision with root package name */
    private Integer f3838c = null;

    /* renamed from: d  reason: collision with root package name */
    private p30 f3839d = null;

    public b30() {
        this.f4045b = null;
        this.a = -1;
    }

    private final b30 b(yu yuVar) {
        int h2;
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 8) {
                try {
                    h2 = yuVar.h();
                    if (h2 < 0 || h2 > 10) {
                        StringBuilder sb = new StringBuilder(44);
                        sb.append(h2);
                        sb.append(" is not a valid enum AdFormatType");
                    } else {
                        this.f3838c = Integer.valueOf(h2);
                    }
                } catch (IllegalArgumentException unused) {
                    yuVar.e(yuVar.a());
                    a(yuVar, d2);
                }
            } else if (d2 == 18) {
                if (this.f3839d == null) {
                    this.f3839d = new p30();
                }
                yuVar.a(this.f3839d);
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append(h2);
        sb2.append(" is not a valid enum AdFormatType");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static b30[] d() {
        if (f3837e == null) {
            synchronized (gv.f4443b) {
                if (f3837e == null) {
                    f3837e = new b30[0];
                }
            }
        }
        return f3837e;
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        b(yuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        Integer num = this.f3838c;
        if (num != null) {
            avVar.b(1, num.intValue());
        }
        p30 p30 = this.f3839d;
        if (p30 != null) {
            avVar.a(2, p30);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Integer num = this.f3838c;
        if (num != null) {
            c2 += av.c(1, num.intValue());
        }
        p30 p30 = this.f3839d;
        return p30 != null ? c2 + av.b(2, p30) : c2;
    }
}
