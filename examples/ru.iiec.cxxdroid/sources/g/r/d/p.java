package g.r.d;

import g.t.c;
import g.t.e;
import g.t.h;

public class p {
    public c a(Class cls) {
        return new e(cls);
    }

    public e a(Class cls, String str) {
        return new k(cls, str);
    }

    public h a(l lVar) {
        return lVar;
    }

    public String a(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String a(j jVar) {
        return a((h) jVar);
    }
}
