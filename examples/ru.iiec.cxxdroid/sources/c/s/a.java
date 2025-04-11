package c.s;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class a {
    private static long a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f2534b;

    public static void a() {
        if (Build.VERSION.SDK_INT >= 18) {
            b.a();
        }
    }

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            b.a(str);
        }
    }

    private static void a(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    public static boolean b() {
        try {
            if (f2534b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return c();
    }

    private static boolean c() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f2534b == null) {
                    a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    f2534b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean) f2534b.invoke(null, Long.valueOf(a))).booleanValue();
            } catch (Exception e2) {
                a("isTagEnabled", e2);
            }
        }
        return false;
    }
}
