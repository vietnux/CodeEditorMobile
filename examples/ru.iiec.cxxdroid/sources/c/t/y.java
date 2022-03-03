package c.t;

import android.animation.LayoutTransition;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public class y {
    private static LayoutTransition a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f2621b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2622c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f2623d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f2624e;

    /* access modifiers changed from: package-private */
    public static class a extends LayoutTransition {
        a() {
        }

        public boolean isChangingLayout() {
            return true;
        }
    }

    private static void a(LayoutTransition layoutTransition) {
        if (!f2624e) {
            try {
                f2623d = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f2623d.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f2624e = true;
        }
        Method method = f2623d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.view.ViewGroup r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: c.t.y.a(android.view.ViewGroup, boolean):void");
    }
}
