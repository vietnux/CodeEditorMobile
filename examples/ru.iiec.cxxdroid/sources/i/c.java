package i;

import i.a0;
import i.f0.e.d;
import i.f0.e.f;
import i.f0.g.k;
import i.r;
import i.y;
import j.e;
import j.g;
import j.h;
import j.l;
import j.r;
import j.s;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c implements Closeable, Flushable {

    /* renamed from: b  reason: collision with root package name */
    final f f8746b;

    /* renamed from: c  reason: collision with root package name */
    final i.f0.e.d f8747c;

    /* renamed from: d  reason: collision with root package name */
    int f8748d;

    /* renamed from: e  reason: collision with root package name */
    int f8749e;

    /* renamed from: f  reason: collision with root package name */
    private int f8750f;

    /* renamed from: g  reason: collision with root package name */
    private int f8751g;

    /* renamed from: h  reason: collision with root package name */
    private int f8752h;

    class a implements f {
        a() {
        }

        @Override // i.f0.e.f
        public a0 a(y yVar) {
            return c.this.a(yVar);
        }

        @Override // i.f0.e.f
        public i.f0.e.b a(a0 a0Var) {
            return c.this.a(a0Var);
        }

        @Override // i.f0.e.f
        public void a() {
            c.this.l();
        }

        @Override // i.f0.e.f
        public void a(a0 a0Var, a0 a0Var2) {
            c.this.a(a0Var, a0Var2);
        }

        @Override // i.f0.e.f
        public void a(i.f0.e.c cVar) {
            c.this.a(cVar);
        }

        @Override // i.f0.e.f
        public void b(y yVar) {
            c.this.b(yVar);
        }
    }

    /* access modifiers changed from: private */
    public final class b implements i.f0.e.b {
        private final d.c a;

        /* renamed from: b  reason: collision with root package name */
        private r f8753b;

        /* renamed from: c  reason: collision with root package name */
        private r f8754c;

        /* renamed from: d  reason: collision with root package name */
        boolean f8755d;

        class a extends g {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d.c f8757c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(r rVar, c cVar, d.c cVar2) {
                super(rVar);
                this.f8757c = cVar2;
            }

            @Override // j.g, java.io.Closeable, java.lang.AutoCloseable, j.r
            public void close() {
                synchronized (c.this) {
                    if (!b.this.f8755d) {
                        b.this.f8755d = true;
                        c.this.f8748d++;
                        super.close();
                        this.f8757c.b();
                    }
                }
            }
        }

        b(d.c cVar) {
            this.a = cVar;
            this.f8753b = cVar.a(1);
            this.f8754c = new a(this.f8753b, c.this, cVar);
        }

        @Override // i.f0.e.b
        public r a() {
            return this.f8754c;
        }

        @Override // i.f0.e.b
        public void b() {
            synchronized (c.this) {
                if (!this.f8755d) {
                    this.f8755d = true;
                    c.this.f8749e++;
                    i.f0.c.a(this.f8753b);
                    try {
                        this.a.a();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i.c$c  reason: collision with other inner class name */
    public static class C0133c extends b0 {

        /* renamed from: b  reason: collision with root package name */
        final d.e f8759b;

        /* renamed from: c  reason: collision with root package name */
        private final e f8760c;

        /* renamed from: d  reason: collision with root package name */
        private final String f8761d;

        /* renamed from: i.c$c$a */
        class a extends h {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d.e f8762c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C0133c cVar, s sVar, d.e eVar) {
                super(sVar);
                this.f8762c = eVar;
            }

            @Override // j.h, java.io.Closeable, java.lang.AutoCloseable, j.s
            public void close() {
                this.f8762c.close();
                super.close();
            }
        }

        C0133c(d.e eVar, String str, String str2) {
            this.f8759b = eVar;
            this.f8761d = str2;
            this.f8760c = l.a(new a(this, eVar.a(1), eVar));
        }

        @Override // i.b0
        public long l() {
            try {
                if (this.f8761d != null) {
                    return Long.parseLong(this.f8761d);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        @Override // i.b0
        public e m() {
            return this.f8760c;
        }
    }

    /* access modifiers changed from: private */
    public static final class d {

        /* renamed from: k  reason: collision with root package name */
        private static final String f8763k = (i.f0.k.f.d().a() + "-Sent-Millis");

        /* renamed from: l  reason: collision with root package name */
        private static final String f8764l = (i.f0.k.f.d().a() + "-Received-Millis");
        private final String a;

        /* renamed from: b  reason: collision with root package name */
        private final r f8765b;

        /* renamed from: c  reason: collision with root package name */
        private final String f8766c;

        /* renamed from: d  reason: collision with root package name */
        private final w f8767d;

        /* renamed from: e  reason: collision with root package name */
        private final int f8768e;

        /* renamed from: f  reason: collision with root package name */
        private final String f8769f;

        /* renamed from: g  reason: collision with root package name */
        private final r f8770g;

        /* renamed from: h  reason: collision with root package name */
        private final q f8771h;

        /* renamed from: i  reason: collision with root package name */
        private final long f8772i;

        /* renamed from: j  reason: collision with root package name */
        private final long f8773j;

        d(a0 a0Var) {
            this.a = a0Var.y().g().toString();
            this.f8765b = i.f0.g.e.e(a0Var);
            this.f8766c = a0Var.y().e();
            this.f8767d = a0Var.w();
            this.f8768e = a0Var.o();
            this.f8769f = a0Var.s();
            this.f8770g = a0Var.q();
            this.f8771h = a0Var.p();
            this.f8772i = a0Var.z();
            this.f8773j = a0Var.x();
        }

        d(s sVar) {
            try {
                e a2 = l.a(sVar);
                this.a = a2.d();
                this.f8766c = a2.d();
                r.a aVar = new r.a();
                int a3 = c.a(a2);
                for (int i2 = 0; i2 < a3; i2++) {
                    aVar.a(a2.d());
                }
                this.f8765b = aVar.a();
                k a4 = k.a(a2.d());
                this.f8767d = a4.a;
                this.f8768e = a4.f8912b;
                this.f8769f = a4.f8913c;
                r.a aVar2 = new r.a();
                int a5 = c.a(a2);
                for (int i3 = 0; i3 < a5; i3++) {
                    aVar2.a(a2.d());
                }
                String b2 = aVar2.b(f8763k);
                String b3 = aVar2.b(f8764l);
                aVar2.c(f8763k);
                aVar2.c(f8764l);
                long j2 = 0;
                this.f8772i = b2 != null ? Long.parseLong(b2) : 0;
                this.f8773j = b3 != null ? Long.parseLong(b3) : j2;
                this.f8770g = aVar2.a();
                if (a()) {
                    String d2 = a2.d();
                    if (d2.length() <= 0) {
                        this.f8771h = q.a(!a2.g() ? d0.a(a2.d()) : d0.SSL_3_0, h.a(a2.d()), a(a2), a(a2));
                    } else {
                        throw new IOException("expected \"\" but was \"" + d2 + "\"");
                    }
                } else {
                    this.f8771h = null;
                }
            } finally {
                sVar.close();
            }
        }

        private List<Certificate> a(e eVar) {
            int a2 = c.a(eVar);
            if (a2 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(a2);
                for (int i2 = 0; i2 < a2; i2++) {
                    String d2 = eVar.d();
                    j.c cVar = new j.c();
                    cVar.a(j.f.a(d2));
                    arrayList.add(instance.generateCertificate(cVar.k()));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private void a(j.d dVar, List<Certificate> list) {
            try {
                dVar.b((long) list.size()).writeByte(10);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    dVar.a(j.f.a(list.get(i2).getEncoded()).h()).writeByte(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private boolean a() {
            return this.a.startsWith("https://");
        }

        public a0 a(d.e eVar) {
            String a2 = this.f8770g.a("Content-Type");
            String a3 = this.f8770g.a("Content-Length");
            y.a aVar = new y.a();
            aVar.b(this.a);
            aVar.a(this.f8766c, (z) null);
            aVar.a(this.f8765b);
            y a4 = aVar.a();
            a0.a aVar2 = new a0.a();
            aVar2.a(a4);
            aVar2.a(this.f8767d);
            aVar2.a(this.f8768e);
            aVar2.a(this.f8769f);
            aVar2.a(this.f8770g);
            aVar2.a(new C0133c(eVar, a2, a3));
            aVar2.a(this.f8771h);
            aVar2.b(this.f8772i);
            aVar2.a(this.f8773j);
            return aVar2.a();
        }

        public void a(d.c cVar) {
            j.d a2 = l.a(cVar.a(0));
            a2.a(this.a).writeByte(10);
            a2.a(this.f8766c).writeByte(10);
            a2.b((long) this.f8765b.b()).writeByte(10);
            int b2 = this.f8765b.b();
            for (int i2 = 0; i2 < b2; i2++) {
                a2.a(this.f8765b.a(i2)).a(": ").a(this.f8765b.b(i2)).writeByte(10);
            }
            a2.a(new k(this.f8767d, this.f8768e, this.f8769f).toString()).writeByte(10);
            a2.b((long) (this.f8770g.b() + 2)).writeByte(10);
            int b3 = this.f8770g.b();
            for (int i3 = 0; i3 < b3; i3++) {
                a2.a(this.f8770g.a(i3)).a(": ").a(this.f8770g.b(i3)).writeByte(10);
            }
            a2.a(f8763k).a(": ").b(this.f8772i).writeByte(10);
            a2.a(f8764l).a(": ").b(this.f8773j).writeByte(10);
            if (a()) {
                a2.writeByte(10);
                a2.a(this.f8771h.a().a()).writeByte(10);
                a(a2, this.f8771h.c());
                a(a2, this.f8771h.b());
                a2.a(this.f8771h.d().h()).writeByte(10);
            }
            a2.close();
        }

        public boolean a(y yVar, a0 a0Var) {
            return this.a.equals(yVar.g().toString()) && this.f8766c.equals(yVar.e()) && i.f0.g.e.a(a0Var, this.f8765b, yVar);
        }
    }

    public c(File file, long j2) {
        this(file, j2, i.f0.j.a.a);
    }

    c(File file, long j2, i.f0.j.a aVar) {
        this.f8746b = new a();
        this.f8747c = i.f0.e.d.a(aVar, file, 201105, 2, j2);
    }

    static int a(e eVar) {
        try {
            long i2 = eVar.i();
            String d2 = eVar.d();
            if (i2 >= 0 && i2 <= 2147483647L && d2.isEmpty()) {
                return (int) i2;
            }
            throw new IOException("expected an int but was \"" + i2 + d2 + "\"");
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public static String a(s sVar) {
        return j.f.d(sVar.toString()).j().i();
    }

    private void a(d.c cVar) {
        if (cVar != null) {
            try {
                cVar.a();
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public a0 a(y yVar) {
        try {
            d.e c2 = this.f8747c.c(a(yVar.g()));
            if (c2 == null) {
                return null;
            }
            try {
                d dVar = new d(c2.a(0));
                a0 a2 = dVar.a(c2);
                if (dVar.a(yVar, a2)) {
                    return a2;
                }
                i.f0.c.a(a2.l());
                return null;
            } catch (IOException unused) {
                i.f0.c.a(c2);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public i.f0.e.b a(a0 a0Var) {
        d.c cVar;
        String e2 = a0Var.y().e();
        if (i.f0.g.f.a(a0Var.y().e())) {
            try {
                b(a0Var.y());
            } catch (IOException unused) {
            }
            return null;
        } else if (!e2.equals("GET") || i.f0.g.e.c(a0Var)) {
            return null;
        } else {
            d dVar = new d(a0Var);
            try {
                cVar = this.f8747c.b(a(a0Var.y().g()));
                if (cVar == null) {
                    return null;
                }
                try {
                    dVar.a(cVar);
                    return new b(cVar);
                } catch (IOException unused2) {
                    a(cVar);
                    return null;
                }
            } catch (IOException unused3) {
                cVar = null;
                a(cVar);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(a0 a0Var, a0 a0Var2) {
        d.c cVar;
        d dVar = new d(a0Var2);
        try {
            cVar = ((C0133c) a0Var.l()).f8759b.l();
            if (cVar != null) {
                try {
                    dVar.a(cVar);
                    cVar.b();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            cVar = null;
            a(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(i.f0.e.c cVar) {
        this.f8752h++;
        if (cVar.a != null) {
            this.f8750f++;
        } else if (cVar.f8814b != null) {
            this.f8751g++;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(y yVar) {
        this.f8747c.d(a(yVar.g()));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8747c.close();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f8747c.flush();
    }

    /* access modifiers changed from: package-private */
    public synchronized void l() {
        this.f8751g++;
    }
}
