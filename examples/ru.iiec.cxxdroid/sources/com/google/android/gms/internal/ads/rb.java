package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.y;

@k2
public final class rb {
    private HandlerThread a = null;

    /* renamed from: b  reason: collision with root package name */
    private Handler f5430b = null;

    /* renamed from: c  reason: collision with root package name */
    private int f5431c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final Object f5432d = new Object();

    public final Handler a() {
        return this.f5430b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.f5432d) {
            if (this.f5431c != 0) {
                y.a(this.a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.a == null) {
                l9.e("Starting the looper thread.");
                this.a = new HandlerThread("LooperProvider");
                this.a.start();
                this.f5430b = new Handler(this.a.getLooper());
                l9.e("Looper thread started.");
            } else {
                l9.e("Resuming the looper thread");
                this.f5432d.notifyAll();
            }
            this.f5431c++;
            looper = this.a.getLooper();
        }
        return looper;
    }
}
