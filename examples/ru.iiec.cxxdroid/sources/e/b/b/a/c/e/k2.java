package e.b.b.a.c.e;

final class k2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ w f7384b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f2 f7385c;

    k2(f2 f2Var, w wVar) {
        this.f7385c = f2Var;
        this.f7384b = wVar;
    }

    public final void run() {
        f2.a(this.f7385c).p();
        j5 a = f2.a(this.f7385c);
        w wVar = this.f7384b;
        s a2 = a.a(wVar.f7635b);
        if (a2 != null) {
            a.a(wVar, a2);
        }
    }
}
