package e.b.b.a.c.f;

import java.util.NoSuchElementException;

abstract class l<E> extends s<E> {

    /* renamed from: b  reason: collision with root package name */
    private final int f7750b;

    /* renamed from: c  reason: collision with root package name */
    private int f7751c;

    protected l(int i2, int i3) {
        j.b(i3, i2, "index");
        this.f7750b = i2;
        this.f7751c = i3;
    }

    /* access modifiers changed from: protected */
    public abstract E a(int i2);

    public final boolean hasNext() {
        return this.f7751c < this.f7750b;
    }

    public final boolean hasPrevious() {
        return this.f7751c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i2 = this.f7751c;
            this.f7751c = i2 + 1;
            return a(i2);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f7751c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i2 = this.f7751c - 1;
            this.f7751c = i2;
            return a(i2);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f7751c - 1;
    }
}
