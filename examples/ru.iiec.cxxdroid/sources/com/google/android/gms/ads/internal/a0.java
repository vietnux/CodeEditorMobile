package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.rd;

final /* synthetic */ class a0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final z f3132b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f3133c;

    a0(z zVar, Runnable runnable) {
        this.f3132b = zVar;
        this.f3133c = runnable;
    }

    public final void run() {
        rd.a.execute(new c0(this.f3132b, this.f3133c));
    }
}
