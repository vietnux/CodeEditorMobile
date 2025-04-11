package g.r.d;

public final class k implements d {

    /* renamed from: b  reason: collision with root package name */
    private final Class<?> f8627b;

    public k(Class<?> cls, String str) {
        i.c(cls, "jClass");
        i.c(str, "moduleName");
        this.f8627b = cls;
    }

    @Override // g.r.d.d
    public Class<?> a() {
        return this.f8627b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && i.a(a(), ((k) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
