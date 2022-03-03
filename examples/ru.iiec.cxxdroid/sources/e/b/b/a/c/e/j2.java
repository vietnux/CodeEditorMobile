package e.b.b.a.c.e;

final class j2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ w f7348b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f2 f7349c;

    j2(f2 f2Var, w wVar) {
        this.f7349c = f2Var;
        this.f7348b = wVar;
    }

    public final void run() {
        f2.a(this.f7349c).p();
        j5 a = f2.a(this.f7349c);
        w wVar = this.f7348b;
        s a2 = a.a(wVar.f7635b);
        if (a2 != null) {
            a.b(wVar, a2);
        }
    }
}
