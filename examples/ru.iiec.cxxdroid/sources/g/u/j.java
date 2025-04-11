package g.u;

import g.r.c.l;
import g.r.d.i;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public class j extends i {
    public static <T> d<T> a(d<? extends T> dVar, l<? super T, Boolean> lVar) {
        i.c(dVar, "$this$filter");
        i.c(lVar, "predicate");
        return new c(dVar, true, lVar);
    }

    public static <T> T a(d<? extends T> dVar) {
        i.c(dVar, "$this$firstOrNull");
        Iterator<? extends T> it = dVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return (T) it.next();
    }

    public static <T, R> d<R> b(d<? extends T> dVar, l<? super T, ? extends R> lVar) {
        i.c(dVar, "$this$map");
        i.c(lVar, "transform");
        return new k(dVar, lVar);
    }
}
