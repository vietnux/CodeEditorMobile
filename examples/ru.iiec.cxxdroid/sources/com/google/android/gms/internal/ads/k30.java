package com.google.android.gms.internal.ads;

public final class k30 extends cv<k30> {

    /* renamed from: c  reason: collision with root package name */
    private i30 f4769c = null;

    /* renamed from: d  reason: collision with root package name */
    private q30[] f4770d = q30.d();

    /* renamed from: e  reason: collision with root package name */
    private Integer f4771e = null;

    /* renamed from: f  reason: collision with root package name */
    private r30 f4772f = null;

    public k30() {
        this.f4045b = null;
        this.a = -1;
    }

    private final k30 b(yu yuVar) {
        iv ivVar;
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 10) {
                if (this.f4769c == null) {
                    this.f4769c = new i30();
                }
                ivVar = this.f4769c;
            } else if (d2 == 18) {
                int a = lv.a(yuVar, 18);
                q30[] q30Arr = this.f4770d;
                int length = q30Arr == null ? 0 : q30Arr.length;
                q30[] q30Arr2 = new q30[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f4770d, 0, q30Arr2, 0, length);
                }
                while (length < q30Arr2.length - 1) {
                    q30Arr2[length] = new q30();
                    yuVar.a(q30Arr2[length]);
                    yuVar.d();
                    length++;
                }
                q30Arr2[length] = new q30();
                yuVar.a(q30Arr2[length]);
                this.f4770d = q30Arr2;
            } else if (d2 == 24) {
                int a2 = yuVar.a();
                try {
                    int h2 = yuVar.h();
                    z20.a(h2);
                    this.f4771e = Integer.valueOf(h2);
                } catch (IllegalArgumentException unused) {
                    yuVar.e(a2);
                    a(yuVar, d2);
                }
            } else if (d2 == 34) {
                if (this.f4772f == null) {
                    this.f4772f = new r30();
                }
                ivVar = this.f4772f;
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
            yuVar.a(ivVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        b(yuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        i30 i30 = this.f4769c;
        if (i30 != null) {
            avVar.a(1, i30);
        }
        q30[] q30Arr = this.f4770d;
        if (q30Arr != null && q30Arr.length > 0) {
            int i2 = 0;
            while (true) {
                q30[] q30Arr2 = this.f4770d;
                if (i2 >= q30Arr2.length) {
                    break;
                }
                q30 q30 = q30Arr2[i2];
                if (q30 != null) {
                    avVar.a(2, q30);
                }
                i2++;
            }
        }
        Integer num = this.f4771e;
        if (num != null) {
            avVar.b(3, num.intValue());
        }
        r30 r30 = this.f4772f;
        if (r30 != null) {
            avVar.a(4, r30);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        i30 i30 = this.f4769c;
        if (i30 != null) {
            c2 += av.b(1, i30);
        }
        q30[] q30Arr = this.f4770d;
        if (q30Arr != null && q30Arr.length > 0) {
            int i2 = 0;
            while (true) {
                q30[] q30Arr2 = this.f4770d;
                if (i2 >= q30Arr2.length) {
                    break;
                }
                q30 q30 = q30Arr2[i2];
                if (q30 != null) {
                    c2 += av.b(2, q30);
                }
                i2++;
            }
        }
        Integer num = this.f4771e;
        if (num != null) {
            c2 += av.c(3, num.intValue());
        }
        r30 r30 = this.f4772f;
        return r30 != null ? c2 + av.b(4, r30) : c2;
    }
}
