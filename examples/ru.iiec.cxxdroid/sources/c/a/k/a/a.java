package c.a.k.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.m0;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
public final class a {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<C0032a>> f1780b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1781c = new Object();

    /* access modifiers changed from: private */
    /* renamed from: c.a.k.a.a$a  reason: collision with other inner class name */
    public static class C0032a {
        final ColorStateList a;

        /* renamed from: b  reason: collision with root package name */
        final Configuration f1782b;

        C0032a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.f1782b = configuration;
        }
    }

    private static ColorStateList a(Context context, int i2) {
        C0032a aVar;
        synchronized (f1781c) {
            SparseArray<C0032a> sparseArray = f1780b.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i2)) == null)) {
                if (aVar.f1782b.equals(context.getResources().getConfiguration())) {
                    return aVar.a;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
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

    private static void a(Context context, int i2, ColorStateList colorStateList) {
        synchronized (f1781c) {
            SparseArray<C0032a> sparseArray = f1780b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f1780b.put(context, sparseArray);
            }
            sparseArray.append(i2, new C0032a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    public static ColorStateList b(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i2);
        }
        ColorStateList a2 = a(context, i2);
        if (a2 != null) {
            return a2;
        }
        ColorStateList d2 = d(context, i2);
        if (d2 == null) {
            return c.h.d.a.b(context, i2);
        }
        a(context, i2, d2);
        return d2;
    }

    public static Drawable c(Context context, int i2) {
        return m0.a().a(context, i2);
    }

    private static ColorStateList d(Context context, int i2) {
        if (e(context, i2)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return c.h.d.d.a.a(resources, resources.getXml(i2), context.getTheme());
        } catch (Exception e2) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static boolean e(Context context, int i2) {
        Resources resources = context.getResources();
        TypedValue a2 = a();
        resources.getValue(i2, a2, true);
        int i3 = a2.type;
        return i3 >= 28 && i3 <= 31;
    }
}
