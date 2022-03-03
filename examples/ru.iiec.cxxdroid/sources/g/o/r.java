package g.o;

import g.r.d.r.a;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class r implements ListIterator, a {

    /* renamed from: b  reason: collision with root package name */
    public static final r f8607b = new r();

    private r() {
    }

    @Override // java.util.ListIterator
    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public Void next() {
        throw new NoSuchElementException();
    }

    public int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public Void previous() {
        throw new NoSuchElementException();
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
