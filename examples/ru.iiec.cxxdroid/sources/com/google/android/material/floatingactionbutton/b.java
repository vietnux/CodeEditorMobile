package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.internal.n;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class b extends a {
    private InsetDrawable I;

    static class a extends GradientDrawable {
        a() {
        }

        public boolean isStateful() {
            return true;
        }
    }

    b(n nVar, e.b.b.b.q.b bVar) {
        super(nVar, bVar);
    }

    private Animator a(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.u, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.u, View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(a.B);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void a(float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT == 21) {
            this.u.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(a.C, a(f2, f4));
            stateListAnimator.addState(a.D, a(f2, f3));
            stateListAnimator.addState(a.E, a(f2, f3));
            stateListAnimator.addState(a.F, a(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.u, "elevation", f2).setDuration(0L));
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 22 && i2 <= 24) {
                n nVar = this.u;
                arrayList.add(ObjectAnimator.ofFloat(nVar, View.TRANSLATION_Z, nVar.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.u, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a.B);
            stateListAnimator.addState(a.G, animatorSet);
            stateListAnimator.addState(a.H, a(0.0f, 0.0f));
            this.u.setStateListAnimator(stateListAnimator);
        }
        if (this.v.a()) {
            s();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        Drawable drawable;
        this.f6385j = androidx.core.graphics.drawable.a.i(a());
        androidx.core.graphics.drawable.a.a(this.f6385j, colorStateList);
        if (mode != null) {
            androidx.core.graphics.drawable.a.a(this.f6385j, mode);
        }
        if (i2 > 0) {
            this.f6387l = a(i2, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{this.f6387l, this.f6385j});
        } else {
            this.f6387l = null;
            drawable = this.f6385j;
        }
        this.f6386k = new RippleDrawable(e.b.b.b.p.a.a(colorStateList2), drawable, null);
        Drawable drawable2 = this.f6386k;
        this.f6388m = drawable2;
        this.v.a(drawable2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void a(Rect rect) {
        if (this.v.a()) {
            float b2 = this.v.b();
            float c2 = c() + this.p;
            int ceil = (int) Math.ceil((double) e.b.b.b.q.a.a(c2, b2, false));
            int ceil2 = (int) Math.ceil((double) e.b.b.b.q.a.b(c2, b2, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void a(int[] iArr) {
        n nVar;
        if (Build.VERSION.SDK_INT == 21) {
            float f2 = 0.0f;
            if (this.u.isEnabled()) {
                this.u.setElevation(this.n);
                if (this.u.isPressed()) {
                    nVar = this.u;
                    f2 = this.p;
                } else if (this.u.isFocused() || this.u.isHovered()) {
                    nVar = this.u;
                    f2 = this.o;
                }
                nVar.setTranslationZ(f2);
            }
            this.u.setElevation(0.0f);
            nVar = this.u;
            nVar.setTranslationZ(f2);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void b(ColorStateList colorStateList) {
        Drawable drawable = this.f6386k;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(e.b.b.b.p.a.a(colorStateList));
        } else {
            super.b(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void b(Rect rect) {
        e.b.b.b.q.b bVar;
        Drawable drawable;
        if (this.v.a()) {
            this.I = new InsetDrawable(this.f6386k, rect.left, rect.top, rect.right, rect.bottom);
            bVar = this.v;
            drawable = this.I;
        } else {
            bVar = this.v;
            drawable = this.f6386k;
        }
        bVar.a(drawable);
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public float c() {
        return this.u.getElevation();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void j() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public com.google.android.material.internal.a k() {
        return new com.google.android.material.internal.b();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public GradientDrawable l() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void n() {
        s();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public boolean q() {
        return false;
    }
}
