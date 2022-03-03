package com.google.android.gms.internal.ads;

public final class j30 extends cv<j30> {

    /* renamed from: c  reason: collision with root package name */
    private Integer f4672c = null;

    /* renamed from: d  reason: collision with root package name */
    private int[] f4673d = lv.a;

    public j30() {
        this.f4045b = null;
        this.a = -1;
    }

    private final j30 b(yu yuVar) {
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 8) {
                int a = yuVar.a();
                try {
                    int h2 = yuVar.h();
                    z20.a(h2);
                    this.f4672c = Integer.valueOf(h2);
                } catch (IllegalArgumentException unused) {
                    yuVar.e(a);
                    a(yuVar, d2);
                }
            } else if (d2 == 16) {
                int a2 = lv.a(yuVar, 16);
                int[] iArr = this.f4673d;
                int length = iArr == null ? 0 : iArr.length;
                int[] iArr2 = new int[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f4673d, 0, iArr2, 0, length);
                }
                while (length < iArr2.length - 1) {
                    iArr2[length] = yuVar.h();
                    yuVar.d();
                    length++;
                }
                iArr2[length] = yuVar.h();
                this.f4673d = iArr2;
            } else if (d2 == 18) {
                int c2 = yuVar.c(yuVar.h());
                int a3 = yuVar.a();
                int i2 = 0;
                while (yuVar.j() > 0) {
                    yuVar.h();
                    i2++;
                }
                yuVar.e(a3);
                int[] iArr3 = this.f4673d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int[] iArr4 = new int[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f4673d, 0, iArr4, 0, length2);
                }
                while (length2 < iArr4.length) {
                    iArr4[length2] = yuVar.h();
                    length2++;
                }
                this.f4673d = iArr4;
                yuVar.d(c2);
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
        Integer num = this.f4672c;
        if (num != null) {
            avVar.b(1, num.intValue());
        }
        int[] iArr = this.f4673d;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.f4673d;
                if (i2 >= iArr2.length) {
                    break;
                }
                avVar.b(2, iArr2[i2]);
                i2++;
            }
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Integer num = this.f4672c;
        if (num != null) {
            c2 += av.c(1, num.intValue());
        }
        int[] iArr = this.f4673d;
        if (iArr == null || iArr.length <= 0) {
            return c2;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.f4673d;
            if (i2 >= iArr2.length) {
                return c2 + i3 + (iArr2.length * 1);
            }
            i3 += av.c(iArr2[i2]);
            i2++;
        }
    }
}
