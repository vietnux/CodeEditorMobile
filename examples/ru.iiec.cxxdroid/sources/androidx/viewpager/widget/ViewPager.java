package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import c.h.l.b0;
import c.h.l.k0;
import c.h.l.u;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    static final int[] g0 = {16842931};
    private static final Comparator<f> h0 = new a();
    private static final Interpolator i0 = new b();
    private static final n j0 = new n();
    private int A;
    private int B;
    private int C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int H = -1;
    private VelocityTracker I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private EdgeEffect O;
    private EdgeEffect P;
    private boolean Q = true;
    private boolean R;
    private int S;
    private List<j> T;
    private j U;
    private j V;
    private List<i> W;
    private k a0;

    /* renamed from: b  reason: collision with root package name */
    private int f1745b;
    private int b0;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<f> f1746c = new ArrayList<>();
    private int c0;

    /* renamed from: d  reason: collision with root package name */
    private final f f1747d = new f();
    private ArrayList<View> d0;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f1748e = new Rect();
    private final Runnable e0 = new c();

    /* renamed from: f  reason: collision with root package name */
    a f1749f;
    private int f0 = 0;

    /* renamed from: g  reason: collision with root package name */
    int f1750g;

    /* renamed from: h  reason: collision with root package name */
    private int f1751h = -1;

    /* renamed from: i  reason: collision with root package name */
    private Parcelable f1752i = null;

    /* renamed from: j  reason: collision with root package name */
    private ClassLoader f1753j = null;

    /* renamed from: k  reason: collision with root package name */
    private Scroller f1754k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1755l;

    /* renamed from: m  reason: collision with root package name */
    private l f1756m;
    private int n;
    private Drawable o;
    private int p;
    private int q;
    private float r = -3.4028235E38f;
    private float s = Float.MAX_VALUE;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x = 1;
    private boolean y;
    private boolean z;

    static class a implements Comparator<f> {
        a() {
        }

        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.f1759b - fVar2.f1759b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.e();
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements u {
        private final Rect a = new Rect();

        d() {
        }

        @Override // c.h.l.u
        public k0 a(View view, k0 k0Var) {
            k0 b2 = b0.b(view, k0Var);
            if (b2.l()) {
                return b2;
            }
            Rect rect = this.a;
            rect.left = b2.h();
            rect.top = b2.j();
            rect.right = b2.i();
            rect.bottom = b2.g();
            int childCount = ViewPager.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                k0 a2 = b0.a(ViewPager.this.getChildAt(i2), b2);
                rect.left = Math.min(a2.h(), rect.left);
                rect.top = Math.min(a2.j(), rect.top);
                rect.right = Math.min(a2.i(), rect.right);
                rect.bottom = Math.min(a2.g(), rect.bottom);
            }
            return b2.b(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    /* access modifiers changed from: package-private */
    public static class f {
        Object a;

        /* renamed from: b  reason: collision with root package name */
        int f1759b;

        /* renamed from: c  reason: collision with root package name */
        boolean f1760c;

        /* renamed from: d  reason: collision with root package name */
        float f1761d;

        /* renamed from: e  reason: collision with root package name */
        float f1762e;

        f() {
        }
    }

    public static class g extends ViewGroup.LayoutParams {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public int f1763b;

        /* renamed from: c  reason: collision with root package name */
        float f1764c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        boolean f1765d;

        /* renamed from: e  reason: collision with root package name */
        int f1766e;

        /* renamed from: f  reason: collision with root package name */
        int f1767f;

        public g() {
            super(-1, -1);
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.g0);
            this.f1763b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public class h extends c.h.l.c {
        h() {
        }

        private boolean b() {
            a aVar = ViewPager.this.f1749f;
            return aVar != null && aVar.a() > 1;
        }

        @Override // c.h.l.c
        public void a(View view, c.h.l.l0.d dVar) {
            super.a(view, dVar);
            dVar.a((CharSequence) ViewPager.class.getName());
            dVar.j(b());
            if (ViewPager.this.canScrollHorizontally(1)) {
                dVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                dVar.a(8192);
            }
        }

        @Override // c.h.l.c
        public boolean a(View view, int i2, Bundle bundle) {
            ViewPager viewPager;
            int i3;
            if (super.a(view, i2, bundle)) {
                return true;
            }
            if (i2 != 4096) {
                if (i2 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i3 = viewPager.f1750g - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i3 = viewPager.f1750g + 1;
            }
            viewPager.setCurrentItem(i3);
            return true;
        }

        @Override // c.h.l.c
        public void b(View view, AccessibilityEvent accessibilityEvent) {
            a aVar;
            super.b(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(b());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f1749f) != null) {
                accessibilityEvent.setItemCount(aVar.a());
                accessibilityEvent.setFromIndex(ViewPager.this.f1750g);
                accessibilityEvent.setToIndex(ViewPager.this.f1750g);
            }
        }
    }

    public interface i {
        void a(ViewPager viewPager, a aVar, a aVar2);
    }

    public interface j {
        void a(int i2);

        void a(int i2, float f2, int i3);

        void b(int i2);
    }

    public interface k {
        void a(View view, float f2);
    }

    /* access modifiers changed from: private */
    public class l extends DataSetObserver {
        l() {
        }

        public void onChanged() {
            ViewPager.this.a();
        }

        public void onInvalidated() {
            ViewPager.this.a();
        }
    }

    public static class m extends c.j.a.a {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        int f1769d;

        /* renamed from: e  reason: collision with root package name */
        Parcelable f1770e;

        /* renamed from: f  reason: collision with root package name */
        ClassLoader f1771f;

        static class a implements Parcelable.ClassLoaderCreator<m> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public m[] newArray(int i2) {
                return new m[i2];
            }
        }

        m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? m.class.getClassLoader() : classLoader;
            this.f1769d = parcel.readInt();
            this.f1770e = parcel.readParcelable(classLoader);
            this.f1771f = classLoader;
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f1769d + "}";
        }

        @Override // c.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1769d);
            parcel.writeParcelable(this.f1770e, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public static class n implements Comparator<View> {
        n() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.a;
            return z != gVar2.a ? z ? 1 : -1 : gVar.f1766e - gVar2.f1766e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        b();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    private int a(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.L || Math.abs(i3) <= this.J) {
            i2 += (int) (f2 + (i2 >= this.f1750g ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f1746c.size() <= 0) {
            return i2;
        }
        ArrayList<f> arrayList = this.f1746c;
        return Math.max(this.f1746c.get(0).f1759b, Math.min(i2, arrayList.get(arrayList.size() - 1).f1759b));
    }

    private Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void a(int i2, int i3, int i4, int i5) {
        int min;
        if (i3 <= 0 || this.f1746c.isEmpty()) {
            f b2 = b(this.f1750g);
            min = (int) ((b2 != null ? Math.min(b2.f1762e, this.s) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                a(false);
            } else {
                return;
            }
        } else if (!this.f1754k.isFinished()) {
            this.f1754k.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))) * ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)));
        }
        scrollTo(min, getScrollY());
    }

    private void a(int i2, boolean z2, int i3, boolean z3) {
        f b2 = b(i2);
        int clientWidth = b2 != null ? (int) (((float) getClientWidth()) * Math.max(this.r, Math.min(b2.f1762e, this.s))) : 0;
        if (z2) {
            a(clientWidth, 0, i3);
            if (z3) {
                d(i2);
                return;
            }
            return;
        }
        if (z3) {
            d(i2);
        }
        a(false);
        scrollTo(clientWidth, 0);
        f(clientWidth);
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.D = motionEvent.getX(i2);
            this.H = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void a(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int a2 = this.f1749f.a();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.n) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.f1759b;
            int i6 = fVar.f1759b;
            if (i5 < i6) {
                int i7 = 0;
                float f3 = fVar2.f1762e + fVar2.f1761d + f2;
                while (true) {
                    i5++;
                    if (i5 > fVar.f1759b || i7 >= this.f1746c.size()) {
                        break;
                    }
                    while (true) {
                        fVar4 = this.f1746c.get(i7);
                        if (i5 > fVar4.f1759b && i7 < this.f1746c.size() - 1) {
                            i7++;
                        }
                    }
                    while (i5 < fVar4.f1759b) {
                        f3 += this.f1749f.b(i5) + f2;
                        i5++;
                    }
                    fVar4.f1762e = f3;
                    f3 += fVar4.f1761d + f2;
                }
            } else if (i5 > i6) {
                int size = this.f1746c.size() - 1;
                float f4 = fVar2.f1762e;
                while (true) {
                    i5--;
                    if (i5 < fVar.f1759b || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = this.f1746c.get(size);
                        if (i5 < fVar3.f1759b && size > 0) {
                            size--;
                        }
                    }
                    while (i5 > fVar3.f1759b) {
                        f4 -= this.f1749f.b(i5) + f2;
                        i5--;
                    }
                    f4 -= fVar3.f1761d + f2;
                    fVar3.f1762e = f4;
                }
            }
        }
        int size2 = this.f1746c.size();
        float f5 = fVar.f1762e;
        int i8 = fVar.f1759b;
        int i9 = i8 - 1;
        this.r = i8 == 0 ? f5 : -3.4028235E38f;
        int i10 = a2 - 1;
        this.s = fVar.f1759b == i10 ? (fVar.f1762e + fVar.f1761d) - 1.0f : Float.MAX_VALUE;
        int i11 = i2 - 1;
        while (i11 >= 0) {
            f fVar5 = this.f1746c.get(i11);
            while (true) {
                i4 = fVar5.f1759b;
                if (i9 <= i4) {
                    break;
                }
                f5 -= this.f1749f.b(i9) + f2;
                i9--;
            }
            f5 -= fVar5.f1761d + f2;
            fVar5.f1762e = f5;
            if (i4 == 0) {
                this.r = f5;
            }
            i11--;
            i9--;
        }
        float f6 = fVar.f1762e + fVar.f1761d + f2;
        int i12 = fVar.f1759b + 1;
        int i13 = i2 + 1;
        while (i13 < size2) {
            f fVar6 = this.f1746c.get(i13);
            while (true) {
                i3 = fVar6.f1759b;
                if (i12 >= i3) {
                    break;
                }
                f6 += this.f1749f.b(i12) + f2;
                i12++;
            }
            if (i3 == i10) {
                this.s = (fVar6.f1761d + f6) - 1.0f;
            }
            fVar6.f1762e = f6;
            f6 += fVar6.f1761d + f2;
            i13++;
            i12++;
        }
    }

    private void a(boolean z2) {
        boolean z3 = this.f0 == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.f1754k.isFinished()) {
                this.f1754k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f1754k.getCurrX();
                int currY = this.f1754k.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        f(currX);
                    }
                }
            }
        }
        this.w = false;
        boolean z4 = z3;
        for (int i2 = 0; i2 < this.f1746c.size(); i2++) {
            f fVar = this.f1746c.get(i2);
            if (fVar.f1760c) {
                fVar.f1760c = false;
                z4 = true;
            }
        }
        if (!z4) {
            return;
        }
        if (z2) {
            b0.a(this, this.e0);
        } else {
            this.e0.run();
        }
    }

    private boolean a(float f2, float f3) {
        return (f2 < ((float) this.B) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.B)) && f3 < 0.0f);
    }

    private void b(int i2, float f2, int i3) {
        j jVar = this.U;
        if (jVar != null) {
            jVar.a(i2, f2, i3);
        }
        List<j> list = this.T;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar2 = this.T.get(i4);
                if (jVar2 != null) {
                    jVar2.a(i2, f2, i3);
                }
            }
        }
        j jVar3 = this.V;
        if (jVar3 != null) {
            jVar3.a(i2, f2, i3);
        }
    }

    private void b(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z2 ? this.b0 : 0, null);
        }
    }

    private boolean b(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.D - f2;
        this.D = f2;
        float scrollX = ((float) getScrollX()) + f3;
        float clientWidth = (float) getClientWidth();
        float f4 = this.r * clientWidth;
        float f5 = this.s * clientWidth;
        boolean z4 = false;
        f fVar = this.f1746c.get(0);
        ArrayList<f> arrayList = this.f1746c;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f1759b != 0) {
            f4 = fVar.f1762e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (fVar2.f1759b != this.f1749f.a() - 1) {
            f5 = fVar2.f1762e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.O.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.P.onPull(Math.abs(scrollX - f5) / clientWidth);
                z4 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.D += scrollX - ((float) i2);
        scrollTo(i2, getScrollY());
        f(i2);
        return z4;
    }

    private void c(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    private static boolean c(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private void d(int i2) {
        j jVar = this.U;
        if (jVar != null) {
            jVar.b(i2);
        }
        List<j> list = this.T;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.T.get(i3);
                if (jVar2 != null) {
                    jVar2.b(i2);
                }
            }
        }
        j jVar3 = this.V;
        if (jVar3 != null) {
            jVar3.b(i2);
        }
    }

    private void e(int i2) {
        j jVar = this.U;
        if (jVar != null) {
            jVar.a(i2);
        }
        List<j> list = this.T;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.T.get(i3);
                if (jVar2 != null) {
                    jVar2.a(i2);
                }
            }
        }
        j jVar3 = this.V;
        if (jVar3 != null) {
            jVar3.a(i2);
        }
    }

    private void f() {
        this.y = false;
        this.z = false;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.I = null;
        }
    }

    private boolean f(int i2) {
        if (this.f1746c.size() != 0) {
            f g2 = g();
            int clientWidth = getClientWidth();
            int i3 = this.n;
            int i4 = clientWidth + i3;
            float f2 = (float) clientWidth;
            int i5 = g2.f1759b;
            float f3 = ((((float) i2) / f2) - g2.f1762e) / (g2.f1761d + (((float) i3) / f2));
            this.R = false;
            a(i5, f3, (int) (((float) i4) * f3));
            if (this.R) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.Q) {
            return false;
        } else {
            this.R = false;
            a(0, 0.0f, 0);
            if (this.R) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private f g() {
        int i2;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.n) / ((float) clientWidth) : 0.0f;
        f fVar = null;
        int i3 = 0;
        boolean z2 = true;
        int i4 = -1;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i3 < this.f1746c.size()) {
            f fVar2 = this.f1746c.get(i3);
            if (!z2 && fVar2.f1759b != (i2 = i4 + 1)) {
                fVar2 = this.f1747d;
                fVar2.f1762e = f3 + f4 + f2;
                fVar2.f1759b = i2;
                fVar2.f1761d = this.f1749f.b(fVar2.f1759b);
                i3--;
            }
            f3 = fVar2.f1762e;
            float f5 = fVar2.f1761d + f3 + f2;
            if (!z2 && scrollX < f3) {
                return fVar;
            }
            if (scrollX < f5 || i3 == this.f1746c.size() - 1) {
                return fVar2;
            }
            i4 = fVar2.f1759b;
            f4 = fVar2.f1761d;
            i3++;
            fVar = fVar2;
            z2 = false;
        }
        return fVar;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private boolean i() {
        this.H = -1;
        f();
        this.O.onRelease();
        this.P.onRelease();
        return this.O.isFinished() || this.P.isFinished();
    }

    private void j() {
        if (this.c0 != 0) {
            ArrayList<View> arrayList = this.d0;
            if (arrayList == null) {
                this.d0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.d0.add(getChildAt(i2));
            }
            Collections.sort(this.d0, j0);
        }
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.v != z2) {
            this.v = z2;
        }
    }

    /* access modifiers changed from: package-private */
    public float a(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: package-private */
    public f a(int i2, int i3) {
        f fVar = new f();
        fVar.f1759b = i2;
        fVar.a = this.f1749f.a(this, i2);
        fVar.f1761d = this.f1749f.b(i2);
        if (i3 < 0 || i3 >= this.f1746c.size()) {
            this.f1746c.add(fVar);
        } else {
            this.f1746c.add(i3, fVar);
        }
        return fVar;
    }

    /* access modifiers changed from: package-private */
    public f a(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return b(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int a2 = this.f1749f.a();
        this.f1745b = a2;
        boolean z2 = this.f1746c.size() < (this.x * 2) + 1 && this.f1746c.size() < a2;
        int i2 = this.f1750g;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.f1746c.size()) {
            f fVar = this.f1746c.get(i3);
            int a3 = this.f1749f.a(fVar.a);
            if (a3 != -1) {
                if (a3 == -2) {
                    this.f1746c.remove(i3);
                    i3--;
                    if (!z3) {
                        this.f1749f.b(this);
                        z3 = true;
                    }
                    this.f1749f.a(this, fVar.f1759b, fVar.a);
                    int i4 = this.f1750g;
                    if (i4 == fVar.f1759b) {
                        i2 = Math.max(0, Math.min(i4, a2 - 1));
                    }
                } else {
                    int i5 = fVar.f1759b;
                    if (i5 != a3) {
                        if (i5 == this.f1750g) {
                            i2 = a3;
                        }
                        fVar.f1759b = a3;
                    }
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.f1749f.a((ViewGroup) this);
        }
        Collections.sort(this.f1746c, h0);
        if (z2) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                g gVar = (g) getChildAt(i6).getLayoutParams();
                if (!gVar.a) {
                    gVar.f1764c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r13, float r14, int r15) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.a(int, float, int):void");
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, int i4) {
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f1754k;
        if (scroller != null && !scroller.isFinished()) {
            i5 = this.f1755l ? this.f1754k.getCurrX() : this.f1754k.getStartX();
            this.f1754k.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i5 = getScrollX();
        }
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            a(false);
            e();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = (float) clientWidth;
        float f3 = (float) i8;
        float a2 = f3 + (a(Math.min(1.0f, (((float) Math.abs(i6)) * 1.0f) / f2)) * f3);
        int abs = Math.abs(i4);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(a2 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i6)) / ((f2 * this.f1749f.b(this.f1750g)) + ((float) this.n))) + 1.0f) * 100.0f), 600);
        this.f1755l = false;
        this.f1754k.startScroll(i5, scrollY, i6, i7, min);
        b0.M(this);
    }

    public void a(int i2, boolean z2) {
        this.w = false;
        a(i2, z2, false);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, boolean z2, boolean z3) {
        a(i2, z2, z3, 0);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, boolean z2, boolean z3, int i3) {
        a aVar = this.f1749f;
        if (aVar == null || aVar.a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.f1750g != i2 || this.f1746c.size() == 0) {
            boolean z4 = true;
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.f1749f.a()) {
                i2 = this.f1749f.a() - 1;
            }
            int i4 = this.x;
            int i5 = this.f1750g;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.f1746c.size(); i6++) {
                    this.f1746c.get(i6).f1760c = true;
                }
            }
            if (this.f1750g == i2) {
                z4 = false;
            }
            if (this.Q) {
                this.f1750g = i2;
                if (z4) {
                    d(i2);
                }
                requestLayout();
                return;
            }
            c(i2);
            a(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public void a(i iVar) {
        if (this.W == null) {
            this.W = new ArrayList();
        }
        this.W.add(iVar);
    }

    public void a(j jVar) {
        if (this.T == null) {
            this.T = new ArrayList();
        }
        this.T.add(jVar);
    }

    public boolean a(int i2) {
        boolean d2;
        boolean z2;
        View findFocus = findFocus();
        boolean z3 = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z2 = false;
                        break;
                    } else if (parent == this) {
                        z2 = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        if (findNextFocus != null && findNextFocus != view) {
            if (i2 == 17) {
                int i3 = a(this.f1748e, findNextFocus).left;
                int i4 = a(this.f1748e, view).left;
                if (view != null && i3 >= i4) {
                    d2 = c();
                    z3 = d2;
                }
            } else if (i2 == 66) {
                int i5 = a(this.f1748e, findNextFocus).left;
                int i6 = a(this.f1748e, view).left;
                if (view != null && i5 <= i6) {
                    d2 = d();
                    z3 = d2;
                }
            }
            d2 = findNextFocus.requestFocus();
            z3 = d2;
        } else if (i2 == 17 || i2 == 1) {
            z3 = c();
        } else if (i2 == 66 || i2 == 2) {
            z3 = d();
        }
        if (z3) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return z3;
    }

    public boolean a(KeyEvent keyEvent) {
        int i2;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return a(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return a(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return d();
                } else {
                    i2 = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return c();
            } else {
                i2 = 17;
            }
            return a(i2);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean a(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && a(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i2);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f b2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (b2 = b(childAt)) != null && b2.f1759b == this.f1750g) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        f b2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (b2 = b(childAt)) != null && b2.f1759b == this.f1750g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        gVar.a |= c(view);
        if (!this.u) {
            super.addView(view, i2, layoutParams);
        } else if (gVar == null || !gVar.a) {
            gVar.f1765d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* access modifiers changed from: package-private */
    public f b(int i2) {
        for (int i3 = 0; i3 < this.f1746c.size(); i3++) {
            f fVar = this.f1746c.get(i3);
            if (fVar.f1759b == i2) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public f b(View view) {
        for (int i2 = 0; i2 < this.f1746c.size(); i2++) {
            f fVar = this.f1746c.get(i2);
            if (this.f1749f.a(view, fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f1754k = new Scroller(context, i0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.C = viewConfiguration.getScaledPagingTouchSlop();
        this.J = (int) (400.0f * f2);
        this.K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.O = new EdgeEffect(context);
        this.P = new EdgeEffect(context);
        this.L = (int) (25.0f * f2);
        this.M = (int) (2.0f * f2);
        this.A = (int) (f2 * 16.0f);
        b0.a(this, new h());
        if (b0.p(this) == 0) {
            b0.h(this, 1);
        }
        b0.a(this, new d());
    }

    public void b(i iVar) {
        List<i> list = this.W;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void b(j jVar) {
        List<j> list = this.T;
        if (list != null) {
            list.remove(jVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        if (r15 >= 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d1, code lost:
        if (r15 >= 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00df, code lost:
        if (r15 >= 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ea, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013f, code lost:
        if (r4 < r17.f1746c.size()) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014a, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015d, code lost:
        if (r4 < r17.f1746c.size()) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016f, code lost:
        if (r4 < r17.f1746c.size()) goto L_0x0141;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(int r18) {
        /*
        // Method dump skipped, instructions count: 584
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):void");
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        int i2 = this.f1750g;
        if (i2 <= 0) {
            return false;
        }
        a(i2 - 1, true);
        return true;
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.f1749f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.r)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.s));
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f1755l = true;
        if (this.f1754k.isFinished() || !this.f1754k.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f1754k.getCurrX();
        int currY = this.f1754k.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!f(currX)) {
                this.f1754k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        b0.M(this);
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f1749f;
        if (aVar == null || this.f1750g >= aVar.a() - 1) {
            return false;
        }
        a(this.f1750g + 1, true);
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f b2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (b2 = b(childAt)) != null && b2.f1759b == this.f1750g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f1749f) != null && aVar.a() > 1)) {
            if (!this.O.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.r * ((float) width));
                this.O.setSize(height, width);
                z2 = false | this.O.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.P.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.s + 1.0f)) * ((float) width2));
                this.P.setSize(height2, width2);
                z2 |= this.P.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.O.finish();
            this.P.finish();
        }
        if (z2) {
            b0.M(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.o;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        c(this.f1750g);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f1749f;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.c0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((g) this.d0.get(i3).getLayoutParams()).f1767f;
    }

    public int getCurrentItem() {
        return this.f1750g;
    }

    public int getOffscreenPageLimit() {
        return this.x;
    }

    public int getPageMargin() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.e0);
        Scroller scroller = this.f1754k;
        if (scroller != null && !scroller.isFinished()) {
            this.f1754k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.n > 0 && this.o != null && this.f1746c.size() > 0 && this.f1749f != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.n) / f4;
            int i2 = 0;
            f fVar = this.f1746c.get(0);
            float f6 = fVar.f1762e;
            int size = this.f1746c.size();
            int i3 = fVar.f1759b;
            int i4 = this.f1746c.get(size - 1).f1759b;
            while (i3 < i4) {
                while (i3 > fVar.f1759b && i2 < size) {
                    i2++;
                    fVar = this.f1746c.get(i2);
                }
                if (i3 == fVar.f1759b) {
                    float f7 = fVar.f1762e;
                    float f8 = fVar.f1761d;
                    f2 = (f7 + f8) * f4;
                    f6 = f7 + f8 + f5;
                } else {
                    float b2 = this.f1749f.b(i3);
                    f2 = (f6 + b2) * f4;
                    f6 += b2 + f5;
                }
                if (((float) this.n) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.o.setBounds(Math.round(f2), this.p, Math.round(((float) this.n) + f2), this.q);
                    this.o.draw(canvas);
                } else {
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollX + width))) {
                    i3++;
                    f5 = f3;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            i();
            return false;
        }
        if (action != 0) {
            if (this.y) {
                return true;
            }
            if (this.z) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.F = x2;
            this.D = x2;
            float y2 = motionEvent.getY();
            this.G = y2;
            this.E = y2;
            this.H = motionEvent.getPointerId(0);
            this.z = false;
            this.f1755l = true;
            this.f1754k.computeScrollOffset();
            if (this.f0 != 2 || Math.abs(this.f1754k.getFinalX() - this.f1754k.getCurrX()) <= this.M) {
                a(false);
                this.y = false;
            } else {
                this.f1754k.abortAnimation();
                this.w = false;
                e();
                this.y = true;
                c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.H;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x3 = motionEvent.getX(findPointerIndex);
                float f2 = x3 - this.D;
                float abs = Math.abs(f2);
                float y3 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.G);
                int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i3 == 0 || a(this.D, f2) || !a(this, false, (int) f2, (int) x3, (int) y3)) {
                    if (abs > ((float) this.C) && abs * 0.5f > abs2) {
                        this.y = true;
                        c(true);
                        setScrollState(1);
                        float f3 = this.F;
                        float f4 = (float) this.C;
                        this.D = i3 > 0 ? f3 + f4 : f3 - f4;
                        this.E = y3;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) this.C)) {
                        this.z = true;
                    }
                    if (this.y && b(x3)) {
                        b0.M(this);
                    }
                } else {
                    this.D = x3;
                    this.E = y3;
                    this.z = true;
                    return false;
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        return this.y;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        f b2;
        int i6;
        int i7;
        int childCount = getChildCount();
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i10 = paddingBottom;
        int i11 = 0;
        int i12 = paddingTop;
        int i13 = paddingLeft;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.a) {
                    int i15 = gVar.f1763b;
                    int i16 = i15 & 7;
                    int i17 = i15 & 112;
                    if (i16 == 1) {
                        i6 = Math.max((i8 - childAt.getMeasuredWidth()) / 2, i13);
                    } else if (i16 == 3) {
                        i6 = i13;
                        i13 = childAt.getMeasuredWidth() + i13;
                    } else if (i16 != 5) {
                        i6 = i13;
                    } else {
                        i6 = (i8 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i17 == 16) {
                        i7 = Math.max((i9 - childAt.getMeasuredHeight()) / 2, i12);
                    } else if (i17 == 48) {
                        i7 = i12;
                        i12 = childAt.getMeasuredHeight() + i12;
                    } else if (i17 != 80) {
                        i7 = i12;
                    } else {
                        i7 = (i9 - i10) - childAt.getMeasuredHeight();
                        i10 += childAt.getMeasuredHeight();
                    }
                    int i18 = i6 + scrollX;
                    childAt.layout(i18, i7, childAt.getMeasuredWidth() + i18, i7 + childAt.getMeasuredHeight());
                    i11++;
                }
            }
        }
        int i19 = (i8 - i13) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.a && (b2 = b(childAt2)) != null) {
                    float f2 = (float) i19;
                    int i21 = ((int) (b2.f1762e * f2)) + i13;
                    if (gVar2.f1765d) {
                        gVar2.f1765d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * gVar2.f1764c), 1073741824), View.MeasureSpec.makeMeasureSpec((i9 - i12) - i10, 1073741824));
                    }
                    childAt2.layout(i21, i12, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + i12);
                }
            }
        }
        this.p = i12;
        this.q = i9 - i10;
        this.S = i11;
        if (this.Q) {
            z3 = false;
            a(this.f1750g, false, 0, false);
        } else {
            z3 = false;
        }
        this.Q = z3;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f b2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (b2 = b(childAt)) != null && b2.f1759b == this.f1750g && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i4 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.a());
        a aVar = this.f1749f;
        if (aVar != null) {
            aVar.a(mVar.f1770e, mVar.f1771f);
            a(mVar.f1769d, false, true);
            return;
        }
        this.f1751h = mVar.f1769d;
        this.f1752i = mVar.f1770e;
        this.f1753j = mVar.f1771f;
    }

    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f1769d = this.f1750g;
        a aVar = this.f1749f;
        if (aVar != null) {
            mVar.f1770e = aVar.b();
        }
        return mVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.n;
            a(i2, i4, i6, i6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 342
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeView(View view) {
        if (this.u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(a aVar) {
        a aVar2 = this.f1749f;
        if (aVar2 != null) {
            aVar2.b((DataSetObserver) null);
            this.f1749f.b(this);
            for (int i2 = 0; i2 < this.f1746c.size(); i2++) {
                f fVar = this.f1746c.get(i2);
                this.f1749f.a(this, fVar.f1759b, fVar.a);
            }
            this.f1749f.a((ViewGroup) this);
            this.f1746c.clear();
            h();
            this.f1750g = 0;
            scrollTo(0, 0);
        }
        a aVar3 = this.f1749f;
        this.f1749f = aVar;
        this.f1745b = 0;
        if (this.f1749f != null) {
            if (this.f1756m == null) {
                this.f1756m = new l();
            }
            this.f1749f.b(this.f1756m);
            this.w = false;
            boolean z2 = this.Q;
            this.Q = true;
            this.f1745b = this.f1749f.a();
            if (this.f1751h >= 0) {
                this.f1749f.a(this.f1752i, this.f1753j);
                a(this.f1751h, false, true);
                this.f1751h = -1;
                this.f1752i = null;
                this.f1753j = null;
            } else if (!z2) {
                e();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.W;
        if (!(list == null || list.isEmpty())) {
            int size = this.W.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.W.get(i3).a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i2) {
        this.w = false;
        a(i2, !this.Q, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to " + 1);
            i2 = 1;
        }
        if (i2 != this.x) {
            this.x = i2;
            e();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.U = jVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.n;
        this.n = i2;
        int width = getWidth();
        a(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(c.h.d.a.c(getContext(), i2));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i2) {
        if (this.f0 != i2) {
            this.f0 = i2;
            if (this.a0 != null) {
                b(i2 != 0);
            }
            e(i2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o;
    }
}
