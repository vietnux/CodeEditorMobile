package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.i;
import c.a.k.a.a;

public class g extends CheckedTextView {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f584c = {16843016};

    /* renamed from: b  reason: collision with root package name */
    private final x f585b;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public g(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        r0.a(this, getContext());
        this.f585b = new x(this);
        this.f585b.a(attributeSet, i2);
        this.f585b.a();
        w0 a = w0.a(getContext(), attributeSet, f584c, i2, 0);
        setCheckMarkDrawable(a.b(0));
        a.b();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f585b;
        if (xVar != null) {
            xVar.a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        k.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(a.c(getContext(), i2));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.a(this, callback));
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.f585b;
        if (xVar != null) {
            xVar.a(context, i2);
        }
    }
}
