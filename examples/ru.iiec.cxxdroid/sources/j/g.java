package j;

public abstract class g implements r {

    /* renamed from: b  reason: collision with root package name */
    private final r f9481b;

    public g(r rVar) {
        if (rVar != null) {
            this.f9481b = rVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // j.r
    public void a(c cVar, long j2) {
        this.f9481b.a(cVar, j2);
    }

    @Override // j.r
    public t b() {
        return this.f9481b.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, j.r
    public void close() {
        this.f9481b.close();
    }

    @Override // j.r, java.io.Flushable
    public void flush() {
        this.f9481b.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f9481b.toString() + ")";
    }
}
