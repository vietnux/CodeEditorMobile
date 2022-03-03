package com.google.android.gms.internal.ads;

public final class uy extends ez {

    /* renamed from: i  reason: collision with root package name */
    private final boolean f5797i;

    public uy(tx txVar, String str, String str2, xp xpVar, int i2, int i3) {
        super(txVar, str, str2, xpVar, i2, 61);
        this.f5797i = txVar.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        long longValue = ((Long) this.f4245f.invoke(null, this.f4241b.a(), Boolean.valueOf(this.f5797i))).longValue();
        synchronized (this.f4244e) {
            this.f4244e.e0 = Long.valueOf(longValue);
        }
    }
}
