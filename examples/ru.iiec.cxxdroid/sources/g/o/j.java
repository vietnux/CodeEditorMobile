package g.o;

import g.r.d.i;
import java.util.Collection;

/* access modifiers changed from: package-private */
public class j extends i {
    public static <T> int a(Iterable<? extends T> iterable, int i2) {
        i.c(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }
}
