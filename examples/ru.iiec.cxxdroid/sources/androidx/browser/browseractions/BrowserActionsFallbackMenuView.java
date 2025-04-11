package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c.c.a;

public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private final int f813b = getResources().getDimensionPixelOffset(a.browser_actions_context_menu_min_padding);

    /* renamed from: c  reason: collision with root package name */
    private final int f814c = getResources().getDimensionPixelOffset(a.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f813b * 2), this.f814c), 1073741824), i3);
    }
}
