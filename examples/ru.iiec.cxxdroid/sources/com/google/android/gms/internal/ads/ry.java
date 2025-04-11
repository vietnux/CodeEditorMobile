package com.google.android.gms.internal.ads;

public final class ry extends ez {

    /* renamed from: i  reason: collision with root package name */
    private static volatile String f5481i;

    /* renamed from: j  reason: collision with root package name */
    private static final Object f5482j = new Object();

    public ry(tx txVar, String str, String str2, xp xpVar, int i2, int i3) {
        super(txVar, str, str2, xpVar, i2, 1);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        this.f4244e.f6026c = "E";
        if (f5481i == null) {
            synchronized (f5482j) {
                if (f5481i == null) {
                    f5481i = (String) this.f4245f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f4244e) {
            this.f4244e.f6026c = f5481i;
        }
    }
}
