package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.f0;

public class FitWindowsLinearLayout extends LinearLayout implements f0 {

    /* renamed from: b  reason: collision with root package name */
    private f0.a f467b;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        f0.a aVar = this.f467b;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.f0
    public void setOnFitSystemWindowsListener(f0.a aVar) {
        this.f467b = aVar;
    }
}
