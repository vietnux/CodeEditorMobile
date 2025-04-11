package i;

import i.f0.c;
import i.x;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class n {
    private int a = 64;

    /* renamed from: b  reason: collision with root package name */
    private int f9153b = 5;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f9154c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f9155d;

    /* renamed from: e  reason: collision with root package name */
    private final Deque<x.a> f9156e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    private final Deque<x.a> f9157f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    private final Deque<x> f9158g = new ArrayDeque();

    private <T> void a(Deque<T> deque, T t, boolean z) {
        int b2;
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                if (z) {
                    c();
                }
                b2 = b();
                runnable = this.f9154c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (b2 == 0 && runnable != null) {
            runnable.run();
        }
    }

    private int b(x.a aVar) {
        int i2 = 0;
        for (x.a aVar2 : this.f9157f) {
            if (!aVar2.c().f9218f && aVar2.d().equals(aVar.d())) {
                i2++;
            }
        }
        return i2;
    }

    private void c() {
        if (this.f9157f.size() < this.a && !this.f9156e.isEmpty()) {
            Iterator<x.a> it = this.f9156e.iterator();
            while (it.hasNext()) {
                x.a next = it.next();
                if (b(next) < this.f9153b) {
                    it.remove();
                    this.f9157f.add(next);
                    a().execute(next);
                }
                if (this.f9157f.size() >= this.a) {
                    return;
                }
            }
        }
    }

    public synchronized ExecutorService a() {
        if (this.f9155d == null) {
            this.f9155d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), c.a("OkHttp Dispatcher", false));
        }
        return this.f9155d;
    }

    /* access modifiers changed from: package-private */
    public void a(x.a aVar) {
        a(this.f9157f, aVar, true);
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(x xVar) {
        this.f9158g.add(xVar);
    }

    public synchronized int b() {
        return this.f9157f.size() + this.f9158g.size();
    }

    /* access modifiers changed from: package-private */
    public void b(x xVar) {
        a(this.f9158g, xVar, false);
    }
}
