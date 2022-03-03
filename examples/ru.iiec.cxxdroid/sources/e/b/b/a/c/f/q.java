package e.b.b.a.c.f;

/* access modifiers changed from: package-private */
public final class q<E> extends p<E> {

    /* renamed from: e  reason: collision with root package name */
    static final p<Object> f7758e = new q(new Object[0], 0);

    /* renamed from: d  reason: collision with root package name */
    final transient Object[] f7759d;

    q(Object[] objArr, int i2) {
        this.f7759d = objArr;
    }

    /* access modifiers changed from: package-private */
    @Override // e.b.b.a.c.f.m, e.b.b.a.c.f.p
    public final int a(Object[] objArr, int i2) {
        System.arraycopy(this.f7759d, 0, objArr, 0, 0);
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // e.b.b.a.c.f.m
    public final int b() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // e.b.b.a.c.f.m
    public final int c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // e.b.b.a.c.f.m
    public final Object[] d() {
        return this.f7759d;
    }

    @Override // java.util.List
    public final E get(int i2) {
        j.a(i2, 0, "index");
        return (E) this.f7759d[i2];
    }

    public final int size() {
        return 0;
    }
}
