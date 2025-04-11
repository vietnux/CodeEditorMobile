package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.k;
import c.a.a;
import c.h.l.a0;

public class q extends RadioButton implements k, a0 {

    /* renamed from: b  reason: collision with root package name */
    private final h f694b;

    /* renamed from: c  reason: collision with root package name */
    private final e f695c;

    /* renamed from: d  reason: collision with root package name */
    private final x f696d;

    public q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.radioButtonStyle);
    }

    public q(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        r0.a(this, getContext());
        this.f694b = new h(this);
        this.f694b.a(attributeSet, i2);
        this.f695c = new e(this);
        this.f695c.a(attributeSet, i2);
        this.f696d = new x(this);
        this.f696d.a(attributeSet, i2);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f695c;
        if (eVar != null) {
            eVar.a();
        }
        x xVar = this.f696d;
        if (xVar != null) {
            xVar.a();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        h hVar = this.f694b;
        return hVar != null ? hVar.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // c.h.l.a0
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f695c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // c.h.l.a0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f695c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        h hVar = this.f694b;
        if (hVar != null) {
            return hVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h hVar = this.f694b;
        if (hVar != null) {
            return hVar.c();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f695c;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f695c;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(c.a.k.a.a.c(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h hVar = this.f694b;
        if (hVar != null) {
            hVar.d();
        }
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f695c;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f695c;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h hVar = this.f694b;
        if (hVar != null) {
            hVar.a(colorStateList);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h hVar = this.f694b;
        if (hVar != null) {
            hVar.a(mode);
        }
    }
}
