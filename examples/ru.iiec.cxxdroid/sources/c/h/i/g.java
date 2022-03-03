package c.h.i;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* access modifiers changed from: package-private */
public class g {

    /* access modifiers changed from: private */
    public static class a implements ThreadFactory {
        private String a;

        /* renamed from: b  reason: collision with root package name */
        private int f2347b;

        /* renamed from: c.h.i.g$a$a  reason: collision with other inner class name */
        private static class C0046a extends Thread {

            /* renamed from: b  reason: collision with root package name */
            private final int f2348b;

            C0046a(Runnable runnable, String str, int i2) {
                super(runnable, str);
                this.f2348b = i2;
            }

            public void run() {
                Process.setThreadPriority(this.f2348b);
                super.run();
            }
        }

        a(String str, int i2) {
            this.a = str;
            this.f2347b = i2;
        }

        public Thread newThread(Runnable runnable) {
            return new C0046a(runnable, this.a, this.f2347b);
        }
    }

    /* access modifiers changed from: private */
    public static class b<T> implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private Callable<T> f2349b;

        /* renamed from: c  reason: collision with root package name */
        private c.h.k.a<T> f2350c;

        /* renamed from: d  reason: collision with root package name */
        private Handler f2351d;

        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c.h.k.a f2352b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Object f2353c;

            a(b bVar, c.h.k.a aVar, Object obj) {
                this.f2352b = aVar;
                this.f2353c = obj;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: c.h.k.a */
            /* JADX WARN: Multi-variable type inference failed */
            public void run() {
                this.f2352b.a(this.f2353c);
            }
        }

        b(Handler handler, Callable<T> callable, c.h.k.a<T> aVar) {
            this.f2349b = callable;
            this.f2350c = aVar;
            this.f2351d = handler;
        }

        public void run() {
            T t;
            try {
                t = this.f2349b.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f2351d.post(new a(this, this.f2350c, t));
        }
    }

    static <T> T a(ExecutorService executorService, Callable<T> callable, int i2) {
        try {
            return executorService.submit(callable).get((long) i2, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (InterruptedException e3) {
            throw e3;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    static ThreadPoolExecutor a(String str, int i2, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i3, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static <T> void a(Executor executor, Callable<T> callable, c.h.k.a<T> aVar) {
        executor.execute(new b(b.a(), callable, aVar));
    }
}
