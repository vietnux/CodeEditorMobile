package e.b.b.a.c.c;

public final class n extends d<n> {

    /* renamed from: b  reason: collision with root package name */
    private static volatile n[] f7127b;

    public n() {
        this.a = null;
    }

    public static n[] b() {
        if (f7127b == null) {
            synchronized (h.f7125b) {
                if (f7127b == null) {
                    f7127b = new n[0];
                }
            }
        }
        return f7127b;
    }

    @Override // e.b.b.a.c.c.j
    public final /* synthetic */ j a(a aVar) {
        while (true) {
            int c2 = aVar.c();
            if (c2 == 0) {
                return this;
            }
            if (c2 == 10) {
                aVar.b();
            } else if (!super.a(aVar, c2)) {
                return this;
            }
        }
    }
}
