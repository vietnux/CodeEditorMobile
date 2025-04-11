package c.b.a.b;

import c.b.a.b.b;
import java.util.HashMap;
import java.util.Map;

public class a<K, V> extends b<K, V> {

    /* renamed from: f  reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f1873f = new HashMap<>();

    /* access modifiers changed from: protected */
    @Override // c.b.a.b.b
    public b.c<K, V> a(K k2) {
        return this.f1873f.get(k2);
    }

    @Override // c.b.a.b.b
    public V b(K k2, V v) {
        b.c<K, V> a = a(k2);
        if (a != null) {
            return a.f1879c;
        }
        this.f1873f.put(k2, a(k2, v));
        return null;
    }

    public Map.Entry<K, V> b(K k2) {
        if (contains(k2)) {
            return this.f1873f.get(k2).f1881e;
        }
        return null;
    }

    public boolean contains(K k2) {
        return this.f1873f.containsKey(k2);
    }

    @Override // c.b.a.b.b
    public V remove(K k2) {
        V v = (V) super.remove(k2);
        this.f1873f.remove(k2);
        return v;
    }
}
