package e.b.b.a.e;

import android.app.Activity;
import java.util.concurrent.Executor;

public abstract class g<TResult> {
    public abstract g<TResult> a(Activity activity, c<TResult> cVar);

    public abstract g<TResult> a(c<TResult> cVar);

    public abstract <TContinuationResult> g<TContinuationResult> a(Executor executor, a<TResult, TContinuationResult> aVar);

    public abstract g<TResult> a(Executor executor, b bVar);

    public abstract g<TResult> a(Executor executor, d dVar);

    public abstract g<TResult> a(Executor executor, e<? super TResult> eVar);

    public abstract Exception a();

    public abstract <X extends Throwable> TResult a(Class<X> cls);

    public abstract TResult b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();
}
