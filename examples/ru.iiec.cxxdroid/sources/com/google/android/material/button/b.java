package com.google.android.material.button;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.a;
import c.h.l.b0;
import com.google.android.material.internal.m;
import e.b.b.b.j;

/* access modifiers changed from: package-private */
public class b {
    private static final boolean w = (Build.VERSION.SDK_INT >= 21);
    private final MaterialButton a;

    /* renamed from: b  reason: collision with root package name */
    private int f6348b;

    /* renamed from: c  reason: collision with root package name */
    private int f6349c;

    /* renamed from: d  reason: collision with root package name */
    private int f6350d;

    /* renamed from: e  reason: collision with root package name */
    private int f6351e;

    /* renamed from: f  reason: collision with root package name */
    private int f6352f;

    /* renamed from: g  reason: collision with root package name */
    private int f6353g;

    /* renamed from: h  reason: collision with root package name */
    private PorterDuff.Mode f6354h;

    /* renamed from: i  reason: collision with root package name */
    private ColorStateList f6355i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f6356j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f6357k;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f6358l = new Paint(1);

    /* renamed from: m  reason: collision with root package name */
    private final Rect f6359m = new Rect();
    private final RectF n = new RectF();
    private GradientDrawable o;
    private Drawable p;
    private GradientDrawable q;
    private Drawable r;
    private GradientDrawable s;
    private GradientDrawable t;
    private GradientDrawable u;
    private boolean v = false;

    public b(MaterialButton materialButton) {
        this.a = materialButton;
    }

