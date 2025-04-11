package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.i;
import c.a.a;
import c.h.l.a0;
import c.h.l.b0;
import c.h.l.e;
import c.h.l.m0.b;
import c.h.l.w;

public class j extends EditText implements a0, w {

    /* renamed from: b  reason: collision with root package name */
    private final e f638b;

    /* renamed from: c  reason: collision with root package name */
    private final x f639c;

    /* renamed from: d  reason: collision with root package name */
    private final w f640d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.core.widget.j f641e;

    public j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.editTextStyle);
    }

    public j(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        r0.a(this, getContext());
        this.f638b = new e(this);
        this.f638b.a(attributeSet, i2);
        this.f639c = new x(this);
        this.f639c.a(attributeSet, i2);
        this.f639c.a();
        this.f640d = new w(this);
        this.f641e = new androidx.core.widget.j();
    }

    @Override // c.h.l.w
    public e a(e eVar) {
        return this.f641e.a(this, eVar);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f638b;
        if (eVar != null) {
            eVar.a();
        }
        x xVar = this.f639c;
        if (xVar != null) {
            xVar.a();
        }
    }

    @Override // c.h.l.a0
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f638b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // c.h.l.a0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f638b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.EditText
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        w wVar;
        return (Build.VERSION.SDK_INT >= 28 || (wVar = this.f640d) == null) ? super.getTextClassifier() : wVar.a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f639c.a(this, onCreateInputConnection, editorInfo);
        k.a(onCreateInputConnection, editorInfo, this);
        String[] u = b0.u(this);
        if (onCreateInputConnection == null || u == null) {
            return onCreateInputConnection;
        }
        c.h.l.m0.a.a(editorInfo, u);
        return b.a(onCreateInputConnection, editorInfo, s.a(this));
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (s.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i2) {
        if (s.a(this, i2)) {
            return true;
        }
        return super.onTextContextMenuItem(i2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f638b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f638b;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.a(this, callback));
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f638b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f638b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.f639c;
        if (xVar != null) {
            xVar.a(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        w wVar;
        if (Build.VERSION.SDK_INT >= 28 || (wVar = this.f640d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            wVar.a(textClassifier);
        }
    }
}
