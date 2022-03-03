package com.google.android.gms.internal.ads;

public final class az extends ez {
    public az(tx txVar, String str, String str2, xp xpVar, int i2, int i3) {
        super(txVar, str, str2, xpVar, i2, 48);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        xp xpVar;
        int i2;
        this.f4244e.Q = 2;
        boolean booleanValue = ((Boolean) this.f4245f.invoke(null, this.f4241b.a())).booleanValue();
        synchronized (this.f4244e) {
            if (booleanValue) {
                xpVar = this.f4244e;
                i2 = 1;
            } else {
                xpVar = this.f4244e;
                i2 = 0;
            }
            xpVar.Q = i2;
        }
    }
}
