package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.g.a;
import c.h.l.b0;
import c.h.l.g;
import c.h.l.k0;
import java.util.List;

/* access modifiers changed from: package-private */
public abstract class b extends c<View> {

    /* renamed from: d  reason: collision with root package name */
    final Rect f6291d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    final Rect f6292e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private int f6293f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f6294g;

    public b() {
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int c(int i2) {
        if (i2 == 0) {
            return 8388659;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final int a(View view) {
        if (this.f6294g == 0) {
            return 0;
        }
        float b2 = b(view);
        int i2 = this.f6294g;
        return a.a((int) (b2 * ((float) i2)), 0, i2);
    }

    /* access modifiers changed from: package-private */
    public abstract View a(List<View> list);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        View a;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (a = a(coordinatorLayout.b(view))) == null) {
            return false;
        }
        if (b0.o(a) && !b0.o(view)) {
            b0.a(view, true);
            if (b0.o(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i4);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.a(view, i2, i3, View.MeasureSpec.makeMeasureSpec((size - a.getMeasuredHeight()) + c(a), i6 == -1 ? 1073741824 : Integer.MIN_VALUE), i5);
        return true;
    }

    /* access modifiers changed from: package-private */
    public abstract float b(View view);

    public final void b(int i2) {
        this.f6294g = i2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.c
    public void b(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3;
        View a = a(coordinatorLayout.b(view));
        if (a != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f6291d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, a.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            k0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && b0.o(coordinatorLayout) && !b0.o(view)) {
                rect.left += lastWindowInsets.h();
                rect.right -= lastWindowInsets.i();
            }
            Rect rect2 = this.f6292e;
            g.a(c(fVar.f971c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
            int a2 = a(a);
            view.layout(rect2.left, rect2.top - a2, rect2.right, rect2.bottom - a2);
            i3 = rect2.top - a.getBottom();
        } else {
            super.b(coordinatorLayout, view, i2);
            i3 = 0;
        }
        this.f6293f = i3;
    }

    public final int c() {
        return this.f6294g;
    }

    /* access modifiers changed from: package-private */
    public int c(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return this.f6293f;
    }
}
