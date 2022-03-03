package f.a.a.a.n.c.o;

public class e {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8488b;

    /* renamed from: c  reason: collision with root package name */
    private final d f8489c;

    public e(int i2, a aVar, d dVar) {
        this.a = i2;
        this.f8488b = aVar;
        this.f8489c = dVar;
    }

    public e(a aVar, d dVar) {
        this(0, aVar, dVar);
    }

    public long a() {
        return this.f8488b.a(this.a);
    }

    public e b() {
        return new e(this.f8488b, this.f8489c);
    }

    public e c() {
        return new e(this.a + 1, this.f8488b, this.f8489c);
    }
}
