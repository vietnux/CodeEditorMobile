package e.b.b.a.c.e;

/* access modifiers changed from: package-private */
public final class m4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f7439b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ p5 f7440c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ s f7441d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ a4 f7442e;

    m4(a4 a4Var, boolean z, p5 p5Var, s sVar) {
        this.f7442e = a4Var;
        this.f7439b = z;
        this.f7440c = p5Var;
        this.f7441d = sVar;
    }

    public final void run() {
        r0 d2 = a4.d(this.f7442e);
        if (d2 == null) {
            this.f7442e.a().y().a("Discarding data. Failed to set user attribute");
            return;
        }
        this.f7442e.a(d2, this.f7439b ? null : this.f7440c, this.f7441d);
        a4.e(this.f7442e);
    }
}
