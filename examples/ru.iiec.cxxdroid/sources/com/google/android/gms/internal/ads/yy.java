package com.google.android.gms.internal.ads;

public final class yy extends ez {

    /* renamed from: i  reason: collision with root package name */
    private final dy f6164i;

    /* renamed from: j  reason: collision with root package name */
    private long f6165j;

    public yy(tx txVar, String str, String str2, xp xpVar, int i2, int i3, dy dyVar) {
        super(txVar, str, str2, xpVar, i2, 53);
        this.f6164i = dyVar;
        if (dyVar != null) {
            this.f6165j = dyVar.a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        if (this.f6164i != null) {
            this.f4244e.U = (Long) this.f4245f.invoke(null, Long.valueOf(this.f6165j));
        }
    }
}
