package com.google.android.gms.internal.ads;

public final class vv extends cv<vv> {

    /* renamed from: c  reason: collision with root package name */
    public String f5849c = null;

    /* renamed from: d  reason: collision with root package name */
    public Long f5850d = null;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f5851e = null;

    public vv() {
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
                this.f5849c = yuVar.c();
            } else if (d2 == 16) {
                this.f5850d = Long.valueOf(yuVar.e());
            } else if (d2 == 24) {
                this.f5851e = Boolean.valueOf(yuVar.g());
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        String str = this.f5849c;
        if (str != null) {
            avVar.a(1, str);
        }
        Long l2 = this.f5850d;
        if (l2 != null) {
            avVar.b(2, l2.longValue());
        }
        Boolean bool = this.f5851e;
        if (bool != null) {
            avVar.a(3, bool.booleanValue());
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        String str = this.f5849c;
        if (str != null) {
            c2 += av.b(1, str);
        }
        Long l2 = this.f5850d;
        if (l2 != null) {
            c2 += av.c(2, l2.longValue());
        }
        Boolean bool = this.f5851e;
        if (bool == null) {
            return c2;
        }
        bool.booleanValue();
        return c2 + av.b(3) + 1;
    }
}
