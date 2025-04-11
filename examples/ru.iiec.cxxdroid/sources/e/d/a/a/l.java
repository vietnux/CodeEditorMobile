package e.d.a.a;

public class l {
    private boolean a = false;

    public final synchronized void a() {
        this.a = false;
    }

    public final synchronized boolean b() {
        return this.a;
    }

    public final synchronized void c() {
        this.a = true;
    }
}
