package g.t;

import g.r.c.l;
import g.t.g;

public interface h<T, V> extends g<V>, l<T, V> {

    public interface a<T, V> extends g.b<V>, l<T, V> {
    }

    a<T, V> b();

    V get(T t);
}
