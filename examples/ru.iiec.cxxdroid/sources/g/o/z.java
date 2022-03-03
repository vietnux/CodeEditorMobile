package g.o;

import g.h;
import g.r.d.i;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public class z extends y {
    public static <K, V> HashMap<K, V> a(h<? extends K, ? extends V>... hVarArr) {
        i.c(hVarArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(y.a(hVarArr.length));
        a(hashMap, hVarArr);
        return hashMap;
    }

    public static <K, V> Map<K, V> a() {
        t tVar = t.f8609b;
        if (tVar != null) {
            return tVar;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    public static <K, V> Map<K, V> a(Iterable<? extends h<? extends K, ? extends V>> iterable) {
        i.c(iterable, "$this$toMap");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return a();
            }
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(y.a(collection.size()));
                a(iterable, linkedHashMap);
                return linkedHashMap;
            }
            return y.a((h) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        a(iterable, linkedHashMap2);
        return b(linkedHashMap2);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M a(Iterable<? extends h<? extends K, ? extends V>> iterable, M m2) {
        i.c(iterable, "$this$toMap");
        i.c(m2, "destination");
        a(m2, iterable);
        return m2;
    }

    public static final <K, V> void a(Map<? super K, ? super V> map, Iterable<? extends h<? extends K, ? extends V>> iterable) {
        i.c(map, "$this$putAll");
        i.c(iterable, "pairs");
        Iterator<? extends h<? extends K, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            map.put((Object) hVar.b(), (Object) hVar.c());
        }
    }

    public static final <K, V> void a(Map<? super K, ? super V> map, h<? extends K, ? extends V>[] hVarArr) {
        i.c(map, "$this$putAll");
        i.c(hVarArr, "pairs");
        for (h<? extends K, ? extends V> hVar : hVarArr) {
            map.put((Object) hVar.b(), (Object) hVar.c());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<K, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> b(Map<K, ? extends V> map) {
        i.c(map, "$this$optimizeReadOnlyMap");
        int size = map.size();
        return size != 0 ? size != 1 ? map : y.a(map) : a();
    }
}
