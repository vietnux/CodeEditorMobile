package c.t;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class f0 extends e0 {

    /* renamed from: e  reason: collision with root package name */
    private static Method f2569e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f2570f;

    /* renamed from: g  reason: collision with root package name */
    private static Method f2571g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f2572h;

    f0() {
    }

    private void a() {
        if (!f2570f) {
            try {
                f2569e = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
                f2569e.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e2);
            }
            f2570f = true;
        }
    }

    private void b() {
        if (!f2572h) {
            try {
                f2571g = View.class.getDeclaredMethod("transformMatrixToLocal", Matrix.class);
                f2571g.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e2);
            }
            f2572h = true;
        }
    }

    @Override // c.t.h0
    public void a(View view, Matrix matrix) {
        a();
        Method method = f2569e;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    @Override // c.t.h0
    public void b(View view, Matrix matrix) {
        b();
        Method method = f2571g;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
