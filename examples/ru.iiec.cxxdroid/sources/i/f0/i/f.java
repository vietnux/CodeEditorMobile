package i.f0.i;

import i.a0;
import i.b0;
import i.f0.f.g;
import i.f0.g.c;
import i.f0.g.e;
import i.f0.g.i;
import i.f0.g.k;
import i.r;
import i.t;
import i.v;
import i.w;
import i.y;
import j.h;
import j.l;
import j.s;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class f implements c {

    /* renamed from: e  reason: collision with root package name */
    private static final j.f f8975e = j.f.d("connection");

    /* renamed from: f  reason: collision with root package name */
    private static final j.f f8976f = j.f.d("host");

    /* renamed from: g  reason: collision with root package name */
    private static final j.f f8977g = j.f.d("keep-alive");

    /* renamed from: h  reason: collision with root package name */
    private static final j.f f8978h = j.f.d("proxy-connection");

    /* renamed from: i  reason: collision with root package name */
    private static final j.f f8979i = j.f.d("transfer-encoding");

    /* renamed from: j  reason: collision with root package name */
    private static final j.f f8980j = j.f.d("te");

    /* renamed from: k  reason: collision with root package name */
    private static final j.f f8981k = j.f.d("encoding");

    /* renamed from: l  reason: collision with root package name */
    private static final j.f f8982l = j.f.d("upgrade");

    /* renamed from: m  reason: collision with root package name */
    private static final List<j.f> f8983m = i.f0.c.a(f8975e, f8976f, f8977g, f8978h, f8980j, f8979i, f8981k, f8982l, c.f8950f, c.f8951g, c.f8952h, c.f8953i);
    private static final List<j.f> n = i.f0.c.a(f8975e, f8976f, f8977g, f8978h, f8980j, f8979i, f8981k, f8982l);
    private final t.a a;

    /* renamed from: b  reason: collision with root package name */
    final g f8984b;

    /* renamed from: c  reason: collision with root package name */
    private final g f8985c;

    /* renamed from: d  reason: collision with root package name */
    private i f8986d;

    class a extends h {

        /* renamed from: c  reason: collision with root package name */
        boolean f8987c = false;

        /* renamed from: d  reason: collision with root package name */
        long f8988d = 0;

        a(s sVar) {
            super(sVar);
        }

        private void a(IOException iOException) {
            if (!this.f8987c) {
                this.f8987c = true;
                f fVar = f.this;
                fVar.f8984b.a(false, fVar, this.f8988d, iOException);
            }
        }

        @Override // j.h, j.s
        public long b(j.c cVar, long j2) {
            try {
                long b2 = c().b(cVar, j2);
                if (b2 > 0) {
                    this.f8988d += b2;
                }
                return b2;
            } catch (IOException e2) {
                a(e2);
                throw e2;
            }
        }

        @Override // j.h, java.io.Closeable, java.lang.AutoCloseable, j.s
        public void close() {
            super.close();
            a(null);
        }
    }

    public f(v vVar, t.a aVar, g gVar, g gVar2) {
        this.a = aVar;
        this.f8984b = gVar;
        this.f8985c = gVar2;
    }

    public static a0.a a(List<c> list) {
        r.a aVar = new r.a();
        int size = list.size();
        r.a aVar2 = aVar;
        k kVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = list.get(i2);
            if (cVar != null) {
                j.f fVar = cVar.a;
                String p = cVar.f8954b.p();
                if (fVar.equals(c.f8949e)) {
                    kVar = k.a("HTTP/1.1 " + p);
                } else if (!n.contains(fVar)) {
                    i.f0.a.a.a(aVar2, fVar.p(), p);
                }
            } else if (kVar != null && kVar.f8912b == 100) {
                aVar2 = new r.a();
                kVar = null;
            }
        }
        if (kVar != null) {
            a0.a aVar3 = new a0.a();
            aVar3.a(w.HTTP_2);
            aVar3.a(kVar.f8912b);
            aVar3.a(kVar.f8913c);
            aVar3.a(aVar2.a());
            return aVar3;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public static List<c> b(y yVar) {
        r c2 = yVar.c();
        ArrayList arrayList = new ArrayList(c2.b() + 4);
        arrayList.add(new c(c.f8950f, yVar.e()));
        arrayList.add(new c(c.f8951g, i.a(yVar.g())));
        String a2 = yVar.a("Host");
        if (a2 != null) {
            arrayList.add(new c(c.f8953i, a2));
        }
        arrayList.add(new c(c.f8952h, yVar.g().m()));
        int b2 = c2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            j.f d2 = j.f.d(c2.a(i2).toLowerCase(Locale.US));
            if (!f8983m.contains(d2)) {
                arrayList.add(new c(d2, c2.b(i2)));
            }
        }
        return arrayList;
    }

    @Override // i.f0.g.c
    public a0.a a(boolean z) {
        a0.a a2 = a(this.f8986d.j());
        if (!z || i.f0.a.a.a(a2) != 100) {
            return a2;
        }
        return null;
    }

    @Override // i.f0.g.c
    public b0 a(a0 a0Var) {
        g gVar = this.f8984b;
        gVar.f8885f.e(gVar.f8884e);
        return new i.f0.g.h(a0Var.b("Content-Type"), e.a(a0Var), l.a(new a(this.f8986d.e())));
    }

    @Override // i.f0.g.c
    public j.r a(y yVar, long j2) {
        return this.f8986d.d();
    }

    @Override // i.f0.g.c
    public void a() {
        this.f8986d.d().close();
    }

    @Override // i.f0.g.c
    public void a(y yVar) {
        if (this.f8986d == null) {
            this.f8986d = this.f8985c.a(b(yVar), yVar.a() != null);
            this.f8986d.h().a((long) this.a.b(), TimeUnit.MILLISECONDS);
            this.f8986d.l().a((long) this.a.c(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // i.f0.g.c
    public void b() {
        this.f8985c.flush();
    }
}
