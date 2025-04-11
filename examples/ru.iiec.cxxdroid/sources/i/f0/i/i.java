package i.f0.i;

import j.e;
import j.r;
import j.s;
import j.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

public final class i {
    long a = 0;

    /* renamed from: b  reason: collision with root package name */
    long f9052b;

    /* renamed from: c  reason: collision with root package name */
    final int f9053c;

    /* renamed from: d  reason: collision with root package name */
    final g f9054d;

    /* renamed from: e  reason: collision with root package name */
    private List<c> f9055e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9056f;

    /* renamed from: g  reason: collision with root package name */
    private final b f9057g;

    /* renamed from: h  reason: collision with root package name */
    final a f9058h;

    /* renamed from: i  reason: collision with root package name */
    final c f9059i = new c();

    /* renamed from: j  reason: collision with root package name */
    final c f9060j = new c();

    /* renamed from: k  reason: collision with root package name */
    b f9061k = null;

    /* access modifiers changed from: package-private */
    public final class a implements r {

        /* renamed from: b  reason: collision with root package name */
        private final j.c f9062b = new j.c();

        /* renamed from: c  reason: collision with root package name */
        boolean f9063c;

        /* renamed from: d  reason: collision with root package name */
        boolean f9064d;

        a() {
        }

        /* JADX INFO: finally extract failed */
        private void a(boolean z) {
            long min;
            synchronized (i.this) {
                i.this.f9060j.g();
                while (i.this.f9052b <= 0 && !this.f9064d && !this.f9063c && i.this.f9061k == null) {
                    try {
                        i.this.k();
                    } catch (Throwable th) {
                        i.this.f9060j.k();
                        throw th;
                    }
                }
                i.this.f9060j.k();
                i.this.b();
                min = Math.min(i.this.f9052b, this.f9062b.t());
                i.this.f9052b -= min;
            }
            i.this.f9060j.g();
            try {
                i.this.f9054d.a(i.this.f9053c, z && min == this.f9062b.t(), this.f9062b, min);
            } finally {
                i.this.f9060j.k();
            }
        }

        @Override // j.r
        public void a(j.c cVar, long j2) {
            this.f9062b.a(cVar, j2);
            while (this.f9062b.t() >= 16384) {
                a(false);
            }
        }

        @Override // j.r
        public t b() {
            return i.this.f9060j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.f9062b.t() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.f9062b.t() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            r0 = r8.f9065e;
            r0.f9054d.a(r0.f9053c, true, (j.c) null, 0L);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            r2 = r8.f9065e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f9063c = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
            r8.f9065e.f9054d.flush();
            r8.f9065e.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f9065e.f9058h.f9064d != false) goto L_0x003a;
         */
        @Override // java.io.Closeable, java.lang.AutoCloseable, j.r
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r8 = this;
                i.f0.i.i r0 = i.f0.i.i.this
                monitor-enter(r0)
                boolean r1 = r8.f9063c     // Catch:{ all -> 0x0050 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                i.f0.i.i r0 = i.f0.i.i.this
                i.f0.i.i$a r0 = r0.f9058h
                boolean r0 = r0.f9064d
                r1 = 1
                if (r0 != 0) goto L_0x003a
                j.c r0 = r8.f9062b
                long r2 = r0.t()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                j.c r0 = r8.f9062b
                long r2 = r0.t()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003a
                r8.a(r1)
                goto L_0x001f
            L_0x002d:
                i.f0.i.i r0 = i.f0.i.i.this
                i.f0.i.g r2 = r0.f9054d
                int r3 = r0.f9053c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.a(r3, r4, r5, r6)
            L_0x003a:
                i.f0.i.i r2 = i.f0.i.i.this
                monitor-enter(r2)
                r8.f9063c = r1     // Catch:{ all -> 0x004d }
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                i.f0.i.i r0 = i.f0.i.i.this
                i.f0.i.g r0 = r0.f9054d
                r0.flush()
                i.f0.i.i r0 = i.f0.i.i.this
                r0.a()
                return
            L_0x004d:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0050:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: i.f0.i.i.a.close():void");
        }

