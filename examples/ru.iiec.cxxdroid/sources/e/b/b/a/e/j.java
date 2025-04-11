package e.b.b.a.e;

import com.google.android.gms.common.internal.y;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class j {

    /* access modifiers changed from: private */
    public static final class a implements b {
        private final CountDownLatch a;

        private a() {
            this.a = new CountDownLatch(1);
        }

        /* synthetic */ a(y yVar) {
            this();
        }

        @Override // e.b.b.a.e.b
        public final void a() {
            this.a.countDown();
        }

        @Override // e.b.b.a.e.d
        public final void a(Exception exc) {
            this.a.countDown();
        }

        @Override // e.b.b.a.e.e
        public final void a(Object obj) {
            this.a.countDown();
        }

        public final boolean a(long j2, TimeUnit timeUnit) {
            return this.a.await(j2, timeUnit);
        }

        public final void b() {
            this.a.await();
        }
    }

    /* access modifiers changed from: package-private */
    public interface b extends b, d, e<Object> {
    }

    public static <TResult> g<TResult> a(Exception exc) {
        x xVar = new x();
        xVar.a(exc);
        return xVar;
    }

    public static <TResult> g<TResult> a(TResult tresult) {
        x xVar = new x();
        xVar.a((Object) tresult);
        return xVar;
    }

    public static <TResult> g<TResult> a(Executor executor, Callable<TResult> callable) {
        y.a(executor, "Executor must not be null");
        y.a(callable, "Callback must not be null");
        x xVar = new x();
        executor.execute(new y(xVar, callable));
        return xVar;
    }

    public static <TResult> TResult a(g<TResult> gVar) {
        y.a();
        y.a(gVar, "Task must not be null");
        if (gVar.d()) {
            return (TResult) b(gVar);
        }
        a aVar = new a(null);
        a((g<?>) gVar, (b) aVar);
        aVar.b();
        return (TResult) b(gVar);
    }

    public static <TResult> TResult a(g<TResult> gVar, long j2, TimeUnit timeUnit) {
        y.a();
        y.a(gVar, "Task must not be null");
        y.a(timeUnit, "TimeUnit must not be null");
        if (gVar.d()) {
            return (TResult) b(gVar);
        }
        a aVar = new a(null);
        a((g<?>) gVar, (b) aVar);
        if (aVar.a(j2, timeUnit)) {
            return (TResult) b(gVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    private static void a(g<?> gVar, b bVar) {
        gVar.a(i.f7788b, (e<? super Object>) bVar);
        gVar.a(i.f7788b, (d) bVar);
        gVar.a(i.f7788b, (b) bVar);
    }

    private static <TResult> TResult b(g<TResult> gVar) {
        if (gVar.e()) {
            return gVar.b();
        }
        if (gVar.c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(gVar.a());
    }
}
