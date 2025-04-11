package com.google.android.gms.internal.ads;

import android.content.Context;

/* access modifiers changed from: package-private */
public final class w9 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5898b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ u9 f5899c;

    w9(u9 u9Var, Context context) {
        this.f5899c = u9Var;
        this.f5898b = context;
    }

    public final void run() {
        synchronized (this.f5899c.a) {
            this.f5899c.f5720c = u9.d(this.f5898b);
            this.f5899c.a.notifyAll();
        }
    }
}
