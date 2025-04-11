package qwe.qweqwe.texteditor;

import android.content.Context;
import android.preference.PreferenceCategory;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import c.h.d.a;

public class MyPreferenceCategory extends PreferenceCategory {
    public MyPreferenceCategory(Context context) {
        super(context);
    }

    public MyPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyPreferenceCategory(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        super.onBindView(view);
        try {
            ((TextView) view.findViewById(16908310)).setTextColor(a.a(getContext(), l0.menu_icon));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
