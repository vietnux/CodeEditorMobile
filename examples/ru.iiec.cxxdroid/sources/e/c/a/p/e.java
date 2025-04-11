package e.c.a.p;

import android.content.Context;
import android.util.TypedValue;
import c.h.d.a;
import g.r.d.i;

public final class e {
    public static final int a(Context context, int i2) {
        i.d(context, "$this$getThemeColor");
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return 0;
        }
        int i3 = typedValue.resourceId;
        return i3 != 0 ? a.a(context, i3) : typedValue.data;
    }

    public static final int a(Context context, int i2, int i3) {
        i.d(context, "$this$getThemeColorFromAttrOrRes");
        Integer valueOf = Integer.valueOf(a(context, i2));
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : a.a(context, i3);
    }
}
