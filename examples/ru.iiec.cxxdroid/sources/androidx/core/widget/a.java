package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import c.h.l.b0;

public abstract class a implements View.OnTouchListener {
    private static final int s = ViewConfiguration.getTapTimeout();

    /* renamed from: b  reason: collision with root package name */
    final C0017a f1099b = new C0017a();

    /* renamed from: c  reason: collision with root package name */
    private final Interpolator f1100c = new AccelerateInterpolator();

    /* renamed from: d  reason: collision with root package name */
    final View f1101d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f1102e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f1103f = {0.0f, 0.0f};

    /* renamed from: g  reason: collision with root package name */
    private float[] f1104g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: h  reason: collision with root package name */
    private int f1105h;

    /* renamed from: i  reason: collision with root package name */
    private int f1106i;

    /* renamed from: j  reason: collision with root package name */
    private float[] f1107j = {0.0f, 0.0f};

    /* renamed from: k  reason: collision with root package name */
    private float[] f1108k = {0.0f, 0.0f};

    /* renamed from: l  reason: collision with root package name */
    private float[] f1109l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: m  reason: collision with root package name */
    private boolean f1110m;
    boolean n;
    boolean o;
    boolean p;
    private boolean q;
    private boolean r;

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    public static class C0017a {
        private int a;

        /* renamed from: b  reason: collision with root package name */
        private int f1111b;

        /* renamed from: c  reason: collision with root package name */
        private float f1112c;

        /* renamed from: d  reason: collision with root package name */
        private float f1113d;

        /* renamed from: e  reason: collision with root package name */
        private long f1114e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        private long f1115f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f1116g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f1117h = 0;

        /* renamed from: i  reason: collision with root package name */
        private long f1118i = -1;

        /* renamed from: j  reason: collision with root package name */
        private float f1119j;

        /* renamed from: k  reason: collision with root package name */
        private int f1120k;

        C0017a() {
        }

        private float a(float f2) {
            return (-4.0f * f2 * f2) + (f2 * 4.0f);
        }

        private float a(long j2) {
            if (j2 < this.f1114e) {
                return 0.0f;
            }
            long j3 = this.f1118i;
            if (j3 < 0 || j2 < j3) {
                return a.a(((float) (j2 - this.f1114e)) / ((float) this.a), 0.0f, 1.0f) * 0.5f;
            }
            long j4 = j2 - j3;
            float f2 = this.f1119j;
            return (1.0f - f2) + (f2 * a.a(((float) j4) / ((float) this.f1120k), 0.0f, 1.0f));
        }

        public void a() {
            if (this.f1115f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a2 = a(a(currentAnimationTimeMillis));
                this.f1115f = currentAnimationTimeMillis;
                float f2 = ((float) (currentAnimationTimeMillis - this.f1115f)) * a2;
                this.f1116g = (int) (this.f1112c * f2);
                this.f1117h = (int) (f2 * this.f1113d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public void a(float f2, float f3) {
            this.f1112c = f2;
            this.f1113d = f3;
        }

        public void a(int i2) {
            this.f1111b = i2;
        }

        public int b() {
            return this.f1116g;
        }

        public void b(int i2) {
            this.a = i2;
        }

        public int c() {
            return this.f1117h;
        }

        public int d() {
            float f2 = this.f1112c;
            return (int) (f2 / Math.abs(f2));
        }

        public int e() {
            float f2 = this.f1113d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean f() {
            return this.f1118i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1118i + ((long) this.f1120k);
        }

        public void g() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1120k = a.a((int) (currentAnimationTimeMillis - this.f1114e), 0, this.f1111b);
            this.f1119j = a(currentAnimationTimeMillis);
            this.f1118i = currentAnimationTimeMillis;
        }

        public void h() {
            this.f1114e = AnimationUtils.currentAnimationTimeMillis();
            this.f1118i = -1;
            this.f1115f = this.f1114e;
            this.f1119j = 0.5f;
            this.f1116g = 0;
            this.f1117h = 0;
        }
    }

    /* access modifiers changed from: private */
    public class b implements Runnable {
        b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.p) {
                if (aVar.n) {
                    aVar.n = false;
                    aVar.f1099b.h();
                }
                C0017a aVar2 = a.this.f1099b;
                if (aVar2.f() || !a.this.b()) {
                    a.this.p = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.o) {
                    aVar3.o = false;
                    aVar3.a();
                }
                aVar2.a();
                a.this.a(aVar2.b(), aVar2.c());
                b0.a(a.this.f1101d, this);
            }
        }
    }

    public a(View view) {
        this.f1101d = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (float) ((int) ((1575.0f * f2) + 0.5f));
        b(f3, f3);
        float f4 = (float) ((int) ((f2 * 315.0f) + 0.5f));
        c(f4, f4);
        d(1);
        a(Float.MAX_VALUE, Float.MAX_VALUE);
        d(0.2f, 0.2f);
        e(1.0f, 1.0f);
        c(s);
        f(500);
        e(500);
    }

    static float a(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    private float a(float f2, float f3, float f4, float f5) {
        float f6;
        float a = a(f2 * f3, 0.0f, f4);
        float f7 = f(f3 - f5, a) - f(f5, a);
        if (f7 < 0.0f) {
            f6 = -this.f1100c.getInterpolation(-f7);
        } else if (f7 <= 0.0f) {
            return 0.0f;
        } else {
            f6 = this.f1100c.getInterpolation(f7);
        }
        return a(f6, -1.0f, 1.0f);
    }

    private float a(int i2, float f2, float f3, float f4) {
        float a = a(this.f1103f[i2], f3, this.f1104g[i2], f2);
        int i3 = (a > 0.0f ? 1 : (a == 0.0f ? 0 : -1));
        if (i3 == 0) {
            return 0.0f;
        }
        float f5 = this.f1107j[i2];
        float f6 = this.f1108k[i2];
        float f7 = this.f1109l[i2];
        float f8 = f5 * f4;
        return i3 > 0 ? a(a * f8, f6, f7) : -a((-a) * f8, f6, f7);
    }

    static int a(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private void c() {
        if (this.n) {
            this.p = false;
        } else {
            this.f1099b.g();
        }
    }

    private void d() {
        int i2;
        if (this.f1102e == null) {
            this.f1102e = new b();
        }
        this.p = true;
        this.n = true;
        if (this.f1110m || (i2 = this.f1106i) <= 0) {
            this.f1102e.run();
        } else {
            b0.a(this.f1101d, this.f1102e, (long) i2);
        }
        this.f1110m = true;
    }

    private float f(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f1105h;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                return f2 >= 0.0f ? 1.0f - (f2 / f3) : (!this.p || this.f1105h != 1) ? 0.0f : 1.0f;
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
    }

    public a a(float f2, float f3) {
        float[] fArr = this.f1104g;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a a(boolean z) {
        if (this.q && !z) {
            c();
        }
        this.q = z;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1101d.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void a(int i2, int i3);

    public abstract boolean a(int i2);

    public a b(float f2, float f3) {
        float[] fArr = this.f1109l;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        C0017a aVar = this.f1099b;
        int e2 = aVar.e();
        int d2 = aVar.d();
        return (e2 != 0 && b(e2)) || (d2 != 0 && a(d2));
    }

    public abstract boolean b(int i2);

    public a c(float f2, float f3) {
        float[] fArr = this.f1108k;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a c(int i2) {
        this.f1106i = i2;
        return this;
    }

    public a d(float f2, float f3) {
        float[] fArr = this.f1103f;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a d(int i2) {
        this.f1105h = i2;
        return this;
    }

    public a e(float f2, float f3) {
        float[] fArr = this.f1107j;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a e(int i2) {
        this.f1099b.a(i2);
        return this;
    }

    public a f(int i2) {
        this.f1099b.b(i2);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.c()
            goto L_0x0058
        L_0x001a:
            r5.o = r2
            r5.f1110m = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1101d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1101d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f1099b
            r7.a(r0, r6)
            boolean r6 = r5.p
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.b()
            if (r6 == 0) goto L_0x0058
            r5.d()
        L_0x0058:
            boolean r6 = r5.r
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.p
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
