package c.a.l.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

public class c extends Drawable implements Drawable.Callback {

    /* renamed from: b  reason: collision with root package name */
    private Drawable f1812b;

    public c(Drawable drawable) {
        a(drawable);
    }

    public Drawable a() {
        return this.f1812b;
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.f1812b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1812b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f1812b.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f1812b.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f1812b.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1812b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1812b.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f1812b.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1812b.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1812b.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1812b.getPadding(rect);
    }

    public int[] getState() {
        return this.f1812b.getState();
    }

    public Region getTransparentRegion() {
        return this.f1812b.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.f(this.f1812b);
    }

    public boolean isStateful() {
        return this.f1812b.isStateful();
    }

    public void jumpToCurrentState() {
        this.f1812b.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f1812b.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        return this.f1812b.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.f1812b.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z) {
        a.a(this.f1812b, z);
    }

    public void setChangingConfigurations(int i2) {
        this.f1812b.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1812b.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1812b.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1812b.setFilterBitmap(z);
    }

    public void setHotspot(float f2, float f3) {
        a.a(this.f1812b, f2, f3);
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        a.a(this.f1812b, i2, i3, i4, i5);
    }

    public boolean setState(int[] iArr) {
        return this.f1812b.setState(iArr);
    }

    public void setTint(int i2) {
        a.b(this.f1812b, i2);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.a(this.f1812b, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.a(this.f1812b, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1812b.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
