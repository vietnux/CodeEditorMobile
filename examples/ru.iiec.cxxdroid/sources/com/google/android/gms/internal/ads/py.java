package com.google.android.gms.internal.ads;

public final class py extends ez {

    /* renamed from: i  reason: collision with root package name */
    private static volatile Long f5269i;

    /* renamed from: j  reason: collision with root package name */
    private static final Object f5270j = new Object();

    public py(tx txVar, String str, String str2, xp xpVar, int i2, int i3) {
        super(txVar, str, str2, xpVar, i2, 22);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        if (f5269i == null) {
            synchronized (f5270j) {
                if (f5269i == null) {
                    f5269i = (Long) this.f4245f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f4244e) {
            this.f4244e.w = f5269i;
        }
    }
}
