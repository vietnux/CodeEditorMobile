package com.google.android.gms.internal.ads;

public final class my extends ez {

    /* renamed from: i  reason: collision with root package name */
    private long f5004i;

    public my(tx txVar, String str, String str2, xp xpVar, long j2, int i2, int i3) {
        super(txVar, str, str2, xpVar, i2, 25);
        this.f5004i = j2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        long longValue = ((Long) this.f4245f.invoke(null, new Object[0])).longValue();
        synchronized (this.f4244e) {
            this.f4244e.r0 = Long.valueOf(longValue);
            if (this.f5004i != 0) {
                this.f4244e.s = Long.valueOf(longValue - this.f5004i);
                this.f4244e.x = Long.valueOf(this.f5004i);
            }
        }
    }
}
