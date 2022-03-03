package com.github.johnkil.print;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;

public class d extends Drawable implements a {

    /* renamed from: b  reason: collision with root package name */
    private final Context f3077b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f3078c;

    /* renamed from: d  reason: collision with root package name */
    private final Path f3079d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f3080e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f3081f;

    /* renamed from: g  reason: collision with root package name */
    private ColorStateList f3082g;

    /* renamed from: h  reason: collision with root package name */
    private Typeface f3083h;

    /* renamed from: i  reason: collision with root package name */
    private int f3084i;

    /* renamed from: j  reason: collision with root package name */
    private int f3085j;

    public static class b {
        private final Context a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f3086b;

        /* renamed from: c  reason: collision with root package name */
        private ColorStateList f3087c;

        /* renamed from: d  reason: collision with root package name */
        private Typeface f3088d;

        /* renamed from: e  reason: collision with root package name */
        private int f3089e;

        public b(Context context) {
            this.a = context;
        }

        public b a(int i2, float f2) {
            this.f3089e = (int) TypedValue.applyDimension(i2, f2, this.a.getResources().getDisplayMetrics());
            return this;
        }

        public b a(ColorStateList colorStateList) {
            if (colorStateList != null) {
                this.f3087c = colorStateList;
                return this;
            }
            throw new IllegalArgumentException("Color must not be null.");
        }

        public b a(Typeface typeface) {
            if (typeface != null) {
                this.f3088d = typeface;
                return this;
            }
            throw new IllegalArgumentException("Font must not be null.");
        }

        public b a(CharSequence charSequence) {
            this.f3086b = charSequence;
            return this;
        }

        public d a() {
            if (this.f3088d == null) {
                c c2 = c.c();
                if (c2.b()) {
                    this.f3088d = c2.a();
                } else {
                    Log.w("Print", "The iconic font is not set.");
                }
            }
            return new d(this.a, this.f3086b, this.f3087c, this.f3088d, this.f3089e);
        }
    }

    private d(Context context, CharSequence charSequence, ColorStateList colorStateList, Typeface typeface, int i2) {
        this.f3077b = context;
        this.f3078c = new Paint();
        Paint paint = this.f3078c;
        paint.setFlags(paint.getFlags() | 1 | 128);
        this.f3079d = new Path();
        this.f3080e = new RectF();
        this.f3081f = charSequence;
        this.f3082g = colorStateList;
        this.f3083h = typeface;
        this.f3084i = i2;
        this.f3078c.setTextSize((float) this.f3084i);
        this.f3078c.setTypeface(this.f3083h);
        e();
    }

    private void a(Rect rect) {
        this.f3079d.offset((((float) rect.centerX()) - (this.f3080e.width() / 2.0f)) - this.f3080e.left, (((float) rect.centerY()) - (this.f3080e.height() / 2.0f)) - this.f3080e.top);
    }

    private void e() {
        int colorForState = this.f3082g.getColorForState(getState(), 0);
        if (colorForState != this.f3085j) {
            this.f3085j = colorForState;
            this.f3078c.setColor(this.f3085j);
        }
    }

    public ColorStateList a() {
        return this.f3082g;
    }

    public void a(int i2) {
        a(this.f3077b.getResources().getColorStateList(i2));
    }

    public void a(int i2, float f2) {
        this.f3084i = (int) TypedValue.applyDimension(i2, f2, this.f3077b.getResources().getDisplayMetrics());
        this.f3078c.setTextSize((float) this.f3084i);
        invalidateSelf();
    }

    public void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f3082g = colorStateList;
            e();
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Color must not be null.");
    }

    public void a(Typeface typeface) {
        if (typeface != null) {
            this.f3083h = typeface;
            this.f3078c.setTypeface(this.f3083h);
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Font must not be null.");
    }

    public void a(CharSequence charSequence) {
        this.f3081f = charSequence;
        invalidateSelf();
    }

    public void a(String str) {
        a(g.a(this.f3077b.getAssets(), str));
    }

    public Typeface b() {
        return this.f3083h;
    }

    public void b(int i2) {
        a(0, (float) this.f3077b.getResources().getDimensionPixelSize(i2));
    }

    public int c() {
        return this.f3084i;
    }

    public void c(int i2) {
        a(this.f3077b.getText(i2));
    }

    public CharSequence d() {
        return this.f3081f;
    }

    public void draw(Canvas canvas) {
        if (this.f3081f != null) {
            Rect bounds = getBounds();
            this.f3078c.getTextPath(this.f3081f.toString(), 0, this.f3081f.length(), 0.0f, (float) bounds.height(), this.f3079d);
            this.f3079d.computeBounds(this.f3080e, true);
            a(bounds);
            this.f3079d.close();
            canvas.drawPath(this.f3079d, this.f3078c);
        }
    }

    public int getIntrinsicHeight() {
        return this.f3084i;
    }

    public int getIntrinsicWidth() {
        return this.f3084i;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f3082g;
        if (colorStateList != null && colorStateList.isStateful()) {
            e();
            invalidateSelf();
        }
        return super.onStateChange(iArr);
    }

    public void setAlpha(int i2) {
        this.f3078c.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3078c.setColorFilter(colorFilter);
    }
}
