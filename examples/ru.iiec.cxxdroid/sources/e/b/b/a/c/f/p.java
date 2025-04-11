package e.b.b.a.c.f;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class p<E> extends m<E> implements List<E>, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private static final s<Object> f7757c = new n(q.f7758e, 0);

    p() {
    }

    public static <E> p<E> e() {
        return (p<E>) q.f7758e;
    }

    /* access modifiers changed from: package-private */
    @Override // e.b.b.a.c.f.m
    public int a(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    /* renamed from: a */
    public p<E> subList(int i2, int i3) {
        j.a(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? (p<E>) q.f7758e : new o(this, i2, i4);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final s<E> listIterator(int i2) {
        j.b(i2, size(), "index");
        return isEmpty() ? (s<E>) f7757c : new n(this, i2);
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 != r6) goto L_0x0006
        L_0x0004:
            r1 = 1
            goto L_0x005c
        L_0x0006:
            boolean r2 = r7 instanceof java.util.List
            if (r2 != 0) goto L_0x000b
            goto L_0x005c
        L_0x000b:
            java.util.List r7 = (java.util.List) r7
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0018
            goto L_0x005c
        L_0x0018:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L_0x0031
            r3 = 0
        L_0x001d:
            if (r3 >= r2) goto L_0x0004
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = e.b.b.a.c.f.i.a(r4, r5)
            if (r4 != 0) goto L_0x002e
            goto L_0x005c
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x0031:
            java.util.Iterator r2 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x0039:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0055
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L_0x0046
            goto L_0x005c
        L_0x0046:
            java.lang.Object r3 = r2.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = e.b.b.a.c.f.i.a(r3, r4)
            if (r3 != 0) goto L_0x0039
            goto L_0x005c
        L_0x0055:
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x005c
            goto L_0x0004
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.f.p.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }
}
