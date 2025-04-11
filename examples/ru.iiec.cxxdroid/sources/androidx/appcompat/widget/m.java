package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import c.h.l.a0;

public class m extends ImageView implements a0, androidx.core.widget.m {

    /* renamed from: b  reason: collision with root package name */
    private final e f651b;

    /* renamed from: c  reason: collision with root package name */
    private final l f652c;

    public m(Context context) {
        this(context, null);
    }

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public m(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        r0.a(this, getContext());
        this.f651b = new e(this);
        this.f651b.a(attributeSet, i2);
        this.f652c = new l(this);
        this.f652c.a(attributeSet, i2);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f651b;
        if (eVar != null) {
            eVar.a();
        }
        l lVar = this.f652c;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // c.h.l.a0
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f651b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // c.h.l.a0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f651b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.m
    public ColorStateList getSupportImageTintList() {
        l lVar = this.f652c;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.m
    public PorterDuff.Mode getSupportImageTintMode() {
        l lVar = this.f652c;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f652c.d() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f651b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f651b;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        l lVar = this.f652c;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        l lVar = this.f652c;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setImageResource(int i2) {
        l lVar = this.f652c;
        if (lVar != null) {
            lVar.a(i2);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        l lVar = this.f652c;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f651b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f651b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        l lVar = this.f652c;
        if (lVar != null) {
            lVar.a(colorStateList);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        l lVar = this.f652c;
        if (lVar != null) {
            lVar.a(mode);
        }
    }
}
