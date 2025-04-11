package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import c.a.j;
import c.h.l.b0;
import c.h.l.g;

public class h0 extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    private boolean f602b;

    /* renamed from: c  reason: collision with root package name */
    private int f603c;

    /* renamed from: d  reason: collision with root package name */
    private int f604d;

    /* renamed from: e  reason: collision with root package name */
    private int f605e;

    /* renamed from: f  reason: collision with root package name */
    private int f606f;

    /* renamed from: g  reason: collision with root package name */
    private int f607g;

    /* renamed from: h  reason: collision with root package name */
    private float f608h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f609i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f610j;

    /* renamed from: k  reason: collision with root package name */
    private int[] f611k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f612l;

    /* renamed from: m  reason: collision with root package name */
    private int f613m;
    private int n;
    private int o;
    private int p;

    public static class a extends LinearLayout.LayoutParams {
        public a(int i2, int i3) {
            super(i2, i3);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public h0(Context context) {
        this(context, null);
    }

    public h0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f602b = true;
        this.f603c = -1;
        this.f604d = 0;
        this.f606f = 8388659;
        w0 a2 = w0.a(context, attributeSet, j.LinearLayoutCompat, i2, 0);
        b0.a(this, context, j.LinearLayoutCompat, attributeSet, a2.a(), i2, 0);
        int d2 = a2.d(j.LinearLayoutCompat_android_orientation, -1);
        if (d2 >= 0) {
            setOrientation(d2);
        }
        int d3 = a2.d(j.LinearLayoutCompat_android_gravity, -1);
        if (d3 >= 0) {
            setGravity(d3);
        }
        boolean a3 = a2.a(j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a3) {
            setBaselineAligned(a3);
        }
        this.f608h = a2.a(j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f603c = a2.d(j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f609i = a2.a(j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a2.b(j.LinearLayoutCompat_divider));
        this.o = a2.d(j.LinearLayoutCompat_showDividers, 0);
        this.p = a2.c(j.LinearLayoutCompat_dividerPadding, 0);
        a2.b();
    }

    private void a(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    private void c(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View a2 = a(i4);
            if (a2.getVisibility() != 8) {
                a aVar = (a) a2.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i5 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = a2.getMeasuredWidth();
                    measureChildWithMargins(a2, i3, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i5;
                }
            }
        }
    }

    private void d(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View a2 = a(i4);
            if (a2.getVisibility() != 8) {
                a aVar = (a) a2.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i5 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = a2.getMeasuredHeight();
                    measureChildWithMargins(a2, makeMeasureSpec, 0, i3, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i5;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int a(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int a(View view, int i2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public View a(int i2) {
        return getChildAt(i2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03a6, code lost:
        if (r8 > 0) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03b1, code lost:
        if (r8 < 0) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03b3, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b4, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r4), r2);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & -16777216);
        r2 = r2;
        r4 = r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r39, int r40) {
        /*
        // Method dump skipped, instructions count: 1281
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.a(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r25, int r26, int r27, int r28) {
        /*
        // Method dump skipped, instructions count: 321
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.a(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int virtualChildCount = getVirtualChildCount();
        boolean a2 = c1.a(this);
        for (int i5 = 0; i5 < virtualChildCount; i5++) {
            View a3 = a(i5);
            if (!(a3 == null || a3.getVisibility() == 8 || !b(i5))) {
                a aVar = (a) a3.getLayoutParams();
                b(canvas, a2 ? a3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (a3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f613m);
            }
        }
        if (b(virtualChildCount)) {
            View a4 = a(virtualChildCount - 1);
            if (a4 != null) {
                a aVar2 = (a) a4.getLayoutParams();
                if (a2) {
                    i4 = a4.getLeft();
                    i3 = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                } else {
                    i2 = a4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                    b(canvas, i2);
                }
            } else if (a2) {
                i2 = getPaddingLeft();
                b(canvas, i2);
            } else {
                i4 = getWidth();
                i3 = getPaddingRight();
            }
            i2 = (i4 - i3) - this.f613m;
            b(canvas, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Canvas canvas, int i2) {
        this.f612l.setBounds(getPaddingLeft() + this.p, i2, (getWidth() - getPaddingRight()) - this.p, this.n + i2);
        this.f612l.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    /* access modifiers changed from: package-private */
    public int b(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02db, code lost:
        if (r15 > 0) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e6, code lost:
        if (r15 < 0) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02e8, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02e9, code lost:
        r13.measure(r9, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & -256);
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0324  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(int r34, int r35) {
        /*
        // Method dump skipped, instructions count: 911
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.b(int, int):void");
    }

    /* access modifiers changed from: package-private */
    public void b(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i4 - i2;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i9 = this.f606f;
        int i10 = i9 & 112;
        int i11 = i9 & 8388615;
        int paddingTop = i10 != 16 ? i10 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.f607g : getPaddingTop() + (((i5 - i3) - this.f607g) / 2);
        int i12 = 0;
        while (i12 < virtualChildCount) {
            View a2 = a(i12);
            if (a2 == null) {
                paddingTop += c(i12);
            } else if (a2.getVisibility() != 8) {
                int measuredWidth = a2.getMeasuredWidth();
                int measuredHeight = a2.getMeasuredHeight();
                a aVar = (a) a2.getLayoutParams();
                int i13 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i13 < 0) {
                    i13 = i11;
                }
                int a3 = g.a(i13, b0.r(this)) & 7;
                if (a3 == 1) {
                    i6 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i7 = i6 - ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else if (a3 != 5) {
                    i7 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                } else {
                    i6 = paddingRight - measuredWidth;
                    i7 = i6 - ((LinearLayout.LayoutParams) aVar).rightMargin;
                }
                if (b(i12)) {
                    paddingTop += this.n;
                }
                int i14 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                a(a2, i7, i14 + a(a2), measuredWidth, measuredHeight);
                i12 += a(a2, i12);
                paddingTop = i14 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + b(a2);
            }
            i12++;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View a2 = a(i2);
            if (!(a2 == null || a2.getVisibility() == 8 || !b(i2))) {
                a(canvas, (a2.getTop() - ((LinearLayout.LayoutParams) ((a) a2.getLayoutParams())).topMargin) - this.n);
            }
        }
        if (b(virtualChildCount)) {
            View a3 = a(virtualChildCount - 1);
            a(canvas, a3 == null ? (getHeight() - getPaddingBottom()) - this.n : a3.getBottom() + ((LinearLayout.LayoutParams) ((a) a3.getLayoutParams())).bottomMargin);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Canvas canvas, int i2) {
        this.f612l.setBounds(i2, getPaddingTop() + this.p, this.f613m + i2, (getHeight() - getPaddingBottom()) - this.p);
        this.f612l.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean b(int i2) {
        if (i2 == 0) {
            return (this.o & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.o & 4) != 0;
        }
        if ((this.o & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int c(int i2) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* access modifiers changed from: protected */
    public a generateDefaultLayoutParams() {
        int i2 = this.f605e;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getBaseline() {
        int i2;
        if (this.f603c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f603c;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.f604d;
                if (this.f605e == 1 && (i2 = this.f606f & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f607g) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f607g;
                    }
                }
                return i4 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
            } else if (this.f603c == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f603c;
    }

    public Drawable getDividerDrawable() {
        return this.f612l;
    }

    public int getDividerPadding() {
        return this.p;
    }

    public int getDividerWidth() {
        return this.f613m;
    }

    public int getGravity() {
        return this.f606f;
    }

    public int getOrientation() {
        return this.f605e;
    }

    public int getShowDividers() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f608h;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f612l != null) {
            if (this.f605e == 1) {
                b(canvas);
            } else {
                a(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.f605e == 1) {
            b(i2, i3, i4, i5);
        } else {
            a(i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f605e == 1) {
            b(i2, i3);
        } else {
            a(i2, i3);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f602b = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f603c = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f612l) {
            this.f612l = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f613m = drawable.getIntrinsicWidth();
                this.n = drawable.getIntrinsicHeight();
            } else {
                this.f613m = 0;
                this.n = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.p = i2;
    }

    public void setGravity(int i2) {
        if (this.f606f != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f606f = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f606f;
        if ((8388615 & i4) != i3) {
            this.f606f = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f609i = z;
    }

    public void setOrientation(int i2) {
        if (this.f605e != i2) {
            this.f605e = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.o) {
            requestLayout();
        }
        this.o = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f606f;
        if ((i4 & 112) != i3) {
            this.f606f = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f608h = Math.max(0.0f, f2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
