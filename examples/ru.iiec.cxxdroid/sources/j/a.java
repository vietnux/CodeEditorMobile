package j;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class a extends t {

    /* renamed from: h  reason: collision with root package name */
    private static final long f9462h = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: i  reason: collision with root package name */
    private static final long f9463i = TimeUnit.MILLISECONDS.toNanos(f9462h);

    /* renamed from: j  reason: collision with root package name */
    static a f9464j;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9465e;

    /* renamed from: f  reason: collision with root package name */
    private a f9466f;

    /* renamed from: g  reason: collision with root package name */
    private long f9467g;

    /* access modifiers changed from: package-private */
    /* renamed from: j.a$a  reason: collision with other inner class name */
    public class C0150a implements r {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f9468b;

        C0150a(r rVar) {
            this.f9468b = rVar;
        }

        @Override // j.r
        public void a(c cVar, long j2) {
            u.a(cVar.f9474c, 0, j2);
            while (true) {
                long j3 = 0;
                if (j2 > 0) {
                    o oVar = cVar.f9473b;
                    while (true) {
                        if (j3 >= 65536) {
                            break;
                        }
                        j3 += (long) (oVar.f9506c - oVar.f9505b);
                        if (j3 >= j2) {
                            j3 = j2;
                            break;
                        }
                        oVar = oVar.f9509f;
                    }
                    a.this.g();
                    try {
                        this.f9468b.a(cVar, j3);
                        j2 -= j3;
                        a.this.a(true);
                    } catch (IOException e2) {
                        throw a.this.a(e2);
                    } catch (Throwable th) {
                        a.this.a(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // j.r
        public t b() {
            return a.this;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, j.r
        public void close() {
            a.this.g();
            try {
                this.f9468b.close();
                a.this.a(true);
            } catch (IOException e2) {
                throw a.this.a(e2);
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // j.r, java.io.Flushable
        public void flush() {
            a.this.g();
            try {
                this.f9468b.flush();
                a.this.a(true);
            } catch (IOException e2) {
                throw a.this.a(e2);
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f9468b + ")";
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements s {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s f9470b;

        b(s sVar) {
            this.f9470b = sVar;
        }

        @Override // j.s
        public long b(c cVar, long j2) {
            a.this.g();
            try {
                long b2 = this.f9470b.b(cVar, j2);
                a.this.a(true);
                return b2;
            } catch (IOException e2) {
                throw a.this.a(e2);
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // j.s
        public t b() {
            return a.this;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, j.s
        public void close() {
            try {
                this.f9470b.close();
                a.this.a(true);
            } catch (IOException e2) {
                throw a.this.a(e2);
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f9470b + ")";
        }
    }

    /* access modifiers changed from: private */
    public static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0015, code lost:
            r1.i();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<j.a> r0 = j.a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                j.a r1 = j.a.j()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                j.a r2 = j.a.f9464j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                j.a.f9464j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.i()
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: j.a.c.run():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0052 A[EDGE_INSN: B:32:0x0052->B:22:0x0052 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void a(j.a r6, long r7, boolean r9) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.a(j.a, long, boolean):void");
    }

    private static synchronized boolean a(a aVar) {
        boolean z;
        synchronized (a.class) {
            a aVar2 = f9464j;
            while (true) {
                if (aVar2 == null) {
                    z = true;
                    break;
                } else if (aVar2.f9466f == aVar) {
                    aVar2.f9466f = aVar.f9466f;
                    aVar.f9466f = null;
                    z = false;
                    break;
                } else {
                    aVar2 = aVar2.f9466f;
                }
            }
        }
        return z;
    }

    private long b(long j2) {
        return this.f9467g - j2;
    }

    static a j() {
        a aVar = f9464j.f9466f;
        long nanoTime = System.nanoTime();
        if (aVar == null) {
            a.class.wait(f9462h);
            if (f9464j.f9466f != null || System.nanoTime() - nanoTime < f9463i) {
                return null;
            }
            return f9464j;
        }
        long b2 = aVar.b(nanoTime);
        if (b2 > 0) {
            long j2 = b2 / 1000000;
            a.class.wait(j2, (int) (b2 - (1000000 * j2)));
            return null;
        }
        f9464j.f9466f = aVar.f9466f;
        aVar.f9466f = null;
        return aVar;
    }

    public final r a(r rVar) {
        return new C0150a(rVar);
    }

    public final s a(s sVar) {
        return new b(sVar);
    }

    /* access modifiers changed from: package-private */
    public final IOException a(IOException iOException) {
        return !h() ? iOException : b(iOException);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (h() && z) {
            throw b((IOException) null);
        }
    }

    /* access modifiers changed from: protected */
    public IOException b(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void g() {
        if (!this.f9465e) {
            long f2 = f();
            boolean d2 = d();
            if (f2 != 0 || d2) {
                this.f9465e = true;
                a(this, f2, d2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean h() {
        if (!this.f9465e) {
            return false;
        }
        this.f9465e = false;
        return a(this);
    }

    /* access modifiers changed from: protected */
    public void i() {
    }
}
