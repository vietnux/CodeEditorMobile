package e.b.b.a.c.f;

/* access modifiers changed from: package-private */
public final class n<E> extends l<E> {

    /* renamed from: d  reason: collision with root package name */
    private final p<E> f7753d;

    n(p<E> pVar, int i2) {
        super(pVar.size(), i2);
        this.f7753d = pVar;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.f.l
    public final E a(int i2) {
        return this.f7753d.get(i2);
    }
}
