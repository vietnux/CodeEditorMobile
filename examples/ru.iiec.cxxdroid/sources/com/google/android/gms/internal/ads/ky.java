package com.google.android.gms.internal.ads;

public final class ky extends ez {
    public ky(tx txVar, String str, String str2, xp xpVar, int i2, int i3) {
        super(txVar, str, str2, xpVar, i2, 5);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        this.f4244e.f6030g = -1L;
        this.f4244e.f6031h = -1L;
        int[] iArr = (int[]) this.f4245f.invoke(null, this.f4241b.a());
        synchronized (this.f4244e) {
            this.f4244e.f6030g = Long.valueOf((long) iArr[0]);
            this.f4244e.f6031h = Long.valueOf((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.f4244e.c0 = Long.valueOf((long) iArr[2]);
            }
        }
    }
}
