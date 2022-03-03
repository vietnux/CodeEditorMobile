package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.l;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.m;
import c.h.l.a0;
import c.h.l.b0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.internal.d;
import com.google.android.material.internal.n;
import e.b.b.b.i;
import e.b.b.b.j;
import e.b.b.b.k.h;
import java.util.List;

@CoordinatorLayout.d(Behavior.class)
public class FloatingActionButton extends n implements a0, m, e.b.b.b.m.a {

    /* renamed from: c  reason: collision with root package name */
    private ColorStateList f6363c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuff.Mode f6364d;

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f6365e;

    /* renamed from: f  reason: collision with root package name */
    private PorterDuff.Mode f6366f;

    /* renamed from: g  reason: collision with root package name */
    private int f6367g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f6368h;

    /* renamed from: i  reason: collision with root package name */
    private int f6369i;

    /* renamed from: j  reason: collision with root package name */
    private int f6370j;

    /* renamed from: k  reason: collision with root package name */
    private int f6371k;

    /* renamed from: l  reason: collision with root package name */
    private int f6372l;

    /* renamed from: m  reason: collision with root package name */
    boolean f6373m;
    final Rect n;
    private final Rect o;
    private final l p;
    private final e.b.b.b.m.c q;
    private a r;

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        private Rect a;

        /* renamed from: b  reason: collision with root package name */
        private b f6374b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f6375c;

