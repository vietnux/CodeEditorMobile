package e.b.b.a.c.e;

/* access modifiers changed from: package-private */
public final class i3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f7318b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ c3 f7319c;

    i3(c3 c3Var, long j2) {
        this.f7319c = c3Var;
        this.f7318b = j2;
    }

    public final void run() {
        c3 c3Var = this.f7319c;
        long j2 = this.f7318b;
        c3Var.d();
        c3Var.t();
        c3Var.a().E().a("Resetting analytics data (FE)");
        c3Var.p().y();
        if (c3Var.r().j(c3Var.i().z())) {
            c3Var.q().f7380j.a(j2);
        }
        boolean s = c3Var.a.s();
        if (!c3Var.r().t()) {
            c3Var.q().d(!s);
        }
        c3Var.k().A();
        c3Var.f7200h = !s;
    }
}
