package i;

import i.f0.c;
import i.f0.f.d;
import i.f0.f.g;
import i.f0.k.f;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class j {

    /* renamed from: g  reason: collision with root package name */
    private static final Executor f9125g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), c.a("OkHttp ConnectionPool", true));
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9126b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f9127c;

    /* renamed from: d  reason: collision with root package name */
    private final Deque<i.f0.f.c> f9128d;

    /* renamed from: e  reason: collision with root package name */
    final d f9129e;

    /* renamed from: f  reason: collision with root package name */
    boolean f9130f;

    class a implements Runnable {
        a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
            L_0x0000:
                i.j r0 = i.j.this
                long r1 = java.lang.System.nanoTime()
                long r0 = r0.a(r1)
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0011
                return
            L_0x0011:
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0000
                r2 = 1000000(0xf4240, double:4.940656E-318)
                long r4 = r0 / r2
                long r2 = r2 * r4
                long r0 = r0 - r2
                i.j r2 = i.j.this
                monitor-enter(r2)
                i.j r3 = i.j.this     // Catch:{ InterruptedException -> 0x002b }
                int r1 = (int) r0     // Catch:{ InterruptedException -> 0x002b }
                r3.wait(r4, r1)     // Catch:{ InterruptedException -> 0x002b }
                goto L_0x002b
            L_0x0029:
                r0 = move-exception
                goto L_0x002d
            L_0x002b:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x0000
            L_0x002d:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i.j.a.run():void");
        }
    }

    public j() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public j(int i2, long j2, TimeUnit timeUnit) {
        this.f9127c = new a();
        this.f9128d = new ArrayDeque();
        this.f9129e = new d();
        this.a = i2;
        this.f9126b = timeUnit.toNanos(j2);
        if (j2 <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j2);
        }
    }

    private int a(i.f0.f.c cVar, long j2) {
        List<Reference<g>> list = cVar.n;
        int i2 = 0;
        while (i2 < list.size()) {
            Reference<g> reference = list.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                f.d().a("A connection to " + cVar.c().a().k() + " was leaked. Did you forget to close a response body?", ((g.a) reference).a);
                list.remove(i2);
                cVar.f8868k = true;
                if (list.isEmpty()) {
                    cVar.o = j2 - this.f9126b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    public long a(long j2) {
        synchronized (this) {
            long j3 = Long.MIN_VALUE;
            i.f0.f.c cVar = null;
            int i2 = 0;
            int i3 = 0;
            for (i.f0.f.c cVar2 : this.f9128d) {
                if (a(cVar2, j2) > 0) {
                    i3++;
                } else {
                    i2++;
                    long j4 = j2 - cVar2.o;
                    if (j4 > j3) {
                        cVar = cVar2;
                        j3 = j4;
                    }
                }
            }
            if (j3 < this.f9126b) {
                if (i2 <= this.a) {
                    if (i2 > 0) {
                        return this.f9126b - j3;
                    } else if (i3 > 0) {
                        return this.f9126b;
                    } else {
                        this.f9130f = false;
                        return -1;
                    }
                }
            }
            this.f9128d.remove(cVar);
            c.a(cVar.d());
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public i.f0.f.c a(a aVar, g gVar, c0 c0Var) {
        for (i.f0.f.c cVar : this.f9128d) {
            if (cVar.a(aVar, c0Var)) {
                gVar.a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Socket a(a aVar, g gVar) {
        for (i.f0.f.c cVar : this.f9128d) {
            if (cVar.a(aVar, null) && cVar.b() && cVar != gVar.b()) {
                return gVar.a(cVar);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean a(i.f0.f.c cVar) {
        if (cVar.f8868k || this.a == 0) {
            this.f9128d.remove(cVar);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b(i.f0.f.c cVar) {
        if (!this.f9130f) {
            this.f9130f = true;
            f9125g.execute(this.f9127c);
        }
        this.f9128d.add(cVar);
    }
}
