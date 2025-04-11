package com.google.android.gms.internal.ads;

public final class i30 extends cv<i30> {

    /* renamed from: c  reason: collision with root package name */
    private String f4588c = null;

    /* renamed from: d  reason: collision with root package name */
    private Integer f4589d = null;

    /* renamed from: e  reason: collision with root package name */
    private int[] f4590e = lv.a;

    /* renamed from: f  reason: collision with root package name */
    private r30 f4591f = null;

    public i30() {
        this.f4045b = null;
        this.a = -1;
    }

    private final i30 b(yu yuVar) {
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 10) {
                this.f4588c = yuVar.c();
            } else if (d2 == 16) {
                int a = yuVar.a();
                try {
                    int h2 = yuVar.h();
                    z20.a(h2);
                    this.f4589d = Integer.valueOf(h2);
                } catch (IllegalArgumentException unused) {
                    yuVar.e(a);
                    a(yuVar, d2);
                }
            } else if (d2 == 24) {
                int a2 = lv.a(yuVar, 24);
                int[] iArr = this.f4590e;
                int length = iArr == null ? 0 : iArr.length;
                int[] iArr2 = new int[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f4590e, 0, iArr2, 0, length);
                }
                while (length < iArr2.length - 1) {
                    iArr2[length] = yuVar.h();
                    yuVar.d();
                    length++;
                }
                iArr2[length] = yuVar.h();
                this.f4590e = iArr2;
            } else if (d2 == 26) {
                int c2 = yuVar.c(yuVar.h());
                int a3 = yuVar.a();
                int i2 = 0;
                while (yuVar.j() > 0) {
                    yuVar.h();
                    i2++;
                }
                yuVar.e(a3);
                int[] iArr3 = this.f4590e;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int[] iArr4 = new int[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f4590e, 0, iArr4, 0, length2);
                }
                while (length2 < iArr4.length) {
                    iArr4[length2] = yuVar.h();
                    length2++;
                }
                this.f4590e = iArr4;
                yuVar.d(c2);
            } else if (d2 == 34) {
                if (this.f4591f == null) {
                    this.f4591f = new r30();
                }
                yuVar.a(this.f4591f);
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
        String str = this.f4588c;
        if (str != null) {
            avVar.a(1, str);
        }
        Integer num = this.f4589d;
        if (num != null) {
            avVar.b(2, num.intValue());
        }
        int[] iArr = this.f4590e;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.f4590e;
                if (i2 >= iArr2.length) {
                    break;
                }
                avVar.b(3, iArr2[i2]);
                i2++;
            }
        }
        r30 r30 = this.f4591f;
        if (r30 != null) {
            avVar.a(4, r30);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int[] iArr;
        int c2 = super.c();
        String str = this.f4588c;
        if (str != null) {
            c2 += av.b(1, str);
        }
        Integer num = this.f4589d;
        if (num != null) {
            c2 += av.c(2, num.intValue());
        }
        int[] iArr2 = this.f4590e;
        if (iArr2 != null && iArr2.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                iArr = this.f4590e;
                if (i2 >= iArr.length) {
                    break;
                }
                i3 += av.c(iArr[i2]);
                i2++;
            }
            c2 = c2 + i3 + (iArr.length * 1);
        }
        r30 r30 = this.f4591f;
        return r30 != null ? c2 + av.b(4, r30) : c2;
    }
}
