package e.b.b.a.c.e;

final class t2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ p5 f7586b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ s f7587c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f2 f7588d;

    t2(f2 f2Var, p5 p5Var, s sVar) {
        this.f7588d = f2Var;
        this.f7586b = p5Var;
        this.f7587c = sVar;
    }

    public final void run() {
        f2.a(this.f7588d).p();
        f2.a(this.f7588d).b(this.f7586b, this.f7587c);
    }
}
