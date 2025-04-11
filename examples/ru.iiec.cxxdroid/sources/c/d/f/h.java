package c.d.f;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import c.d.b;
import c.d.c;

/* access modifiers changed from: package-private */
public class h extends Drawable {
    private static final double q = Math.cos(Math.toRadians(45.0d));
    static a r;
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f1932b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f1933c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f1934d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f1935e;

    /* renamed from: f  reason: collision with root package name */
    private float f1936f;

    /* renamed from: g  reason: collision with root package name */
    private Path f1937g;

    /* renamed from: h  reason: collision with root package name */
    private float f1938h;

    /* renamed from: i  reason: collision with root package name */
    private float f1939i;

    /* renamed from: j  reason: collision with root package name */
    private float f1940j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f1941k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1942l = true;

    /* renamed from: m  reason: collision with root package name */
    private final int f1943m;
    private final int n;
    private boolean o = true;
    private boolean p = false;

    interface a {
        void a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    h(Resources resources, ColorStateList colorStateList, float f2, float f3, float f4) {
        this.f1943m = resources.getColor(b.cardview_shadow_start_color);
        this.n = resources.getColor(b.cardview_shadow_end_color);
        this.a = resources.getDimensionPixelSize(c.cardview_compat_inset_shadow);
        this.f1932b = new Paint(5);
        b(colorStateList);
        this.f1933c = new Paint(5);
        this.f1933c.setStyle(Paint.Style.FILL);
        this.f1936f = (float) ((int) (f2 + 0.5f));
        this.f1935e = new RectF();
        this.f1934d = new Paint(this.f1933c);
        this.f1934d.setAntiAlias(false);
        a(f3, f4);
    }

    static float a(float f2, float f3, boolean z) {
        return z ? (float) (((double) f2) + ((1.0d - q) * ((double) f3))) : f2;
    }

    private void a(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        } else if (f3 >= 0.0f) {
            float d2 = (float) d(f2);
            float d3 = (float) d(f3);
            if (d2 > d3) {
                if (!this.p) {
                    this.p = true;
                }
                d2 = d3;
            }
            if (this.f1940j != d2 || this.f1938h != d3) {
                this.f1940j = d2;
                this.f1938h = d3;
                this.f1939i = (float) ((int) ((d2 * 1.5f) + ((float) this.a) + 0.5f));
                this.f1942l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        }
    }

    private void a(Canvas canvas) {
        float f2 = this.f1936f;
        float f3 = (-f2) - this.f1939i;
        float f4 = f2 + ((float) this.a) + (this.f1940j / 2.0f);
        float f5 = f4 * 2.0f;
        boolean z = this.f1935e.width() - f5 > 0.0f;
        boolean z2 = this.f1935e.height() - f5 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f1935e;
        canvas.translate(rectF.left + f4, rectF.top + f4);
        canvas.drawPath(this.f1937g, this.f1933c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f1935e.width() - f5, -this.f1936f, this.f1934d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f1935e;
        canvas.translate(rectF2.right - f4, rectF2.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1937g, this.f1933c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f1935e.width() - f5, (-this.f1936f) + this.f1939i, this.f1934d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f1935e;
        canvas.translate(rectF3.left + f4, rectF3.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1937g, this.f1933c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f1935e.height() - f5, -this.f1936f, this.f1934d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f1935e;
        canvas.translate(rectF4.right - f4, rectF4.top + f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1937g, this.f1933c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f1935e.height() - f5, -this.f1936f, this.f1934d);
        }
        canvas.restoreToCount(save4);
    }

    static float b(float f2, float f3, boolean z) {
        float f4 = f2 * 1.5f;
        return z ? (float) (((double) f4) + ((1.0d - q) * ((double) f3))) : f4;
    }

    private void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1941k = colorStateList;
        this.f1932b.setColor(this.f1941k.getColorForState(getState(), this.f1941k.getDefaultColor()));
    }

    private void b(Rect rect) {
        float f2 = this.f1938h;
        float f3 = 1.5f * f2;
        this.f1935e.set(((float) rect.left) + f2, ((float) rect.top) + f3, ((float) rect.right) - f2, ((float) rect.bottom) - f3);
        g();
    }

    private int d(float f2) {
        int i2 = (int) (f2 + 0.5f);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }

    private void g() {
        float f2 = this.f1936f;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.f1939i;
        rectF2.inset(-f3, -f3);
        Path path = this.f1937g;
        if (path == null) {
            this.f1937g = new Path();
        } else {
            path.reset();
        }
        this.f1937g.setFillType(Path.FillType.EVEN_ODD);
        this.f1937g.moveTo(-this.f1936f, 0.0f);
        this.f1937g.rLineTo(-this.f1939i, 0.0f);
        this.f1937g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1937g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1937g.close();
        float f4 = this.f1936f;
        float f5 = this.f1939i;
        Paint paint = this.f1933c;
        float f6 = f4 + f5;
        int i2 = this.f1943m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i2, i2, this.n}, new float[]{0.0f, f4 / (f4 + f5), 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1934d;
        float f7 = this.f1936f;
        float f8 = this.f1939i;
        int i3 = this.f1943m;
        paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, (-f7) - f8, new int[]{i3, i3, this.n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1934d.setAntiAlias(false);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList a() {
        return this.f1941k;
    }

    /* access modifiers changed from: package-private */
    public void a(float f2) {
        if (f2 >= 0.0f) {
            float f3 = (float) ((int) (f2 + 0.5f));
            if (this.f1936f != f3) {
                this.f1936f = f3;
                this.f1942l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void a(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.o = z;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.f1936f;
    }

    /* access modifiers changed from: package-private */
    public void b(float f2) {
        a(this.f1940j, f2);
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f1938h;
    }

    /* access modifiers changed from: package-private */
    public void c(float f2) {
        a(f2, this.f1938h);
    }

    /* access modifiers changed from: package-private */
    public float d() {
        float f2 = this.f1938h;
        return (Math.max(f2, this.f1936f + ((float) this.a) + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.f1938h * 1.5f) + ((float) this.a)) * 2.0f);
    }

    public void draw(Canvas canvas) {
        if (this.f1942l) {
            b(getBounds());
            this.f1942l = false;
        }
        canvas.translate(0.0f, this.f1940j / 2.0f);
        a(canvas);
        canvas.translate(0.0f, (-this.f1940j) / 2.0f);
        r.a(canvas, this.f1935e, this.f1936f, this.f1932b);
    }

    /* access modifiers changed from: package-private */
    public float e() {
        float f2 = this.f1938h;
        return (Math.max(f2, this.f1936f + ((float) this.a) + (f2 / 2.0f)) * 2.0f) + ((this.f1938h + ((float) this.a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.f1940j;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) b(this.f1938h, this.f1936f, this.o));
        int ceil2 = (int) Math.ceil((double) a(this.f1938h, this.f1936f, this.o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f1941k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1942l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1941k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1932b.getColor() == colorForState) {
            return false;
        }
        this.f1932b.setColor(colorForState);
        this.f1942l = true;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i2) {
        this.f1932b.setAlpha(i2);
        this.f1933c.setAlpha(i2);
        this.f1934d.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1932b.setColorFilter(colorFilter);
    }
}
