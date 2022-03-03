package e.b.b.b.k;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import c.n.a.a.b;
import c.n.a.a.c;

public class a {
    public static final TimeInterpolator a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f7818b = new c.n.a.a.a();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f7819c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f7820d = new DecelerateInterpolator();

    static {
        new LinearInterpolator();
    }

    public static float a(float f2, float f3, float f4) {
        return f2 + (f4 * (f3 - f2));
    }

    public static int a(int i2, int i3, float f2) {
        return i2 + Math.round(f2 * ((float) (i3 - i2)));
    }
}
