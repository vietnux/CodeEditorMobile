package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class gq implements Iterator {

    /* renamed from: b  reason: collision with root package name */
    private int f4438b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final int f4439c = this.f4440d.size();

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ fq f4440d;

    gq(fq fqVar) {
        this.f4440d = fqVar;
    }

    private final byte a() {
        try {
            fq fqVar = this.f4440d;
            int i2 = this.f4438b;
            this.f4438b = i2 + 1;
            return fqVar.c(i2);
        } catch (IndexOutOfBoundsException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f4438b < this.f4439c;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
