package com.google.android.gms.internal.ads;

public final class sv extends cv<sv> {

    /* renamed from: c  reason: collision with root package name */
    private Integer f5555c = null;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f5556d = null;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f5557e = null;

    public sv() {
        this.f4045b = null;
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
                this.f5555c = Integer.valueOf(yuVar.f());
            } else if (d2 == 18) {
                this.f5556d = yuVar.b();
            } else if (d2 == 26) {
                this.f5557e = yuVar.b();
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        Integer num = this.f5555c;
        if (num != null) {
            avVar.b(1, num.intValue());
        }
        byte[] bArr = this.f5556d;
        if (bArr != null) {
            avVar.a(2, bArr);
        }
        byte[] bArr2 = this.f5557e;
        if (bArr2 != null) {
            avVar.a(3, bArr2);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Integer num = this.f5555c;
        if (num != null) {
            c2 += av.c(1, num.intValue());
        }
        byte[] bArr = this.f5556d;
        if (bArr != null) {
            c2 += av.b(2, bArr);
        }
        byte[] bArr2 = this.f5557e;
        return bArr2 != null ? c2 + av.b(3, bArr2) : c2;
    }
}
