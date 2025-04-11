package i.f0.g;

import i.a0;
import i.f0.c;
import i.f0.d;
import i.l;
import i.m;
import i.r;
import i.t;
import i.u;
import i.y;
import i.z;
import j.j;
import java.util.List;

public final class a implements t {
    private final m a;

    public a(m mVar) {
        this.a = mVar;
    }

    private String a(List<l> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                sb.append("; ");
            }
            l lVar = list.get(i2);
            sb.append(lVar.a());
            sb.append('=');
            sb.append(lVar.b());
        }
        return sb.toString();
    }

    @Override // i.t
    public a0 a(t.a aVar) {
        y d2 = aVar.d();
        y.a f2 = d2.f();
        z a2 = d2.a();
        if (a2 != null) {
            u b2 = a2.b();
            if (b2 == null) {
                long a3 = a2.a();
                if (a3 != -1) {
                    f2.a("Content-Length", Long.toString(a3));
                    f2.a("Transfer-Encoding");
                } else {
                    f2.a("Transfer-Encoding", "chunked");
                    f2.a("Content-Length");
                }
            } else {
                b2.toString();
                throw null;
            }
        }
        boolean z = false;
        if (d2.a("Host") == null) {
            f2.a("Host", c.a(d2.g(), false));
        }
        if (d2.a("Connection") == null) {
            f2.a("Connection", "Keep-Alive");
        }
        if (d2.a("Accept-Encoding") == null && d2.a("Range") == null) {
            z = true;
            f2.a("Accept-Encoding", "gzip");
        }
        List<l> a4 = this.a.a(d2.g());
        if (!a4.isEmpty()) {
            f2.a("Cookie", a(a4));
        }
        if (d2.a("User-Agent") == null) {
            f2.a("User-Agent", d.a());
        }
        a0 a5 = aVar.a(f2.a());
        e.a(this.a, d2.g(), a5.q());
        a0.a u = a5.u();
        u.a(d2);
        if (z && "gzip".equalsIgnoreCase(a5.b("Content-Encoding")) && e.b(a5)) {
            j jVar = new j(a5.l().m());
            r.a a6 = a5.q().a();
            a6.c("Content-Encoding");
            a6.c("Content-Length");
            u.a(a6.a());
            u.a(new h(a5.b("Content-Type"), -1, j.l.a(jVar)));
        }
        return u.a();
    }
}
