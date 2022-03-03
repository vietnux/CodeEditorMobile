package com.google.android.gms.internal.ads;

public final class p30 extends cv<p30> {

    /* renamed from: c  reason: collision with root package name */
    private Integer f5212c = null;

    /* renamed from: d  reason: collision with root package name */
    private Integer f5213d = null;

    public p30() {
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
            if (d2 == 8) {
                this.f5212c = Integer.valueOf(yuVar.h());
            } else if (d2 == 16) {
                this.f5213d = Integer.valueOf(yuVar.h());
            } else if (!super.a(yuVar, d2)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        Integer num = this.f5212c;
        if (num != null) {
            avVar.b(1, num.intValue());
        }
        Integer num2 = this.f5213d;
        if (num2 != null) {
            avVar.b(2, num2.intValue());
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Integer num = this.f5212c;
        if (num != null) {
            c2 += av.c(1, num.intValue());
        }
        Integer num2 = this.f5213d;
        return num2 != null ? c2 + av.c(2, num2.intValue()) : c2;
    }
}
