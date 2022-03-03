package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatButton;
import c.h.l.b0;
import com.google.android.material.internal.l;
import com.google.android.material.internal.m;
import e.b.b.b.b;
import e.b.b.b.i;
import e.b.b.b.j;
import e.b.b.b.o.a;

public class MaterialButton extends AppCompatButton {

    /* renamed from: d  reason: collision with root package name */
    private final b f6340d;

    /* renamed from: e  reason: collision with root package name */
    private int f6341e;

    /* renamed from: f  reason: collision with root package name */
    private PorterDuff.Mode f6342f;

    /* renamed from: g  reason: collision with root package name */
    private ColorStateList f6343g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f6344h;

    /* renamed from: i  reason: collision with root package name */
    private int f6345i;

    /* renamed from: j  reason: collision with root package name */
    private int f6346j;

    /* renamed from: k  reason: collision with root package name */
    private int f6347k;

    public MaterialButton(Context context) {
        this(context, null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray c2 = l.c(context, attributeSet, j.MaterialButton, i2, i.Widget_MaterialComponents_Button, new int[0]);
        this.f6341e = c2.getDimensionPixelSize(j.MaterialButton_iconPadding, 0);
        this.f6342f = m.a(c2.getInt(j.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f6343g = a.a(getContext(), c2, j.MaterialButton_iconTint);
        this.f6344h = a.b(getContext(), c2, j.MaterialButton_icon);
        this.f6347k = c2.getInteger(j.MaterialButton_iconGravity, 1);
        this.f6345i = c2.getDimensionPixelSize(j.MaterialButton_iconSize, 0);
        this.f6340d = new b(this);
        this.f6340d.a(c2);
        c2.recycle();
        setCompoundDrawablePadding(this.f6341e);
        c();
    }

    private boolean a() {
        return b0.r(this) == 1;
    }

    private boolean b() {
        b bVar = this.f6340d;
        return bVar != null && !bVar.g();
    }

    private void c() {
        Drawable drawable = this.f6344h;
        if (drawable != null) {
            this.f6344h = drawable.mutate();
            androidx.core.graphics.drawable.a.a(this.f6344h, this.f6343g);
            PorterDuff.Mode mode = this.f6342f;
            if (mode != null) {
                androidx.core.graphics.drawable.a.a(this.f6344h, mode);
            }
            int i2 = this.f6345i;
            if (i2 == 0) {
                i2 = this.f6344h.getIntrinsicWidth();
            }
            int i3 = this.f6345i;
            if (i3 == 0) {
                i3 = this.f6344h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f6344h;
            int i4 = this.f6346j;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        androidx.core.widget.i.a(this, this.f6344h, null, null, null);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f6340d.a();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f6344h;
    }

    public int getIconGravity() {
        return this.f6347k;
    }

    public int getIconPadding() {
        return this.f6341e;
    }

    public int getIconSize() {
        return this.f6345i;
    }

    public ColorStateList getIconTint() {
        return this.f6343g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f6342f;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f6340d.b();
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f6340d.c();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f6340d.d();
        }
        return 0;
    }

    @Override // c.h.l.a0, androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f6340d.e() : super.getSupportBackgroundTintList();
    }

    @Override // c.h.l.a0, androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f6340d.f() : super.getSupportBackgroundTintMode();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT < 21 && b()) {
            this.f6340d.a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        b bVar;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (bVar = this.f6340d) != null) {
            bVar.a(i5 - i3, i4 - i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f6344h != null && this.f6347k == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            int i4 = this.f6345i;
            if (i4 == 0) {
                i4 = this.f6344h.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - measureText) - b0.v(this)) - i4) - this.f6341e) - b0.w(this)) / 2;
            if (a()) {
                measuredWidth = -measuredWidth;
            }
            if (this.f6346j != measuredWidth) {
                this.f6346j = measuredWidth;
                c();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (b()) {
            this.f6340d.a(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setBackgroundDrawable(Drawable drawable) {
        if (b()) {
            if (drawable != getBackground()) {
                Log.i("MaterialButton", "Setting a custom background is not supported.");
                this.f6340d.h();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? c.a.k.a.a.c(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCornerRadius(int i2) {
        if (b()) {
            this.f6340d.b(i2);
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f6344h != drawable) {
            this.f6344h = drawable;
            c();
        }
    }

    public void setIconGravity(int i2) {
        this.f6347k = i2;
    }

    public void setIconPadding(int i2) {
        if (this.f6341e != i2) {
            this.f6341e = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? c.a.k.a.a.c(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f6345i != i2) {
            this.f6345i = i2;
            c();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f6343g != colorStateList) {
            this.f6343g = colorStateList;
            c();
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f6342f != mode) {
            this.f6342f = mode;
            c();
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(c.a.k.a.a.b(getContext(), i2));
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            this.f6340d.a(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        if (b()) {
            setRippleColor(c.a.k.a.a.b(getContext(), i2));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            this.f6340d.b(colorStateList);
        }
    }

    public void setStrokeColorResource(int i2) {
        if (b()) {
            setStrokeColor(c.a.k.a.a.b(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (b()) {
            this.f6340d.c(i2);
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // c.h.l.a0, androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (b()) {
            this.f6340d.c(colorStateList);
        } else if (this.f6340d != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // c.h.l.a0, androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (b()) {
            this.f6340d.a(mode);
        } else if (this.f6340d != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }
}
