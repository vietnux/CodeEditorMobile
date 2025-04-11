package e.b.b.a.c.e;

final class h2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ w f7299b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ s f7300c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f2 f7301d;

    h2(f2 f2Var, w wVar, s sVar) {
        this.f7301d = f2Var;
        this.f7299b = wVar;
        this.f7300c = sVar;
    }

    public final void run() {
        f2.a(this.f7301d).p();
        f2.a(this.f7301d).b(this.f7299b, this.f7300c);
    }
}
