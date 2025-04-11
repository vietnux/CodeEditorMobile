package g.o;

import g.r.d.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public class q extends p {
    public static final <T> T a(Iterable<? extends T> iterable) {
        i.c(iterable, "$this$first");
        if (iterable instanceof List) {
            return (T) c((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return (T) it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T, C extends Collection<? super T>> C a(Iterable<? extends T> iterable, C c2) {
        i.c(iterable, "$this$toCollection");
        i.c(c2, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c2.add(it.next());
        }
        return c2;
    }

    public static final <T> List<T> a(Collection<? extends T> collection) {
        i.c(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    public static final <T> List<T> b(Iterable<? extends T> iterable) {
        i.c(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return i.a(c(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return i.a();
        }
        if (size != 1) {
            return a(collection);
        }
        return h.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static <T> List<T> b(Iterable<? extends T> iterable, int i2) {
        i.c(iterable, "$this$take");
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        } else if (i2 == 0) {
            return i.a();
        } else {
            if (iterable instanceof Collection) {
                if (i2 >= ((Collection) iterable).size()) {
                    return b(iterable);
                }
                if (i2 == 1) {
                    return h.a(a((Iterable) iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i2);
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
                i3++;
                if (i3 == i2) {
                    break;
                }
            }
            return i.a((List) arrayList);
        }
    }

    public static final <T> T c(List<? extends T> list) {
        i.c(list, "$this$first");
        if (!list.isEmpty()) {
            return (T) list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> List<T> c(Iterable<? extends T> iterable) {
        i.c(iterable, "$this$toMutableList");
        if (iterable instanceof Collection) {
            return a((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        a(iterable, arrayList);
        return arrayList;
    }
}
