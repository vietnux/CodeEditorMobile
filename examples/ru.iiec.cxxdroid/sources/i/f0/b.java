package i.f0;

public abstract class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    protected final String f8802b;

    public b(String str, Object... objArr) {
        this.f8802b = c.a(str, objArr);
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f8802b);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
