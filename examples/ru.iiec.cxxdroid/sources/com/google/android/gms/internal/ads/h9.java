package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class h9 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ g9 f4503b;

    h9(g9 g9Var) {
        this.f4503b = g9Var;
    }

    public final void run() {
        this.f4503b.f4411b = Thread.currentThread();
        this.f4503b.d();
    }
}
