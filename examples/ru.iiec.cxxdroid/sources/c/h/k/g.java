package c.h.k;

public class g<T> extends f<T> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f2370c = new Object();

    public g(int i2) {
        super(i2);
    }

    @Override // c.h.k.f, c.h.k.e
    public T a() {
        T t;
        synchronized (this.f2370c) {
            t = (T) super.a();
        }
        return t;
    }

    @Override // c.h.k.f, c.h.k.e
    public boolean a(T t) {
        boolean a;
        synchronized (this.f2370c) {
            a = super.a(t);
        }
        return a;
    }
}
