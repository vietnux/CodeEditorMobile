package com.google.android.gms.internal.ads;

public final class yt extends cv<yt> {

    /* renamed from: c  reason: collision with root package name */
    public byte[] f6151c = null;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f6152d = null;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f6153e = null;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f6154f = null;

    public yt() {
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
                this.f6151c = yuVar.b();
            } else if (d2 == 18) {
                this.f6152d = yuVar.b();
            } else if (d2 == 26) {
                this.f6153e = yuVar.b();
            } else if (d2 == 34) {
                this.f6154f = yuVar.b();
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        byte[] bArr = this.f6151c;
        if (bArr != null) {
            avVar.a(1, bArr);
        }
        byte[] bArr2 = this.f6152d;
        if (bArr2 != null) {
            avVar.a(2, bArr2);
        }
        byte[] bArr3 = this.f6153e;
        if (bArr3 != null) {
            avVar.a(3, bArr3);
        }
        byte[] bArr4 = this.f6154f;
        if (bArr4 != null) {
            avVar.a(4, bArr4);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        byte[] bArr = this.f6151c;
        if (bArr != null) {
            c2 += av.b(1, bArr);
        }
        byte[] bArr2 = this.f6152d;
        if (bArr2 != null) {
            c2 += av.b(2, bArr2);
        }
        byte[] bArr3 = this.f6153e;
        if (bArr3 != null) {
            c2 += av.b(3, bArr3);
        }
        byte[] bArr4 = this.f6154f;
        return bArr4 != null ? c2 + av.b(4, bArr4) : c2;
    }
}
