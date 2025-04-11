package h.b.a.c;

public class f extends Exception {
    public f(String str) {
        super(str);
    }

    public f(String str, Throwable th) {
        super(str, th);
    }

    public f(String str, Object... objArr) {
        super(String.format(str, objArr));
    }
}
