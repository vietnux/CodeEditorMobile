package com.google.android.gms.internal.ads;

public final class sy extends ez {
    public sy(tx txVar, String str, String str2, xp xpVar, int i2, int i3) {
        super(txVar, str, str2, xpVar, i2, 3);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        synchronized (this.f4244e) {
            gx gxVar = new gx((String) this.f4245f.invoke(null, this.f4241b.a()));
            synchronized (this.f4244e) {
                this.f4244e.f6028e = Long.valueOf(gxVar.f4456b);
                this.f4244e.d0 = Long.valueOf(gxVar.f4457c);
            }
        }
    }
}
