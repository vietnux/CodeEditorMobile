package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class gu extends AbstractList<String> implements cs, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private final cs f4442b;

    public gu(cs csVar) {
        this.f4442b = csVar;
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final void a(fq fqVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final Object b(int i2) {
        return this.f4442b.b(i2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ String get(int i2) {
        return (String) this.f4442b.get(i2);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new iu(this);
    }

    @Override // java.util.List, java.util.AbstractList
    public final ListIterator<String> listIterator(int i2) {
        return new hu(this, i2);
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final List<?> r() {
        return this.f4442b.r();
    }

    @Override // com.google.android.gms.internal.ads.cs
    public final cs s() {
        return this;
    }

    public final int size() {
        return this.f4442b.size();
    }
}