    private InsetDrawable a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f6348b, this.f6350d, this.f6349c, this.f6351e);
    }

    private Drawable i() {
        this.o = new GradientDrawable();
        this.o.setCornerRadius(((float) this.f6352f) + 1.0E-5f);
        this.o.setColor(-1);
        this.p = a.i(this.o);
        a.a(this.p, this.f6355i);
        PorterDuff.Mode mode = this.f6354h;
        if (mode != null) {
            a.a(this.p, mode);
        }
        this.q = new GradientDrawable();
        this.q.setCornerRadius(((float) this.f6352f) + 1.0E-5f);
        this.q.setColor(-1);
        this.r = a.i(this.q);
        a.a(this.r, this.f6357k);
        return a(new LayerDrawable(new Drawable[]{this.p, this.r}));
    }

    @TargetApi(21)
    private Drawable j() {
        this.s = new GradientDrawable();
        this.s.setCornerRadius(((float) this.f6352f) + 1.0E-5f);
        this.s.setColor(-1);
        n();
        this.t = new GradientDrawable();
        this.t.setCornerRadius(((float) this.f6352f) + 1.0E-5f);
        this.t.setColor(0);
        this.t.setStroke(this.f6353g, this.f6356j);
        InsetDrawable a2 = a(new LayerDrawable(new Drawable[]{this.s, this.t}));
        this.u = new GradientDrawable();
        this.u.setCornerRadius(((float) this.f6352f) + 1.0E-5f);
        this.u.setColor(-1);
        return new a(e.b.b.b.p.a.a(this.f6357k), a2, this.u);
    }

    private GradientDrawable k() {
        if (!w || this.a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }

    private GradientDrawable l() {
        if (!w || this.a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }

    private void m() {
        if (w && this.t != null) {
            this.a.setInternalBackground(j());
        } else if (!w) {
            this.a.invalidate();
        }
    }

    private void n() {
        GradientDrawable gradientDrawable = this.s;
        if (gradientDrawable != null) {
            a.a(gradientDrawable, this.f6355i);
            PorterDuff.Mode mode = this.f6354h;
            if (mode != null) {
                a.a(this.s, mode);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f6352f;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        GradientDrawable gradientDrawable;
        if ((w && (gradientDrawable = this.s) != null) || (!w && (gradientDrawable = this.o) != null)) {
            gradientDrawable.setColor(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        GradientDrawable gradientDrawable = this.u;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(this.f6348b, this.f6350d, i3 - this.f6349c, i2 - this.f6351e);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f6357k != colorStateList) {
            this.f6357k = colorStateList;
            if (w && (this.a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.a.getBackground()).setColor(colorStateList);
            } else if (!w && (drawable = this.r) != null) {
                a.a(drawable, colorStateList);
            }
        }
    }

    public void a(TypedArray typedArray) {
        int i2 = 0;
        this.f6348b = typedArray.getDimensionPixelOffset(j.MaterialButton_android_insetLeft, 0);
        this.f6349c = typedArray.getDimensionPixelOffset(j.MaterialButton_android_insetRight, 0);
        this.f6350d = typedArray.getDimensionPixelOffset(j.MaterialButton_android_insetTop, 0);
        this.f6351e = typedArray.getDimensionPixelOffset(j.MaterialButton_android_insetBottom, 0);
        this.f6352f = typedArray.getDimensionPixelSize(j.MaterialButton_cornerRadius, 0);
        this.f6353g = typedArray.getDimensionPixelSize(j.MaterialButton_strokeWidth, 0);
        this.f6354h = m.a(typedArray.getInt(j.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f6355i = e.b.b.b.o.a.a(this.a.getContext(), typedArray, j.MaterialButton_backgroundTint);
        this.f6356j = e.b.b.b.o.a.a(this.a.getContext(), typedArray, j.MaterialButton_strokeColor);
        this.f6357k = e.b.b.b.o.a.a(this.a.getContext(), typedArray, j.MaterialButton_rippleColor);
        this.f6358l.setStyle(Paint.Style.STROKE);
        this.f6358l.setStrokeWidth((float) this.f6353g);
        Paint paint = this.f6358l;
        ColorStateList colorStateList = this.f6356j;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(this.a.getDrawableState(), 0);
        }
        paint.setColor(i2);
        int w2 = b0.w(this.a);
        int paddingTop = this.a.getPaddingTop();
        int v2 = b0.v(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        this.a.setInternalBackground(w ? j() : i());
        b0.a(this.a, w2 + this.f6348b, paddingTop + this.f6350d, v2 + this.f6349c, paddingBottom + this.f6351e);
    }

    /* access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        if (canvas != null && this.f6356j != null && this.f6353g > 0) {
            this.f6359m.set(this.a.getBackground().getBounds());
            RectF rectF = this.n;
            Rect rect = this.f6359m;
            int i2 = this.f6353g;
            rectF.set(((float) rect.left) + (((float) i2) / 2.0f) + ((float) this.f6348b), ((float) rect.top) + (((float) i2) / 2.0f) + ((float) this.f6350d), (((float) rect.right) - (((float) i2) / 2.0f)) - ((float) this.f6349c), (((float) rect.bottom) - (((float) i2) / 2.0f)) - ((float) this.f6351e));
            float f2 = ((float) this.f6352f) - (((float) this.f6353g) / 2.0f);
            canvas.drawRoundRect(this.n, f2, f2, this.f6358l);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        PorterDuff.Mode mode2;
        if (this.f6354h != mode) {
            this.f6354h = mode;
            if (w) {
                n();
                return;
            }
            Drawable drawable = this.p;
            if (drawable != null && (mode2 = this.f6354h) != null) {
                a.a(drawable, mode2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f6357k;
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        GradientDrawable gradientDrawable;
        if (this.f6352f != i2) {
            this.f6352f = i2;
            if (w && this.s != null && this.t != null && this.u != null) {
                if (Build.VERSION.SDK_INT == 21) {
                    float f2 = ((float) i2) + 1.0E-5f;
                    k().setCornerRadius(f2);
                    l().setCornerRadius(f2);
                }
                float f3 = ((float) i2) + 1.0E-5f;
                this.s.setCornerRadius(f3);
                this.t.setCornerRadius(f3);
                this.u.setCornerRadius(f3);
            } else if (!w && (gradientDrawable = this.o) != null && this.q != null) {
                float f4 = ((float) i2) + 1.0E-5f;
                gradientDrawable.setCornerRadius(f4);
                this.q.setCornerRadius(f4);
                this.a.invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        if (this.f6356j != colorStateList) {
            this.f6356j = colorStateList;
            Paint paint = this.f6358l;
            int i2 = 0;
            if (colorStateList != null) {
                i2 = colorStateList.getColorForState(this.a.getDrawableState(), 0);
            }
            paint.setColor(i2);
            m();
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.f6356j;
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        if (this.f6353g != i2) {
            this.f6353g = i2;
            this.f6358l.setStrokeWidth((float) i2);
            m();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(ColorStateList colorStateList) {
        if (this.f6355i != colorStateList) {
            this.f6355i = colorStateList;
            if (w) {
                n();
                return;
            }
            Drawable drawable = this.p;
            if (drawable != null) {
                a.a(drawable, this.f6355i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f6353g;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList e() {
        return this.f6355i;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode f() {
        return this.f6354h;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.v;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.v = true;
        this.a.setSupportBackgroundTintList(this.f6355i);
        this.a.setSupportBackgroundTintMode(this.f6354h);
    }
}
