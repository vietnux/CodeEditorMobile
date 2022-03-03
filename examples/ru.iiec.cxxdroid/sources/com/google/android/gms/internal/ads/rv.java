package com.google.android.gms.internal.ads;

public final class rv extends cv<rv> {

    /* renamed from: c  reason: collision with root package name */
    private sv f5472c = null;

    /* renamed from: d  reason: collision with root package name */
    private ov[] f5473d = ov.d();

    /* renamed from: e  reason: collision with root package name */
    private byte[] f5474e = null;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f5475f = null;

    /* renamed from: g  reason: collision with root package name */
    private Integer f5476g = null;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f5477h = null;

    public rv() {
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
                if (this.f5472c == null) {
                    this.f5472c = new sv();
                }
                yuVar.a(this.f5472c);
            } else if (d2 == 18) {
                int a = lv.a(yuVar, 18);
                ov[] ovVarArr = this.f5473d;
                int length = ovVarArr == null ? 0 : ovVarArr.length;
                ov[] ovVarArr2 = new ov[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f5473d, 0, ovVarArr2, 0, length);
                }
                while (length < ovVarArr2.length - 1) {
                    ovVarArr2[length] = new ov();
                    yuVar.a(ovVarArr2[length]);
                    yuVar.d();
                    length++;
                }
                ovVarArr2[length] = new ov();
                yuVar.a(ovVarArr2[length]);
                this.f5473d = ovVarArr2;
            } else if (d2 == 26) {
                this.f5474e = yuVar.b();
            } else if (d2 == 34) {
                this.f5475f = yuVar.b();
            } else if (d2 == 40) {
                this.f5476g = Integer.valueOf(yuVar.f());
            } else if (d2 == 50) {
                this.f5477h = yuVar.b();
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        sv svVar = this.f5472c;
        if (svVar != null) {
            avVar.a(1, svVar);
        }
        ov[] ovVarArr = this.f5473d;
        if (ovVarArr != null && ovVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                ov[] ovVarArr2 = this.f5473d;
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
        byte[] bArr = this.f5474e;
        if (bArr != null) {
            avVar.a(3, bArr);
        }
        byte[] bArr2 = this.f5475f;
        if (bArr2 != null) {
            avVar.a(4, bArr2);
        }
        Integer num = this.f5476g;
        if (num != null) {
            avVar.b(5, num.intValue());
        }
        byte[] bArr3 = this.f5477h;
        if (bArr3 != null) {
            avVar.a(6, bArr3);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        sv svVar = this.f5472c;
        if (svVar != null) {
            c2 += av.b(1, svVar);
        }
        ov[] ovVarArr = this.f5473d;
        if (ovVarArr != null && ovVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                ov[] ovVarArr2 = this.f5473d;
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
        byte[] bArr = this.f5474e;
        if (bArr != null) {
            c2 += av.b(3, bArr);
        }
        byte[] bArr2 = this.f5475f;
        if (bArr2 != null) {
            c2 += av.b(4, bArr2);
        }
        Integer num = this.f5476g;
        if (num != null) {
            c2 += av.c(5, num.intValue());
        }
        byte[] bArr3 = this.f5477h;
        return bArr3 != null ? c2 + av.b(6, bArr3) : c2;
    }
}
