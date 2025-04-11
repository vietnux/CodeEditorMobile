package com.google.android.gms.common.util.u;

import android.os.Process;

final class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f3726b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3727c;

    public b(Runnable runnable, int i2) {
        this.f3726b = runnable;
        this.f3727c = i2;
    }

    public final void run() {
        Process.setThreadPriority(this.f3727c);
        this.f3726b.run();
    }
}
