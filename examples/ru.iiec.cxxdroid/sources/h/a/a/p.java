package h.a.a;

/* access modifiers changed from: package-private */
public abstract class p<T> {
    private boolean a;

    /* renamed from: b  reason: collision with root package name */
    private T f8697b;

    p() {
    }

    public static <T> p<T>[] a(int i2) {
        return new p[i2];
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    public final T b() {
        if (!this.a) {
            this.f8697b = a();
            this.a = true;
        }
        return this.f8697b;
    }
}
