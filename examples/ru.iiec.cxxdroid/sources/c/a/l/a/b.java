package c.a.l.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* access modifiers changed from: package-private */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: b  reason: collision with root package name */
    private d f1786b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f1787c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f1788d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1789e;

    /* renamed from: f  reason: collision with root package name */
    private int f1790f = 255;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1791g;

    /* renamed from: h  reason: collision with root package name */
    private int f1792h = -1;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1793i;

    /* renamed from: j  reason: collision with root package name */
    private Runnable f1794j;

    /* renamed from: k  reason: collision with root package name */
    private long f1795k;

    /* renamed from: l  reason: collision with root package name */
    private long f1796l;

    /* renamed from: m  reason: collision with root package name */
    private c f1797m;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        a() {
        }

        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c.a.l.a.b$b  reason: collision with other inner class name */
    public static class C0034b {
        public static Resources a(Resources.Theme theme) {
            return theme.getResources();
        }

        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }
    }

    /* access modifiers changed from: package-private */
    public static class c implements Drawable.Callback {

        /* renamed from: b  reason: collision with root package name */
        private Drawable.Callback f1799b;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f1799b;
            this.f1799b = null;
            return callback;
        }

        public c a(Drawable.Callback callback) {
            this.f1799b = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f1799b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f1799b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class d extends Drawable.ConstantState {
        int A = 0;
        int B = 0;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;
        final b a;

        /* renamed from: b  reason: collision with root package name */
        Resources f1800b;

        /* renamed from: c  reason: collision with root package name */
        int f1801c;

        /* renamed from: d  reason: collision with root package name */
        int f1802d;

        /* renamed from: e  reason: collision with root package name */
        int f1803e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f1804f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f1805g;

        /* renamed from: h  reason: collision with root package name */
        int f1806h;

        /* renamed from: i  reason: collision with root package name */
        boolean f1807i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f1808j;

        /* renamed from: k  reason: collision with root package name */
        Rect f1809k;

        /* renamed from: l  reason: collision with root package name */
        boolean f1810l = false;

        /* renamed from: m  reason: collision with root package name */
        boolean f1811m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x = true;
        boolean y;
        int z;

        d(d dVar, b bVar, Resources resources) {
            this.a = bVar;
            Rect rect = null;
            this.f1800b = resources != null ? resources : dVar != null ? dVar.f1800b : null;
            this.f1801c = b.a(resources, dVar != null ? dVar.f1801c : 0);
            if (dVar != null) {
                this.f1802d = dVar.f1802d;
                this.f1803e = dVar.f1803e;
                this.v = true;
                this.w = true;
                this.f1807i = dVar.f1807i;
                this.f1810l = dVar.f1810l;
                this.x = dVar.x;
                this.y = dVar.y;
                this.z = dVar.z;
                this.A = dVar.A;
                this.B = dVar.B;
                this.C = dVar.C;
                this.D = dVar.D;
                this.E = dVar.E;
                this.F = dVar.F;
                this.G = dVar.G;
                this.H = dVar.H;
                this.I = dVar.I;
                if (dVar.f1801c == this.f1801c) {
                    if (dVar.f1808j) {
                        Rect rect2 = dVar.f1809k;
                        this.f1809k = rect2 != null ? new Rect(rect2) : rect;
                        this.f1808j = true;
                    }
                    if (dVar.f1811m) {
                        this.n = dVar.n;
                        this.o = dVar.o;
                        this.p = dVar.p;
                        this.q = dVar.q;
                        this.f1811m = true;
                    }
                }
                if (dVar.r) {
                    this.s = dVar.s;
                    this.r = true;
                }
                if (dVar.t) {
                    this.u = dVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = dVar.f1805g;
                this.f1805g = new Drawable[drawableArr.length];
                this.f1806h = dVar.f1806h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f1804f;
                this.f1804f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f1806h);
                int i2 = this.f1806h;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.f1804f.put(i3, constantState);
                        } else {
                            this.f1805g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f1805g = new Drawable[10];
            this.f1806h = 0;
        }

        private Drawable b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.a(drawable, this.z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.a);
            return mutate;
        }

        private void n() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f1804f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f1805g[this.f1804f.keyAt(i2)] = b(this.f1804f.valueAt(i2).newDrawable(this.f1800b));
                }
                this.f1804f = null;
            }
        }

        public final int a(Drawable drawable) {
            int i2 = this.f1806h;
            if (i2 >= this.f1805g.length) {
                a(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.f1805g[i2] = drawable;
            this.f1806h++;
            this.f1803e = drawable.getChangingConfigurations() | this.f1803e;
            k();
            this.f1809k = null;
            this.f1808j = false;
            this.f1811m = false;
            this.v = false;
            return i2;
        }

        public final Drawable a(int i2) {
            int indexOfKey;
            Drawable drawable = this.f1805g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f1804f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable b2 = b(this.f1804f.valueAt(indexOfKey).newDrawable(this.f1800b));
            this.f1805g[i2] = b2;
            this.f1804f.removeAt(indexOfKey);
            if (this.f1804f.size() == 0) {
                this.f1804f = null;
            }
            return b2;
        }

        public void a(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.f1805g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
            }
            this.f1805g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        public final void a(Resources.Theme theme) {
            if (theme != null) {
                n();
                int i2 = this.f1806h;
                Drawable[] drawableArr = this.f1805g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null && androidx.core.graphics.drawable.a.a(drawableArr[i3])) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i3], theme);
                        this.f1803e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                a(C0034b.a(theme));
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(Resources resources) {
            if (resources != null) {
                this.f1800b = resources;
                int a2 = b.a(resources, this.f1801c);
                int i2 = this.f1801c;
                this.f1801c = a2;
                if (i2 != a2) {
                    this.f1811m = false;
                    this.f1808j = false;
                }
            }
        }

        public final void a(boolean z2) {
            this.f1810l = z2;
        }

        public boolean a() {
            if (this.v) {
                return this.w;
            }
            n();
            this.v = true;
            int i2 = this.f1806h;
            Drawable[] drawableArr = this.f1805g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        /* access modifiers changed from: protected */
        public void b() {
            this.f1811m = true;
            n();
            int i2 = this.f1806h;
            Drawable[] drawableArr = this.f1805g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void b(int i2) {
            this.A = i2;
        }

        public final void b(boolean z2) {
            this.f1807i = z2;
        }

        /* access modifiers changed from: package-private */
        public final boolean b(int i2, int i3) {
            int i4 = this.f1806h;
            Drawable[] drawableArr = this.f1805g;
            boolean z2 = false;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    boolean a2 = Build.VERSION.SDK_INT >= 23 ? androidx.core.graphics.drawable.a.a(drawableArr[i5], i2) : false;
                    if (i5 == i3) {
                        z2 = a2;
                    }
                }
            }
            this.z = i2;
            return z2;
        }

        /* access modifiers changed from: package-private */
        public final int c() {
            return this.f1805g.length;
        }

        public final void c(int i2) {
            this.B = i2;
        }

        public boolean canApplyTheme() {
            int i2 = this.f1806h;
            Drawable[] drawableArr = this.f1805g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f1804f.get(i3);
                    if (constantState != null && C0034b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.a(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final int d() {
            return this.f1806h;
        }

        public final int e() {
            if (!this.f1811m) {
                b();
            }
            return this.o;
        }

        public final int f() {
            if (!this.f1811m) {
                b();
            }
            return this.q;
        }

        public final int g() {
            if (!this.f1811m) {
                b();
            }
            return this.p;
        }

        public int getChangingConfigurations() {
            return this.f1802d | this.f1803e;
        }

        public final Rect h() {
            if (this.f1807i) {
                return null;
            }
            if (this.f1809k != null || this.f1808j) {
                return this.f1809k;
            }
            n();
            Rect rect = new Rect();
            int i2 = this.f1806h;
            Drawable[] drawableArr = this.f1805g;
            Rect rect2 = null;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect.left;
                    if (i4 > rect2.left) {
                        rect2.left = i4;
                    }
                    int i5 = rect.top;
                    if (i5 > rect2.top) {
                        rect2.top = i5;
                    }
                    int i6 = rect.right;
                    if (i6 > rect2.right) {
                        rect2.right = i6;
                    }
                    int i7 = rect.bottom;
                    if (i7 > rect2.bottom) {
                        rect2.bottom = i7;
                    }
                }
            }
            this.f1808j = true;
            this.f1809k = rect2;
            return rect2;
        }

        public final int i() {
            if (!this.f1811m) {
                b();
            }
            return this.n;
        }

        public final int j() {
            if (this.r) {
                return this.s;
            }
            n();
            int i2 = this.f1806h;
            Drawable[] drawableArr = this.f1805g;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.s = opacity;
            this.r = true;
            return opacity;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            this.r = false;
            this.t = false;
        }

        public final boolean l() {
            return this.f1810l;
        }

        /* access modifiers changed from: package-private */
        public abstract void m();
    }

    b() {
    }

    static int a(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    private void a(Drawable drawable) {
        if (this.f1797m == null) {
            this.f1797m = new c();
        }
        c cVar = this.f1797m;
        cVar.a(drawable.getCallback());
        drawable.setCallback(cVar);
        try {
            if (this.f1786b.A <= 0 && this.f1791g) {
                drawable.setAlpha(this.f1790f);
            }
            if (this.f1786b.E) {
                drawable.setColorFilter(this.f1786b.D);
            } else {
                if (this.f1786b.H) {
                    androidx.core.graphics.drawable.a.a(drawable, this.f1786b.F);
                }
                if (this.f1786b.I) {
                    androidx.core.graphics.drawable.a.a(drawable, this.f1786b.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f1786b.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.a(drawable, androidx.core.graphics.drawable.a.e(this));
            }
            if (Build.VERSION.SDK_INT >= 19) {
                androidx.core.graphics.drawable.a.a(drawable, this.f1786b.C);
            }
            Rect rect = this.f1787c;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                androidx.core.graphics.drawable.a.a(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f1797m.a());
        }
    }

    private boolean c() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    /* access modifiers changed from: package-private */
    public d a() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void a(Resources resources) {
        this.f1786b.a(resources);
    }

    /* access modifiers changed from: package-private */
    public void a(d dVar) {
        this.f1786b = dVar;
        int i2 = this.f1792h;
        if (i2 >= 0) {
            this.f1788d = dVar.a(i2);
            Drawable drawable = this.f1788d;
            if (drawable != null) {
                a(drawable);
            }
        }
        this.f1789e = null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.l.a.b.a(boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r10) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.l.a.b.a(int):boolean");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f1786b.a(theme);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f1792h;
    }

    public boolean canApplyTheme() {
        return this.f1786b.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f1788d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f1789e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f1790f;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1786b.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f1786b.a()) {
            return null;
        }
        this.f1786b.f1802d = getChangingConfigurations();
        return this.f1786b;
    }

    public Drawable getCurrent() {
        return this.f1788d;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f1787c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f1786b.l()) {
            return this.f1786b.e();
        }
        Drawable drawable = this.f1788d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f1786b.l()) {
            return this.f1786b.i();
        }
        Drawable drawable = this.f1788d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f1786b.l()) {
            return this.f1786b.f();
        }
        Drawable drawable = this.f1788d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f1786b.l()) {
            return this.f1786b.g();
        }
        Drawable drawable = this.f1788d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f1788d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f1786b.j();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f1788d;
        if (drawable != null) {
            C0034b.a(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect h2 = this.f1786b.h();
        if (h2 != null) {
            rect.set(h2);
            z = (h2.right | ((h2.left | h2.top) | h2.bottom)) != 0;
        } else {
            Drawable drawable = this.f1788d;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (c()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f1786b;
        if (dVar != null) {
            dVar.k();
        }
        if (drawable == this.f1788d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f1786b.C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f1789e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f1789e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f1788d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f1791g) {
                this.f1788d.setAlpha(this.f1790f);
            }
        }
        if (this.f1796l != 0) {
            this.f1796l = 0;
            z = true;
        }
        if (this.f1795k != 0) {
            this.f1795k = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f1793i && super.mutate() == this) {
            d a2 = a();
            a2.m();
            a(a2);
            this.f1793i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1789e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f1788d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return this.f1786b.b(i2, b());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f1789e;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f1788d;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1789e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f1788d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.f1788d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (!this.f1791g || this.f1790f != i2) {
            this.f1791g = true;
            this.f1790f = i2;
            Drawable drawable = this.f1788d;
            if (drawable == null) {
                return;
            }
            if (this.f1795k == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        d dVar = this.f1786b;
        if (dVar.C != z) {
            dVar.C = z;
            Drawable drawable = this.f1788d;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.a(drawable, dVar.C);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f1786b;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f1788d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        d dVar = this.f1786b;
        if (dVar.x != z) {
            dVar.x = z;
            Drawable drawable = this.f1788d;
            if (drawable != null) {
                drawable.setDither(dVar.x);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f1788d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f1787c;
        if (rect == null) {
            this.f1787c = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f1788d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, i2, i3, i4, i5);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f1786b;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.a.a(this.f1788d, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1786b;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.a.a(this.f1788d, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f1789e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f1788d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f1788d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
