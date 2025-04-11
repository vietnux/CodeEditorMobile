package com.google.android.gms.internal.ads;

public final class l30 extends cv<l30> {

    /* renamed from: c  reason: collision with root package name */
    private Integer f4844c = null;

    /* renamed from: d  reason: collision with root package name */
    private Integer f4845d = null;

    public l30() {
        this.f4045b = null;
        this.a = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.l30 b(com.google.android.gms.internal.ads.yu r7) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l30.b(com.google.android.gms.internal.ads.yu):com.google.android.gms.internal.ads.l30");
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv a(yu yuVar) {
        b(yuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final void a(av avVar) {
        Integer num = this.f4844c;
        if (num != null) {
            avVar.b(1, num.intValue());
        }
        Integer num2 = this.f4845d;
        if (num2 != null) {
            avVar.b(2, num2.intValue());
        }
        super.a(avVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.iv
    public final int c() {
        int c2 = super.c();
        Integer num = this.f4844c;
        if (num != null) {
            c2 += av.c(1, num.intValue());
        }
        Integer num2 = this.f4845d;
        return num2 != null ? c2 + av.c(2, num2.intValue()) : c2;
    }
}
