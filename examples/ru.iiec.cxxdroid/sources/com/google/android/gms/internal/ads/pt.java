package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class pt implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private int f5261b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f5262c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ nt f5263d;

    private pt(nt ntVar) {
        this.f5263d = ntVar;
        this.f5261b = this.f5263d.f5109c.size();
    }

    /* synthetic */ pt(nt ntVar, ot otVar) {
        this(ntVar);
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f5262c == null) {
            this.f5262c = this.f5263d.f5113g.entrySet().iterator();
        }
        return this.f5262c;
    }

    public final boolean hasNext() {
        int i2 = this.f5261b;
        return (i2 > 0 && i2 <= this.f5263d.f5109c.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object obj;
        if (a().hasNext()) {
            obj = a().next();
        } else {
            List list = this.f5263d.f5109c;
            int i2 = this.f5261b - 1;
            this.f5261b = i2;
            obj = list.get(i2);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
