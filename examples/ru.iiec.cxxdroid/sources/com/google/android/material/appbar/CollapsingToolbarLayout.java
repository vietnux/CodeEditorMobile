package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import c.h.l.b0;
import c.h.l.k0;
import c.h.l.u;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.l;
import e.b.b.b.f;
import e.b.b.b.i;
import e.b.b.b.j;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private boolean f6268b;

    /* renamed from: c  reason: collision with root package name */
    private int f6269c;

    /* renamed from: d  reason: collision with root package name */
    private Toolbar f6270d;

    /* renamed from: e  reason: collision with root package name */
    private View f6271e;

    /* renamed from: f  reason: collision with root package name */
    private View f6272f;

    /* renamed from: g  reason: collision with root package name */
    private int f6273g;

    /* renamed from: h  reason: collision with root package name */
    private int f6274h;

    /* renamed from: i  reason: collision with root package name */
    private int f6275i;

    /* renamed from: j  reason: collision with root package name */
    private int f6276j;

    /* renamed from: k  reason: collision with root package name */
    private final Rect f6277k;

    /* renamed from: l  reason: collision with root package name */
    final com.google.android.material.internal.c f6278l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6279m;
    private boolean n;
    private Drawable o;
    Drawable p;
    private int q;
    private boolean r;
    private ValueAnimator s;
    private long t;
    private int u;
    private AppBarLayout.d v;
    int w;
    k0 x;

    class a implements u {
        a() {
        }

        @Override // c.h.l.u
        public k0 a(View view, k0 k0Var) {
            return CollapsingToolbarLayout.this.a(k0Var);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static class c extends FrameLayout.LayoutParams {
        int a = 0;

        /* renamed from: b  reason: collision with root package name */
        float f6280b = 0.5f;

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.CollapsingToolbarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(j.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            a(obtainStyledAttributes.getFloat(j.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public void a(float f2) {
            this.f6280b = f2;
        }
    }

    private class d implements AppBarLayout.d {
        d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i2) {
            int i3;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.w = i2;
            k0 k0Var = collapsingToolbarLayout.x;
            int j2 = k0Var != null ? k0Var.j() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i4);
                c cVar = (c) childAt.getLayoutParams();
                d d2 = CollapsingToolbarLayout.d(childAt);
                int i5 = cVar.a;
                if (i5 == 1) {
                    i3 = c.h.g.a.a(-i2, 0, CollapsingToolbarLayout.this.a(childAt));
                } else if (i5 == 2) {
                    i3 = Math.round(((float) (-i2)) * cVar.f6280b);
                }
                d2.b(i3);
            }
            CollapsingToolbarLayout.this.a();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.p != null && j2 > 0) {
                b0.M(collapsingToolbarLayout2);
            }
            CollapsingToolbarLayout.this.f6278l.a(((float) Math.abs(i2)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - b0.s(CollapsingToolbarLayout.this)) - j2)));
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f6268b = true;
        this.f6277k = new Rect();
        this.u = -1;
        this.f6278l = new com.google.android.material.internal.c(this);
        this.f6278l.a(e.b.b.b.k.a.f7820d);
        TypedArray c2 = l.c(context, attributeSet, j.CollapsingToolbarLayout, i2, i.Widget_Design_CollapsingToolbar, new int[0]);
        this.f6278l.d(c2.getInt(j.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        this.f6278l.b(c2.getInt(j.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = c2.getDimensionPixelSize(j.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f6276j = dimensionPixelSize;
        this.f6275i = dimensionPixelSize;
        this.f6274h = dimensionPixelSize;
        this.f6273g = dimensionPixelSize;
        if (c2.hasValue(j.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f6273g = c2.getDimensionPixelSize(j.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (c2.hasValue(j.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f6275i = c2.getDimensionPixelSize(j.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (c2.hasValue(j.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f6274h = c2.getDimensionPixelSize(j.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (c2.hasValue(j.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.f6276j = c2.getDimensionPixelSize(j.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.f6279m = c2.getBoolean(j.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(c2.getText(j.CollapsingToolbarLayout_title));
        this.f6278l.c(i.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.f6278l.a(c.a.i.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (c2.hasValue(j.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.f6278l.c(c2.getResourceId(j.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (c2.hasValue(j.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.f6278l.a(c2.getResourceId(j.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.u = c2.getDimensionPixelSize(j.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        this.t = (long) c2.getInt(j.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(c2.getDrawable(j.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(c2.getDrawable(j.CollapsingToolbarLayout_statusBarScrim));
        this.f6269c = c2.getResourceId(j.CollapsingToolbarLayout_toolbarId, -1);
        c2.recycle();
        setWillNotDraw(false);
        b0.a(this, new a());
    }

    private void a(int i2) {
        b();
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator == null) {
            this.s = new ValueAnimator();
            this.s.setDuration(this.t);
            this.s.setInterpolator(i2 > this.q ? e.b.b.b.k.a.f7818b : e.b.b.b.k.a.f7819c);
            this.s.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.s.cancel();
        }
        this.s.setIntValues(this.q, i2);
        this.s.start();
    }

    private View b(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    private void b() {
        if (this.f6268b) {
            Toolbar toolbar = null;
            this.f6270d = null;
            this.f6271e = null;
            int i2 = this.f6269c;
            if (i2 != -1) {
                this.f6270d = (Toolbar) findViewById(i2);
                Toolbar toolbar2 = this.f6270d;
                if (toolbar2 != null) {
                    this.f6271e = b(toolbar2);
                }
            }
            if (this.f6270d == null) {
                int childCount = getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i3);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i3++;
                }
                this.f6270d = toolbar;
            }
            d();
            this.f6268b = false;
        }
    }

    private static int c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private void c() {
        setContentDescription(getTitle());
    }

    static d d(View view) {
        d dVar = (d) view.getTag(f.view_offset_helper);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(view);
        view.setTag(f.view_offset_helper, dVar2);
        return dVar2;
    }

    private void d() {
        View view;
        if (!this.f6279m && (view = this.f6272f) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f6272f);
            }
        }
        if (this.f6279m && this.f6270d != null) {
            if (this.f6272f == null) {
                this.f6272f = new View(getContext());
            }
            if (this.f6272f.getParent() == null) {
                this.f6270d.addView(this.f6272f, -1, -1);
            }
        }
    }

    private boolean e(View view) {
        View view2 = this.f6271e;
        if (view2 == null || view2 == this) {
            if (view == this.f6270d) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int a(View view) {
        return ((getHeight() - d(view).a()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((c) view.getLayoutParams())).bottomMargin;
    }

    /* access modifiers changed from: package-private */
    public k0 a(k0 k0Var) {
        k0 k0Var2 = b0.o(this) ? k0Var : null;
        if (!c.h.k.c.a(this.x, k0Var2)) {
            this.x = k0Var2;
            requestLayout();
        }
        return k0Var.c();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.o != null || this.p != null) {
            setScrimsShown(getHeight() + this.w < getScrimVisibleHeightTrigger());
        }
    }

    public void a(boolean z, boolean z2) {
        if (this.r != z) {
            int i2 = 255;
            if (z2) {
                if (!z) {
                    i2 = 0;
                }
                a(i2);
            } else {
                if (!z) {
                    i2 = 0;
                }
                setScrimAlpha(i2);
            }
            this.r = z;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        b();
        if (this.f6270d == null && (drawable = this.o) != null && this.q > 0) {
            drawable.mutate().setAlpha(this.q);
            this.o.draw(canvas);
        }
        if (this.f6279m && this.n) {
            this.f6278l.a(canvas);
        }
        if (this.p != null && this.q > 0) {
            k0 k0Var = this.x;
            int j2 = k0Var != null ? k0Var.j() : 0;
            if (j2 > 0) {
                this.p.setBounds(0, -this.w, getWidth(), j2 - this.w);
                this.p.mutate().setAlpha(this.q);
                this.p.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z;
        if (this.o == null || this.q <= 0 || !e(view)) {
            z = false;
        } else {
            this.o.mutate().setAlpha(this.q);
            this.o.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j2) || z;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.o;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.c cVar = this.f6278l;
        if (cVar != null) {
            z |= cVar.a(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.widget.FrameLayout
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f6278l.a();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f6278l.b();
    }

    public Drawable getContentScrim() {
        return this.o;
    }

    public int getExpandedTitleGravity() {
        return this.f6278l.d();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f6276j;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f6275i;
    }

    public int getExpandedTitleMarginStart() {
        return this.f6273g;
    }

    public int getExpandedTitleMarginTop() {
        return this.f6274h;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f6278l.e();
    }

    /* access modifiers changed from: package-private */
    public int getScrimAlpha() {
        return this.q;
    }

    public long getScrimAnimationDuration() {
        return this.t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i2 = this.u;
        if (i2 >= 0) {
            return i2;
        }
        k0 k0Var = this.x;
        int j2 = k0Var != null ? k0Var.j() : 0;
        int s2 = b0.s(this);
        return s2 > 0 ? Math.min((s2 * 2) + j2, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.p;
    }

    public CharSequence getTitle() {
        if (this.f6279m) {
            return this.f6278l.f();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            b0.a(this, b0.o((View) parent));
            if (this.v == null) {
                this.v = new d();
            }
            ((AppBarLayout) parent).a(this.v);
            b0.N(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.d dVar = this.v;
        if (dVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).b(dVar);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View view;
        super.onLayout(z, i2, i3, i4, i5);
        k0 k0Var = this.x;
        if (k0Var != null) {
            int j2 = k0Var.j();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!b0.o(childAt) && childAt.getTop() < j2) {
                    b0.e(childAt, j2);
                }
            }
        }
        if (this.f6279m && (view = this.f6272f) != null) {
            boolean z2 = true;
            this.n = b0.H(view) && this.f6272f.getVisibility() == 0;
            if (this.n) {
                if (b0.r(this) != 1) {
                    z2 = false;
                }
                View view2 = this.f6271e;
                if (view2 == null) {
                    view2 = this.f6270d;
                }
                int a2 = a(view2);
                com.google.android.material.internal.d.a(this, this.f6272f, this.f6277k);
                com.google.android.material.internal.c cVar = this.f6278l;
                int i7 = this.f6277k.left;
                Toolbar toolbar = this.f6270d;
                int titleMarginEnd = i7 + (z2 ? toolbar.getTitleMarginEnd() : toolbar.getTitleMarginStart());
                int titleMarginTop = this.f6277k.top + a2 + this.f6270d.getTitleMarginTop();
                int i8 = this.f6277k.right;
                Toolbar toolbar2 = this.f6270d;
                cVar.a(titleMarginEnd, titleMarginTop, i8 + (z2 ? toolbar2.getTitleMarginStart() : toolbar2.getTitleMarginEnd()), (this.f6277k.bottom + a2) - this.f6270d.getTitleMarginBottom());
                this.f6278l.b(z2 ? this.f6275i : this.f6273g, this.f6277k.top + this.f6274h, (i4 - i2) - (z2 ? this.f6273g : this.f6275i), (i5 - i3) - this.f6276j);
                this.f6278l.i();
            }
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            d(getChildAt(i9)).c();
        }
        if (this.f6270d != null) {
            if (this.f6279m && TextUtils.isEmpty(this.f6278l.f())) {
                setTitle(this.f6270d.getTitle());
            }
            View view3 = this.f6271e;
            if (view3 == null || view3 == this) {
                view3 = this.f6270d;
            }
            setMinimumHeight(c(view3));
        }
        a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        b();
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        k0 k0Var = this.x;
        int j2 = k0Var != null ? k0Var.j() : 0;
        if (mode == 0 && j2 > 0) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + j2, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i3);
        }
    }

    public void setCollapsedTitleGravity(int i2) {
        this.f6278l.b(i2);
    }

    public void setCollapsedTitleTextAppearance(int i2) {
        this.f6278l.a(i2);
    }

    public void setCollapsedTitleTextColor(int i2) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f6278l.a(colorStateList);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f6278l.a(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.o = drawable3;
            Drawable drawable4 = this.o;
            if (drawable4 != null) {
                drawable4.setBounds(0, 0, getWidth(), getHeight());
                this.o.setCallback(this);
                this.o.setAlpha(this.q);
            }
            b0.M(this);
        }
    }

    public void setContentScrimColor(int i2) {
        setContentScrim(new ColorDrawable(i2));
    }

    public void setContentScrimResource(int i2) {
        setContentScrim(c.h.d.a.c(getContext(), i2));
    }

    public void setExpandedTitleColor(int i2) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setExpandedTitleGravity(int i2) {
        this.f6278l.d(i2);
    }

    public void setExpandedTitleMarginBottom(int i2) {
        this.f6276j = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i2) {
        this.f6275i = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i2) {
        this.f6273g = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i2) {
        this.f6274h = i2;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i2) {
        this.f6278l.c(i2);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f6278l.b(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f6278l.b(typeface);
    }

    /* access modifiers changed from: package-private */
    public void setScrimAlpha(int i2) {
        Toolbar toolbar;
        if (i2 != this.q) {
            if (!(this.o == null || (toolbar = this.f6270d) == null)) {
                b0.M(toolbar);
            }
            this.q = i2;
            b0.M(this);
        }
    }

    public void setScrimAnimationDuration(long j2) {
        this.t = j2;
    }

    public void setScrimVisibleHeightTrigger(int i2) {
        if (this.u != i2) {
            this.u = i2;
            a();
        }
    }

    public void setScrimsShown(boolean z) {
        a(z, b0.I(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.p = drawable3;
            Drawable drawable4 = this.p;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.a(this.p, b0.r(this));
                this.p.setVisible(getVisibility() == 0, false);
                this.p.setCallback(this);
                this.p.setAlpha(this.q);
            }
            b0.M(this);
        }
    }

    public void setStatusBarScrimColor(int i2) {
        setStatusBarScrim(new ColorDrawable(i2));
    }

    public void setStatusBarScrimResource(int i2) {
        setStatusBarScrim(c.h.d.a.c(getContext(), i2));
    }

    public void setTitle(CharSequence charSequence) {
        this.f6278l.a(charSequence);
        c();
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f6279m) {
            this.f6279m = z;
            c();
            d();
            requestLayout();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.p;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.p.setVisible(z, false);
        }
        Drawable drawable2 = this.o;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.o.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o || drawable == this.p;
    }
}
