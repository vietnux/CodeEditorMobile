package com.google.android.gms.internal.ads;

public final class iy extends ez {

    /* renamed from: i  reason: collision with root package name */
    private static volatile String f4649i;

    /* renamed from: j  reason: collision with root package name */
    private static final Object f4650j = new Object();

    public iy(tx txVar, String str, String str2, xp xpVar, int i2, int i3) {
        super(txVar, str, str2, xpVar, i2, 29);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        this.f4244e.z = "E";
        if (f4649i == null) {
            synchronized (f4650j) {
                if (f4649i == null) {
                    f4649i = (String) this.f4245f.invoke(null, this.f4241b.a());
                }
            }
        }
        synchronized (this.f4244e) {
            this.f4244e.z = bw.a(f4649i.getBytes(), true);
        }
    }
}
