package com.google.android.gms.internal.ads;

public final class yr extends cv<yr> {

    /* renamed from: c  reason: collision with root package name */
    private Long f6143c = null;

    /* renamed from: d  reason: collision with root package name */
    private Long f6144d = null;

    /* renamed from: e  reason: collision with root package name */
    public Long f6145e = null;

    /* renamed from: f  reason: collision with root package name */
    public Long f6146f = null;

    /* renamed from: g  reason: collision with root package name */
    public Long f6147g = null;

    public yr() {
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
                this.f6143c = Long.valueOf(yuVar.i());
            } else if (d2 == 16) {
                this.f6144d = Long.valueOf(yuVar.i());
            } else if (d2 == 24) {
                this.f6145e = Long.valueOf(yuVar.i());
            } else if (d2 == 32) {
                this.f6146f = Long.valueOf(yuVar.i());
            } else if (d2 == 40) {
                this.f6147g = Long.valueOf(yuVar.i());
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        Long l2 = this.f6143c;
        if (l2 != null) {
            avVar.b(1, l2.longValue());
        }
        Long l3 = this.f6144d;
        if (l3 != null) {
            avVar.b(2, l3.longValue());
        }
        Long l4 = this.f6145e;
        if (l4 != null) {
            avVar.b(3, l4.longValue());
        }
        Long l5 = this.f6146f;
        if (l5 != null) {
            avVar.b(4, l5.longValue());
        }
        Long l6 = this.f6147g;
        if (l6 != null) {
            avVar.b(5, l6.longValue());
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Long l2 = this.f6143c;
        if (l2 != null) {
            c2 += av.c(1, l2.longValue());
        }
        Long l3 = this.f6144d;
        if (l3 != null) {
            c2 += av.c(2, l3.longValue());
        }
        Long l4 = this.f6145e;
        if (l4 != null) {
            c2 += av.c(3, l4.longValue());
        }
        Long l5 = this.f6146f;
        if (l5 != null) {
            c2 += av.c(4, l5.longValue());
        }
        Long l6 = this.f6147g;
        return l6 != null ? c2 + av.c(5, l6.longValue()) : c2;
    }
}
