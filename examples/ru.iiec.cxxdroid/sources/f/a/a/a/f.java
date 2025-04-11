package f.a.a.a;

public interface f<T> {
    public static final f a = new b();

    public static class b implements f<Object> {
        private b() {
        }

        @Override // f.a.a.a.f
        public void a(Exception exc) {
        }

        @Override // f.a.a.a.f
        public void a(Object obj) {
        }
    }

    void a(Exception exc);

    void a(T t);
}
