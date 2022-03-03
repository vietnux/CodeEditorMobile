package g.o;

import g.r.d.i;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
public class h {
    public static <T> List<T> a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        i.b(singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }
}
