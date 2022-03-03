package e.b.b.a.c.e;

final class r4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r0 f7544b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ o4 f7545c;

    r4(o4 o4Var, r0 r0Var) {
        this.f7545c = o4Var;
        this.f7544b = r0Var;
    }

    public final void run() {
        synchronized (this.f7545c) {
            this.f7545c.a = false;
            if (!this.f7545c.f7483c.z()) {
                this.f7545c.f7483c.a().E().a("Connected to remote service");
                this.f7545c.f7483c.a(this.f7544b);
            }
        }
    }
}
