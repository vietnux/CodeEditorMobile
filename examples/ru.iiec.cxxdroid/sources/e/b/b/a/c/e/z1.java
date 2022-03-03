package e.b.b.a.c.e;

import android.os.Looper;
import com.google.android.gms.common.internal.y;
import java.lang.Thread;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class z1 extends z2 {

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicLong f7725m = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c  reason: collision with root package name */
    private ExecutorService f7726c;

    /* renamed from: d  reason: collision with root package name */
    private c2 f7727d;

    /* renamed from: e  reason: collision with root package name */
    private c2 f7728e;

    /* renamed from: f  reason: collision with root package name */
    private final PriorityBlockingQueue<b2<?>> f7729f = new PriorityBlockingQueue<>();

    /* renamed from: g  reason: collision with root package name */
    private final BlockingQueue<b2<?>> f7730g = new LinkedBlockingQueue();

    /* renamed from: h  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f7731h = new a2(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: i  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f7732i = new a2(this, "Thread death: Uncaught exception on network thread");

    /* renamed from: j  reason: collision with root package name */
    private final Object f7733j = new Object();

    /* renamed from: k  reason: collision with root package name */
    private final Semaphore f7734k = new Semaphore(2);

    /* renamed from: l  reason: collision with root package name */
    private volatile boolean f7735l;

    z1(d2 d2Var) {
        super(d2Var);
    }

    public static boolean A() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private final void a(b2<?> b2Var) {
        synchronized (this.f7733j) {
            this.f7729f.add(b2Var);
            if (this.f7727d == null) {
                this.f7727d = new c2(this, "Measurement Worker", this.f7729f);
                this.f7727d.setUncaughtExceptionHandler(this.f7731h);
                this.f7727d.start();
            } else {
                this.f7727d.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final <T> T a(AtomicReference<T> atomicReference, long j2, String str, Runnable runnable) {
        synchronized (atomicReference) {
            c().a(runnable);
            try {
                atomicReference.wait(15000);
            } catch (InterruptedException unused) {
                b1 B = a().B();
                String valueOf = String.valueOf(str);
                B.a(valueOf.length() != 0 ? "Interrupted waiting for ".concat(valueOf) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            b1 B2 = a().B();
            String valueOf2 = String.valueOf(str);
            B2.a(valueOf2.length() != 0 ? "Timed out waiting for ".concat(valueOf2) : new String("Timed out waiting for "));
        }
        return t;
    }

    public final <V> Future<V> a(Callable<V> callable) {
        t();
        y.a(callable);
        b2<?> b2Var = new b2<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f7727d) {
            if (!this.f7729f.isEmpty()) {
                a().B().a("Callable skipped the worker queue.");
            }
            b2Var.run();
        } else {
            a(b2Var);
        }
        return b2Var;
    }

    public final void a(Runnable runnable) {
        t();
        y.a(runnable);
        a(new b2<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final <V> Future<V> b(Callable<V> callable) {
        t();
        y.a(callable);
        b2<?> b2Var = new b2<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f7727d) {
            b2Var.run();
        } else {
            a(b2Var);
        }
        return b2Var;
    }

    public final void b(Runnable runnable) {
        t();
        y.a(runnable);
        b2<?> b2Var = new b2<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f7733j) {
            this.f7730g.add(b2Var);
            if (this.f7728e == null) {
                this.f7728e = new c2(this, "Measurement Network", this.f7730g);
                this.f7728e.setUncaughtExceptionHandler(this.f7732i);
                this.f7728e.start();
            } else {
                this.f7728e.a();
            }
        }
    }

    @Override // e.b.b.a.c.e.y2
    public final void d() {
        if (Thread.currentThread() != this.f7727d) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // e.b.b.a.c.e.y2
    public final void f() {
        if (Thread.currentThread() != this.f7728e) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.z2
    public final boolean u() {
        return false;
    }

    public final boolean y() {
        return Thread.currentThread() == this.f7727d;
    }

    /* access modifiers changed from: package-private */
    public final ExecutorService z() {
        ExecutorService executorService;
        synchronized (this.f7733j) {
            if (this.f7726c == null) {
                this.f7726c = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.f7726c;
        }
        return executorService;
    }
}
