package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* access modifiers changed from: package-private */
public class nt<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private final int f5108b;

    /* renamed from: c  reason: collision with root package name */
    private List<ut> f5109c;

    /* renamed from: d  reason: collision with root package name */
    private Map<K, V> f5110d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5111e;

    /* renamed from: f  reason: collision with root package name */
    private volatile wt f5112f;

    /* renamed from: g  reason: collision with root package name */
    private Map<K, V> f5113g;

    /* renamed from: h  reason: collision with root package name */
    private volatile qt f5114h;

    private nt(int i2) {
        this.f5108b = i2;
        this.f5109c = Collections.emptyList();
        this.f5110d = Collections.emptyMap();
        this.f5113g = Collections.emptyMap();
    }

    /* synthetic */ nt(int i2, ot otVar) {
        this(i2);
    }

    private final int a(K k2) {
        int size = this.f5109c.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo((Comparable) this.f5109c.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo((Comparable) this.f5109c.get(i3).getKey());
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    static <FieldDescriptorType extends gr<FieldDescriptorType>> nt<FieldDescriptorType, Object> b(int i2) {
        return new ot(i2);
    }

    /* access modifiers changed from: private */
    public final V c(int i2) {
        f();
        V v = (V) this.f5109c.remove(i2).getValue();
        if (!this.f5110d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            this.f5109c.add(new ut(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* access modifiers changed from: private */
    public final void f() {
        if (this.f5111e) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> g() {
        f();
        if (this.f5110d.isEmpty() && !(this.f5110d instanceof TreeMap)) {
            this.f5110d = new TreeMap();
            this.f5113g = ((TreeMap) this.f5110d).descendingMap();
        }
        return (SortedMap) this.f5110d;
    }

    /* renamed from: a */
    public final V put(K k2, V v) {
        f();
        int a = a(k2);
        if (a >= 0) {
            return (V) this.f5109c.get(a).setValue(v);
        }
        f();
        if (this.f5109c.isEmpty() && !(this.f5109c instanceof ArrayList)) {
            this.f5109c = new ArrayList(this.f5108b);
        }
        int i2 = -(a + 1);
        if (i2 >= this.f5108b) {
            return g().put(k2, v);
        }
        int size = this.f5109c.size();
        int i3 = this.f5108b;
        if (size == i3) {
            ut remove = this.f5109c.remove(i3 - 1);
            g().put((K) ((Comparable) remove.getKey()), (V) remove.getValue());
        }
        this.f5109c.add(i2, new ut(this, k2, v));
        return null;
    }

    public final Map.Entry<K, V> a(int i2) {
        return this.f5109c.get(i2);
    }

    public final boolean a() {
        return this.f5111e;
    }

    public void b() {
        if (!this.f5111e) {
            this.f5110d = this.f5110d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f5110d);
            this.f5113g = this.f5113g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f5113g);
            this.f5111e = true;
        }
    }

    public final int c() {
        return this.f5109c.size();
    }

    public void clear() {
        f();
        if (!this.f5109c.isEmpty()) {
            this.f5109c.clear();
        }
        if (!this.f5110d.isEmpty()) {
            this.f5110d.clear();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.nt<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f5110d.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.f5110d.isEmpty() ? rt.a() : this.f5110d.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> e() {
        if (this.f5114h == null) {
            this.f5114h = new qt(this, null);
        }
        return this.f5114h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f5112f == null) {
            this.f5112f = new wt(this, null);
        }
        return this.f5112f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt)) {
            return super.equals(obj);
        }
        nt ntVar = (nt) obj;
        int size = size();
        if (size != ntVar.size()) {
            return false;
        }
        int c2 = c();
        if (c2 != ntVar.c()) {
            return entrySet().equals(ntVar.entrySet());
        }
        for (int i2 = 0; i2 < c2; i2++) {
            if (!a(i2).equals(ntVar.a(i2))) {
                return false;
            }
        }
        if (c2 != size) {
            return this.f5110d.equals(ntVar.f5110d);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.nt<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        return a >= 0 ? (V) this.f5109c.get(a).getValue() : this.f5110d.get(comparable);
    }

    public int hashCode() {
        int c2 = c();
        int i2 = 0;
        for (int i3 = 0; i3 < c2; i3++) {
            i2 += this.f5109c.get(i3).hashCode();
        }
        return this.f5110d.size() > 0 ? i2 + this.f5110d.hashCode() : i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.nt<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return (V) c(a);
        }
        if (this.f5110d.isEmpty()) {
            return null;
        }
        return this.f5110d.remove(comparable);
    }

    public int size() {
        return this.f5109c.size() + this.f5110d.size();
    }
}
