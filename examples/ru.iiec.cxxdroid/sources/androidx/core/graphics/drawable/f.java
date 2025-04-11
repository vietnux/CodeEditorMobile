package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* access modifiers changed from: package-private */
public final class f extends Drawable.ConstantState {
    int a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f1083b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f1084c = null;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f1085d = d.f1075h;

    f(f fVar) {
        if (fVar != null) {
            this.a = fVar.a;
            this.f1083b = fVar.f1083b;
            this.f1084c = fVar.f1084c;
            this.f1085d = fVar.f1085d;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f1083b != null;
    }

    public int getChangingConfigurations() {
        int i2 = this.a;
        Drawable.ConstantState constantState = this.f1083b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new e(this, resources) : new d(this, resources);
    }
}
