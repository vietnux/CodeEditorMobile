package g.o;

import g.r.d.i;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
public class m extends l {
    public static <T extends Comparable<? super T>> void b(List<T> list) {
        i.c(list, "$this$sort");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
