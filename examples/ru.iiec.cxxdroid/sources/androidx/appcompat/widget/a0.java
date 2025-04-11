package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public class a0 extends ToggleButton implements c.h.l.a0 {

    /* renamed from: b  reason: collision with root package name */
    private final e f536b;

    /* renamed from: c  reason: collision with root package name */
    private final x f537c;

    public a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public a0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        r0.a(this, getContext());
        this.f536b = new e(this);
        this.f536b.a(attributeSet, i2);
        this.f537c = new x(this);
        this.f537c.a(attributeSet, i2);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f536b;
        if (eVar != null) {
            eVar.a();
        }
        x xVar = this.f537c;
        if (xVar != null) {
            xVar.a();
        }
    }

    @Override // c.h.l.a0
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f536b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // c.h.l.a0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f536b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f536b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f536b;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f536b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f536b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }
}
