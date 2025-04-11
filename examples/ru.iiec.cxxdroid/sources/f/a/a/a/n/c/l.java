package f.a.a.a.n.c;

import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class l extends ThreadPoolExecutor {
    private static final int a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b  reason: collision with root package name */
    private static final int f8485b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f8486c;

    /* access modifiers changed from: protected */
    public static final class a implements ThreadFactory {
        private final int a;

        public a(int i2) {
            this.a = i2;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.a);
            thread.setName("Queue");
            return thread;
        }
    }

    static {
        int i2 = a;
        f8485b = i2 + 1;
        f8486c = (i2 * 2) + 1;
    }

    <T extends Runnable & c & m & j> l(int i2, int i3, long j2, TimeUnit timeUnit, d<T> dVar, ThreadFactory threadFactory) {
        super(i2, i3, j2, timeUnit, dVar, threadFactory);
        prestartAllCoreThreads();
    }

    public static l a() {
        return a(f8485b, f8486c);
    }

    public static <T extends Runnable & c & m & j> l a(int i2, int i3) {
        return new l(i2, i3, 1, TimeUnit.SECONDS, new d(), new a(10));
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        m mVar = (m) runnable;
        mVar.a(true);
        mVar.a(th);
        getQueue().b();
        super.afterExecute(runnable, th);
    }

    @TargetApi(9)
    public void execute(Runnable runnable) {
        if (!k.b(runnable)) {
            runnable = newTaskFor(runnable, null);
        }
        super.execute(runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public d getQueue() {
        return (d) super.getQueue();
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new i(runnable, t);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new i(callable);
    }
}
