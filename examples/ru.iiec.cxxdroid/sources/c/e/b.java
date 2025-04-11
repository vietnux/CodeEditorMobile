package c.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f1946f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private static final Object[] f1947g = new Object[0];

    /* renamed from: h  reason: collision with root package name */
    private static Object[] f1948h;

    /* renamed from: i  reason: collision with root package name */
    private static int f1949i;

    /* renamed from: j  reason: collision with root package name */
    private static Object[] f1950j;

    /* renamed from: k  reason: collision with root package name */
    private static int f1951k;

    /* renamed from: b  reason: collision with root package name */
    private int[] f1952b;

    /* renamed from: c  reason: collision with root package name */
    Object[] f1953c;

    /* renamed from: d  reason: collision with root package name */
    int f1954d;

    /* renamed from: e  reason: collision with root package name */
    private f<E, E> f1955e;

    /* access modifiers changed from: package-private */
    public class a extends f<E, E> {
        a() {
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public int a(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public Object a(int i2, int i3) {
            return b.this.f1953c[i2];
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public E a(int i2, E e2) {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public void a() {
            b.this.clear();
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public void a(int i2) {
            b.this.d(i2);
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public void a(E e2, E e3) {
            b.this.add(e2);
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public int b(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public Map<E, E> b() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        @Override // c.e.f
        public int c() {
            return b.this.f1954d;
        }
    }

    public b() {
        this(0);
    }

    public b(int i2) {
        if (i2 == 0) {
            this.f1952b = f1946f;
            this.f1953c = f1947g;
        } else {
            f(i2);
        }
        this.f1954d = 0;
    }

    private int a(Object obj, int i2) {
        int i3 = this.f1954d;
        if (i3 == 0) {
            return -1;
        }
        int a2 = c.a(this.f1952b, i3, i2);
        if (a2 < 0 || obj.equals(this.f1953c[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f1952b[i4] == i2) {
            if (obj.equals(this.f1953c[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f1952b[i5] == i2) {
            if (obj.equals(this.f1953c[i5])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    private f<E, E> a() {
        if (this.f1955e == null) {
            this.f1955e = new a();
        }
        return this.f1955e;
    }

    private static void a(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f1951k < 10) {
                    objArr[0] = f1950j;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1950j = objArr;
                    f1951k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (f1949i < 10) {
                    objArr[0] = f1948h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1948h = objArr;
                    f1949i++;
                }
            }
        }
    }

    private int b() {
        int i2 = this.f1954d;
        if (i2 == 0) {
            return -1;
        }
        int a2 = c.a(this.f1952b, i2, 0);
        if (a2 < 0 || this.f1953c[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f1952b[i3] == 0) {
            if (this.f1953c[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f1952b[i4] == 0) {
            if (this.f1953c[i4] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    private void f(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                if (f1950j != null) {
                    Object[] objArr = f1950j;
                    this.f1953c = objArr;
                    f1950j = (Object[]) objArr[0];
                    this.f1952b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1951k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                if (f1948h != null) {
                    Object[] objArr2 = f1948h;
                    this.f1953c = objArr2;
                    f1948h = (Object[]) objArr2[0];
                    this.f1952b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1949i--;
                    return;
                }
            }
        }
        this.f1952b = new int[i2];
        this.f1953c = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = b();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = a(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.f1954d;
        if (i5 >= this.f1952b.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f1952b;
            Object[] objArr = this.f1953c;
            f(i6);
            int[] iArr2 = this.f1952b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1953c, 0, objArr.length);
            }
            a(iArr, objArr, this.f1954d);
        }
        int i7 = this.f1954d;
        if (i4 < i7) {
            int[] iArr3 = this.f1952b;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f1953c;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f1954d - i4);
        }
        this.f1952b[i4] = i2;
        this.f1953c[i4] = e2;
        this.f1954d++;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: c.e.b<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        c(this.f1954d + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public void c(int i2) {
        int[] iArr = this.f1952b;
        if (iArr.length < i2) {
            Object[] objArr = this.f1953c;
            f(i2);
            int i3 = this.f1954d;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f1952b, 0, i3);
                System.arraycopy(objArr, 0, this.f1953c, 0, this.f1954d);
            }
            a(iArr, objArr, this.f1954d);
        }
    }

    public void clear() {
        int i2 = this.f1954d;
        if (i2 != 0) {
            a(this.f1952b, this.f1953c, i2);
            this.f1952b = f1946f;
            this.f1953c = f1947g;
            this.f1954d = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public E d(int i2) {
        Object[] objArr = this.f1953c;
        E e2 = (E) objArr[i2];
        int i3 = this.f1954d;
        if (i3 <= 1) {
            a(this.f1952b, objArr, i3);
            this.f1952b = f1946f;
            this.f1953c = f1947g;
            this.f1954d = 0;
        } else {
            int[] iArr = this.f1952b;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                this.f1954d--;
                int i5 = this.f1954d;
                if (i2 < i5) {
                    int[] iArr2 = this.f1952b;
                    int i6 = i2 + 1;
                    System.arraycopy(iArr2, i6, iArr2, i2, i5 - i2);
                    Object[] objArr2 = this.f1953c;
                    System.arraycopy(objArr2, i6, objArr2, i2, this.f1954d - i2);
                }
                this.f1953c[this.f1954d] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.f1952b;
                Object[] objArr3 = this.f1953c;
                f(i4);
                this.f1954d--;
                if (i2 > 0) {
                    System.arraycopy(iArr3, 0, this.f1952b, 0, i2);
                    System.arraycopy(objArr3, 0, this.f1953c, 0, i2);
                }
                int i7 = this.f1954d;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr3, i8, this.f1952b, i2, i7 - i2);
                    System.arraycopy(objArr3, i8, this.f1953c, i2, this.f1954d - i2);
                }
            }
        }
        return e2;
    }

    public E e(int i2) {
        return (E) this.f1953c[i2];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1954d; i2++) {
                try {
                    if (!set.contains(e(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f1952b;
        int i2 = this.f1954d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? b() : a(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f1954d <= 0;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        return a().e().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        d(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f1954d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f1953c[i2])) {
                d(i2);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f1954d;
    }

    public Object[] toArray() {
        int i2 = this.f1954d;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f1953c, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1954d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1954d));
        }
        System.arraycopy(this.f1953c, 0, tArr, 0, this.f1954d);
        int length = tArr.length;
        int i2 = this.f1954d;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1954d * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1954d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E e2 = e(i2);
            if (e2 != this) {
                sb.append((Object) e2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
