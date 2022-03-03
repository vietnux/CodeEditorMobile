package g.r.d;

import g.t.c;
import g.t.e;
import g.t.h;

public class o {
    private static final p a;

    static {
        p pVar = null;
        try {
            pVar = (p) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (pVar == null) {
            pVar = new p();
        }
        a = pVar;
    }

    public static c a(Class cls) {
        return a.a(cls);
    }

    public static h a(l lVar) {
        a.a(lVar);
        return lVar;
    }

    public static String a(j jVar) {
        return a.a(jVar);
    }

    public static e b(Class cls) {
        return a.a(cls, "");
    }
}
