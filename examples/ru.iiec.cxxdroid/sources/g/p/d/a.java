package g.p.d;

import g.r.d.i;

public class a extends g.p.a {
    @Override // g.p.a
    public void a(Throwable th, Throwable th2) {
        i.c(th, "cause");
        i.c(th2, "exception");
        th.addSuppressed(th2);
    }
}
