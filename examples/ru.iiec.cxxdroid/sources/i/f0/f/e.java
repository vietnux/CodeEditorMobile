package i.f0.f;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class e extends RuntimeException {

    /* renamed from: c  reason: collision with root package name */
    private static final Method f8871c;

    /* renamed from: b  reason: collision with root package name */
    private IOException f8872b;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        f8871c = method;
    }

    public e(IOException iOException) {
        super(iOException);
        this.f8872b = iOException;
    }

    private void a(IOException iOException, IOException iOException2) {
        Method method = f8871c;
        if (method != null) {
            try {
                method.invoke(iOException, iOException2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public void a(IOException iOException) {
        a(iOException, this.f8872b);
        this.f8872b = iOException;
    }

    public IOException b() {
        return this.f8872b;
    }
}
