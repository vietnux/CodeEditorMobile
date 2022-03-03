package g.o;

import g.r.d.b;
import g.r.d.i;
import g.u.d;
import g.u.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public class e extends d {

    public static final class a implements d<T> {
        final /* synthetic */ Object[] a;

        public a(Object[] objArr) {
            this.a = objArr;
        }

        @Override // g.u.d
        public Iterator<T> iterator() {
            return b.a(this.a);
        }
    }

    public static char a(char[] cArr) {
        i.c(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static final <C extends Collection<? super T>, T> C a(T[] tArr, C c2) {
        i.c(tArr, "$this$filterNotNullTo");
        i.c(c2, "destination");
        for (T t : tArr) {
            if (t != null) {
                c2.add(t);
            }
        }
        return c2;
    }

    public static <T> d<T> b(T[] tArr) {
        i.c(tArr, "$this$asSequence");
        return tArr.length == 0 ? h.a() : new a(tArr);
    }

    public static final <T> List<T> c(T[] tArr) {
        i.c(tArr, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        a(tArr, arrayList);
        return arrayList;
    }

    public static <T> T d(T[] tArr) {
        i.c(tArr, "$this$singleOrNull");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }
}
