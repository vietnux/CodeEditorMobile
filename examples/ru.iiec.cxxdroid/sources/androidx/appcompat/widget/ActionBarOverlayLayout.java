package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.n;
import c.a.f;
import c.h.l.b0;
import c.h.l.k0;
import c.h.l.q;
import c.h.l.r;
import c.h.l.s;
import c.h.l.t;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements b0, s, q, r {
    static final int[] G = {c.a.a.actionBarSize, 16842841};
    private OverScroller A;
    ViewPropertyAnimator B;
    final AnimatorListenerAdapter C;
    private final Runnable D;
    private final Runnable E;
    private final t F;

    /* renamed from: b  reason: collision with root package name */
    private int f430b;

    /* renamed from: c  reason: collision with root package name */
    private int f431c;

    /* renamed from: d  reason: collision with root package name */
    private ContentFrameLayout f432d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f433e;

    /* renamed from: f  reason: collision with root package name */
    private c0 f434f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f435g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f436h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f437i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f438j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f439k;

    /* renamed from: l  reason: collision with root package name */
    boolean f440l;

    /* renamed from: m  reason: collision with root package name */
    private int f441m;
    private int n;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private k0 v;
    private k0 w;
    private k0 x;
    private k0 y;
    private d z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.f440l = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.f440l = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f433e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f433e.animate().translationY((float) (-ActionBarOverlayLayout.this.f433e.getHeight())).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    public interface d {
        void a();

        void a(boolean z);

        void b();

        void c();

        void d();

        void onWindowVisibilityChanged(int i2);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f431c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        k0 k0Var = k0.f2412b;
        this.v = k0Var;
        this.w = k0Var;
        this.x = k0Var;
        this.y = k0Var;
        this.C = new a();
        this.D = new b();
        this.E = new c();
        a(context);
        this.F = new t(this);
    }

    private c0 a(View view) {
        if (view instanceof c0) {
            return (c0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(G);
        boolean z2 = false;
        this.f430b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f435g = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f435g == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f436h = z2;
        this.A = new OverScroller(context);
    }

    private boolean a(float f2) {
        this.A.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.A.getFinalY() > this.f433e.getHeight();
    }

    private boolean a(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        e eVar = (e) view.getLayoutParams();
        if (!z2 || ((ViewGroup.MarginLayoutParams) eVar).leftMargin == (i5 = rect.left)) {
            z6 = false;
        } else {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i5;
            z6 = true;
        }
        if (z3 && ((ViewGroup.MarginLayoutParams) eVar).topMargin != (i4 = rect.top)) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i4;
            z6 = true;
        }
        if (z5 && ((ViewGroup.MarginLayoutParams) eVar).rightMargin != (i3 = rect.right)) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i3;
            z6 = true;
        }
        if (!z4 || ((ViewGroup.MarginLayoutParams) eVar).bottomMargin == (i2 = rect.bottom)) {
            return z6;
        }
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i2;
        return true;
    }

    private void k() {
        h();
        this.E.run();
    }

    private void l() {
        h();
        postDelayed(this.E, 600);
    }

    private void m() {
        h();
        postDelayed(this.D, 600);
    }

    private void n() {
        h();
        this.D.run();
    }

    @Override // androidx.appcompat.widget.b0
    public void a(int i2) {
        j();
        if (i2 == 2) {
            this.f434f.n();
        } else if (i2 == 5) {
            this.f434f.o();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.b0
    public void a(Menu menu, n.a aVar) {
        j();
        this.f434f.a(menu, aVar);
    }

    @Override // c.h.l.q
    public void a(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // c.h.l.q
    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // c.h.l.r
    public void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        a(view, i2, i3, i4, i5, i6);
    }

    @Override // c.h.l.q
    public void a(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // c.h.l.q
    public void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // androidx.appcompat.widget.b0
    public boolean a() {
        j();
        return this.f434f.a();
    }

    @Override // androidx.appcompat.widget.b0
    public void b() {
        j();
        this.f434f.b();
    }

    @Override // c.h.l.q
    public boolean b(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // androidx.appcompat.widget.b0
    public boolean c() {
        j();
        return this.f434f.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.b0
    public boolean d() {
        j();
        return this.f434f.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f435g != null && !this.f436h) {
            int bottom = this.f433e.getVisibility() == 0 ? (int) (((float) this.f433e.getBottom()) + this.f433e.getTranslationY() + 0.5f) : 0;
            this.f435g.setBounds(0, bottom, getWidth(), this.f435g.getIntrinsicHeight() + bottom);
            this.f435g.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.b0
    public boolean e() {
        j();
        return this.f434f.e();
    }

    @Override // androidx.appcompat.widget.b0
    public boolean f() {
        j();
        return this.f434f.f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        j();
        boolean a2 = a((View) this.f433e, rect, true, true, false, true);
        this.r.set(rect);
        c1.a(this, this.r, this.o);
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
            a2 = true;
        }
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            a2 = true;
        }
        if (a2) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.b0
    public void g() {
        j();
        this.f434f.g();
    }

    /* access modifiers changed from: protected */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // android.view.ViewGroup
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f433e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.F.a();
    }

    public CharSequence getTitle() {
        j();
        return this.f434f.getTitle();
    }

    /* access modifiers changed from: package-private */
    public void h() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean i() {
        return this.f437i;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (this.f432d == null) {
            this.f432d = (ContentFrameLayout) findViewById(f.action_bar_activity_content);
            this.f433e = (ActionBarContainer) findViewById(f.action_bar_container);
            this.f434f = a(findViewById(f.action_bar));
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        k0 a2 = k0.a(windowInsets, this);
        boolean a3 = a((View) this.f433e, new Rect(a2.h(), a2.j(), a2.i(), a2.g()), true, true, false, true);
        b0.a(this, a2, this.o);
        Rect rect = this.o;
        this.v = a2.a(rect.left, rect.top, rect.right, rect.bottom);
        if (!this.w.equals(this.v)) {
            this.w = this.v;
            a3 = true;
        }
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            a3 = true;
        }
        if (a3) {
            requestLayout();
        }
        return a2.a().c().b().m();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        b0.N(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 404
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // c.h.l.s
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f439k || !z2) {
            return false;
        }
        if (a(f3)) {
            k();
        } else {
            n();
        }
        this.f440l = true;
        return true;
    }

    @Override // c.h.l.s
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // c.h.l.s
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // c.h.l.s
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        this.f441m += i3;
        setActionBarHideOffset(this.f441m);
    }

    @Override // c.h.l.s
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.F.a(view, view2, i2);
        this.f441m = getActionBarHideOffset();
        h();
        d dVar = this.z;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // c.h.l.s
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f433e.getVisibility() != 0) {
            return false;
        }
        return this.f439k;
    }

    @Override // c.h.l.s
    public void onStopNestedScroll(View view) {
        if (this.f439k && !this.f440l) {
            if (this.f441m <= this.f433e.getHeight()) {
                m();
            } else {
                l();
            }
        }
        d dVar = this.z;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        j();
        int i3 = this.n ^ i2;
        this.n = i2;
        boolean z2 = false;
        boolean z3 = (i2 & 4) == 0;
        if ((i2 & 256) != 0) {
            z2 = true;
        }
        d dVar = this.z;
        if (dVar != null) {
            dVar.a(!z2);
            if (z3 || !z2) {
                this.z.a();
            } else {
                this.z.d();
            }
        }
        if ((i3 & 256) != 0 && this.z != null) {
            b0.N(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f431c = i2;
        d dVar = this.z;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i2);
        }
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.f433e.setTranslationY((float) (-Math.max(0, Math.min(i2, this.f433e.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.z = dVar;
        if (getWindowToken() != null) {
            this.z.onWindowVisibilityChanged(this.f431c);
            int i2 = this.n;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                b0.N(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f438j = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f439k) {
            this.f439k = z2;
            if (!z2) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        j();
        this.f434f.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        j();
        this.f434f.setIcon(drawable);
    }

    public void setLogo(int i2) {
        j();
        this.f434f.c(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.f437i = z2;
        this.f436h = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // androidx.appcompat.widget.b0
    public void setWindowCallback(Window.Callback callback) {
        j();
        this.f434f.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.b0
    public void setWindowTitle(CharSequence charSequence) {
        j();
        this.f434f.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
