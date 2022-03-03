package e.b.b.a.c.c;

import java.nio.charset.Charset;

public final class h {
    protected static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final Object f7125b = new Object();

    static {
        Charset.forName("ISO-8859-1");
    }

    public static void a(d dVar, d dVar2) {
        f fVar = dVar.a;
        if (fVar != null) {
            dVar2.a = (f) fVar.clone();
        }
    }
}
