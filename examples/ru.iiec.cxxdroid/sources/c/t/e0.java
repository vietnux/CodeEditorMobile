package c.t;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class e0 extends h0 {
    private static Method a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2566b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f2567c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f2568d;

    e0() {
    }

    private void a() {
        if (!f2568d) {
            try {
                f2567c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f2567c.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e2);
            }
            f2568d = true;
        }
    }

    private void b() {
        if (!f2566b) {
            try {
                a = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                a.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e2);
            }
            f2566b = true;
        }
    }

    @Override // c.t.h0
    public void a(View view) {
    }

    @Override // c.t.h0
    public void a(View view, float f2) {
        b();
        Method method = a;
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(f2));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        } else {
            view.setAlpha(f2);
        }
    }

    @Override // c.t.h0
    public float b(View view) {
        a();
        Method method = f2567c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return super.b(view);
    }

    @Override // c.t.h0
    public void c(View view) {
    }
}
