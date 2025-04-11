package c.h.l;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class k0 {

    /* renamed from: b  reason: collision with root package name */
    public static final k0 f2412b = (Build.VERSION.SDK_INT >= 30 ? k.q : l.f2435b);
    private final l a;

    /* access modifiers changed from: package-private */
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {
        private static Field a;

        /* renamed from: b  reason: collision with root package name */
        private static Field f2413b;

        /* renamed from: c  reason: collision with root package name */
        private static Field f2414c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f2415d = true;

        static {
            try {
                a = View.class.getDeclaredField("mAttachInfo");
                a.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2413b = cls.getDeclaredField("mStableInsets");
                f2413b.setAccessible(true);
                f2414c = cls.getDeclaredField("mContentInsets");
                f2414c.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
            }
        }

        public static k0 a(View view) {
            if (f2415d && view.isAttachedToWindow()) {
                try {
                    Object obj = a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2413b.get(obj);
                        Rect rect2 = (Rect) f2414c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            b bVar = new b();
                            bVar.a(c.h.e.b.a(rect));
                            bVar.b(c.h.e.b.a(rect2));
                            k0 a2 = bVar.a();
                            a2.a(a2);
                            a2.a(view.getRootView());
                            return a2;
                        }
                    }
                } catch (IllegalAccessException e2) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
                }
            }
            return null;
        }
    }

    public static final class b {
        private final f a;

        public b() {
            int i2 = Build.VERSION.SDK_INT;
            this.a = i2 >= 30 ? new e() : i2 >= 29 ? new d() : i2 >= 20 ? new c() : new f();
        }

        public b(k0 k0Var) {
            int i2 = Build.VERSION.SDK_INT;
            this.a = i2 >= 30 ? new e(k0Var) : i2 >= 29 ? new d(k0Var) : i2 >= 20 ? new c(k0Var) : new f(k0Var);
        }

        @Deprecated
        public b a(c.h.e.b bVar) {
            this.a.b(bVar);
            return this;
        }

        public k0 a() {
            return this.a.b();
        }

        @Deprecated
        public b b(c.h.e.b bVar) {
            this.a.d(bVar);
            return this;
        }
    }

    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private static Field f2416e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f2417f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor<WindowInsets> f2418g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f2419h = false;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsets f2420c;

        /* renamed from: d  reason: collision with root package name */
        private c.h.e.b f2421d;

        c() {
            this.f2420c = c();
        }

        c(k0 k0Var) {
            super(k0Var);
            this.f2420c = k0Var.m();
        }

        private static WindowInsets c() {
            if (!f2417f) {
                f2416e = WindowInsets.class.getDeclaredField("CONSUMED");
                f2417f = true;
            }
            Field field = f2416e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f2419h) {
                try {
                    f2418g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f2419h = true;
            }
            Constructor<WindowInsets> constructor = f2418g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.f
        public k0 b() {
            a();
            k0 a = k0.a(this.f2420c);
            a.a(this.f2423b);
            a.b(this.f2421d);
            return a;
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.f
        public void b(c.h.e.b bVar) {
            this.f2421d = bVar;
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.f
        public void d(c.h.e.b bVar) {
            WindowInsets windowInsets = this.f2420c;
            if (windowInsets != null) {
                this.f2420c = windowInsets.replaceSystemWindowInsets(bVar.a, bVar.f2295b, bVar.f2296c, bVar.f2297d);
            }
        }
    }

    private static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets.Builder f2422c;

        d() {
            this.f2422c = new WindowInsets.Builder();
        }

        d(k0 k0Var) {
            super(k0Var);
            WindowInsets.Builder builder;
            if (k0Var.m() == null) {
                builder = new WindowInsets.Builder();
            }
            this.f2422c = builder;
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.f
        public void a(c.h.e.b bVar) {
            this.f2422c.setMandatorySystemGestureInsets(bVar.a());
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.f
        public k0 b() {
            a();
            k0 a = k0.a(this.f2422c.build());
            a.a(this.f2423b);
            return a;
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.f
        public void b(c.h.e.b bVar) {
            this.f2422c.setStableInsets(bVar.a());
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.f
        public void c(c.h.e.b bVar) {
            this.f2422c.setSystemGestureInsets(bVar.a());
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.f
        public void d(c.h.e.b bVar) {
            this.f2422c.setSystemWindowInsets(bVar.a());
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.f
        public void e(c.h.e.b bVar) {
            this.f2422c.setTappableElementInsets(bVar.a());
        }
    }

    private static class e extends d {
        e() {
        }

        e(k0 k0Var) {
            super(k0Var);
        }
    }

    /* access modifiers changed from: private */
    public static class f {
        private final k0 a;

        /* renamed from: b  reason: collision with root package name */
        c.h.e.b[] f2423b;

        f() {
            this(new k0((k0) null));
        }

        f(k0 k0Var) {
            this.a = k0Var;
        }

        /* access modifiers changed from: protected */
        public final void a() {
            c.h.e.b[] bVarArr = this.f2423b;
            if (bVarArr != null) {
                c.h.e.b bVar = bVarArr[m.a(1)];
                c.h.e.b bVar2 = this.f2423b[m.a(2)];
                if (bVar2 == null) {
                    bVar2 = this.a.a(2);
                }
                if (bVar == null) {
                    bVar = this.a.a(1);
                }
                d(c.h.e.b.a(bVar, bVar2));
                c.h.e.b bVar3 = this.f2423b[m.a(16)];
                if (bVar3 != null) {
                    c(bVar3);
                }
                c.h.e.b bVar4 = this.f2423b[m.a(32)];
                if (bVar4 != null) {
                    a(bVar4);
                }
                c.h.e.b bVar5 = this.f2423b[m.a(64)];
                if (bVar5 != null) {
                    e(bVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(c.h.e.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public k0 b() {
            a();
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public void b(c.h.e.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void c(c.h.e.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void d(c.h.e.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void e(c.h.e.b bVar) {
        }
    }

    /* access modifiers changed from: private */
    public static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        private static boolean f2424h = false;

        /* renamed from: i  reason: collision with root package name */
        private static Method f2425i;

        /* renamed from: j  reason: collision with root package name */
        private static Class<?> f2426j;

        /* renamed from: k  reason: collision with root package name */
        private static Field f2427k;

        /* renamed from: l  reason: collision with root package name */
        private static Field f2428l;

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets f2429c;

        /* renamed from: d  reason: collision with root package name */
        private c.h.e.b[] f2430d;

        /* renamed from: e  reason: collision with root package name */
        private c.h.e.b f2431e;

        /* renamed from: f  reason: collision with root package name */
        private k0 f2432f;

        /* renamed from: g  reason: collision with root package name */
        c.h.e.b f2433g;

        g(k0 k0Var, WindowInsets windowInsets) {
            super(k0Var);
            this.f2431e = null;
            this.f2429c = windowInsets;
        }

        g(k0 k0Var, g gVar) {
            this(k0Var, new WindowInsets(gVar.f2429c));
        }

        @SuppressLint({"WrongConstant"})
        private c.h.e.b b(int i2, boolean z) {
            c.h.e.b bVar = c.h.e.b.f2294e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    bVar = c.h.e.b.a(bVar, a(i3, z));
                }
            }
            return bVar;
        }

        private c.h.e.b b(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f2424h) {
                    m();
                }
                Method method = f2425i;
                if (!(method == null || f2426j == null || f2427k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f2427k.get(f2428l.get(invoke));
                        if (rect != null) {
                            return c.h.e.b.a(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e2) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        private c.h.e.b l() {
            k0 k0Var = this.f2432f;
            return k0Var != null ? k0Var.e() : c.h.e.b.f2294e;
        }

        @SuppressLint({"PrivateApi"})
        private static void m() {
            try {
                f2425i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f2426j = Class.forName("android.view.View$AttachInfo");
                f2427k = f2426j.getDeclaredField("mVisibleInsets");
                f2428l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2427k.setAccessible(true);
                f2428l.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
            f2424h = true;
        }

        @Override // c.h.l.k0.l
        public c.h.e.b a(int i2) {
            return b(i2, false);
        }

        /* access modifiers changed from: protected */
        public c.h.e.b a(int i2, boolean z) {
            int i3;
            if (i2 == 1) {
                return z ? c.h.e.b.a(0, Math.max(l().f2295b, h().f2295b), 0, 0) : c.h.e.b.a(0, h().f2295b, 0, 0);
            }
            c.h.e.b bVar = null;
            if (i2 != 2) {
                if (i2 == 8) {
                    c.h.e.b[] bVarArr = this.f2430d;
                    if (bVarArr != null) {
                        bVar = bVarArr[m.a(8)];
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    c.h.e.b h2 = h();
                    c.h.e.b l2 = l();
                    int i4 = h2.f2297d;
                    if (i4 > l2.f2297d) {
                        return c.h.e.b.a(0, 0, 0, i4);
                    }
                    c.h.e.b bVar2 = this.f2433g;
                    return (bVar2 == null || bVar2.equals(c.h.e.b.f2294e) || (i3 = this.f2433g.f2297d) <= l2.f2297d) ? c.h.e.b.f2294e : c.h.e.b.a(0, 0, 0, i3);
                } else if (i2 == 16) {
                    return g();
                } else {
                    if (i2 == 32) {
                        return e();
                    }
                    if (i2 == 64) {
                        return i();
                    }
                    if (i2 != 128) {
                        return c.h.e.b.f2294e;
                    }
                    k0 k0Var = this.f2432f;
                    f d2 = k0Var != null ? k0Var.d() : d();
                    return d2 != null ? c.h.e.b.a(d2.b(), d2.d(), d2.c(), d2.a()) : c.h.e.b.f2294e;
                }
            } else if (z) {
                c.h.e.b l3 = l();
                c.h.e.b f2 = f();
                return c.h.e.b.a(Math.max(l3.a, f2.a), 0, Math.max(l3.f2296c, f2.f2296c), Math.max(l3.f2297d, f2.f2297d));
            } else {
                c.h.e.b h3 = h();
                k0 k0Var2 = this.f2432f;
                if (k0Var2 != null) {
                    bVar = k0Var2.e();
                }
                int i5 = h3.f2297d;
                if (bVar != null) {
                    i5 = Math.min(i5, bVar.f2297d);
                }
                return c.h.e.b.a(h3.a, 0, h3.f2296c, i5);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public k0 a(int i2, int i3, int i4, int i5) {
            b bVar = new b(k0.a(this.f2429c));
            bVar.b(k0.a(h(), i2, i3, i4, i5));
            bVar.a(k0.a(f(), i2, i3, i4, i5));
            return bVar.a();
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public void a(View view) {
            c.h.e.b b2 = b(view);
            if (b2 == null) {
                b2 = c.h.e.b.f2294e;
            }
            a(b2);
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public void a(c.h.e.b bVar) {
            this.f2433g = bVar;
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public void a(k0 k0Var) {
            k0Var.a(this.f2432f);
            k0Var.a(this.f2433g);
        }

        @Override // c.h.l.k0.l
        public void a(c.h.e.b[] bVarArr) {
            this.f2430d = bVarArr;
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public void b(k0 k0Var) {
            this.f2432f = k0Var;
        }

        @Override // c.h.l.k0.l
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f2433g, ((g) obj).f2433g);
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public final c.h.e.b h() {
            if (this.f2431e == null) {
                this.f2431e = c.h.e.b.a(this.f2429c.getSystemWindowInsetLeft(), this.f2429c.getSystemWindowInsetTop(), this.f2429c.getSystemWindowInsetRight(), this.f2429c.getSystemWindowInsetBottom());
            }
            return this.f2431e;
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public boolean k() {
            return this.f2429c.isRound();
        }
    }

    private static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        private c.h.e.b f2434m = null;

        h(k0 k0Var, WindowInsets windowInsets) {
            super(k0Var, windowInsets);
        }

        h(k0 k0Var, h hVar) {
            super(k0Var, hVar);
            this.f2434m = hVar.f2434m;
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public k0 b() {
            return k0.a(this.f2429c.consumeStableInsets());
        }

        @Override // c.h.l.k0.l
        public void b(c.h.e.b bVar) {
            this.f2434m = bVar;
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public k0 c() {
            return k0.a(this.f2429c.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public final c.h.e.b f() {
            if (this.f2434m == null) {
                this.f2434m = c.h.e.b.a(this.f2429c.getStableInsetLeft(), this.f2429c.getStableInsetTop(), this.f2429c.getStableInsetRight(), this.f2429c.getStableInsetBottom());
            }
            return this.f2434m;
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public boolean j() {
            return this.f2429c.isConsumed();
        }
    }

    private static class i extends h {
        i(k0 k0Var, WindowInsets windowInsets) {
            super(k0Var, windowInsets);
        }

        i(k0 k0Var, i iVar) {
            super(k0Var, iVar);
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public k0 a() {
            return k0.a(this.f2429c.consumeDisplayCutout());
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public f d() {
            return f.a(this.f2429c.getDisplayCutout());
        }

        @Override // c.h.l.k0.l, c.h.l.k0.g
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f2429c, iVar.f2429c) && Objects.equals(this.f2433g, iVar.f2433g);
        }

        @Override // c.h.l.k0.l
        public int hashCode() {
            return this.f2429c.hashCode();
        }
    }

    private static class j extends i {
        private c.h.e.b n = null;
        private c.h.e.b o = null;
        private c.h.e.b p = null;

        j(k0 k0Var, WindowInsets windowInsets) {
            super(k0Var, windowInsets);
        }

        j(k0 k0Var, j jVar) {
            super(k0Var, jVar);
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l, c.h.l.k0.g
        public k0 a(int i2, int i3, int i4, int i5) {
            return k0.a(this.f2429c.inset(i2, i3, i4, i5));
        }

        @Override // c.h.l.k0.l, c.h.l.k0.h
        public void b(c.h.e.b bVar) {
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public c.h.e.b e() {
            if (this.o == null) {
                this.o = c.h.e.b.a(this.f2429c.getMandatorySystemGestureInsets());
            }
            return this.o;
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public c.h.e.b g() {
            if (this.n == null) {
                this.n = c.h.e.b.a(this.f2429c.getSystemGestureInsets());
            }
            return this.n;
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l
        public c.h.e.b i() {
            if (this.p == null) {
                this.p = c.h.e.b.a(this.f2429c.getTappableElementInsets());
            }
            return this.p;
        }
    }

    private static class k extends j {
        static final k0 q = k0.a(WindowInsets.CONSUMED);

        k(k0 k0Var, WindowInsets windowInsets) {
            super(k0Var, windowInsets);
        }

        k(k0 k0Var, k kVar) {
            super(k0Var, kVar);
        }

        @Override // c.h.l.k0.l, c.h.l.k0.g
        public c.h.e.b a(int i2) {
            return c.h.e.b.a(this.f2429c.getInsets(n.a(i2)));
        }

        /* access modifiers changed from: package-private */
        @Override // c.h.l.k0.l, c.h.l.k0.g
        public final void a(View view) {
        }
    }

    /* access modifiers changed from: private */
    public static class l {

        /* renamed from: b  reason: collision with root package name */
        static final k0 f2435b = new b().a().a().b().c();
        final k0 a;

        l(k0 k0Var) {
            this.a = k0Var;
        }

        /* access modifiers changed from: package-private */
        public c.h.e.b a(int i2) {
            return c.h.e.b.f2294e;
        }

        /* access modifiers changed from: package-private */
        public k0 a() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public k0 a(int i2, int i3, int i4, int i5) {
            return f2435b;
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
        }

        /* access modifiers changed from: package-private */
        public void a(c.h.e.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void a(k0 k0Var) {
        }

        public void a(c.h.e.b[] bVarArr) {
        }

        /* access modifiers changed from: package-private */
        public k0 b() {
            return this.a;
        }

        public void b(c.h.e.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void b(k0 k0Var) {
        }

        /* access modifiers changed from: package-private */
        public k0 c() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public f d() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public c.h.e.b e() {
            return h();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return k() == lVar.k() && j() == lVar.j() && c.h.k.c.a(h(), lVar.h()) && c.h.k.c.a(f(), lVar.f()) && c.h.k.c.a(d(), lVar.d());
        }

        /* access modifiers changed from: package-private */
        public c.h.e.b f() {
            return c.h.e.b.f2294e;
        }

        /* access modifiers changed from: package-private */
        public c.h.e.b g() {
            return h();
        }

        /* access modifiers changed from: package-private */
        public c.h.e.b h() {
            return c.h.e.b.f2294e;
        }

        public int hashCode() {
            return c.h.k.c.a(Boolean.valueOf(k()), Boolean.valueOf(j()), h(), f(), d());
        }

        /* access modifiers changed from: package-private */
        public c.h.e.b i() {
            return h();
        }

        /* access modifiers changed from: package-private */
        public boolean j() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return false;
        }
    }

    public static final class m {
        static int a(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 4;
            }
            if (i2 == 32) {
                return 5;
            }
            if (i2 == 64) {
                return 6;
            }
            if (i2 == 128) {
                return 7;
            }
            if (i2 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i2);
        }
    }

    private static final class n {
        static int a(int i2) {
            int i3;
            int i4 = 0;
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i2 & i5) != 0) {
                    if (i5 == 1) {
                        i3 = WindowInsets.Type.statusBars();
                    } else if (i5 == 2) {
                        i3 = WindowInsets.Type.navigationBars();
                    } else if (i5 == 4) {
                        i3 = WindowInsets.Type.captionBar();
                    } else if (i5 == 8) {
                        i3 = WindowInsets.Type.ime();
                    } else if (i5 == 16) {
                        i3 = WindowInsets.Type.systemGestures();
                    } else if (i5 == 32) {
                        i3 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i5 == 64) {
                        i3 = WindowInsets.Type.tappableElement();
                    } else if (i5 == 128) {
                        i3 = WindowInsets.Type.displayCutout();
                    }
                    i4 |= i3;
                }
            }
            return i4;
        }
    }

    private k0(WindowInsets windowInsets) {
        l gVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            gVar = new k(this, windowInsets);
        } else if (i2 >= 29) {
            gVar = new j(this, windowInsets);
        } else if (i2 >= 28) {
            gVar = new i(this, windowInsets);
        } else if (i2 >= 21) {
            gVar = new h(this, windowInsets);
        } else if (i2 >= 20) {
            gVar = new g(this, windowInsets);
        } else {
            this.a = new l(this);
            return;
        }
        this.a = gVar;
    }

    public k0(k0 k0Var) {
        if (k0Var != null) {
            l lVar = k0Var.a;
            this.a = (Build.VERSION.SDK_INT < 30 || !(lVar instanceof k)) ? (Build.VERSION.SDK_INT < 29 || !(lVar instanceof j)) ? (Build.VERSION.SDK_INT < 28 || !(lVar instanceof i)) ? (Build.VERSION.SDK_INT < 21 || !(lVar instanceof h)) ? (Build.VERSION.SDK_INT < 20 || !(lVar instanceof g)) ? new l(this) : new g(this, (g) lVar) : new h(this, (h) lVar) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
            lVar.a(this);
            return;
        }
        this.a = new l(this);
    }

    static c.h.e.b a(c.h.e.b bVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, bVar.a - i2);
        int max2 = Math.max(0, bVar.f2295b - i3);
        int max3 = Math.max(0, bVar.f2296c - i4);
        int max4 = Math.max(0, bVar.f2297d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? bVar : c.h.e.b.a(max, max2, max3, max4);
    }

    public static k0 a(WindowInsets windowInsets) {
        return a(windowInsets, null);
    }

    public static k0 a(WindowInsets windowInsets, View view) {
        c.h.k.h.a(windowInsets);
        k0 k0Var = new k0(windowInsets);
        if (view != null && b0.H(view)) {
            k0Var.a(b0.y(view));
            k0Var.a(view.getRootView());
        }
        return k0Var;
    }

    public c.h.e.b a(int i2) {
        return this.a.a(i2);
    }

    @Deprecated
    public k0 a() {
        return this.a.a();
    }

    public k0 a(int i2, int i3, int i4, int i5) {
        return this.a.a(i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    public void a(View view) {
        this.a.a(view);
    }

    /* access modifiers changed from: package-private */
    public void a(c.h.e.b bVar) {
        this.a.a(bVar);
    }

    /* access modifiers changed from: package-private */
    public void a(k0 k0Var) {
        this.a.b(k0Var);
    }

    /* access modifiers changed from: package-private */
    public void a(c.h.e.b[] bVarArr) {
        this.a.a(bVarArr);
    }

    @Deprecated
    public k0 b() {
        return this.a.b();
    }

    @Deprecated
    public k0 b(int i2, int i3, int i4, int i5) {
        b bVar = new b(this);
        bVar.b(c.h.e.b.a(i2, i3, i4, i5));
        return bVar.a();
    }

    /* access modifiers changed from: package-private */
    public void b(c.h.e.b bVar) {
        this.a.b(bVar);
    }

    @Deprecated
    public k0 c() {
        return this.a.c();
    }

    public f d() {
        return this.a.d();
    }

    @Deprecated
    public c.h.e.b e() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        return c.h.k.c.a(this.a, ((k0) obj).a);
    }

    @Deprecated
    public c.h.e.b f() {
        return this.a.g();
    }

    @Deprecated
    public int g() {
        return this.a.h().f2297d;
    }

    @Deprecated
    public int h() {
        return this.a.h().a;
    }

    public int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.a.h().f2296c;
    }

    @Deprecated
    public int j() {
        return this.a.h().f2295b;
    }

    @Deprecated
    public boolean k() {
        return !this.a.h().equals(c.h.e.b.f2294e);
    }

    public boolean l() {
        return this.a.j();
    }

    public WindowInsets m() {
        l lVar = this.a;
        if (lVar instanceof g) {
            return ((g) lVar).f2429c;
        }
        return null;
    }
}