        public BaseBehavior() {
            this.f6375c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.FloatingActionButton_Behavior_Layout);
            this.f6375c = obtainStyledAttributes.getBoolean(j.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        private void a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.n;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                int i2 = 0;
                int i3 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    b0.e(floatingActionButton, i2);
                }
                if (i3 != 0) {
                    b0.d(floatingActionButton, i3);
                }
            }
        }

        private static boolean a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean a(View view, FloatingActionButton floatingActionButton) {
            return this.f6375c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).c() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.a(this.f6374b, false);
                return true;
            }
            floatingActionButton.b(this.f6374b, false);
            return true;
        }

        private boolean b(View view, FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.a(this.f6374b, false);
                return true;
            }
            floatingActionButton.b(this.f6374b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void a(CoordinatorLayout.f fVar) {
            if (fVar.f976h == 0) {
                fVar.f976h = 80;
            }
        }

        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i2) {
            List<View> b2 = coordinatorLayout.b(floatingActionButton);
            int size = b2.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = b2.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (a(view) && b(view, floatingActionButton)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.c(floatingActionButton, i2);
            a(coordinatorLayout, floatingActionButton);
            return true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!a(view)) {
                return false;
            } else {
                b(view, floatingActionButton);
                return false;
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements a.g {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.a.g
        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.a.g
        public void b() {
            this.a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public abstract void a(FloatingActionButton floatingActionButton);

        public abstract void b(FloatingActionButton floatingActionButton);
    }

    /* access modifiers changed from: private */
    public class c implements e.b.b.b.q.b {
        c() {
        }

        @Override // e.b.b.b.q.b
        public void a(int i2, int i3, int i4, int i5) {
            FloatingActionButton.this.n.set(i2, i3, i4, i5);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i2 + floatingActionButton.f6371k, i3 + FloatingActionButton.this.f6371k, i4 + FloatingActionButton.this.f6371k, i5 + FloatingActionButton.this.f6371k);
        }

        @Override // e.b.b.b.q.b
        public void a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        @Override // e.b.b.b.q.b
        public boolean a() {
            return FloatingActionButton.this.f6373m;
        }

        @Override // e.b.b.b.q.b
        public float b() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.b.b.b.b.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.n = new Rect();
        this.o = new Rect();
        TypedArray c2 = com.google.android.material.internal.l.c(context, attributeSet, j.FloatingActionButton, i2, i.Widget_Design_FloatingActionButton, new int[0]);
        this.f6363c = e.b.b.b.o.a.a(context, c2, j.FloatingActionButton_backgroundTint);
        this.f6364d = com.google.android.material.internal.m.a(c2.getInt(j.FloatingActionButton_backgroundTintMode, -1), null);
        this.f6368h = e.b.b.b.o.a.a(context, c2, j.FloatingActionButton_rippleColor);
        this.f6369i = c2.getInt(j.FloatingActionButton_fabSize, -1);
        this.f6370j = c2.getDimensionPixelSize(j.FloatingActionButton_fabCustomSize, 0);
        this.f6367g = c2.getDimensionPixelSize(j.FloatingActionButton_borderWidth, 0);
        float dimension = c2.getDimension(j.FloatingActionButton_elevation, 0.0f);
        float dimension2 = c2.getDimension(j.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = c2.getDimension(j.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f6373m = c2.getBoolean(j.FloatingActionButton_useCompatPadding, false);
        this.f6372l = c2.getDimensionPixelSize(j.FloatingActionButton_maxImageSize, 0);
        h a2 = h.a(context, c2, j.FloatingActionButton_showMotionSpec);
        h a3 = h.a(context, c2, j.FloatingActionButton_hideMotionSpec);
        c2.recycle();
        this.p = new l(this);
        this.p.a(attributeSet, i2);
        this.q = new e.b.b.b.m.c(this);
        getImpl().a(this.f6363c, this.f6364d, this.f6368h, this.f6367g);
        getImpl().a(dimension);
        getImpl().b(dimension2);
        getImpl().d(dimension3);
        getImpl().a(this.f6372l);
        getImpl().b(a2);
        getImpl().a(a3);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private int a(int i2) {
        int i3 = this.f6370j;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? a(1) : a(0);
        }
        return resources.getDimensionPixelSize(i2 != 1 ? e.b.b.b.d.design_fab_size_normal : e.b.b.b.d.design_fab_size_mini);
    }

    private static int a(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private a.g a(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    private a c() {
        return Build.VERSION.SDK_INT >= 21 ? new b(this, new c()) : new a(this, new c());
    }

    private void c(Rect rect) {
        int i2 = rect.left;
        Rect rect2 = this.n;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void d() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f6365e;
            if (colorStateList == null) {
                androidx.core.graphics.drawable.a.b(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f6366f;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(androidx.appcompat.widget.i.a(colorForState, mode));
        }
    }

    private a getImpl() {
        if (this.r == null) {
            this.r = c();
        }
        return this.r;
    }

    public void a(Animator.AnimatorListener animatorListener) {
        getImpl().a(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar, boolean z) {
        getImpl().a(a(bVar), z);
    }

    @Override // e.b.b.b.m.b
    public boolean a() {
        return this.q.b();
    }

    @Deprecated
    public boolean a(Rect rect) {
        if (!b0.I(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        c(rect);
        return true;
    }

    public void b(Animator.AnimatorListener animatorListener) {
        getImpl().b(animatorListener);
    }

    public void b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        c(rect);
    }

    /* access modifiers changed from: package-private */
    public void b(b bVar, boolean z) {
        getImpl().b(a(bVar), z);
    }

    public boolean b() {
        return getImpl().i();
    }

    public void c(Animator.AnimatorListener animatorListener) {
        getImpl().c(animatorListener);
    }

    public void d(Animator.AnimatorListener animatorListener) {
        getImpl().d(animatorListener);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f6363c;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f6364d;
    }

    public float getCompatElevation() {
        return getImpl().c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().e();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f();
    }

    public Drawable getContentBackground() {
        return getImpl().b();
    }

    public int getCustomSize() {
        return this.f6370j;
    }

    public int getExpandedComponentIdHint() {
        return this.q.a();
    }

    public h getHideMotionSpec() {
        return getImpl().d();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f6368h;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f6368h;
    }

    public h getShowMotionSpec() {
        return getImpl().g();
    }

    public int getSize() {
        return this.f6369i;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return a(this.f6369i);
    }

    @Override // c.h.l.a0
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // c.h.l.a0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.m
    public ColorStateList getSupportImageTintList() {
        return this.f6365e;
    }

    @Override // androidx.core.widget.m
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f6366f;
    }

    public boolean getUseCompatPadding() {
        return this.f6373m;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().j();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().o();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int sizeDimension = getSizeDimension();
        this.f6371k = (sizeDimension - this.f6372l) / 2;
        getImpl().s();
        int min = Math.min(a(sizeDimension, i2), a(sizeDimension, i3));
        Rect rect = this.n;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e.b.b.b.s.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e.b.b.b.s.a aVar = (e.b.b.b.s.a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        this.q.a(aVar.f7857d.get("expandableWidgetHelper"));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        e.b.b.b.s.a aVar = new e.b.b.b.s.a(super.onSaveInstanceState());
        aVar.f7857d.put("expandableWidgetHelper", this.q.c());
        return aVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !a(this.o) || this.o.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f6363c != colorStateList) {
            this.f6363c = colorStateList;
            getImpl().a(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f6364d != mode) {
            this.f6364d = mode;
            getImpl().a(mode);
        }
    }

    public void setCompatElevation(float f2) {
        getImpl().a(f2);
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        getImpl().b(f2);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        getImpl().d(f2);
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 >= 0) {
            this.f6370j = i2;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public void setExpandedComponentIdHint(int i2) {
        this.q.a(i2);
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().a(hVar);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(h.a(getContext(), i2));
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getImpl().r();
    }

    public void setImageResource(int i2) {
        this.p.a(i2);
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f6368h != colorStateList) {
            this.f6368h = colorStateList;
            getImpl().b(this.f6368h);
        }
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().b(hVar);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(h.a(getContext(), i2));
    }

    public void setSize(int i2) {
        this.f6370j = 0;
        if (i2 != this.f6369i) {
            this.f6369i = i2;
            requestLayout();
        }
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f6365e != colorStateList) {
            this.f6365e = colorStateList;
            d();
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f6366f != mode) {
            this.f6366f = mode;
            d();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f6373m != z) {
            this.f6373m = z;
            getImpl().n();
        }
    }
}
