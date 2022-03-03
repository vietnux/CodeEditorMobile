package g.u;

import g.o.e;
import g.r.d.i;

/* access modifiers changed from: package-private */
public class h extends g {
    public static <T> d<T> a() {
        return b.a;
    }

    public static <T> d<T> a(T... tArr) {
        i.c(tArr, "elements");
        return tArr.length == 0 ? a() : e.b(tArr);
    }
}
