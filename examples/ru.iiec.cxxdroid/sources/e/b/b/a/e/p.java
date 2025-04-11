package e.b.b.a.e;

final class p implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ g f7798b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ o f7799c;

    p(o oVar, g gVar) {
        this.f7799c = oVar;
        this.f7798b = gVar;
    }

    public final void run() {
        synchronized (o.a(this.f7799c)) {
            if (o.b(this.f7799c) != null) {
                o.b(this.f7799c).a(this.f7798b);
            }
        }
    }
}
