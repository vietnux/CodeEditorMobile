package e.b.b.a.e;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class o<TResult> implements u<TResult> {
    private final Executor a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f7796b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private c<TResult> f7797c;

    public o(Executor executor, c<TResult> cVar) {
        this.a = executor;
        this.f7797c = cVar;
    }

    @Override // e.b.b.a.e.u
    public final void a(g<TResult> gVar) {
        synchronized (this.f7796b) {
            if (this.f7797c != null) {
                this.a.execute(new p(this, gVar));
            }
        }
    }

    @Override // e.b.b.a.e.u
    public final void cancel() {
        synchronized (this.f7796b) {
            this.f7797c = null;
        }
    }
}
