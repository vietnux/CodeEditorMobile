package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import c.e.h;
import c.u.a.a.i;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

public final class m0 {

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f653h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    private static m0 f654i;

    /* renamed from: j  reason: collision with root package name */
    private static final c f655j = new c(6);
    private WeakHashMap<Context, h<ColorStateList>> a;

    /* renamed from: b  reason: collision with root package name */
    private c.e.g<String, e> f656b;

    /* renamed from: c  reason: collision with root package name */
    private h<String> f657c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, c.e.d<WeakReference<Drawable.ConstantState>>> f658d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f659e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f660f;

    /* renamed from: g  reason: collision with root package name */
    private f f661g;

    /* access modifiers changed from: package-private */
    public static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.m0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return c.a.l.a.a.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.m0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return c.u.a.a.c.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class c extends c.e.e<Integer, PorterDuffColorFilter> {
        public c(int i2) {
            super(i2);
        }

        private static int b(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) b(Integer.valueOf(b(i2, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter a(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) a(Integer.valueOf(b(i2, mode)), porterDuffColorFilter);
        }
    }

    /* access modifiers changed from: package-private */
    public static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.m0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e2) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
        ColorStateList a(Context context, int i2);

        PorterDuff.Mode a(int i2);

        Drawable a(m0 m0Var, Context context, int i2);

        boolean a(Context context, int i2, Drawable drawable);

        boolean b(Context context, int i2, Drawable drawable);
    }

    /* access modifiers changed from: private */
    public static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.m0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return i.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    private static long a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public static synchronized PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (m0.class) {
            a2 = f655j.a(i2, mode);
            if (a2 == null) {
                a2 = new PorterDuffColorFilter(i2, mode);
                f655j.a(i2, mode, a2);
            }
        }
        return a2;
    }

    private static PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return a(colorStateList.getColorForState(iArr, 0), mode);
    }

    private Drawable a(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList b2 = b(context, i2);
        if (b2 != null) {
            if (d0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable i3 = androidx.core.graphics.drawable.a.i(drawable);
            androidx.core.graphics.drawable.a.a(i3, b2);
            PorterDuff.Mode a2 = a(i2);
            if (a2 == null) {
                return i3;
            }
            androidx.core.graphics.drawable.a.a(i3, a2);
            return i3;
        }
        f fVar = this.f661g;
        if ((fVar == null || !fVar.b(context, i2, drawable)) && !a(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    private synchronized Drawable a(Context context, long j2) {
        c.e.d<WeakReference<Drawable.ConstantState>> dVar = this.f658d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> a2 = dVar.a(j2);
        if (a2 != null) {
            Drawable.ConstantState constantState = a2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.c(j2);
        }
        return null;
    }

    public static synchronized m0 a() {
        m0 m0Var;
        synchronized (m0.class) {
            if (f654i == null) {
                f654i = new m0();
                a(f654i);
            }
            m0Var = f654i;
        }
        return m0Var;
    }

    private void a(Context context, int i2, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap<>();
        }
        h<ColorStateList> hVar = this.a.get(context);
        if (hVar == null) {
            hVar = new h<>();
            this.a.put(context, hVar);
        }
        hVar.a(i2, colorStateList);
    }

    static void a(Drawable drawable, u0 u0Var, int[] iArr) {
        if (!d0.a(drawable) || drawable.mutate() == drawable) {
            if (u0Var.f721d || u0Var.f720c) {
                drawable.setColorFilter(a(u0Var.f721d ? u0Var.a : null, u0Var.f720c ? u0Var.f719b : f653h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    private static void a(m0 m0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m0Var.a("vector", new g());
            m0Var.a("animated-vector", new b());
            m0Var.a("animated-selector", new a());
            m0Var.a("drawable", new d());
        }
    }

    private void a(String str, e eVar) {
        if (this.f656b == null) {
            this.f656b = new c.e.g<>();
        }
        this.f656b.put(str, eVar);
    }

    private synchronized boolean a(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            c.e.d<WeakReference<Drawable.ConstantState>> dVar = this.f658d.get(context);
            if (dVar == null) {
                dVar = new c.e.d<>();
                this.f658d.put(context, dVar);
            }
            dVar.c(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private static boolean a(Drawable drawable) {
        return (drawable instanceof i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private void b(Context context) {
        if (!this.f660f) {
            this.f660f = true;
            Drawable a2 = a(context, c.a.m.a.abc_vector_test);
            if (a2 == null || !a(a2)) {
                this.f660f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private Drawable c(Context context, int i2) {
        if (this.f659e == null) {
            this.f659e = new TypedValue();
        }
        TypedValue typedValue = this.f659e;
        context.getResources().getValue(i2, typedValue, true);
        long a2 = a(typedValue);
        Drawable a3 = a(context, a2);
        if (a3 != null) {
            return a3;
        }
        f fVar = this.f661g;
        Drawable a4 = fVar == null ? null : fVar.a(this, context, i2);
        if (a4 != null) {
            a4.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, a2, a4);
        }
        return a4;
    }

    private ColorStateList d(Context context, int i2) {
        h<ColorStateList> hVar;
        WeakHashMap<Context, h<ColorStateList>> weakHashMap = this.a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.a(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable e(android.content.Context r11, int r12) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.e(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode a(int i2) {
        f fVar = this.f661g;
        if (fVar == null) {
            return null;
        }
        return fVar.a(i2);
    }

    public synchronized Drawable a(Context context, int i2) {
        return a(context, i2, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable a(Context context, int i2, boolean z) {
        Drawable e2;
        b(context);
        e2 = e(context, i2);
        if (e2 == null) {
            e2 = c(context, i2);
        }
        if (e2 == null) {
            e2 = c.h.d.a.c(context, i2);
        }
        if (e2 != null) {
            e2 = a(context, i2, z, e2);
        }
        if (e2 != null) {
            d0.b(e2);
        }
        return e2;
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable a(Context context, b1 b1Var, int i2) {
        Drawable e2 = e(context, i2);
        if (e2 == null) {
            e2 = b1Var.a(i2);
        }
        if (e2 == null) {
            return null;
        }
        return a(context, i2, false, e2);
    }

    public synchronized void a(Context context) {
        c.e.d<WeakReference<Drawable.ConstantState>> dVar = this.f658d.get(context);
        if (dVar != null) {
            dVar.a();
        }
    }

    public synchronized void a(f fVar) {
        this.f661g = fVar;
    }

    /* access modifiers changed from: package-private */
    public boolean a(Context context, int i2, Drawable drawable) {
        f fVar = this.f661g;
        return fVar != null && fVar.a(context, i2, drawable);
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList b(Context context, int i2) {
        ColorStateList d2;
        d2 = d(context, i2);
        if (d2 == null) {
            d2 = this.f661g == null ? null : this.f661g.a(context, i2);
            if (d2 != null) {
                a(context, i2, d2);
            }
        }
        return d2;
    }
}
