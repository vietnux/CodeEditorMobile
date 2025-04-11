package e.b.b.a.c.e;

/* access modifiers changed from: package-private */
public final class t3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f7589b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ c3 f7590c;

    t3(c3 c3Var, long j2) {
        this.f7590c = c3Var;
        this.f7589b = j2;
    }

    public final void run() {
        this.f7590c.q().t.a(this.f7589b);
        this.f7590c.a().E().a("Session timeout duration set", Long.valueOf(this.f7589b));
    }
}
