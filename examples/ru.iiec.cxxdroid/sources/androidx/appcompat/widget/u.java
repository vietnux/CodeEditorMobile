package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;
import c.a.j;
import c.h.l.b0;

/* access modifiers changed from: package-private */
public class u extends p {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f713d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f714e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f715f = null;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f716g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f717h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f718i = false;

    u(SeekBar seekBar) {
        super(seekBar);
        this.f713d = seekBar;
    }

    private void d() {
        if (this.f714e == null) {
            return;
        }
        if (this.f717h || this.f718i) {
            this.f714e = a.i(this.f714e.mutate());
            if (this.f717h) {
                a.a(this.f714e, this.f715f);
            }
            if (this.f718i) {
                a.a(this.f714e, this.f716g);
            }
            if (this.f714e.isStateful()) {
                this.f714e.setState(this.f713d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        if (this.f714e != null) {
            int max = this.f713d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f714e.getIntrinsicWidth();
                int intrinsicHeight = this.f714e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f714e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.f713d.getWidth() - this.f713d.getPaddingLeft()) - this.f713d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f713d.getPaddingLeft(), (float) (this.f713d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f714e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Drawable drawable) {
        Drawable drawable2 = this.f714e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f714e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f713d);
            a.a(drawable, b0.r(this.f713d));
            if (drawable.isStateful()) {
                drawable.setState(this.f713d.getDrawableState());
            }
            d();
        }
        this.f713d.invalidate();
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.p
    public void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, i2);
        w0 a = w0.a(this.f713d.getContext(), attributeSet, j.AppCompatSeekBar, i2, 0);
        SeekBar seekBar = this.f713d;
        b0.a(seekBar, seekBar.getContext(), j.AppCompatSeekBar, attributeSet, a.a(), i2, 0);
        Drawable c2 = a.c(j.AppCompatSeekBar_android_thumb);
        if (c2 != null) {
            this.f713d.setThumb(c2);
        }
        a(a.b(j.AppCompatSeekBar_tickMark));
        if (a.g(j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f716g = d0.a(a.d(j.AppCompatSeekBar_tickMarkTintMode, -1), this.f716g);
            this.f718i = true;
        }
        if (a.g(j.AppCompatSeekBar_tickMarkTint)) {
            this.f715f = a.a(j.AppCompatSeekBar_tickMarkTint);
            this.f717h = true;
        }
        a.b();
        d();
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.f714e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f713d.getDrawableState())) {
            this.f713d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.f714e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
