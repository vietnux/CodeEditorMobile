package c.f.b.b;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.m;
import c.f.b.b.n;
import c.h.l.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class l extends ConstraintLayout implements r {
    public static boolean B0;
    int A;
    ArrayList<Integer> A0;
    private int B;
    private int C;
    private int D;
    private boolean E;
    HashMap<View, h> F;
    private long G;
    private float H;
    float I;
    float J;
    private long K;
    float L;
    private boolean M;
    boolean N;
    private f O;
    int P;
    c Q;
    private boolean R;
    private c.f.b.a.a S;
    private c T;
    int U;
    int V;
    boolean W;
    float a0;
    float b0;
    long c0;
    float d0;
    private boolean e0;
    private ArrayList<i> f0;
    private ArrayList<i> g0;
    private ArrayList<i> h0;
    private CopyOnWriteArrayList<f> i0;
    private int j0;
    private long k0;
    private float l0;
    private int m0;
    private float n0;
    protected boolean o0;
    float p0;
    private c.f.a.k.a.c q0;
    private boolean r0;
    private e s0;
    private Runnable t0;
    private int[] u0;
    n v;
    int v0;
    Interpolator w;
    private boolean w0;
    Interpolator x;
    g x0;
    float y;
    d y0;
    private int z;
    private boolean z0;

    class a implements Runnable {
        a() {
        }

        public void run() {
            l.this.s0.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a = new int[g.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                c.f.b.b.l$g[] r0 = c.f.b.b.l.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c.f.b.b.l.b.a = r0
                int[] r0 = c.f.b.b.l.b.a     // Catch:{ NoSuchFieldError -> 0x0014 }
                c.f.b.b.l$g r1 = c.f.b.b.l.g.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = c.f.b.b.l.b.a     // Catch:{ NoSuchFieldError -> 0x001f }
                c.f.b.b.l$g r1 = c.f.b.b.l.g.SETUP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = c.f.b.b.l.b.a     // Catch:{ NoSuchFieldError -> 0x002a }
                c.f.b.b.l$g r1 = c.f.b.b.l.g.MOVING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = c.f.b.b.l.b.a     // Catch:{ NoSuchFieldError -> 0x0035 }
                c.f.b.b.l$g r1 = c.f.b.b.l.g.FINISHED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.b.b.l.b.<clinit>():void");
        }
    }

    private class c {
        int[] a;

        /* renamed from: b  reason: collision with root package name */
        float[] f2236b;

        /* renamed from: c  reason: collision with root package name */
        Paint f2237c = new Paint();

        /* renamed from: d  reason: collision with root package name */
        Paint f2238d;

        /* renamed from: e  reason: collision with root package name */
        Paint f2239e;

        /* renamed from: f  reason: collision with root package name */
        Paint f2240f;

        /* renamed from: g  reason: collision with root package name */
        Paint f2241g;

        /* renamed from: h  reason: collision with root package name */
        private float[] f2242h;

        /* renamed from: i  reason: collision with root package name */
        DashPathEffect f2243i;

        /* renamed from: j  reason: collision with root package name */
        Rect f2244j = new Rect();

        /* renamed from: k  reason: collision with root package name */
        boolean f2245k = false;

        /* renamed from: l  reason: collision with root package name */
        int f2246l = 1;

        public c() {
            this.f2237c.setAntiAlias(true);
            this.f2237c.setColor(-21965);
            this.f2237c.setStrokeWidth(2.0f);
            this.f2237c.setStyle(Paint.Style.STROKE);
            this.f2238d = new Paint();
            this.f2238d.setAntiAlias(true);
            this.f2238d.setColor(-2067046);
            this.f2238d.setStrokeWidth(2.0f);
            this.f2238d.setStyle(Paint.Style.STROKE);
            this.f2239e = new Paint();
            this.f2239e.setAntiAlias(true);
            this.f2239e.setColor(-13391360);
            this.f2239e.setStrokeWidth(2.0f);
            this.f2239e.setStyle(Paint.Style.STROKE);
            this.f2240f = new Paint();
            this.f2240f.setAntiAlias(true);
            this.f2240f.setColor(-13391360);
            this.f2240f.setTextSize(l.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f2242h = new float[8];
            this.f2241g = new Paint();
            this.f2241g.setAntiAlias(true);
            this.f2243i = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f2239e.setPathEffect(this.f2243i);
            this.f2236b = new float[100];
            this.a = new int[50];
            if (this.f2245k) {
                this.f2237c.setStrokeWidth(8.0f);
                this.f2241g.setStrokeWidth(8.0f);
                this.f2238d.setStrokeWidth(8.0f);
                this.f2246l = 4;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class d {
        public void a() {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public class e {
        float a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f2248b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        int f2249c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f2250d = -1;

        e() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (!(this.f2249c == -1 && this.f2250d == -1)) {
                int i2 = this.f2249c;
                if (i2 == -1) {
                    l.this.d(this.f2250d);
                } else {
                    int i3 = this.f2250d;
                    if (i3 == -1) {
                        l.this.a(i2, -1, -1);
                    } else {
                        l.this.a(i2, i3);
                    }
                }
                l.this.setState(g.SETUP);
            }
            if (!Float.isNaN(this.f2248b)) {
                l.this.a(this.a, this.f2248b);
                this.a = Float.NaN;
                this.f2248b = Float.NaN;
                this.f2249c = -1;
                this.f2250d = -1;
            } else if (!Float.isNaN(this.a)) {
                l.this.setProgress(this.a);
            }
        }

        public void a(float f2) {
            this.a = f2;
        }

        public void a(int i2) {
            this.f2250d = i2;
        }

        public void a(Bundle bundle) {
            this.a = bundle.getFloat("motion.progress");
            this.f2248b = bundle.getFloat("motion.velocity");
            this.f2249c = bundle.getInt("motion.StartState");
            this.f2250d = bundle.getInt("motion.EndState");
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.a);
            bundle.putFloat("motion.velocity", this.f2248b);
            bundle.putInt("motion.StartState", this.f2249c);
            bundle.putInt("motion.EndState", this.f2250d);
            return bundle;
        }

        public void b(float f2) {
            this.f2248b = f2;
        }

        public void b(int i2) {
            this.f2249c = i2;
        }

        public void c() {
            this.f2250d = l.this.B;
            this.f2249c = l.this.z;
            this.f2248b = l.this.getVelocity();
            this.a = l.this.getProgress();
        }
    }

    public interface f {
        void a(l lVar, int i2);

        void a(l lVar, int i2, int i3);

        void a(l lVar, int i2, int i3, float f2);
    }

    /* access modifiers changed from: package-private */
    public enum g {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private void f() {
        CopyOnWriteArrayList<f> copyOnWriteArrayList;
        if ((this.O != null || ((copyOnWriteArrayList = this.i0) != null && !copyOnWriteArrayList.isEmpty())) && this.n0 != this.I) {
            if (this.m0 != -1) {
                f fVar = this.O;
                if (fVar != null) {
                    fVar.a(this, this.z, this.B);
                }
                CopyOnWriteArrayList<f> copyOnWriteArrayList2 = this.i0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<f> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().a(this, this.z, this.B);
                    }
                }
            }
            this.m0 = -1;
            float f2 = this.I;
            this.n0 = f2;
            f fVar2 = this.O;
            if (fVar2 != null) {
                fVar2.a(this, this.z, this.B, f2);
            }
            CopyOnWriteArrayList<f> copyOnWriteArrayList3 = this.i0;
            if (copyOnWriteArrayList3 != null) {
                Iterator<f> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, this.z, this.B, this.I);
                }
            }
        }
    }

    private void g() {
        CopyOnWriteArrayList<f> copyOnWriteArrayList;
        if (this.O != null || ((copyOnWriteArrayList = this.i0) != null && !copyOnWriteArrayList.isEmpty())) {
            Iterator<Integer> it = this.A0.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                f fVar = this.O;
                if (fVar != null) {
                    fVar.a(this, next.intValue());
                }
                CopyOnWriteArrayList<f> copyOnWriteArrayList2 = this.i0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<f> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().a(this, next.intValue());
                    }
                }
            }
            this.A0.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(float f2) {
        if (this.v != null) {
            float f3 = this.J;
            float f4 = this.I;
            if (f3 != f4 && this.M) {
                this.J = f4;
            }
            if (this.J != f2) {
                this.R = false;
                this.L = f2;
                this.v.c();
                throw null;
            }
        }
    }

    public void a(float f2, float f3) {
        if (!isAttachedToWindow()) {
            if (this.s0 == null) {
                this.s0 = new e();
            }
            this.s0.a(f2);
            this.s0.b(f3);
            return;
        }
        setProgress(f2);
        setState(g.MOVING);
        this.y = f3;
        a(1.0f);
    }

    public void a(int i2, int i3) {
        if (!isAttachedToWindow()) {
            if (this.s0 == null) {
                this.s0 = new e();
            }
            this.s0.b(i2);
            this.s0.a(i3);
            return;
        }
        n nVar = this.v;
        if (nVar != null) {
            this.z = i2;
            this.B = i3;
            nVar.a(i2, i3);
            throw null;
        }
    }

    public void a(int i2, int i3, int i4) {
        setState(g.SETUP);
        this.A = i2;
        this.z = -1;
        this.B = -1;
        androidx.constraintlayout.widget.d dVar = this.f825l;
        if (dVar != null) {
            dVar.a(i2, (float) i3, (float) i4);
            return;
        }
        n nVar = this.v;
        if (nVar != null) {
            nVar.a(i2);
            throw null;
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        m mVar;
        n nVar = this.v;
        if (nVar == null || (mVar = nVar.a) == null) {
            int i6 = this.A;
            if (i6 != i2) {
                if (this.z == i2) {
                    a(0.0f);
                    if (i5 > 0) {
                        this.H = ((float) i5) / 1000.0f;
                    }
                } else if (this.B == i2) {
                    a(1.0f);
                    if (i5 > 0) {
                        this.H = ((float) i5) / 1000.0f;
                    }
                } else {
                    this.B = i2;
                    if (i6 != -1) {
                        a(i6, i2);
                        a(1.0f);
                        this.J = 0.0f;
                        e();
                        if (i5 > 0) {
                            this.H = ((float) i5) / 1000.0f;
                            return;
                        }
                        return;
                    }
                    this.R = false;
                    this.L = 1.0f;
                    this.I = 0.0f;
                    this.J = 0.0f;
                    this.K = getNanoTime();
                    this.G = getNanoTime();
                    this.M = false;
                    this.w = null;
                    if (i5 == -1) {
                        this.v.c();
                        throw null;
                    }
                    this.z = -1;
                    this.v.a(this.z, this.B);
                    throw null;
                }
            }
        } else {
            mVar.a(this.A, i2, (float) i3, (float) i4);
            throw null;
        }
    }

    @Override // c.h.l.q
    public void a(View view, int i2) {
        n nVar = this.v;
        if (nVar != null) {
            float f2 = this.d0;
            if (f2 != 0.0f) {
                nVar.a(this.a0 / f2, this.b0 / f2);
                throw null;
            }
        }
    }

    @Override // c.h.l.q
    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // c.h.l.r
    public void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (!(!this.W && i2 == 0 && i3 == 0)) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
        }
        this.W = false;
    }

    @Override // c.h.l.q
    public void a(View view, int i2, int i3, int[] iArr, int i4) {
        n.a aVar;
        n nVar = this.v;
        if (nVar != null && (aVar = nVar.f2269b) != null) {
            aVar.e();
            throw null;
        }
    }

    @Override // c.h.l.q
    public void a(View view, View view2, int i2, int i3) {
        this.c0 = getNanoTime();
        this.d0 = 0.0f;
        this.a0 = 0.0f;
        this.b0 = 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        float f2;
        boolean z6;
        if (this.K == -1) {
            this.K = getNanoTime();
        }
        float f3 = this.J;
        if (f3 > 0.0f && f3 < 1.0f) {
            this.A = -1;
        }
        if (this.e0 || (this.N && (z2 || this.L != this.J))) {
            float signum = Math.signum(this.L - this.J);
            long nanoTime = getNanoTime();
            float f4 = !(this.w instanceof k) ? ((((float) (nanoTime - this.K)) * signum) * 1.0E-9f) / this.H : 0.0f;
            float f5 = this.J + f4;
            if (this.M) {
                f5 = this.L;
            }
            int i5 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i5 <= 0 || f5 < this.L) && (signum > 0.0f || f5 > this.L)) {
                z4 = false;
            } else {
                f5 = this.L;
                this.N = false;
                z4 = true;
            }
            this.J = f5;
            this.I = f5;
            this.K = nanoTime;
            Interpolator interpolator = this.w;
            if (interpolator == null || z4) {
                this.y = f4;
            } else {
                if (this.R) {
                    f2 = interpolator.getInterpolation(((float) (nanoTime - this.G)) * 1.0E-9f);
                    Interpolator interpolator2 = this.w;
                    c.f.b.a.a aVar = this.S;
                    if (interpolator2 != aVar) {
                        this.J = f2;
                        this.K = nanoTime;
                        if (interpolator2 instanceof k) {
                            float a2 = ((k) interpolator2).a();
                            this.y = a2;
                            int i6 = ((Math.abs(a2) * this.H) > 1.0E-5f ? 1 : ((Math.abs(a2) * this.H) == 1.0E-5f ? 0 : -1));
                            if (a2 <= 0.0f || f2 < 1.0f) {
                                z6 = false;
                            } else {
                                this.J = 1.0f;
                                z6 = false;
                                this.N = false;
                                f2 = 1.0f;
                            }
                            if (a2 < 0.0f && f2 <= 0.0f) {
                                this.J = 0.0f;
                                this.N = z6;
                                f5 = 0.0f;
                            }
                        }
                    } else {
                        aVar.b();
                        throw null;
                    }
                } else {
                    f2 = interpolator.getInterpolation(f5);
                    Interpolator interpolator3 = this.w;
                    this.y = interpolator3 instanceof k ? ((k) interpolator3).a() : ((interpolator3.getInterpolation(f5 + f4) - f2) * signum) / f4;
                }
                f5 = f2;
            }
            if (Math.abs(this.y) > 1.0E-5f) {
                setState(g.MOVING);
            }
            if ((i5 > 0 && f5 >= this.L) || (signum <= 0.0f && f5 <= this.L)) {
                f5 = this.L;
                this.N = false;
            }
            if (f5 >= 1.0f || f5 <= 0.0f) {
                z5 = false;
                this.N = false;
                setState(g.FINISHED);
            } else {
                z5 = false;
            }
            int childCount = getChildCount();
            this.e0 = z5;
            long nanoTime2 = getNanoTime();
            this.p0 = f5;
            Interpolator interpolator4 = this.x;
            float interpolation = interpolator4 == null ? f5 : interpolator4.getInterpolation(f5);
            Interpolator interpolator5 = this.x;
            if (interpolator5 != null) {
                this.y = interpolator5.getInterpolation((signum / this.H) + f5);
                this.y -= this.x.getInterpolation(f5);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                h hVar = this.F.get(childAt);
                if (hVar != null) {
                    this.e0 = hVar.a(childAt, interpolation, nanoTime2, this.q0) | this.e0;
                }
            }
            boolean z7 = (i5 > 0 && f5 >= this.L) || (signum <= 0.0f && f5 <= this.L);
            if (!this.e0 && !this.N && z7) {
                setState(g.FINISHED);
            }
            if (this.o0) {
                requestLayout();
            }
            this.e0 = (!z7) | this.e0;
            if (f5 <= 0.0f && (i4 = this.z) != -1 && this.A != i4) {
                this.A = i4;
                this.v.a(i4);
                throw null;
            } else if (((double) f5) < 1.0d || this.A == (i3 = this.B)) {
                if (this.e0 || this.N) {
                    invalidate();
                } else if ((i5 > 0 && f5 == 1.0f) || (signum < 0.0f && f5 == 0.0f)) {
                    setState(g.FINISHED);
                }
                if (!this.e0 && !this.N && ((i5 > 0 && f5 == 1.0f) || (signum < 0.0f && f5 == 0.0f))) {
                    c();
                }
            } else {
                this.A = i3;
                this.v.a(i3);
                throw null;
            }
        }
        float f6 = this.J;
        if (f6 >= 1.0f) {
            z3 = this.A != this.B;
            i2 = this.B;
        } else if (f6 <= 0.0f) {
            z3 = this.A != this.z;
            i2 = this.z;
        } else {
            z3 = false;
            this.z0 |= z3;
            if (z3 && !this.r0) {
                requestLayout();
            }
            this.I = this.J;
        }
        this.A = i2;
        this.z0 |= z3;
        requestLayout();
        this.I = this.J;
    }

    /* access modifiers changed from: protected */
    public void b() {
        int i2;
        CopyOnWriteArrayList<f> copyOnWriteArrayList;
        if ((this.O != null || ((copyOnWriteArrayList = this.i0) != null && !copyOnWriteArrayList.isEmpty())) && this.m0 == -1) {
            this.m0 = this.A;
            if (!this.A0.isEmpty()) {
                ArrayList<Integer> arrayList = this.A0;
                i2 = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i2 = -1;
            }
            int i3 = this.A;
            if (!(i2 == i3 || i3 == -1)) {
                this.A0.add(Integer.valueOf(i3));
            }
        }
        g();
        Runnable runnable = this.t0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.u0;
        if (iArr != null && this.v0 > 0) {
            d(iArr[0]);
            int[] iArr2 = this.u0;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.v0--;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void b(int i2) {
        this.f825l = null;
    }

    public void b(int i2, int i3, int i4) {
        a(i2, i3, i4, -1);
    }

    @Override // c.h.l.q
    public boolean b(View view, View view2, int i2, int i3) {
        n.a aVar;
        n nVar = this.v;
        if (nVar == null || (aVar = nVar.f2269b) == null) {
            return false;
        }
        aVar.d();
        throw null;
    }

    public n.a c(int i2) {
        this.v.b(i2);
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        n nVar = this.v;
        if (nVar != null) {
            nVar.a(this, this.A);
            throw null;
        }
    }

    public void d() {
        this.y0.a();
        throw null;
    }

    public void d(int i2) {
        if (!isAttachedToWindow()) {
            if (this.s0 == null) {
                this.s0 = new e();
            }
            this.s0.a(i2);
            return;
        }
        b(i2, -1, -1);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cd  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r11) {
        /*
        // Method dump skipped, instructions count: 295
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.b.l.dispatchDraw(android.graphics.Canvas):void");
    }

    public void e() {
        a(1.0f);
        this.t0 = null;
    }

    public int[] getConstraintSetIds() {
        n nVar = this.v;
        if (nVar == null) {
            return null;
        }
        nVar.a();
        throw null;
    }

    public int getCurrentState() {
        return this.A;
    }

    public ArrayList<n.a> getDefinedTransitions() {
        n nVar = this.v;
        if (nVar == null) {
            return null;
        }
        nVar.b();
        throw null;
    }

    public c getDesignTool() {
        if (this.T == null) {
            this.T = new c(this);
        }
        return this.T;
    }

    public int getEndState() {
        return this.B;
    }

    /* access modifiers changed from: protected */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.J;
    }

    public int getStartState() {
        return this.z;
    }

    public float getTargetPosition() {
        return this.L;
    }

    public Bundle getTransitionState() {
        if (this.s0 == null) {
            this.s0 = new e();
        }
        this.s0.c();
        return this.s0.b();
    }

    public long getTransitionTimeMs() {
        n nVar = this.v;
        if (nVar == null) {
            return (long) (this.H * 1000.0f);
        }
        nVar.c();
        throw null;
    }

    public float getVelocity() {
        return this.y;
    }

    public boolean isAttachedToWindow() {
        return Build.VERSION.SDK_INT >= 19 ? super.isAttachedToWindow() : getWindowToken() != null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        n.a aVar;
        int i2;
        Display display;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 17 && (display = getDisplay()) != null) {
            display.getRotation();
        }
        n nVar = this.v;
        if (nVar == null || (i2 = this.A) == -1) {
            c();
            e eVar = this.s0;
            if (eVar == null) {
                n nVar2 = this.v;
                if (nVar2 != null && (aVar = nVar2.f2269b) != null) {
                    aVar.a();
                    throw null;
                }
            } else if (this.w0) {
                post(new a());
            } else {
                eVar.a();
            }
        } else {
            nVar.a(i2);
            throw null;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        n nVar = this.v;
        if (nVar == null || !this.E) {
            return false;
        }
        q qVar = nVar.f2270c;
        if (qVar == null) {
            n.a aVar = nVar.f2269b;
            if (aVar == null) {
                return false;
            }
            aVar.e();
            throw null;
        }
        qVar.a(motionEvent);
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.r0 = true;
        try {
            if (this.v == null) {
                super.onLayout(z2, i2, i3, i4, i5);
                return;
            }
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (!(this.U == i6 && this.V == i7)) {
                d();
                a(true);
            }
            this.U = i6;
            this.V = i7;
            this.r0 = false;
        } finally {
            this.r0 = false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onMeasure(int i2, int i3) {
        if (this.v == null) {
            super.onMeasure(i2, i3);
            return;
        }
        if (this.C == i2) {
            int i4 = this.D;
        }
        if (this.z0) {
            this.z0 = false;
            c();
            g();
        }
        boolean z2 = this.f822i;
        this.C = i2;
        this.D = i3;
        this.v.e();
        throw null;
    }

    @Override // c.h.l.s
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return false;
    }

    @Override // c.h.l.s
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onRtlPropertiesChanged(int i2) {
        n nVar = this.v;
        if (nVar != null) {
            nVar.a(a());
            throw null;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        n nVar = this.v;
        if (nVar == null || !this.E) {
            return super.onTouchEvent(motionEvent);
        }
        nVar.f();
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof i) {
            i iVar = (i) view;
            if (this.i0 == null) {
                this.i0 = new CopyOnWriteArrayList<>();
            }
            this.i0.add(iVar);
            if (iVar.e()) {
                if (this.f0 == null) {
                    this.f0 = new ArrayList<>();
                }
                this.f0.add(iVar);
            }
            if (iVar.d()) {
                if (this.g0 == null) {
                    this.g0 = new ArrayList<>();
                }
                this.g0.add(iVar);
            }
            if (iVar.c()) {
                if (this.h0 == null) {
                    this.h0 = new ArrayList<>();
                }
                this.h0.add(iVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<i> arrayList = this.f0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<i> arrayList2 = this.g0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void requestLayout() {
        n nVar;
        n.a aVar;
        if (this.o0 || this.A != -1 || (nVar = this.v) == null || (aVar = nVar.f2269b) == null) {
            super.requestLayout();
        } else {
            aVar.b();
            throw null;
        }
    }

    public void setDebugMode(int i2) {
        this.P = i2;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z2) {
        this.w0 = z2;
    }

    public void setInteractionEnabled(boolean z2) {
        this.E = z2;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.v == null) {
            setProgress(f2);
            return;
        }
        setState(g.MOVING);
        this.v.d();
        throw null;
    }

    public void setOnHide(float f2) {
        ArrayList<i> arrayList = this.g0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.g0.get(i2).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<i> arrayList = this.f0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f0.get(i2).setProgress(f2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r5.J == 0.0f) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r5.J == 1.0f) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setProgress(float r6) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.b.l.setProgress(float):void");
    }

    public void setScene(n nVar) {
        this.v = nVar;
        this.v.a(a());
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void setStartState(int i2) {
        if (!isAttachedToWindow()) {
            if (this.s0 == null) {
                this.s0 = new e();
            }
            this.s0.b(i2);
            this.s0.a(i2);
            return;
        }
        this.A = i2;
    }

    /* access modifiers changed from: package-private */
    public void setState(g gVar) {
        if (gVar != g.FINISHED || this.A != -1) {
            g gVar2 = this.x0;
            this.x0 = gVar;
            g gVar3 = g.MOVING;
            if (gVar2 == gVar3 && gVar == gVar3) {
                f();
            }
            int i2 = b.a[gVar2.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (gVar == g.MOVING) {
                    f();
                }
                if (gVar != g.FINISHED) {
                    return;
                }
            } else if (!(i2 == 3 && gVar == g.FINISHED)) {
                return;
            }
            b();
        }
    }

    public void setTransition(int i2) {
        if (this.v != null) {
            c(i2).c();
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void setTransition(n.a aVar) {
        this.v.a(aVar);
        throw null;
    }

    public void setTransitionDuration(int i2) {
        n nVar = this.v;
        if (nVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            nVar.c(i2);
            throw null;
        }
    }

    public void setTransitionListener(f fVar) {
        this.O = fVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.s0 == null) {
            this.s0 = new e();
        }
        this.s0.a(bundle);
        if (isAttachedToWindow()) {
            this.s0.a();
        }
    }

    public String toString() {
        Context context = getContext();
        return b.a(context, this.z) + "->" + b.a(context, this.B) + " (pos:" + this.J + " Dpos/Dt:" + this.y;
    }
}
