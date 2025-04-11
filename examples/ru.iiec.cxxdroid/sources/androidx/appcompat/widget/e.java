package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import c.a.j;
import c.h.l.b0;

/* access modifiers changed from: package-private */
public class e {
    private final View a;

    /* renamed from: b  reason: collision with root package name */
    private final i f562b;

    /* renamed from: c  reason: collision with root package name */
    private int f563c = -1;

    /* renamed from: d  reason: collision with root package name */
    private u0 f564d;

    /* renamed from: e  reason: collision with root package name */
    private u0 f565e;

    /* renamed from: f  reason: collision with root package name */
    private u0 f566f;

    e(View view) {
        this.a = view;
        this.f562b = i.b();
    }

    private boolean b(Drawable drawable) {
        if (this.f566f == null) {
            this.f566f = new u0();
        }
        u0 u0Var = this.f566f;
        u0Var.a();
        ColorStateList i2 = b0.i(this.a);
        if (i2 != null) {
            u0Var.f721d = true;
            u0Var.a = i2;
        }
        PorterDuff.Mode j2 = b0.j(this.a);
        if (j2 != null) {
            u0Var.f720c = true;
            u0Var.f719b = j2;
        }
        if (!u0Var.f721d && !u0Var.f720c) {
            return false;
        }
        i.a(drawable, u0Var, this.a.getDrawableState());
        return true;
    }

    private boolean d() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f564d != null : i2 == 21;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable background = this.a.getBackground();
        if (background == null) {
            return;
        }
        if (!d() || !b(background)) {
            u0 u0Var = this.f565e;
            if (u0Var != null) {
                i.a(background, u0Var, this.a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f564d;
            if (u0Var2 != null) {
                i.a(background, u0Var2, this.a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        this.f563c = i2;
        i iVar = this.f562b;
        a(iVar != null ? iVar.b(this.a.getContext(), i2) : null);
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f564d == null) {
                this.f564d = new u0();
            }
            u0 u0Var = this.f564d;
            u0Var.a = colorStateList;
            u0Var.f721d = true;
        } else {
            this.f564d = null;
        }
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.f565e == null) {
            this.f565e = new u0();
        }
        u0 u0Var = this.f565e;
        u0Var.f719b = mode;
        u0Var.f720c = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(Drawable drawable) {
        this.f563c = -1;
        a((ColorStateList) null);
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i2) {
        w0 a2 = w0.a(this.a.getContext(), attributeSet, j.ViewBackgroundHelper, i2, 0);
        View view = this.a;
        b0.a(view, view.getContext(), j.ViewBackgroundHelper, attributeSet, a2.a(), i2, 0);
        try {
            if (a2.g(j.ViewBackgroundHelper_android_background)) {
                this.f563c = a2.g(j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b2 = this.f562b.b(this.a.getContext(), this.f563c);
                if (b2 != null) {
                    a(b2);
                }
            }
            if (a2.g(j.ViewBackgroundHelper_backgroundTint)) {
                b0.a(this.a, a2.a(j.ViewBackgroundHelper_backgroundTint));
            }
            if (a2.g(j.ViewBackgroundHelper_backgroundTintMode)) {
                b0.a(this.a, d0.a(a2.d(j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a2.b();
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        u0 u0Var = this.f565e;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        if (this.f565e == null) {
            this.f565e = new u0();
        }
        u0 u0Var = this.f565e;
        u0Var.a = colorStateList;
        u0Var.f721d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        u0 u0Var = this.f565e;
        if (u0Var != null) {
            return u0Var.f719b;
        }
        return null;
    }
}
