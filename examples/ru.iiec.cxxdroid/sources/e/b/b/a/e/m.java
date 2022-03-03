package e.b.b.a.e;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class m<TResult> implements u<TResult> {
    private final Executor a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f7793b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private b f7794c;

    public m(Executor executor, b bVar) {
        this.a = executor;
        this.f7794c = bVar;
    }

    @Override // e.b.b.a.e.u
    public final void a(g gVar) {
        if (gVar.c()) {
            synchronized (this.f7793b) {
                if (this.f7794c != null) {
                    this.a.execute(new n(this));
                }
            }
        }
    }

    @Override // e.b.b.a.e.u
    public final void cancel() {
        synchronized (this.f7793b) {
            this.f7794c = null;
        }
    }
}
