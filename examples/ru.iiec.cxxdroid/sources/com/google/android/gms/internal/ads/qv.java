package com.google.android.gms.internal.ads;

public final class qv extends cv<qv> {

    /* renamed from: c  reason: collision with root package name */
    private byte[] f5361c = null;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f5362d = null;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f5363e = null;

    public qv() {
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
            if (d2 == 10) {
                this.f5361c = yuVar.b();
            } else if (d2 == 18) {
                this.f5362d = yuVar.b();
            } else if (d2 == 26) {
                this.f5363e = yuVar.b();
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        byte[] bArr = this.f5361c;
        if (bArr != null) {
            avVar.a(1, bArr);
        }
        byte[] bArr2 = this.f5362d;
        if (bArr2 != null) {
            avVar.a(2, bArr2);
        }
        byte[] bArr3 = this.f5363e;
        if (bArr3 != null) {
            avVar.a(3, bArr3);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        byte[] bArr = this.f5361c;
        if (bArr != null) {
            c2 += av.b(1, bArr);
        }
        byte[] bArr2 = this.f5362d;
        if (bArr2 != null) {
            c2 += av.b(2, bArr2);
        }
        byte[] bArr3 = this.f5363e;
        return bArr3 != null ? c2 + av.b(3, bArr3) : c2;
    }
}
