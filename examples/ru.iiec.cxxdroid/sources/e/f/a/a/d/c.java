package e.f.a.a.d;

import android.content.Context;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.Scroller;
import java.util.ArrayList;

public class c extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private long f8316b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f8317c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private Scroller f8318d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8319e;

    /* renamed from: f  reason: collision with root package name */
    private float f8320f;

    /* renamed from: g  reason: collision with root package name */
    private float f8321g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8322h = true;

    /* renamed from: i  reason: collision with root package name */
    private View f8323i = null;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8324j = false;

    /* renamed from: k  reason: collision with root package name */
    private VelocityTracker f8325k;

    /* renamed from: l  reason: collision with root package name */
    private int f8326l;

    /* renamed from: m  reason: collision with root package name */
    private int f8327m;
    private int n;

    public c(Context context) {
        super(context);
        b();
    }

    private int a(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private View a(boolean z, int i2, int i3, boolean z2, int i4, int i5) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = (View) focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            int left = view2.getLeft();
            int right = view2.getRight();
            if (i2 < bottom && top < i3 && i4 < right && left < i5) {
                boolean z4 = i2 < top && bottom < i3 && i4 < left && right < i5;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    boolean z6 = (z2 && left < view.getLeft()) || (!z2 && right > view.getRight());
                    if (z3) {
                        if (z4) {
                            if (z5) {
                                if (!z6) {
                                }
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        if (!z6) {
                        }
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private View a(boolean z, int i2, boolean z2, int i3, View view) {
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength() / 2;
        int i4 = i2 + verticalFadingEdgeLength;
        int height = (i2 + getHeight()) - verticalFadingEdgeLength;
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength() / 2;
        int i5 = i3 + horizontalFadingEdgeLength;
        int width = (i3 + getWidth()) - horizontalFadingEdgeLength;
        return (view == null || view.getTop() >= height || view.getBottom() <= i4 || view.getLeft() >= width || view.getRight() <= i5) ? a(z, i4, height, z2, i5, width) : view;
    }

    private void a(View view) {
        view.getDrawingRect(this.f8317c);
        offsetDescendantRectToMyCoords(view, this.f8317c);
        int a = a(this.f8317c);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    private boolean a() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return false;
        }
        return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom() || getWidth() < (childAt.getWidth() + getPaddingLeft()) + getPaddingRight();
    }

    private boolean a(int i2, int i3, int i4, int i5, int i6, int i7) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = scrollY + height;
        boolean z2 = i2 == 33;
        int width = getWidth();
        int scrollX = getScrollX();
        int i9 = scrollX + width;
        boolean z3 = i5 == 33;
        View a = a(z2, i3, i4, z3, i6, i7);
        if (a == null) {
            a = this;
        }
        if ((i3 < scrollY || i4 > i8) && (i6 < scrollX || i7 > i9)) {
            c(z3 ? i6 - scrollX : i7 - i9, z2 ? i3 - scrollY : i4 - i8);
            z = true;
        } else {
            z = false;
        }
        if (a != findFocus() && a.requestFocus(i2)) {
            this.f8319e = true;
            this.f8319e = false;
        }
        return z;
    }

    private boolean a(Rect rect, boolean z) {
        int a = a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                b(0, a);
            }
        }
        return z2;
    }

    private boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && a((View) parent, view2);
    }

    private void b() {
        this.f8318d = new Scroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f8326l = viewConfiguration.getScaledTouchSlop();
        this.f8327m = viewConfiguration.getScaledMinimumFlingVelocity();
        this.n = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void c(int i2, int i3) {
        if (i2 != 0 || i3 != 0) {
            b(i2, i3);
        }
    }

    /* access modifiers changed from: protected */
    public int a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i2 -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, getChildAt(0).getBottom() - i2);
        } else if (rect.top >= scrollY || rect.bottom >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public void a(int i2, int i3) {
        if (getChildCount() > 0) {
            this.f8318d.fling(getScrollX(), getScrollY(), i2, i3, 0, getChildAt(0).getWidth() - ((getWidth() - getPaddingRight()) - getPaddingLeft()), 0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
            boolean z = i3 > 0;
            View a = a(i2 > 0, this.f8318d.getFinalX(), z, this.f8318d.getFinalY(), findFocus());
            if (a == null) {
                a = this;
            }
            if (a != findFocus()) {
                if (a.requestFocus(z ? 130 : 33)) {
                    this.f8319e = true;
                    this.f8319e = false;
                }
            }
            awakenScrollBars(this.f8318d.getDuration());
            invalidate();
        }
    }

    public boolean a(int i2, boolean z) {
        int bottom;
        int bottom2;
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmountHorizontal = z ? getMaxScrollAmountHorizontal() : getMaxScrollAmountVertical();
        if (!z) {
            if (findNextFocus != null) {
                findNextFocus.getDrawingRect(this.f8317c);
                offsetDescendantRectToMyCoords(findNextFocus, this.f8317c);
                c(0, a(this.f8317c));
            } else {
                if (i2 == 33 && getScrollY() < maxScrollAmountHorizontal) {
                    maxScrollAmountHorizontal = getScrollY();
                } else if (i2 == 130 && getChildCount() > 0 && (bottom2 = getChildAt(0).getBottom() - (getScrollY() + getHeight())) < maxScrollAmountHorizontal) {
                    maxScrollAmountHorizontal = bottom2;
                }
                if (maxScrollAmountHorizontal == 0) {
                    return false;
                }
                if (i2 != 130) {
                    maxScrollAmountHorizontal = -maxScrollAmountHorizontal;
                }
                c(0, maxScrollAmountHorizontal);
                return true;
            }
        } else if (findNextFocus != null) {
            findNextFocus.getDrawingRect(this.f8317c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f8317c);
            c(a(this.f8317c), 0);
        } else {
            if (i2 == 33 && getScrollY() < maxScrollAmountHorizontal) {
                maxScrollAmountHorizontal = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0 && (bottom = getChildAt(0).getBottom() - (getScrollY() + getHeight())) < maxScrollAmountHorizontal) {
                maxScrollAmountHorizontal = bottom;
            }
            if (maxScrollAmountHorizontal == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmountHorizontal = -maxScrollAmountHorizontal;
            }
            c(maxScrollAmountHorizontal, 0);
            return true;
        }
        findNextFocus.requestFocus(i2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r5.isAltPressed() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r5.isAltPressed() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return a(r0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return b(r0, true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.KeyEvent r5) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.a.d.c.a(android.view.KeyEvent):boolean");
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("TwoDScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("TwoDScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("TwoDScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("TwoDScrollView can host only one direct child");
    }

    public final void b(int i2, int i3) {
        int i4 = ((AnimationUtils.currentAnimationTimeMillis() - this.f8316b) > 250 ? 1 : ((AnimationUtils.currentAnimationTimeMillis() - this.f8316b) == 250 ? 0 : -1));
        Scroller scroller = this.f8318d;
        if (i4 > 0) {
            scroller.startScroll(getScrollX(), getScrollY(), i2, i3);
            awakenScrollBars(this.f8318d.getDuration());
            invalidate();
        } else {
            if (!scroller.isFinished()) {
                this.f8318d.abortAnimation();
            }
            scrollBy(i2, i3);
        }
        this.f8316b = AnimationUtils.currentAnimationTimeMillis();
    }

    public boolean b(int i2, boolean z) {
        int childCount;
        int childCount2;
        if (!z) {
            boolean z2 = i2 == 130;
            int height = getHeight();
            Rect rect = this.f8317c;
            rect.top = 0;
            rect.bottom = height;
            if (z2 && (childCount2 = getChildCount()) > 0) {
                this.f8317c.bottom = getChildAt(childCount2 - 1).getBottom();
                Rect rect2 = this.f8317c;
                rect2.top = rect2.bottom - height;
            }
            Rect rect3 = this.f8317c;
            return a(i2, rect3.top, rect3.bottom, 0, 0, 0);
        }
        boolean z3 = i2 == 130;
        int width = getWidth();
        Rect rect4 = this.f8317c;
        rect4.left = 0;
        rect4.right = width;
        if (z3 && (childCount = getChildCount()) > 0) {
            this.f8317c.right = getChildAt(childCount - 1).getBottom();
            Rect rect5 = this.f8317c;
            rect5.left = rect5.right - width;
        }
        Rect rect6 = this.f8317c;
        return a(0, 0, 0, i2, rect6.top, rect6.bottom);
    }

    /* access modifiers changed from: protected */
    public int computeHorizontalScrollRange() {
        return getChildCount() == 0 ? getWidth() : getChildAt(0).getRight();
    }

    public void computeScroll() {
        if (this.f8318d.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f8318d.getCurrX();
            int currY = this.f8318d.getCurrY();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                currX = a(currX, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
                currY = a(currY, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            }
            scrollTo(currX, currY);
            if (!(scrollX == getScrollX() && scrollY == getScrollY())) {
                onScrollChanged(getScrollX(), getScrollY(), scrollX, scrollY);
            }
            postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollRange() {
        return getChildCount() == 0 ? getHeight() : getChildAt(0).getBottom();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return a(keyEvent);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public float getLeftFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (getScrollX() < horizontalFadingEdgeLength) {
            return ((float) getScrollX()) / ((float) horizontalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmountHorizontal() {
        return (int) (((float) getWidth()) * 0.5f);
    }

    public int getMaxScrollAmountVertical() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    /* access modifiers changed from: protected */
    public float getRightFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int right = (getChildAt(0).getRight() - getScrollX()) - (getWidth() - getPaddingRight());
        if (right < horizontalFadingEdgeLength) {
            return ((float) right) / ((float) horizontalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (getScrollY() < verticalFadingEdgeLength) {
            return ((float) getScrollY()) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i2, int i3) {
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec(marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, 0), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r0 != 3) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r5.f8324j
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            boolean r3 = r5.a()
            r4 = 0
            if (r3 != 0) goto L_0x0017
            r5.f8324j = r4
            return r4
        L_0x0017:
            float r3 = r6.getY()
            float r6 = r6.getX()
            if (r0 == 0) goto L_0x0045
            if (r0 == r2) goto L_0x0042
            if (r0 == r1) goto L_0x0029
            r6 = 3
            if (r0 == r6) goto L_0x0042
            goto L_0x0052
        L_0x0029:
            float r0 = r5.f8320f
            float r3 = r3 - r0
            float r0 = java.lang.Math.abs(r3)
            int r0 = (int) r0
            float r1 = r5.f8321g
            float r6 = r6 - r1
            float r6 = java.lang.Math.abs(r6)
            int r6 = (int) r6
            int r1 = r5.f8326l
            if (r0 > r1) goto L_0x003f
            if (r6 <= r1) goto L_0x0052
        L_0x003f:
            r5.f8324j = r2
            goto L_0x0052
        L_0x0042:
            r5.f8324j = r4
            goto L_0x0052
        L_0x0045:
            r5.f8320f = r3
            r5.f8321g = r6
            android.widget.Scroller r6 = r5.f8318d
            boolean r6 = r6.isFinished()
            r6 = r6 ^ r2
            r5.f8324j = r6
        L_0x0052:
            boolean r6 = r5.f8324j
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.a.d.c.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.f8322h = false;
        View view = this.f8323i;
        if (view != null && a(view, this)) {
            a(this.f8323i);
        }
        this.f8323i = null;
        scrollTo(getScrollX(), getScrollY());
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, null, i2) : instance.findNextFocusFromRect(this, rect, i2);
        if (findNextFocus == null) {
            return false;
        }
        return findNextFocus.requestFocus(i2, rect);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus) {
            findFocus.getDrawingRect(this.f8317c);
            offsetDescendantRectToMyCoords(findFocus, this.f8317c);
            c(a(this.f8317c), a(this.f8317c));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (getScrollX() < 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        if (getScrollY() < 0) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.a.d.c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f8319e) {
            if (!this.f8322h) {
                a(view2);
            } else {
                this.f8323i = view2;
            }
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return a(rect, z);
    }

    public void requestLayout() {
        this.f8322h = true;
        super.requestLayout();
    }

    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int a = a(i2, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int a2 = a(i3, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (a != getScrollX() || a2 != getScrollY()) {
                super.scrollTo(a, a2);
            }
        }
    }
}
