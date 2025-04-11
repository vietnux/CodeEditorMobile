package i.f0.e;

import i.a0;
import i.b0;
import i.f0.e.c;
import i.f0.g.f;
import i.f0.g.h;
import i.r;
import i.t;
import i.w;
import i.y;
import j.c;
import j.d;
import j.e;
import j.l;
import j.r;
import j.s;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class a implements t {
    final f a;

    /* access modifiers changed from: package-private */
    /* renamed from: i.f0.e.a$a  reason: collision with other inner class name */
    public class C0134a implements s {

        /* renamed from: b  reason: collision with root package name */
        boolean f8810b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f8811c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f8812d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f8813e;

        C0134a(a aVar, e eVar, b bVar, d dVar) {
            this.f8811c = eVar;
            this.f8812d = bVar;
            this.f8813e = dVar;
        }

        @Override // j.s
        public long b(c cVar, long j2) {
            try {
                long b2 = this.f8811c.b(cVar, j2);
                if (b2 == -1) {
                    if (!this.f8810b) {
                        this.f8810b = true;
                        this.f8813e.close();
                    }
                    return -1;
                }
                cVar.a(this.f8813e.a(), cVar.t() - b2, b2);
                this.f8813e.c();
                return b2;
            } catch (IOException e2) {
                if (!this.f8810b) {
                    this.f8810b = true;
                    this.f8812d.b();
                }
                throw e2;
            }
        }

        @Override // j.s
        public j.t b() {
            return this.f8811c.b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, j.s
        public void close() {
            if (!this.f8810b && !i.f0.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                this.f8810b = true;
                this.f8812d.b();
            }
            this.f8811c.close();
        }
    }

    public a(f fVar) {
        this.a = fVar;
    }

    private static a0 a(a0 a0Var) {
        if (a0Var == null || a0Var.l() == null) {
            return a0Var;
        }
        a0.a u = a0Var.u();
        u.a((b0) null);
        return u.a();
    }

    private a0 a(b bVar, a0 a0Var) {
        r a2;
        if (bVar == null || (a2 = bVar.a()) == null) {
            return a0Var;
        }
        C0134a aVar = new C0134a(this, a0Var.l().m(), bVar, l.a(a2));
        String b2 = a0Var.b("Content-Type");
        long l2 = a0Var.l().l();
        a0.a u = a0Var.u();
        u.a(new h(b2, l2, l.a(aVar)));
        return u.a();
    }

    private static i.r a(i.r rVar, i.r rVar2) {
        r.a aVar = new r.a();
        int b2 = rVar.b();
        for (int i2 = 0; i2 < b2; i2++) {
            String a2 = rVar.a(i2);
            String b3 = rVar.b(i2);
            if ((!"Warning".equalsIgnoreCase(a2) || !b3.startsWith("1")) && (a(a2) || !b(a2) || rVar2.a(a2) == null)) {
                i.f0.a.a.a(aVar, a2, b3);
            }
        }
        int b4 = rVar2.b();
        for (int i3 = 0; i3 < b4; i3++) {
            String a3 = rVar2.a(i3);
            if (!a(a3) && b(a3)) {
                i.f0.a.a.a(aVar, a3, rVar2.b(i3));
            }
        }
        return aVar.a();
    }

    static boolean a(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    static boolean b(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    @Override // i.t
    public a0 a(t.a aVar) {
        f fVar = this.a;
        a0 a2 = fVar != null ? fVar.a(aVar.d()) : null;
        c a3 = new c.a(System.currentTimeMillis(), aVar.d(), a2).a();
        y yVar = a3.a;
        a0 a0Var = a3.f8814b;
        f fVar2 = this.a;
        if (fVar2 != null) {
            fVar2.a(a3);
        }
        if (a2 != null && a0Var == null) {
            i.f0.c.a(a2.l());
        }
        if (yVar == null && a0Var == null) {
            a0.a aVar2 = new a0.a();
            aVar2.a(aVar.d());
            aVar2.a(w.HTTP_1_1);
            aVar2.a(504);
            aVar2.a("Unsatisfiable Request (only-if-cached)");
            aVar2.a(i.f0.c.f8804c);
            aVar2.b(-1);
            aVar2.a(System.currentTimeMillis());
            return aVar2.a();
        } else if (yVar == null) {
            a0.a u = a0Var.u();
            u.a(a(a0Var));
            return u.a();
        } else {
            try {
                a0 a4 = aVar.a(yVar);
                if (a4 == null && a2 != null) {
                }
                if (a0Var != null) {
                    if (a4.o() == 304) {
                        a0.a u2 = a0Var.u();
                        u2.a(a(a0Var.q(), a4.q()));
                        u2.b(a4.z());
                        u2.a(a4.x());
                        u2.a(a(a0Var));
                        u2.b(a(a4));
                        a0 a5 = u2.a();
                        a4.l().close();
                        this.a.a();
                        this.a.a(a0Var, a5);
                        return a5;
                    }
                    i.f0.c.a(a0Var.l());
                }
                a0.a u3 = a4.u();
                u3.a(a(a0Var));
                u3.b(a(a4));
                a0 a6 = u3.a();
                if (this.a != null) {
                    if (i.f0.g.e.b(a6) && c.a(a6, yVar)) {
                        return a(this.a.a(a6), a6);
                    }
                    if (f.a(yVar.e())) {
                        try {
                            this.a.b(yVar);
                        } catch (IOException unused) {
                        }
                    }
                }
                return a6;
            } finally {
                if (a2 != null) {
                    i.f0.c.a(a2.l());
                }
            }
        }
    }
}
