package com.google.android.gms.ads.internal;

import android.os.Handler;

public final class p0 {
    private final Handler a;

    public p0(Handler handler) {
        this.a = handler;
    }

    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    public final boolean a(Runnable runnable, long j2) {
        return this.a.postDelayed(runnable, j2);
    }
}
