package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import c.h.l.b0;
import c.h.l.k0;
import c.h.l.l0.d;
import c.h.l.l0.g;
import c.j.b.b;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup implements c.j.b.a {
    private static final int[] M = {16843828};
    static final int[] N = {16842931};
    static final boolean O = (Build.VERSION.SDK_INT >= 19);
    private static final boolean P = (Build.VERSION.SDK_INT >= 21);
    private static boolean Q;
    private CharSequence A;
    private CharSequence B;
    private Object C;
    private boolean D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private final ArrayList<View> I;
    private Rect J;
    private Matrix K;
    private final c.h.l.l0.g L;

    /* renamed from: b  reason: collision with root package name */
    private final d f1134b;

    /* renamed from: c  reason: collision with root package name */
    private float f1135c;

    /* renamed from: d  reason: collision with root package name */
    private int f1136d;

    /* renamed from: e  reason: collision with root package name */
    private int f1137e;

    /* renamed from: f  reason: collision with root package name */
    private float f1138f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f1139g;

    /* renamed from: h  reason: collision with root package name */
    private final c.j.b.b f1140h;

    /* renamed from: i  reason: collision with root package name */
    private final c.j.b.b f1141i;

    /* renamed from: j  reason: collision with root package name */
    private final h f1142j;

    /* renamed from: k  reason: collision with root package name */
    private final h f1143k;

    /* renamed from: l  reason: collision with root package name */
    private int f1144l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1145m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private e t;
    private List<e> u;
    private float v;
    private float w;
    private Drawable x;
    private Drawable y;
    private Drawable z;

    class a implements c.h.l.l0.g {
        a() {
        }

        @Override // c.h.l.l0.g
        public boolean a(View view, g.a aVar) {
            if (!DrawerLayout.this.h(view) || DrawerLayout.this.d(view) == 2) {
                return false;
            }
            DrawerLayout.this.a(view);
            return true;
        }
    }

    class b implements View.OnApplyWindowInsetsListener {
        b(DrawerLayout drawerLayout) {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).a(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class c extends c.h.l.c {

        /* renamed from: d  reason: collision with root package name */
        private final Rect f1146d = new Rect();

        c() {
        }

        private void a(c.h.l.l0.d dVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (DrawerLayout.m(childAt)) {
                    dVar.a(childAt);
                }
            }
        }

        private void a(c.h.l.l0.d dVar, c.h.l.l0.d dVar2) {
            Rect rect = this.f1146d;
            dVar2.b(rect);
            dVar.c(rect);
            dVar.l(dVar2.t());
            dVar.c(dVar2.f());
            dVar.a(dVar2.c());
            dVar.b(dVar2.d());
            dVar.e(dVar2.m());
            dVar.g(dVar2.o());
            dVar.a(dVar2.i());
            dVar.k(dVar2.s());
            dVar.a(dVar2.b());
        }

        @Override // c.h.l.c
        public void a(View view, c.h.l.l0.d dVar) {
            if (DrawerLayout.O) {
                super.a(view, dVar);
            } else {
                c.h.l.l0.d a = c.h.l.l0.d.a(dVar);
                super.a(view, a);
                dVar.c(view);
                ViewParent x = b0.x(view);
                if (x instanceof View) {
                    dVar.b((View) x);
                }
                a(dVar, a);
                a.u();
                a(dVar, (ViewGroup) view);
            }
            dVar.a("androidx.drawerlayout.widget.DrawerLayout");
            dVar.f(false);
            dVar.g(false);
            dVar.b(d.a.f2442e);
            dVar.b(d.a.f2443f);
        }

        @Override // c.h.l.c
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence d2;
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View d3 = DrawerLayout.this.d();
            if (d3 == null || (d2 = DrawerLayout.this.d(DrawerLayout.this.e(d3))) == null) {
                return true;
            }
            text.add(d2);
            return true;
        }

        @Override // c.h.l.c
        public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.O || DrawerLayout.m(view)) {
                return super.a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        @Override // c.h.l.c
        public void b(View view, AccessibilityEvent accessibilityEvent) {
            super.b(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }
    }

    static final class d extends c.h.l.c {
        d() {
        }

        @Override // c.h.l.c
        public void a(View view, c.h.l.l0.d dVar) {
            super.a(view, dVar);
            if (!DrawerLayout.m(view)) {
                dVar.b((View) null);
            }
        }
    }

    public interface e {
        void a(int i2);

        void a(View view);

        void a(View view, float f2);

        void b(View view);
    }

    public static class f extends ViewGroup.MarginLayoutParams {
        public int a = 0;

        /* renamed from: b  reason: collision with root package name */
        float f1148b;

        /* renamed from: c  reason: collision with root package name */
        boolean f1149c;

        /* renamed from: d  reason: collision with root package name */
        int f1150d;

        public f(int i2, int i3) {
            super(i2, i3);
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.N);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.a = fVar.a;
        }
    }

    /* access modifiers changed from: protected */
    public static class g extends c.j.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        int f1151d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f1152e;

        /* renamed from: f  reason: collision with root package name */
        int f1153f;

        /* renamed from: g  reason: collision with root package name */
        int f1154g;

        /* renamed from: h  reason: collision with root package name */
        int f1155h;

        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1151d = parcel.readInt();
            this.f1152e = parcel.readInt();
            this.f1153f = parcel.readInt();
            this.f1154g = parcel.readInt();
            this.f1155h = parcel.readInt();
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // c.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1151d);
            parcel.writeInt(this.f1152e);
            parcel.writeInt(this.f1153f);
            parcel.writeInt(this.f1154g);
            parcel.writeInt(this.f1155h);
        }
    }

    /* access modifiers changed from: private */
    public class h extends b.c {
        private final int a;

        /* renamed from: b  reason: collision with root package name */
        private c.j.b.b f1156b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f1157c = new a();

        class a implements Runnable {
            a() {
            }

            public void run() {
                h.this.a();
            }
        }

        h(int i2) {
            this.a = i2;
        }

        private void c() {
            int i2 = 3;
            if (this.a == 3) {
                i2 = 5;
            }
            View b2 = DrawerLayout.this.b(i2);
            if (b2 != null) {
                DrawerLayout.this.a(b2);
            }
        }

        @Override // c.j.b.b.c
        public int a(View view) {
            if (DrawerLayout.this.i(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // c.j.b.b.c
        public int a(View view, int i2, int i3) {
            int width;
            int width2;
            if (DrawerLayout.this.a(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i2, width));
        }

        /* access modifiers changed from: package-private */
        public void a() {
            View view;
            int i2;
            int d2 = this.f1156b.d();
            int i3 = 0;
            boolean z = this.a == 3;
            if (z) {
                view = DrawerLayout.this.b(3);
                if (view != null) {
                    i3 = -view.getWidth();
                }
                i2 = i3 + d2;
            } else {
                view = DrawerLayout.this.b(5);
                i2 = DrawerLayout.this.getWidth() - d2;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i2) || (!z && view.getLeft() > i2)) && DrawerLayout.this.d(view) == 0) {
                this.f1156b.b(view, i2, view.getTop());
                ((f) view.getLayoutParams()).f1149c = true;
                DrawerLayout.this.invalidate();
                c();
                DrawerLayout.this.a();
            }
        }

        @Override // c.j.b.b.c
        public void a(int i2, int i3) {
            DrawerLayout drawerLayout;
            int i4;
            if ((i2 & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i4 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i4 = 5;
            }
            View b2 = drawerLayout.b(i4);
            if (b2 != null && DrawerLayout.this.d(b2) == 0) {
                this.f1156b.a(b2, i3);
            }
        }

        @Override // c.j.b.b.c
        public void a(View view, float f2, float f3) {
            int i2;
            float f4 = DrawerLayout.this.f(view);
            int width = view.getWidth();
            if (DrawerLayout.this.a(view, 3)) {
                int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                i2 = (i3 > 0 || (i3 == 0 && f4 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f2 < 0.0f || (f2 == 0.0f && f4 > 0.5f)) {
                    width2 -= width;
                }
                i2 = width2;
            }
            this.f1156b.d(i2, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // c.j.b.b.c
        public void a(View view, int i2) {
            ((f) view.getLayoutParams()).f1149c = false;
            c();
        }

        @Override // c.j.b.b.c
        public void a(View view, int i2, int i3, int i4, int i5) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.a(view, 3) ? (float) (i2 + width) : (float) (DrawerLayout.this.getWidth() - i2)) / ((float) width);
            DrawerLayout.this.c(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        public void a(c.j.b.b bVar) {
            this.f1156b = bVar;
        }

        @Override // c.j.b.b.c
        public int b(View view, int i2, int i3) {
            return view.getTop();
        }

        public void b() {
            DrawerLayout.this.removeCallbacks(this.f1157c);
        }

        @Override // c.j.b.b.c
        public void b(int i2, int i3) {
            DrawerLayout.this.postDelayed(this.f1157c, 160);
        }

        @Override // c.j.b.b.c
        public boolean b(int i2) {
            return false;
        }

        @Override // c.j.b.b.c
        public boolean b(View view, int i2) {
            return DrawerLayout.this.i(view) && DrawerLayout.this.a(view, this.a) && DrawerLayout.this.d(view) == 0;
        }

        @Override // c.j.b.b.c
        public void c(int i2) {
            DrawerLayout.this.a(i2, this.f1156b.b());
        }
    }

    static {
        boolean z2 = true;
        if (Build.VERSION.SDK_INT < 29) {
            z2 = false;
        }
        Q = z2;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.k.a.drawerLayoutStyle);
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1134b = new d();
        this.f1137e = -1728053248;
        this.f1139g = new Paint();
        this.n = true;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.r = 3;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.L = new a();
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.f1136d = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        this.f1142j = new h(3);
        this.f1143k = new h(5);
        this.f1140h = c.j.b.b.a(this, 1.0f, this.f1142j);
        this.f1140h.e(1);
        this.f1140h.a(f3);
        this.f1142j.a(this.f1140h);
        this.f1141i = c.j.b.b.a(this, 1.0f, this.f1143k);
        this.f1141i.e(2);
        this.f1141i.a(f3);
        this.f1143k.a(this.f1141i);
        setFocusableInTouchMode(true);
        b0.h(this, 1);
        b0.a(this, new c());
        setMotionEventSplittingEnabled(false);
        if (b0.o(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new b(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(M);
                try {
                    this.x = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.x = null;
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, c.k.c.DrawerLayout, i2, 0);
        try {
            this.f1135c = obtainStyledAttributes2.hasValue(c.k.c.DrawerLayout_elevation) ? obtainStyledAttributes2.getDimension(c.k.c.DrawerLayout_elevation, 0.0f) : getResources().getDimension(c.k.b.def_drawer_elevation);
            obtainStyledAttributes2.recycle();
            this.I = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    private void a(Drawable drawable, int i2) {
        if (drawable != null && androidx.core.graphics.drawable.a.f(drawable)) {
            androidx.core.graphics.drawable.a.a(drawable, i2);
        }
    }

    private boolean a(float f2, float f3, View view) {
        if (this.J == null) {
            this.J = new Rect();
        }
        view.getHitRect(this.J);
        return this.J.contains((int) f2, (int) f3);
    }

    private boolean a(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent b2 = b(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(b2);
            b2.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent b(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.K == null) {
                this.K = new Matrix();
            }
            matrix.invert(this.K);
            obtain.transform(this.K);
        }
        return obtain;
    }

    private void c(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            b0.h(childAt, ((z2 || i(childAt)) && (!z2 || childAt != view)) ? 4 : 1);
        }
    }

    private boolean e() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((f) getChildAt(i2).getLayoutParams()).f1149c) {
                return true;
            }
        }
        return false;
    }

    private boolean f() {
        return d() != null;
    }

    private Drawable g() {
        int r2 = b0.r(this);
        if (r2 == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                a(drawable, r2);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.F;
            if (drawable2 != null) {
                a(drawable2, r2);
                return this.F;
            }
        }
        return this.G;
    }

    private Drawable h() {
        int r2 = b0.r(this);
        if (r2 == 0) {
            Drawable drawable = this.F;
            if (drawable != null) {
                a(drawable, r2);
                return this.F;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                a(drawable2, r2);
                return this.E;
            }
        }
        return this.H;
    }

    static String h(int i2) {
        return (i2 & 3) == 3 ? "LEFT" : (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    private void i() {
        if (!P) {
            this.y = g();
            this.z = h();
        }
    }

    private static boolean l(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    static boolean m(View view) {
        return (b0.p(view) == 4 || b0.p(view) == 2) ? false : true;
    }

    private void n(View view) {
        b0.f(view, d.a.f2446i.a());
        if (h(view) && d(view) != 2) {
            b0.a(view, d.a.f2446i, null, this.L);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.s) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.s = true;
        }
    }

    public void a(int i2) {
        a(i2, true);
    }

    public void a(int i2, int i3) {
        View b2;
        int a2 = c.h.l.g.a(i3, b0.r(this));
        if (i3 == 3) {
            this.o = i2;
        } else if (i3 == 5) {
            this.p = i2;
        } else if (i3 == 8388611) {
            this.q = i2;
        } else if (i3 == 8388613) {
            this.r = i2;
        }
        if (i2 != 0) {
            (a2 == 3 ? this.f1140h : this.f1141i).a();
        }
        if (i2 == 1) {
            View b3 = b(a2);
            if (b3 != null) {
                a(b3);
            }
        } else if (i2 == 2 && (b2 = b(a2)) != null) {
            k(b2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, View view) {
        int f2 = this.f1140h.f();
        int f3 = this.f1141i.f();
        int i3 = 2;
        if (f2 == 1 || f3 == 1) {
            i3 = 1;
        } else if (!(f2 == 2 || f3 == 2)) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f4 = ((f) view.getLayoutParams()).f1148b;
            if (f4 == 0.0f) {
                b(view);
            } else if (f4 == 1.0f) {
                c(view);
            }
        }
        if (i3 != this.f1144l) {
            this.f1144l = i3;
            List<e> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.u.get(size).a(i3);
                }
            }
        }
    }

    public void a(int i2, boolean z2) {
        View b2 = b(i2);
        if (b2 != null) {
            a(b2, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + h(i2));
    }

    public void a(View view) {
        a(view, true);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, float f2) {
        List<e> list = this.u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.u.get(size).a(view, f2);
            }
        }
    }

    public void a(View view, boolean z2) {
        c.j.b.b bVar;
        int i2;
        if (i(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.n) {
                fVar.f1148b = 0.0f;
                fVar.f1150d = 0;
            } else if (z2) {
                fVar.f1150d |= 4;
                if (a(view, 3)) {
                    bVar = this.f1140h;
                    i2 = -view.getWidth();
                } else {
                    bVar = this.f1141i;
                    i2 = getWidth();
                }
                bVar.b(view, i2, view.getTop());
            } else {
                b(view, 0.0f);
                a(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void a(e eVar) {
        if (eVar != null) {
            if (this.u == null) {
                this.u = new ArrayList();
            }
            this.u.add(eVar);
        }
    }

    public void a(Object obj, boolean z2) {
        this.C = obj;
        this.D = z2;
        setWillNotDraw(!z2 && getBackground() == null);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f fVar = (f) childAt.getLayoutParams();
            if (i(childAt) && (!z2 || fVar.f1149c)) {
                z3 |= a(childAt, 3) ? this.f1140h.b(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1141i.b(childAt, getWidth(), childAt.getTop());
                fVar.f1149c = false;
            }
        }
        this.f1142j.b();
        this.f1143k.b();
        if (z3) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(View view, int i2) {
        return (e(view) & i2) == i2;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z2 = false;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!i(childAt)) {
                    this.I.add(childAt);
                } else if (h(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z2 = true;
                }
            }
            if (!z2) {
                int size = this.I.size();
                for (int i5 = 0; i5 < size; i5++) {
                    View view = this.I.get(i5);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i2, i3);
                    }
                }
            }
            this.I.clear();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        b0.h(view, (c() != null || i(view)) ? 4 : 1);
        if (!O) {
            b0.a(view, this.f1134b);
        }
    }

    /* access modifiers changed from: package-private */
    public View b(int i2) {
        int a2 = c.h.l.g.a(i2, b0.r(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((e(childAt) & 7) == a2) {
                return childAt;
            }
        }
        return null;
    }

    public void b() {
        a(false);
    }

    public void b(int i2, boolean z2) {
        View b2 = b(i2);
        if (b2 != null) {
            b(b2, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + h(i2));
    }

    /* access modifiers changed from: package-private */
    public void b(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f1150d & 1) == 1) {
            fVar.f1150d = 0;
            List<e> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.u.get(size).b(view);
                }
            }
            c(view, false);
            n(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(View view, float f2) {
        float f3 = f(view);
        float width = (float) view.getWidth();
        int i2 = ((int) (width * f2)) - ((int) (f3 * width));
        if (!a(view, 3)) {
            i2 = -i2;
        }
        view.offsetLeftAndRight(i2);
        c(view, f2);
    }

    public void b(View view, boolean z2) {
        if (i(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.n) {
                fVar.f1148b = 1.0f;
                fVar.f1150d = 1;
                c(view, true);
                n(view);
            } else if (z2) {
                fVar.f1150d |= 2;
                if (a(view, 3)) {
                    this.f1140h.b(view, 0, view.getTop());
                } else {
                    this.f1141i.b(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                b(view, 1.0f);
                a(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void b(e eVar) {
        List<e> list;
        if (eVar != null && (list = this.u) != null) {
            list.remove(eVar);
        }
    }

    public int c(int i2) {
        int r2 = b0.r(this);
        if (i2 == 3) {
            int i3 = this.o;
            if (i3 != 3) {
                return i3;
            }
            int i4 = r2 == 0 ? this.q : this.r;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i2 == 5) {
            int i5 = this.p;
            if (i5 != 3) {
                return i5;
            }
            int i6 = r2 == 0 ? this.r : this.q;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        } else if (i2 == 8388611) {
            int i7 = this.q;
            if (i7 != 3) {
                return i7;
            }
            int i8 = r2 == 0 ? this.o : this.p;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        } else if (i2 != 8388613) {
            return 0;
        } else {
            int i9 = this.r;
            if (i9 != 3) {
                return i9;
            }
            int i10 = r2 == 0 ? this.p : this.o;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public View c() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((f) childAt.getLayoutParams()).f1150d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void c(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f1150d & 1) == 0) {
            fVar.f1150d = 1;
            List<e> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.u.get(size).a(view);
                }
            }
            c(view, true);
            n(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(View view, float f2) {
        f fVar = (f) view.getLayoutParams();
        if (f2 != fVar.f1148b) {
            fVar.f1148b = f2;
            a(view, f2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f2 = Math.max(f2, ((f) getChildAt(i2).getLayoutParams()).f1148b);
        }
        this.f1138f = f2;
        boolean a2 = this.f1140h.a(true);
        boolean a3 = this.f1141i.a(true);
        if (a2 || a3) {
            b0.M(this);
        }
    }

    public int d(View view) {
        if (i(view)) {
            return c(((f) view.getLayoutParams()).a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    public View d() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (i(childAt) && j(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public CharSequence d(int i2) {
        int a2 = c.h.l.g.a(i2, b0.r(this));
        if (a2 == 3) {
            return this.A;
        }
        if (a2 == 5) {
            return this.B;
        }
        return null;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1138f <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = getChildAt(i2);
            if (a(x2, y2, childAt) && !g(childAt) && a(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        int i2;
        Drawable drawable;
        int height = getHeight();
        boolean g2 = g(view);
        int width = getWidth();
        int save = canvas.save();
        int i3 = 0;
        if (g2) {
            int childCount = getChildCount();
            i2 = width;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != view && childAt.getVisibility() == 0 && l(childAt) && i(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i4) {
                            i4 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < i2) {
                            i2 = left;
                        }
                    }
                }
            }
            canvas.clipRect(i4, 0, i2, getHeight());
            i3 = i4;
        } else {
            i2 = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        float f2 = this.f1138f;
        if (f2 <= 0.0f || !g2) {
            if (this.y != null && a(view, 3)) {
                int intrinsicWidth = this.y.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f1140h.d()), 1.0f));
                this.y.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.y.setAlpha((int) (max * 255.0f));
                drawable = this.y;
            } else if (this.z != null && a(view, 5)) {
                int intrinsicWidth2 = this.z.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f1141i.d()), 1.0f));
                this.z.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.z.setAlpha((int) (max2 * 255.0f));
                drawable = this.z;
            }
            drawable.draw(canvas);
        } else {
            int i6 = this.f1137e;
            this.f1139g.setColor((i6 & 16777215) | (((int) (((float) ((-16777216 & i6) >>> 24)) * f2)) << 24));
            canvas.drawRect((float) i3, 0.0f, (float) i2, (float) getHeight(), this.f1139g);
        }
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    public int e(View view) {
        return c.h.l.g.a(((f) view.getLayoutParams()).a, b0.r(this));
    }

    public boolean e(int i2) {
        View b2 = b(i2);
        if (b2 != null) {
            return h(b2);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public float f(View view) {
        return ((f) view.getLayoutParams()).f1148b;
    }

    public boolean f(int i2) {
        View b2 = b(i2);
        if (b2 != null) {
            return j(b2);
        }
        return false;
    }

    public void g(int i2) {
        b(i2, true);
    }

    /* access modifiers changed from: package-private */
    public boolean g(View view) {
        return ((f) view.getLayoutParams()).a == 0;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (P) {
            return this.f1135c;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.x;
    }

    public boolean h(View view) {
        if (i(view)) {
            return (((f) view.getLayoutParams()).f1150d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    public boolean i(View view) {
        int a2 = c.h.l.g.a(((f) view.getLayoutParams()).a, b0.r(view));
        return ((a2 & 3) == 0 && (a2 & 5) == 0) ? false : true;
    }

    public boolean j(View view) {
        if (i(view)) {
            return ((f) view.getLayoutParams()).f1148b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void k(View view) {
        b(view, true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = true;
    }

    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (this.D && this.x != null) {
            int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.C) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
            if (systemWindowInsetTop > 0) {
                this.x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.x.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !f()) {
            return super.onKeyDown(i2, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View d2 = d();
        if (d2 != null && d(d2) == 0) {
            b();
        }
        return d2 != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        WindowInsets rootWindowInsets;
        float f2;
        int i6;
        int measuredHeight;
        int i7;
        int i8;
        this.f1145m = true;
        int i9 = i4 - i2;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (g(childAt)) {
                    int i11 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i11, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i11, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f3 = (float) measuredWidth;
                        i6 = (-measuredWidth) + ((int) (fVar.f1148b * f3));
                        f2 = ((float) (measuredWidth + i6)) / f3;
                    } else {
                        float f4 = (float) measuredWidth;
                        int i12 = i9 - ((int) (fVar.f1148b * f4));
                        f2 = ((float) (i9 - i12)) / f4;
                        i6 = i12;
                    }
                    boolean z3 = f2 != fVar.f1148b;
                    int i13 = fVar.a & 112;
                    if (i13 != 16) {
                        if (i13 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                            i7 = measuredWidth + i6;
                            i8 = measuredHeight2 + measuredHeight;
                        } else {
                            int i14 = i5 - i3;
                            measuredHeight = (i14 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight();
                            i7 = measuredWidth + i6;
                            i8 = i14 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                        }
                        childAt.layout(i6, measuredHeight, i7, i8);
                    } else {
                        int i15 = i5 - i3;
                        int i16 = (i15 - measuredHeight2) / 2;
                        int i17 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i16 < i17) {
                            i16 = i17;
                        } else {
                            int i18 = i16 + measuredHeight2;
                            int i19 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i18 > i15 - i19) {
                                i16 = (i15 - i19) - measuredHeight2;
                            }
                        }
                        childAt.layout(i6, i16, measuredWidth + i6, measuredHeight2 + i16);
                    }
                    if (z3) {
                        c(childAt, f2);
                    }
                    int i20 = fVar.f1148b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i20) {
                        childAt.setVisibility(i20);
                    }
                }
            }
        }
        if (Q && (rootWindowInsets = getRootWindowInsets()) != null) {
            c.h.e.b f5 = k0.a(rootWindowInsets).f();
            c.j.b.b bVar = this.f1140h;
            bVar.d(Math.max(bVar.c(), f5.a));
            c.j.b.b bVar2 = this.f1141i;
            bVar2.d(Math.max(bVar2.c(), f5.f2296c));
        }
        this.f1145m = false;
        this.n = false;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i4 = 0;
        boolean z2 = this.C != null && b0.o(this);
        int r2 = b0.r(this);
        int childCount = getChildCount();
        int i5 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z2) {
                    int a2 = c.h.l.g.a(fVar.a, r2);
                    boolean o2 = b0.o(childAt);
                    int i6 = Build.VERSION.SDK_INT;
                    if (o2) {
                        if (i6 >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.C;
                            if (a2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i4, windowInsets.getSystemWindowInsetBottom());
                            } else if (a2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i4, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (i6 >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.C;
                        if (a2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i4, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i4, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (g(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else if (i(childAt)) {
                    if (P) {
                        float m2 = b0.m(childAt);
                        float f2 = this.f1135c;
                        if (m2 != f2) {
                            b0.a(childAt, f2);
                        }
                    }
                    int e2 = e(childAt) & 7;
                    boolean z5 = e2 == 3;
                    if ((!z5 || !z3) && (z5 || !z4)) {
                        if (z5) {
                            z3 = true;
                        } else {
                            z4 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i2, this.f1136d + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i3, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                        i5++;
                        i4 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + h(e2) + " but this " + "DrawerLayout" + " already has a drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i5++;
            i4 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View b2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        int i2 = gVar.f1151d;
        if (!(i2 == 0 || (b2 = b(i2)) == null)) {
            k(b2);
        }
        int i3 = gVar.f1152e;
        if (i3 != 3) {
            a(i3, 3);
        }
        int i4 = gVar.f1153f;
        if (i4 != 3) {
            a(i4, 5);
        }
        int i5 = gVar.f1154g;
        if (i5 != 3) {
            a(i5, 8388611);
        }
        int i6 = gVar.f1155h;
        if (i6 != 3) {
            a(i6, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        i();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            f fVar = (f) getChildAt(i2).getLayoutParams();
            boolean z2 = true;
            boolean z3 = fVar.f1150d == 1;
            if (fVar.f1150d != 2) {
                z2 = false;
            }
            if (z3 || z2) {
                gVar.f1151d = fVar.a;
            } else {
                i2++;
            }
        }
        gVar.f1152e = this.o;
        gVar.f1153f = this.p;
        gVar.f1154g = this.q;
        gVar.f1155h = this.r;
        return gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (d(r7) != 2) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            a(true);
        }
    }

    public void requestLayout() {
        if (!this.f1145m) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f2) {
        this.f1135c = f2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (i(childAt)) {
                b0.a(childAt, this.f1135c);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.t;
        if (eVar2 != null) {
            b(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.t = eVar;
    }

    public void setDrawerLockMode(int i2) {
        a(i2, 3);
        a(i2, 5);
    }

    public void setScrimColor(int i2) {
        this.f1137e = i2;
        invalidate();
    }

    public void setStatusBarBackground(int i2) {
        this.x = i2 != 0 ? c.h.d.a.c(getContext(), i2) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.x = new ColorDrawable(i2);
        invalidate();
    }
}