        @Override // j.r, java.io.Flushable
        public void flush() {
            synchronized (i.this) {
                i.this.b();
            }
            while (this.f9062b.t() > 0) {
                a(false);
                i.this.f9054d.flush();
            }
        }
    }

    /* access modifiers changed from: private */
    public final class b implements s {

        /* renamed from: b  reason: collision with root package name */
        private final j.c f9066b = new j.c();

        /* renamed from: c  reason: collision with root package name */
        private final j.c f9067c = new j.c();

        /* renamed from: d  reason: collision with root package name */
        private final long f9068d;

        /* renamed from: e  reason: collision with root package name */
        boolean f9069e;

        /* renamed from: f  reason: collision with root package name */
        boolean f9070f;

        b(long j2) {
            this.f9068d = j2;
        }

        private void c() {
            if (!this.f9069e) {
                b bVar = i.this.f9061k;
                if (bVar != null) {
                    throw new n(bVar);
                }
                return;
            }
            throw new IOException("stream closed");
        }

        private void l() {
            i.this.f9059i.g();
            while (this.f9067c.t() == 0 && !this.f9070f && !this.f9069e && i.this.f9061k == null) {
                try {
                    i.this.k();
                } finally {
                    i.this.f9059i.k();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(e eVar, long j2) {
            boolean z;
            boolean z2;
            boolean z3;
            while (j2 > 0) {
                synchronized (i.this) {
                    z = this.f9070f;
                    z2 = true;
                    z3 = this.f9067c.t() + j2 > this.f9068d;
                }
                if (z3) {
                    eVar.skip(j2);
                    i.this.b(b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    eVar.skip(j2);
                    return;
                } else {
                    long b2 = eVar.b(this.f9066b, j2);
                    if (b2 != -1) {
                        j2 -= b2;
                        synchronized (i.this) {
                            if (this.f9067c.t() != 0) {
                                z2 = false;
                            }
                            this.f9067c.a(this.f9066b);
                            if (z2) {
                                i.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
            r10 = r7.f9071g.f9054d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
            monitor-enter(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r7.f9071g.f9054d.f9001m += r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
            if (r7.f9071g.f9054d.f9001m < ((long) (r7.f9071g.f9054d.o.c() / 2))) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
            r7.f9071g.f9054d.a(0, r7.f9071g.f9054d.f9001m);
            r7.f9071g.f9054d.f9001m = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0096, code lost:
            monitor-exit(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0097, code lost:
            return r8;
         */
        @Override // j.s
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long b(j.c r8, long r9) {
            /*
            // Method dump skipped, instructions count: 181
            */
            throw new UnsupportedOperationException("Method not decompiled: i.f0.i.i.b.b(j.c, long):long");
        }

        @Override // j.s
        public t b() {
            return i.this.f9059i;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, j.s
        public void close() {
            synchronized (i.this) {
                this.f9069e = true;
                this.f9067c.p();
                i.this.notifyAll();
            }
            i.this.a();
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends j.a {
        c() {
        }

        /* access modifiers changed from: protected */
        @Override // j.a
        public IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        @Override // j.a
        public void i() {
            i.this.b(b.CANCEL);
        }

        public void k() {
            if (h()) {
                throw b((IOException) null);
            }
        }
    }

    i(int i2, g gVar, boolean z, boolean z2, List<c> list) {
        if (gVar == null) {
            throw new NullPointerException("connection == null");
        } else if (list != null) {
            this.f9053c = i2;
            this.f9054d = gVar;
            this.f9052b = (long) gVar.p.c();
            this.f9057g = new b((long) gVar.o.c());
            this.f9058h = new a();
            this.f9057g.f9070f = z2;
            this.f9058h.f9064d = z;
        } else {
            throw new NullPointerException("requestHeaders == null");
        }
    }

    private boolean d(b bVar) {
        synchronized (this) {
            if (this.f9061k != null) {
                return false;
            }
            if (this.f9057g.f9070f && this.f9058h.f9064d) {
                return false;
            }
            this.f9061k = bVar;
            notifyAll();
            this.f9054d.c(this.f9053c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        boolean z;
        boolean g2;
        synchronized (this) {
            z = !this.f9057g.f9070f && this.f9057g.f9069e && (this.f9058h.f9064d || this.f9058h.f9063c);
            g2 = g();
        }
        if (z) {
            a(b.CANCEL);
        } else if (!g2) {
            this.f9054d.c(this.f9053c);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j2) {
        this.f9052b += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    public void a(b bVar) {
        if (d(bVar)) {
            this.f9054d.b(this.f9053c, bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(e eVar, int i2) {
        this.f9057g.a(eVar, (long) i2);
    }

    /* access modifiers changed from: package-private */
    public void a(List<c> list) {
        boolean z;
        synchronized (this) {
            z = true;
            this.f9056f = true;
            if (this.f9055e == null) {
                this.f9055e = list;
                z = g();
                notifyAll();
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f9055e);
                arrayList.add(null);
                arrayList.addAll(list);
                this.f9055e = arrayList;
            }
        }
        if (!z) {
            this.f9054d.c(this.f9053c);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        a aVar = this.f9058h;
        if (aVar.f9063c) {
            throw new IOException("stream closed");
        } else if (!aVar.f9064d) {
            b bVar = this.f9061k;
            if (bVar != null) {
                throw new n(bVar);
            }
        } else {
            throw new IOException("stream finished");
        }
    }

    public void b(b bVar) {
        if (d(bVar)) {
            this.f9054d.c(this.f9053c, bVar);
        }
    }

    public int c() {
        return this.f9053c;
    }

    /* access modifiers changed from: package-private */
    public synchronized void c(b bVar) {
        if (this.f9061k == null) {
            this.f9061k = bVar;
            notifyAll();
        }
    }

    public r d() {
        synchronized (this) {
            if (!this.f9056f) {
                if (!f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f9058h;
    }

    public s e() {
        return this.f9057g;
    }

    public boolean f() {
        return this.f9054d.f8990b == ((this.f9053c & 1) == 1);
    }

    public synchronized boolean g() {
        if (this.f9061k != null) {
            return false;
        }
        return (!this.f9057g.f9070f && !this.f9057g.f9069e) || (!this.f9058h.f9064d && !this.f9058h.f9063c) || !this.f9056f;
    }

    public t h() {
        return this.f9059i;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        boolean g2;
        synchronized (this) {
            this.f9057g.f9070f = true;
            g2 = g();
            notifyAll();
        }
        if (!g2) {
            this.f9054d.c(this.f9053c);
        }
    }

    /* JADX INFO: finally extract failed */
    public synchronized List<c> j() {
        List<c> list;
        if (f()) {
            this.f9059i.g();
            while (this.f9055e == null && this.f9061k == null) {
                try {
                    k();
                } catch (Throwable th) {
                    this.f9059i.k();
                    throw th;
                }
            }
            this.f9059i.k();
            list = this.f9055e;
            if (list != null) {
                this.f9055e = null;
            } else {
                throw new n(this.f9061k);
            }
        } else {
            throw new IllegalStateException("servers cannot read response headers");
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    public void k() {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    public t l() {
        return this.f9060j;
    }
}
