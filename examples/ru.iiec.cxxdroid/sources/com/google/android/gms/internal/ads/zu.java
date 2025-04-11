package com.google.android.gms.internal.ads;

public final class zu extends cv<zu> {

    /* renamed from: c  reason: collision with root package name */
    public Long f6218c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f6219d = null;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f6220e = null;

    public zu() {
        this.a = -1;
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 8) {
                this.f6218c = Long.valueOf(yuVar.i());
            } else if (d2 == 26) {
                this.f6219d = yuVar.c();
            } else if (d2 == 34) {
                this.f6220e = yuVar.b();
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        Long l2 = this.f6218c;
        if (l2 != null) {
            avVar.b(1, l2.longValue());
        }
        String str = this.f6219d;
        if (str != null) {
            avVar.a(3, str);
        }
        byte[] bArr = this.f6220e;
        if (bArr != null) {
            avVar.a(4, bArr);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Long l2 = this.f6218c;
        if (l2 != null) {
            c2 += av.c(1, l2.longValue());
        }
        String str = this.f6219d;
        if (str != null) {
            c2 += av.b(3, str);
        }
        byte[] bArr = this.f6220e;
        return bArr != null ? c2 + av.b(4, bArr) : c2;
    }
}
