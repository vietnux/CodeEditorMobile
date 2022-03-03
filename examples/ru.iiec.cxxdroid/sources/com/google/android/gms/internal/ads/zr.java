package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class zr<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f6217b;

    public zr(Iterator<Map.Entry<K, Object>> it) {
        this.f6217b = it;
    }

    public final boolean hasNext() {
        return this.f6217b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f6217b.next();
        return next.getValue() instanceof vr ? new xr(next) : next;
    }

    public final void remove() {
        this.f6217b.remove();
    }
}
