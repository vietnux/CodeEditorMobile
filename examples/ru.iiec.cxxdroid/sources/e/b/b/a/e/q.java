package e.b.b.a.e;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class q<TResult> implements u<TResult> {
    private final Executor a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f7800b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private d f7801c;

    public q(Executor executor, d dVar) {
        this.a = executor;
        this.f7801c = dVar;
    }

    @Override // e.b.b.a.e.u
    public final void a(g<TResult> gVar) {
        if (!gVar.e() && !gVar.c()) {
            synchronized (this.f7800b) {
                if (this.f7801c != null) {
                    this.a.execute(new r(this, gVar));
                }
            }
        }
    }

    @Override // e.b.b.a.e.u
    public final void cancel() {
        synchronized (this.f7800b) {
            this.f7801c = null;
        }
    }
}
