package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class iu implements Iterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<String> f4646b = this.f4647c.f4442b.iterator();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ gu f4647c;

    iu(gu guVar) {
        this.f4647c = guVar;
    }

    public final boolean hasNext() {
        return this.f4646b.hasNext();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f4646b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
