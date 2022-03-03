package j;

public abstract class h implements s {

    /* renamed from: b  reason: collision with root package name */
    private final s f9482b;

    public h(s sVar) {
        if (sVar != null) {
            this.f9482b = sVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // j.s
    public long b(c cVar, long j2) {
        return this.f9482b.b(cVar, j2);
    }

    @Override // j.s
    public t b() {
        return this.f9482b.b();
    }

    public final s c() {
        return this.f9482b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, j.s
    public void close() {
        this.f9482b.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f9482b.toString() + ")";
    }
}
