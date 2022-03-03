package e.b.b.a.c.e;

/* access modifiers changed from: package-private */
public final class g0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a3 f7267b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f0 f7268c;

    g0(f0 f0Var, a3 a3Var) {
        this.f7268c = f0Var;
        this.f7267b = a3Var;
    }

    public final void run() {
        this.f7267b.c();
        if (z1.A()) {
            this.f7267b.c().a(this);
            return;
        }
        boolean c2 = this.f7268c.c();
        this.f7268c.f7246c = 0;
        if (c2) {
            this.f7268c.b();
        }
    }
}
