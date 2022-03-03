package com.google.android.gms.internal.ads;

public final class ov extends cv<ov> {

    /* renamed from: e  reason: collision with root package name */
    private static volatile ov[] f5190e;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f5191c = null;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f5192d = null;

    public ov() {
        this.f4045b = null;
        this.a = -1;
    }

    public static ov[] d() {
        if (f5190e == null) {
            synchronized (gv.f4443b) {
                if (f5190e == null) {
                    f5190e = new ov[0];
                }
            }
        }
        return f5190e;
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 10) {
                this.f5191c = yuVar.b();
            } else if (d2 == 18) {
                this.f5192d = yuVar.b();
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        avVar.a(1, this.f5191c);
        byte[] bArr = this.f5192d;
        if (bArr != null) {
            avVar.a(2, bArr);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c() + av.b(1, this.f5191c);
        byte[] bArr = this.f5192d;
        return bArr != null ? c2 + av.b(2, bArr) : c2;
    }
}
