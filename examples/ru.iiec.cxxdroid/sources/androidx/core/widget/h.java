package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import c.h.l.b0;
import c.h.l.g;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class h {
    private static Method a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1123b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f1124c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f1125d;

    static class a {
        static void a(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
            popupWindow.showAsDropDown(view, i2, i3, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {
        static void a(PopupWindow popupWindow, int i2) {
            popupWindow.setWindowLayoutType(i2);
        }

        static void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }
    }

    public static void a(PopupWindow popupWindow, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.a(popupWindow, i2);
            return;
        }
        if (!f1123b) {
            try {
                a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                a.setAccessible(true);
            } catch (Exception unused) {
            }
            f1123b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i2));
            } catch (Exception unused2) {
            }
        }
    }

    public static void a(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 19) {
            a.a(popupWindow, view, i2, i3, i4);
            return;
        }
        if ((g.a(i4, b0.r(view)) & 7) == 5) {
            i2 -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i2, i3);
    }

    public static void a(PopupWindow popupWindow, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            b.a(popupWindow, z);
        } else if (i2 >= 21) {
            if (!f1125d) {
                try {
                    f1124c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f1124c.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
                }
                f1125d = true;
            }
            Field field = f1124c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e3) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
                }
            }
        }
    }
}
