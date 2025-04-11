package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public class e extends d {

    /* renamed from: i  reason: collision with root package name */
    private static Method f1082i;

    e(Drawable drawable) {
        super(drawable);
        c();
    }

    e(f fVar, Resources resources) {
        super(fVar, resources);
        c();
    }

    private void c() {
        if (f1082i == null) {
            try {
                f1082i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.drawable.d
    public boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f1081g;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public Rect getDirtyBounds() {
        return this.f1081g.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f1081g.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f1081g;
        if (!(drawable == null || (method = f1082i) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e2);
            }
        }
        return false;
    }

    public void setHotspot(float f2, float f3) {
        this.f1081g.setHotspot(f2, f3);
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.f1081g.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // androidx.core.graphics.drawable.d
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.d, androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        if (b()) {
            super.setTint(i2);
        } else {
            this.f1081g.setTint(i2);
        }
    }

    @Override // androidx.core.graphics.drawable.d, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        if (b()) {
            super.setTintList(colorStateList);
        } else {
            this.f1081g.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.d, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            super.setTintMode(mode);
        } else {
            this.f1081g.setTintMode(mode);
        }
    }
}
