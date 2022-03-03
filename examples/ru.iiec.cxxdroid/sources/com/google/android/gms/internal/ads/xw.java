package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class xw implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ww f6054b;

    xw(ww wwVar) {
        this.f6054b = wwVar;
    }

    public final void run() {
        if (this.f6054b.f5969b == null) {
            synchronized (ww.f5966c) {
                if (this.f6054b.f5969b == null) {
                    boolean booleanValue = ((Boolean) a50.g().a(k80.B1)).booleanValue();
                    if (booleanValue) {
                        try {
                            ww.f5967d = new v20(this.f6054b.a.a, "ADSHIELD", null);
                        } catch (Throwable unused) {
                            booleanValue = false;
                        }
                    }
                    this.f6054b.f5969b = Boolean.valueOf(booleanValue);
                    ww.f5966c.open();
                }
            }
        }
    }
}
