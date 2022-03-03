package com.google.android.gms.internal.ads;

public final class e30 extends cv<e30> {

    /* renamed from: c  reason: collision with root package name */
    private Integer f4166c = null;

    /* renamed from: d  reason: collision with root package name */
    private r30 f4167d = null;

    /* renamed from: e  reason: collision with root package name */
    private r30 f4168e = null;

    /* renamed from: f  reason: collision with root package name */
    private r30 f4169f = null;

    /* renamed from: g  reason: collision with root package name */
    private r30[] f4170g = r30.d();

    /* renamed from: h  reason: collision with root package name */
    private Integer f4171h = null;

    public e30() {
        this.f4045b = null;
        this.a = -1;
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        iv ivVar;
        while (true) {
            int d2 = yuVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 != 8) {
                if (d2 == 18) {
                    if (this.f4167d == null) {
                        this.f4167d = new r30();
                    }
                    ivVar = this.f4167d;
                } else if (d2 == 26) {
                    if (this.f4168e == null) {
                        this.f4168e = new r30();
                    }
                    ivVar = this.f4168e;
                } else if (d2 == 34) {
                    if (this.f4169f == null) {
                        this.f4169f = new r30();
                    }
                    ivVar = this.f4169f;
                } else if (d2 == 42) {
                    int a = lv.a(yuVar, 42);
                    r30[] r30Arr = this.f4170g;
                    int length = r30Arr == null ? 0 : r30Arr.length;
                    r30[] r30Arr2 = new r30[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f4170g, 0, r30Arr2, 0, length);
                    }
                    while (length < r30Arr2.length - 1) {
                        r30Arr2[length] = new r30();
                        yuVar.a(r30Arr2[length]);
                        yuVar.d();
                        length++;
                    }
                    r30Arr2[length] = new r30();
                    yuVar.a(r30Arr2[length]);
                    this.f4170g = r30Arr2;
                } else if (d2 == 48) {
                    this.f4171h = Integer.valueOf(yuVar.h());
                } else if (!super.a(yuVar, d2)) {
                    return this;
                }
                yuVar.a(ivVar);
            } else {
                this.f4166c = Integer.valueOf(yuVar.h());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        Integer num = this.f4166c;
        if (num != null) {
            avVar.b(1, num.intValue());
        }
        r30 r30 = this.f4167d;
        if (r30 != null) {
            avVar.a(2, r30);
        }
        r30 r302 = this.f4168e;
        if (r302 != null) {
            avVar.a(3, r302);
        }
        r30 r303 = this.f4169f;
        if (r303 != null) {
            avVar.a(4, r303);
        }
        r30[] r30Arr = this.f4170g;
        if (r30Arr != null && r30Arr.length > 0) {
            int i2 = 0;
            while (true) {
                r30[] r30Arr2 = this.f4170g;
                if (i2 >= r30Arr2.length) {
                    break;
                }
                r30 r304 = r30Arr2[i2];
                if (r304 != null) {
                    avVar.a(5, r304);
                }
                i2++;
            }
        }
        Integer num2 = this.f4171h;
        if (num2 != null) {
            avVar.b(6, num2.intValue());
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Integer num = this.f4166c;
        if (num != null) {
            c2 += av.c(1, num.intValue());
        }
        r30 r30 = this.f4167d;
        if (r30 != null) {
            c2 += av.b(2, r30);
        }
        r30 r302 = this.f4168e;
        if (r302 != null) {
            c2 += av.b(3, r302);
        }
        r30 r303 = this.f4169f;
        if (r303 != null) {
            c2 += av.b(4, r303);
        }
        r30[] r30Arr = this.f4170g;
        if (r30Arr != null && r30Arr.length > 0) {
            int i2 = 0;
            while (true) {
                r30[] r30Arr2 = this.f4170g;
                if (i2 >= r30Arr2.length) {
                    break;
                }
                r30 r304 = r30Arr2[i2];
                if (r304 != null) {
                    c2 += av.b(5, r304);
                }
                i2++;
            }
        }
        Integer num2 = this.f4171h;
        return num2 != null ? c2 + av.c(6, num2.intValue()) : c2;
    }
}
