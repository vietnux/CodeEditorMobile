package g.o;

import g.r.d.i;
import java.util.List;

/* access modifiers changed from: package-private */
public class d extends c {
    public static final <T> List<T> a(T[] tArr) {
        i.c(tArr, "$this$asList");
        List<T> a = f.a(tArr);
        i.b(a, "ArraysUtilJVM.asList(this)");
        return a;
    }
}
