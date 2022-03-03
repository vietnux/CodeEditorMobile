package com.google.android.gms.internal.ads;

public final class ly extends ez {

    /* renamed from: i  reason: collision with root package name */
    private static volatile Long f4908i;

    /* renamed from: j  reason: collision with root package name */
    private static final Object f4909j = new Object();

    public ly(tx txVar, String str, String str2, xp xpVar, int i2, int i3) {
        super(txVar, str, str2, xpVar, i2, 44);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        if (f4908i == null) {
            synchronized (f4909j) {
                if (f4908i == null) {
                    f4908i = (Long) this.f4245f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f4244e) {
            this.f4244e.M = f4908i;
        }
    }
}
