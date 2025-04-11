package com.google.android.gms.internal.ads;

public final class xs extends cv<xs> {

    /* renamed from: c  reason: collision with root package name */
    private Long f6049c = null;

    /* renamed from: d  reason: collision with root package name */
    private Integer f6050d = null;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f6051e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f6052f = lv.a;

    /* renamed from: g  reason: collision with root package name */
    private Long f6053g = null;

    public xs() {
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
                this.f6049c = Long.valueOf(yuVar.i());
            } else if (d2 == 16) {
                this.f6050d = Integer.valueOf(yuVar.h());
            } else if (d2 == 24) {
                this.f6051e = Boolean.valueOf(yuVar.g());
            } else if (d2 == 32) {
                int a = lv.a(yuVar, 32);
                int[] iArr = this.f6052f;
                int length = iArr == null ? 0 : iArr.length;
                int[] iArr2 = new int[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f6052f, 0, iArr2, 0, length);
                }
                while (length < iArr2.length - 1) {
                    iArr2[length] = yuVar.h();
                    yuVar.d();
                    length++;
                }
                iArr2[length] = yuVar.h();
                this.f6052f = iArr2;
            } else if (d2 == 34) {
                int c2 = yuVar.c(yuVar.h());
                int a2 = yuVar.a();
                int i2 = 0;
                while (yuVar.j() > 0) {
                    yuVar.h();
                    i2++;
                }
                yuVar.e(a2);
                int[] iArr3 = this.f6052f;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int[] iArr4 = new int[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f6052f, 0, iArr4, 0, length2);
                }
                while (length2 < iArr4.length) {
                    iArr4[length2] = yuVar.h();
                    length2++;
                }
                this.f6052f = iArr4;
                yuVar.d(c2);
            } else if (d2 == 40) {
                this.f6053g = Long.valueOf(yuVar.i());
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        Long l2 = this.f6049c;
        if (l2 != null) {
            avVar.b(1, l2.longValue());
        }
        Integer num = this.f6050d;
        if (num != null) {
            avVar.b(2, num.intValue());
        }
        Boolean bool = this.f6051e;
        if (bool != null) {
            avVar.a(3, bool.booleanValue());
        }
        int[] iArr = this.f6052f;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.f6052f;
                if (i2 >= iArr2.length) {
                    break;
                }
                avVar.b(4, iArr2[i2]);
                i2++;
            }
        }
        Long l3 = this.f6053g;
        if (l3 != null) {
            avVar.a(5, l3.longValue());
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int[] iArr;
        int c2 = super.c();
        Long l2 = this.f6049c;
        if (l2 != null) {
            c2 += av.c(1, l2.longValue());
        }
        Integer num = this.f6050d;
        if (num != null) {
            c2 += av.c(2, num.intValue());
        }
        Boolean bool = this.f6051e;
        if (bool != null) {
            bool.booleanValue();
            c2 += av.b(3) + 1;
        }
        int[] iArr2 = this.f6052f;
        if (iArr2 != null && iArr2.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                iArr = this.f6052f;
                if (i2 >= iArr.length) {
                    break;
                }
                i3 += av.c(iArr[i2]);
                i2++;
            }
            c2 = c2 + i3 + (iArr.length * 1);
        }
        Long l3 = this.f6053g;
        return l3 != null ? c2 + av.d(5, l3.longValue()) : c2;
    }
}
