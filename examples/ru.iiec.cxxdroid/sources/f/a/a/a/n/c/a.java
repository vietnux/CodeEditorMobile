package f.a.a.a.n.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a<Params, Progress, Result> {

    /* renamed from: g  reason: collision with root package name */
    private static final int f8449g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h  reason: collision with root package name */
    private static final int f8450h;

    /* renamed from: i  reason: collision with root package name */
    private static final int f8451i;

    /* renamed from: j  reason: collision with root package name */
    private static final ThreadFactory f8452j = new ThreadFactoryC0126a();

    /* renamed from: k  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f8453k = new LinkedBlockingQueue(128);

    /* renamed from: l  reason: collision with root package name */
    public static final Executor f8454l = new ThreadPoolExecutor(f8450h, f8451i, 1, TimeUnit.SECONDS, f8453k, f8452j);

    /* renamed from: m  reason: collision with root package name */
    public static final Executor f8455m = new g(null);
    private static final f n = new f();

    /* renamed from: b  reason: collision with root package name */
    private final i<Params, Result> f8456b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final FutureTask<Result> f8457c = new c(this.f8456b);

    /* renamed from: d  reason: collision with root package name */
    private volatile h f8458d = h.PENDING;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f8459e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f8460f = new AtomicBoolean();

    /* renamed from: f.a.a.a.n.c.a$a  reason: collision with other inner class name */
    static class ThreadFactoryC0126a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        ThreadFactoryC0126a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AsyncTask #" + this.a.getAndIncrement());
        }
    }

    class b extends i<Params, Result> {
        b() {
            super(null);
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            a.this.f8460f.set(true);
            Process.setThreadPriority(10);
            a aVar = a.this;
            Result result = (Result) aVar.a(this.f8471b);
            aVar.e(result);
            return result;
        }
    }

    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            try {
                a.this.f(get());
            } catch (InterruptedException e2) {
                Log.w("AsyncTask", e2);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occured while executing doInBackground()", e3.getCause());
            } catch (CancellationException unused) {
                a.this.f(null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class d {
        static final /* synthetic */ int[] a = new int[h.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                f.a.a.a.n.c.a$h[] r0 = f.a.a.a.n.c.a.h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f.a.a.a.n.c.a.d.a = r0
                int[] r0 = f.a.a.a.n.c.a.d.a     // Catch:{ NoSuchFieldError -> 0x0014 }
                f.a.a.a.n.c.a$h r1 = f.a.a.a.n.c.a.h.RUNNING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f.a.a.a.n.c.a.d.a     // Catch:{ NoSuchFieldError -> 0x001f }
                f.a.a.a.n.c.a$h r1 = f.a.a.a.n.c.a.h.FINISHED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.n.c.a.d.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static class e<Data> {
        final a a;

        /* renamed from: b  reason: collision with root package name */
        final Data[] f8463b;

        e(a aVar, Data... dataArr) {
            this.a = aVar;
            this.f8463b = dataArr;
        }
    }

    /* access modifiers changed from: private */
    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i2 = message.what;
            if (i2 == 1) {
                eVar.a.d(eVar.f8463b[0]);
            } else if (i2 == 2) {
                eVar.a.b((Object[]) eVar.f8463b);
            }
        }
    }

    private static class g implements Executor {
        final LinkedList<Runnable> a;

        /* renamed from: b  reason: collision with root package name */
        Runnable f8464b;

        /* renamed from: f.a.a.a.n.c.a$g$a  reason: collision with other inner class name */
        class RunnableC0127a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Runnable f8465b;

            RunnableC0127a(Runnable runnable) {
                this.f8465b = runnable;
            }

            public void run() {
                try {
                    this.f8465b.run();
                } finally {
                    g.this.a();
                }
            }
        }

        private g() {
            this.a = new LinkedList<>();
        }

        /* synthetic */ g(ThreadFactoryC0126a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        public synchronized void a() {
            Runnable poll = this.a.poll();
            this.f8464b = poll;
            if (poll != null) {
                a.f8454l.execute(this.f8464b);
            }
        }

        public synchronized void execute(Runnable runnable) {
            this.a.offer(new RunnableC0127a(runnable));
            if (this.f8464b == null) {
                a();
            }
        }
    }

    public enum h {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* access modifiers changed from: private */
    public static abstract class i<Params, Result> implements Callable<Result> {

        /* renamed from: b  reason: collision with root package name */
        Params[] f8471b;

        private i() {
        }

        /* synthetic */ i(ThreadFactoryC0126a aVar) {
            this();
        }
    }

    static {
        int i2 = f8449g;
        f8450h = i2 + 1;
        f8451i = (i2 * 2) + 1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void d(Result result) {
        if (f()) {
            b(result);
        } else {
            c(result);
        }
        this.f8458d = h.FINISHED;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Result e(Result result) {
        n.obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void f(Result result) {
        if (!this.f8460f.get()) {
            e(result);
        }
    }

    public final a<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.f8458d != h.PENDING) {
            int i2 = d.a[this.f8458d.ordinal()];
            if (i2 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i2 == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f8458d = h.RUNNING;
        g();
        this.f8456b.f8471b = paramsArr;
        executor.execute(this.f8457c);
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract Result a(Params... paramsArr);

    /* access modifiers changed from: protected */
    public abstract void b(Result result);

    /* access modifiers changed from: protected */
    public void b(Progress... progressArr) {
    }

    public final boolean b(boolean z) {
        this.f8459e.set(true);
        return this.f8457c.cancel(z);
    }

    /* access modifiers changed from: protected */
    public abstract void c(Result result);

    public final h e() {
        return this.f8458d;
    }

    public final boolean f() {
        return this.f8459e.get();
    }

    /* access modifiers changed from: protected */
    public void g() {
    }
}
