package com.google.android.gms.internal.ads;

import java.util.Map;

final class xr<K> implements Map.Entry<K, Object> {

    /* renamed from: b  reason: collision with root package name */
    private Map.Entry<K, vr> f6048b;

    private xr(Map.Entry<K, vr> entry) {
        this.f6048b = entry;
    }

    public final vr a() {
        return this.f6048b.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f6048b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f6048b.getValue() == null) {
            return null;
        }
        vr.c();
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof ss) {
            return this.f6048b.getValue().a((ss) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
