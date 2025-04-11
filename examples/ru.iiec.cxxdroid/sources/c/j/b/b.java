package c.j.b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import c.h.l.b0;
import java.util.Arrays;

public class b {
    private static final Interpolator x = new a();
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private int f2475b;

    /* renamed from: c  reason: collision with root package name */
    private int f2476c = -1;

    /* renamed from: d  reason: collision with root package name */
    private float[] f2477d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f2478e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f2479f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f2480g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f2481h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f2482i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f2483j;

    /* renamed from: k  reason: collision with root package name */
    private int f2484k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f2485l;

    /* renamed from: m  reason: collision with root package name */
    private float f2486m;
    private float n;
    private int o;
    private final int p;
    private int q;
    private OverScroller r;
    private final c s;
    private View t;
    private boolean u;
    private final ViewGroup v;
    private final Runnable w = new RunnableC0055b();

    class a implements Interpolator {
        a() {
        }

        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* renamed from: c.j.b.b$b  reason: collision with other inner class name */
    class RunnableC0055b implements Runnable {
        RunnableC0055b() {
        }

        public void run() {
            b.this.c(0);
        }
    }

    public static abstract class c {
        public int a(int i2) {
            return i2;
        }

        public int a(View view) {
            return 0;
        }

        public abstract int a(View view, int i2, int i3);

        public void a(int i2, int i3) {
        }

        public abstract void a(View view, float f2, float f3);

        public void a(View view, int i2) {
        }

        public abstract void a(View view, int i2, int i3, int i4, int i5);

        public int b(View view) {
            return 0;
        }

        public abstract int b(View view, int i2, int i3);

        public void b(int i2, int i3) {
        }

        public boolean b(int i2) {
            return false;
        }

        public abstract boolean b(View view, int i2);

        public abstract void c(int i2);
    }

