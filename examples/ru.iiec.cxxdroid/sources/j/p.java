package j;

/* access modifiers changed from: package-private */
public final class p {
    static o a;

    /* renamed from: b  reason: collision with root package name */
    static long f9511b;

    private p() {
    }

    static o a() {
        synchronized (p.class) {
            if (a == null) {
                return new o();
            }
            o oVar = a;
            a = oVar.f9509f;
            oVar.f9509f = null;
            f9511b -= 8192;
            return oVar;
        }
    }

    static void a(o oVar) {
        if (oVar.f9509f != null || oVar.f9510g != null) {
            throw new IllegalArgumentException();
        } else if (!oVar.f9507d) {
            synchronized (p.class) {
                if (f9511b + 8192 <= 65536) {
                    f9511b += 8192;
                    oVar.f9509f = a;
                    oVar.f9506c = 0;
                    oVar.f9505b = 0;
                    a = oVar;
                }
            }
        }
    }
}
