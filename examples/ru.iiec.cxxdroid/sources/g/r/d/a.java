package g.r.d;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class a<T> implements Iterator<T>, g.r.d.r.a {

    /* renamed from: b  reason: collision with root package name */
    private int f8611b;

    /* renamed from: c  reason: collision with root package name */
    private final T[] f8612c;

    public a(T[] tArr) {
        i.c(tArr, "array");
        this.f8612c = tArr;
    }

    public boolean hasNext() {
        return this.f8611b < this.f8612c.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f8612c;
            int i2 = this.f8611b;
            this.f8611b = i2 + 1;
            return tArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f8611b--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
