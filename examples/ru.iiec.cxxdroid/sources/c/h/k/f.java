package c.h.k;

public class f<T> implements e<T> {
    private final Object[] a;

    /* renamed from: b  reason: collision with root package name */
    private int f2369b;

    public f(int i2) {
        if (i2 > 0) {
            this.a = new Object[i2];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean b(T t) {
        for (int i2 = 0; i2 < this.f2369b; i2++) {
            if (this.a[i2] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // c.h.k.e
    public T a() {
        int i2 = this.f2369b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.a;
        T t = (T) objArr[i3];
        objArr[i3] = null;
        this.f2369b = i2 - 1;
        return t;
    }

    @Override // c.h.k.e
    public boolean a(T t) {
        if (!b(t)) {
            int i2 = this.f2369b;
            Object[] objArr = this.a;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = t;
            this.f2369b = i2 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
