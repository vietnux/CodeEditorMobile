package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class ft<E> extends zp<E> {

    /* renamed from: d  reason: collision with root package name */
    private static final ft<Object> f4352d;

    /* renamed from: c  reason: collision with root package name */
    private final List<E> f4353c;

    static {
        ft<Object> ftVar = new ft<>();
        f4352d = ftVar;
        ftVar.p();
    }

    ft() {
        this(new ArrayList(10));
    }

    private ft(List<E> list) {
        this.f4353c = list;
    }

    public static <E> ft<E> b() {
        return (ft<E>) f4352d;
    }

    @Override // com.google.android.gms.internal.ads.rr
    public final /* synthetic */ rr a(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f4353c);
            return new ft(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final void add(int i2, E e2) {
        a();
        this.f4353c.add(i2, e2);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.AbstractList
    public final E get(int i2) {
        return this.f4353c.get(i2);
    }

    @Override // java.util.List, java.util.AbstractList
    public final E remove(int i2) {
        a();
        E remove = this.f4353c.remove(i2);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // java.util.List, java.util.AbstractList
    public final E set(int i2, E e2) {
        a();
        E e3 = this.f4353c.set(i2, e2);
        ((AbstractList) this).modCount++;
        return e3;
    }

    public final int size() {
        return this.f4353c.size();
    }
}
