package com.google.android.gms.internal.ads;

import java.util.ListIterator;

final class hu implements ListIterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private ListIterator<String> f4562b = this.f4564d.f4442b.listIterator(this.f4563c);

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f4563c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ gu f4564d;

    hu(gu guVar, int i2) {
        this.f4564d = guVar;
        this.f4563c = i2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f4562b.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f4562b.hasPrevious();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator, java.util.ListIterator
    public final /* synthetic */ String next() {
        return this.f4562b.next();
    }

    public final int nextIndex() {
        return this.f4562b.nextIndex();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f4562b.previous();
    }

    public final int previousIndex() {
        return this.f4562b.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
