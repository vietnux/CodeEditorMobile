package c.e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: i  reason: collision with root package name */
    f<K, V> f1944i;

    /* access modifiers changed from: package-private */
    /* renamed from: c.e.a$a  reason: collision with other inner class name */
    public class C0040a extends f<K, V> {
        C0040a() {
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public int a(Object obj) {
            return a.this.a(obj);
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public Object a(int i2, int i3) {
            return a.this.f1990c[(i2 << 1) + i3];
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public V a(int i2, V v) {
            return (V) a.this.a(i2, v);
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public void a() {
            a.this.clear();
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public void a(int i2) {
            a.this.c(i2);
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public void a(K k2, V v) {
            a.this.put(k2, v);
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public int b(Object obj) {
            return a.this.b(obj);
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public Map<K, V> b() {
            return a.this;
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public int c() {
            return a.this.f1991d;
        }
    }

    public a() {
    }

    public a(int i2) {
        super(i2);
    }

    public a(g gVar) {
        super(gVar);
    }

    private f<K, V> b() {
        if (this.f1944i == null) {
            this.f1944i = new C0040a();
        }
        return this.f1944i;
    }

    public boolean a(Collection<?> collection) {
        return f.c(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return b().d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return b().e();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: c.e.a<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.f1991d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return b().f();
    }
}
