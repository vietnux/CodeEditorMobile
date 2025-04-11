package com.google.android.gms.internal.ads;

public final class zy extends ez {

    /* renamed from: i  reason: collision with root package name */
    private static volatile Long f6237i;

    /* renamed from: j  reason: collision with root package name */
    private static final Object f6238j = new Object();

    public zy(tx txVar, String str, String str2, xp xpVar, int i2, int i3) {
        super(txVar, str, str2, xpVar, i2, 33);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        if (f6237i == null) {
            synchronized (f6238j) {
                if (f6237i == null) {
                    f6237i = (Long) this.f4245f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f4244e) {
            this.f4244e.C = f6237i;
        }
    }
}
