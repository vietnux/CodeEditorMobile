package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.i;
import androidx.core.widget.l;
import c.a.k.a.a;
import c.h.e.d;
import c.h.j.b;
import c.h.l.a0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class y extends TextView implements a0, l, b {

    /* renamed from: b  reason: collision with root package name */
    private final e f783b;

    /* renamed from: c  reason: collision with root package name */
    private final x f784c;

    /* renamed from: d  reason: collision with root package name */
    private final w f785d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f786e;

    /* renamed from: f  reason: collision with root package name */
    private Future<c.h.j.b> f787f;

    public y(Context context) {
        this(context, null);
    }

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public y(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        this.f786e = false;
        r0.a(this, getContext());
        this.f783b = new e(this);
        this.f783b.a(attributeSet, i2);
        this.f784c = new x(this);
        this.f784c.a(attributeSet, i2);
        this.f784c.a();
        this.f785d = new w(this);
    }

    private void d() {
        Future<c.h.j.b> future = this.f787f;
        if (future != null) {
            try {
                this.f787f = null;
                i.a(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f783b;
        if (eVar != null) {
            eVar.a();
        }
        x xVar = this.f784c;
        if (xVar != null) {
            xVar.a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        x xVar = this.f784c;
        if (xVar != null) {
            return xVar.c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.a) {
            return super.getAutoSizeMinTextSize();
        }
        x xVar = this.f784c;
        if (xVar != null) {
            return xVar.d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.a) {
            return super.getAutoSizeStepGranularity();
        }
        x xVar = this.f784c;
        if (xVar != null) {
            return xVar.e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x xVar = this.f784c;
        return xVar != null ? xVar.f() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x xVar = this.f784c;
        if (xVar != null) {
            return xVar.g();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return i.a(this);
    }

    public int getLastBaselineToBottomHeight() {
        return i.b(this);
    }

    @Override // c.h.l.a0
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f783b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // c.h.l.a0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f783b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f784c.h();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f784c.i();
    }

    public CharSequence getText() {
        d();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        w wVar;
        return (Build.VERSION.SDK_INT >= 28 || (wVar = this.f785d) == null) ? super.getTextClassifier() : wVar.a();
    }

    public b.a getTextMetricsParamsCompat() {
        return i.e(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f784c.a(this, onCreateInputConnection, editorInfo);
        k.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        x xVar = this.f784c;
        if (xVar != null) {
            xVar.a(z, i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        d();
        super.onMeasure(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        x xVar = this.f784c;
        if (xVar != null && !androidx.core.widget.b.a && xVar.j()) {
            this.f784c.b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (androidx.core.widget.b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        x xVar = this.f784c;
        if (xVar != null) {
            xVar.a(i2, i3, i4, i5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (androidx.core.widget.b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        x xVar = this.f784c;
        if (xVar != null) {
            xVar.a(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (androidx.core.widget.b.a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        x xVar = this.f784c;
        if (xVar != null) {
            xVar.a(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f783b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f783b;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x xVar = this.f784c;
        if (xVar != null) {
            xVar.k();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x xVar = this.f784c;
        if (xVar != null) {
            xVar.k();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c2 = i2 != 0 ? a.c(context, i2) : null;
        Drawable c3 = i3 != 0 ? a.c(context, i3) : null;
        Drawable c4 = i4 != 0 ? a.c(context, i4) : null;
        if (i5 != 0) {
            drawable = a.c(context, i5);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(c2, c3, c4, drawable);
        x xVar = this.f784c;
        if (xVar != null) {
            xVar.k();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x xVar = this.f784c;
        if (xVar != null) {
            xVar.k();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c2 = i2 != 0 ? a.c(context, i2) : null;
        Drawable c3 = i3 != 0 ? a.c(context, i3) : null;
        Drawable c4 = i4 != 0 ? a.c(context, i4) : null;
        if (i5 != 0) {
            drawable = a.c(context, i5);
        }
        setCompoundDrawablesWithIntrinsicBounds(c2, c3, c4, drawable);
        x xVar = this.f784c;
        if (xVar != null) {
            xVar.k();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x xVar = this.f784c;
        if (xVar != null) {
            xVar.k();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.a(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            i.a(this, i2);
        }
    }

    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            i.b(this, i2);
        }
    }

    public void setLineHeight(int i2) {
        i.c(this, i2);
    }

    public void setPrecomputedText(c.h.j.b bVar) {
        i.a(this, bVar);
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f783b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f783b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f784c.a(colorStateList);
        this.f784c.a();
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f784c.a(mode);
        this.f784c.a();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.f784c;
        if (xVar != null) {
            xVar.a(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        w wVar;
        if (Build.VERSION.SDK_INT >= 28 || (wVar = this.f785d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            wVar.a(textClassifier);
        }
    }

    public void setTextFuture(Future<c.h.j.b> future) {
        this.f787f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        i.a(this, aVar);
    }

    public void setTextSize(int i2, float f2) {
        if (androidx.core.widget.b.a) {
            super.setTextSize(i2, f2);
            return;
        }
        x xVar = this.f784c;
        if (xVar != null) {
            xVar.a(i2, f2);
        }
    }

    public void setTypeface(Typeface typeface, int i2) {
        if (!this.f786e) {
            Typeface typeface2 = null;
            if (typeface != null && i2 > 0) {
                typeface2 = d.a(getContext(), typeface, i2);
            }
            this.f786e = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i2);
            } finally {
                this.f786e = false;
            }
        }
    }
}
