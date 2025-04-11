package e.b.b.a.c.e;

final class p4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r0 f7506b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ o4 f7507c;

    p4(o4 o4Var, r0 r0Var) {
        this.f7507c = o4Var;
        this.f7506b = r0Var;
    }

    public final void run() {
        synchronized (this.f7507c) {
            this.f7507c.a = false;
            if (!this.f7507c.f7483c.z()) {
                this.f7507c.f7483c.a().F().a("Connected to service");
                this.f7507c.f7483c.a(this.f7506b);
            }
        }
    }
}
