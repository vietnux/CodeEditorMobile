package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

public class y0 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            z0.a(view, charSequence);
        }
    }
}
