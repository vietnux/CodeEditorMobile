package e.b.b.b.q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import c.a.l.a.c;

public class a extends c {
    static final double r = Math.cos(Math.toRadians(45.0d));

    /* renamed from: c  reason: collision with root package name */
    final Paint f7846c;

    /* renamed from: d  reason: collision with root package name */
    final Paint f7847d;

    /* renamed from: e  reason: collision with root package name */
    final RectF f7848e;

    /* renamed from: f  reason: collision with root package name */
    float f7849f;

    /* renamed from: g  reason: collision with root package name */
    Path f7850g;

    /* renamed from: h  reason: collision with root package name */
    float f7851h;

    /* renamed from: i  reason: collision with root package name */
    float f7852i;

    /* renamed from: j  reason: collision with root package name */
    float f7853j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7854k = true;

    /* renamed from: l  reason: collision with root package name */
    private final int f7855l;

    /* renamed from: m  reason: collision with root package name */
    private final int f7856m;
    private final int n;
    private boolean o = true;
    private float p;
    private boolean q = false;

    public a(Context context, Drawable drawable, float f2, float f3, float f4) {
        super(drawable);
        this.f7855l = c.h.d.a.a(context, e.b.b.b.c.design_fab_shadow_start_color);
        this.f7856m = c.h.d.a.a(context, e.b.b.b.c.design_fab_shadow_mid_color);
        this.n = c.h.d.a.a(context, e.b.b.b.c.design_fab_shadow_end_color);
        this.f7846c = new Paint(5);
        this.f7846c.setStyle(Paint.Style.FILL);
        this.f7849f = (float) Math.round(f2);
        this.f7848e = new RectF();
        this.f7847d = new Paint(this.f7846c);
        this.f7847d.setAntiAlias(false);
        a(f3, f4);
    }

    public static float a(float f2, float f3, boolean z) {
        return z ? (float) (((double) f2) + ((1.0d - r) * ((double) f3))) : f2;
    }

    private void a(Canvas canvas) {
        float f2;
        int i2;
        int i3;
        float f3;
        float f4;
        float f5;
        int save = canvas.save();
        canvas.rotate(this.p, this.f7848e.centerX(), this.f7848e.centerY());
        float f6 = this.f7849f;
        float f7 = (-f6) - this.f7852i;
        float f8 = f6 * 2.0f;
        boolean z = this.f7848e.width() - f8 > 0.0f;
        boolean z2 = this.f7848e.height() - f8 > 0.0f;
        float f9 = this.f7853j;
        float f10 = f6 / ((f9 - (0.5f * f9)) + f6);
        float f11 = f6 / ((f9 - (0.25f * f9)) + f6);
        float f12 = f6 / ((f9 - (f9 * 1.0f)) + f6);
        int save2 = canvas.save();
        RectF rectF = this.f7848e;
        canvas.translate(rectF.left + f6, rectF.top + f6);
        canvas.scale(f10, f11);
        canvas.drawPath(this.f7850g, this.f7846c);
        if (z) {
            canvas.scale(1.0f / f10, 1.0f);
            i3 = save2;
            f2 = f12;
            i2 = save;
            f3 = f11;
            canvas.drawRect(0.0f, f7, this.f7848e.width() - f8, -this.f7849f, this.f7847d);
        } else {
            i3 = save2;
            f2 = f12;
            i2 = save;
            f3 = f11;
        }
        canvas.restoreToCount(i3);
        int save3 = canvas.save();
        RectF rectF2 = this.f7848e;
        canvas.translate(rectF2.right - f6, rectF2.bottom - f6);
        canvas.scale(f10, f2);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f7850g, this.f7846c);
        if (z) {
            canvas.scale(1.0f / f10, 1.0f);
            f4 = f3;
            f5 = f2;
            canvas.drawRect(0.0f, f7, this.f7848e.width() - f8, (-this.f7849f) + this.f7852i, this.f7847d);
        } else {
            f4 = f3;
            f5 = f2;
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.f7848e;
        canvas.translate(rectF3.left + f6, rectF3.bottom - f6);
        canvas.scale(f10, f5);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f7850g, this.f7846c);
        if (z2) {
            canvas.scale(1.0f / f5, 1.0f);
            canvas.drawRect(0.0f, f7, this.f7848e.height() - f8, -this.f7849f, this.f7847d);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.f7848e;
        canvas.translate(rectF4.right - f6, rectF4.top + f6);
        canvas.scale(f10, f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f7850g, this.f7846c);
        if (z2) {
            canvas.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f7, this.f7848e.height() - f8, -this.f7849f, this.f7847d);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(i2);
    }

