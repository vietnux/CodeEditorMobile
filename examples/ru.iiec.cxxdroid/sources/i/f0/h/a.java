package i.f0.h;

import i.a0;
import i.b0;
import i.f0.g.h;
import i.f0.g.k;
import i.r;
import i.v;
import i.y;
import j.i;
import j.l;
import j.r;
import j.s;
import j.t;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

public final class a implements i.f0.g.c {
    final v a;

    /* renamed from: b  reason: collision with root package name */
    final i.f0.f.g f8914b;

    /* renamed from: c  reason: collision with root package name */
    final j.e f8915c;

    /* renamed from: d  reason: collision with root package name */
    final j.d f8916d;

    /* renamed from: e  reason: collision with root package name */
    int f8917e = 0;

    /* renamed from: f  reason: collision with root package name */
    private long f8918f = 262144;

    /* access modifiers changed from: private */
    public abstract class b implements s {

        /* renamed from: b  reason: collision with root package name */
        protected final i f8919b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f8920c;

        /* renamed from: d  reason: collision with root package name */
        protected long f8921d;

        private b() {
            this.f8919b = new i(a.this.f8915c.b());
            this.f8921d = 0;
        }

        /* access modifiers changed from: protected */
        public final void a(boolean z, IOException iOException) {
            a aVar = a.this;
            int i2 = aVar.f8917e;
            if (i2 != 6) {
                if (i2 == 5) {
                    aVar.a(this.f8919b);
                    a aVar2 = a.this;
                    aVar2.f8917e = 6;
                    i.f0.f.g gVar = aVar2.f8914b;
                    if (gVar != null) {
                        gVar.a(!z, aVar2, this.f8921d, iOException);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + a.this.f8917e);
            }
        }

        @Override // j.s
        public long b(j.c cVar, long j2) {
            try {
                long b2 = a.this.f8915c.b(cVar, j2);
                if (b2 > 0) {
                    this.f8921d += b2;
                }
                return b2;
            } catch (IOException e2) {
                a(false, e2);
                throw e2;
            }
        }

        @Override // j.s
        public t b() {
            return this.f8919b;
        }
    }

    /* access modifiers changed from: private */
    public final class c implements r {

        /* renamed from: b  reason: collision with root package name */
        private final i f8923b = new i(a.this.f8916d.b());

        /* renamed from: c  reason: collision with root package name */
        private boolean f8924c;

        c() {
        }

        @Override // j.r
        public void a(j.c cVar, long j2) {
            if (this.f8924c) {
                throw new IllegalStateException("closed");
            } else if (j2 != 0) {
                a.this.f8916d.a(j2);
                a.this.f8916d.a("\r\n");
                a.this.f8916d.a(cVar, j2);
                a.this.f8916d.a("\r\n");
            }
        }

        @Override // j.r
        public t b() {
            return this.f8923b;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, j.r
        public synchronized void close() {
            if (!this.f8924c) {
                this.f8924c = true;
                a.this.f8916d.a("0\r\n\r\n");
                a.this.a(this.f8923b);
                a.this.f8917e = 3;
            }
        }

        @Override // j.r, java.io.Flushable
        public synchronized void flush() {
            if (!this.f8924c) {
                a.this.f8916d.flush();
            }
        }
    }

    /* access modifiers changed from: private */
    public class d extends b {

        /* renamed from: f  reason: collision with root package name */
        private final i.s f8926f;

        /* renamed from: g  reason: collision with root package name */
        private long f8927g = -1;

        /* renamed from: h  reason: collision with root package name */
        private boolean f8928h = true;

        d(i.s sVar) {
            super();
            this.f8926f = sVar;
        }

