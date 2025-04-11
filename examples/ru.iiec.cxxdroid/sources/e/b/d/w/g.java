package e.b.d.w;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator<Comparable> f7938i = new a();

    /* renamed from: b  reason: collision with root package name */
    Comparator<? super K> f7939b;

    /* renamed from: c  reason: collision with root package name */
    e<K, V> f7940c;

    /* renamed from: d  reason: collision with root package name */
    int f7941d;

    /* renamed from: e  reason: collision with root package name */
    int f7942e;

    /* renamed from: f  reason: collision with root package name */
    final e<K, V> f7943f;

    /* renamed from: g  reason: collision with root package name */
    private g<K, V>.b f7944g;

    /* renamed from: h  reason: collision with root package name */
    private g<K, V>.c f7945h;

    static class a implements Comparator<Comparable> {
        a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        class a extends g<K, V>.d {
            a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        public void clear() {
            g.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.a((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            e<K, V> a2;
            if (!(obj instanceof Map.Entry) || (a2 = g.this.a((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.a((e) a2, true);
            return true;
        }

        public int size() {
            return g.this.f7941d;
        }
    }

    final class c extends AbstractSet<K> {

        class a extends g<K, V>.d {
            a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f7957g;
            }
        }

        c() {
        }

        public void clear() {
            g.this.clear();
        }

        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            return g.this.b(obj) != null;
        }

        public int size() {
            return g.this.f7941d;
        }
    }

    /* access modifiers changed from: private */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        e<K, V> f7948b;

        /* renamed from: c  reason: collision with root package name */
        e<K, V> f7949c = null;

        /* renamed from: d  reason: collision with root package name */
        int f7950d;

        d() {
            g gVar = g.this;
            this.f7948b = gVar.f7943f.f7955e;
            this.f7950d = gVar.f7942e;
        }

        /* access modifiers changed from: package-private */
        public final e<K, V> a() {
            e<K, V> eVar = this.f7948b;
            g gVar = g.this;
            if (eVar == gVar.f7943f) {
                throw new NoSuchElementException();
            } else if (gVar.f7942e == this.f7950d) {
                this.f7948b = eVar.f7955e;
                this.f7949c = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f7948b != g.this.f7943f;
        }

        public final void remove() {
            e<K, V> eVar = this.f7949c;
            if (eVar != null) {
                g.this.a((e) eVar, true);
                this.f7949c = null;
                this.f7950d = g.this.f7942e;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        e<K, V> f7952b;

        /* renamed from: c  reason: collision with root package name */
        e<K, V> f7953c;

        /* renamed from: d  reason: collision with root package name */
        e<K, V> f7954d;

        /* renamed from: e  reason: collision with root package name */
        e<K, V> f7955e;

        /* renamed from: f  reason: collision with root package name */
        e<K, V> f7956f;

        /* renamed from: g  reason: collision with root package name */
        final K f7957g;

        /* renamed from: h  reason: collision with root package name */
        V f7958h;

        /* renamed from: i  reason: collision with root package name */
        int f7959i;

        e() {
            this.f7957g = null;
            this.f7956f = this;
            this.f7955e = this;
        }

        e(e<K, V> eVar, K k2, e<K, V> eVar2, e<K, V> eVar3) {
            this.f7952b = eVar;
            this.f7957g = k2;
            this.f7959i = 1;
            this.f7955e = eVar2;
            this.f7956f = eVar3;
            eVar3.f7955e = this;
            eVar2.f7956f = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f7953c; eVar2 != null; eVar2 = eVar2.f7953c) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f7954d; eVar2 != null; eVar2 = eVar2.f7954d) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f7957g
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f7958h
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e.b.d.w.g.e.equals(java.lang.Object):boolean");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f7957g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f7958h;
        }

        public int hashCode() {
            K k2 = this.f7957g;
            int i2 = 0;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f7958h;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f7958h;
            this.f7958h = v;
            return v2;
        }

        public String toString() {
            return ((Object) this.f7957g) + "=" + ((Object) this.f7958h);
        }
    }

    public g() {
        this(f7938i);
    }

    public g(Comparator<? super K> comparator) {
        this.f7941d = 0;
        this.f7942e = 0;
        this.f7943f = new e<>();
        this.f7939b = comparator == null ? f7938i : comparator;
    }

    private void a(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f7953c;
        e<K, V> eVar3 = eVar.f7954d;
        e<K, V> eVar4 = eVar3.f7953c;
        e<K, V> eVar5 = eVar3.f7954d;
        eVar.f7954d = eVar4;
        if (eVar4 != null) {
            eVar4.f7952b = eVar;
        }
        a((e) eVar, (e) eVar3);
        eVar3.f7953c = eVar;
        eVar.f7952b = eVar3;
        int i2 = 0;
        eVar.f7959i = Math.max(eVar2 != null ? eVar2.f7959i : 0, eVar4 != null ? eVar4.f7959i : 0) + 1;
        int i3 = eVar.f7959i;
        if (eVar5 != null) {
            i2 = eVar5.f7959i;
        }
        eVar3.f7959i = Math.max(i3, i2) + 1;
    }

    private void a(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f7952b;
        eVar.f7952b = null;
        if (eVar2 != null) {
            eVar2.f7952b = eVar3;
        }
        if (eVar3 == null) {
            this.f7940c = eVar2;
        } else if (eVar3.f7953c == eVar) {
            eVar3.f7953c = eVar2;
        } else {
            eVar3.f7954d = eVar2;
        }
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void b(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f7953c;
        e<K, V> eVar3 = eVar.f7954d;
        e<K, V> eVar4 = eVar2.f7953c;
        e<K, V> eVar5 = eVar2.f7954d;
        eVar.f7953c = eVar5;
        if (eVar5 != null) {
            eVar5.f7952b = eVar;
        }
        a((e) eVar, (e) eVar2);
        eVar2.f7954d = eVar;
        eVar.f7952b = eVar2;
        int i2 = 0;
        eVar.f7959i = Math.max(eVar3 != null ? eVar3.f7959i : 0, eVar5 != null ? eVar5.f7959i : 0) + 1;
        int i3 = eVar.f7959i;
        if (eVar4 != null) {
            i2 = eVar4.f7959i;
        }
        eVar2.f7959i = Math.max(i3, i2) + 1;
    }

    private void b(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f7953c;
            e<K, V> eVar3 = eVar.f7954d;
            int i2 = 0;
            int i3 = eVar2 != null ? eVar2.f7959i : 0;
            int i4 = eVar3 != null ? eVar3.f7959i : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                e<K, V> eVar4 = eVar3.f7953c;
                e<K, V> eVar5 = eVar3.f7954d;
                int i6 = eVar5 != null ? eVar5.f7959i : 0;
                if (eVar4 != null) {
                    i2 = eVar4.f7959i;
                }
                int i7 = i2 - i6;
                if (i7 != -1 && (i7 != 0 || z)) {
                    b((e) eVar3);
                }
                a((e) eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 2) {
                e<K, V> eVar6 = eVar2.f7953c;
                e<K, V> eVar7 = eVar2.f7954d;
                int i8 = eVar7 != null ? eVar7.f7959i : 0;
                if (eVar6 != null) {
                    i2 = eVar6.f7959i;
                }
                int i9 = i2 - i8;
                if (i9 != 1 && (i9 != 0 || z)) {
                    a((e) eVar2);
                }
                b((e) eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 0) {
                eVar.f7959i = i3 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f7959i = Math.max(i3, i4) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f7952b;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public e<K, V> a(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public e<K, V> a(K k2, boolean z) {
        int i2;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f7939b;
        e<K, V> eVar2 = this.f7940c;
        if (eVar2 != null) {
            K k3 = comparator == f7938i ? k2 : null;
            while (true) {
                K k4 = eVar2.f7957g;
                i2 = k3 != null ? k3.compareTo(k4) : comparator.compare(k2, k4);
                if (i2 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i2 < 0 ? eVar2.f7953c : eVar2.f7954d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f7943f;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f7956f);
            if (i2 < 0) {
                eVar2.f7953c = eVar;
            } else {
                eVar2.f7954d = eVar;
            }
            b(eVar2, true);
        } else if (comparator != f7938i || (k2 instanceof Comparable)) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f7956f);
            this.f7940c = eVar;
        } else {
            throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
        }
        this.f7941d++;
        this.f7942e++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public e<K, V> a(Map.Entry<?, ?> entry) {
        e<K, V> a2 = a(entry.getKey());
        if (a2 != null && a(a2.f7958h, entry.getValue())) {
            return a2;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(e<K, V> eVar, boolean z) {
        int i2;
        if (z) {
            e<K, V> eVar2 = eVar.f7956f;
            eVar2.f7955e = eVar.f7955e;
            eVar.f7955e.f7956f = eVar2;
        }
        e<K, V> eVar3 = eVar.f7953c;
        e<K, V> eVar4 = eVar.f7954d;
        e<K, V> eVar5 = eVar.f7952b;
        int i3 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                a((e) eVar, (e) eVar3);
                eVar.f7953c = null;
            } else if (eVar4 != null) {
                a((e) eVar, (e) eVar4);
                eVar.f7954d = null;
            } else {
                a((e) eVar, (e) null);
            }
            b(eVar5, false);
            this.f7941d--;
            this.f7942e++;
            return;
        }
        e<K, V> b2 = eVar3.f7959i > eVar4.f7959i ? eVar3.b() : eVar4.a();
        a((e) b2, false);
        e<K, V> eVar6 = eVar.f7953c;
        if (eVar6 != null) {
            i2 = eVar6.f7959i;
            b2.f7953c = eVar6;
            eVar6.f7952b = b2;
            eVar.f7953c = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar7 = eVar.f7954d;
        if (eVar7 != null) {
            i3 = eVar7.f7959i;
            b2.f7954d = eVar7;
            eVar7.f7952b = b2;
            eVar.f7954d = null;
        }
        b2.f7959i = Math.max(i2, i3) + 1;
        a((e) eVar, (e) b2);
    }

    /* access modifiers changed from: package-private */
    public e<K, V> b(Object obj) {
        e<K, V> a2 = a(obj);
        if (a2 != null) {
            a((e) a2, true);
        }
        return a2;
    }

    public void clear() {
        this.f7940c = null;
        this.f7941d = 0;
        this.f7942e++;
        e<K, V> eVar = this.f7943f;
        eVar.f7956f = eVar;
        eVar.f7955e = eVar;
    }

    public boolean containsKey(Object obj) {
        return a(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V>.b bVar = this.f7944g;
        if (bVar != null) {
            return bVar;
        }
        g<K, V>.b bVar2 = new b();
        this.f7944g = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> a2 = a(obj);
        if (a2 != null) {
            return a2.f7958h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        g<K, V>.c cVar = this.f7945h;
        if (cVar != null) {
            return cVar;
        }
        g<K, V>.c cVar2 = new c();
        this.f7945h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        if (k2 != null) {
            e<K, V> a2 = a((Object) k2, true);
            V v2 = a2.f7958h;
            a2.f7958h = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> b2 = b(obj);
        if (b2 != null) {
            return b2.f7958h;
        }
        return null;
    }

    public int size() {
        return this.f7941d;
    }
}
