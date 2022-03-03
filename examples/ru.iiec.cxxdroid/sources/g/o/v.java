package g.o;

import g.r.d.r.a;
import java.util.Iterator;

public abstract class v implements Iterator<Integer>, a {
    public abstract int a();

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
