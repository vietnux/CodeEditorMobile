package e.b.b.a.e;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class s<TResult> implements u<TResult> {
    private final Executor a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f7804b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private e<? super TResult> f7805c;

    public s(Executor executor, e<? super TResult> eVar) {
        this.a = executor;
        this.f7805c = eVar;
    }

    @Override // e.b.b.a.e.u
    public final void a(g<TResult> gVar) {
        if (gVar.e()) {
            synchronized (this.f7804b) {
                if (this.f7805c != null) {
                    this.a.execute(new t(this, gVar));
                }
            }
        }
    }

    @Override // e.b.b.a.e.u
    public final void cancel() {
        synchronized (this.f7804b) {
            this.f7805c = null;
        }
    }
}
