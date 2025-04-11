package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.w0;
import c.a.j;
import c.h.j.d;
import c.h.l.b0;
import e.b.b.b.k.a;

public final class c {
    private static final boolean S = (Build.VERSION.SDK_INT < 18);
    private static final Paint T = null;
    private Paint A;
    private float B;
    private float C;
    private float D;
    private float E;
    private int[] F;
    private boolean G;
    private final TextPaint H;
    private TimeInterpolator I;
    private TimeInterpolator J;
    private float K;
    private float L;
    private float M;
    private int N;
    private float O;
    private float P;
    private float Q;
    private int R;
    private final View a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6418b;

    /* renamed from: c  reason: collision with root package name */
    private float f6419c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f6420d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f6421e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f6422f;

    /* renamed from: g  reason: collision with root package name */
    private int f6423g = 16;

    /* renamed from: h  reason: collision with root package name */
    private int f6424h = 16;

    /* renamed from: i  reason: collision with root package name */
    private float f6425i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    private float f6426j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f6427k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f6428l;

    /* renamed from: m  reason: collision with root package name */
    private float f6429m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private Typeface s;
    private Typeface t;
    private Typeface u;
    private CharSequence v;
    private CharSequence w;
    private boolean x;
    private boolean y;
    private Bitmap z;

    static {
        Paint paint = T;
        if (paint != null) {
            paint.setAntiAlias(true);
            T.setColor(-65281);
        }
    }

    public c(View view) {
        this.a = view;
        this.H = new TextPaint(129);
        new TextPaint(this.H);
        this.f6421e = new Rect();
        this.f6420d = new Rect();
        this.f6422f = new RectF();
    }

