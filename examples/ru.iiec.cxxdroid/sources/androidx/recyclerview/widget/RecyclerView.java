package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.n;
import c.h.l.l0.d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements c.h.l.z, c.h.l.m, c.h.l.n {
    private static final int[] D0 = {16843830};
    static final boolean E0;
    static final boolean F0 = (Build.VERSION.SDK_INT >= 23);
    static final boolean G0 = (Build.VERSION.SDK_INT >= 16);
    static final boolean H0 = (Build.VERSION.SDK_INT >= 21);
    private static final boolean I0 = (Build.VERSION.SDK_INT <= 15);
    private static final boolean J0 = (Build.VERSION.SDK_INT <= 15);
    private static final Class<?>[] K0;
    static final Interpolator L0 = new c();
    private boolean A;
    private int A0;
    private int B;
    private int B0;
    boolean C;
    private final n.b C0;
    private final AccessibilityManager D;
    private List<r> E;
    boolean F;
    boolean G;
    private int H;
    private int I;
    private l J;
    private EdgeEffect K;
    private EdgeEffect L;
    private EdgeEffect M;
    private EdgeEffect N;
    m O;
    private int P;
    private int Q;
    private VelocityTracker R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private s a0;

    /* renamed from: b  reason: collision with root package name */
    private final y f1510b;
    private final int b0;

    /* renamed from: c  reason: collision with root package name */
    final w f1511c;
    private final int c0;

    /* renamed from: d  reason: collision with root package name */
    z f1512d;
    private float d0;

    /* renamed from: e  reason: collision with root package name */
    a f1513e;
    private float e0;

    /* renamed from: f  reason: collision with root package name */
    b f1514f;
    private boolean f0;

    /* renamed from: g  reason: collision with root package name */
    final n f1515g;
    final d0 g0;

    /* renamed from: h  reason: collision with root package name */
    boolean f1516h;
    e h0;

    /* renamed from: i  reason: collision with root package name */
    final Runnable f1517i;
    e.b i0;

    /* renamed from: j  reason: collision with root package name */
    final Rect f1518j;
    final b0 j0;

    /* renamed from: k  reason: collision with root package name */
    private final Rect f1519k;
    private u k0;

    /* renamed from: l  reason: collision with root package name */
    final RectF f1520l;
    private List<u> l0;

    /* renamed from: m  reason: collision with root package name */
    h f1521m;
    boolean m0;
    p n;
    boolean n0;
    x o;
    private m.b o0;
    final List<x> p;
    boolean p0;
    final ArrayList<o> q;
    j q0;
    private final ArrayList<t> r;
    private k r0;
    private t s;
    private final int[] s0;
    boolean t;
    private c.h.l.p t0;
    boolean u;
    private final int[] u0;
    boolean v;
    private final int[] v0;
    boolean w;
    final int[] w0;
    private int x;
    final List<e0> x0;
    boolean y;
    private Runnable y0;
    boolean z;
    private boolean z0;

    class a implements Runnable {
        a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.w && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.t) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.z) {
                    recyclerView2.y = true;
                } else {
                    recyclerView2.b();
                }
            }
        }
    }

    public static abstract class a0 {

        public interface a {
        }

        public abstract int a();

        public abstract void a(int i2);

        /* access modifiers changed from: package-private */
        public abstract void a(int i2, int i3);

        /* access modifiers changed from: protected */
        public abstract void a(View view);

        public abstract boolean b();

        public abstract boolean c();

        /* access modifiers changed from: protected */
        public final void d() {
            throw null;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            m mVar = RecyclerView.this.O;
            if (mVar != null) {
                mVar.i();
            }
            RecyclerView.this.p0 = false;
        }
    }

    public static class b0 {
        int a = -1;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<Object> f1524b;

        /* renamed from: c  reason: collision with root package name */
        int f1525c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f1526d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f1527e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f1528f = 0;

        /* renamed from: g  reason: collision with root package name */
        boolean f1529g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f1530h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f1531i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f1532j = false;

        /* renamed from: k  reason: collision with root package name */
        boolean f1533k = false;

        /* renamed from: l  reason: collision with root package name */
        boolean f1534l = false;

        /* renamed from: m  reason: collision with root package name */
        int f1535m;
        long n;
        int o;
        int p;
        int q;

        public int a() {
            return this.f1530h ? this.f1525c - this.f1526d : this.f1528f;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            if ((this.f1527e & i2) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f1527e));
            }
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar) {
            this.f1527e = 1;
            this.f1528f = hVar.b();
            this.f1530h = false;
            this.f1531i = false;
            this.f1532j = false;
        }

        public int b() {
            return this.a;
        }

        public boolean c() {
            return this.a != -1;
        }

        public boolean d() {
            return this.f1530h;
        }

        public boolean e() {
            return this.f1534l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.f1524b + ", mItemCount=" + this.f1528f + ", mIsMeasuring=" + this.f1532j + ", mPreviousLayoutItemCount=" + this.f1525c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1526d + ", mStructureChanged=" + this.f1529g + ", mInPreLayout=" + this.f1530h + ", mRunSimpleAnimations=" + this.f1533k + ", mRunPredictiveAnimations=" + this.f1534l + '}';
        }
    }

    class c implements Interpolator {
        c() {
        }

        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    public static abstract class c0 {
        public abstract View a(w wVar, int i2, int i3);
    }

    class d implements n.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.n.b
        public void a(e0 e0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.n.a(e0Var.a, recyclerView.f1511c);
        }

        @Override // androidx.recyclerview.widget.n.b
        public void a(e0 e0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.a(e0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.n.b
        public void b(e0 e0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.f1511c.c(e0Var);
            RecyclerView.this.b(e0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.n.b
        public void c(e0 e0Var, m.c cVar, m.c cVar2) {
            e0Var.a(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.F;
            m mVar = recyclerView.O;
            if (z) {
                if (!mVar.a(e0Var, e0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!mVar.c(e0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.s();
        }
    }

    /* access modifiers changed from: package-private */
    public class d0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private int f1536b;

        /* renamed from: c  reason: collision with root package name */
        private int f1537c;

        /* renamed from: d  reason: collision with root package name */
        OverScroller f1538d;

        /* renamed from: e  reason: collision with root package name */
        Interpolator f1539e = RecyclerView.L0;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1540f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1541g = false;

        d0() {
            this.f1538d = new OverScroller(RecyclerView.this.getContext(), RecyclerView.L0);
        }

        private int b(int i2, int i3) {
            int abs = Math.abs(i2);
            int abs2 = Math.abs(i3);
            boolean z = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            c.h.l.b0.a(RecyclerView.this, this);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (this.f1540f) {
                this.f1541g = true;
            } else {
                c();
            }
        }

        public void a(int i2, int i3) {
            RecyclerView.this.setScrollState(2);
            this.f1537c = 0;
            this.f1536b = 0;
            Interpolator interpolator = this.f1539e;
            Interpolator interpolator2 = RecyclerView.L0;
            if (interpolator != interpolator2) {
                this.f1539e = interpolator2;
                this.f1538d = new OverScroller(RecyclerView.this.getContext(), RecyclerView.L0);
            }
            this.f1538d.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            a();
        }

        public void a(int i2, int i3, int i4, Interpolator interpolator) {
            if (i4 == Integer.MIN_VALUE) {
                i4 = b(i2, i3);
            }
            if (interpolator == null) {
                interpolator = RecyclerView.L0;
            }
            if (this.f1539e != interpolator) {
                this.f1539e = interpolator;
                this.f1538d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f1537c = 0;
            this.f1536b = 0;
            RecyclerView.this.setScrollState(2);
            this.f1538d.startScroll(0, 0, i2, i3, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f1538d.computeScrollOffset();
            }
            a();
        }

        public void b() {
            RecyclerView.this.removeCallbacks(this);
            this.f1538d.abortAnimation();
        }

        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.n == null) {
                b();
                return;
            }
            this.f1541g = false;
            this.f1540f = true;
            recyclerView.b();
            OverScroller overScroller = this.f1538d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f1536b;
                int i5 = currY - this.f1537c;
                this.f1536b = currX;
                this.f1537c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.w0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.a(i4, i5, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.w0;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.b(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f1521m != null) {
                    int[] iArr3 = recyclerView3.w0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.a(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.w0;
                    i2 = iArr4[0];
                    i3 = iArr4[1];
                    i4 -= i2;
                    i5 -= i3;
                    a0 a0Var = recyclerView4.n.f1572g;
                    if (a0Var != null && !a0Var.b() && a0Var.c()) {
                        int a = RecyclerView.this.j0.a();
                        if (a == 0) {
                            a0Var.d();
                        } else {
                            if (a0Var.a() >= a) {
                                a0Var.a(a - 1);
                            }
                            a0Var.a(i2, i3);
                        }
                    }
                } else {
                    i3 = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.q.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.w0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.a(i2, i3, i4, i5, null, 1, iArr5);
                int[] iArr6 = RecyclerView.this.w0;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (!(i2 == 0 && i3 == 0)) {
                    RecyclerView.this.d(i2, i3);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                a0 a0Var2 = RecyclerView.this.n.f1572g;
                if ((a0Var2 != null && a0Var2.b()) || !z) {
                    a();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    e eVar = recyclerView6.h0;
                    if (eVar != null) {
                        eVar.a(recyclerView6, i2, i3);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i8, currVelocity);
                    }
                    if (RecyclerView.H0) {
                        RecyclerView.this.i0.a();
                    }
                }
            }
            a0 a0Var3 = RecyclerView.this.n.f1572g;
            if (a0Var3 != null && a0Var3.b()) {
                a0Var3.a(0, 0);
            }
            this.f1540f = false;
            if (this.f1541g) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.a(1);
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements b.AbstractC0024b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0024b
        public int a() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0024b
        public View a(int i2) {
            return RecyclerView.this.getChildAt(i2);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0024b
        public void a(View view) {
            e0 m2 = RecyclerView.m(view);
            if (m2 != null) {
                m2.a(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0024b
        public void a(View view, int i2) {
            RecyclerView.this.addView(view, i2);
            RecyclerView.this.a(view);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0024b
        public void a(View view, int i2, ViewGroup.LayoutParams layoutParams) {
            e0 m2 = RecyclerView.m(view);
            if (m2 != null) {
                if (m2.u() || m2.A()) {
                    m2.d();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + m2 + RecyclerView.this.i());
                }
            }
            RecyclerView.this.attachViewToParent(view, i2, layoutParams);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0024b
        public e0 b(View view) {
            return RecyclerView.m(view);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0024b
        public void b() {
            int a2 = a();
            for (int i2 = 0; i2 < a2; i2++) {
                View a3 = a(i2);
                RecyclerView.this.b(a3);
                a3.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0024b
        public void b(int i2) {
            e0 m2;
            View a2 = a(i2);
            if (!(a2 == null || (m2 = RecyclerView.m(a2)) == null)) {
                if (!m2.u() || m2.A()) {
                    m2.a(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + m2 + RecyclerView.this.i());
                }
            }
            RecyclerView.this.detachViewFromParent((RecyclerView) i2);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0024b
        public void c(int i2) {
            View childAt = RecyclerView.this.getChildAt(i2);
            if (childAt != null) {
                RecyclerView.this.b(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i2);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0024b
        public void c(View view) {
            e0 m2 = RecyclerView.m(view);
            if (m2 != null) {
                m2.b(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0024b
        public int d(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    public static abstract class e0 {
        private static final List<Object> t = Collections.emptyList();
        public final View a;

        /* renamed from: b  reason: collision with root package name */
        WeakReference<RecyclerView> f1543b;

        /* renamed from: c  reason: collision with root package name */
        int f1544c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f1545d = -1;

        /* renamed from: e  reason: collision with root package name */
        long f1546e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f1547f = -1;

        /* renamed from: g  reason: collision with root package name */
        int f1548g = -1;

        /* renamed from: h  reason: collision with root package name */
        e0 f1549h = null;

        /* renamed from: i  reason: collision with root package name */
        e0 f1550i = null;

        /* renamed from: j  reason: collision with root package name */
        int f1551j;

        /* renamed from: k  reason: collision with root package name */
        List<Object> f1552k = null;

        /* renamed from: l  reason: collision with root package name */
        List<Object> f1553l = null;

        /* renamed from: m  reason: collision with root package name */
        private int f1554m = 0;
        w n = null;
        boolean o = false;
        private int p = 0;
        int q = -1;
        RecyclerView r;
        h<? extends e0> s;

        public e0(View view) {
            if (view != null) {
                this.a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void D() {
            if (this.f1552k == null) {
                this.f1552k = new ArrayList();
                this.f1553l = Collections.unmodifiableList(this.f1552k);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean A() {
            return (this.f1551j & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        public void B() {
            this.n.c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean C() {
            return (this.f1551j & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1545d = -1;
            this.f1548g = -1;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            this.f1551j = i2 | this.f1551j;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3) {
            this.f1551j = (i2 & i3) | (this.f1551j & (~i3));
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3, boolean z) {
            a(8);
            a(i3, z);
            this.f1544c = i2;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, boolean z) {
            if (this.f1545d == -1) {
                this.f1545d = this.f1544c;
            }
            if (this.f1548g == -1) {
                this.f1548g = this.f1544c;
            }
            if (z) {
                this.f1548g += i2;
            }
            this.f1544c += i2;
            if (this.a.getLayoutParams() != null) {
                ((q) this.a.getLayoutParams()).f1583c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void a(w wVar, boolean z) {
            this.n = wVar;
            this.o = z;
        }

        /* access modifiers changed from: package-private */
        public void a(RecyclerView recyclerView) {
            int i2 = this.q;
            if (i2 == -1) {
                i2 = c.h.l.b0.p(this.a);
            }
            this.p = i2;
            recyclerView.a(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void a(Object obj) {
            if (obj == null) {
                a(1024);
            } else if ((1024 & this.f1551j) == 0) {
                D();
                this.f1552k.add(obj);
            }
        }

        public final void a(boolean z) {
            int i2;
            int i3 = this.f1554m;
            this.f1554m = z ? i3 - 1 : i3 + 1;
            int i4 = this.f1554m;
            if (i4 < 0) {
                this.f1554m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i4 == 1) {
                i2 = this.f1551j | 16;
            } else if (z && this.f1554m == 0) {
                i2 = this.f1551j & -17;
            } else {
                return;
            }
            this.f1551j = i2;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            List<Object> list = this.f1552k;
            if (list != null) {
                list.clear();
            }
            this.f1551j &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void b(RecyclerView recyclerView) {
            recyclerView.a(this, this.p);
            this.p = 0;
        }

        /* access modifiers changed from: package-private */
        public boolean b(int i2) {
            return (i2 & this.f1551j) != 0;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f1551j &= -33;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f1551j &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return (this.f1551j & 16) == 0 && c.h.l.b0.F(this.a);
        }

        public final int f() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.b(this);
        }

        @Deprecated
        public final int g() {
            return h();
        }

        public final int h() {
            RecyclerView recyclerView;
            h adapter;
            int b2;
            if (this.s == null || (recyclerView = this.r) == null || (adapter = recyclerView.getAdapter()) == null || (b2 = this.r.b(this)) == -1) {
                return -1;
            }
            return adapter.a(this.s, this, b2);
        }

        public final long i() {
            return this.f1546e;
        }

        public final int j() {
            return this.f1547f;
        }

        public final int k() {
            int i2 = this.f1548g;
            return i2 == -1 ? this.f1544c : i2;
        }

        public final int l() {
            return this.f1545d;
        }

        /* access modifiers changed from: package-private */
        public List<Object> m() {
            if ((this.f1551j & 1024) != 0) {
                return t;
            }
            List<Object> list = this.f1552k;
            return (list == null || list.size() == 0) ? t : this.f1553l;
        }

        /* access modifiers changed from: package-private */
        public boolean n() {
            return (this.f1551j & 512) != 0 || q();
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return (this.a.getParent() == null || this.a.getParent() == this.r) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean p() {
            return (this.f1551j & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean q() {
            return (this.f1551j & 4) != 0;
        }

        public final boolean r() {
            return (this.f1551j & 16) == 0 && !c.h.l.b0.F(this.a);
        }

        /* access modifiers changed from: package-private */
        public boolean s() {
            return (this.f1551j & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean t() {
            return this.n != null;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f1544c + " id=" + this.f1546e + ", oldPos=" + this.f1545d + ", pLpos:" + this.f1548g);
            if (t()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (q()) {
                sb.append(" invalid");
            }
            if (!p()) {
                sb.append(" unbound");
            }
            if (w()) {
                sb.append(" update");
            }
            if (s()) {
                sb.append(" removed");
            }
            if (A()) {
                sb.append(" ignored");
            }
            if (u()) {
                sb.append(" tmpDetached");
            }
            if (!r()) {
                sb.append(" not recyclable(" + this.f1554m + ")");
            }
            if (n()) {
                sb.append(" undefined adapter position");
            }
            if (this.a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public boolean u() {
            return (this.f1551j & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean v() {
            return (this.f1551j & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean w() {
            return (this.f1551j & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public void x() {
            this.f1551j = 0;
            this.f1544c = -1;
            this.f1545d = -1;
            this.f1546e = -1;
            this.f1548g = -1;
            this.f1554m = 0;
            this.f1549h = null;
            this.f1550i = null;
            b();
            this.p = 0;
            this.q = -1;
            RecyclerView.e(this);
        }

        /* access modifiers changed from: package-private */
        public void y() {
            if (this.f1545d == -1) {
                this.f1545d = this.f1544c;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean z() {
            return (this.f1551j & 16) != 0;
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements a.AbstractC0023a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0023a
        public e0 a(int i2) {
            e0 a2 = RecyclerView.this.a(i2, true);
            if (a2 != null && !RecyclerView.this.f1514f.c(a2.a)) {
                return a2;
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0023a
        public void a(int i2, int i3) {
            RecyclerView.this.g(i2, i3);
            RecyclerView.this.m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0023a
        public void a(int i2, int i3, Object obj) {
            RecyclerView.this.a(i2, i3, obj);
            RecyclerView.this.n0 = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0023a
        public void a(a.b bVar) {
            c(bVar);
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0023a
        public void b(int i2, int i3) {
            RecyclerView.this.a(i2, i3, false);
            RecyclerView.this.m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0023a
        public void b(a.b bVar) {
            c(bVar);
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0023a
        public void c(int i2, int i3) {
            RecyclerView.this.f(i2, i3);
            RecyclerView.this.m0 = true;
        }

        /* access modifiers changed from: package-private */
        public void c(a.b bVar) {
            int i2 = bVar.a;
            if (i2 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.n.a(recyclerView, bVar.f1634b, bVar.f1636d);
            } else if (i2 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.n.b(recyclerView2, bVar.f1634b, bVar.f1636d);
            } else if (i2 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.n.a(recyclerView3, bVar.f1634b, bVar.f1636d, bVar.f1635c);
            } else if (i2 == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.n.a(recyclerView4, bVar.f1634b, bVar.f1636d, 1);
            }
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0023a
        public void d(int i2, int i3) {
            RecyclerView.this.a(i2, i3, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m0 = true;
            recyclerView.j0.f1526d += i3;
        }
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class g {
        static final /* synthetic */ int[] a = new int[h.a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$h$a[] r0 = androidx.recyclerview.widget.RecyclerView.h.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.recyclerview.widget.RecyclerView.g.a = r0
                int[] r0 = androidx.recyclerview.widget.RecyclerView.g.a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.h.a.PREVENT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = androidx.recyclerview.widget.RecyclerView.g.a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.h.a.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.g.<clinit>():void");
        }
    }

    public static abstract class h<VH extends e0> {
        private final i a = new i();

        /* renamed from: b  reason: collision with root package name */
        private boolean f1555b = false;

        /* renamed from: c  reason: collision with root package name */
        private a f1556c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public int a(h<? extends e0> hVar, e0 e0Var, int i2) {
            if (hVar == this) {
                return i2;
            }
            return -1;
        }

        public long a(int i2) {
            return -1;
        }

        public final VH a(ViewGroup viewGroup, int i2) {
            try {
                c.h.h.c.a("RV CreateView");
                VH b2 = b(viewGroup, i2);
                if (b2.a.getParent() == null) {
                    b2.f1547f = i2;
                    return b2;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                c.h.h.c.a();
            }
        }

        public final void a(int i2, int i3) {
            this.a.a(i2, i3);
        }

        public final void a(int i2, int i3, Object obj) {
            this.a.a(i2, i3, obj);
        }

        public final void a(VH vh, int i2) {
            boolean z = vh.s == null;
            if (z) {
                vh.f1544c = i2;
                if (d()) {
                    vh.f1546e = a(i2);
                }
                vh.a(1, 519);
                c.h.h.c.a("RV OnBindView");
            }
            vh.s = this;
            a(vh, i2, vh.m());
            if (z) {
                vh.b();
                ViewGroup.LayoutParams layoutParams = vh.a.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f1583c = true;
                }
                c.h.h.c.a();
            }
        }

        public void a(VH vh, int i2, List<Object> list) {
            b(vh, i2);
        }

        public void a(j jVar) {
            this.a.registerObserver(jVar);
        }

        public void a(RecyclerView recyclerView) {
        }

        public void a(boolean z) {
            if (!c()) {
                this.f1555b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            int i2 = g.a[this.f1556c.ordinal()];
            if (i2 != 1) {
                return i2 != 2 || b() > 0;
            }
            return false;
        }

        public boolean a(VH vh) {
            return false;
        }

        public abstract int b();

        public int b(int i2) {
            return 0;
        }

        public abstract VH b(ViewGroup viewGroup, int i2);

        public final void b(int i2, int i3) {
            this.a.b(i2, i3);
        }

        public void b(VH vh) {
        }

        public abstract void b(VH vh, int i2);

        public void b(j jVar) {
            this.a.unregisterObserver(jVar);
        }

        public void b(RecyclerView recyclerView) {
        }

        public final void c(int i2, int i3) {
            this.a.c(i2, i3);
        }

        public void c(VH vh) {
        }

        public final boolean c() {
            return this.a.a();
        }

        public void d(VH vh) {
        }

        public final boolean d() {
            return this.f1555b;
        }

        public final void e() {
            this.a.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static class i extends Observable<j> {
        i() {
        }

        public void a(int i2, int i3) {
            a(i2, i3, null);
        }

        public void a(int i2, int i3, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a(i2, i3, obj);
            }
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void b(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).b(i2, i3);
            }
        }

        public void c(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i2, i3);
            }
        }
    }

    public static abstract class j {
        public void a() {
        }

        public void a(int i2, int i3) {
        }

        public void a(int i2, int i3, Object obj) {
            a(i2, i3);
        }

        public void b(int i2, int i3) {
        }

        public void c(int i2, int i3) {
        }
    }

    public interface k {
        int a(int i2, int i3);
    }

    public static class l {
        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView, int i2) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class m {
        private b a = null;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<a> f1561b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private long f1562c = 120;

        /* renamed from: d  reason: collision with root package name */
        private long f1563d = 120;

        /* renamed from: e  reason: collision with root package name */
        private long f1564e = 250;

        /* renamed from: f  reason: collision with root package name */
        private long f1565f = 250;

        public interface a {
            void a();
        }

        /* access modifiers changed from: package-private */
        public interface b {
            void a(e0 e0Var);
        }

        public static class c {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public int f1566b;

            public c a(e0 e0Var) {
                a(e0Var, 0);
                return this;
            }

            public c a(e0 e0Var, int i2) {
                View view = e0Var.a;
                this.a = view.getLeft();
                this.f1566b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        static int e(e0 e0Var) {
            int i2 = e0Var.f1551j & 14;
            if (e0Var.q()) {
                return 4;
            }
            if ((i2 & 4) != 0) {
                return i2;
            }
            int l2 = e0Var.l();
            int f2 = e0Var.f();
            return (l2 == -1 || f2 == -1 || l2 == f2) ? i2 : i2 | 2048;
        }

        public c a(b0 b0Var, e0 e0Var) {
            c h2 = h();
            h2.a(e0Var);
            return h2;
        }

        public c a(b0 b0Var, e0 e0Var, int i2, List<Object> list) {
            c h2 = h();
            h2.a(e0Var);
            return h2;
        }

        public final void a() {
            int size = this.f1561b.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1561b.get(i2).a();
            }
            this.f1561b.clear();
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.a = bVar;
        }

        public abstract boolean a(e0 e0Var);

        public abstract boolean a(e0 e0Var, e0 e0Var2, c cVar, c cVar2);

        public abstract boolean a(e0 e0Var, c cVar, c cVar2);

        public boolean a(e0 e0Var, List<Object> list) {
            return a(e0Var);
        }

        public abstract void b();

        public final void b(e0 e0Var) {
            d(e0Var);
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(e0Var);
            }
        }

        public abstract boolean b(e0 e0Var, c cVar, c cVar2);

        public long c() {
            return this.f1562c;
        }

        public abstract void c(e0 e0Var);

        public abstract boolean c(e0 e0Var, c cVar, c cVar2);

        public long d() {
            return this.f1565f;
        }

        public void d(e0 e0Var) {
        }

        public long e() {
            return this.f1564e;
        }

        public long f() {
            return this.f1563d;
        }

        public abstract boolean g();

        public c h() {
            return new c();
        }

        public abstract void i();
    }

    private class n implements m.b {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(e0 e0Var) {
            e0Var.a(true);
            if (e0Var.f1549h != null && e0Var.f1550i == null) {
                e0Var.f1549h = null;
            }
            e0Var.f1550i = null;
            if (!e0Var.z() && !RecyclerView.this.k(e0Var.a) && e0Var.u()) {
                RecyclerView.this.removeDetachedView(e0Var.a, false);
            }
        }
    }

    public static abstract class o {
        @Deprecated
        public void a(Canvas canvas, RecyclerView recyclerView) {
        }

        public void a(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            a(canvas, recyclerView);
        }

        @Deprecated
        public void a(Rect rect, int i2, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void a(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
            a(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void b(Canvas canvas, RecyclerView recyclerView) {
        }

        public void b(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            b(canvas, recyclerView);
        }
    }

    public static abstract class p {
        b a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f1567b;

        /* renamed from: c  reason: collision with root package name */
        private final m.b f1568c = new a();

        /* renamed from: d  reason: collision with root package name */
        private final m.b f1569d = new b();

        /* renamed from: e  reason: collision with root package name */
        m f1570e = new m(this.f1568c);

        /* renamed from: f  reason: collision with root package name */
        m f1571f = new m(this.f1569d);

        /* renamed from: g  reason: collision with root package name */
        a0 f1572g;

        /* renamed from: h  reason: collision with root package name */
        boolean f1573h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f1574i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f1575j = false;

        /* renamed from: k  reason: collision with root package name */
        private boolean f1576k = true;

        /* renamed from: l  reason: collision with root package name */
        private boolean f1577l = true;

        /* renamed from: m  reason: collision with root package name */
        int f1578m;
        boolean n;
        private int o;
        private int p;
        private int q;
        private int r;

        class a implements m.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.m.b
            public int a() {
                return p.this.q() - p.this.o();
            }

            @Override // androidx.recyclerview.widget.m.b
            public int a(View view) {
                return p.this.f(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.m.b
            public View a(int i2) {
                return p.this.c(i2);
            }

            @Override // androidx.recyclerview.widget.m.b
            public int b() {
                return p.this.n();
            }

            @Override // androidx.recyclerview.widget.m.b
            public int b(View view) {
                return p.this.i(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements m.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.m.b
            public int a() {
                return p.this.h() - p.this.m();
            }

            @Override // androidx.recyclerview.widget.m.b
            public int a(View view) {
                return p.this.j(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.m.b
            public View a(int i2) {
                return p.this.c(i2);
            }

            @Override // androidx.recyclerview.widget.m.b
            public int b() {
                return p.this.p();
            }

            @Override // androidx.recyclerview.widget.m.b
            public int b(View view) {
                return p.this.e(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i2, int i3);
        }

        public static class d {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public int f1579b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f1580c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f1581d;
        }

        public static int a(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        public static int a(int i2, int i3, int i4, int i5, boolean z) {
            int i6;
            int i7 = i2 - i4;
            int i8 = 0;
            int max = Math.max(0, i7);
            if (z) {
                if (i5 < 0) {
                    if (i5 == -1) {
                        if (i3 == Integer.MIN_VALUE || (i3 != 0 && i3 == 1073741824)) {
                            i6 = max;
                        } else {
                            i3 = 0;
                            i6 = 0;
                        }
                        i8 = i3;
                        max = i6;
                        return View.MeasureSpec.makeMeasureSpec(max, i8);
                    }
                    max = 0;
                    return View.MeasureSpec.makeMeasureSpec(max, i8);
                }
            } else if (i5 < 0) {
                if (i5 == -1) {
                    i8 = i3;
                } else {
                    if (i5 == -2) {
                        if (i3 == Integer.MIN_VALUE || i3 == 1073741824) {
                            i8 = Integer.MIN_VALUE;
                        }
                    }
                    max = 0;
                }
                return View.MeasureSpec.makeMeasureSpec(max, i8);
            }
            max = i5;
            i8 = 1073741824;
            return View.MeasureSpec.makeMeasureSpec(max, i8);
        }

        public static d a(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.r.c.RecyclerView, i2, i3);
            dVar.a = obtainStyledAttributes.getInt(c.r.c.RecyclerView_android_orientation, 1);
            dVar.f1579b = obtainStyledAttributes.getInt(c.r.c.RecyclerView_spanCount, 1);
            dVar.f1580c = obtainStyledAttributes.getBoolean(c.r.c.RecyclerView_reverseLayout, false);
            dVar.f1581d = obtainStyledAttributes.getBoolean(c.r.c.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private void a(int i2, View view) {
            this.a.a(i2);
        }

        private void a(View view, int i2, boolean z) {
            e0 m2 = RecyclerView.m(view);
            if (z || m2.s()) {
                this.f1567b.f1515g.a(m2);
            } else {
                this.f1567b.f1515g.g(m2);
            }
            q qVar = (q) view.getLayoutParams();
            if (m2.C() || m2.t()) {
                if (m2.t()) {
                    m2.B();
                } else {
                    m2.c();
                }
                this.a.a(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f1567b) {
                int b2 = this.a.b(view);
                if (i2 == -1) {
                    i2 = this.a.a();
                }
                if (b2 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f1567b.indexOfChild(view) + this.f1567b.i());
                } else if (b2 != i2) {
                    this.f1567b.n.a(b2, i2);
                }
            } else {
                this.a.a(view, i2, false);
                qVar.f1583c = true;
                a0 a0Var = this.f1572g;
                if (a0Var != null && a0Var.c()) {
                    this.f1572g.a(view);
                }
            }
            if (qVar.f1584d) {
                m2.a.invalidate();
                qVar.f1584d = false;
            }
        }

        private void a(w wVar, int i2, View view) {
            e0 m2 = RecyclerView.m(view);
            if (!m2.A()) {
                if (!m2.q() || m2.s() || this.f1567b.f1521m.d()) {
                    a(i2);
                    wVar.c(view);
                    this.f1567b.f1515g.d(m2);
                    return;
                }
                g(i2);
                wVar.b(m2);
            }
        }

        private static boolean b(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        private int[] c(View view, Rect rect) {
            int[] iArr = new int[2];
            int n2 = n();
            int p2 = p();
            int q2 = q() - o();
            int h2 = h() - m();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i2 = left - n2;
            int min = Math.min(0, i2);
            int i3 = top - p2;
            int min2 = Math.min(0, i3);
            int i4 = width - q2;
            int max = Math.max(0, i4);
            int max2 = Math.max(0, height - h2);
            if (j() != 1) {
                if (min == 0) {
                    min = Math.min(i2, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i4);
            }
            if (min2 == 0) {
                min2 = Math.min(i3, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private boolean d(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int n2 = n();
            int p2 = p();
            int q2 = q() - o();
            int h2 = h() - m();
            Rect rect = this.f1567b.f1518j;
            b(focusedChild, rect);
            return rect.left - i2 < q2 && rect.right - i2 > n2 && rect.top - i3 < h2 && rect.bottom - i3 > p2;
        }

        /* access modifiers changed from: package-private */
        public boolean A() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void B() {
            a0 a0Var = this.f1572g;
            if (a0Var != null) {
                a0Var.d();
            }
        }

        public boolean C() {
            return false;
        }

        public int a(int i2, w wVar, b0 b0Var) {
            return 0;
        }

        public int a(b0 b0Var) {
            return 0;
        }

        public int a(w wVar, b0 b0Var) {
            return -1;
        }

        public View a(View view, int i2, w wVar, b0 b0Var) {
            return null;
        }

        public q a(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public q a(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public void a(int i2) {
            a(i2, c(i2));
        }

        public void a(int i2, int i3) {
            View c2 = c(i2);
            if (c2 != null) {
                a(i2);
                c(c2, i3);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + this.f1567b.toString());
        }

        public void a(int i2, int i3, b0 b0Var, c cVar) {
        }

        public void a(int i2, c cVar) {
        }

        public void a(int i2, w wVar) {
            View c2 = c(i2);
            g(i2);
            wVar.b(c2);
        }

        public void a(Rect rect, int i2, int i3) {
            c(a(i2, rect.width() + n() + o(), l()), a(i3, rect.height() + p() + m(), k()));
        }

        public void a(Parcelable parcelable) {
        }

        public void a(View view) {
            a(view, -1);
        }

        public void a(View view, int i2) {
            a(view, i2, true);
        }

        public void a(View view, int i2, int i3) {
            q qVar = (q) view.getLayoutParams();
            Rect h2 = this.f1567b.h(view);
            int i4 = i2 + h2.left + h2.right;
            int i5 = i3 + h2.top + h2.bottom;
            int a2 = a(q(), r(), n() + o() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i4, ((ViewGroup.MarginLayoutParams) qVar).width, a());
            int a3 = a(h(), i(), p() + m() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) qVar).height, b());
            if (a(view, a2, a3, qVar)) {
                view.measure(a2, a3);
            }
        }

        public void a(View view, int i2, int i3, int i4, int i5) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f1582b;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public void a(View view, int i2, q qVar) {
            e0 m2 = RecyclerView.m(view);
            if (m2.s()) {
                this.f1567b.f1515g.a(m2);
            } else {
                this.f1567b.f1515g.g(m2);
            }
            this.a.a(view, i2, qVar, m2.s());
        }

        public void a(View view, Rect rect) {
            RecyclerView recyclerView = this.f1567b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.h(view));
            }
        }

        public void a(View view, w wVar) {
            o(view);
            wVar.b(view);
        }

        /* access modifiers changed from: package-private */
        public void a(View view, c.h.l.l0.d dVar) {
            e0 m2 = RecyclerView.m(view);
            if (m2 != null && !m2.s() && !this.a.c(m2.a)) {
                RecyclerView recyclerView = this.f1567b;
                a(recyclerView.f1511c, recyclerView.j0, view, dVar);
            }
        }

        public void a(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((q) view.getLayoutParams()).f1582b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f1567b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f1567b.f1520l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1567b;
            a(recyclerView.f1511c, recyclerView.j0, accessibilityEvent);
        }

        public void a(h hVar, h hVar2) {
        }

        public void a(w wVar) {
            for (int e2 = e() - 1; e2 >= 0; e2--) {
                a(wVar, e2, c(e2));
            }
        }

        public void a(w wVar, b0 b0Var, int i2, int i3) {
            this.f1567b.c(i2, i3);
        }

        public void a(w wVar, b0 b0Var, View view, c.h.l.l0.d dVar) {
        }

        public void a(w wVar, b0 b0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1567b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f1567b.canScrollVertically(-1) && !this.f1567b.canScrollHorizontally(-1) && !this.f1567b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                h hVar = this.f1567b.f1521m;
                if (hVar != null) {
                    accessibilityEvent.setItemCount(hVar.b());
                }
            }
        }

        public void a(w wVar, b0 b0Var, c.h.l.l0.d dVar) {
            if (this.f1567b.canScrollVertically(-1) || this.f1567b.canScrollHorizontally(-1)) {
                dVar.a(8192);
                dVar.j(true);
            }
            if (this.f1567b.canScrollVertically(1) || this.f1567b.canScrollHorizontally(1)) {
                dVar.a(4096);
                dVar.j(true);
            }
            dVar.a(d.b.a(b(wVar, b0Var), a(wVar, b0Var), d(wVar, b0Var), c(wVar, b0Var)));
        }

        /* access modifiers changed from: package-private */
        public void a(RecyclerView recyclerView) {
            this.f1574i = true;
            b(recyclerView);
        }

        public void a(RecyclerView recyclerView, int i2, int i3) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
            c(recyclerView, i2, i3);
        }

        /* access modifiers changed from: package-private */
        public void a(RecyclerView recyclerView, w wVar) {
            this.f1574i = false;
            b(recyclerView, wVar);
        }

        /* access modifiers changed from: package-private */
        public void a(c.h.l.l0.d dVar) {
            RecyclerView recyclerView = this.f1567b;
            a(recyclerView.f1511c, recyclerView.j0, dVar);
        }

        public void a(String str) {
            RecyclerView recyclerView = this.f1567b;
            if (recyclerView != null) {
                recyclerView.a(str);
            }
        }

        public boolean a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f1567b;
            return a(recyclerView.f1511c, recyclerView.j0, i2, bundle);
        }

        /* access modifiers changed from: package-private */
        public boolean a(View view, int i2, int i3, q qVar) {
            return view.isLayoutRequested() || !this.f1576k || !b(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) qVar).width) || !b(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) qVar).height);
        }

        /* access modifiers changed from: package-private */
        public boolean a(View view, int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f1567b;
            return a(recyclerView.f1511c, recyclerView.j0, view, i2, bundle);
        }

        public boolean a(View view, boolean z, boolean z2) {
            boolean z3 = this.f1570e.a(view, 24579) && this.f1571f.a(view, 24579);
            return z ? z3 : !z3;
        }

        public boolean a(q qVar) {
            return qVar != null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(androidx.recyclerview.widget.RecyclerView.w r8, androidx.recyclerview.widget.RecyclerView.b0 r9, int r10, android.os.Bundle r11) {
            /*
            // Method dump skipped, instructions count: 130
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.a(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, int, android.os.Bundle):boolean");
        }

        public boolean a(w wVar, b0 b0Var, View view, int i2, Bundle bundle) {
            return false;
        }

        public boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return a(recyclerView, view, rect, z, false);
        }

        public boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] c2 = c(view, rect);
            int i2 = c2[0];
            int i3 = c2[1];
            if ((z2 && !d(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.i(i2, i3);
            }
            return true;
        }

        @Deprecated
        public boolean a(RecyclerView recyclerView, View view, View view2) {
            return w() || recyclerView.n();
        }

        public boolean a(RecyclerView recyclerView, b0 b0Var, View view, View view2) {
            return a(recyclerView, view, view2);
        }

        public boolean a(RecyclerView recyclerView, ArrayList<View> arrayList, int i2, int i3) {
            return false;
        }

        public boolean a(Runnable runnable) {
            RecyclerView recyclerView = this.f1567b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int b(int i2, w wVar, b0 b0Var) {
            return 0;
        }

        public int b(b0 b0Var) {
            return 0;
        }

        public int b(w wVar, b0 b0Var) {
            return -1;
        }

        public View b(int i2) {
            int e2 = e();
            for (int i3 = 0; i3 < e2; i3++) {
                View c2 = c(i3);
                e0 m2 = RecyclerView.m(c2);
                if (m2 != null && m2.k() == i2 && !m2.A() && (this.f1567b.j0.d() || !m2.s())) {
                    return c2;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void b(int i2, int i3) {
            this.q = View.MeasureSpec.getSize(i2);
            this.o = View.MeasureSpec.getMode(i2);
            if (this.o == 0 && !RecyclerView.F0) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i3);
            this.p = View.MeasureSpec.getMode(i3);
            if (this.p == 0 && !RecyclerView.F0) {
                this.r = 0;
            }
        }

        public void b(View view) {
            b(view, -1);
        }

        public void b(View view, int i2) {
            a(view, i2, false);
        }

        public void b(View view, Rect rect) {
            RecyclerView.a(view, rect);
        }

        public void b(w wVar) {
            for (int e2 = e() - 1; e2 >= 0; e2--) {
                if (!RecyclerView.m(c(e2)).A()) {
                    a(e2, wVar);
                }
            }
        }

        public void b(RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }

        public void b(RecyclerView recyclerView, w wVar) {
            c(recyclerView);
        }

        public boolean b() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, int i2, int i3, q qVar) {
            return !this.f1576k || !b(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) qVar).width) || !b(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) qVar).height);
        }

        public int c(b0 b0Var) {
            return 0;
        }

        public int c(w wVar, b0 b0Var) {
            return 0;
        }

        public View c(int i2) {
            b bVar = this.a;
            if (bVar != null) {
                return bVar.c(i2);
            }
            return null;
        }

        public View c(View view) {
            View c2;
            RecyclerView recyclerView = this.f1567b;
            if (recyclerView == null || (c2 = recyclerView.c(view)) == null || this.a.c(c2)) {
                return null;
            }
            return c2;
        }

        public abstract q c();

        public void c(int i2, int i3) {
            this.f1567b.setMeasuredDimension(i2, i3);
        }

        public void c(View view, int i2) {
            a(view, i2, (q) view.getLayoutParams());
        }

        /* access modifiers changed from: package-private */
        public void c(w wVar) {
            int e2 = wVar.e();
            for (int i2 = e2 - 1; i2 >= 0; i2--) {
                View c2 = wVar.c(i2);
                e0 m2 = RecyclerView.m(c2);
                if (!m2.A()) {
                    m2.a(false);
                    if (m2.u()) {
                        this.f1567b.removeDetachedView(c2, false);
                    }
                    m mVar = this.f1567b.O;
                    if (mVar != null) {
                        mVar.c(m2);
                    }
                    m2.a(true);
                    wVar.a(c2);
                }
            }
            wVar.c();
            if (e2 > 0) {
                this.f1567b.invalidate();
            }
        }

        @Deprecated
        public void c(RecyclerView recyclerView) {
        }

        public void c(RecyclerView recyclerView, int i2, int i3) {
        }

        public int d() {
            return -1;
        }

        public int d(View view) {
            return ((q) view.getLayoutParams()).f1582b.bottom;
        }

        public int d(b0 b0Var) {
            return 0;
        }

        public View d(View view, int i2) {
            return null;
        }

        public void d(int i2) {
            RecyclerView recyclerView = this.f1567b;
            if (recyclerView != null) {
                recyclerView.d(i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(int i2, int i3) {
            int e2 = e();
            if (e2 == 0) {
                this.f1567b.c(i2, i3);
                return;
            }
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE;
            for (int i8 = 0; i8 < e2; i8++) {
                View c2 = c(i8);
                Rect rect = this.f1567b.f1518j;
                b(c2, rect);
                int i9 = rect.left;
                if (i9 < i4) {
                    i4 = i9;
                }
                int i10 = rect.right;
                if (i10 > i6) {
                    i6 = i10;
                }
                int i11 = rect.top;
                if (i11 < i5) {
                    i5 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i7) {
                    i7 = i12;
                }
            }
            this.f1567b.f1518j.set(i4, i5, i6, i7);
            a(this.f1567b.f1518j, i2, i3);
        }

        public void d(RecyclerView recyclerView) {
        }

        public boolean d(w wVar, b0 b0Var) {
            return false;
        }

        public int e() {
            b bVar = this.a;
            if (bVar != null) {
                return bVar.a();
            }
            return 0;
        }

        public int e(View view) {
            return view.getBottom() + d(view);
        }

        public int e(b0 b0Var) {
            return 0;
        }

        public void e(int i2) {
            RecyclerView recyclerView = this.f1567b;
            if (recyclerView != null) {
                recyclerView.e(i2);
            }
        }

        public void e(w wVar, b0 b0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* access modifiers changed from: package-private */
        public void e(RecyclerView recyclerView) {
            b(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int f(View view) {
            return view.getLeft() - k(view);
        }

        public int f(b0 b0Var) {
            return 0;
        }

        public void f(int i2) {
        }

        /* access modifiers changed from: package-private */
        public void f(RecyclerView recyclerView) {
            int i2;
            if (recyclerView == null) {
                this.f1567b = null;
                this.a = null;
                i2 = 0;
                this.q = 0;
            } else {
                this.f1567b = recyclerView;
                this.a = recyclerView.f1514f;
                this.q = recyclerView.getWidth();
                i2 = recyclerView.getHeight();
            }
            this.r = i2;
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public boolean f() {
            RecyclerView recyclerView = this.f1567b;
            return recyclerView != null && recyclerView.f1516h;
        }

        public int g(View view) {
            Rect rect = ((q) view.getLayoutParams()).f1582b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public View g() {
            View focusedChild;
            RecyclerView recyclerView = this.f1567b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void g(int i2) {
            if (c(i2) != null) {
                this.a.e(i2);
            }
        }

        public void g(b0 b0Var) {
        }

        public int h() {
            return this.r;
        }

        public int h(View view) {
            Rect rect = ((q) view.getLayoutParams()).f1582b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int i() {
            return this.p;
        }

        public int i(View view) {
            return view.getRight() + m(view);
        }

        public int j() {
            return c.h.l.b0.r(this.f1567b);
        }

        public int j(View view) {
            return view.getTop() - n(view);
        }

        public int k() {
            return c.h.l.b0.s(this.f1567b);
        }

        public int k(View view) {
            return ((q) view.getLayoutParams()).f1582b.left;
        }

        public int l() {
            return c.h.l.b0.t(this.f1567b);
        }

        public int l(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public int m() {
            RecyclerView recyclerView = this.f1567b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int m(View view) {
            return ((q) view.getLayoutParams()).f1582b.right;
        }

        public int n() {
            RecyclerView recyclerView = this.f1567b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int n(View view) {
            return ((q) view.getLayoutParams()).f1582b.top;
        }

        public int o() {
            RecyclerView recyclerView = this.f1567b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void o(View view) {
            this.a.d(view);
        }

        public int p() {
            RecyclerView recyclerView = this.f1567b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int q() {
            return this.q;
        }

        public int r() {
            return this.o;
        }

        /* access modifiers changed from: package-private */
        public boolean s() {
            int e2 = e();
            for (int i2 = 0; i2 < e2; i2++) {
                ViewGroup.LayoutParams layoutParams = c(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean t() {
            return this.f1574i;
        }

        public boolean u() {
            return this.f1575j;
        }

        public final boolean v() {
            return this.f1577l;
        }

        public boolean w() {
            a0 a0Var = this.f1572g;
            return a0Var != null && a0Var.c();
        }

        public Parcelable x() {
            return null;
        }

        public void y() {
            RecyclerView recyclerView = this.f1567b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void z() {
            this.f1573h = true;
        }
    }

    public static class q extends ViewGroup.MarginLayoutParams {
        e0 a;

        /* renamed from: b  reason: collision with root package name */
        final Rect f1582b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        boolean f1583c = true;

        /* renamed from: d  reason: collision with root package name */
        boolean f1584d = false;

        public q(int i2, int i3) {
            super(i2, i3);
        }

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
        }

        public int a() {
            return this.a.k();
        }

        public boolean b() {
            return this.a.v();
        }

        public boolean c() {
            return this.a.s();
        }

        public boolean d() {
            return this.a.q();
        }
    }

    public interface r {
        void a(View view);

        void b(View view);
    }

    public static abstract class s {
        public abstract boolean a(int i2, int i3);
    }

    public interface t {
        void a(boolean z);

        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public static abstract class u {
        public void a(RecyclerView recyclerView, int i2) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    public static class v {
        SparseArray<a> a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        private int f1585b = 0;

        /* access modifiers changed from: package-private */
        public static class a {
            final ArrayList<e0> a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            int f1586b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f1587c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f1588d = 0;

            a() {
            }
        }

        private a b(int i2) {
            a aVar = this.a.get(i2);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i2, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        public long a(long j2, long j3) {
            return j2 == 0 ? j3 : ((j2 / 4) * 3) + (j3 / 4);
        }

        public e0 a(int i2) {
            a aVar = this.a.get(i2);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList<e0> arrayList = aVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).o()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1585b++;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, long j2) {
            a b2 = b(i2);
            b2.f1588d = a(b2.f1588d, j2);
        }

        public void a(e0 e0Var) {
            int j2 = e0Var.j();
            ArrayList<e0> arrayList = b(j2).a;
            if (this.a.get(j2).f1586b > arrayList.size()) {
                e0Var.x();
                arrayList.add(e0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar, h hVar2, boolean z) {
            if (hVar != null) {
                c();
            }
            if (!z && this.f1585b == 0) {
                b();
            }
            if (hVar2 != null) {
                a();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i2, long j2, long j3) {
            long j4 = b(i2).f1588d;
            return j4 == 0 || j2 + j4 < j3;
        }

        public void b() {
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                this.a.valueAt(i2).a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i2, long j2) {
            a b2 = b(i2);
            b2.f1587c = a(b2.f1587c, j2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(int i2, long j2, long j3) {
            long j4 = b(i2).f1587c;
            return j4 == 0 || j2 + j4 < j3;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f1585b--;
        }
    }

    public final class w {
        final ArrayList<e0> a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        ArrayList<e0> f1589b = null;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<e0> f1590c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        private final List<e0> f1591d = Collections.unmodifiableList(this.a);

        /* renamed from: e  reason: collision with root package name */
        private int f1592e = 2;

        /* renamed from: f  reason: collision with root package name */
        int f1593f = 2;

        /* renamed from: g  reason: collision with root package name */
        v f1594g;

        /* renamed from: h  reason: collision with root package name */
        private c0 f1595h;

        public w() {
        }

        private void a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private boolean a(e0 e0Var, int i2, int i3, long j2) {
            e0Var.s = null;
            e0Var.r = RecyclerView.this;
            int j3 = e0Var.j();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j2 != Long.MAX_VALUE && !this.f1594g.a(j3, nanoTime, j2)) {
                return false;
            }
            RecyclerView.this.f1521m.a(e0Var, i2);
            this.f1594g.a(e0Var.j(), RecyclerView.this.getNanoTime() - nanoTime);
            e(e0Var);
            if (!RecyclerView.this.j0.d()) {
                return true;
            }
            e0Var.f1548g = i3;
            return true;
        }

        private void e(e0 e0Var) {
            if (RecyclerView.this.m()) {
                View view = e0Var.a;
                if (c.h.l.b0.p(view) == 0) {
                    c.h.l.b0.h(view, 1);
                }
                j jVar = RecyclerView.this.q0;
                if (jVar != null) {
                    c.h.l.c b2 = jVar.b();
                    if (b2 instanceof j.a) {
                        ((j.a) b2).d(view);
                    }
                    c.h.l.b0.a(view, b2);
                }
            }
        }

        private void f(e0 e0Var) {
            View view = e0Var.a;
            if (view instanceof ViewGroup) {
                a((ViewGroup) view, false);
            }
        }

        public int a(int i2) {
            if (i2 >= 0 && i2 < RecyclerView.this.j0.a()) {
                return !RecyclerView.this.j0.d() ? i2 : RecyclerView.this.f1513e.b(i2);
            }
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + RecyclerView.this.j0.a() + RecyclerView.this.i());
        }

        /* access modifiers changed from: package-private */
        public e0 a(int i2, boolean z) {
            View b2;
            int size = this.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                e0 e0Var = this.a.get(i3);
                if (!e0Var.C() && e0Var.k() == i2 && !e0Var.q() && (RecyclerView.this.j0.f1530h || !e0Var.s())) {
                    e0Var.a(32);
                    return e0Var;
                }
            }
            if (z || (b2 = RecyclerView.this.f1514f.b(i2)) == null) {
                int size2 = this.f1590c.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    e0 e0Var2 = this.f1590c.get(i4);
                    if (!e0Var2.q() && e0Var2.k() == i2 && !e0Var2.o()) {
                        if (!z) {
                            this.f1590c.remove(i4);
                        }
                        return e0Var2;
                    }
                }
                return null;
            }
            e0 m2 = RecyclerView.m(b2);
            RecyclerView.this.f1514f.f(b2);
            int b3 = RecyclerView.this.f1514f.b(b2);
            if (b3 != -1) {
                RecyclerView.this.f1514f.a(b3);
                c(b2);
                m2.a(8224);
                return m2;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + m2 + RecyclerView.this.i());
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01a1  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01c4  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x01fd  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x020b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.e0 a(int r17, boolean r18, long r19) {
            /*
            // Method dump skipped, instructions count: 607
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$e0");
        }

        /* access modifiers changed from: package-private */
        public e0 a(long j2, int i2, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                e0 e0Var = this.a.get(size);
                if (e0Var.i() == j2 && !e0Var.C()) {
                    if (i2 == e0Var.j()) {
                        e0Var.a(32);
                        if (e0Var.s() && !RecyclerView.this.j0.d()) {
                            e0Var.a(2, 14);
                        }
                        return e0Var;
                    } else if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(e0Var.a, false);
                        a(e0Var.a);
                    }
                }
            }
            int size2 = this.f1590c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                e0 e0Var2 = this.f1590c.get(size2);
                if (e0Var2.i() == j2 && !e0Var2.o()) {
                    if (i2 == e0Var2.j()) {
                        if (!z) {
                            this.f1590c.remove(size2);
                        }
                        return e0Var2;
                    } else if (!z) {
                        e(size2);
                        return null;
                    }
                }
            }
        }

        public void a() {
            this.a.clear();
            i();
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3) {
            int size = this.f1590c.size();
            for (int i4 = 0; i4 < size; i4++) {
                e0 e0Var = this.f1590c.get(i4);
                if (e0Var != null && e0Var.f1544c >= i2) {
                    e0Var.a(i3, false);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3, boolean z) {
            int i4 = i2 + i3;
            for (int size = this.f1590c.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f1590c.get(size);
                if (e0Var != null) {
                    int i5 = e0Var.f1544c;
                    if (i5 >= i4) {
                        e0Var.a(-i3, z);
                    } else if (i5 >= i2) {
                        e0Var.a(8);
                        e(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            e0 m2 = RecyclerView.m(view);
            m2.n = null;
            m2.o = false;
            m2.c();
            b(m2);
        }

        /* access modifiers changed from: package-private */
        public void a(c0 c0Var) {
            this.f1595h = c0Var;
        }

        /* access modifiers changed from: package-private */
        public void a(e0 e0Var) {
            x xVar = RecyclerView.this.o;
            if (xVar != null) {
                xVar.a(e0Var);
            }
            int size = RecyclerView.this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView.this.p.get(i2).a(e0Var);
            }
            h hVar = RecyclerView.this.f1521m;
            if (hVar != null) {
                hVar.d(e0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.j0 != null) {
                recyclerView.f1515g.h(e0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(e0 e0Var, boolean z) {
            RecyclerView.e(e0Var);
            View view = e0Var.a;
            j jVar = RecyclerView.this.q0;
            if (jVar != null) {
                c.h.l.c b2 = jVar.b();
                c.h.l.b0.a(view, b2 instanceof j.a ? ((j.a) b2).c(view) : null);
            }
            if (z) {
                a(e0Var);
            }
            e0Var.s = null;
            e0Var.r = null;
            d().a(e0Var);
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar, h hVar2, boolean z) {
            a();
            d().a(hVar, hVar2, z);
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar) {
            v vVar2 = this.f1594g;
            if (vVar2 != null) {
                vVar2.c();
            }
            this.f1594g = vVar;
            if (this.f1594g != null && RecyclerView.this.getAdapter() != null) {
                this.f1594g.a();
            }
        }

        /* access modifiers changed from: package-private */
        public View b(int i2, boolean z) {
            return a(i2, z, Long.MAX_VALUE).a;
        }

        /* access modifiers changed from: package-private */
        public e0 b(int i2) {
            int size;
            int b2;
            ArrayList<e0> arrayList = this.f1589b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                for (int i3 = 0; i3 < size; i3++) {
                    e0 e0Var = this.f1589b.get(i3);
                    if (!e0Var.C() && e0Var.k() == i2) {
                        e0Var.a(32);
                        return e0Var;
                    }
                }
                if (RecyclerView.this.f1521m.d() && (b2 = RecyclerView.this.f1513e.b(i2)) > 0 && b2 < RecyclerView.this.f1521m.b()) {
                    long a2 = RecyclerView.this.f1521m.a(b2);
                    for (int i4 = 0; i4 < size; i4++) {
                        e0 e0Var2 = this.f1589b.get(i4);
                        if (!e0Var2.C() && e0Var2.i() == a2) {
                            e0Var2.a(32);
                            return e0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int size = this.f1590c.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1590c.get(i2).a();
            }
            int size2 = this.a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.a.get(i3).a();
            }
            ArrayList<e0> arrayList = this.f1589b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.f1589b.get(i4).a();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int i7;
            if (i2 < i3) {
                i6 = i2;
                i5 = i3;
                i4 = -1;
            } else {
                i5 = i2;
                i6 = i3;
                i4 = 1;
            }
            int size = this.f1590c.size();
            for (int i8 = 0; i8 < size; i8++) {
                e0 e0Var = this.f1590c.get(i8);
                if (e0Var != null && (i7 = e0Var.f1544c) >= i6 && i7 <= i5) {
                    if (i7 == i2) {
                        e0Var.a(i3 - i2, false);
                    } else {
                        e0Var.a(i4, false);
                    }
                }
            }
        }

        public void b(View view) {
            e0 m2 = RecyclerView.m(view);
            if (m2.u()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (m2.t()) {
                m2.B();
            } else if (m2.C()) {
                m2.c();
            }
            b(m2);
            if (RecyclerView.this.O != null && !m2.r()) {
                RecyclerView.this.O.c(m2);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(e0 e0Var) {
            boolean z;
            boolean z2 = false;
            if (e0Var.t() || e0Var.a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(e0Var.t());
                sb.append(" isAttached:");
                if (e0Var.a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.i());
                throw new IllegalArgumentException(sb.toString());
            } else if (e0Var.u()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + e0Var + RecyclerView.this.i());
            } else if (!e0Var.A()) {
                boolean e2 = e0Var.e();
                h hVar = RecyclerView.this.f1521m;
                if ((hVar != null && e2 && hVar.a(e0Var)) || e0Var.r()) {
                    if (this.f1593f <= 0 || e0Var.b(526)) {
                        z = false;
                    } else {
                        int size = this.f1590c.size();
                        if (size >= this.f1593f && size > 0) {
                            e(0);
                            size--;
                        }
                        if (RecyclerView.H0 && size > 0 && !RecyclerView.this.i0.a(e0Var.f1544c)) {
                            int i2 = size - 1;
                            while (i2 >= 0) {
                                if (!RecyclerView.this.i0.a(this.f1590c.get(i2).f1544c)) {
                                    break;
                                }
                                i2--;
                            }
                            size = i2 + 1;
                        }
                        this.f1590c.add(size, e0Var);
                        z = true;
                    }
                    if (!z) {
                        a(e0Var, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                RecyclerView.this.f1515g.h(e0Var);
                if (!z && !z2 && e2) {
                    e0Var.s = null;
                    e0Var.r = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.i());
            }
        }

        /* access modifiers changed from: package-private */
        public View c(int i2) {
            return this.a.get(i2).a;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.a.clear();
            ArrayList<e0> arrayList = this.f1589b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(int i2, int i3) {
            int i4;
            int i5 = i3 + i2;
            for (int size = this.f1590c.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f1590c.get(size);
                if (e0Var != null && (i4 = e0Var.f1544c) >= i2 && i4 < i5) {
                    e0Var.a(2);
                    e(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(View view) {
            ArrayList<e0> arrayList;
            e0 m2 = RecyclerView.m(view);
            if (!m2.b(12) && m2.v() && !RecyclerView.this.a(m2)) {
                if (this.f1589b == null) {
                    this.f1589b = new ArrayList<>();
                }
                m2.a(this, true);
                arrayList = this.f1589b;
            } else if (!m2.q() || m2.s() || RecyclerView.this.f1521m.d()) {
                m2.a(this, false);
                arrayList = this.a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.i());
            }
            arrayList.add(m2);
        }

        /* access modifiers changed from: package-private */
        public void c(e0 e0Var) {
            (e0Var.o ? this.f1589b : this.a).remove(e0Var);
            e0Var.n = null;
            e0Var.o = false;
            e0Var.c();
        }

        public View d(int i2) {
            return b(i2, false);
        }

        /* access modifiers changed from: package-private */
        public v d() {
            if (this.f1594g == null) {
                this.f1594g = new v();
            }
            return this.f1594g;
        }

        /* access modifiers changed from: package-private */
        public boolean d(e0 e0Var) {
            if (e0Var.s()) {
                return RecyclerView.this.j0.d();
            }
            int i2 = e0Var.f1544c;
            if (i2 < 0 || i2 >= RecyclerView.this.f1521m.b()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e0Var + RecyclerView.this.i());
            } else if (RecyclerView.this.j0.d() || RecyclerView.this.f1521m.b(e0Var.f1544c) == e0Var.j()) {
                return !RecyclerView.this.f1521m.d() || e0Var.i() == RecyclerView.this.f1521m.a(e0Var.f1544c);
            } else {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return this.a.size();
        }

        /* access modifiers changed from: package-private */
        public void e(int i2) {
            a(this.f1590c.get(i2), true);
            this.f1590c.remove(i2);
        }

        public List<e0> f() {
            return this.f1591d;
        }

        public void f(int i2) {
            this.f1592e = i2;
            j();
        }

        /* access modifiers changed from: package-private */
        public void g() {
            int size = this.f1590c.size();
            for (int i2 = 0; i2 < size; i2++) {
                q qVar = (q) this.f1590c.get(i2).a.getLayoutParams();
                if (qVar != null) {
                    qVar.f1583c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            int size = this.f1590c.size();
            for (int i2 = 0; i2 < size; i2++) {
                e0 e0Var = this.f1590c.get(i2);
                if (e0Var != null) {
                    e0Var.a(6);
                    e0Var.a((Object) null);
                }
            }
            h hVar = RecyclerView.this.f1521m;
            if (hVar == null || !hVar.d()) {
                i();
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
            for (int size = this.f1590c.size() - 1; size >= 0; size--) {
                e(size);
            }
            this.f1590c.clear();
            if (RecyclerView.H0) {
                RecyclerView.this.i0.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void j() {
            p pVar = RecyclerView.this.n;
            this.f1593f = this.f1592e + (pVar != null ? pVar.f1578m : 0);
            for (int size = this.f1590c.size() - 1; size >= 0 && this.f1590c.size() > this.f1593f; size--) {
                e(size);
            }
        }
    }

    public interface x {
        void a(e0 e0Var);
    }

    /* access modifiers changed from: private */
    public class y extends j {
        y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.a((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.j0.f1529g = true;
            recyclerView.b(true);
            if (!RecyclerView.this.f1513e.c()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a(int i2, int i3, Object obj) {
            RecyclerView.this.a((String) null);
            if (RecyclerView.this.f1513e.a(i2, i3, obj)) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (RecyclerView.G0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.u && recyclerView.t) {
                    c.h.l.b0.a(recyclerView, recyclerView.f1517i);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.C = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i2, int i3) {
            RecyclerView.this.a((String) null);
            if (RecyclerView.this.f1513e.b(i2, i3)) {
                b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i2, int i3) {
            RecyclerView.this.a((String) null);
            if (RecyclerView.this.f1513e.c(i2, i3)) {
                b();
            }
        }
    }

    public static class z extends c.j.a.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        Parcelable f1597d;

        class a implements Parcelable.ClassLoaderCreator<z> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public z[] newArray(int i2) {
                return new z[i2];
            }
        }

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1597d = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: package-private */
        public void a(z zVar) {
            this.f1597d = zVar.f1597d;
        }

        @Override // c.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeParcelable(this.f1597d, 0);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        E0 = i2 == 18 || i2 == 19 || i2 == 20;
        Class<?> cls = Integer.TYPE;
        K0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.r.a.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1510b = new y();
        this.f1511c = new w();
        this.f1515g = new n();
        this.f1517i = new a();
        this.f1518j = new Rect();
        this.f1519k = new Rect();
        this.f1520l = new RectF();
        this.p = new ArrayList();
        this.q = new ArrayList<>();
        this.r = new ArrayList<>();
        this.x = 0;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        this.J = new l();
        this.O = new c();
        this.P = 0;
        this.Q = -1;
        this.d0 = Float.MIN_VALUE;
        this.e0 = Float.MIN_VALUE;
        boolean z2 = true;
        this.f0 = true;
        this.g0 = new d0();
        this.i0 = H0 ? new e.b() : null;
        this.j0 = new b0();
        this.m0 = false;
        this.n0 = false;
        this.o0 = new n();
        this.p0 = false;
        this.s0 = new int[2];
        this.u0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new ArrayList();
        this.y0 = new b();
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.W = viewConfiguration.getScaledTouchSlop();
        this.d0 = c.h.l.c0.b(viewConfiguration, context);
        this.e0 = c.h.l.c0.c(viewConfiguration, context);
        this.b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.O.a(this.o0);
        k();
        G();
        F();
        if (c.h.l.b0.p(this) == 0) {
            c.h.l.b0.h(this, 1);
        }
        this.D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new j(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.r.c.RecyclerView, i2, 0);
        c.h.l.b0.a(this, context, c.r.c.RecyclerView, attributeSet, obtainStyledAttributes, i2, 0);
        String string = obtainStyledAttributes.getString(c.r.c.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(c.r.c.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1516h = obtainStyledAttributes.getBoolean(c.r.c.RecyclerView_android_clipToPadding, true);
        this.v = obtainStyledAttributes.getBoolean(c.r.c.RecyclerView_fastScrollEnabled, false);
        if (this.v) {
            a((StateListDrawable) obtainStyledAttributes.getDrawable(c.r.c.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(c.r.c.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(c.r.c.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(c.r.c.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        a(context, string, attributeSet, i2, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, D0, i2, 0);
            c.h.l.b0.a(this, context, D0, attributeSet, obtainStyledAttributes2, i2, 0);
            z2 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    private void A() {
        boolean z2 = true;
        this.j0.a(1);
        a(this.j0);
        this.j0.f1532j = false;
        w();
        this.f1515g.a();
        q();
        I();
        N();
        b0 b0Var = this.j0;
        if (!b0Var.f1533k || !this.n0) {
            z2 = false;
        }
        b0Var.f1531i = z2;
        this.n0 = false;
        this.m0 = false;
        b0 b0Var2 = this.j0;
        b0Var2.f1530h = b0Var2.f1534l;
        b0Var2.f1528f = this.f1521m.b();
        a(this.s0);
        if (this.j0.f1533k) {
            int a2 = this.f1514f.a();
            for (int i2 = 0; i2 < a2; i2++) {
                e0 m2 = m(this.f1514f.c(i2));
                if (!m2.A() && (!m2.q() || this.f1521m.d())) {
                    this.f1515g.c(m2, this.O.a(this.j0, m2, m.e(m2), m2.m()));
                    if (this.j0.f1531i && m2.v() && !m2.s() && !m2.A() && !m2.q()) {
                        this.f1515g.a(c(m2), m2);
                    }
                }
            }
        }
        if (this.j0.f1534l) {
            v();
            b0 b0Var3 = this.j0;
            boolean z3 = b0Var3.f1529g;
            b0Var3.f1529g = false;
            this.n.e(this.f1511c, b0Var3);
            this.j0.f1529g = z3;
            for (int i3 = 0; i3 < this.f1514f.a(); i3++) {
                e0 m3 = m(this.f1514f.c(i3));
                if (!m3.A() && !this.f1515g.c(m3)) {
                    int e2 = m.e(m3);
                    boolean b2 = m3.b(8192);
                    if (!b2) {
                        e2 |= 4096;
                    }
                    m.c a3 = this.O.a(this.j0, m3, e2, m3.m());
                    if (b2) {
                        a(m3, a3);
                    } else {
                        this.f1515g.a(m3, a3);
                    }
                }
            }
        }
        a();
        r();
        c(false);
        this.j0.f1527e = 2;
    }

    private void B() {
        w();
        q();
        this.j0.a(6);
        this.f1513e.b();
        this.j0.f1528f = this.f1521m.b();
        this.j0.f1526d = 0;
        if (this.f1512d != null && this.f1521m.a()) {
            Parcelable parcelable = this.f1512d.f1597d;
            if (parcelable != null) {
                this.n.a(parcelable);
            }
            this.f1512d = null;
        }
        b0 b0Var = this.j0;
        b0Var.f1530h = false;
        this.n.e(this.f1511c, b0Var);
        b0 b0Var2 = this.j0;
        b0Var2.f1529g = false;
        b0Var2.f1533k = b0Var2.f1533k && this.O != null;
        this.j0.f1527e = 4;
        r();
        c(false);
    }

    private void C() {
        this.j0.a(4);
        w();
        q();
        b0 b0Var = this.j0;
        b0Var.f1527e = 1;
        if (b0Var.f1533k) {
            for (int a2 = this.f1514f.a() - 1; a2 >= 0; a2--) {
                e0 m2 = m(this.f1514f.c(a2));
                if (!m2.A()) {
                    long c2 = c(m2);
                    m.c a3 = this.O.a(this.j0, m2);
                    e0 a4 = this.f1515g.a(c2);
                    if (a4 != null && !a4.A()) {
                        boolean b2 = this.f1515g.b(a4);
                        boolean b3 = this.f1515g.b(m2);
                        if (!b2 || a4 != m2) {
                            m.c f2 = this.f1515g.f(a4);
                            this.f1515g.b(m2, a3);
                            m.c e2 = this.f1515g.e(m2);
                            if (f2 == null) {
                                a(c2, m2, a4);
                            } else {
                                a(a4, m2, f2, e2, b2, b3);
                            }
                        }
                    }
                    this.f1515g.b(m2, a3);
                }
            }
            this.f1515g.a(this.C0);
        }
        this.n.c(this.f1511c);
        b0 b0Var2 = this.j0;
        b0Var2.f1525c = b0Var2.f1528f;
        this.F = false;
        this.G = false;
        b0Var2.f1533k = false;
        b0Var2.f1534l = false;
        this.n.f1573h = false;
        ArrayList<e0> arrayList = this.f1511c.f1589b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.n;
        if (pVar.n) {
            pVar.f1578m = 0;
            pVar.n = false;
            this.f1511c.j();
        }
        this.n.g(this.j0);
        r();
        c(false);
        this.f1515g.a();
        int[] iArr = this.s0;
        if (k(iArr[0], iArr[1])) {
            d(0, 0);
        }
        J();
        L();
    }

    private View D() {
        e0 c2;
        int i2 = this.j0.f1535m;
        if (i2 == -1) {
            i2 = 0;
        }
        int a2 = this.j0.a();
        for (int i3 = i2; i3 < a2; i3++) {
            e0 c3 = c(i3);
            if (c3 == null) {
                break;
            } else if (c3.a.hasFocusable()) {
                return c3.a;
            }
        }
        int min = Math.min(a2, i2);
        while (true) {
            min--;
            if (min < 0 || (c2 = c(min)) == null) {
                return null;
            }
            if (c2.a.hasFocusable()) {
                return c2.a;
            }
        }
    }

    private boolean E() {
        int a2 = this.f1514f.a();
        for (int i2 = 0; i2 < a2; i2++) {
            e0 m2 = m(this.f1514f.c(i2));
            if (!(m2 == null || m2.A() || !m2.v())) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void F() {
        if (c.h.l.b0.q(this) == 0) {
            c.h.l.b0.i(this, 8);
        }
    }

    private void G() {
        this.f1514f = new b(new e());
    }

    private boolean H() {
        return this.O != null && this.n.C();
    }

    private void I() {
        if (this.F) {
            this.f1513e.f();
            if (this.G) {
                this.n.d(this);
            }
        }
        if (H()) {
            this.f1513e.e();
        } else {
            this.f1513e.b();
        }
        boolean z2 = false;
        boolean z3 = this.m0 || this.n0;
        this.j0.f1533k = this.w && this.O != null && (this.F || z3 || this.n.f1573h) && (!this.F || this.f1521m.d());
        b0 b0Var = this.j0;
        if (b0Var.f1533k && z3 && !this.F && H()) {
            z2 = true;
        }
        b0Var.f1534l = z2;
    }

    private void J() {
        View view;
        if (this.f0 && this.f1521m != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!J0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f1514f.c(focusedChild)) {
                            return;
                        }
                    } else if (this.f1514f.a() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view2 = null;
                e0 a2 = (this.j0.n == -1 || !this.f1521m.d()) ? null : a(this.j0.n);
                if (a2 != null && !this.f1514f.c(a2.a) && a2.a.hasFocusable()) {
                    view2 = a2.a;
                } else if (this.f1514f.a() > 0) {
                    view2 = D();
                }
                if (view2 != null) {
                    int i2 = this.j0.o;
                    if (((long) i2) == -1 || (view = view2.findViewById(i2)) == null || !view.isFocusable()) {
                        view = view2;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void K() {
        boolean z2;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.K.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.N.isFinished();
        }
        if (z2) {
            c.h.l.b0.M(this);
        }
    }

    private void L() {
        b0 b0Var = this.j0;
        b0Var.n = -1;
        b0Var.f1535m = -1;
        b0Var.o = -1;
    }

    private void M() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        a(0);
        K();
    }

    private void N() {
        e0 e0Var = null;
        View focusedChild = (!this.f0 || !hasFocus() || this.f1521m == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            e0Var = d(focusedChild);
        }
        if (e0Var == null) {
            L();
            return;
        }
        this.j0.n = this.f1521m.d() ? e0Var.i() : -1;
        this.j0.f1535m = this.F ? -1 : e0Var.s() ? e0Var.f1545d : e0Var.f();
        this.j0.o = n(e0Var.a);
    }

    private void O() {
        this.g0.b();
        p pVar = this.n;
        if (pVar != null) {
            pVar.B();
        }
    }

    private String a(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(float r7, float r8, float r9, float r10) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.a(float, float, float, float):void");
    }

    private void a(long j2, e0 e0Var, e0 e0Var2) {
        int a2 = this.f1514f.a();
        for (int i2 = 0; i2 < a2; i2++) {
            e0 m2 = m(this.f1514f.c(i2));
            if (m2 != e0Var && c(m2) == j2) {
                h hVar = this.f1521m;
                if (hVar == null || !hVar.d()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + m2 + " \n View Holder 2:" + e0Var + i());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + m2 + " \n View Holder 2:" + e0Var + i());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e0Var2 + " cannot be found but it is necessary for " + e0Var + i());
    }

    private void a(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String a2 = a(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(a2, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(K0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + a2, e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((p) constructor.newInstance(objArr));
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + a2, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + a2, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + a2, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + a2, e7);
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + a2, e8);
                }
            }
        }
    }

    static void a(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f1582b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private void a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f1518j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f1583c) {
                Rect rect = qVar.f1582b;
                Rect rect2 = this.f1518j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f1518j);
            offsetRectIntoDescendantCoords(view, this.f1518j);
        }
        this.n.a(this, view, this.f1518j, !this.w, view2 == null);
    }

    private void a(e0 e0Var, e0 e0Var2, m.c cVar, m.c cVar2, boolean z2, boolean z3) {
        e0Var.a(false);
        if (z2) {
            d(e0Var);
        }
        if (e0Var != e0Var2) {
            if (z3) {
                d(e0Var2);
            }
            e0Var.f1549h = e0Var2;
            d(e0Var);
            this.f1511c.c(e0Var);
            e0Var2.a(false);
            e0Var2.f1550i = e0Var;
        }
        if (this.O.a(e0Var, e0Var2, cVar, cVar2)) {
            s();
        }
    }

    private void a(h hVar, boolean z2, boolean z3) {
        h hVar2 = this.f1521m;
        if (hVar2 != null) {
            hVar2.b(this.f1510b);
            this.f1521m.b(this);
        }
        if (!z2 || z3) {
            t();
        }
        this.f1513e.f();
        h hVar3 = this.f1521m;
        this.f1521m = hVar;
        if (hVar != null) {
            hVar.a(this.f1510b);
            hVar.a(this);
        }
        p pVar = this.n;
        if (pVar != null) {
            pVar.a(hVar3, this.f1521m);
        }
        this.f1511c.a(hVar3, this.f1521m, z2);
        this.j0.f1529g = true;
    }

    private void a(int[] iArr) {
        int a2 = this.f1514f.a();
        if (a2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < a2; i4++) {
            e0 m2 = m(this.f1514f.c(i4));
            if (!m2.A()) {
                int k2 = m2.k();
                if (k2 < i2) {
                    i2 = k2;
                }
                if (k2 > i3) {
                    i3 = k2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    private boolean a(MotionEvent motionEvent) {
        t tVar = this.s;
        if (tVar != null) {
            tVar.b(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.s = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return b(motionEvent);
        }
    }

    private boolean a(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || view2 == view || c(view2) == null) {
            return false;
        }
        if (view == null || c(view) == null) {
            return true;
        }
        this.f1518j.set(0, 0, view.getWidth(), view.getHeight());
        this.f1519k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f1518j);
        offsetDescendantRectToMyCoords(view2, this.f1519k);
        char c2 = 65535;
        int i4 = this.n.j() == 1 ? -1 : 1;
        Rect rect = this.f1518j;
        int i5 = rect.left;
        int i6 = this.f1519k.left;
        if ((i5 < i6 || rect.right <= i6) && this.f1518j.right < this.f1519k.right) {
            i3 = 1;
        } else {
            Rect rect2 = this.f1518j;
            int i7 = rect2.right;
            int i8 = this.f1519k.right;
            i3 = ((i7 > i8 || rect2.left >= i8) && this.f1518j.left > this.f1519k.left) ? -1 : 0;
        }
        Rect rect3 = this.f1518j;
        int i9 = rect3.top;
        int i10 = this.f1519k.top;
        if ((i9 < i10 || rect3.bottom <= i10) && this.f1518j.bottom < this.f1519k.bottom) {
            c2 = 1;
        } else {
            Rect rect4 = this.f1518j;
            int i11 = rect4.bottom;
            int i12 = this.f1519k.bottom;
            if ((i11 <= i12 && rect4.top < i12) || this.f1518j.top <= this.f1519k.top) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 < 0);
        }
        if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 > 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return c2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return c2 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i2 + i());
    }

    private void b(int i2, int i3, MotionEvent motionEvent, int i4) {
        p pVar = this.n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.z) {
            int[] iArr = this.w0;
            int i5 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean a2 = pVar.a();
            boolean b2 = this.n.b();
            int i6 = a2 ? 1 : 0;
            if (b2) {
                i6 |= 2;
            }
            j(i6, i4);
            if (a(a2 ? i2 : 0, b2 ? i3 : 0, this.w0, this.u0, i4)) {
                int[] iArr2 = this.w0;
                i2 -= iArr2[0];
                i3 -= iArr2[1];
            }
            int i7 = a2 ? i2 : 0;
            if (b2) {
                i5 = i3;
            }
            a(i7, i5, motionEvent, i4);
            if (!(this.h0 == null || (i2 == 0 && i3 == 0))) {
                this.h0.a(this, i2, i3);
            }
            a(i4);
        }
    }

    private boolean b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.r.size();
        for (int i2 = 0; i2 < size; i2++) {
            t tVar = this.r.get(i2);
            if (tVar.a(this, motionEvent) && action != 3) {
                this.s = tVar;
                return true;
            }
        }
        return false;
    }

    private void c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Q) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.Q = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.U = x2;
            this.S = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.V = y2;
            this.T = y2;
        }
    }

    private void d(e0 e0Var) {
        View view = e0Var.a;
        boolean z2 = view.getParent() == this;
        this.f1511c.c(g(view));
        if (e0Var.u()) {
            this.f1514f.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        b bVar = this.f1514f;
        if (!z2) {
            bVar.a(view, true);
        } else {
            bVar.a(view);
        }
    }

    static void e(e0 e0Var) {
        WeakReference<RecyclerView> weakReference = e0Var.f1543b;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                View view = (View) viewParent;
                while (true) {
                    if (view == null) {
                        e0Var.f1543b = null;
                        return;
                    } else if (view != e0Var.a) {
                        viewParent = view.getParent();
                        if (!(viewParent instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private c.h.l.p getScrollingChildHelper() {
        if (this.t0 == null) {
            this.t0 = new c.h.l.p(this);
        }
        return this.t0;
    }

    private boolean k(int i2, int i3) {
        a(this.s0);
        int[] iArr = this.s0;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    static RecyclerView l(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView l2 = l(viewGroup.getChildAt(i2));
            if (l2 != null) {
                return l2;
            }
        }
        return null;
    }

    static e0 m(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).a;
    }

    private int n(View view) {
        int id;
        loop0:
        while (true) {
            id = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id;
    }

    private void y() {
        M();
        setScrollState(0);
    }

    private void z() {
        int i2 = this.B;
        this.B = 0;
        if (i2 != 0 && m()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            c.h.l.l0.b.a(obtain, i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    public View a(float f2, float f3) {
        for (int a2 = this.f1514f.a() - 1; a2 >= 0; a2--) {
            View c2 = this.f1514f.c(a2);
            float translationX = c2.getTranslationX();
            float translationY = c2.getTranslationY();
            if (f2 >= ((float) c2.getLeft()) + translationX && f2 <= ((float) c2.getRight()) + translationX && f3 >= ((float) c2.getTop()) + translationY && f3 <= ((float) c2.getBottom()) + translationY) {
                return c2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public e0 a(int i2, boolean z2) {
        int b2 = this.f1514f.b();
        e0 e0Var = null;
        for (int i3 = 0; i3 < b2; i3++) {
            e0 m2 = m(this.f1514f.d(i3));
            if (m2 != null && !m2.s()) {
                if (z2) {
                    if (m2.f1544c != i2) {
                        continue;
                    }
                } else if (m2.k() != i2) {
                    continue;
                }
                if (!this.f1514f.c(m2.a)) {
                    return m2;
                }
                e0Var = m2;
            }
        }
        return e0Var;
    }

    public e0 a(long j2) {
        h hVar = this.f1521m;
        e0 e0Var = null;
        if (hVar != null && hVar.d()) {
            int b2 = this.f1514f.b();
            for (int i2 = 0; i2 < b2; i2++) {
                e0 m2 = m(this.f1514f.d(i2));
                if (m2 != null && !m2.s() && m2.i() == j2) {
                    if (!this.f1514f.c(m2.a)) {
                        return m2;
                    }
                    e0Var = m2;
                }
            }
        }
        return e0Var;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int b2 = this.f1514f.b();
        for (int i2 = 0; i2 < b2; i2++) {
            e0 m2 = m(this.f1514f.d(i2));
            if (!m2.A()) {
                m2.a();
            }
        }
        this.f1511c.b();
    }

    @Override // c.h.l.m
    public void a(int i2) {
        getScrollingChildHelper().c(i2);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        if (i2 < 0) {
            f();
            if (this.K.isFinished()) {
                this.K.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            g();
            if (this.M.isFinished()) {
                this.M.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            h();
            if (this.L.isFinished()) {
                this.L.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            e();
            if (this.N.isFinished()) {
                this.N.onAbsorb(i3);
            }
        }
        if (i2 != 0 || i3 != 0) {
            c.h.l.b0.M(this);
        }
    }

    public final void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().a(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void a(int i2, int i3, Interpolator interpolator) {
        a(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    public void a(int i2, int i3, Interpolator interpolator, int i4) {
        a(i2, i3, interpolator, i4, false);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        p pVar = this.n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.z) {
            int i5 = 0;
            if (!pVar.a()) {
                i2 = 0;
            }
            if (!this.n.b()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (i4 == Integer.MIN_VALUE || i4 > 0) {
                    if (z2) {
                        if (i2 != 0) {
                            i5 = 1;
                        }
                        if (i3 != 0) {
                            i5 |= 2;
                        }
                        j(i5, 1);
                    }
                    this.g0.a(i2, i3, i4, interpolator);
                    return;
                }
                scrollBy(i2, i3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, Object obj) {
        int i4;
        int b2 = this.f1514f.b();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < b2; i6++) {
            View d2 = this.f1514f.d(i6);
            e0 m2 = m(d2);
            if (m2 != null && !m2.A() && (i4 = m2.f1544c) >= i2 && i4 < i5) {
                m2.a(2);
                m2.a(obj);
                ((q) d2.getLayoutParams()).f1583c = true;
            }
        }
        this.f1511c.c(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int b2 = this.f1514f.b();
        for (int i5 = 0; i5 < b2; i5++) {
            e0 m2 = m(this.f1514f.d(i5));
            if (m2 != null && !m2.A()) {
                int i6 = m2.f1544c;
                if (i6 >= i4) {
                    m2.a(-i3, z2);
                } else if (i6 >= i2) {
                    m2.a(i2 - 1, -i3, z2);
                }
                this.j0.f1529g = true;
            }
        }
        this.f1511c.a(i2, i3, z2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, int[] iArr) {
        w();
        q();
        c.h.h.c.a("RV Scroll");
        a(this.j0);
        int a2 = i2 != 0 ? this.n.a(i2, this.f1511c, this.j0) : 0;
        int b2 = i3 != 0 ? this.n.b(i3, this.f1511c, this.j0) : 0;
        c.h.h.c.a();
        u();
        r();
        c(false);
        if (iArr != null) {
            iArr[0] = a2;
            iArr[1] = b2;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + i());
        }
        Resources resources = getContext().getResources();
        new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(c.r.b.fastscroll_default_thickness), resources.getDimensionPixelSize(c.r.b.fastscroll_minimum_range), resources.getDimensionPixelOffset(c.r.b.fastscroll_margin));
    }

    /* access modifiers changed from: package-private */
    public void a(View view) {
        e0 m2 = m(view);
        i(view);
        h hVar = this.f1521m;
        if (!(hVar == null || m2 == null)) {
            hVar.b(m2);
        }
        List<r> list = this.E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.E.get(size).a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(b0 b0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.g0.f1538d;
            b0Var.p = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        b0Var.p = 0;
        b0Var.q = 0;
    }

    /* access modifiers changed from: package-private */
    public void a(e0 e0Var, m.c cVar) {
        e0Var.a(0, 8192);
        if (this.j0.f1531i && e0Var.v() && !e0Var.s() && !e0Var.A()) {
            this.f1515g.a(c(e0Var), e0Var);
        }
        this.f1515g.c(e0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    public void a(e0 e0Var, m.c cVar, m.c cVar2) {
        e0Var.a(false);
        if (this.O.a(e0Var, cVar, cVar2)) {
            s();
        }
    }

    public void a(o oVar) {
        a(oVar, -1);
    }

    public void a(o oVar, int i2) {
        p pVar = this.n;
        if (pVar != null) {
            pVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.q.add(oVar);
        } else {
            this.q.add(i2, oVar);
        }
        o();
        requestLayout();
    }

    public void a(t tVar) {
        this.r.add(tVar);
    }

    public void a(u uVar) {
        if (this.l0 == null) {
            this.l0 = new ArrayList();
        }
        this.l0.add(uVar);
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        if (n()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + i());
            }
            throw new IllegalStateException(str);
        } else if (this.I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + i()));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        this.H--;
        if (this.H < 1) {
            this.H = 0;
            if (z2) {
                z();
                d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        b();
        if (this.f1521m != null) {
            int[] iArr = this.w0;
            iArr[0] = 0;
            iArr[1] = 0;
            a(i2, i3, iArr);
            int[] iArr2 = this.w0;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i8 = i10;
            i6 = i9;
            i5 = i2 - i9;
            i7 = i3 - i10;
        } else {
            i8 = 0;
            i7 = 0;
            i6 = 0;
            i5 = 0;
        }
        if (!this.q.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.w0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        a(i6, i8, i5, i7, this.u0, i4, iArr3);
        int[] iArr4 = this.w0;
        int i11 = i5 - iArr4[0];
        int i12 = i7 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i13 = this.U;
        int[] iArr5 = this.u0;
        this.U = i13 - iArr5[0];
        this.V -= iArr5[1];
        int[] iArr6 = this.v0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !c.h.l.l.a(motionEvent, 8194)) {
                a(motionEvent.getX(), (float) i11, motionEvent.getY(), (float) i12);
            }
            b(i2, i3);
        }
        if (!(i6 == 0 && i8 == 0)) {
            d(i6, i8);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i6 == 0 && i8 == 0) ? false : true;
    }

    public boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2, i4);
    }

    /* access modifiers changed from: package-private */
    public boolean a(AccessibilityEvent accessibilityEvent) {
        if (!n()) {
            return false;
        }
        int a2 = accessibilityEvent != null ? c.h.l.l0.b.a(accessibilityEvent) : 0;
        if (a2 == 0) {
            a2 = 0;
        }
        this.B = a2 | this.B;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean a(e0 e0Var) {
        m mVar = this.O;
        return mVar == null || mVar.a(e0Var, e0Var.m());
    }

    /* access modifiers changed from: package-private */
    public boolean a(e0 e0Var, int i2) {
        if (n()) {
            e0Var.q = i2;
            this.x0.add(e0Var);
            return false;
        }
        c.h.l.b0.h(e0Var.a, i2);
        return true;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        p pVar = this.n;
        if (pVar == null || !pVar.a(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    /* access modifiers changed from: package-private */
    public int b(e0 e0Var) {
        if (e0Var.b(524) || !e0Var.p()) {
            return -1;
        }
        return this.f1513e.a(e0Var.f1544c);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!this.w || this.F) {
            c.h.h.c.a("RV FullInvalidate");
            c();
            c.h.h.c.a();
        } else if (this.f1513e.c()) {
            if (this.f1513e.c(4) && !this.f1513e.c(11)) {
                c.h.h.c.a("RV PartialInvalidate");
                w();
                q();
                this.f1513e.e();
                if (!this.y) {
                    if (E()) {
                        c();
                    } else {
                        this.f1513e.a();
                    }
                }
                c(true);
                r();
            } else if (this.f1513e.c()) {
                c.h.h.c.a("RV FullInvalidate");
                c();
            } else {
                return;
            }
            c.h.h.c.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        p pVar = this.n;
        if (pVar != null) {
            pVar.f(i2);
        }
        f(i2);
        u uVar = this.k0;
        if (uVar != null) {
            uVar.a(this, i2);
        }
        List<u> list = this.l0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.l0.get(size).a(this, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.K.onRelease();
            z2 = this.K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.M.onRelease();
            z2 |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.L.onRelease();
            z2 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.N.onRelease();
            z2 |= this.N.isFinished();
        }
        if (z2) {
            c.h.l.b0.M(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(View view) {
        e0 m2 = m(view);
        j(view);
        h hVar = this.f1521m;
        if (!(hVar == null || m2 == null)) {
            hVar.c(m2);
        }
        List<r> list = this.E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.E.get(size).b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(e0 e0Var, m.c cVar, m.c cVar2) {
        d(e0Var);
        e0Var.a(false);
        if (this.O.b(e0Var, cVar, cVar2)) {
            s();
        }
    }

    public void b(o oVar) {
        p pVar = this.n;
        if (pVar != null) {
            pVar.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.q.remove(oVar);
        if (this.q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        o();
        requestLayout();
    }

    public void b(t tVar) {
        this.r.remove(tVar);
        if (this.s == tVar) {
            this.s = null;
        }
    }

    public void b(u uVar) {
        List<u> list = this.l0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z2) {
        this.G = z2 | this.G;
        this.F = true;
        p();
    }

    /* access modifiers changed from: package-private */
    public long c(e0 e0Var) {
        return this.f1521m.d() ? e0Var.i() : (long) e0Var.f1544c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View c(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c(android.view.View):android.view.View");
    }

    public e0 c(int i2) {
        e0 e0Var = null;
        if (this.F) {
            return null;
        }
        int b2 = this.f1514f.b();
        for (int i3 = 0; i3 < b2; i3++) {
            e0 m2 = m(this.f1514f.d(i3));
            if (m2 != null && !m2.s() && b(m2) == i2) {
                if (!this.f1514f.c(m2.a)) {
                    return m2;
                }
                e0Var = m2;
            }
        }
        return e0Var;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.f1521m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.j0.f1532j = false;
            boolean z2 = this.z0 && !(this.A0 == getWidth() && this.B0 == getHeight());
            this.A0 = 0;
            this.B0 = 0;
            this.z0 = false;
            if (this.j0.f1527e == 1) {
                A();
            } else if (!this.f1513e.d() && !z2 && this.n.q() == getWidth() && this.n.h() == getHeight()) {
                this.n.e(this);
                C();
            }
            this.n.e(this);
            B();
            C();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(int i2, int i3) {
        setMeasuredDimension(p.a(i2, getPaddingLeft() + getPaddingRight(), c.h.l.b0.t(this)), p.a(i3, getPaddingTop() + getPaddingBottom(), c.h.l.b0.s(this)));
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z2) {
        if (this.x < 1) {
            this.x = 1;
        }
        if (!z2 && !this.z) {
            this.y = false;
        }
        if (this.x == 1) {
            if (z2 && this.y && !this.z && this.n != null && this.f1521m != null) {
                c();
            }
            if (!this.z) {
                this.y = false;
            }
        }
        this.x--;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.n.a((q) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        p pVar = this.n;
        if (pVar != null && pVar.a()) {
            return this.n.a(this.j0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        p pVar = this.n;
        if (pVar != null && pVar.a()) {
            return this.n.b(this.j0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        p pVar = this.n;
        if (pVar != null && pVar.a()) {
            return this.n.c(this.j0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        p pVar = this.n;
        if (pVar != null && pVar.b()) {
            return this.n.d(this.j0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        p pVar = this.n;
        if (pVar != null && pVar.b()) {
            return this.n.e(this.j0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        p pVar = this.n;
        if (pVar != null && pVar.b()) {
            return this.n.f(this.j0);
        }
        return 0;
    }

    public e0 d(View view) {
        View c2 = c(view);
        if (c2 == null) {
            return null;
        }
        return g(c2);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        int i2;
        for (int size = this.x0.size() - 1; size >= 0; size--) {
            e0 e0Var = this.x0.get(size);
            if (e0Var.a.getParent() == this && !e0Var.A() && (i2 = e0Var.q) != -1) {
                c.h.l.b0.h(e0Var.a, i2);
                e0Var.q = -1;
            }
        }
        this.x0.clear();
    }

    public void d(int i2) {
        int a2 = this.f1514f.a();
        for (int i3 = 0; i3 < a2; i3++) {
            this.f1514f.c(i3).offsetLeftAndRight(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(int i2, int i3) {
        this.I++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        h(i2, i3);
        u uVar = this.k0;
        if (uVar != null) {
            uVar.a(this, i2, i3);
        }
        List<u> list = this.l0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.l0.get(size).a(this, i2, i3);
            }
        }
        this.I--;
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().a(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().a(i2, i3, i4, i5, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        boolean z3;
        int i2;
        float f2;
        super.draw(canvas);
        int size = this.q.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            this.q.get(i3).b(canvas, this, this.j0);
        }
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1516h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.K;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1516h) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.L;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1516h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.M;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.N;
        if (edgeEffect7 == null || edgeEffect7.isFinished()) {
            z3 = z2;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1516h) {
                f2 = (float) ((-getWidth()) + getPaddingRight());
                i2 = (-getHeight()) + getPaddingBottom();
            } else {
                f2 = (float) (-getWidth());
                i2 = -getHeight();
            }
            canvas.translate(f2, (float) i2);
            EdgeEffect edgeEffect8 = this.N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z3 = z4 | z2;
            canvas.restoreToCount(save4);
        }
        if (!z3 && this.O != null && this.q.size() > 0 && this.O.g()) {
            z3 = true;
        }
        if (z3) {
            c.h.l.b0.M(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public int e(View view) {
        e0 m2 = m(view);
        if (m2 != null) {
            return m2.f();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        int i2;
        int i3;
        EdgeEffect edgeEffect;
        if (this.N == null) {
            this.N = this.J.a(this, 3);
            if (this.f1516h) {
                edgeEffect = this.N;
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                edgeEffect = this.N;
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            edgeEffect.setSize(i3, i2);
        }
    }

    public void e(int i2) {
        int a2 = this.f1514f.a();
        for (int i3 = 0; i3 < a2; i3++) {
            this.f1514f.c(i3).offsetTopAndBottom(i2);
        }
    }

    public boolean e(int i2, int i3) {
        p pVar = this.n;
        int i4 = 0;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.z) {
            return false;
        } else {
            boolean a2 = pVar.a();
            boolean b2 = this.n.b();
            if (!a2 || Math.abs(i2) < this.b0) {
                i2 = 0;
            }
            if (!b2 || Math.abs(i3) < this.b0) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            float f2 = (float) i2;
            float f3 = (float) i3;
            if (!dispatchNestedPreFling(f2, f3)) {
                boolean z2 = a2 || b2;
                dispatchNestedFling(f2, f3, z2);
                s sVar = this.a0;
                if (sVar != null && sVar.a(i2, i3)) {
                    return true;
                }
                if (z2) {
                    if (a2) {
                        i4 = 1;
                    }
                    if (b2) {
                        i4 |= 2;
                    }
                    j(i4, 1);
                    int i5 = this.c0;
                    int max = Math.max(-i5, Math.min(i2, i5));
                    int i6 = this.c0;
                    this.g0.a(max, Math.max(-i6, Math.min(i3, i6)));
                    return true;
                }
            }
            return false;
        }
    }

    @Deprecated
    public int f(View view) {
        return e(view);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        int i2;
        int i3;
        EdgeEffect edgeEffect;
        if (this.K == null) {
            this.K = this.J.a(this, 0);
            if (this.f1516h) {
                edgeEffect = this.K;
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                edgeEffect = this.K;
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            edgeEffect.setSize(i3, i2);
        }
    }

    public void f(int i2) {
    }

    /* access modifiers changed from: package-private */
    public void f(int i2, int i3) {
        int b2 = this.f1514f.b();
        for (int i4 = 0; i4 < b2; i4++) {
            e0 m2 = m(this.f1514f.d(i4));
            if (m2 != null && !m2.A() && m2.f1544c >= i2) {
                m2.a(i3, false);
                this.j0.f1529g = true;
            }
        }
        this.f1511c.a(i2, i3);
        requestLayout();
    }

    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View d2 = this.n.d(view, i2);
        if (d2 != null) {
            return d2;
        }
        boolean z3 = this.f1521m != null && this.n != null && !n() && !this.z;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i2 == 2 || i2 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i2);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                b();
                if (c(view) == null) {
                    return null;
                }
                w();
                view2 = this.n.a(view, i2, this.f1511c, this.j0);
                c(false);
            }
        } else {
            if (this.n.b()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = instance.findNextFocus(this, view, i3) == null;
                if (I0) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.n.a()) {
                int i4 = (this.n.j() == 1) ^ (i2 == 2) ? 66 : 17;
                z2 = instance.findNextFocus(this, view, i4) == null;
                if (I0) {
                    i2 = i4;
                }
            }
            if (z2) {
                b();
                if (c(view) == null) {
                    return null;
                }
                w();
                this.n.a(view, i2, this.f1511c, this.j0);
                c(false);
            }
            view2 = instance.findNextFocus(this, view, i2);
        }
        if (view2 == null || view2.hasFocusable()) {
            return a(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        a(view2, (View) null);
        return view;
    }

    public e0 g(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* access modifiers changed from: package-private */
    public void g() {
        int i2;
        int i3;
        EdgeEffect edgeEffect;
        if (this.M == null) {
            this.M = this.J.a(this, 2);
            if (this.f1516h) {
                edgeEffect = this.M;
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                edgeEffect = this.M;
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            edgeEffect.setSize(i3, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void g(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int b2 = this.f1514f.b();
        if (i2 < i3) {
            i6 = i2;
            i5 = i3;
            i4 = -1;
        } else {
            i5 = i2;
            i6 = i3;
            i4 = 1;
        }
        for (int i8 = 0; i8 < b2; i8++) {
            e0 m2 = m(this.f1514f.d(i8));
            if (m2 != null && (i7 = m2.f1544c) >= i6 && i7 <= i5) {
                if (i7 == i2) {
                    m2.a(i3 - i2, false);
                } else {
                    m2.a(i4, false);
                }
                this.j0.f1529g = true;
            }
        }
        this.f1511c.b(i2, i3);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.n;
        if (pVar != null) {
            return pVar.c();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + i());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.n;
        if (pVar != null) {
            return pVar.a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + i());
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.n;
        if (pVar != null) {
            return pVar.a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + i());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f1521m;
    }

    public int getBaseline() {
        p pVar = this.n;
        return pVar != null ? pVar.d() : super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        k kVar = this.r0;
        return kVar == null ? super.getChildDrawingOrder(i2, i3) : kVar.a(i2, i3);
    }

    public boolean getClipToPadding() {
        return this.f1516h;
    }

    public j getCompatAccessibilityDelegate() {
        return this.q0;
    }

    public l getEdgeEffectFactory() {
        return this.J;
    }

    public m getItemAnimator() {
        return this.O;
    }

    public int getItemDecorationCount() {
        return this.q.size();
    }

    public p getLayoutManager() {
        return this.n;
    }

    public int getMaxFlingVelocity() {
        return this.c0;
    }

    public int getMinFlingVelocity() {
        return this.b0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (H0) {
            return System.nanoTime();
        }
        return 0;
    }

    public s getOnFlingListener() {
        return this.a0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f0;
    }

    public v getRecycledViewPool() {
        return this.f1511c.d();
    }

    public int getScrollState() {
        return this.P;
    }

    /* access modifiers changed from: package-private */
    public Rect h(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f1583c) {
            return qVar.f1582b;
        }
        if (this.j0.d() && (qVar.b() || qVar.d())) {
            return qVar.f1582b;
        }
        Rect rect = qVar.f1582b;
        rect.set(0, 0, 0, 0);
        int size = this.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1518j.set(0, 0, 0, 0);
            this.q.get(i2).a(this.f1518j, view, this, this.j0);
            int i3 = rect.left;
            Rect rect2 = this.f1518j;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f1583c = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        int i2;
        int i3;
        EdgeEffect edgeEffect;
        if (this.L == null) {
            this.L = this.J.a(this, 1);
            if (this.f1516h) {
                edgeEffect = this.L;
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                edgeEffect = this.L;
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            edgeEffect.setSize(i3, i2);
        }
    }

    public void h(int i2, int i3) {
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().a();
    }

    /* access modifiers changed from: package-private */
    public String i() {
        return " " + super.toString() + ", adapter:" + this.f1521m + ", layout:" + this.n + ", context:" + getContext();
    }

    public void i(int i2, int i3) {
        a(i2, i3, (Interpolator) null);
    }

    public void i(View view) {
    }

    public boolean isAttachedToWindow() {
        return this.t;
    }

    public final boolean isLayoutSuppressed() {
        return this.z;
    }

    @Override // c.h.l.o
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().b();
    }

    public void j(View view) {
    }

    public boolean j() {
        return !this.w || this.F || this.f1513e.c();
    }

    public boolean j(int i2, int i3) {
        return getScrollingChildHelper().a(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.f1513e = new a(new f());
    }

    /* access modifiers changed from: package-private */
    public boolean k(View view) {
        w();
        boolean e2 = this.f1514f.e(view);
        if (e2) {
            e0 m2 = m(view);
            this.f1511c.c(m2);
            this.f1511c.b(m2);
        }
        c(!e2);
        return e2;
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.N = null;
        this.L = null;
        this.M = null;
        this.K = null;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        AccessibilityManager accessibilityManager = this.D;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean n() {
        return this.H > 0;
    }

    /* access modifiers changed from: package-private */
    public void o() {
        int b2 = this.f1514f.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ((q) this.f1514f.d(i2).getLayoutParams()).f1583c = true;
        }
        this.f1511c.g();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 >= 30.0f) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        e eVar;
        super.onDetachedFromWindow();
        m mVar = this.O;
        if (mVar != null) {
            mVar.b();
        }
        x();
        this.t = false;
        p pVar = this.n;
        if (pVar != null) {
            pVar.a(this, this.f1511c);
        }
        this.x0.clear();
        removeCallbacks(this.y0);
        this.f1515g.b();
        if (H0 && (eVar = this.h0) != null) {
            eVar.b(this);
            this.h0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.q.get(i2).a(canvas, this, this.j0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.n != null && !this.z && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.n.b() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.n.a()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        b((int) (f2 * this.d0), (int) (f3 * this.e0), motionEvent, 1);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.n.b()) {
                        f3 = -axisValue;
                    } else if (this.n.a()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        b((int) (f2 * this.d0), (int) (f3 * this.e0), motionEvent, 1);
                    }
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            b((int) (f2 * this.d0), (int) (f3 * this.e0), motionEvent, 1);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.z) {
            return false;
        }
        this.s = null;
        if (b(motionEvent)) {
            y();
            return true;
        }
        p pVar = this.n;
        if (pVar == null) {
            return false;
        }
        boolean a2 = pVar.a();
        boolean b2 = this.n.b();
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.A) {
                this.A = false;
            }
            this.Q = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.U = x2;
            this.S = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.V = y2;
            this.T = y2;
            if (this.P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                a(1);
            }
            int[] iArr = this.v0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = a2 ? 1 : 0;
            if (b2) {
                i2 |= 2;
            }
            j(i2, 0);
        } else if (actionMasked == 1) {
            this.R.clear();
            a(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.Q);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.P != 1) {
                int i3 = x3 - this.S;
                int i4 = y3 - this.T;
                if (!a2 || Math.abs(i3) <= this.W) {
                    z2 = false;
                } else {
                    this.U = x3;
                    z2 = true;
                }
                if (b2 && Math.abs(i4) > this.W) {
                    this.V = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            y();
        } else if (actionMasked == 5) {
            this.Q = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.U = x4;
            this.S = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.V = y4;
            this.T = y4;
        } else if (actionMasked == 6) {
            c(motionEvent);
        }
        return this.P == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        c.h.h.c.a("RV OnLayout");
        c();
        c.h.h.c.a();
        this.w = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        p pVar = this.n;
        if (pVar == null) {
            c(i2, i3);
            return;
        }
        boolean z2 = false;
        if (pVar.u()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.n.a(this.f1511c, this.j0, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.z0 = z2;
            if (!this.z0 && this.f1521m != null) {
                if (this.j0.f1527e == 1) {
                    A();
                }
                this.n.b(i2, i3);
                this.j0.f1532j = true;
                B();
                this.n.d(i2, i3);
                if (this.n.A()) {
                    this.n.b(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.j0.f1532j = true;
                    B();
                    this.n.d(i2, i3);
                }
                this.A0 = getMeasuredWidth();
                this.B0 = getMeasuredHeight();
            }
        } else if (this.u) {
            this.n.a(this.f1511c, this.j0, i2, i3);
        } else {
            if (this.C) {
                w();
                q();
                I();
                r();
                b0 b0Var = this.j0;
                if (b0Var.f1534l) {
                    b0Var.f1530h = true;
                } else {
                    this.f1513e.b();
                    this.j0.f1530h = false;
                }
                this.C = false;
                c(false);
            } else if (this.j0.f1534l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            h hVar = this.f1521m;
            if (hVar != null) {
                this.j0.f1528f = hVar.b();
            } else {
                this.j0.f1528f = 0;
            }
            w();
            this.n.a(this.f1511c, this.j0, i2, i3);
            c(false);
            this.j0.f1530h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (n()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.f1512d = (z) parcelable;
        super.onRestoreInstanceState(this.f1512d.a());
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.f1512d;
        if (zVar2 != null) {
            zVar.a(zVar2);
        } else {
            p pVar = this.n;
            zVar.f1597d = pVar != null ? pVar.x() : null;
        }
        return zVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            l();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 485
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void p() {
        int b2 = this.f1514f.b();
        for (int i2 = 0; i2 < b2; i2++) {
            e0 m2 = m(this.f1514f.d(i2));
            if (m2 != null && !m2.A()) {
                m2.a(6);
            }
        }
        o();
        this.f1511c.h();
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.H++;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        a(true);
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z2) {
        e0 m2 = m(view);
        if (m2 != null) {
            if (m2.u()) {
                m2.d();
            } else if (!m2.A()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m2 + i());
            }
        }
        view.clearAnimation();
        b(view);
        super.removeDetachedView(view, z2);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.n.a(this, this.j0, view, view2) && view2 != null) {
            a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.n.a(this, view, rect, z2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.r.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.r.get(i2).a(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.x != 0 || this.z) {
            this.y = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (!this.p0 && this.t) {
            c.h.l.b0.a(this, this.y0);
            this.p0 = true;
        }
    }

    public void scrollBy(int i2, int i3) {
        p pVar = this.n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.z) {
            boolean a2 = pVar.a();
            boolean b2 = this.n.b();
            if (a2 || b2) {
                if (!a2) {
                    i2 = 0;
                }
                if (!b2) {
                    i3 = 0;
                }
                a(i2, i3, (MotionEvent) null, 0);
            }
        }
    }

    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!a(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(j jVar) {
        this.q0 = jVar;
        c.h.l.b0.a(this, this.q0);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        a(hVar, false, true);
        b(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar != this.r0) {
            this.r0 = kVar;
            setChildrenDrawingOrderEnabled(this.r0 != null);
        }
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1516h) {
            l();
        }
        this.f1516h = z2;
        super.setClipToPadding(z2);
        if (this.w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        c.h.k.h.a(lVar);
        this.J = lVar;
        l();
    }

    public void setHasFixedSize(boolean z2) {
        this.u = z2;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.O;
        if (mVar2 != null) {
            mVar2.b();
            this.O.a((m.b) null);
        }
        this.O = mVar;
        m mVar3 = this.O;
        if (mVar3 != null) {
            mVar3.a(this.o0);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.f1511c.f(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(p pVar) {
        if (pVar != this.n) {
            x();
            if (this.n != null) {
                m mVar = this.O;
                if (mVar != null) {
                    mVar.b();
                }
                this.n.b(this.f1511c);
                this.n.c(this.f1511c);
                this.f1511c.a();
                if (this.t) {
                    this.n.a(this, this.f1511c);
                }
                this.n.f((RecyclerView) null);
                this.n = null;
            } else {
                this.f1511c.a();
            }
            this.f1514f.c();
            this.n = pVar;
            if (pVar != null) {
                if (pVar.f1567b == null) {
                    this.n.f(this);
                    if (this.t) {
                        this.n.a(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f1567b.i());
                }
            }
            this.f1511c.j();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().a(z2);
    }

    public void setOnFlingListener(s sVar) {
        this.a0 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.k0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f0 = z2;
    }

    public void setRecycledViewPool(v vVar) {
        this.f1511c.a(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.o = xVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i2) {
        if (i2 != this.P) {
            this.P = i2;
            if (i2 != 2) {
                O();
            }
            b(i2);
        }
    }

    public void setScrollingTouchSlop(int i2) {
        int i3;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                i3 = viewConfiguration.getScaledPagingTouchSlop();
                this.W = i3;
            }
        }
        i3 = viewConfiguration.getScaledTouchSlop();
        this.W = i3;
    }

    public void setViewCacheExtension(c0 c0Var) {
        this.f1511c.a(c0Var);
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().b(i2);
    }

    @Override // c.h.l.o
    public void stopNestedScroll() {
        getScrollingChildHelper().c();
    }

    public final void suppressLayout(boolean z2) {
        if (z2 != this.z) {
            a("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.z = false;
                if (!(!this.y || this.n == null || this.f1521m == null)) {
                    requestLayout();
                }
                this.y = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.z = true;
            this.A = true;
            x();
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        m mVar = this.O;
        if (mVar != null) {
            mVar.b();
        }
        p pVar = this.n;
        if (pVar != null) {
            pVar.b(this.f1511c);
            this.n.c(this.f1511c);
        }
        this.f1511c.a();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        e0 e0Var;
        int a2 = this.f1514f.a();
        for (int i2 = 0; i2 < a2; i2++) {
            View c2 = this.f1514f.c(i2);
            e0 g2 = g(c2);
            if (!(g2 == null || (e0Var = g2.f1550i) == null)) {
                View view = e0Var.a;
                int left = c2.getLeft();
                int top = c2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v() {
        int b2 = this.f1514f.b();
        for (int i2 = 0; i2 < b2; i2++) {
            e0 m2 = m(this.f1514f.d(i2));
            if (!m2.A()) {
                m2.y();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.x++;
        if (this.x == 1 && !this.z) {
            this.y = false;
        }
    }

    public void x() {
        setScrollState(0);
        O();
    }
}
