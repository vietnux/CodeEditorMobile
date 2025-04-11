package g.o;

import g.h;
import g.r.d.i;
import java.util.Collections;
import java.util.Map;

/* access modifiers changed from: package-private */
public class y extends x {
    public static int a(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> a(h<? extends K, ? extends V> hVar) {
        i.c(hVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(hVar.d(), hVar.e());
        i.b(singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> a(Map<? extends K, ? extends V> map) {
        i.c(map, "$this$toSingletonMap");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        i.b(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
