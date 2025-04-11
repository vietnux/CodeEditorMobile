package com.google.android.gms.internal.ads;

final class g4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r8 f4385b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f4 f4386c;

    g4(f4 f4Var, r8 r8Var) {
        this.f4386c = f4Var;
        this.f4385b = r8Var;
    }

    public final void run() {
        this.f4386c.f4273d.a(this.f4385b);
        if (this.f4386c.f4277h != null) {
            this.f4386c.f4277h.c();
            this.f4386c.f4277h = null;
        }
    }
}
