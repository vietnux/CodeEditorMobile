package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.h;
import c.a.j;

/* access modifiers changed from: package-private */
public class o extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f665b = (Build.VERSION.SDK_INT < 21);
    private boolean a;

    public o(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(context, attributeSet, i2, i3);
    }

    private void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        w0 a2 = w0.a(context, attributeSet, j.PopupWindow, i2, i3);
        if (a2.g(j.PopupWindow_overlapAnchor)) {
            a(a2.a(j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a2.b(j.PopupWindow_android_popupBackground));
        a2.b();
    }

    private void a(boolean z) {
        if (f665b) {
            this.a = z;
        } else {
            h.a(this, z);
        }
    }

    public void showAsDropDown(View view, int i2, int i3) {
        if (f665b && this.a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    public void showAsDropDown(View view, int i2, int i3, int i4) {
        if (f665b && this.a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i2, int i3, int i4, int i5) {
        if (f665b && this.a) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i4, i5);
    }
}