    private void a(Rect rect) {
        float f2 = this.f7851h;
        float f3 = 1.5f * f2;
        this.f7848e.set(((float) rect.left) + f2, ((float) rect.top) + f3, ((float) rect.right) - f2, ((float) rect.bottom) - f3);
        Drawable a = a();
        RectF rectF = this.f7848e;
        a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        c();
    }

    public static float b(float f2, float f3, boolean z) {
        float f4 = f2 * 1.5f;
        return z ? (float) (((double) f4) + ((1.0d - r) * ((double) f3))) : f4;
    }

    private static int c(float f2) {
        int round = Math.round(f2);
        return round % 2 == 1 ? round - 1 : round;
    }

    private void c() {
        float f2 = this.f7849f;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.f7852i;
        rectF2.inset(-f3, -f3);
        Path path = this.f7850g;
        if (path == null) {
            this.f7850g = new Path();
        } else {
            path.reset();
        }
        this.f7850g.setFillType(Path.FillType.EVEN_ODD);
        this.f7850g.moveTo(-this.f7849f, 0.0f);
        this.f7850g.rLineTo(-this.f7852i, 0.0f);
        this.f7850g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f7850g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f7850g.close();
        float f4 = -rectF2.top;
        if (f4 > 0.0f) {
            float f5 = this.f7849f / f4;
            this.f7846c.setShader(new RadialGradient(0.0f, 0.0f, f4, new int[]{0, this.f7855l, this.f7856m, this.n}, new float[]{0.0f, f5, ((1.0f - f5) / 2.0f) + f5, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f7847d.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f7855l, this.f7856m, this.n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f7847d.setAntiAlias(false);
    }

    public final void a(float f2) {
        if (this.p != f2) {
            this.p = f2;
            invalidateSelf();
        }
    }

    public void a(float f2, float f3) {
        if (f2 < 0.0f || f3 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float c2 = (float) c(f2);
        float c3 = (float) c(f3);
        if (c2 > c3) {
            if (!this.q) {
                this.q = true;
            }
            c2 = c3;
        }
        if (this.f7853j != c2 || this.f7851h != c3) {
            this.f7853j = c2;
            this.f7851h = c3;
            this.f7852i = (float) Math.round(c2 * 1.5f);
            this.f7854k = true;
            invalidateSelf();
        }
    }

    public void a(boolean z) {
        this.o = z;
        invalidateSelf();
    }

    public float b() {
        return this.f7853j;
    }

    public void b(float f2) {
        a(f2, this.f7851h);
    }

    @Override // c.a.l.a.c
    public void draw(Canvas canvas) {
        if (this.f7854k) {
            a(getBounds());
            this.f7854k = false;
        }
        a(canvas);
        super.draw(canvas);
    }

    @Override // c.a.l.a.c
    public int getOpacity() {
        return -3;
    }

    @Override // c.a.l.a.c
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) b(this.f7851h, this.f7849f, this.o));
        int ceil2 = (int) Math.ceil((double) a(this.f7851h, this.f7849f, this.o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // c.a.l.a.c
    public void onBoundsChange(Rect rect) {
        this.f7854k = true;
    }

    @Override // c.a.l.a.c
    public void setAlpha(int i2) {
        super.setAlpha(i2);
        this.f7846c.setAlpha(i2);
        this.f7847d.setAlpha(i2);
    }
}
