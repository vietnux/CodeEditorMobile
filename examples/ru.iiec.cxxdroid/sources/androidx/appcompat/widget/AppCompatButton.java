package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.b;
import androidx.core.widget.i;
import androidx.core.widget.l;
import c.a.a;
import c.h.l.a0;

public class AppCompatButton extends Button implements a0, b, l {

    /* renamed from: b  reason: collision with root package name */
    private final e f451b;

    /* renamed from: c  reason: collision with root package name */
    private final x f452c;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        r0.a(this, getContext());
        this.f451b = new e(this);
        this.f451b.a(attributeSet, i2);
        this.f452c = new x(this);
        this.f452c.a(attributeSet, i2);
        this.f452c.a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f451b;
        if (eVar != null) {
            eVar.a();
        }
        x xVar = this.f452c;
        if (xVar != null) {
            xVar.a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        x xVar = this.f452c;
        if (xVar != null) {
            return xVar.c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.a) {
            return super.getAutoSizeMinTextSize();
        }
        x xVar = this.f452c;
        if (xVar != null) {
            return xVar.d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.a) {
            return super.getAutoSizeStepGranularity();
        }
        x xVar = this.f452c;
        if (xVar != null) {
            return xVar.e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x xVar = this.f452c;
        return xVar != null ? xVar.f() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x xVar = this.f452c;
        if (xVar != null) {
            return xVar.g();
        }
        return 0;
    }

    @Override // c.h.l.a0
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f451b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // c.h.l.a0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f451b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f452c.h();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f452c.i();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        x xVar = this.f452c;
        if (xVar != null) {
            xVar.a(z, i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        x xVar = this.f452c;
        if (xVar != null && !b.a && xVar.j()) {
            this.f452c.b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        x xVar = this.f452c;
        if (xVar != null) {
            xVar.a(i2, i3, i4, i5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        x xVar = this.f452c;
        if (xVar != null) {
            xVar.a(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (b.a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        x xVar = this.f452c;
        if (xVar != null) {
            xVar.a(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f451b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f451b;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.a(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        x xVar = this.f452c;
        if (xVar != null) {
            xVar.a(z);
        }
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f451b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f451b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f452c.a(colorStateList);
        this.f452c.a();
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f452c.a(mode);
        this.f452c.a();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.f452c;
        if (xVar != null) {
            xVar.a(context, i2);
        }
    }

    public void setTextSize(int i2, float f2) {
        if (b.a) {
            super.setTextSize(i2, f2);
            return;
        }
        x xVar = this.f452c;
        if (xVar != null) {
            xVar.a(i2, f2);
        }
    }
}
