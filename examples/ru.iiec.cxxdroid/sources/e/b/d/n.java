package e.b.d;

public class n extends RuntimeException {
    public n(String str) {
        super(str);
    }

    public n(String str, Throwable th) {
        super(str, th);
    }

    public n(Throwable th) {
        super(th);
    }
}