        private void c() {
            if (this.f8927g != -1) {
                a.this.f8915c.d();
            }
            try {
                this.f8927g = a.this.f8915c.j();
                String trim = a.this.f8915c.d().trim();
                if (this.f8927g < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f8927g + trim + "\"");
                } else if (this.f8927g == 0) {
                    this.f8928h = false;
                    i.f0.g.e.a(a.this.a.g(), this.f8926f, a.this.e());
                    a(true, null);
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        @Override // i.f0.h.a.b, j.s
        public long b(j.c cVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            } else if (this.f8920c) {
                throw new IllegalStateException("closed");
            } else if (!this.f8928h) {
                return -1;
            } else {
                long j3 = this.f8927g;
                if (j3 == 0 || j3 == -1) {
                    c();
                    if (!this.f8928h) {
                        return -1;
                    }
                }
                long b2 = super.b(cVar, Math.min(j2, this.f8927g));
                if (b2 != -1) {
                    this.f8927g -= b2;
                    return b2;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, j.s
        public void close() {
            if (!this.f8920c) {
                if (this.f8928h && !i.f0.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, null);
                }
                this.f8920c = true;
            }
        }
    }

    /* access modifiers changed from: private */
    public final class e implements r {

        /* renamed from: b  reason: collision with root package name */
        private final i f8930b = new i(a.this.f8916d.b());

        /* renamed from: c  reason: collision with root package name */
        private boolean f8931c;

        /* renamed from: d  reason: collision with root package name */
        private long f8932d;

        e(long j2) {
            this.f8932d = j2;
        }

        @Override // j.r
        public void a(j.c cVar, long j2) {
            if (!this.f8931c) {
                i.f0.c.a(cVar.t(), 0, j2);
                if (j2 <= this.f8932d) {
                    a.this.f8916d.a(cVar, j2);
                    this.f8932d -= j2;
                    return;
                }
                throw new ProtocolException("expected " + this.f8932d + " bytes but received " + j2);
            }
            throw new IllegalStateException("closed");
        }

        @Override // j.r
        public t b() {
            return this.f8930b;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, j.r
        public void close() {
            if (!this.f8931c) {
                this.f8931c = true;
                if (this.f8932d <= 0) {
                    a.this.a(this.f8930b);
                    a.this.f8917e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        @Override // j.r, java.io.Flushable
        public void flush() {
            if (!this.f8931c) {
                a.this.f8916d.flush();
            }
        }
    }

    /* access modifiers changed from: private */
    public class f extends b {

        /* renamed from: f  reason: collision with root package name */
        private long f8934f;

        f(a aVar, long j2) {
            super();
            this.f8934f = j2;
            if (this.f8934f == 0) {
                a(true, null);
            }
        }

        @Override // i.f0.h.a.b, j.s
        public long b(j.c cVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            } else if (!this.f8920c) {
                long j3 = this.f8934f;
                if (j3 == 0) {
                    return -1;
                }
                long b2 = super.b(cVar, Math.min(j3, j2));
                if (b2 != -1) {
                    this.f8934f -= b2;
                    if (this.f8934f == 0) {
                        a(true, null);
                    }
                    return b2;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, j.s
        public void close() {
            if (!this.f8920c) {
                if (this.f8934f != 0 && !i.f0.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, null);
                }
                this.f8920c = true;
            }
        }
    }

    /* access modifiers changed from: private */
    public class g extends b {

        /* renamed from: f  reason: collision with root package name */
        private boolean f8935f;

        g(a aVar) {
            super();
        }

        @Override // i.f0.h.a.b, j.s
        public long b(j.c cVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            } else if (this.f8920c) {
                throw new IllegalStateException("closed");
            } else if (this.f8935f) {
                return -1;
            } else {
                long b2 = super.b(cVar, j2);
                if (b2 != -1) {
                    return b2;
                }
                this.f8935f = true;
                a(true, null);
                return -1;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, j.s
        public void close() {
            if (!this.f8920c) {
                if (!this.f8935f) {
                    a(false, null);
                }
                this.f8920c = true;
            }
        }
    }

    public a(v vVar, i.f0.f.g gVar, j.e eVar, j.d dVar) {
        this.a = vVar;
        this.f8914b = gVar;
        this.f8915c = eVar;
        this.f8916d = dVar;
    }

    private String f() {
        String e2 = this.f8915c.e(this.f8918f);
        this.f8918f -= (long) e2.length();
        return e2;
    }

    @Override // i.f0.g.c
    public a0.a a(boolean z) {
        int i2 = this.f8917e;
        if (i2 == 1 || i2 == 3) {
            try {
                k a2 = k.a(f());
                a0.a aVar = new a0.a();
                aVar.a(a2.a);
                aVar.a(a2.f8912b);
                aVar.a(a2.f8913c);
                aVar.a(e());
                if (z && a2.f8912b == 100) {
                    return null;
                }
                if (a2.f8912b == 100) {
                    this.f8917e = 3;
                    return aVar;
                }
                this.f8917e = 4;
                return aVar;
            } catch (EOFException e2) {
                IOException iOException = new IOException("unexpected end of stream on " + this.f8914b);
                iOException.initCause(e2);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.f8917e);
        }
    }

    @Override // i.f0.g.c
    public b0 a(a0 a0Var) {
        i.f0.f.g gVar = this.f8914b;
        gVar.f8885f.e(gVar.f8884e);
        String b2 = a0Var.b("Content-Type");
        if (!i.f0.g.e.b(a0Var)) {
            return new h(b2, 0, l.a(b(0)));
        }
        if ("chunked".equalsIgnoreCase(a0Var.b("Transfer-Encoding"))) {
            return new h(b2, -1, l.a(a(a0Var.y().g())));
        }
        long a2 = i.f0.g.e.a(a0Var);
        return a2 != -1 ? new h(b2, a2, l.a(b(a2))) : new h(b2, -1, l.a(d()));
    }

    public r a(long j2) {
        if (this.f8917e == 1) {
            this.f8917e = 2;
            return new e(j2);
        }
        throw new IllegalStateException("state: " + this.f8917e);
    }

    @Override // i.f0.g.c
    public r a(y yVar, long j2) {
        if ("chunked".equalsIgnoreCase(yVar.a("Transfer-Encoding"))) {
            return c();
        }
        if (j2 != -1) {
            return a(j2);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public s a(i.s sVar) {
        if (this.f8917e == 4) {
            this.f8917e = 5;
            return new d(sVar);
        }
        throw new IllegalStateException("state: " + this.f8917e);
    }

    @Override // i.f0.g.c
    public void a() {
        this.f8916d.flush();
    }

    public void a(i.r rVar, String str) {
        if (this.f8917e == 0) {
            this.f8916d.a(str).a("\r\n");
            int b2 = rVar.b();
            for (int i2 = 0; i2 < b2; i2++) {
                this.f8916d.a(rVar.a(i2)).a(": ").a(rVar.b(i2)).a("\r\n");
            }
            this.f8916d.a("\r\n");
            this.f8917e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f8917e);
    }

    @Override // i.f0.g.c
    public void a(y yVar) {
        a(yVar.c(), i.f0.g.i.a(yVar, this.f8914b.b().c().b().type()));
    }

    /* access modifiers changed from: package-private */
    public void a(i iVar) {
        t g2 = iVar.g();
        iVar.a(t.f9514d);
        g2.a();
        g2.b();
    }

    public s b(long j2) {
        if (this.f8917e == 4) {
            this.f8917e = 5;
            return new f(this, j2);
        }
        throw new IllegalStateException("state: " + this.f8917e);
    }

    @Override // i.f0.g.c
    public void b() {
        this.f8916d.flush();
    }

    public r c() {
        if (this.f8917e == 1) {
            this.f8917e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f8917e);
    }

    public s d() {
        if (this.f8917e == 4) {
            i.f0.f.g gVar = this.f8914b;
            if (gVar != null) {
                this.f8917e = 5;
                gVar.d();
                return new g(this);
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f8917e);
    }

    public i.r e() {
        r.a aVar = new r.a();
        while (true) {
            String f2 = f();
            if (f2.length() == 0) {
                return aVar.a();
            }
            i.f0.a.a.a(aVar, f2);
        }
    }
}