    private static float a(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return a.a(f2, f3, f4);
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f3) + (((float) Color.alpha(i3)) * f2)), (int) ((((float) Color.red(i2)) * f3) + (((float) Color.red(i3)) * f2)), (int) ((((float) Color.green(i2)) * f3) + (((float) Color.green(i3)) * f2)), (int) ((((float) Color.blue(i2)) * f3) + (((float) Color.blue(i3)) * f2)));
    }

    private static boolean a(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    private static boolean a(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    private void b(float f2) {
        int i2;
        TextPaint textPaint;
        d(f2);
        this.q = a(this.o, this.p, f2, this.I);
        this.r = a(this.f6429m, this.n, f2, this.I);
        e(a(this.f6425i, this.f6426j, f2, this.J));
        if (this.f6428l != this.f6427k) {
            textPaint = this.H;
            i2 = a(n(), c(), f2);
        } else {
            textPaint = this.H;
            i2 = c();
        }
        textPaint.setColor(i2);
        this.H.setShadowLayer(a(this.O, this.K, f2, (TimeInterpolator) null), a(this.P, this.L, f2, (TimeInterpolator) null), a(this.Q, this.M, f2, (TimeInterpolator) null), a(this.R, this.N, f2));
        b0.M(this.a);
    }

    private boolean b(CharSequence charSequence) {
        boolean z2 = true;
        if (b0.r(this.a) != 1) {
            z2 = false;
        }
        return (z2 ? d.f2364b : d.a).a(charSequence, 0, charSequence.length());
    }

    private void c(float f2) {
        boolean z2;
        float f3;
        boolean z3;
        if (this.v != null) {
            float width = (float) this.f6421e.width();
            float width2 = (float) this.f6420d.width();
            boolean z4 = true;
            if (a(f2, this.f6426j)) {
                float f4 = this.f6426j;
                this.D = 1.0f;
                Typeface typeface = this.u;
                Typeface typeface2 = this.s;
                if (typeface != typeface2) {
                    this.u = typeface2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                f3 = f4;
                z2 = z3;
            } else {
                f3 = this.f6425i;
                Typeface typeface3 = this.u;
                Typeface typeface4 = this.t;
                if (typeface3 != typeface4) {
                    this.u = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (a(f2, this.f6425i)) {
                    this.D = 1.0f;
                } else {
                    this.D = f2 / this.f6425i;
                }
                float f5 = this.f6426j / this.f6425i;
                width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
            }
            if (width > 0.0f) {
                z2 = this.E != f3 || this.G || z2;
                this.E = f3;
                this.G = false;
            }
            if (this.w == null || z2) {
                this.H.setTextSize(this.E);
                this.H.setTypeface(this.u);
                TextPaint textPaint = this.H;
                if (this.D == 1.0f) {
                    z4 = false;
                }
                textPaint.setLinearText(z4);
                CharSequence ellipsize = TextUtils.ellipsize(this.v, this.H, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.w)) {
                    this.w = ellipsize;
                    this.x = b(this.w);
                }
            }
        }
    }

    private void d(float f2) {
        this.f6422f.left = a((float) this.f6420d.left, (float) this.f6421e.left, f2, this.I);
        this.f6422f.top = a(this.f6429m, this.n, f2, this.I);
        this.f6422f.right = a((float) this.f6420d.right, (float) this.f6421e.right, f2, this.I);
        this.f6422f.bottom = a((float) this.f6420d.bottom, (float) this.f6421e.bottom, f2, this.I);
    }

    private Typeface e(int i2) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(i2, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void e(float f2) {
        c(f2);
        this.y = S && this.D != 1.0f;
        if (this.y) {
            m();
        }
        b0.M(this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j() {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.c.j():void");
    }

    private void k() {
        b(this.f6419c);
    }

    private void l() {
        Bitmap bitmap = this.z;
        if (bitmap != null) {
            bitmap.recycle();
            this.z = null;
        }
    }

    private void m() {
        if (this.z == null && !this.f6420d.isEmpty() && !TextUtils.isEmpty(this.w)) {
            b(0.0f);
            this.B = this.H.ascent();
            this.C = this.H.descent();
            TextPaint textPaint = this.H;
            CharSequence charSequence = this.w;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.C - this.B);
            if (round > 0 && round2 > 0) {
                this.z = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.z);
                CharSequence charSequence2 = this.w;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.H.descent(), this.H);
                if (this.A == null) {
                    this.A = new Paint(3);
                }
            }
        }
    }

    private int n() {
        int[] iArr = this.F;
        return iArr != null ? this.f6427k.getColorForState(iArr, 0) : this.f6427k.getDefaultColor();
    }

    public int a() {
        return this.f6424h;
    }

    public void a(float f2) {
        float a2 = c.h.g.a.a(f2, 0.0f, 1.0f);
        if (a2 != this.f6419c) {
            this.f6419c = a2;
            k();
        }
    }

    public void a(int i2) {
        w0 a2 = w0.a(this.a.getContext(), i2, j.TextAppearance);
        if (a2.g(j.TextAppearance_android_textColor)) {
            this.f6428l = a2.a(j.TextAppearance_android_textColor);
        }
        if (a2.g(j.TextAppearance_android_textSize)) {
            this.f6426j = (float) a2.c(j.TextAppearance_android_textSize, (int) this.f6426j);
        }
        this.N = a2.d(j.TextAppearance_android_shadowColor, 0);
        this.L = a2.a(j.TextAppearance_android_shadowDx, 0.0f);
        this.M = a2.a(j.TextAppearance_android_shadowDy, 0.0f);
        this.K = a2.a(j.TextAppearance_android_shadowRadius, 0.0f);
        a2.b();
        if (Build.VERSION.SDK_INT >= 16) {
            this.s = e(i2);
        }
        i();
    }

    public void a(int i2, int i3, int i4, int i5) {
        if (!a(this.f6421e, i2, i3, i4, i5)) {
            this.f6421e.set(i2, i3, i4, i5);
            this.G = true;
            h();
        }
    }

    public void a(TimeInterpolator timeInterpolator) {
        this.J = timeInterpolator;
        i();
    }

    public void a(ColorStateList colorStateList) {
        if (this.f6428l != colorStateList) {
            this.f6428l = colorStateList;
            i();
        }
    }

    public void a(Canvas canvas) {
        float f2;
        int save = canvas.save();
        if (this.w != null && this.f6418b) {
            float f3 = this.q;
            float f4 = this.r;
            boolean z2 = this.y && this.z != null;
            if (z2) {
                f2 = this.B * this.D;
            } else {
                f2 = this.H.ascent() * this.D;
                this.H.descent();
            }
            if (z2) {
                f4 += f2;
            }
            float f5 = this.D;
            if (f5 != 1.0f) {
                canvas.scale(f5, f5, f3, f4);
            }
            if (z2) {
                canvas.drawBitmap(this.z, f3, f4, this.A);
            } else {
                CharSequence charSequence = this.w;
                canvas.drawText(charSequence, 0, charSequence.length(), f3, f4, this.H);
            }
        }
        canvas.restoreToCount(save);
    }

    public void a(Typeface typeface) {
        if (this.s != typeface) {
            this.s = typeface;
            i();
        }
    }

    public void a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.v)) {
            this.v = charSequence;
            this.w = null;
            l();
            i();
        }
    }

    public final boolean a(int[] iArr) {
        this.F = iArr;
        if (!g()) {
            return false;
        }
        i();
        return true;
    }

    public Typeface b() {
        Typeface typeface = this.s;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void b(int i2) {
        if (this.f6424h != i2) {
            this.f6424h = i2;
            i();
        }
    }

    public void b(int i2, int i3, int i4, int i5) {
        if (!a(this.f6420d, i2, i3, i4, i5)) {
            this.f6420d.set(i2, i3, i4, i5);
            this.G = true;
            h();
        }
    }

    public void b(ColorStateList colorStateList) {
        if (this.f6427k != colorStateList) {
            this.f6427k = colorStateList;
            i();
        }
    }

    public void b(Typeface typeface) {
        if (this.t != typeface) {
            this.t = typeface;
            i();
        }
    }

    public int c() {
        int[] iArr = this.F;
        return iArr != null ? this.f6428l.getColorForState(iArr, 0) : this.f6428l.getDefaultColor();
    }

    public void c(int i2) {
        w0 a2 = w0.a(this.a.getContext(), i2, j.TextAppearance);
        if (a2.g(j.TextAppearance_android_textColor)) {
            this.f6427k = a2.a(j.TextAppearance_android_textColor);
        }
        if (a2.g(j.TextAppearance_android_textSize)) {
            this.f6425i = (float) a2.c(j.TextAppearance_android_textSize, (int) this.f6425i);
        }
        this.R = a2.d(j.TextAppearance_android_shadowColor, 0);
        this.P = a2.a(j.TextAppearance_android_shadowDx, 0.0f);
        this.Q = a2.a(j.TextAppearance_android_shadowDy, 0.0f);
        this.O = a2.a(j.TextAppearance_android_shadowRadius, 0.0f);
        a2.b();
        if (Build.VERSION.SDK_INT >= 16) {
            this.t = e(i2);
        }
        i();
    }

    public int d() {
        return this.f6423g;
    }

    public void d(int i2) {
        if (this.f6423g != i2) {
            this.f6423g = i2;
            i();
        }
    }

    public Typeface e() {
        Typeface typeface = this.t;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public CharSequence f() {
        return this.v;
    }

    public final boolean g() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f6428l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f6427k) != null && colorStateList.isStateful());
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f6418b = this.f6421e.width() > 0 && this.f6421e.height() > 0 && this.f6420d.width() > 0 && this.f6420d.height() > 0;
    }

    public void i() {
        if (this.a.getHeight() > 0 && this.a.getWidth() > 0) {
            j();
            k();
        }
    }
}
