package c.h.l;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

public final class y {
    private Object a;

    private y(Object obj) {
        this.a = obj;
    }

    public static y a(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 24 ? new y(PointerIcon.getSystemIcon(context, i2)) : new y(null);
    }

    public Object a() {
        return this.a;
    }
}
