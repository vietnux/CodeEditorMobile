package e.b.b.a.c.f;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

public abstract class m<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private static final Object[] f7752b = new Object[0];

    m() {
    }

    /* access modifiers changed from: package-private */
    public abstract int a(Object[] objArr, int i2);

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract int b();

    /* access modifiers changed from: package-private */
    public abstract int c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract Object[] d();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f7752b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        if (tArr != null) {
            int size = size();
            int length = tArr.length;
            if (length < size) {
                Object[] d2 = d();
                if (d2 != null) {
                    return (T[]) Arrays.copyOfRange(d2, c(), b(), tArr.getClass());
                }
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            } else if (length > size) {
                tArr[size] = null;
            }
            a(tArr, 0);
            return tArr;
        }
        throw null;
    }
}
