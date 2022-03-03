package c.t;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class g0 extends f0 {

    /* renamed from: i  reason: collision with root package name */
    private static Method f2573i;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f2574j;

    g0() {
    }

    @SuppressLint({"PrivateApi"})
    private void a() {
        if (!f2574j) {
            try {
                f2573i = View.class.getDeclaredMethod("setLeftTopRightBottom", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                f2573i.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e2);
            }
            f2574j = true;
        }
    }

    @Override // c.t.h0
    public void a(View view, int i2, int i3, int i4, int i5) {
        a();
        Method method = f2573i;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
