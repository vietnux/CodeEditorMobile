package c.b.a.a;

import java.util.concurrent.Executor;

public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f1869c;
    private c a = this.f1870b;

    /* renamed from: b  reason: collision with root package name */
    private c f1870b = new b();

    /* renamed from: c.b.a.a.a$a  reason: collision with other inner class name */
    static class ExecutorC0035a implements Executor {
        ExecutorC0035a() {
        }

        public void execute(Runnable runnable) {
            a.b().b(runnable);
        }
    }

    static class b implements Executor {
        b() {
        }

        public void execute(Runnable runnable) {
            a.b().a(runnable);
        }
    }

    static {
        new ExecutorC0035a();
        new b();
    }

    private a() {
    }

    public static a b() {
        if (f1869c != null) {
            return f1869c;
        }
        synchronized (a.class) {
            if (f1869c == null) {
                f1869c = new a();
            }
        }
        return f1869c;
    }

    @Override // c.b.a.a.c
    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override // c.b.a.a.c
    public boolean a() {
        return this.a.a();
    }

    @Override // c.b.a.a.c
    public void b(Runnable runnable) {
        this.a.b(runnable);
    }
}
