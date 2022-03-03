package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
public class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: h  reason: collision with root package name */
    static final PorterDuff.Mode f1075h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private int f1076b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f1077c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1078d;

    /* renamed from: e  reason: collision with root package name */
    f f1079e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1080f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f1081g;

    d(Drawable drawable) {
        this.f1079e = c();
        a(drawable);
    }

    d(f fVar, Resources resources) {
        this.f1079e = fVar;
        a(resources);
    }

    private void a(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f1079e;
        if (fVar != null && (constantState = fVar.f1083b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    private boolean a(int[] iArr) {
        if (!b()) {
            return false;
        }
        f fVar = this.f1079e;
        ColorStateList colorStateList = fVar.f1084c;
        PorterDuff.Mode mode = fVar.f1085d;
        if (colorStateList == null || mode == null) {
            this.f1078d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f1078d && colorForState == this.f1076b && mode == this.f1077c)) {
                setColorFilter(colorForState, mode);
                this.f1076b = colorForState;
                this.f1077c = mode;
                this.f1078d = true;
                return true;
            }
        }
        return false;
    }

    private f c() {
        return new f(this.f1079e);
    }

    @Override // androidx.core.graphics.drawable.c
    public final Drawable a() {
        return this.f1081g;
    }

    @Override // androidx.core.graphics.drawable.c
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f1081g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1081g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f1079e;
            if (fVar != null) {
                fVar.f1083b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f1081g.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f1079e;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f1081g.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        f fVar = this.f1079e;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f1079e.a = getChangingConfigurations();
        return this.f1079e;
    }

    public Drawable getCurrent() {
        return this.f1081g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1081g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1081g.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return a.e(this.f1081g);
    }

    public int getMinimumHeight() {
        return this.f1081g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1081g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1081g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1081g.getPadding(rect);
    }

    public int[] getState() {
        return this.f1081g.getState();
    }

    public Region getTransparentRegion() {
        return this.f1081g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.f(this.f1081g);
    }

    public boolean isStateful() {
        f fVar;
        ColorStateList colorStateList = (!b() || (fVar = this.f1079e) == null) ? null : fVar.f1084c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f1081g.isStateful();
    }

    public void jumpToCurrentState() {
        this.f1081g.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f1080f && super.mutate() == this) {
            this.f1079e = c();
            Drawable drawable = this.f1081g;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f1079e;
            if (fVar != null) {
                Drawable drawable2 = this.f1081g;
                fVar.f1083b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f1080f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1081g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return a.a(this.f1081g, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        return this.f1081g.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.f1081g.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z) {
        a.a(this.f1081g, z);
    }

    public void setChangingConfigurations(int i2) {
        this.f1081g.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1081g.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1081g.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1081g.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return a(iArr) || this.f1081g.setState(iArr);
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f1079e.f1084c = colorStateList;
        a(getState());
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1079e.f1085d = mode;
        a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1081g.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
