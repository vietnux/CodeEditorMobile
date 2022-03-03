package e.b.b.a.e;

final class r implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ g f7802b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ q f7803c;

    r(q qVar, g gVar) {
        this.f7803c = qVar;
        this.f7802b = gVar;
    }

    public final void run() {
        synchronized (q.a(this.f7803c)) {
            if (q.b(this.f7803c) != null) {
                q.b(this.f7803c).a(this.f7802b.a());
            }
        }
    }
}
