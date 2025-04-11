package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.b0;
import c.h.l.k0;
import c.h.l.o;
import c.h.l.u;
import com.google.android.material.internal.l;
import e.b.b.b.i;
import e.b.b.b.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@CoordinatorLayout.d(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private int f6247b;

    /* renamed from: c  reason: collision with root package name */
    private int f6248c;

    /* renamed from: d  reason: collision with root package name */
    private int f6249d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6250e;

    /* renamed from: f  reason: collision with root package name */
    private int f6251f;

    /* renamed from: g  reason: collision with root package name */
    private k0 f6252g;

    /* renamed from: h  reason: collision with root package name */
    private List<b> f6253h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6254i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6255j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6256k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6257l;

    /* renamed from: m  reason: collision with root package name */
    private int[] f6258m;

    /* access modifiers changed from: protected */
    public static class BaseBehavior<T extends AppBarLayout> extends a<T> {

        /* renamed from: k  reason: collision with root package name */
        private int f6259k;

        /* renamed from: l  reason: collision with root package name */
        private int f6260l;

        /* renamed from: m  reason: collision with root package name */
        private ValueAnimator f6261m;
        private int n = -1;
        private boolean o;
        private float p;
        private WeakReference<View> q;
        private b r;

        /* access modifiers changed from: package-private */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ CoordinatorLayout a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f6262b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.a = coordinatorLayout;
                this.f6262b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.c(this.a, this.f6262b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public static abstract class b<T extends AppBarLayout> {
            public abstract boolean a(T t);
        }

        /* access modifiers changed from: protected */
        public static class c extends c.j.a.a {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: d  reason: collision with root package name */
            int f6264d;

            /* renamed from: e  reason: collision with root package name */
            float f6265e;

            /* renamed from: f  reason: collision with root package name */
            boolean f6266f;

            static class a implements Parcelable.ClassLoaderCreator<c> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                public c createFromParcel(Parcel parcel) {
                    return new c(parcel, null);
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
                this.f6264d = parcel.readInt();
                this.f6265e = parcel.readFloat();
                this.f6266f = parcel.readByte() != 0;
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // c.j.a.a
            public void writeToParcel(Parcel parcel, int i2) {
                super.writeToParcel(parcel, i2);
                parcel.writeInt(this.f6264d);
                parcel.writeFloat(this.f6265e);
                parcel.writeByte(this.f6266f ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private View a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt instanceof o) {
                    return childAt;
                }
            }
            return null;
        }

        private static View a(AppBarLayout appBarLayout, int i2) {
            int abs = Math.abs(i2);
            int childCount = appBarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout.getChildAt(i3);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private void a(int i2, T t, View view, int i3) {
            if (i3 == 1) {
                int c2 = c();
                if ((i2 < 0 && c2 == 0) || (i2 > 0 && c2 == (-t.getDownNestedScrollRange()))) {
                    b0.j(view, 1);
                }
            }
        }

        private void a(CoordinatorLayout coordinatorLayout, T t, int i2, float f2) {
            int abs = Math.abs(c() - i2);
            float abs2 = Math.abs(f2);
            a(coordinatorLayout, (AppBarLayout) t, i2, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f));
        }

        private void a(CoordinatorLayout coordinatorLayout, T t, int i2, int i3) {
            int c2 = c();
            if (c2 == i2) {
                ValueAnimator valueAnimator = this.f6261m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f6261m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f6261m;
            if (valueAnimator2 == null) {
                this.f6261m = new ValueAnimator();
                this.f6261m.setInterpolator(e.b.b.b.k.a.f7820d);
                this.f6261m.addUpdateListener(new a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f6261m.setDuration((long) Math.min(i3, 600));
            this.f6261m.setIntValues(c2, i2);
            this.f6261m.start();
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(androidx.coordinatorlayout.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        private static boolean a(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.b() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        private int b(T t, int i2) {
            int childCount = t.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = t.getChildAt(i3);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if (a(cVar.a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i4 = -i2;
                if (top <= i4 && bottom >= i4) {
                    return i3;
                }
            }
            return -1;
        }

        private int c(T t, int i2) {
            int abs = Math.abs(i2);
            int childCount = t.getChildCount();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i4);
                c cVar = (c) childAt.getLayoutParams();
                Interpolator b2 = cVar.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i4++;
                } else if (b2 != null) {
                    int a2 = cVar.a();
                    if ((a2 & 1) != 0) {
                        i3 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                        if ((a2 & 2) != 0) {
                            i3 -= b0.s(childAt);
                        }
                    }
                    if (b0.o(childAt)) {
                        i3 -= t.getTopInset();
                    }
                    if (i3 > 0) {
                        float f2 = (float) i3;
                        return Integer.signum(i2) * (childAt.getTop() + Math.round(f2 * b2.getInterpolation(((float) (abs - childAt.getTop())) / f2)));
                    }
                }
            }
            return i2;
        }

        private boolean c(CoordinatorLayout coordinatorLayout, T t) {
            List<View> c2 = coordinatorLayout.c(t);
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                CoordinatorLayout.c d2 = ((CoordinatorLayout.f) c2.get(i2).getLayoutParams()).d();
                if (d2 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) d2).c() != 0;
                }
            }
            return false;
        }

        private void d(CoordinatorLayout coordinatorLayout, T t) {
            int c2 = c();
            int b2 = b(t, c2);
            if (b2 >= 0) {
                View childAt = t.getChildAt(b2);
                c cVar = (c) childAt.getLayoutParams();
                int a2 = cVar.a();
                if ((a2 & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int i3 = -childAt.getBottom();
                    if (b2 == t.getChildCount() - 1) {
                        i3 += t.getTopInset();
                    }
                    if (a(a2, 2)) {
                        i3 += b0.s(childAt);
                    } else if (a(a2, 5)) {
                        int s = b0.s(childAt) + i3;
                        if (c2 < s) {
                            i2 = s;
                        } else {
                            i3 = s;
                        }
                    }
                    if (a(a2, 32)) {
                        i2 += ((LinearLayout.LayoutParams) cVar).topMargin;
                        i3 -= ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    }
                    if (c2 < (i3 + i2) / 2) {
                        i2 = i3;
                    }
                    a(coordinatorLayout, (AppBarLayout) t, c.h.g.a.a(i2, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int b(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4) {
            int c2 = c();
            int i5 = 0;
            if (i3 == 0 || c2 < i3 || c2 > i4) {
                this.f6259k = 0;
            } else {
                int a2 = c.h.g.a.a(i2, i3, i4);
                if (c2 != a2) {
                    int c3 = t.a() ? c(t, a2) : a2;
                    boolean a3 = a(c3);
                    i5 = c2 - a2;
                    this.f6259k = a2 - c3;
                    if (!a3 && t.a()) {
                        coordinatorLayout.a(t);
                    }
                    t.a(b());
                    a(coordinatorLayout, (AppBarLayout) t, a2, a2 < c2 ? -1 : 1, false);
                }
            }
            return i5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void e(CoordinatorLayout coordinatorLayout, T t) {
            d(coordinatorLayout, (AppBarLayout) t);
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof c) {
                c cVar = (c) parcelable;
                super.a(coordinatorLayout, (View) t, cVar.a());
                this.n = cVar.f6264d;
                this.p = cVar.f6265e;
                this.o = cVar.f6266f;
                return;
            }
            super.a(coordinatorLayout, (View) t, parcelable);
            this.n = -1;
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i2) {
            if (this.f6260l == 0 || i2 == 1) {
                d(coordinatorLayout, (AppBarLayout) t);
            }
            this.q = new WeakReference<>(view);
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int i4, int i5, int i6) {
            if (i5 < 0) {
                a(coordinatorLayout, (View) t, i5, -t.getDownNestedScrollRange(), 0);
                a(i5, t, view, i6);
            }
            if (t.c()) {
                t.a(view.getScrollY() > 0);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int[] iArr, int i4) {
            int i5;
            int i6;
            if (i3 != 0) {
                if (i3 < 0) {
                    int i7 = -t.getTotalScrollRange();
                    i6 = i7;
                    i5 = t.getDownNestedPreScrollRange() + i7;
                } else {
                    i6 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                if (i6 != i5) {
                    iArr[1] = a(coordinatorLayout, (View) t, i3, i6, i5);
                    a(i3, t, view, i4);
                }
            }
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, int i2) {
            boolean a2 = super.a(coordinatorLayout, (View) t, i2);
            int pendingAction = t.getPendingAction();
            int i3 = this.n;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                c(coordinatorLayout, t, (-childAt.getBottom()) + (this.o ? b0.s(childAt) + t.getTopInset() : Math.round(((float) childAt.getHeight()) * this.p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        a(coordinatorLayout, (AppBarLayout) t, i4, 0.0f);
                    } else {
                        c(coordinatorLayout, t, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        a(coordinatorLayout, (AppBarLayout) t, 0, 0.0f);
                    } else {
                        c(coordinatorLayout, t, 0);
                    }
                }
            }
            t.d();
            this.n = -1;
            a(c.h.g.a.a(b(), -t.getTotalScrollRange(), 0));
            a(coordinatorLayout, (AppBarLayout) t, b(), 0, true);
            t.a(b());
            return a2;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4, int i5) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t.getLayoutParams())).height != -2) {
                return super.a(coordinatorLayout, (View) t, i2, i3, i4, i5);
            }
            coordinatorLayout.a(t, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
            return true;
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i2, int i3) {
            ValueAnimator valueAnimator;
            boolean z = (i2 & 2) != 0 && (t.c() || a(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f6261m) != null) {
                valueAnimator.cancel();
            }
            this.q = null;
            this.f6260l = i3;
            return z;
        }

        /* access modifiers changed from: package-private */
        public boolean a(T t) {
            b bVar = this.r;
            if (bVar != null) {
                return bVar.a(t);
            }
            WeakReference<View> weakReference = this.q;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        /* access modifiers changed from: package-private */
        public int b(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: b */
        public Parcelable d(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable d2 = super.d(coordinatorLayout, (View) t);
            int b2 = b();
            int childCount = t.getChildCount();
            boolean z = false;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int bottom = childAt.getBottom() + b2;
                if (childAt.getTop() + b2 <= 0 && bottom >= 0) {
                    c cVar = new c(d2);
                    cVar.f6264d = i2;
                    if (bottom == b0.s(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    cVar.f6266f = z;
                    cVar.f6265e = ((float) bottom) / ((float) childAt.getHeight());
                    return cVar;
                }
            }
            return d2;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        public int c() {
            return b() + this.f6259k;
        }

        /* access modifiers changed from: package-private */
        public int c(T t) {
            return t.getTotalScrollRange();
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ScrollingViewBehavior_Layout);
            b(obtainStyledAttributes.getDimensionPixelSize(j.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        private static int a(AppBarLayout appBarLayout) {
            CoordinatorLayout.c d2 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).d();
            if (d2 instanceof BaseBehavior) {
                return ((BaseBehavior) d2).c();
            }
            return 0;
        }

        private void a(View view, View view2) {
            CoordinatorLayout.c d2 = ((CoordinatorLayout.f) view2.getLayoutParams()).d();
            if (d2 instanceof BaseBehavior) {
                b0.e(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) d2).f6259k) + d()) - a(view2));
            }
        }

        private void b(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.c()) {
                    appBarLayout.a(view.getScrollY() > 0);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        public AppBarLayout a(List<View> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = list.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = a(coordinatorLayout.b(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f6291d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.a(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        public float b(View view) {
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a = a(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + a > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) a) / ((float) i2)) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            a(view, view2);
            b(view, view2);
            return false;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        public int c(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.c(view);
        }
    }

    class a implements u {
        a() {
        }

        @Override // c.h.l.u
        public k0 a(View view, k0 k0Var) {
            return AppBarLayout.this.a(k0Var);
        }
    }

    public interface b<T extends AppBarLayout> {
        void a(T t, int i2);
    }

    public static class c extends LinearLayout.LayoutParams {
        int a = 1;

        /* renamed from: b  reason: collision with root package name */
        Interpolator f6267b;

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.AppBarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(j.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(j.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f6267b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(j.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public int a() {
            return this.a;
        }

        public Interpolator b() {
            return this.f6267b;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            int i2 = this.a;
            return (i2 & 1) == 1 && (i2 & 10) != 0;
        }
    }

    public interface d extends b<AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6247b = -1;
        this.f6248c = -1;
        this.f6249d = -1;
        this.f6251f = 0;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            e.a(this);
            e.a(this, attributeSet, 0, i.Widget_Design_AppBarLayout);
        }
        TypedArray c2 = l.c(context, attributeSet, j.AppBarLayout, 0, i.Widget_Design_AppBarLayout, new int[0]);
        b0.a(this, c2.getDrawable(j.AppBarLayout_android_background));
        if (c2.hasValue(j.AppBarLayout_expanded)) {
            a(c2.getBoolean(j.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && c2.hasValue(j.AppBarLayout_elevation)) {
            e.a(this, (float) c2.getDimensionPixelSize(j.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (c2.hasValue(j.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(c2.getBoolean(j.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (c2.hasValue(j.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(c2.getBoolean(j.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.f6257l = c2.getBoolean(j.AppBarLayout_liftOnScroll, false);
        c2.recycle();
        b0.a(this, new a());
    }

    private void a(boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        int i3 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i2 = 8;
        }
        this.f6251f = i3 | i2;
        requestLayout();
    }

    private boolean b(boolean z) {
        if (this.f6255j == z) {
            return false;
        }
        this.f6255j = z;
        refreshDrawableState();
        return true;
    }

    private boolean e() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((c) getChildAt(i2).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void f() {
        this.f6247b = -1;
        this.f6248c = -1;
        this.f6249d = -1;
    }

    /* access modifiers changed from: package-private */
    public k0 a(k0 k0Var) {
        k0 k0Var2 = b0.o(this) ? k0Var : null;
        if (!c.h.k.c.a(this.f6252g, k0Var2)) {
            this.f6252g = k0Var2;
            f();
        }
        return k0Var;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        List<b> list = this.f6253h;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = this.f6253h.get(i3);
                if (bVar != null) {
                    bVar.a(this, i2);
                }
            }
        }
    }

    public void a(b bVar) {
        if (this.f6253h == null) {
            this.f6253h = new ArrayList();
        }
        if (bVar != null && !this.f6253h.contains(bVar)) {
            this.f6253h.add(bVar);
        }
    }

    public void a(d dVar) {
        a((b) dVar);
    }

    public void a(boolean z, boolean z2) {
        a(z, z2, true);
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f6250e;
    }

    /* access modifiers changed from: package-private */
    public boolean a(boolean z) {
        if (this.f6256k == z) {
            return false;
        }
        this.f6256k = z;
        refreshDrawableState();
        return true;
    }

    public void b(b bVar) {
        List<b> list = this.f6253h;
        if (list != null && bVar != null) {
            list.remove(bVar);
        }
    }

    public void b(d dVar) {
        b((b) dVar);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return getTotalScrollRange() != 0;
    }

    public boolean c() {
        return this.f6257l;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f6251f = 0;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.widget.LinearLayout
    public c generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.widget.LinearLayout, android.view.ViewGroup
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.widget.LinearLayout, android.view.ViewGroup
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams) : new c((LinearLayout.LayoutParams) layoutParams);
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i2 = this.f6248c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = cVar.a;
            if ((i4 & 5) == 5) {
                int i5 = i3 + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                i3 = (i4 & 8) != 0 ? i5 + b0.s(childAt) : i5 + (measuredHeight - ((i4 & 2) != 0 ? b0.s(childAt) : getTopInset()));
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f6248c = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i2 = this.f6249d;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
            int i5 = cVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i4 -= b0.s(childAt) + getTopInset();
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f6249d = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int s = b0.s(this);
        if (s == 0) {
            int childCount = getChildCount();
            s = childCount >= 1 ? b0.s(getChildAt(childCount - 1)) : 0;
            if (s == 0) {
                return getHeight() / 3;
            }
        }
        return (s * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f6251f;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        k0 k0Var = this.f6252g;
        if (k0Var != null) {
            return k0Var.j();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f6247b;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = cVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
            if ((i5 & 2) != 0) {
                i4 -= b0.s(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4 - getTopInset());
        this.f6247b = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        if (this.f6258m == null) {
            this.f6258m = new int[4];
        }
        int[] iArr = this.f6258m;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        iArr[0] = this.f6255j ? e.b.b.b.b.state_liftable : -e.b.b.b.b.state_liftable;
        iArr[1] = (!this.f6255j || !this.f6256k) ? -e.b.b.b.b.state_lifted : e.b.b.b.b.state_lifted;
        iArr[2] = this.f6255j ? e.b.b.b.b.state_collapsible : -e.b.b.b.b.state_collapsible;
        iArr[3] = (!this.f6255j || !this.f6256k) ? -e.b.b.b.b.state_collapsed : e.b.b.b.b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        f();
        boolean z2 = false;
        this.f6250e = false;
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            } else if (((c) getChildAt(i6).getLayoutParams()).b() != null) {
                this.f6250e = true;
                break;
            } else {
                i6++;
            }
        }
        if (!this.f6254i) {
            if (this.f6257l || e()) {
                z2 = true;
            }
            b(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        f();
    }

    public void setExpanded(boolean z) {
        a(z, b0.I(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f6257l = z;
    }

    public void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(i2);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            e.a(this, f2);
        }
    }
}
