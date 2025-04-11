package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import c.h.l.b0;
import c.h.l.k0;
import c.h.l.q;
import c.h.l.t;
import c.h.l.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements q {
    static final String u;
    static final Class<?>[] v = {Context.class, AttributeSet.class};
    static final ThreadLocal<Map<String, Constructor<c>>> w = new ThreadLocal<>();
    static final Comparator<View> x;
    private static final c.h.k.e<Rect> y = new c.h.k.g(12);

    /* renamed from: b  reason: collision with root package name */
    private final List<View> f957b;

    /* renamed from: c  reason: collision with root package name */
    private final a<View> f958c;

    /* renamed from: d  reason: collision with root package name */
    private final List<View> f959d;

    /* renamed from: e  reason: collision with root package name */
    private final List<View> f960e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f961f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f962g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f963h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f964i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f965j;

    /* renamed from: k  reason: collision with root package name */
    private View f966k;

    /* renamed from: l  reason: collision with root package name */
    private View f967l;

    /* renamed from: m  reason: collision with root package name */
    private g f968m;
    private boolean n;
    private k0 o;
    private boolean p;
    private Drawable q;
    ViewGroup.OnHierarchyChangeListener r;
    private u s;
    private final t t;

    /* access modifiers changed from: package-private */
    public class a implements u {
        a() {
        }

        @Override // c.h.l.u
        public k0 a(View view, k0 k0Var) {
            return CoordinatorLayout.this.a(k0Var);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public k0 a(CoordinatorLayout coordinatorLayout, V v, k0 k0Var) {
            return k0Var;
        }

        public void a() {
        }

        public void a(f fVar) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
            if (i2 == 0) {
                d(coordinatorLayout, v, view);
            }
        }

        @Deprecated
        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6) {
            if (i6 == 0) {
                a(coordinatorLayout, v, view, i2, i3, i4, i5);
            }
        }

        @Deprecated
        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
            if (i4 == 0) {
                a(coordinatorLayout, v, view, i2, i3, iArr);
            }
        }

        @Deprecated
        public void a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                a(coordinatorLayout, v, view, view2, i2);
            }
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v) {
            return c(coordinatorLayout, v) > 0.0f;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, int i2) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4, int i5) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3, boolean z) {
            return false;
        }

        public int b(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        @Deprecated
        public boolean b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                return b(coordinatorLayout, v, view, view2, i2);
            }
            return false;
        }

        public float c(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public void c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public Parcelable d(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public void d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.a(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {
        c a;

        /* renamed from: b  reason: collision with root package name */
        boolean f970b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f971c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f972d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f973e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f974f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f975g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f976h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f977i;

        /* renamed from: j  reason: collision with root package name */
        int f978j;

        /* renamed from: k  reason: collision with root package name */
        View f979k;

        /* renamed from: l  reason: collision with root package name */
        View f980l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f981m;
        private boolean n;
        private boolean o;
        private boolean p;
        final Rect q = new Rect();

        public f(int i2, int i3) {
            super(i2, i3);
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.g.c.CoordinatorLayout_Layout);
            this.f971c = obtainStyledAttributes.getInteger(c.g.c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f974f = obtainStyledAttributes.getResourceId(c.g.c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f972d = obtainStyledAttributes.getInteger(c.g.c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f973e = obtainStyledAttributes.getInteger(c.g.c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f975g = obtainStyledAttributes.getInt(c.g.c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f976h = obtainStyledAttributes.getInt(c.g.c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f970b = obtainStyledAttributes.hasValue(c.g.c.CoordinatorLayout_Layout_layout_behavior);
            if (this.f970b) {
                this.a = CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(c.g.c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.a(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
        }

        private void a(View view, CoordinatorLayout coordinatorLayout) {
            this.f979k = coordinatorLayout.findViewById(this.f974f);
            View view2 = this.f979k;
            if (view2 != null) {
                if (view2 != coordinatorLayout) {
                    ViewParent parent = view2.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f980l = view2;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f974f) + " to anchor view " + view);
            }
            this.f980l = null;
            this.f979k = null;
        }

        private boolean a(View view, int i2) {
            int a2 = c.h.l.g.a(((f) view.getLayoutParams()).f975g, i2);
            return a2 != 0 && (c.h.l.g.a(this.f976h, i2) & a2) == a2;
        }

        private boolean b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f979k.getId() != this.f974f) {
                return false;
            }
            View view2 = this.f979k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f980l = null;
                    this.f979k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f980l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        public View a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f974f == -1) {
                this.f980l = null;
                this.f979k = null;
                return null;
            }
            if (this.f979k == null || !b(view, coordinatorLayout)) {
                a(view, coordinatorLayout);
            }
            return this.f979k;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, boolean z) {
            if (i2 == 0) {
                this.n = z;
            } else if (i2 == 1) {
                this.o = z;
            }
        }

        /* access modifiers changed from: package-private */
        public void a(Rect rect) {
            this.q.set(rect);
        }

        public void a(c cVar) {
            c cVar2 = this.a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.a();
                }
                this.a = cVar;
                this.f970b = true;
                if (cVar != null) {
                    cVar.a(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z) {
            this.p = z;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f979k == null && this.f974f != -1;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i2) {
            if (i2 == 0) {
                return this.n;
            }
            if (i2 != 1) {
                return false;
            }
            return this.o;
        }

        /* access modifiers changed from: package-private */
        public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f980l || a(view2, b0.r(coordinatorLayout)) || ((cVar = this.a) != null && cVar.a(coordinatorLayout, view, view2));
        }

        /* access modifiers changed from: package-private */
        public void b(int i2) {
            a(i2, false);
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            if (this.a == null) {
                this.f981m = false;
            }
            return this.f981m;
        }

        /* access modifiers changed from: package-private */
        public boolean b(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f981m;
            if (z) {
                return true;
            }
            c cVar = this.a;
            boolean a2 = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z;
            this.f981m = a2;
            return a2;
        }

        public int c() {
            return this.f974f;
        }

        public c d() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return this.p;
        }

        /* access modifiers changed from: package-private */
        public Rect f() {
            return this.q;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            this.p = false;
        }

        /* access modifiers changed from: package-private */
        public void h() {
            this.f981m = false;
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.a(0);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public static class h extends c.j.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        SparseArray<Parcelable> f983d;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public h[] newArray(int i2) {
                return new h[i2];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f983d = new SparseArray<>(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                this.f983d.append(iArr[i2], readParcelableArray[i2]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // c.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            SparseArray<Parcelable> sparseArray = this.f983d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = this.f983d.keyAt(i3);
                parcelableArr[i3] = this.f983d.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float C = b0.C(view);
            float C2 = b0.C(view2);
            if (C > C2) {
                return -1;
            }
            return C < C2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        u = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            x = new i();
        } else {
            x = null;
        }
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.g.a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f957b = new ArrayList();
        this.f958c = new a<>();
        this.f959d = new ArrayList();
        this.f960e = new ArrayList();
        this.f961f = new int[2];
        this.t = new t(this);
        TypedArray obtainStyledAttributes = i2 == 0 ? context.obtainStyledAttributes(attributeSet, c.g.c.CoordinatorLayout, 0, c.g.b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, c.g.c.CoordinatorLayout, i2, 0);
        int resourceId = obtainStyledAttributes.getResourceId(c.g.c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f965j = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.f965j.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = this.f965j;
                iArr[i3] = (int) (((float) iArr[i3]) * f2);
            }
        }
        this.q = obtainStyledAttributes.getDrawable(c.g.c.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        f();
        super.setOnHierarchyChangeListener(new e());
    }

    private static int a(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    static c a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(u)) {
            str = u + '.' + str;
        }
        try {
            Map<String, Constructor<c>> map = w.get();
            if (map == null) {
                map = new HashMap<>();
                w.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    private static void a(Rect rect) {
        rect.setEmpty();
        y.a(rect);
    }

    private void a(View view, int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int a2 = c.h.l.g.a(c(fVar.f971c), i2);
        int a3 = c.h.l.g.a(d(fVar.f972d), i2);
        int i5 = a2 & 7;
        int i6 = a2 & 112;
        int i7 = a3 & 7;
        int i8 = a3 & 112;
        int width = i7 != 1 ? i7 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i8 != 16 ? i8 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i5 == 1) {
            width -= i3 / 2;
        } else if (i5 != 5) {
            width -= i3;
        }
        if (i6 == 16) {
            height -= i4 / 2;
        } else if (i6 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    private void a(View view, Rect rect, int i2) {
        boolean z;
        boolean z2;
        int width;
        int i3;
        int i4;
        int i5;
        int height;
        int i6;
        int i7;
        int i8;
        if (b0.I(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c d2 = fVar.d();
            Rect d3 = d();
            Rect d4 = d();
            d4.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (d2 == null || !d2.a(this, view, d3)) {
                d3.set(d4);
            } else if (!d4.contains(d3)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + d3.toShortString() + " | Bounds:" + d4.toShortString());
            }
            a(d4);
            if (d3.isEmpty()) {
                a(d3);
                return;
            }
            int a2 = c.h.l.g.a(fVar.f976h, i2);
            if ((a2 & 48) != 48 || (i7 = (d3.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f978j) >= (i8 = rect.top)) {
                z = false;
            } else {
                f(view, i8 - i7);
                z = true;
            }
            if ((a2 & 80) == 80 && (height = ((getHeight() - d3.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f978j) < (i6 = rect.bottom)) {
                f(view, height - i6);
                z = true;
            }
            if (!z) {
                f(view, 0);
            }
            if ((a2 & 3) != 3 || (i4 = (d3.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f977i) >= (i5 = rect.left)) {
                z2 = false;
            } else {
                e(view, i5 - i4);
                z2 = true;
            }
            if ((a2 & 5) == 5 && (width = ((getWidth() - d3.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f977i) < (i3 = rect.right)) {
                e(view, width - i3);
                z2 = true;
            }
            if (!z2) {
                e(view, 0);
            }
            a(d3);
        }
    }

    private void a(View view, View view2, int i2) {
        Rect d2 = d();
        Rect d3 = d();
        try {
            a(view2, d2);
            a(view, i2, d2, d3);
            view.layout(d3.left, d3.top, d3.right, d3.bottom);
        } finally {
            a(d2);
            a(d3);
        }
    }

    private void a(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    private void a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private void a(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c d2 = ((f) childAt.getLayoutParams()).d();
            if (d2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    d2.a(this, childAt, obtain);
                } else {
                    d2.b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).h();
        }
        this.f966k = null;
        this.f963h = false;
    }

    private boolean a(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f959d;
        a(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            f fVar = (f) view.getLayoutParams();
            c d2 = fVar.d();
            boolean z3 = true;
            if (!(z || z2) || actionMasked == 0) {
                if (!z && d2 != null) {
                    if (i2 == 0) {
                        z = d2.a(this, view, motionEvent);
                    } else if (i2 == 1) {
                        z = d2.b(this, view, motionEvent);
                    }
                    if (z) {
                        this.f966k = view;
                    }
                }
                boolean b2 = fVar.b();
                boolean b3 = fVar.b(this, view);
                if (!b3 || b2) {
                    z3 = false;
                }
                if (b3 && !z3) {
                    break;
                }
                z2 = z3;
            } else if (d2 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    d2.a(this, view, motionEvent2);
                } else if (i2 == 1) {
                    d2.b(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    private int b(int i2) {
        StringBuilder sb;
        int[] iArr = this.f965j;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i2);
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i2);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    private k0 b(k0 k0Var) {
        c d2;
        if (k0Var.l()) {
            return k0Var;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (b0.o(childAt) && (d2 = ((f) childAt.getLayoutParams()).d()) != null) {
                k0Var = d2.a(this, childAt, k0Var);
                if (k0Var.l()) {
                    break;
                }
            }
        }
        return k0Var;
    }

    private void b(View view, int i2, int i3) {
        f fVar = (f) view.getLayoutParams();
        int a2 = c.h.l.g.a(e(fVar.f971c), i3);
        int i4 = a2 & 7;
        int i5 = a2 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int b2 = b(i2) - measuredWidth;
        int i6 = 0;
        if (i4 == 1) {
            b2 += measuredWidth / 2;
        } else if (i4 == 5) {
            b2 += measuredWidth;
        }
        if (i5 == 16) {
            i6 = 0 + (measuredHeight / 2);
        } else if (i5 == 80) {
            i6 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(b2, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private static int c(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    private static int d(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static Rect d() {
        Rect a2 = y.a();
        return a2 == null ? new Rect() : a2;
    }

    private void d(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        Rect d2 = d();
        d2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.o != null && b0.o(this) && !b0.o(view)) {
            d2.left += this.o.h();
            d2.top += this.o.j();
            d2.right -= this.o.i();
            d2.bottom -= this.o.g();
        }
        Rect d3 = d();
        c.h.l.g.a(d(fVar.f971c), view.getMeasuredWidth(), view.getMeasuredHeight(), d2, d3, i2);
        view.layout(d3.left, d3.top, d3.right, d3.bottom);
        a(d2);
        a(d3);
    }

    private static int e(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private void e() {
        this.f957b.clear();
        this.f958c.a();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f d2 = d(childAt);
            d2.a(this, childAt);
            this.f958c.a(childAt);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2) {
                    View childAt2 = getChildAt(i3);
                    if (d2.a(this, childAt, childAt2)) {
                        if (!this.f958c.b(childAt2)) {
                            this.f958c.a(childAt2);
                        }
                        this.f958c.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f957b.addAll(this.f958c.b());
        Collections.reverse(this.f957b);
    }

    private void e(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f977i;
        if (i3 != i2) {
            b0.d(view, i2 - i3);
            fVar.f977i = i2;
        }
    }

    private boolean e(View view) {
        return this.f958c.e(view);
    }

    private void f() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (b0.o(this)) {
                if (this.s == null) {
                    this.s = new a();
                }
                b0.a(this, this.s);
                setSystemUiVisibility(1280);
                return;
            }
            b0.a(this, (u) null);
        }
    }

    private void f(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f978j;
        if (i3 != i2) {
            b0.e(view, i2 - i3);
            fVar.f978j = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public final k0 a(k0 k0Var) {
        if (c.h.k.c.a(this.o, k0Var)) {
            return k0Var;
        }
        this.o = k0Var;
        boolean z = true;
        this.p = k0Var != null && k0Var.j() > 0;
        if (this.p || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        k0 b2 = b(k0Var);
        requestLayout();
        return b2;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f964i) {
            if (this.f968m == null) {
                this.f968m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f968m);
        }
        this.n = true;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        boolean z;
        int r2 = b0.r(this);
        int size = this.f957b.size();
        Rect d2 = d();
        Rect d3 = d();
        Rect d4 = d();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f957b.get(i3);
            f fVar = (f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.f980l == this.f957b.get(i4)) {
                        b(view, r2);
                    }
                }
                a(view, true, d3);
                if (fVar.f975g != 0 && !d3.isEmpty()) {
                    int a2 = c.h.l.g.a(fVar.f975g, r2);
                    int i5 = a2 & 112;
                    if (i5 == 48) {
                        d2.top = Math.max(d2.top, d3.bottom);
                    } else if (i5 == 80) {
                        d2.bottom = Math.max(d2.bottom, getHeight() - d3.top);
                    }
                    int i6 = a2 & 7;
                    if (i6 == 3) {
                        d2.left = Math.max(d2.left, d3.right);
                    } else if (i6 == 5) {
                        d2.right = Math.max(d2.right, getWidth() - d3.left);
                    }
                }
                if (fVar.f976h != 0 && view.getVisibility() == 0) {
                    a(view, d2, r2);
                }
                if (i2 != 2) {
                    b(view, d4);
                    if (!d4.equals(d3)) {
                        c(view, d3);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.f957b.get(i7);
                    f fVar2 = (f) view2.getLayoutParams();
                    c d5 = fVar2.d();
                    if (d5 != null && d5.a(this, view2, view)) {
                        if (i2 != 0 || !fVar2.e()) {
                            if (i2 != 2) {
                                z = d5.b(this, view2, view);
                            } else {
                                d5.c(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar2.a(z);
                            }
                        } else {
                            fVar2.g();
                        }
                    }
                }
            }
        }
        a(d2);
        a(d3);
        a(d4);
    }

    public void a(View view) {
        List c2 = this.f958c.c(view);
        if (!(c2 == null || c2.isEmpty())) {
            for (int i2 = 0; i2 < c2.size(); i2++) {
                View view2 = (View) c2.get(i2);
                c d2 = ((f) view2.getLayoutParams()).d();
                if (d2 != null) {
                    d2.b(this, view2, view);
                }
            }
        }
    }

    @Override // c.h.l.q
    public void a(View view, int i2) {
        this.t.a(view, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i2)) {
                c d2 = fVar.d();
                if (d2 != null) {
                    d2.a(this, childAt, view, i2);
                }
                fVar.b(i2);
                fVar.g();
            }
        }
        this.f967l = null;
    }

    public void a(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // c.h.l.q
    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        c d2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i6) && (d2 = fVar.d()) != null) {
                    d2.a(this, childAt, view, i2, i3, i4, i5, i6);
                    z = true;
                }
            }
        }
        if (z) {
            a(1);
        }
    }

    @Override // c.h.l.q
    public void a(View view, int i2, int i3, int[] iArr, int i4) {
        c d2;
        int childCount = getChildCount();
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i4) && (d2 = fVar.d()) != null) {
                    int[] iArr2 = this.f961f;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    d2.a(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.f961f;
                    int max = i2 > 0 ? Math.max(i5, iArr3[0]) : Math.min(i5, iArr3[0]);
                    int[] iArr4 = this.f961f;
                    i5 = max;
                    i6 = i3 > 0 ? Math.max(i6, iArr4[1]) : Math.min(i6, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z) {
            a(1);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i2, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        a(view, i2, rect, rect2, fVar, measuredWidth, measuredHeight);
        a(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, Rect rect) {
        b.a(this, view, rect);
    }

    @Override // c.h.l.q
    public void a(View view, View view2, int i2, int i3) {
        c d2;
        this.t.a(view, view2, i2, i3);
        this.f967l = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i3) && (d2 = fVar.d()) != null) {
                d2.a(this, childAt, view, view2, i2, i3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean a(View view, int i2, int i3) {
        Rect d2 = d();
        a(view, d2);
        try {
            return d2.contains(i2, i3);
        } finally {
            a(d2);
        }
    }

    public List<View> b(View view) {
        List<View> d2 = this.f958c.d(view);
        this.f960e.clear();
        if (d2 != null) {
            this.f960e.addAll(d2);
        }
        return this.f960e;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            } else if (e(getChildAt(i2))) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z == this.n) {
            return;
        }
        if (z) {
            a();
        } else {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(View view, int i2) {
        c d2;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f979k != null) {
            Rect d3 = d();
            Rect d4 = d();
            Rect d5 = d();
            a(fVar.f979k, d3);
            boolean z = false;
            a(view, false, d4);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            a(view, i2, d3, d5, fVar, measuredWidth, measuredHeight);
            if (!(d5.left == d4.left && d5.top == d4.top)) {
                z = true;
            }
            a(fVar, d5, measuredWidth, measuredHeight);
            int i3 = d5.left - d4.left;
            int i4 = d5.top - d4.top;
            if (i3 != 0) {
                b0.d(view, i3);
            }
            if (i4 != 0) {
                b0.e(view, i4);
            }
            if (z && (d2 = fVar.d()) != null) {
                d2.b(this, view, fVar.f979k);
            }
            a(d3);
            a(d4);
            a(d5);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).f());
    }

    @Override // c.h.l.q
    public boolean b(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c d2 = fVar.d();
                if (d2 != null) {
                    boolean b2 = d2.b(this, childAt, view, view2, i2, i3);
                    fVar.a(i3, b2);
                    z |= b2;
                } else {
                    fVar.a(i3, false);
                }
            }
        }
        return z;
    }

    public List<View> c(View view) {
        List c2 = this.f958c.c(view);
        this.f960e.clear();
        if (c2 != null) {
            this.f960e.addAll(c2);
        }
        return this.f960e;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.f964i && this.f968m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f968m);
        }
        this.n = false;
    }

    public void c(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.f979k;
            if (view2 != null) {
                a(view, view2, i2);
                return;
            }
            int i3 = fVar.f973e;
            if (i3 >= 0) {
                b(view, i3, i2);
            } else {
                d(view, i2);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* access modifiers changed from: package-private */
    public void c(View view, Rect rect) {
        ((f) view.getLayoutParams()).a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public f d(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f970b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.a(behavior);
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.a((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget" + " a default constructor?", e2);
                    }
                }
            }
            fVar.f970b = true;
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.a;
        if (cVar != null) {
            float c2 = cVar.c(this, view);
            if (c2 > 0.0f) {
                if (this.f962g == null) {
                    this.f962g = new Paint();
                }
                this.f962g.setColor(fVar.a.b(this, view));
                this.f962g.setAlpha(a(Math.round(c2 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f962g);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        e();
        return Collections.unmodifiableList(this.f957b);
    }

    public final k0 getLastWindowInsets() {
        return this.o;
    }

    public int getNestedScrollAxes() {
        return this.t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        if (this.n) {
            if (this.f968m == null) {
                this.f968m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f968m);
        }
        if (this.o == null && b0.o(this)) {
            b0.N(this);
        }
        this.f964i = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
        if (this.n && this.f968m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f968m);
        }
        View view = this.f967l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f964i = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.p && this.q != null) {
            k0 k0Var = this.o;
            int j2 = k0Var != null ? k0Var.j() : 0;
            if (j2 > 0) {
                this.q.setBounds(0, 0, getWidth(), j2);
                this.q.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a(true);
        }
        boolean a2 = a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            a(true);
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        c d2;
        int r2 = b0.r(this);
        int size = this.f957b.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f957b.get(i6);
            if (view.getVisibility() != 8 && ((d2 = ((f) view.getLayoutParams()).d()) == null || !d2.a(this, view, r2))) {
                c(view, r2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0117, code lost:
        if (r0.a(r30, r20, r11, r21, r23, 0) == false) goto L_0x0126;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
        // Method dump skipped, instructions count: 388
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // c.h.l.s
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        c d2;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (d2 = fVar.d()) != null) {
                    z2 |= d2.a(this, childAt, view, f2, f3, z);
                }
            }
        }
        if (z2) {
            a(1);
        }
        return z2;
    }

    @Override // c.h.l.s
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c d2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (d2 = fVar.d()) != null) {
                    z |= d2.a(this, childAt, view, f2, f3);
                }
            }
        }
        return z;
    }

    @Override // c.h.l.s
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(view, i2, i3, iArr, 0);
    }

    @Override // c.h.l.s
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(view, i2, i3, i4, i5, 0);
    }

    @Override // c.h.l.s
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray<Parcelable> sparseArray = hVar.f983d;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c d2 = d(childAt).d();
            if (!(id == -1 || d2 == null || (parcelable2 = sparseArray.get(id)) == null)) {
                d2.a(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable d2;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c d3 = ((f) childAt.getLayoutParams()).d();
            if (!(id == -1 || d3 == null || (d2 = d3.d(this, childAt)) == null)) {
                sparseArray.append(id, d2);
            }
        }
        hVar.f983d = sparseArray;
        return hVar;
    }

    @Override // c.h.l.s
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return b(view, view2, i2, 0);
    }

    @Override // c.h.l.s
    public void onStopNestedScroll(View view) {
        a(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f966k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.a(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f966k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.d()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f966k
            boolean r6 = r6.b(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f966k
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.a(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        c d2 = ((f) view.getLayoutParams()).d();
        if (d2 == null || !d2.a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f963h) {
            a(false);
            this.f963h = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        f();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.q = drawable3;
            Drawable drawable4 = this.q;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.q.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.a(this.q, b0.r(this));
                this.q.setVisible(getVisibility() == 0, false);
                this.q.setCallback(this);
            }
            b0.M(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? c.h.d.a.c(getContext(), i2) : null);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.q;
        if (drawable != null && drawable.isVisible() != z) {
            this.q.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }
}
