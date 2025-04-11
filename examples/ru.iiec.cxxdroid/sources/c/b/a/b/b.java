package c.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    c<K, V> f1874b;

    /* renamed from: c  reason: collision with root package name */
    private c<K, V> f1875c;

    /* renamed from: d  reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f1876d = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private int f1877e = 0;

    /* access modifiers changed from: package-private */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // c.b.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f1881e;
        }

        /* access modifiers changed from: package-private */
        @Override // c.b.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f1880d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c.b.a.b.b$b  reason: collision with other inner class name */
    public static class C0036b<K, V> extends e<K, V> {
        C0036b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // c.b.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f1880d;
        }

        /* access modifiers changed from: package-private */
        @Override // c.b.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f1881e;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        final K f1878b;

        /* renamed from: c  reason: collision with root package name */
        final V f1879c;

        /* renamed from: d  reason: collision with root package name */
        c<K, V> f1880d;

        /* renamed from: e  reason: collision with root package name */
        c<K, V> f1881e;

        c(K k2, V v) {
            this.f1878b = k2;
            this.f1879c = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f1878b.equals(cVar.f1878b) && this.f1879c.equals(cVar.f1879c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f1878b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f1879c;
        }

        public int hashCode() {
            return this.f1878b.hashCode() ^ this.f1879c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return ((Object) this.f1878b) + "=" + ((Object) this.f1879c);
        }
    }

    /* access modifiers changed from: private */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        private c<K, V> f1882b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f1883c = true;

        d() {
        }

        @Override // c.b.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f1882b;
            if (cVar == cVar2) {
                this.f1882b = cVar2.f1881e;
                this.f1883c = this.f1882b == null;
            }
        }

        public boolean hasNext() {
            if (this.f1883c) {
                return b.this.f1874b != null;
            }
            c<K, V> cVar = this.f1882b;
            return (cVar == null || cVar.f1880d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f1883c) {
                this.f1883c = false;
                cVar = b.this.f1874b;
            } else {
                c<K, V> cVar2 = this.f1882b;
                cVar = cVar2 != null ? cVar2.f1880d : null;
            }
            this.f1882b = cVar;
            return this.f1882b;
        }
    }

    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        c<K, V> f1885b;

        /* renamed from: c  reason: collision with root package name */
        c<K, V> f1886c;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f1885b = cVar2;
            this.f1886c = cVar;
        }

        private c<K, V> a() {
            c<K, V> cVar = this.f1886c;
            c<K, V> cVar2 = this.f1885b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // c.b.a.b.b.f
        public void a(c<K, V> cVar) {
            if (this.f1885b == cVar && cVar == this.f1886c) {
                this.f1886c = null;
                this.f1885b = null;
            }
            c<K, V> cVar2 = this.f1885b;
            if (cVar2 == cVar) {
                this.f1885b = b(cVar2);
            }
            if (this.f1886c == cVar) {
                this.f1886c = a();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> b(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        public boolean hasNext() {
            return this.f1886c != null;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f1886c;
            this.f1886c = a();
            return cVar;
        }
    }

    /* access modifiers changed from: package-private */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    public c<K, V> a(K k2) {
        c<K, V> cVar = this.f1874b;
        while (cVar != null && !cVar.f1878b.equals(k2)) {
            cVar = cVar.f1880d;
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    public c<K, V> a(K k2, V v) {
        c<K, V> cVar = new c<>(k2, v);
        this.f1877e++;
        c<K, V> cVar2 = this.f1875c;
        if (cVar2 == null) {
            this.f1874b = cVar;
            this.f1875c = this.f1874b;
            return cVar;
        }
        cVar2.f1880d = cVar;
        cVar.f1881e = cVar2;
        this.f1875c = cVar;
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> a() {
        C0036b bVar = new C0036b(this.f1875c, this.f1874b);
        this.f1876d.put(bVar, false);
        return bVar;
    }

    public V b(K k2, V v) {
        c<K, V> a2 = a(k2);
        if (a2 != null) {
            return a2.f1879c;
        }
        a(k2, v);
        return null;
    }

    public Map.Entry<K, V> b() {
        return this.f1874b;
    }

    public b<K, V>.d c() {
        b<K, V>.d dVar = new d();
        this.f1876d.put(dVar, false);
        return dVar;
    }

    public Map.Entry<K, V> d() {
        return this.f1875c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().hashCode();
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f1874b, this.f1875c);
        this.f1876d.put(aVar, false);
        return aVar;
    }

    public V remove(K k2) {
        c<K, V> a2 = a(k2);
        if (a2 == null) {
            return null;
        }
        this.f1877e--;
        if (!this.f1876d.isEmpty()) {
            for (f<K, V> fVar : this.f1876d.keySet()) {
                fVar.a(a2);
            }
        }
        c<K, V> cVar = a2.f1881e;
        if (cVar != null) {
            cVar.f1880d = a2.f1880d;
        } else {
            this.f1874b = a2.f1880d;
        }
        c<K, V> cVar2 = a2.f1880d;
        if (cVar2 != null) {
            cVar2.f1881e = a2.f1881e;
        } else {
            this.f1875c = a2.f1881e;
        }
        a2.f1880d = null;
        a2.f1881e = null;
        return a2.f1879c;
    }

    public int size() {
        return this.f1877e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
