package com.google.android.gms.internal.ads;

public final class sl extends cv<sl> {

    /* renamed from: c  reason: collision with root package name */
    public String f5539c = null;

    /* renamed from: d  reason: collision with root package name */
    public Long f5540d = null;

    /* renamed from: e  reason: collision with root package name */
    private String f5541e = null;

    /* renamed from: f  reason: collision with root package name */
    private String f5542f = null;

    /* renamed from: g  reason: collision with root package name */
    private String f5543g = null;

    /* renamed from: h  reason: collision with root package name */
    private Long f5544h = null;

    /* renamed from: i  reason: collision with root package name */
    private Long f5545i = null;

    /* renamed from: j  reason: collision with root package name */
    private String f5546j = null;

    /* renamed from: k  reason: collision with root package name */
    private Long f5547k = null;

    /* renamed from: l  reason: collision with root package name */
    private String f5548l = null;

    public sl() {
        this.a = -1;
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        while (true) {
            int d2 = yuVar.d();
            switch (d2) {
                case 0:
                    return this;
                case 10:
                    this.f5539c = yuVar.c();
                    break;
                case 16:
                    this.f5540d = Long.valueOf(yuVar.i());
                    break;
                case 26:
                    this.f5541e = yuVar.c();
                    break;
                case 34:
                    this.f5542f = yuVar.c();
                    break;
                case 42:
                    this.f5543g = yuVar.c();
                    break;
                case 48:
                    this.f5544h = Long.valueOf(yuVar.i());
                    break;
                case 56:
                    this.f5545i = Long.valueOf(yuVar.i());
                    break;
                case 66:
                    this.f5546j = yuVar.c();
                    break;
                case 72:
                    this.f5547k = Long.valueOf(yuVar.i());
                    break;
                case 82:
                    this.f5548l = yuVar.c();
                    break;
                default:
                    if (super.a(yuVar, d2)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        String str = this.f5539c;
        if (str != null) {
            avVar.a(1, str);
        }
        Long l2 = this.f5540d;
        if (l2 != null) {
            avVar.b(2, l2.longValue());
        }
        String str2 = this.f5541e;
        if (str2 != null) {
            avVar.a(3, str2);
        }
        String str3 = this.f5542f;
        if (str3 != null) {
            avVar.a(4, str3);
        }
        String str4 = this.f5543g;
        if (str4 != null) {
            avVar.a(5, str4);
        }
        Long l3 = this.f5544h;
        if (l3 != null) {
            avVar.b(6, l3.longValue());
        }
        Long l4 = this.f5545i;
        if (l4 != null) {
            avVar.b(7, l4.longValue());
        }
        String str5 = this.f5546j;
        if (str5 != null) {
            avVar.a(8, str5);
        }
        Long l5 = this.f5547k;
        if (l5 != null) {
            avVar.b(9, l5.longValue());
        }
        String str6 = this.f5548l;
        if (str6 != null) {
            avVar.a(10, str6);
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        String str = this.f5539c;
        if (str != null) {
            c2 += av.b(1, str);
        }
        Long l2 = this.f5540d;
        if (l2 != null) {
            c2 += av.c(2, l2.longValue());
        }
        String str2 = this.f5541e;
        if (str2 != null) {
            c2 += av.b(3, str2);
        }
        String str3 = this.f5542f;
        if (str3 != null) {
            c2 += av.b(4, str3);
        }
        String str4 = this.f5543g;
        if (str4 != null) {
            c2 += av.b(5, str4);
        }
        Long l3 = this.f5544h;
        if (l3 != null) {
            c2 += av.c(6, l3.longValue());
        }
        Long l4 = this.f5545i;
        if (l4 != null) {
            c2 += av.c(7, l4.longValue());
        }
        String str5 = this.f5546j;
        if (str5 != null) {
            c2 += av.b(8, str5);
        }
        Long l5 = this.f5547k;
        if (l5 != null) {
            c2 += av.c(9, l5.longValue());
        }
        String str6 = this.f5548l;
        return str6 != null ? c2 + av.b(10, str6) : c2;
    }
}
