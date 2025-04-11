package e.b.b.a.e;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class k<TResult, TContinuationResult> implements u<TResult> {
    private final Executor a;

    /* renamed from: b  reason: collision with root package name */
    private final a<TResult, TContinuationResult> f7789b;

    /* renamed from: c  reason: collision with root package name */
    private final x<TContinuationResult> f7790c;

    public k(Executor executor, a<TResult, TContinuationResult> aVar, x<TContinuationResult> xVar) {
        this.a = executor;
        this.f7789b = aVar;
        this.f7790c = xVar;
    }

    @Override // e.b.b.a.e.u
    public final void a(g<TResult> gVar) {
        this.a.execute(new l(this, gVar));
    }

    @Override // e.b.b.a.e.u
    public final void cancel() {
        throw new UnsupportedOperationException();
    }
}
