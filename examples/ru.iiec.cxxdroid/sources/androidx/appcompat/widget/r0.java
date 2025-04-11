package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import c.a.j;
import c.h.e.a;

public class r0 {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    static final int[] f703b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f704c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f705d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f706e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f707f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f708g = new int[1];

    static {
        new int[1][0] = 16843518;
        new int[1][0] = 16842913;
    }

    public static int a(Context context, int i2) {
        ColorStateList c2 = c(context, i2);
        if (c2 != null && c2.isStateful()) {
            return c2.getColorForState(f703b, c2.getDefaultColor());
        }
        TypedValue a2 = a();
        context.getTheme().resolveAttribute(16842803, a2, true);
        return a(context, i2, a2.getFloat());
    }

    static int a(Context context, int i2, float f2) {
        int b2 = b(context, i2);
        return a.c(b2, Math.round(((float) Color.alpha(b2)) * f2));
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

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(j.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(j.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        int[] iArr = f708g;
        iArr[0] = i2;
        w0 a2 = w0.a(context, (AttributeSet) null, iArr);
        try {
            return a2.a(0, 0);
        } finally {
            a2.b();
        }
    }

    public static ColorStateList c(Context context, int i2) {
        int[] iArr = f708g;
        iArr[0] = i2;
        w0 a2 = w0.a(context, (AttributeSet) null, iArr);
        try {
            return a2.a(0);
        } finally {
            a2.b();
        }
    }
}
