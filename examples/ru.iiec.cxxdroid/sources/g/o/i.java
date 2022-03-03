package g.o;

import java.util.List;

/* access modifiers changed from: package-private */
public class i extends h {
    public static <T> List<T> a() {
        return s.f8608b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> a(List<? extends T> list) {
        g.r.d.i.c(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        return size != 0 ? size != 1 ? list : h.a(list.get(0)) : a();
    }

    public static <T> List<T> a(T... tArr) {
        g.r.d.i.c(tArr, "elements");
        return tArr.length > 0 ? d.a(tArr) : a();
    }

    public static <T> List<T> b(T... tArr) {
        g.r.d.i.c(tArr, "elements");
        return e.c(tArr);
    }

    public static void b() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
