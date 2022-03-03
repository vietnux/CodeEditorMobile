package g.q;

import java.io.Closeable;

public final class a {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                g.a.a(th, th2);
            }
        }
    }
}
