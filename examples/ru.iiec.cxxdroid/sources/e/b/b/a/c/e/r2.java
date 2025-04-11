package e.b.b.a.c.e;

final class r2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ n0 f7539b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7540c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f2 f7541d;

    r2(f2 f2Var, n0 n0Var, String str) {
        this.f7541d = f2Var;
        this.f7539b = n0Var;
        this.f7540c = str;
    }

    public final void run() {
        f2.a(this.f7541d).p();
        f2.a(this.f7541d).b(this.f7539b, this.f7540c);
    }
}
