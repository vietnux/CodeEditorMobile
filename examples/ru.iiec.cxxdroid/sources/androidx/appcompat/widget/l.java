package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.e;
import c.a.j;
import c.a.k.a.a;
import c.h.l.b0;

public class l {
    private final ImageView a;

    /* renamed from: b  reason: collision with root package name */
    private u0 f642b;

    /* renamed from: c  reason: collision with root package name */
    private u0 f643c;

    /* renamed from: d  reason: collision with root package name */
    private u0 f644d;

    public l(ImageView imageView) {
        this.a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f644d == null) {
            this.f644d = new u0();
        }
        u0 u0Var = this.f644d;
        u0Var.a();
        ColorStateList a2 = e.a(this.a);
        if (a2 != null) {
            u0Var.f721d = true;
            u0Var.a = a2;
        }
        PorterDuff.Mode b2 = e.b(this.a);
        if (b2 != null) {
            u0Var.f720c = true;
            u0Var.f719b = b2;
        }
        if (!u0Var.f721d && !u0Var.f720c) {
            return false;
        }
        i.a(drawable, u0Var, this.a.getDrawableState());
        return true;
    }

    private boolean e() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f642b != null : i2 == 21;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            d0.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!e() || !a(drawable)) {
            u0 u0Var = this.f643c;
            if (u0Var != null) {
                i.a(drawable, u0Var, this.a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f642b;
            if (u0Var2 != null) {
                i.a(drawable, u0Var2, this.a.getDrawableState());
            }
        }
    }

    public void a(int i2) {
        if (i2 != 0) {
            Drawable c2 = a.c(this.a.getContext(), i2);
            if (c2 != null) {
                d0.b(c2);
            }
            this.a.setImageDrawable(c2);
        } else {
            this.a.setImageDrawable(null);
        }
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.f643c == null) {
            this.f643c = new u0();
        }
        u0 u0Var = this.f643c;
        u0Var.a = colorStateList;
        u0Var.f721d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.f643c == null) {
            this.f643c = new u0();
        }
        u0 u0Var = this.f643c;
        u0Var.f719b = mode;
        u0Var.f720c = true;
        a();
    }

    public void a(AttributeSet attributeSet, int i2) {
        int g2;
        w0 a2 = w0.a(this.a.getContext(), attributeSet, j.AppCompatImageView, i2, 0);
        ImageView imageView = this.a;
        b0.a(imageView, imageView.getContext(), j.AppCompatImageView, attributeSet, a2.a(), i2, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (!(drawable != null || (g2 = a2.g(j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = a.c(this.a.getContext(), g2)) == null)) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                d0.b(drawable);
            }
            if (a2.g(j.AppCompatImageView_tint)) {
                e.a(this.a, a2.a(j.AppCompatImageView_tint));
            }
            if (a2.g(j.AppCompatImageView_tintMode)) {
                e.a(this.a, d0.a(a2.d(j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a2.b();
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        u0 u0Var = this.f643c;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        u0 u0Var = this.f643c;
        if (u0Var != null) {
            return u0Var.f719b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }
}
