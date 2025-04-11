package com.google.android.gms.internal.ads;

public final class d30 extends cv<d30> {

    /* renamed from: c  reason: collision with root package name */
    private String f4080c = null;

    /* renamed from: d  reason: collision with root package name */
    private b30[] f4081d = b30.d();

    /* renamed from: e  reason: collision with root package name */
    private Integer f4082e = null;

    /* renamed from: f  reason: collision with root package name */
    private Integer f4083f = null;

    /* renamed from: g  reason: collision with root package name */
    private Integer f4084g = null;

    public d30() {
        this.f4045b = null;
        this.a = -1;
    }

    private final d30 b(yu yuVar) {
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 10) {
                this.f4080c = yuVar.c();
            } else if (d2 == 18) {
                int a = lv.a(yuVar, 18);
                b30[] b30Arr = this.f4081d;
                int length = b30Arr == null ? 0 : b30Arr.length;
                b30[] b30Arr2 = new b30[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f4081d, 0, b30Arr2, 0, length);
                }
                while (length < b30Arr2.length - 1) {
                    b30Arr2[length] = new b30();
                    yuVar.a(b30Arr2[length]);
                    yuVar.d();
                    length++;
                }
                b30Arr2[length] = new b30();
                yuVar.a(b30Arr2[length]);
                this.f4081d = b30Arr2;
            } else if (d2 == 24) {
                yuVar.a();
                int h2 = yuVar.h();
                z20.a(h2);
                this.f4082e = Integer.valueOf(h2);
            } else if (d2 == 32) {
                yuVar.a();
                int h3 = yuVar.h();
                z20.a(h3);
                this.f4083f = Integer.valueOf(h3);
            } else if (d2 == 40) {
                int a2 = yuVar.a();
                try {
                    int h4 = yuVar.h();
                    z20.a(h4);
                    this.f4084g = Integer.valueOf(h4);
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
        String str = this.f4080c;
        if (str != null) {
            avVar.a(1, str);
        }
        b30[] b30Arr = this.f4081d;
        if (b30Arr != null && b30Arr.length > 0) {
            int i2 = 0;
            while (true) {
                b30[] b30Arr2 = this.f4081d;
                if (i2 >= b30Arr2.length) {
                    break;
                }
                b30 b30 = b30Arr2[i2];
                if (b30 != null) {
                    avVar.a(2, b30);
                }
                i2++;
            }
        }
        Integer num = this.f4082e;
        if (num != null) {
            avVar.b(3, num.intValue());
        }
        Integer num2 = this.f4083f;
        if (num2 != null) {
            avVar.b(4, num2.intValue());
        }
        Integer num3 = this.f4084g;
        if (num3 != null) {
            avVar.b(5, num3.intValue());
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        String str = this.f4080c;
        if (str != null) {
            c2 += av.b(1, str);
        }
        b30[] b30Arr = this.f4081d;
        if (b30Arr != null && b30Arr.length > 0) {
            int i2 = 0;
            while (true) {
                b30[] b30Arr2 = this.f4081d;
                if (i2 >= b30Arr2.length) {
                    break;
                }
                b30 b30 = b30Arr2[i2];
                if (b30 != null) {
                    c2 += av.b(2, b30);
                }
                i2++;
            }
        }
        Integer num = this.f4082e;
        if (num != null) {
            c2 += av.c(3, num.intValue());
        }
        Integer num2 = this.f4083f;
        if (num2 != null) {
            c2 += av.c(4, num2.intValue());
        }
        Integer num3 = this.f4084g;
        return num3 != null ? c2 + av.c(5, num3.intValue()) : c2;
    }
}
