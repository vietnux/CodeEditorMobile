package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class vt implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private int f5845b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5846c;

    /* renamed from: d  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f5847d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ nt f5848e;

    private vt(nt ntVar) {
        this.f5848e = ntVar;
        this.f5845b = -1;
    }

    /* synthetic */ vt(nt ntVar, ot otVar) {
        this(ntVar);
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f5847d == null) {
            this.f5847d = this.f5848e.f5110d.entrySet().iterator();
        }
        return this.f5847d;
    }

    public final boolean hasNext() {
        return this.f5845b + 1 < this.f5848e.f5109c.size() || (!this.f5848e.f5110d.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f5846c = true;
        int i2 = this.f5845b + 1;
        this.f5845b = i2;
        return (Map.Entry) (i2 < this.f5848e.f5109c.size() ? this.f5848e.f5109c.get(this.f5845b) : a().next());
    }

    public final void remove() {
        if (this.f5846c) {
            this.f5846c = false;
            this.f5848e.f();
            if (this.f5845b < this.f5848e.f5109c.size()) {
                nt ntVar = this.f5848e;
                int i2 = this.f5845b;
                this.f5845b = i2 - 1;
                Object unused = ntVar.c(i2);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
