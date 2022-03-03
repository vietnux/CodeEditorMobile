package com.google.android.gms.internal.ads;

final class g10 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f10 f4378b;

    g10(f10 f10) {
        this.f4378b = f10;
    }

    public final void run() {
        synchronized (this.f4378b.f4252d) {
            if (!(this.f4378b.f4253e) || !(this.f4378b.f4254f)) {
                qc.b("App is still foreground");
            } else {
                this.f4378b.f4253e = false;
                qc.b("App went background");
                for (h10 h10 : this.f4378b.f4255g) {
                    try {
                        h10.a(false);
                    } catch (Exception e2) {
                        qc.b("", e2);
                    }
                }
            }
        }
    }
}
