package com.github.johnkil.print;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.github.johnkil.print.d;

class e {
    static d a(Context context, AttributeSet attributeSet, boolean z) {
        d.b bVar = new d.b(context);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.PrintView);
            if (obtainStyledAttributes.hasValue(f.PrintView_iconText)) {
                bVar.a(obtainStyledAttributes.getString(f.PrintView_iconText));
            }
            if (!z && obtainStyledAttributes.hasValue(f.PrintView_iconFont)) {
                bVar.a(g.a(context.getAssets(), obtainStyledAttributes.getString(f.PrintView_iconFont)));
            }
            if (obtainStyledAttributes.hasValue(f.PrintView_iconColor)) {
                bVar.a(obtainStyledAttributes.getColorStateList(f.PrintView_iconColor));
            }
            bVar.a(0, (float) obtainStyledAttributes.getDimensionPixelSize(f.PrintView_iconSize, 0));
            obtainStyledAttributes.recycle();
        }
        return bVar.a();
    }
}
