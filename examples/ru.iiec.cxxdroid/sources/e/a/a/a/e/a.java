package e.a.a.a.e;

public class a<T> implements b<T> {
    private final String a;

    public a(String str) {
        this.a = str;
    }

    @Override // e.a.a.a.e.b
    public boolean a() {
        return true;
    }

    @Override // e.a.a.a.e.b
    public String b() {
        return this.a;
    }

    @Override // e.a.a.a.e.b
    public T get() {
        throw new RuntimeException(b());
    }
}
