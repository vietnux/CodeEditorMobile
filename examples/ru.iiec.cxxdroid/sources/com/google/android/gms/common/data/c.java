package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.y;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class c<T> implements Iterator<T> {

    /* renamed from: b  reason: collision with root package name */
    protected final b<T> f3601b;

    /* renamed from: c  reason: collision with root package name */
    protected int f3602c = -1;

    public c(b<T> bVar) {
        y.a(bVar);
        this.f3601b = bVar;
    }

    public boolean hasNext() {
        return this.f3602c < this.f3601b.getCount() - 1;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            b<T> bVar = this.f3601b;
            int i2 = this.f3602c + 1;
            this.f3602c = i2;
            return bVar.get(i2);
        }
        int i3 = this.f3602c;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i3);
        throw new NoSuchElementException(sb.toString());
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
