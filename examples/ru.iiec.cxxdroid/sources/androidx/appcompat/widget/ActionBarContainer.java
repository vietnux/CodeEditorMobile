package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c.a.f;
import c.a.j;
import c.h.l.b0;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private boolean f415b;

    /* renamed from: c  reason: collision with root package name */
    private View f416c;

    /* renamed from: d  reason: collision with root package name */
    private View f417d;

    /* renamed from: e  reason: collision with root package name */
    private View f418e;

    /* renamed from: f  reason: collision with root package name */
    Drawable f419f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f420g;

    /* renamed from: h  reason: collision with root package name */
    Drawable f421h;

    /* renamed from: i  reason: collision with root package name */
    boolean f422i;

    /* renamed from: j  reason: collision with root package name */
    boolean f423j;

    /* renamed from: k  reason: collision with root package name */
    private int f424k;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b0.a(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionBar);
        this.f419f = obtainStyledAttributes.getDrawable(j.ActionBar_background);
        this.f420g = obtainStyledAttributes.getDrawable(j.ActionBar_backgroundStacked);
        this.f424k = obtainStyledAttributes.getDimensionPixelSize(j.ActionBar_height, -1);
        if (getId() == f.split_action_bar) {
            this.f422i = true;
            this.f421h = obtainStyledAttributes.getDrawable(j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f422i ? this.f419f == null && this.f420g == null : this.f421h == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f419f;
        if (drawable != null && drawable.isStateful()) {
            this.f419f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f420g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f420g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f421h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f421h.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f416c;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f419f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f420g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f421h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f417d = findViewById(f.action_bar);
        this.f418e = findViewById(f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f415b || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i2, i3, i4, i5);
        View view2 = this.f416c;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            view2.layout(i2, (measuredHeight - view2.getMeasuredHeight()) - layoutParams.bottomMargin, i4, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f422i) {
            Drawable drawable3 = this.f421h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f419f != null) {
                if (this.f417d.getVisibility() == 0) {
                    drawable2 = this.f419f;
                    left = this.f417d.getLeft();
                    top = this.f417d.getTop();
                    right = this.f417d.getRight();
                    view = this.f417d;
                } else {
                    View view3 = this.f418e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f419f.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f419f;
                        left = this.f418e.getLeft();
                        top = this.f418e.getTop();
                        right = this.f418e.getRight();
                        view = this.f418e;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f423j = z4;
            if (!z4 || (drawable = this.f420g) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f419f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f419f);
        }
        this.f419f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f417d;
            if (view != null) {
                this.f419f.setBounds(view.getLeft(), this.f417d.getTop(), this.f417d.getRight(), this.f417d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f422i ? !(this.f419f == null && this.f420g == null) : this.f421h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f421h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f421h);
        }
        this.f421h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f422i && (drawable2 = this.f421h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f422i ? this.f419f == null && this.f420g == null : this.f421h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f420g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f420g);
        }
        this.f420g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f423j && (drawable2 = this.f420g) != null) {
                drawable2.setBounds(this.f416c.getLeft(), this.f416c.getTop(), this.f416c.getRight(), this.f416c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f422i ? !(this.f419f == null && this.f420g == null) : this.f421h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(p0 p0Var) {
        View view = this.f416c;
        if (view != null) {
            removeView(view);
        }
        this.f416c = p0Var;
        if (p0Var != null) {
            addView(p0Var);
            ViewGroup.LayoutParams layoutParams = p0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            p0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f415b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f419f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f420g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f421h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f419f && !this.f422i) || (drawable == this.f420g && this.f423j) || ((drawable == this.f421h && this.f422i) || super.verifyDrawable(drawable));
    }
}
