package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
@k2
public final class mf implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private we f4951b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4952c = false;

    mf(we weVar) {
        this.f4951b = weVar;
    }

    private final void c() {
        u9.f5718h.removeCallbacks(this);
        u9.f5718h.postDelayed(this, 250);
    }

    public final void a() {
        this.f4952c = true;
    }

    public final void b() {
        this.f4952c = false;
        c();
    }

    public final void run() {
        if (!this.f4952c) {
            this.f4951b.o();
            c();
        }
    }
}
