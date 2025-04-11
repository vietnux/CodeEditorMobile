package c.t;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.View;
import c.h.l.b0;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public class d0 {
    private static final h0 a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f2556b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2557c;

    /* renamed from: d  reason: collision with root package name */
    static final Property<View, Float> f2558d = new a(Float.class, "translationAlpha");

    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(d0.c(view));
        }

        /* renamed from: a */
        public void set(View view, Float f2) {
            d0.a(view, f2.floatValue());
        }
    }

    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return b0.k(view);
        }

        /* renamed from: a */
        public void set(View view, Rect rect) {
            b0.a(view, rect);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2 >= 22 ? new g0() : i2 >= 21 ? new f0() : i2 >= 19 ? new e0() : new h0();
        new b(Rect.class, "clipBounds");
    }

    private static void a() {
        if (!f2557c) {
            try {
                f2556b = View.class.getDeclaredField("mViewFlags");
                f2556b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f2557c = true;
        }
    }

    static void a(View view) {
        a.a(view);
    }

    static void a(View view, float f2) {
        a.a(view, f2);
    }

    static void a(View view, int i2) {
        a();
        Field field = f2556b;
        if (field != null) {
            try {
                f2556b.setInt(view, i2 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    static void a(View view, int i2, int i3, int i4, int i5) {
        a.a(view, i2, i3, i4, i5);
    }

    static void a(View view, Matrix matrix) {
        a.a(view, matrix);
    }

    static c0 b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new b0(view) : a0.c(view);
    }

    static void b(View view, Matrix matrix) {
        a.b(view, matrix);
    }

    static float c(View view) {
        return a.b(view);
    }

    static l0 d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new k0(view) : new j0(view.getWindowToken());
    }

    static void e(View view) {
        a.c(view);
    }
}
