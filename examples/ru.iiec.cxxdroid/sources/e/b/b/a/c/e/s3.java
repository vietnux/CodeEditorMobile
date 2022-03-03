package e.b.b.a.c.e;

/* access modifiers changed from: package-private */
public final class s3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f7577b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ c3 f7578c;

    s3(c3 c3Var, long j2) {
        this.f7578c = c3Var;
        this.f7577b = j2;
    }

    public final void run() {
        this.f7578c.q().s.a(this.f7577b);
        this.f7578c.a().E().a("Minimum session duration set", Long.valueOf(this.f7577b));
    }
}
