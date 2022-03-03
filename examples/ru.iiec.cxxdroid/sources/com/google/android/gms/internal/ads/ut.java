package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class ut implements Comparable<ut>, Map.Entry<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private final K f5777b;

    /* renamed from: c  reason: collision with root package name */
    private V f5778c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ nt f5779d;

    ut(nt ntVar, K k2, V v) {
        this.f5779d = ntVar;
        this.f5777b = k2;
        this.f5778c = v;
    }

    ut(nt ntVar, Map.Entry<K, V> entry) {
        this(ntVar, entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ut utVar) {
        return ((Comparable) getKey()).compareTo((Comparable) utVar.getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.f5777b, entry.getKey()) && a(this.f5778c, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f5777b;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f5778c;
    }

    public final int hashCode() {
        K k2 = this.f5777b;
        int i2 = 0;
        int hashCode = k2 == null ? 0 : k2.hashCode();
        V v = this.f5778c;
        if (v != null) {
            i2 = v.hashCode();
        }
        return hashCode ^ i2;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f5779d.f();
        V v2 = this.f5778c;
        this.f5778c = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5777b);
        String valueOf2 = String.valueOf(this.f5778c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
