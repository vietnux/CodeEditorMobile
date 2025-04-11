package g.r.d;

import g.r.c.a;
import g.r.c.b;
import g.r.c.c;
import g.r.c.d;
import g.r.c.e;
import g.r.c.f;
import g.r.c.g;
import g.r.c.h;
import g.r.c.i;
import g.r.c.j;
import g.r.c.k;
import g.r.c.l;
import g.r.c.m;
import g.r.c.n;
import g.r.c.o;
import g.r.c.p;
import g.r.c.r;
import g.r.c.s;
import g.r.c.t;
import g.r.c.u;
import g.r.c.v;
import g.r.c.w;

public class q {
    public static int a(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).d();
        }
        if (obj instanceof a) {
            return 0;
        }
        if (obj instanceof l) {
            return 1;
        }
        if (obj instanceof p) {
            return 2;
        }
        if (obj instanceof g.r.c.q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        if (obj instanceof s) {
            return 5;
        }
        if (obj instanceof t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof b) {
            return 10;
        }
        if (obj instanceof c) {
            return 11;
        }
        if (obj instanceof d) {
            return 12;
        }
        if (obj instanceof e) {
            return 13;
        }
        if (obj instanceof f) {
            return 14;
        }
        if (obj instanceof g) {
            return 15;
        }
        if (obj instanceof h) {
            return 16;
        }
        if (obj instanceof i) {
            return 17;
        }
        if (obj instanceof j) {
            return 18;
        }
        if (obj instanceof k) {
            return 19;
        }
        if (obj instanceof m) {
            return 20;
        }
        if (obj instanceof n) {
            return 21;
        }
        return obj instanceof o ? 22 : -1;
    }

    public static ClassCastException a(ClassCastException classCastException) {
        a((Throwable) classCastException);
        throw classCastException;
    }

    public static Object a(Object obj, int i2) {
        if (obj == null || b(obj, i2)) {
            return obj;
        }
        a(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    private static <T extends Throwable> T a(T t) {
        i.a((Throwable) t, q.class.getName());
        return t;
    }

    public static void a(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        a(name + " cannot be cast to " + str);
        throw null;
    }

    public static void a(String str) {
        a(new ClassCastException(str));
        throw null;
    }

    public static boolean b(Object obj, int i2) {
        return (obj instanceof g.c) && a(obj) == i2;
    }
}
