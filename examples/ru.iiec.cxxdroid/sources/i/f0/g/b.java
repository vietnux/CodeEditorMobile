package i.f0.g;

import i.a0;
import i.b0;
import i.t;
import i.y;
import j.c;
import j.d;
import j.g;
import j.l;
import j.r;
import java.net.ProtocolException;

public final class b implements t {
    private final boolean a;

    static final class a extends g {

        /* renamed from: c  reason: collision with root package name */
        long f8893c;

        a(r rVar) {
            super(rVar);
        }

        @Override // j.g, j.r
        public void a(c cVar, long j2) {
            super.a(cVar, j2);
            this.f8893c += j2;
        }
    }

    public b(boolean z) {
        this.a = z;
    }

    @Override // i.t
    public a0 a(t.a aVar) {
        a0.a aVar2;
        b0 b0Var;
        g gVar = (g) aVar;
        c h2 = gVar.h();
        i.f0.f.g i2 = gVar.i();
        i.f0.f.c cVar = (i.f0.f.c) gVar.f();
        y d2 = gVar.d();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.g().d(gVar.e());
        h2.a(d2);
        gVar.g().a(gVar.e(), d2);
        a0.a aVar3 = null;
        if (f.b(d2.e()) && d2.a() != null) {
            if ("100-continue".equalsIgnoreCase(d2.a("Expect"))) {
                h2.b();
                gVar.g().f(gVar.e());
                aVar3 = h2.a(true);
            }
            if (aVar3 == null) {
                gVar.g().c(gVar.e());
                a aVar4 = new a(h2.a(d2, d2.a().a()));
                d a2 = l.a(aVar4);
                d2.a().a(a2);
                a2.close();
                gVar.g().a(gVar.e(), aVar4.f8893c);
            } else if (!cVar.b()) {
                i2.d();
            }
        }
        h2.a();
        if (aVar3 == null) {
            gVar.g().f(gVar.e());
            aVar3 = h2.a(false);
        }
        aVar3.a(d2);
        aVar3.a(i2.b().a());
        aVar3.b(currentTimeMillis);
        aVar3.a(System.currentTimeMillis());
        a0 a3 = aVar3.a();
        int o = a3.o();
        if (o == 100) {
            a0.a a4 = h2.a(false);
            a4.a(d2);
            a4.a(i2.b().a());
            a4.b(currentTimeMillis);
            a4.a(System.currentTimeMillis());
            a3 = a4.a();
            o = a3.o();
        }
        gVar.g().a(gVar.e(), a3);
        if (!this.a || o != 101) {
            aVar2 = a3.u();
            b0Var = h2.a(a3);
        } else {
            aVar2 = a3.u();
            b0Var = i.f0.c.f8804c;
        }
        aVar2.a(b0Var);
        a0 a5 = aVar2.a();
        if ("close".equalsIgnoreCase(a5.y().a("Connection")) || "close".equalsIgnoreCase(a5.b("Connection"))) {
            i2.d();
        }
        if ((o != 204 && o != 205) || a5.l().l() <= 0) {
            return a5;
        }
        throw new ProtocolException("HTTP " + o + " had non-zero Content-Length: " + a5.l().l());
    }
}
