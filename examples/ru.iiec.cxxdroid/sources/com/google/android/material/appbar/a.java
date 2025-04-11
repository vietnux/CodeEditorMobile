package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.b0;

/* access modifiers changed from: package-private */
public abstract class a<V extends View> extends c<V> {

    /* renamed from: d  reason: collision with root package name */
    private Runnable f6281d;

    /* renamed from: e  reason: collision with root package name */
    OverScroller f6282e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6283f;

    /* renamed from: g  reason: collision with root package name */
    private int f6284g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f6285h;

    /* renamed from: i  reason: collision with root package name */
    private int f6286i = -1;

    /* renamed from: j  reason: collision with root package name */
    private VelocityTracker f6287j;

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.appbar.a$a  reason: collision with other inner class name */
    public class RunnableC0087a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final CoordinatorLayout f6288b;

        /* renamed from: c  reason: collision with root package name */
        private final V f6289c;

        RunnableC0087a(CoordinatorLayout coordinatorLayout, V v) {
            this.f6288b = coordinatorLayout;
            this.f6289c = v;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.google.android.material.appbar.a */
        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.google.android.material.appbar.a */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            OverScroller overScroller;
            if (this.f6289c != null && (overScroller = a.this.f6282e) != null) {
                if (overScroller.computeScrollOffset()) {
                    a aVar = a.this;
                    aVar.c(this.f6288b, this.f6289c, aVar.f6282e.getCurrY());
                    b0.a(this.f6289c, this);
                    return;
                }
                a.this.e(this.f6288b, this.f6289c);
            }
        }
    }

    public a() {
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void d() {
        if (this.f6287j == null) {
            this.f6287j = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return b(coordinatorLayout, v, c() - i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean a(V v);

    /* access modifiers changed from: package-private */
    public final boolean a(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, float f2) {
        Runnable runnable = this.f6281d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f6281d = null;
        }
        if (this.f6282e == null) {
            this.f6282e = new OverScroller(v.getContext());
        }
        this.f6282e.fling(0, b(), 0, Math.round(f2), 0, 0, i2, i3);
        if (this.f6282e.computeScrollOffset()) {
            this.f6281d = new RunnableC0087a(coordinatorLayout, v);
            b0.a(v, this.f6281d);
            return true;
        }
        e(coordinatorLayout, v);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x0083;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int b(V v);

    /* access modifiers changed from: package-private */
    public abstract int b(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00ae;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int c();

    /* access modifiers changed from: package-private */
    public abstract int c(V v);

    /* access modifiers changed from: package-private */
    public int c(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return b(coordinatorLayout, v, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public abstract void e(CoordinatorLayout coordinatorLayout, V v);
}
