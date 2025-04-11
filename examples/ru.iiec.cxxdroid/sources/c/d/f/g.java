package c.d.f;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
public class g extends Drawable {
    private float a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f1922b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f1923c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f1924d;

    /* renamed from: e  reason: collision with root package name */
    private float f1925e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1926f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1927g = true;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f1928h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f1929i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f1930j;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f1931k = PorterDuff.Mode.SRC_IN;

    g(ColorStateList colorStateList, float f2) {
        this.a = f2;
        this.f1922b = new Paint(5);
        b(colorStateList);
        this.f1923c = new RectF();
        this.f1924d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1923c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f1924d.set(rect);
        if (this.f1926f) {
            float b2 = h.b(this.f1925e, this.a, this.f1927g);
            this.f1924d.inset((int) Math.ceil((double) h.a(this.f1925e, this.a, this.f1927g)), (int) Math.ceil((double) b2));
            this.f1923c.set(this.f1924d);
        }
    }

    private void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1928h = colorStateList;
        this.f1922b.setColor(this.f1928h.getColorForState(getState(), this.f1928h.getDefaultColor()));
    }

    public ColorStateList a() {
        return this.f1928h;
    }

    /* access modifiers changed from: package-private */
    public void a(float f2) {
        if (f2 != this.a) {
            this.a = f2;
            a((Rect) null);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(float f2, boolean z, boolean z2) {
        if (f2 != this.f1925e || this.f1926f != z || this.f1927g != z2) {
            this.f1925e = f2;
            this.f1926f = z;
            this.f1927g = z2;
            a((Rect) null);
            invalidateSelf();
        }
    }

    public void a(ColorStateList colorStateList) {
        b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.f1925e;
    }

    public float c() {
        return this.a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1922b;
        if (this.f1929i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1929i);
            z = true;
        }
        RectF rectF = this.f1923c;
        float f2 = this.a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1924d, this.a);
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1930j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1928h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1928h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1922b.getColor();
        if (z) {
            this.f1922b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1930j;
        if (colorStateList2 == null || (mode = this.f1931k) == null) {
            return z;
        }
        this.f1929i = a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i2) {
        this.f1922b.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1922b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1930j = colorStateList;
        this.f1929i = a(this.f1930j, this.f1931k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1931k = mode;
        this.f1929i = a(this.f1930j, this.f1931k);
        invalidateSelf();
    }
}
