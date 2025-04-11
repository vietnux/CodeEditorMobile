package e.b.b.a.c.e;

final class i2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ w f7315b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ s f7316c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f2 f7317d;

    i2(f2 f2Var, w wVar, s sVar) {
        this.f7317d = f2Var;
        this.f7315b = wVar;
        this.f7316c = sVar;
    }

    public final void run() {
        f2.a(this.f7317d).p();
        f2.a(this.f7317d).a(this.f7315b, this.f7316c);
    }
}
