package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.b0;
import c.j.b.b;
import e.b.b.b.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private boolean a = true;

    /* renamed from: b  reason: collision with root package name */
    private float f6324b;

    /* renamed from: c  reason: collision with root package name */
    private int f6325c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6326d;

    /* renamed from: e  reason: collision with root package name */
    private int f6327e;

    /* renamed from: f  reason: collision with root package name */
    private int f6328f;

    /* renamed from: g  reason: collision with root package name */
    int f6329g;

    /* renamed from: h  reason: collision with root package name */
    int f6330h;

    /* renamed from: i  reason: collision with root package name */
    int f6331i;

    /* renamed from: j  reason: collision with root package name */
    boolean f6332j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6333k;

    /* renamed from: l  reason: collision with root package name */
    int f6334l = 4;

    /* renamed from: m  reason: collision with root package name */
    c.j.b.b f6335m;
    private boolean n;
    private int o;
    private boolean p;
    int q;
    WeakReference<V> r;
    WeakReference<View> s;
    private b t;
    private VelocityTracker u;
    int v;
    private int w;
    boolean x;
    private Map<View, Integer> y;
    private final b.c z = new a();

    class a extends b.c {
        a() {
        }

        @Override // c.j.b.b.c
        public int a(View view, int i2, int i3) {
            return view.getLeft();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
            if (r9 < java.lang.Math.abs(r9 - r10.f6331i)) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b4, code lost:
            if (java.lang.Math.abs(r9 - r1) < java.lang.Math.abs(r9 - r7.a.f6331i)) goto L_0x00b6;
         */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00cb  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00dc  */
        @Override // c.j.b.b.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(android.view.View r8, float r9, float r10) {
            /*
            // Method dump skipped, instructions count: 226
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a.a(android.view.View, float, float):void");
        }

        @Override // c.j.b.b.c
        public void a(View view, int i2, int i3, int i4, int i5) {
            BottomSheetBehavior.this.a(i3);
        }

        @Override // c.j.b.b.c
        public int b(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f6332j ? bottomSheetBehavior.q : bottomSheetBehavior.f6331i;
        }

        @Override // c.j.b.b.c
        public int b(View view, int i2, int i3) {
            int c2 = BottomSheetBehavior.this.c();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return c.h.g.a.a(i2, c2, bottomSheetBehavior.f6332j ? bottomSheetBehavior.q : bottomSheetBehavior.f6331i);
        }

        @Override // c.j.b.b.c
        public boolean b(View view, int i2) {
            WeakReference<V> weakReference;
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = bottomSheetBehavior.f6334l;
            if (i3 != 1 && !bottomSheetBehavior.x) {
                return (i3 != 3 || bottomSheetBehavior.v != i2 || (view2 = bottomSheetBehavior.s.get()) == null || !view2.canScrollVertically(-1)) && (weakReference = BottomSheetBehavior.this.r) != null && weakReference.get() == view;
            }
            return false;
        }

        @Override // c.j.b.b.c
        public void c(int i2) {
            if (i2 == 1) {
                BottomSheetBehavior.this.c(1);
            }
        }
    }

    public static abstract class b {
        public abstract void a(View view, float f2);

        public abstract void a(View view, int i2);
    }

    /* access modifiers changed from: protected */
    public static class c extends c.j.a.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        final int f6336d;

        static class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public c[] newArray(int i2) {
                return new c[i2];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6336d = parcel.readInt();
        }

        public c(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f6336d = i2;
        }

        @Override // c.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f6336d);
        }
    }

    private class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final View f6337b;

        /* renamed from: c  reason: collision with root package name */
        private final int f6338c;

        d(View view, int i2) {
            this.f6337b = view;
            this.f6338c = i2;
        }

        public void run() {
            c.j.b.b bVar = BottomSheetBehavior.this.f6335m;
            if (bVar == null || !bVar.a(true)) {
                BottomSheetBehavior.this.c(this.f6338c);
            } else {
                b0.a(this.f6337b, this);
            }
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelSize;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(j.BottomSheetBehavior_Layout_behavior_peekHeight);
        b((peekValue == null || (dimensionPixelSize = peekValue.data) != -1) ? obtainStyledAttributes.getDimensionPixelSize(j.BottomSheetBehavior_Layout_behavior_peekHeight, -1) : dimensionPixelSize);
        b(obtainStyledAttributes.getBoolean(j.BottomSheetBehavior_Layout_behavior_hideable, false));
        a(obtainStyledAttributes.getBoolean(j.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        c(obtainStyledAttributes.getBoolean(j.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.f6324b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void b() {
        this.f6331i = this.a ? Math.max(this.q - this.f6328f, this.f6329g) : this.q - this.f6328f;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int c() {
        if (this.a) {
            return this.f6329g;
        }
        return 0;
    }

    private float d() {
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f6324b);
        return this.u.getYVelocity(this.v);
    }

    private void d(boolean z2) {
        int i2;
        WeakReference<V> weakReference = this.r;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z2) {
                    if (this.y == null) {
                        this.y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    if (childAt != this.r.get()) {
                        if (!z2) {
                            Map<View, Integer> map = this.y;
                            if (map != null && map.containsKey(childAt)) {
                                i2 = this.y.get(childAt).intValue();
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            i2 = 4;
                        }
                        b0.h(childAt, i2);
                    }
                }
                if (!z2) {
                    this.y = null;
                }
            }
        }
    }

    private void e() {
        this.v = -1;
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.u = null;
        }
    }

    /* access modifiers changed from: package-private */
    public View a(View view) {
        if (b0.J(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View a2 = a(viewGroup.getChildAt(i2));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        b bVar;
        float f2;
        float f3;
        V v2 = this.r.get();
        if (v2 != null && (bVar = this.t) != null) {
            int i3 = this.f6331i;
            if (i2 > i3) {
                f2 = (float) (i3 - i2);
                f3 = (float) (this.q - i3);
            } else {
                f2 = (float) (i3 - i2);
                f3 = (float) (i3 - c());
            }
            bVar.a(v2, f2 / f3);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        c cVar = (c) parcelable;
        super.a(coordinatorLayout, v2, cVar.a());
        int i2 = cVar.f6336d;
        if (i2 == 1 || i2 == 2) {
            i2 = 4;
        }
        this.f6334l = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.f6331i)) goto L_0x007a;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        int i5;
        if (i4 != 1 && view == this.s.get()) {
            int top = v2.getTop();
            int i6 = top - i3;
            if (i3 <= 0) {
                if (i3 < 0 && !view.canScrollVertically(-1)) {
                    int i7 = this.f6331i;
                    if (i6 <= i7 || this.f6332j) {
                        iArr[1] = i3;
                        b0.e(v2, -i3);
                        c(1);
                    } else {
                        iArr[1] = top - i7;
                        b0.e(v2, -iArr[1]);
                        i5 = 4;
                    }
                }
                a(v2.getTop());
                this.o = i3;
                this.p = true;
            } else if (i6 < c()) {
                iArr[1] = top - c();
                b0.e(v2, -iArr[1]);
                i5 = 3;
            } else {
                iArr[1] = i3;
                b0.e(v2, -i3);
                c(1);
                a(v2.getTop());
                this.o = i3;
                this.p = true;
            }
            c(i5);
            a(v2.getTop());
            this.o = i3;
            this.p = true;
        }
    }

    public void a(boolean z2) {
        if (this.a != z2) {
            this.a = z2;
            if (this.r != null) {
                b();
            }
            c((!this.a || this.f6334l != 6) ? this.f6334l : 3);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(View view, float f2) {
        if (this.f6333k) {
            return true;
        }
        return view.getTop() >= this.f6331i && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.f6331i)) / ((float) this.f6325c) > 0.5f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, int r7) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        c.j.b.b bVar;
        if (!v2.isShown()) {
            this.n = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            e();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.w = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.s;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && coordinatorLayout.a(view2, x2, this.w)) {
                this.v = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.x = true;
            }
            this.n = this.v == -1 && !coordinatorLayout.a(v2, x2, this.w);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.x = false;
            this.v = -1;
            if (this.n) {
                this.n = false;
                return false;
            }
        }
        if (!this.n && (bVar = this.f6335m) != null && bVar.b(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.s;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.n && this.f6334l != 1 && !coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f6335m != null && Math.abs(((float) this.w) - motionEvent.getY()) > ((float) this.f6335m.e());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        return view == this.s.get() && (this.f6334l != 3 || super.a(coordinatorLayout, v2, view, f2, f3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f6326d
            if (r4 != 0) goto L_0x0015
            r3.f6326d = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f6326d
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f6325c
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f6326d = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f6325c = r1
            int r1 = r3.q
            int r1 = r1 - r4
            r3.f6331i = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.f6334l
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.r
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b(int):void");
    }

    public void b(boolean z2) {
        this.f6332j = z2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6334l == 1 && actionMasked == 0) {
            return true;
        }
        c.j.b.b bVar = this.f6335m;
        if (bVar != null) {
            bVar.a(motionEvent);
        }
        if (actionMasked == 0) {
            e();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (actionMasked == 2 && !this.n && Math.abs(((float) this.w) - motionEvent.getY()) > ((float) this.f6335m.e())) {
            this.f6335m.a(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.o = 0;
        this.p = false;
        return (i2 & 2) != 0;
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        V v2;
        b bVar;
        boolean z2;
        if (this.f6334l != i2) {
            this.f6334l = i2;
            if (i2 == 6 || i2 == 3) {
                z2 = true;
            } else {
                if (i2 == 5 || i2 == 4) {
                    z2 = false;
                }
                v2 = this.r.get();
                if (v2 != null && (bVar = this.t) != null) {
                    bVar.a((View) v2, i2);
                    return;
                }
            }
            d(z2);
            v2 = this.r.get();
            if (v2 != null) {
            }
        }
    }

    public void c(boolean z2) {
        this.f6333k = z2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable d(CoordinatorLayout coordinatorLayout, V v2) {
        return new c(super.d(coordinatorLayout, v2), this.f6334l);
    }
}
