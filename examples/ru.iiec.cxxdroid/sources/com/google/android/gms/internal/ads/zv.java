package com.google.android.gms.internal.ads;

public final class zv extends cv<zv> {

    /* renamed from: c  reason: collision with root package name */
    public byte[][] f6221c = lv.f4906d;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f6222d = null;

    /* renamed from: e  reason: collision with root package name */
    private Integer f6223e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f6224f;

    public zv() {
        this.a = -1;
    }

    private final zv b(yu yuVar) {
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 10) {
                int a = lv.a(yuVar, 10);
                byte[][] bArr = this.f6221c;
                int length = bArr == null ? 0 : bArr.length;
                byte[][] bArr2 = new byte[(a + length)][];
                if (length != 0) {
                    System.arraycopy(this.f6221c, 0, bArr2, 0, length);
                }
                while (length < bArr2.length - 1) {
                    bArr2[length] = yuVar.b();
                    yuVar.d();
                    length++;
                }
                bArr2[length] = yuVar.b();
                this.f6221c = bArr2;
            } else if (d2 == 18) {
                this.f6222d = yuVar.b();
            } else if (d2 == 24) {
                yuVar.a();
                int h2 = yuVar.h();
                vo.b(h2);
                this.f6223e = Integer.valueOf(h2);
            } else if (d2 == 32) {
                int a2 = yuVar.a();
                try {
                    int h3 = yuVar.h();
                    vo.c(h3);
                    this.f6224f = Integer.valueOf(h3);
                } catch (IllegalArgumentException unused) {
                    yuVar.e(a2);
                    a(yuVar, d2);
                }
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
        byte[][] bArr = this.f6221c;
        if (bArr != null && bArr.length > 0) {
            int i2 = 0;
            while (true) {
                byte[][] bArr2 = this.f6221c;
                if (i2 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i2];
                if (bArr3 != null) {
                    avVar.a(1, bArr3);
                }
                i2++;
            }
        }
        byte[] bArr4 = this.f6222d;
        if (bArr4 != null) {
            avVar.a(2, bArr4);
        }
        Integer num = this.f6223e;
        if (num != null) {
            avVar.b(3, num.intValue());
        }
        Integer num2 = this.f6224f;
        if (num2 != null) {
            avVar.b(4, num2.intValue());
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        byte[][] bArr = this.f6221c;
        if (bArr != null && bArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                byte[][] bArr2 = this.f6221c;
                if (i2 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i2];
                if (bArr3 != null) {
                    i4++;
                    i3 += av.c(bArr3);
                }
                i2++;
            }
            c2 = c2 + i3 + (i4 * 1);
        }
        byte[] bArr4 = this.f6222d;
        if (bArr4 != null) {
            c2 += av.b(2, bArr4);
        }
        Integer num = this.f6223e;
        if (num != null) {
            c2 += av.c(3, num.intValue());
        }
        Integer num2 = this.f6224f;
        return num2 != null ? c2 + av.c(4, num2.intValue()) : c2;
    }
}