    private b(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.v = viewGroup;
            this.s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.o = this.p;
            this.f2475b = viewConfiguration.getScaledTouchSlop();
            this.f2486m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private float a(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    private int a(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    private int a(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int a2 = a(i4, (int) this.n, (int) this.f2486m);
        int a3 = a(i5, (int) this.n, (int) this.f2486m);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(a2);
        int abs4 = Math.abs(a3);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        if (a2 != 0) {
            f3 = (float) abs3;
            f2 = (float) i6;
        } else {
            f3 = (float) abs;
            f2 = (float) i7;
        }
        float f6 = f3 / f2;
        if (a3 != 0) {
            f5 = (float) abs4;
            f4 = (float) i6;
        } else {
            f5 = (float) abs2;
            f4 = (float) i7;
        }
        float f7 = f5 / f4;
        return (int) ((((float) b(i2, a2, this.s.a(view))) * f6) + (((float) b(i3, a3, this.s.b(view))) * f7));
    }

    public static b a(ViewGroup viewGroup, float f2, c cVar) {
        b a2 = a(viewGroup, cVar);
        a2.f2475b = (int) (((float) a2.f2475b) * (1.0f / f2));
        return a2;
    }

    public static b a(ViewGroup viewGroup, c cVar) {
        return new b(viewGroup.getContext(), viewGroup, cVar);
    }

    private void a(float f2, float f3) {
        this.u = true;
        this.s.a(this.t, f2, f3);
        this.u = false;
        if (this.a == 1) {
            c(0);
        }
    }

    private void a(float f2, float f3, int i2) {
        int i3 = 1;
        if (!a(f2, f3, i2, 1)) {
            i3 = 0;
        }
        if (a(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (a(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (a(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.f2482i;
            iArr[i2] = iArr[i2] | i3;
            this.s.a(i3, i2);
        }
    }

    private void a(int i2, int i3, int i4, int i5) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        if (i4 != 0) {
            i2 = this.s.a(this.t, i2, i4);
            b0.d(this.t, i2 - left);
        }
        if (i5 != 0) {
            i3 = this.s.b(this.t, i3, i5);
            b0.e(this.t, i3 - top);
        }
        if (i4 != 0 || i5 != 0) {
            this.s.a(this.t, i2, i3, i2 - left, i3 - top);
        }
    }

    private boolean a(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.f2481h[i2] & i3) != i3 || (this.q & i3) == 0 || (this.f2483j[i2] & i3) == i3 || (this.f2482i[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f2475b;
        if (abs <= ((float) i4) && abs2 <= ((float) i4)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.s.b(i3)) {
            return (this.f2482i[i2] & i3) == 0 && abs > ((float) this.f2475b);
        }
        int[] iArr = this.f2483j;
        iArr[i2] = iArr[i2] | i3;
        return false;
    }

    private boolean a(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.s.a(view) > 0;
        boolean z2 = this.s.b(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f2475b) : z2 && Math.abs(f3) > ((float) this.f2475b);
        }
        int i2 = this.f2475b;
        return (f2 * f2) + (f3 * f3) > ((float) (i2 * i2));
    }

    private float b(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    private int b(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        float f2 = (float) (width / 2);
        float b2 = f2 + (b(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))) * f2);
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(b2 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f), 600);
    }

    private void b(float f2, float f3, int i2) {
        g(i2);
        float[] fArr = this.f2477d;
        this.f2479f[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.f2478e;
        this.f2480g[i2] = f3;
        fArr2[i2] = f3;
        this.f2481h[i2] = e((int) f2, (int) f3);
        this.f2484k |= 1 << i2;
    }

    private boolean b(int i2, int i3, int i4, int i5) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.r.abortAnimation();
            c(0);
            return false;
        }
        this.r.startScroll(left, top, i6, i7, a(this.t, i6, i7, i4, i5));
        c(2);
        return true;
    }

    private void c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (h(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f2479f[pointerId] = x2;
                this.f2480g[pointerId] = y;
            }
        }
    }

    private int e(int i2, int i3) {
        int i4 = i2 < this.v.getLeft() + this.o ? 1 : 0;
        if (i3 < this.v.getTop() + this.o) {
            i4 |= 4;
        }
        if (i2 > this.v.getRight() - this.o) {
            i4 |= 2;
        }
        return i3 > this.v.getBottom() - this.o ? i4 | 8 : i4;
    }

    private void f(int i2) {
        if (this.f2477d != null && b(i2)) {
            this.f2477d[i2] = 0.0f;
            this.f2478e[i2] = 0.0f;
            this.f2479f[i2] = 0.0f;
            this.f2480g[i2] = 0.0f;
            this.f2481h[i2] = 0;
            this.f2482i[i2] = 0;
            this.f2483j[i2] = 0;
            this.f2484k = (~(1 << i2)) & this.f2484k;
        }
    }

    private void g() {
        float[] fArr = this.f2477d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2478e, 0.0f);
            Arrays.fill(this.f2479f, 0.0f);
            Arrays.fill(this.f2480g, 0.0f);
            Arrays.fill(this.f2481h, 0);
            Arrays.fill(this.f2482i, 0);
            Arrays.fill(this.f2483j, 0);
            this.f2484k = 0;
        }
    }

    private void g(int i2) {
        float[] fArr = this.f2477d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            float[] fArr6 = this.f2477d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f2478e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f2479f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f2480g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f2481h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2482i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2483j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2477d = fArr2;
            this.f2478e = fArr3;
            this.f2479f = fArr4;
            this.f2480g = fArr5;
            this.f2481h = iArr;
            this.f2482i = iArr2;
            this.f2483j = iArr3;
        }
    }

    private void h() {
        this.f2485l.computeCurrentVelocity(1000, this.f2486m);
        a(a(this.f2485l.getXVelocity(this.f2476c), this.n, this.f2486m), a(this.f2485l.getYVelocity(this.f2476c), this.n, this.f2486m));
    }

