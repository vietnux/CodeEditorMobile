package com.google.android.material.internal;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public class a extends Drawable {
    final Paint a = new Paint(1);

    /* renamed from: b  reason: collision with root package name */
    final Rect f6406b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    final RectF f6407c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    final b f6408d = new b();

    /* renamed from: e  reason: collision with root package name */
    float f6409e;

    /* renamed from: f  reason: collision with root package name */
    private int f6410f;

    /* renamed from: g  reason: collision with root package name */
    private int f6411g;

    /* renamed from: h  reason: collision with root package name */
    private int f6412h;

    /* renamed from: i  reason: collision with root package name */
    private int f6413i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f6414j;

    /* renamed from: k  reason: collision with root package name */
    private int f6415k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6416l = true;

    /* renamed from: m  reason: collision with root package name */
    private float f6417m;

    private class b extends Drawable.ConstantState {
        private b() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return a.this;
        }
    }

    public a() {
        this.a.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        Rect rect = this.f6406b;
        copyBounds(rect);
        float height = this.f6409e / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{c.h.e.a.b(this.f6410f, this.f6415k), c.h.e.a.b(this.f6411g, this.f6415k), c.h.e.a.b(c.h.e.a.c(this.f6411g, 0), this.f6415k), c.h.e.a.b(c.h.e.a.c(this.f6413i, 0), this.f6415k), c.h.e.a.b(this.f6413i, this.f6415k), c.h.e.a.b(this.f6412h, this.f6415k)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    public void a(float f2) {
        if (this.f6409e != f2) {
            this.f6409e = f2;
            this.a.setStrokeWidth(f2 * 1.3333f);
            this.f6416l = true;
            invalidateSelf();
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        this.f6410f = i2;
        this.f6411g = i3;
        this.f6412h = i4;
        this.f6413i = i5;
    }

    public void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f6415k = colorStateList.getColorForState(getState(), this.f6415k);
        }
        this.f6414j = colorStateList;
        this.f6416l = true;
        invalidateSelf();
    }

    public final void b(float f2) {
        if (f2 != this.f6417m) {
            this.f6417m = f2;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f6416l) {
            this.a.setShader(a());
            this.f6416l = false;
        }
        float strokeWidth = this.a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f6407c;
        copyBounds(this.f6406b);
        rectF.set(this.f6406b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f6417m, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.a);
        canvas.restore();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f6408d;
    }

    public int getOpacity() {
        return this.f6409e > 0.0f ? -3 : -2;
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f6409e);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f6414j;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f6416l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f6414j;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f6415k)) == this.f6415k)) {
            this.f6416l = true;
            this.f6415k = colorForState;
        }
        if (this.f6416l) {
            invalidateSelf();
        }
        return this.f6416l;
    }

    public void setAlpha(int i2) {
        this.a.setAlpha(i2);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
