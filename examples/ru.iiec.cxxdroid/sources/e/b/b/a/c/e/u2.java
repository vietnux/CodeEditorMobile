package e.b.b.a.c.e;

final class u2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ p5 f7607b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ s f7608c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f2 f7609d;

    u2(f2 f2Var, p5 p5Var, s sVar) {
        this.f7609d = f2Var;
        this.f7607b = p5Var;
        this.f7608c = sVar;
    }

    public final void run() {
        f2.a(this.f7609d).p();
        f2.a(this.f7609d).a(this.f7607b, this.f7608c);
    }
}
