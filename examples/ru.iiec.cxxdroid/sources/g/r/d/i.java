package g.r.d;

import g.m;
import java.util.Arrays;

public class i {
    private i() {
    }

    private static String a(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static String a(String str, Object obj) {
        return str + obj;
    }

    private static <T extends Throwable> T a(T t) {
        a((Throwable) t, i.class.getName());
        return t;
    }

    static <T extends Throwable> T a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t;
    }

    public static void a() {
        NullPointerException nullPointerException = new NullPointerException();
        a((Throwable) nullPointerException);
        throw nullPointerException;
    }

    public static void a(Object obj) {
        if (obj == null) {
            a();
            throw null;
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(str + " must not be null");
            a((Throwable) illegalStateException);
            throw illegalStateException;
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str + " must not be null");
            a((Throwable) nullPointerException);
            throw nullPointerException;
        }
    }

    private static void b(String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a(str));
        a((Throwable) illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            c(str);
            throw null;
        }
    }

    private static void c(String str) {
        NullPointerException nullPointerException = new NullPointerException(a(str));
        a((Throwable) nullPointerException);
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            b(str);
            throw null;
        }
    }

    public static void d(String str) {
        m mVar = new m(str);
        a((Throwable) mVar);
        throw mVar;
    }

    public static void e(String str) {
        d("lateinit property " + str + " has not been initialized");
        throw null;
    }
}
