package com.google.android.gms.internal.ads;

public final class wy extends ez {

    /* renamed from: i  reason: collision with root package name */
    private final StackTraceElement[] f5971i;

    public wy(tx txVar, String str, String str2, xp xpVar, int i2, int i3, StackTraceElement[] stackTraceElementArr) {
        super(txVar, str, str2, xpVar, i2, 45);
        this.f5971i = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        StackTraceElement[] stackTraceElementArr = this.f5971i;
        if (stackTraceElementArr != null) {
            int i2 = 1;
            rx rxVar = new rx((String) this.f4245f.invoke(null, stackTraceElementArr));
            synchronized (this.f4244e) {
                this.f4244e.N = rxVar.f5478b;
                if (rxVar.f5479c.booleanValue()) {
                    xp xpVar = this.f4244e;
                    if (rxVar.f5480d.booleanValue()) {
                        i2 = 0;
                    }
                    xpVar.X = Integer.valueOf(i2);
                }
            }
        }
    }
}
