package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class y40 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final bc0 f6072b;

    /* renamed from: c  reason: collision with root package name */
    private final di0 f6073c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f6074d;

    public y40(y20 y20, bc0 bc0, di0 di0, Runnable runnable) {
        this.f6072b = bc0;
        this.f6073c = di0;
        this.f6074d = runnable;
    }

    public final void run() {
        this.f6072b.j();
        if (this.f6073c.f4117c == null) {
            this.f6072b.a((Object) this.f6073c.a);
        } else {
            this.f6072b.a(this.f6073c.f4117c);
        }
        if (this.f6073c.f4118d) {
            this.f6072b.a("intermediate-response");
        } else {
            this.f6072b.b("done");
        }
        Runnable runnable = this.f6074d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