    private boolean h(int i2) {
        if (b(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public void a() {
        this.f2476c = -1;
        g();
        VelocityTracker velocityTracker = this.f2485l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2485l = null;
        }
    }

    public void a(float f2) {
        this.n = f2;
    }

    public void a(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2485l == null) {
            this.f2485l = VelocityTracker.obtain();
        }
        this.f2485l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i3 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i3);
                            if (h(pointerId)) {
                                float x2 = motionEvent.getX(i3);
                                float y = motionEvent.getY(i3);
                                float f2 = x2 - this.f2477d[pointerId];
                                float f3 = y - this.f2478e[pointerId];
                                a(f2, f3, pointerId);
                                if (this.a != 1) {
                                    View b2 = b((int) x2, (int) y);
                                    if (a(b2, f2, f3) && b(b2, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i3++;
                        }
                    } else if (h(this.f2476c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f2476c);
                        float x3 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f2479f;
                        int i4 = this.f2476c;
                        int i5 = (int) (x3 - fArr[i4]);
                        int i6 = (int) (y2 - this.f2480g[i4]);
                        a(this.t.getLeft() + i5, this.t.getTop() + i6, i5, i6);
                    } else {
                        return;
                    }
                    c(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x4 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        b(x4, y3, pointerId2);
                        if (this.a == 0) {
                            b(b((int) x4, (int) y3), pointerId2);
                            int i7 = this.f2481h[pointerId2];
                            int i8 = this.q;
                            if ((i7 & i8) != 0) {
                                this.s.b(i7 & i8, pointerId2);
                                return;
                            }
                            return;
                        } else if (c((int) x4, (int) y3)) {
                            b(this.t, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.a == 1 && pointerId3 == this.f2476c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i3 >= pointerCount2) {
                                    i2 = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i3);
                                if (pointerId4 != this.f2476c) {
                                    View b3 = b((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                                    View view = this.t;
                                    if (b3 == view && b(view, pointerId4)) {
                                        i2 = this.f2476c;
                                        break;
                                    }
                                }
                                i3++;
                            }
                            if (i2 == -1) {
                                h();
                            }
                        }
                        f(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.a == 1) {
                    a(0.0f, 0.0f);
                }
            } else if (this.a == 1) {
                h();
            }
            a();
            return;
        }
        float x5 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View b4 = b((int) x5, (int) y4);
        b(x5, y4, pointerId5);
        b(b4, pointerId5);
        int i9 = this.f2481h[pointerId5];
        int i10 = this.q;
        if ((i9 & i10) != 0) {
            this.s.b(i9 & i10, pointerId5);
        }
    }

    public void a(View view, int i2) {
        if (view.getParent() == this.v) {
            this.t = view;
            this.f2476c = i2;
            this.s.a(view, i2);
            c(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.v + ")");
    }

    public boolean a(int i2) {
        int length = this.f2477d.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (a(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean a(int i2, int i3) {
        if (!b(i3)) {
            return false;
        }
        boolean z = (i2 & 1) == 1;
        boolean z2 = (i2 & 2) == 2;
        float f2 = this.f2479f[i3] - this.f2477d[i3];
        float f3 = this.f2480g[i3] - this.f2478e[i3];
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f2475b) : z2 && Math.abs(f3) > ((float) this.f2475b);
        }
        int i4 = this.f2475b;
        return (f2 * f2) + (f3 * f3) > ((float) (i4 * i4));
    }

    public boolean a(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    public boolean a(boolean z) {
        if (this.a == 2) {
            boolean computeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                b0.d(this.t, left);
            }
            if (top != 0) {
                b0.e(this.t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.s.a(this.t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.v.post(this.w);
                } else {
                    c(0);
                }
            }
        }
        return this.a == 2;
    }

    public View b() {
        return this.t;
    }

    public View b(int i2, int i3) {
        for (int childCount = this.v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.v;
            this.s.a(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean b(int i2) {
        return ((1 << i2) & this.f2484k) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(android.view.MotionEvent r17) {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: c.j.b.b.b(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view, int i2) {
        if (view == this.t && this.f2476c == i2) {
            return true;
        }
        if (view == null || !this.s.b(view, i2)) {
            return false;
        }
        this.f2476c = i2;
        a(view, i2);
        return true;
    }

    public boolean b(View view, int i2, int i3) {
        this.t = view;
        this.f2476c = -1;
        boolean b2 = b(i2, i3, 0, 0);
        if (!b2 && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return b2;
    }

    public int c() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        this.v.removeCallbacks(this.w);
        if (this.a != i2) {
            this.a = i2;
            this.s.c(i2);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }

    public boolean c(int i2, int i3) {
        return a(this.t, i2, i3);
    }

    public int d() {
        return this.o;
    }

    public void d(int i2) {
        this.o = i2;
    }

    public boolean d(int i2, int i3) {
        if (this.u) {
            return b(i2, i3, (int) this.f2485l.getXVelocity(this.f2476c), (int) this.f2485l.getYVelocity(this.f2476c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public int e() {
        return this.f2475b;
    }

    public void e(int i2) {
        this.q = i2;
    }

    public int f() {
        return this.a;
    }
}
