package c.t;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public class z {
    private static Method a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2625b;

    private static void a() {
        if (!f2625b) {
            try {
                a = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                a.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e2);
            }
            f2625b = true;
        }
    }

    static void a(ViewGroup viewGroup, boolean z) {
        String str;
        Throwable e2;
        a();
        Method method = a;
        if (method != null) {
            try {
                method.invoke(viewGroup, Boolean.valueOf(z));
                return;
            } catch (IllegalAccessException e3) {
                e2 = e3;
                str = "Failed to invoke suppressLayout method";
            } catch (InvocationTargetException e4) {
                e2 = e4;
                str = "Error invoking suppressLayout method";
            }
        } else {
            return;
        }
        Log.i("ViewUtilsApi18", str, e2);
    }
}
