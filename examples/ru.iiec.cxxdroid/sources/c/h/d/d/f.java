package c.h.d.d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class f {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<b, SparseArray<a>> f2284b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f2285c = new Object();

    /* access modifiers changed from: private */
    public static class a {
        final ColorStateList a;

        /* renamed from: b  reason: collision with root package name */
        final Configuration f2286b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.f2286b = configuration;
        }
    }

    /* access modifiers changed from: private */
    public static final class b {
        final Resources a;

        /* renamed from: b  reason: collision with root package name */
        final Resources.Theme f2287b;

        b(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.f2287b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && c.h.k.c.a(this.f2287b, bVar.f2287b);
        }

        public int hashCode() {
            return c.h.k.c.a(this.a, this.f2287b);
        }
    }

    public static abstract class c {

        /* access modifiers changed from: package-private */
        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Typeface f2288b;

            a(Typeface typeface) {
                this.f2288b = typeface;
            }

            public void run() {
                c.this.a(this.f2288b);
            }
        }

        /* access modifiers changed from: package-private */
        public class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f2290b;

            b(int i2) {
                this.f2290b = i2;
            }

            public void run() {
                c.this.a(this.f2290b);
            }
        }

        public static Handler a(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public abstract void a(int i2);

        public final void a(int i2, Handler handler) {
            a(handler).post(new b(i2));
        }

        public abstract void a(Typeface typeface);

        public final void a(Typeface typeface, Handler handler) {
            a(handler).post(new a(typeface));
        }
    }

    public static final class d {

        static class a {
            private static final Object a = new Object();

            /* renamed from: b  reason: collision with root package name */
            private static Method f2292b;

            /* renamed from: c  reason: collision with root package name */
            private static boolean f2293c;

            static void a(Resources.Theme theme) {
                synchronized (a) {
                    if (!f2293c) {
                        try {
                            f2292b = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f2292b.setAccessible(true);
                        } catch (NoSuchMethodException e2) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                        }
                        f2293c = true;
                    }
                    if (f2292b != null) {
                        try {
                            f2292b.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                            f2292b = null;
                        }
                    }
                }
            }
        }

        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                b.a(theme);
            } else if (i2 >= 23) {
                a.a(theme);
            }
        }
    }

    public static ColorStateList a(Resources resources, int i2, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i2, theme);
        }
        b bVar = new b(resources, theme);
        ColorStateList a2 = a(bVar, i2);
        if (a2 != null) {
            return a2;
        }
        ColorStateList c2 = c(resources, i2, theme);
        if (c2 == null) {
            return resources.getColorStateList(i2);
        }
        a(bVar, i2, c2);
        return c2;
    }

    private static ColorStateList a(b bVar, int i2) {
        a aVar;
        synchronized (f2285c) {
            SparseArray<a> sparseArray = f2284b.get(bVar);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i2)) == null)) {
                if (aVar.f2286b.equals(bVar.a.getConfiguration())) {
                    return aVar.a;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
    }

    public static Typeface a(Context context, int i2, TypedValue typedValue, int i3, c cVar) {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i2, typedValue, i3, cVar, null, true, false);
    }

    private static Typeface a(Context context, int i2, TypedValue typedValue, int i3, c cVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        Typeface a2 = a(context, resources, typedValue, i2, i3, cVar, handler, z, z2);
        if (a2 != null || cVar != null || z2) {
            return a2;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface a(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, c.h.d.d.f.c r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.d.d.f.a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, c.h.d.d.f$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }

    private static TypedValue a() {
        TypedValue typedValue = a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        a.set(typedValue2);
        return typedValue2;
    }

    private static void a(b bVar, int i2, ColorStateList colorStateList) {
        synchronized (f2285c) {
            SparseArray<a> sparseArray = f2284b.get(bVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f2284b.put(bVar, sparseArray);
            }
            sparseArray.append(i2, new a(colorStateList, bVar.a.getConfiguration()));
        }
    }

    private static boolean a(Resources resources, int i2) {
        TypedValue a2 = a();
        resources.getValue(i2, a2, true);
        int i3 = a2.type;
        return i3 >= 28 && i3 <= 31;
    }

    public static Drawable b(Resources resources, int i2, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i2, theme) : resources.getDrawable(i2);
    }

    private static ColorStateList c(Resources resources, int i2, Resources.Theme theme) {
        if (a(resources, i2)) {
            return null;
        }
        try {
            return a.a(resources, resources.getXml(i2), theme);
        } catch (Exception e2) {
            Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }
}
