package com.google.android.gms.internal.ads;

public final class mv extends cv<mv> {

    /* renamed from: c  reason: collision with root package name */
    public Integer f4993c = null;

    /* renamed from: d  reason: collision with root package name */
    private Integer f4994d = null;

    /* renamed from: e  reason: collision with root package name */
    public String f4995e = null;

    /* renamed from: f  reason: collision with root package name */
    public String f4996f = null;

    /* renamed from: g  reason: collision with root package name */
    private String f4997g = null;

    /* renamed from: h  reason: collision with root package name */
    public nv f4998h = null;

    /* renamed from: i  reason: collision with root package name */
    public uv[] f4999i = uv.d();

    /* renamed from: j  reason: collision with root package name */
    public String f5000j = null;

    /* renamed from: k  reason: collision with root package name */
    public tv f5001k = null;

    /* renamed from: l  reason: collision with root package name */
    private Boolean f5002l = null;

    /* renamed from: m  reason: collision with root package name */
    private String[] f5003m;
    private String n;
    private Boolean o;
    private Boolean p;
    private byte[] q;
    public vv r;
    public String[] s;
    public String[] t;

    public mv() {
        String[] strArr = lv.f4905c;
        this.f5003m = strArr;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = strArr;
        this.t = strArr;
        this.f4045b = null;
        this.a = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.mv b(com.google.android.gms.internal.ads.yu r7) {
        /*
        // Method dump skipped, instructions count: 536
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mv.b(com.google.android.gms.internal.ads.yu):com.google.android.gms.internal.ads.mv");
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        b(yuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        String str = this.f4995e;
        if (str != null) {
            avVar.a(1, str);
        }
        String str2 = this.f4996f;
        if (str2 != null) {
            avVar.a(2, str2);
        }
        String str3 = this.f4997g;
        if (str3 != null) {
            avVar.a(3, str3);
        }
        uv[] uvVarArr = this.f4999i;
        int i2 = 0;
        if (uvVarArr != null && uvVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                uv[] uvVarArr2 = this.f4999i;
                if (i3 >= uvVarArr2.length) {
                    break;
                }
                uv uvVar = uvVarArr2[i3];
                if (uvVar != null) {
                    avVar.a(4, uvVar);
                }
                i3++;
            }
        }
        Boolean bool = this.f5002l;
        if (bool != null) {
            avVar.a(5, bool.booleanValue());
        }
        String[] strArr = this.f5003m;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f5003m;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str4 = strArr2[i4];
                if (str4 != null) {
                    avVar.a(6, str4);
                }
                i4++;
            }
        }
        String str5 = this.n;
        if (str5 != null) {
            avVar.a(7, str5);
        }
        Boolean bool2 = this.o;
        if (bool2 != null) {
            avVar.a(8, bool2.booleanValue());
        }
        Boolean bool3 = this.p;
        if (bool3 != null) {
            avVar.a(9, bool3.booleanValue());
        }
        Integer num = this.f4993c;
        if (num != null) {
            avVar.b(10, num.intValue());
        }
        Integer num2 = this.f4994d;
        if (num2 != null) {
            avVar.b(11, num2.intValue());
        }
        nv nvVar = this.f4998h;
        if (nvVar != null) {
            avVar.a(12, nvVar);
        }
        String str6 = this.f5000j;
        if (str6 != null) {
            avVar.a(13, str6);
        }
        tv tvVar = this.f5001k;
        if (tvVar != null) {
            avVar.a(14, tvVar);
        }
        byte[] bArr = this.q;
        if (bArr != null) {
            avVar.a(15, bArr);
        }
        vv vvVar = this.r;
        if (vvVar != null) {
            avVar.a(17, vvVar);
        }
        String[] strArr3 = this.s;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr4 = this.s;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str7 = strArr4[i5];
                if (str7 != null) {
                    avVar.a(20, str7);
                }
                i5++;
            }
        }
        String[] strArr5 = this.t;
        if (strArr5 != null && strArr5.length > 0) {
            while (true) {
                String[] strArr6 = this.t;
                if (i2 >= strArr6.length) {
                    break;
                }
                String str8 = strArr6[i2];
                if (str8 != null) {
                    avVar.a(21, str8);
                }
                i2++;
            }
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        String str = this.f4995e;
        if (str != null) {
            c2 += av.b(1, str);
        }
        String str2 = this.f4996f;
        if (str2 != null) {
            c2 += av.b(2, str2);
        }
        String str3 = this.f4997g;
        if (str3 != null) {
            c2 += av.b(3, str3);
        }
        uv[] uvVarArr = this.f4999i;
        int i2 = 0;
        if (uvVarArr != null && uvVarArr.length > 0) {
            int i3 = c2;
            int i4 = 0;
            while (true) {
                uv[] uvVarArr2 = this.f4999i;
                if (i4 >= uvVarArr2.length) {
                    break;
                }
                uv uvVar = uvVarArr2[i4];
                if (uvVar != null) {
                    i3 += av.b(4, uvVar);
                }
                i4++;
            }
            c2 = i3;
        }
        Boolean bool = this.f5002l;
        if (bool != null) {
            bool.booleanValue();
            c2 += av.b(5) + 1;
        }
        String[] strArr = this.f5003m;
        if (strArr != null && strArr.length > 0) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr2 = this.f5003m;
                if (i5 >= strArr2.length) {
                    break;
                }
                String str4 = strArr2[i5];
                if (str4 != null) {
                    i7++;
                    i6 += av.a(str4);
                }
                i5++;
            }
            c2 = c2 + i6 + (i7 * 1);
        }
        String str5 = this.n;
        if (str5 != null) {
            c2 += av.b(7, str5);
        }
        Boolean bool2 = this.o;
        if (bool2 != null) {
            bool2.booleanValue();
            c2 += av.b(8) + 1;
        }
        Boolean bool3 = this.p;
        if (bool3 != null) {
            bool3.booleanValue();
            c2 += av.b(9) + 1;
        }
        Integer num = this.f4993c;
        if (num != null) {
            c2 += av.c(10, num.intValue());
        }
        Integer num2 = this.f4994d;
        if (num2 != null) {
            c2 += av.c(11, num2.intValue());
        }
        nv nvVar = this.f4998h;
        if (nvVar != null) {
            c2 += av.b(12, nvVar);
        }
        String str6 = this.f5000j;
        if (str6 != null) {
            c2 += av.b(13, str6);
        }
        tv tvVar = this.f5001k;
        if (tvVar != null) {
            c2 += av.b(14, tvVar);
        }
        byte[] bArr = this.q;
        if (bArr != null) {
            c2 += av.b(15, bArr);
        }
        vv vvVar = this.r;
        if (vvVar != null) {
            c2 += av.b(17, vvVar);
        }
        String[] strArr3 = this.s;
        if (strArr3 != null && strArr3.length > 0) {
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr4 = this.s;
                if (i8 >= strArr4.length) {
                    break;
                }
                String str7 = strArr4[i8];
                if (str7 != null) {
                    i10++;
                    i9 += av.a(str7);
                }
                i8++;
            }
            c2 = c2 + i9 + (i10 * 2);
        }
        String[] strArr5 = this.t;
        if (strArr5 == null || strArr5.length <= 0) {
            return c2;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            String[] strArr6 = this.t;
            if (i2 >= strArr6.length) {
                return c2 + i11 + (i12 * 2);
            }
            String str8 = strArr6[i2];
            if (str8 != null) {
                i12++;
                i11 += av.a(str8);
            }
            i2++;
        }
    }
}
