package com.google.android.gms.internal.ads;

public final class tv extends cv<tv> {

    /* renamed from: c  reason: collision with root package name */
    public Integer f5654c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f5655d = null;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f5656e = null;

    public tv() {
        this.f4045b = null;
        this.a = -1;
    }

    private final tv b(yu yuVar) {
        int f2;
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 8) {
                try {
                    f2 = yuVar.f();
                    if (f2 < 0 || f2 > 1) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(f2);
                        sb.append(" is not a valid enum Type");
                    } else {
                        this.f5654c = Integer.valueOf(f2);
                    }
                } catch (IllegalArgumentException unused) {
                    yuVar.e(yuVar.a());
                    a(yuVar, d2);
                }
            } else if (d2 == 18) {
                this.f5655d = yuVar.c();
            } else if (d2 == 26) {
                this.f5656e = yuVar.b();
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append(f2);
        sb2.append(" is not a valid enum Type");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        b(yuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        Integer num = this.f5654c;
        if (num != null) {
            avVar.b(1, num.intValue());
        }
        String str = this.f5655d;
        if (str != null) {
            avVar.a(2, str);
        }
        byte[] bArr = this.f5656e;
        if (bArr != null) {
            avVar.a(3, bArr);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Integer num = this.f5654c;
        if (num != null) {
            c2 += av.c(1, num.intValue());
        }
        String str = this.f5655d;
        if (str != null) {
            c2 += av.b(2, str);
        }
        byte[] bArr = this.f5656e;
        return bArr != null ? c2 + av.b(3, bArr) : c2;
    }
}
