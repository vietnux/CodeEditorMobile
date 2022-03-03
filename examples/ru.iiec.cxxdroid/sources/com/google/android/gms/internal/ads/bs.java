package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class bs extends zp<String> implements cs, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final bs f3930d;

    /* renamed from: c  reason: collision with root package name */
    private final List<Object> f3931c;

    static {
        bs bsVar = new bs();
        f3930d = bsVar;
        bsVar.p();
    }

    public bs() {
        this(10);
    }

    public bs(int i2) {
        this(new ArrayList(i2));
    }

    private bs(ArrayList<Object> arrayList) {
        this.f3931c = arrayList;
    }

    private static String a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof fq ? ((fq) obj).c() : or.c((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.rr
    public final /* synthetic */ rr a(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f3931c);
            return new bs(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final void a(fq fqVar) {
        a();
        this.f3931c.add(fqVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i2, Object obj) {
        a();
        this.f3931c.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, com.google.android.gms.internal.ads.zp, java.util.AbstractList
    public final boolean addAll(int i2, Collection<? extends String> collection) {
        a();
        if (collection instanceof cs) {
            collection = ((cs) collection).r();
        }
        boolean addAll = this.f3931c.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.ads.zp, java.util.Collection
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final Object b(int i2) {
        return this.f3931c.get(i2);
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final void clear() {
        a();
        this.f3931c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i2) {
        Object obj = this.f3931c.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof fq) {
            fq fqVar = (fq) obj;
            String c2 = fqVar.c();
            if (fqVar.d()) {
                this.f3931c.set(i2, c2);
            }
            return c2;
        }
        byte[] bArr = (byte[]) obj;
        String c3 = or.c(bArr);
        if (or.b(bArr)) {
            this.f3931c.set(i2, c3);
        }
        return c3;
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final List<?> r() {
        return Collections.unmodifiableList(this.f3931c);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i2) {
        a();
        Object remove = this.f3931c.remove(i2);
        ((AbstractList) this).modCount++;
        return a(remove);
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final cs s() {
        return q() ? new gu(this) : this;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i2, Object obj) {
        a();
        return a(this.f3931c.set(i2, (String) obj));
    }

    public final int size() {
        return this.f3931c.size();
    }
}
