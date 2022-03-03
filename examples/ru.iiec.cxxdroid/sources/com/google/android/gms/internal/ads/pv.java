package com.google.android.gms.internal.ads;

public final class pv extends cv<pv> {

    /* renamed from: c  reason: collision with root package name */
    private qv f5264c = null;

    /* renamed from: d  reason: collision with root package name */
    public ov[] f5265d = ov.d();

    /* renamed from: e  reason: collision with root package name */
    private byte[] f5266e = null;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f5267f = null;

    /* renamed from: g  reason: collision with root package name */
    private Integer f5268g = null;

    public pv() {
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
                if (this.f5264c == null) {
                    this.f5264c = new qv();
                }
                yuVar.a(this.f5264c);
            } else if (d2 == 18) {
                int a = lv.a(yuVar, 18);
                ov[] ovVarArr = this.f5265d;
                int length = ovVarArr == null ? 0 : ovVarArr.length;
                ov[] ovVarArr2 = new ov[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f5265d, 0, ovVarArr2, 0, length);
                }
                while (length < ovVarArr2.length - 1) {
                    ovVarArr2[length] = new ov();
                    yuVar.a(ovVarArr2[length]);
                    yuVar.d();
                    length++;
                }
                ovVarArr2[length] = new ov();
                yuVar.a(ovVarArr2[length]);
                this.f5265d = ovVarArr2;
            } else if (d2 == 26) {
                this.f5266e = yuVar.b();
            } else if (d2 == 34) {
                this.f5267f = yuVar.b();
            } else if (d2 == 40) {
                this.f5268g = Integer.valueOf(yuVar.f());
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        qv qvVar = this.f5264c;
        if (qvVar != null) {
            avVar.a(1, qvVar);
        }
        ov[] ovVarArr = this.f5265d;
        if (ovVarArr != null && ovVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                ov[] ovVarArr2 = this.f5265d;
                if (i2 >= ovVarArr2.length) {
                    break;
                }
                ov ovVar = ovVarArr2[i2];
                if (ovVar != null) {
                    avVar.a(2, ovVar);
                }
                i2++;
            }
        }
        byte[] bArr = this.f5266e;
        if (bArr != null) {
            avVar.a(3, bArr);
        }
        byte[] bArr2 = this.f5267f;
        if (bArr2 != null) {
            avVar.a(4, bArr2);
        }
        Integer num = this.f5268g;
        if (num != null) {
            avVar.b(5, num.intValue());
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        qv qvVar = this.f5264c;
        if (qvVar != null) {
            c2 += av.b(1, qvVar);
        }
        ov[] ovVarArr = this.f5265d;
        if (ovVarArr != null && ovVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                ov[] ovVarArr2 = this.f5265d;
                if (i2 >= ovVarArr2.length) {
                    break;
                }
                ov ovVar = ovVarArr2[i2];
                if (ovVar != null) {
                    c2 += av.b(2, ovVar);
                }
                i2++;
            }
        }
        byte[] bArr = this.f5266e;
        if (bArr != null) {
            c2 += av.b(3, bArr);
        }
        byte[] bArr2 = this.f5267f;
        if (bArr2 != null) {
            c2 += av.b(4, bArr2);
        }
        Integer num = this.f5268g;
        return num != null ? c2 + av.c(5, num.intValue()) : c2;
    }
}
