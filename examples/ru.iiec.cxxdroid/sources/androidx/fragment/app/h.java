package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import c.h.l.b0;
import c.h.l.k0;
import c.m.c;
import java.util.ArrayList;

public final class h extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<View> f1299b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<View> f1300c;

    /* renamed from: d  reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f1301d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1302e = true;

    h(Context context, AttributeSet attributeSet, n nVar) {
        super(context, attributeSet);
        String str;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.FragmentContainerView);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(c.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(c.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment a = nVar.a(id);
        if (classAttribute != null && a == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a2 = nVar.s().a(context.getClassLoader(), classAttribute);
            a2.a(context, attributeSet, (Bundle) null);
            y b2 = nVar.b();
            b2.a(true);
            b2.a(this, a2, string);
            b2.d();
        }
        nVar.a(this);
    }

    private void a(View view) {
        ArrayList<View> arrayList = this.f1300c;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f1299b == null) {
                this.f1299b = new ArrayList<>();
            }
            this.f1299b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (n.a(view) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (n.a(view) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        k0 a = k0.a(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1301d;
        k0 a2 = onApplyWindowInsetsListener != null ? k0.a(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : b0.b(this, a);
        if (!a2.l()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                b0.a(getChildAt(i2), a2);
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f1302e && this.f1299b != null) {
            for (int i2 = 0; i2 < this.f1299b.size(); i2++) {
                super.drawChild(canvas, this.f1299b.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList<View> arrayList;
        if (!this.f1302e || (arrayList = this.f1299b) == null || arrayList.size() <= 0 || !this.f1299b.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f1300c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f1299b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1302e = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i2) {
        a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    public void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z) {
        this.f1302e = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1301d = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1300c == null) {
                this.f1300c = new ArrayList<>();
            }
            this.f1300c.add(view);
        }
        super.startViewTransition(view);
    }
}
